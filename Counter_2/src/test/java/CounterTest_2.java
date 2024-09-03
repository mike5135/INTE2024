import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CounterTest_2 {

    @Test
    void newCounterInitializedToZero() {
        Counter_2 c = new Counter_2();
        assertEquals(0, c.getValue());
    }

    @Test
    void incIncreasesValue() {
        Counter_2 c = new Counter_2();
        c.inc();
        assertEquals(1, c.getValue());
    }


}