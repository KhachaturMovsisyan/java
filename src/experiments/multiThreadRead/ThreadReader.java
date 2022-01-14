package experiments.multiThreadRead;

import java.util.List;

public class ThreadReader implements Runnable {
    Thread t;
    String keyword;
    List<String> strings;



    public ThreadReader(List<String> strings, String keyword) {
        this.keyword = keyword;
        this.strings = strings;
        t = new Thread(this);
        t.start();

    }

    @Override
    public void run() {
        for (String string : strings) {
            if (string.contains(keyword)) {
                SingleRead.countOfKeyword.getAndIncrement();
            }
        }

    }
}
