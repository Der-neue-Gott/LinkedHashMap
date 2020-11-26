import java.time.LocalDateTime;

public class Message {

    long id;
    String msg;
    String sender;
    String receiver;

    LocalDateTime sentDate;
    LocalDateTime readDate;


    public Message() {}
    public Message(long id, String msg, String sender, String receiver, LocalDateTime sentDate, LocalDateTime readDate) {
        this.id = id;
        this.msg = msg;
        this.sender = sender;
        this.receiver = receiver;
        this.sentDate = sentDate;
        this.readDate = readDate;
    }

    @Override
    public String toString() {
        return "" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", sentDate=" + sentDate +
                ", readDate=" + readDate;

    }
}