import org.junit.Rule;
import org.junit.jupiter.api.*;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class DragonCaveTest {

    DragonCave dc;
    InputStream sysBackup;
    PrintStream outBackup;
    ByteArrayOutputStream byteArrayOutputStream;

    @BeforeEach
    void setInput(){
        sysBackup = System.in;
        ByteArrayInputStream newIn = new ByteArrayInputStream("1".getBytes());
        System.setIn(newIn);

        byteArrayOutputStream = new ByteArrayOutputStream();
        outBackup = System.out;

        PrintStream newOut = new PrintStream(byteArrayOutputStream);
        System.setOut(newOut);

        dc = new DragonCave();
    }
    @Test
    void getInput() {
        assertEquals("1", dc.getInput());
    }

    @Test
    void chooseCave() {


        dc.chooseCave("2");

        String allOutput = byteArrayOutputStream.toString();
        String key = "He ";
        String givenOutput = allOutput.substring(allOutput.indexOf(key) + key.length(),
                allOutput.indexOf(key) + key.length() + 5);
        assertEquals(givenOutput, "looks");

    }

    @AfterEach
    void restoreInput(){
        System.setIn(sysBackup);
        System.setOut(outBackup);
    }


}