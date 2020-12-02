package dark.matrix.thread;

/**
 * User: 莱利
 * Date: 2020/10/30
 * Description: 银行账户类
 */
public class Account {

    private  double balance; //账户余额

    public synchronized void deposit(double money){ //存钱

       double newBalance = balance + money;

        try {
            Thread.sleep(100); //存钱业务执行的时间
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        balance = newBalance;
    }

    public double getBalance(){
        return balance;
    }
}
