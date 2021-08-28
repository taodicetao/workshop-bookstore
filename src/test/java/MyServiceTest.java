import org.junit.jupiter.api.Test;
import solid.MyService;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Random7 extends Random {
    @Override
    public int nextInt(int bound) {
        return 7;
    }
}

public class MyServiceTest {
    @Test
    public void generateUUID () {
        Random random = new Random7();
        MyService myService = new MyService();
        myService.setRandom(random);
        assertEquals("DEMO7", myService.generateUUID());
    }
}