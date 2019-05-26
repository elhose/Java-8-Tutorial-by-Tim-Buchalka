import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {


        ReentrantLock lock = new ReentrantLock();
        BANKAccount marcinCHUJ = new BANKAccount(1000,"marcinCHUJ", lock);

//        Thread threadOne = new Thread(){
//            public void run(){
//                marcinCHUJ.deposit(300);
//                marcinCHUJ.withdraw(50);
//            }
//        };
//
//        Thread threadTwo = new Thread(){
//            public void run(){
//                marcinCHUJ.deposit(203.75);
//                marcinCHUJ.withdraw(100);
//            }
//        };

        Thread threadOne = new Thread(new Runnable() {
            @Override
            public void run() {

                marcinCHUJ.deposit(300);
                marcinCHUJ.withdraw(50);


            }
        });

        Thread threadTwo = new Thread(new Runnable() {
            @Override
            public void run() {


                    marcinCHUJ.deposit(203.75);
                    marcinCHUJ.withdraw(100);


            }
        });


        threadOne.start();
        threadTwo.start();
    }
}
