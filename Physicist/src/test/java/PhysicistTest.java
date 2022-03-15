import static org.junit.Assert.*;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class PhysicistTest {
    @Test
    public void PhysicistTest(){
        Physicist p = new Physicist();

        String input = "3 4 1 7 -2 4 -1 1 -5 -3";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("NO", p.sumVector());

        input = "3 3 -1 7 -5 2 -4 2 -1 -3";
        in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
        assertEquals("YES", p.sumVector());

        /*assertEquals("YES", p.sumVector());
        assertEquals("YES", p.sumVector());
        assertEquals("YES", p.sumVector());

        assertEquals("YES", p.sumVector());
        assertEquals("YES", p.sumVector());
        assertEquals("YES", p.sumVector());
        assertEquals("YES", p.sumVector());
        assertEquals("YES", p.sumVector());*/
    }

}