/**
 * Created by tkanchanawanchai6403 on 7/26/2017.
 */
public class PrintNum implements Runnable {
    private static String num;
    private String pre;
    private boolean front;

    public String getNum() {
        return num;
    }

    public PrintNum(String num, String pre, boolean front) {
        this.num = num;
        this.pre = pre;
        this.front = front;
    }

    public synchronized void append() {
        if(front)
            num = pre + num;
        else
            num = num + pre;
    }

    @Override
    public void run() {
        append();
    }
}
