import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterTest {

    @Test
    void newCounterInitializedToZero() {
        Counter c = new Counter();
        assertEquals(0, c.getValue());
    }

    @Test
    void incIncreasesValue() {
        Counter c = new Counter();
        c.inc();
        assertEquals(1, c.getValue());
    }


}
