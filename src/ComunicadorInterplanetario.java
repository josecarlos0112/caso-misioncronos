package src;

public class ComunicadorInterplanetario {
    private String message;

    public void sendMessage(String message) {
        this.message = message;
        System.out.println("Message sent: " + message);
    }

    public String receiveMessage() {
        System.out.println("Message received: " + message);
        return message;
    }
}