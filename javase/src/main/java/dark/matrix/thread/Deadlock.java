package dark.matrix.thread;

/**
 * User: Riley
 * Date: 2020/11/8
 * Description: 死锁测试
 */
public class Deadlock {

    //创建锁
    public static final Object LOCK_A = new Object();
    public static final Object LOCK_B = new Object();

    //执行线程
    public static void main(String[] args){
        new DeadlockA().start();
        new DeadlockB().start();
    }

}

class DeadlockA extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("DeadlockA 开始运行！");
            while(true){
                synchronized(Deadlock.LOCK_A){
                    System.out.println("DeadlockA获取LOCK_A！");
                    //沉睡
                    Thread.sleep(100);
                    System.out.println("DeadlockA正在获取LOCK_B......");
                    synchronized (Deadlock.LOCK_B){
                        System.out.println("DeadlockA获取LOCK_B！");
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class DeadlockB extends Thread{
    @Override
    public void run() {

        try {
            System.out.println("DeadlockB 开始运行！");
            synchronized (Deadlock.LOCK_B){
                System.out.println("DeadlockB获取LOCK_B！");
                System.out.println("DeadlockB正在获取LOCK_A......");
                synchronized (Deadlock.LOCK_A){
                    System.out.println("DeadlockB获取LOCK_A！");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
