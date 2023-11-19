package assignment.magicalArena.Tests;

import assignment.magicalArena.service.ConsoleInputServices.IntegerInput;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class IntegerInpuTest {
    @Test
    void testIntegerInputTakeInput() {
        // Redirect System.in to provide user input
        InputStream originalSystemIn = System.in;
        System.setIn(new ByteArrayInputStream("30\n".getBytes()));

        IntegerInput integerInput = new IntegerInput(50);
        int userInput = integerInput.takeInput();
        assertTrue(userInput < 50);

        // Reset System.in
        System.setIn(originalSystemIn);
    }
}
