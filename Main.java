import java.time.LocalDateTime;
import java.time.Month;
import java.util.LinkedHashMap;

public class Main {
    public static void main(String[] args) {

        LinkedHashMap<Integer, Message> first = new LinkedHashMap<>();
            first.put(1, new Message (Math.round (Math.random() * 10000), "Message 1", "Send 1", "Receive 1", LocalDateTime.of(2020, Month.NOVEMBER, 23, 12, 1, 42), LocalDateTime.now()) );
            first.put(2, new Message (Math.round (Math.random() * 10000), "Message 2", "Send 2", "Receive 2", LocalDateTime.of(2020, Month.NOVEMBER, 23, 12, 4, 27), LocalDateTime.now()) );
            first.put(3, new Message (Math.round (Math.random() * 10000), "Message 3", "Send 3", "Receive 3", LocalDateTime.of(2020, Month.NOVEMBER, 23, 12, 9, 31), LocalDateTime.now()) );
            first.put(4, new Message (Math.round (Math.random() * 10000), "Message 4", "Send 4", "Receive 4", LocalDateTime.of(2020, Month.NOVEMBER, 23, 12, 16, 59), LocalDateTime.now()) );
            first.put(5, new Message (Math.round (Math.random() * 10000), "Message 5", "Send 5", "Receive 5", LocalDateTime.of(2020, Month.NOVEMBER, 23, 12, 33, 2), LocalDateTime.now()) );
            first.put(6, new Message (Math.round (Math.random() * 10000), "Message 6", "Send 6", "Receive 6", LocalDateTime.of(2020, Month.NOVEMBER, 23, 13, 2, 11), LocalDateTime.now()) );
            first.put(7, new Message (Math.round (Math.random() * 10000), "Message 7", "Send 7", "Receive 7", LocalDateTime.of(2020, Month.NOVEMBER, 23, 13, 26, 23), LocalDateTime.now()) );
            first.put(8, new Message (Math.round (Math.random() * 10000), "Message 8", "Send 8", "Receive 8", LocalDateTime.of(2020, Month.NOVEMBER, 23, 13, 38, 31), LocalDateTime.now()) );
        first.forEach((k, v) -> System.out.println(k + " : " + v));

    System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");

        LinkedHashMap<Integer, Message> second = new LinkedHashMap<>(16, 0.75f, true);
            second.put(1, new Message (Math.round (Math.random() * 10000), "Message 1", "Send 1", "Receive 1", LocalDateTime.of(2020, Month.NOVEMBER, 23, 12, 1, 42), LocalDateTime.now()) );
            second.put(2, new Message (Math.round (Math.random() * 10000), "Message 2", "Send 2", "Receive 2", LocalDateTime.of(2020, Month.NOVEMBER, 23, 12, 4, 27), LocalDateTime.now()) );
            second.put(3, new Message (Math.round (Math.random() * 10000), "Message 3", "Send 3", "Receive 3", LocalDateTime.of(2020, Month.NOVEMBER, 23, 12, 9, 31), LocalDateTime.now()) );
            second.put(4, new Message (Math.round (Math.random() * 10000), "Message 4", "Send 4", "Receive 4", LocalDateTime.of(2020, Month.NOVEMBER, 23, 12, 16, 59), LocalDateTime.now()) );
            second.put(5, new Message (Math.round (Math.random() * 10000), "Message 5", "Send 5", "Receive 5", LocalDateTime.of(2020, Month.NOVEMBER, 23, 12, 33, 2), LocalDateTime.now()) );
            second.put(6, new Message (Math.round (Math.random() * 10000), "Message 6", "Send 6", "Receive 6", LocalDateTime.of(2020, Month.NOVEMBER, 23, 13, 2, 11), LocalDateTime.now()) );
            second.put(7, new Message (Math.round (Math.random() * 10000), "Message 7", "Send 7", "Receive 7", LocalDateTime.of(2020, Month.NOVEMBER, 23, 13, 26, 23), LocalDateTime.now()) );
            second.put(8, new Message (Math.round (Math.random() * 10000), "Message 8", "Send 8", "Receive 8", LocalDateTime.of(2020, Month.NOVEMBER, 23, 13, 38, 31), LocalDateTime.now()) );

        second.get(5);
        second.get(6);
        second.get(1);
        second.get(2);
            second.forEach((k, v) -> System.out.println(k + " : " + v));

    }
}