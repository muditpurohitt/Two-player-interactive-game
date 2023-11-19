package assignment.magicalArena.Tests;

import assignment.magicalArena.service.ConsoleInputServices.StringInput;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringInputTest {
    @Test
    void testStringInputTakeInput() {
        // Redirect System.in to provide user input
        InputStream originalSystemIn = System.in;
        System.setIn(new ByteArrayInputStream("Test\n".getBytes()));

        StringInput stringInput = new StringInput("Default");
        String userInput = stringInput.takeInput();
        assertEquals("Test", userInput);

        // Reset System.in
        System.setIn(originalSystemIn);
    }
}
