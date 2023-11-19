package assignment.magicalArena.Tests;

import assignment.magicalArena.Main;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainClassFlowTest {
    @Test
    void testMainGameFlow() {
        // Redirect System.in to provide user input
        InputStream originalSystemIn = System.in;
        System.setIn(new ByteArrayInputStream("Player1\n50\n10\n100\nPlayer2\n40\n12\n120\nq\n".getBytes()));

        // Redirect System.out to capture output
        TestPrintStream testPrintStream = new TestPrintStream();
        System.setOut(testPrintStream);

        // Run the main method
        Main.main(new String[]{});

        // Reset System.in and System.out
        System.setIn(originalSystemIn);
        System.setOut(System.out);

        // Validate the output
        String output = testPrintStream.getOutput();
        assertTrue(output.contains("Exiting the game"));
        assertTrue(output.contains("won the game"));
    }

    private static class TestPrintStream extends PrintStream {
        private final StringBuilder output;

        TestPrintStream() {
            super(System.out);
            this.output = new StringBuilder();
        }

        @Override
        public void println(String x) {
            output.append(x).append("\n");
        }

        String getOutput() {
            return output.toString();
        }
    }
}
