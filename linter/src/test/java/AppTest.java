/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class AppTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test public void testCheckFile_NoErrors() {
        App.main(new String[]{"resources/noErrors.js"});
        assertEquals("should print nothing to System.out", "\n", outContent.toString());
    }


    @Test public void testCheckFile_OneError() {
        App.main(new String[]{"resources/oneError.js"});
        assertEquals("should print nothing to System.out", "Line 3: Missing semicolon.\n\n", outContent.toString());
    }


    @Test public void testCheckFile_ManyErrors() {
        App.main(new String[]{"resources/manyErrors.js"});
        assertEquals("should print nothing to System.out", "Line 3: Missing semicolon.\nLine 22: Missing semicolon.\nLine 40: Missing semicolon.\nLine 53: Missing semicolon.\nLine 54: Missing semicolon.\n\n", outContent.toString());
    }



}
