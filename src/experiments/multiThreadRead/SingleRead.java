package experiments.multiThreadRead;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class SingleRead {

    public static String path = "C:\\Users\\User\\Desktop\\Новая папка\\sample.txt";
    public static AtomicInteger countOfKeyword = new AtomicInteger();


    public static void main(String[] args) throws IOException {
        long count = Files.lines(Paths.get(path)).count();
        String keyword = ";";
        System.out.println("all lines:" + count);
        long currentTime = System.currentTimeMillis();

        List<String> strings = Files.readAllLines(Paths.get(path));
        List<String> strings1 = strings.subList(0, strings.size() / 4);
        List<String> strings2 = strings.subList(strings.size() / 4 + 1, strings.size() / 2);
        List<String> strings3 = strings.subList(strings.size() / 2 + 1, strings.size() * 3 / 4);
        List<String> strings4 = strings.subList(strings.size() * 3 / 4 + 1, strings.size());

        ThreadReader threadReaderOne = new ThreadReader(strings1, keyword);
        ThreadReader threadReaderTwo = new ThreadReader(strings2, keyword);
        ThreadReader threadReaderThree = new ThreadReader(strings3, keyword);
        ThreadReader threadReaderFour = new ThreadReader(strings4, keyword);



        try {
            threadReaderOne.t.join();
            threadReaderTwo.t.join();
            threadReaderThree.t.join();
            threadReaderFour.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("found lines :" + countOfKeyword);
        long finishTime = System.currentTimeMillis();
        System.out.println("time: " + (finishTime - currentTime));
    }

}

