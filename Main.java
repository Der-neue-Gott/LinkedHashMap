import java.time.LocalDateTime;
import java.time.Month;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {

        LinkedHashMap<Integer, Message> first = new LinkedHashMap<>();
            first.put(1, new Message(100000, "Hello", "Send", "Receive", LocalDateTime.of(2020, Month.NOVEMBER, 23, 15, 10, 10), LocalDateTime.now()));

        first.forEach((k, v) -> System.out.println(k + " : " + v));

        /* LinkedHashMap<Integer, Message> second = new LinkedHashMap<>(16, 0.75f, true);
            second.put(1);
            second.put(2);
            second.put(3);
            second.put(4);
            second.put(5);
            second.put(6);
            second.put(7);
            second.put(8); */

    }
}