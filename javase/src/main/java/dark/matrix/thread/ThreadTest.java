package dark.matrix.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * User: 莱利
 * Date: 2020/10/30
 * Description: 线程测试类
 */
public class ThreadTest {

    public static  void main(String[] args){
        Account account = new Account();
        ExecutorService service  = Executors.newFixedThreadPool(8);

        for(int i = 0; i < 100; i++){
            service.execute(new AddMoneyThread(account,1));
        }

        service.shutdown();

        while(!service.isTerminated()){}

        System.out.println("余额："+ account.getBalance());
    }
}
