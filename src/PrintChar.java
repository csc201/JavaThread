/**
 * Created by tkanchanawanchai6403 on 7/26/2017.
 */
public class PrintChar implements Runnable {
    private char letter;
    private int times;
    private int count;

    public int getCount() {
        return count;
    }

    public PrintChar(char letter, int times) {
        this.letter = letter;
        this.times = times;
        count =0;
    }

    @Override
    public void run() {
        for(int i=0; i<times; i++) {
            System.out.print(letter + " ");
            count++;
        }
    }


}
