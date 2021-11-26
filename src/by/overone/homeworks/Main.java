package by.overone.homeworks;

public class Main {
    public static void main(String[] args) throws InterruptedException {

//        for (int i = 0; i < 3; i++){
//            System.out.println("Start - " + i);
//            Thread threadHen = new Hen();
//            Thread threadEgg = new Egg();
//            Thread threadEgg2 = new Egg();
//            Thread threadEgg3 = new Egg();
//            Thread threadEgg4 = new Egg();
//
//            threadEgg.start();
//            threadEgg.join();
//            threadEgg2.start();
//            threadEgg2.join();
//            threadEgg3.start();
//            threadEgg3.join();
//            threadEgg4.start();
//            threadEgg4.join();
//            threadHen.start();
//        }


//        for (int i = 0; i < 5; i++) {
//            new Hen().start();
//            new Egg().start();
//        }


//        for (int i = 0; i < 5; i++) {
//            new Thread(new HenRunnable(),"1").start();
//            new Thread(new EggRunnable(),"2").start();
//        }


        Buffer buffer = new Buffer();
        Taker taker = new Taker(buffer);
        Adder adder = new Adder(buffer);
        new Thread(taker).start();
        new Thread(adder).start();
        new Thread(adder).start();

    }
}
