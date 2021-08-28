import org.junit.jupiter.api.Test;
import solid.MyService;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyServiceTest {
    @Test
    public void generateUUID () {
        MyService myService = new MyService();
        assertEquals("DEMO7", myService.generateUUID());
    }
}