import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    private final SILab2 lab2_test = new SILab2();

    @Test
    void multipleCases() {
        RuntimeException ex;

        ex = assertThrows(RuntimeException.class, () -> lab2_test.function(Arrays.asList(new Time(-50, 0, 0))));
        assertEquals(ex.getMessage(), "The hours are smaller than the minimum");

        ex = assertThrows(RuntimeException.class, () -> lab2_test.function(Arrays.asList(new Time(50, 0, 0))));
        assertEquals(ex.getMessage(), "The hours are grater than the maximum");

        assertEquals(Arrays.asList(12*3600), lab2_test.function(Arrays.asList(new Time(12, 0, 0))));

        ex = assertThrows(RuntimeException.class, () -> lab2_test.function(Arrays.asList(new Time(0, -60, 0))));
        assertEquals(ex.getMessage(), "The minutes are not valid!");

        ex = assertThrows(RuntimeException.class, () -> lab2_test.function(Arrays.asList(new Time(0, 60, 0))));
        assertEquals(ex.getMessage(), "The minutes are not valid!");

        assertEquals(Arrays.asList(12*60), lab2_test.function(Arrays.asList(new Time(0, 12, 0))));

        assertEquals(Arrays.asList(15), lab2_test.function(Arrays.asList(new Time(0, 0, 15))));

        ex = assertThrows(RuntimeException.class, () -> lab2_test.function(Arrays.asList(new Time(0, 0, 60))));
        assertEquals(ex.getMessage(), "The seconds are not valid");

        ex = assertThrows(RuntimeException.class, () -> lab2_test.function(Arrays.asList(new Time(0, 0, -60))));
        assertEquals(ex.getMessage(), "The seconds are not valid");

        assertEquals(Arrays.asList(24*3600), lab2_test.function(Arrays.asList(new Time(24, 0, 0))));

        ex = assertThrows(RuntimeException.class, () -> lab2_test.function(Arrays.asList(new Time(24, 0, 1))));
        assertEquals(ex.getMessage(), "The time is greater than the maximum");

        ex = assertThrows(RuntimeException.class, () -> lab2_test.function(Arrays.asList(new Time(24, 1, 0))));
        assertEquals(ex.getMessage(), "The time is greater than the maximum");
    }

    @Test
    void everyBrach(){
        RuntimeException ex;

        ex = assertThrows(RuntimeException.class, () -> lab2_test.function(Arrays.asList(new Time(50, 0, 0))));
        assertEquals(ex.getMessage(), "The hours are grater than the maximum");

        ex = assertThrows(RuntimeException.class, () -> lab2_test.function(Arrays.asList(new Time(-50, 0, 0))));
        assertEquals(ex.getMessage(), "The hours are smaller than the minimum");

        ex = assertThrows(RuntimeException.class, () -> lab2_test.function(Arrays.asList(new Time(0, 60, 0))));
        assertEquals(ex.getMessage(), "The minutes are not valid!");

        ex = assertThrows(RuntimeException.class, () -> lab2_test.function(Arrays.asList(new Time(0, 0, 60))));
        assertEquals(ex.getMessage(), "The seconds are not valid");

        assertEquals(Arrays.asList(15), lab2_test.function(Arrays.asList(new Time(0, 0, 15))));

        assertEquals(Arrays.asList(24*3600), lab2_test.function(Arrays.asList(new Time(24, 0, 0))));

        ex = assertThrows(RuntimeException.class, () -> lab2_test.function(Arrays.asList(new Time(24, 1, 1))));
        assertEquals(ex.getMessage(), "The time is greater than the maximum");
    }
}