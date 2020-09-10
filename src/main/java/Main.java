public class Main {

    private final MessageStore messageStore;

    public Main(MessageStore messageStore) {
        this.messageStore = messageStore;
    }

    public void postMessage(String userId, String message) {
        messageStore.save(message);
    }

}
