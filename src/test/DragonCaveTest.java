import org.junit.Rule;
import org.junit.jupiter.api.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

class DragonCaveTest {

    //Object and input/output variables
    DragonCave dc;
    InputStream sysBackup;
    PrintStream outBackup;


    @BeforeEach
    void setInput(){
        //Save original system inputstream and printstream
        sysBackup = System.in;
        outBackup = System.out;

    }
    @Test
    void getInput() {
        //Replace user input with test data
        ByteArrayInputStream newIn = new ByteArrayInputStream("1".getBytes());
        System.setIn(newIn);
        //Instantiate DragonCave class
        dc = new DragonCave();
        //Assert correct input is retrieved
        assertEquals("1", dc.getInput());
    }

    @Test
    void chooseCave() {
        //Instantiate new output stream
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        //Replace system PrintStream with new output stream
        PrintStream newOut = new PrintStream(byteArrayOutputStream);
        System.setOut(newOut);
        //Instantiate DragonCave class
        dc = new DragonCave();
        //Run method with test data
        dc.chooseCave("2");
        //Read output
        String allOutput = byteArrayOutputStream.toString();
        String key = "He ";
        String givenOutput = allOutput.substring(allOutput.indexOf(key) + key.length(),
                allOutput.indexOf(key) + key.length() + 5);
        //Assert output matches expected output based on test data
        assertEquals(givenOutput, "looks");

    }

    @AfterEach
    void restoreInput(){
        //Restore original system inputstream and printstream
        System.setIn(sysBackup);
        System.setOut(outBackup);
    }


}