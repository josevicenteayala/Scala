package codewars;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EurekaTest {

    @Test
    public void testGetEurekaNumbersWithRangeFrom1To1350(){
       assertEquals(List.of(1l, 2l, 3l, 4l, 5l, 6l, 7l, 8l, 9l, 89l, 135l, 175l, 518l, 598l, 1306l), Eureka.getEurekaNumbers(1, 1350));
    }

    @Test
    public void testGetEurekaNumbersWithRangeFrom1To89(){
        assertEquals(List.of(1l, 2l, 3l, 4l, 5l, 6l, 7l, 8l, 9l, 89l), Eureka.getEurekaNumbers(1, 89));
    }

    @Test
    public void testGetEurekaNumbersWithRangeFrom1To2(){
        assertEquals(List.of(1l, 2l), Eureka.getEurekaNumbers(1, 2));
    }

    @Test
    public void testGetEurekaNumbersWithRangeFrom0To1(){
        assertEquals(List.of(0l,1l), Eureka.getEurekaNumbers(0, 1));
    }
}