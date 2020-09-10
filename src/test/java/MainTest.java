import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class MainTest {

    @Test
    public void test1() {

        MessageStore messageStore = spy(MessageStore.class);

        Main main = new Main(messageStore);

        main.postMessage("alice", "hola");

        verify(messageStore).save("hola");
    }
}