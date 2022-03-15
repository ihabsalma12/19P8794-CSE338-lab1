import java.util.Scanner;
import static org.junit.Assert.*;
import org.junit.Test;

public class WatermelonTest {
    @Test
    public void WatermelonTest() {
        Watermelon wm = new Watermelon();

        assertEquals(new String("YES"), wm.isEven(8));
        assertEquals(new String("NO"), wm.isEven(5));
        assertEquals(new String("YES"), wm.isEven(4));
        assertEquals(new String("NO"), wm.isEven(3));
        assertEquals(new String("NO"), wm.isEven(2));

        assertEquals(new String("NO"), wm.isEven(1));
        assertEquals(new String("NO"), wm.isEven(7));
        assertEquals(new String("YES"), wm.isEven(6));
        assertEquals(new String("YES"), wm.isEven(10));
        assertEquals(new String("NO"), wm.isEven(9));



    }

}