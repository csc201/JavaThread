/**
 * Created by tkanchanawanchai6403 on 7/26/2017.
 */
public class Main {
    static String name="Mike";
    public static void main(String [] args) throws InterruptedException {
        Runnable printPreMike = new PrintNum(name, "Mr.", true);
        Runnable printPostMike = new PrintNum(name, " Faunda", false);

        Thread threadPreMike = new Thread(printPreMike);
        Thread threadPostMike = new Thread(printPostMike);
        threadPreMike.start();
        threadPostMike.start();
        threadPreMike.join();
        threadPostMike.join();

        System.out.print(((PrintNum)printPreMike).getNum());
        //System.out.print(((PrintNum)printPostMike).getNum());

        /*
        Runnable printA = new PrintChar('A',1000000);
        Runnable printB = new PrintChar('B',1000000);

        Thread threadA = new Thread(printA);
        Thread threadB = new Thread(printB);

        threadA.start();
        threadB.start();
        threadA.join();
        threadB.join();
        System.out.println();
        System.out.println("A Count " + ((PrintChar)printA).getCount());
        System.out.println("B Count " + ((PrintChar)printB).getCount());*/
    }
}

