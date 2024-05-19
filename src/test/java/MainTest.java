import org.example.Main;

import org.junit.Test;

import java.util.Vector;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    public void testSum(){
        Vector<Integer> numbers = new Vector<>(){{
            add(1); add(2); add(3); add(4); add(5);
        }};

        int actual = Main.calcSum(numbers);
        int expected = 15;

        assertEquals(expected, actual);
    }

    @Test
    public void testMin(){
        Vector<Integer> numbers = new Vector<>(){{
            add(100); add(3213); add(111); add(4); add(19);
        }};

        int actual = Main.findMin(numbers);
        int expected = 4;

        assertEquals(expected, actual);
    }


}
