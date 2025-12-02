public class Cellphone {

    
    void ring() {
        System.out.println("Ringing...");
    }

    void vibrate() {
        System.out.println("Vibrating...");
    }

    void callFriend() {
        System.out.println("Calling friend...");
    }

    void sendMessage() {
        System.out.println("Sending message...");
    }

    
    public static void main(String[] args) {
        Cellphone phone = new Cellphone();

        phone.ring();
        phone.vibrate();
        phone.callFriend();
        phone.sendMessage();
    }
}

