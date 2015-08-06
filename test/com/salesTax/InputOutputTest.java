package com.salesTax;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class InputOutputTest {
        private final ByteArrayOutputStream outputContent = new ByteArrayOutputStream();
        private PrintStream original;

        @Test
        public void showMessage() {
            original = System.out;
            System.setOut(new PrintStream(outputContent));

            InputOutput view = new InputOutput();
            String message = "hii";
            view.display(message);
            assertEquals("hii\n", outputContent.toString());
            System.setOut(original);
        }

        @Test
        public void toGetTheStringInput() {
            System.setIn(new ByteArrayInputStream("java".getBytes()));
            InputOutput view = new InputOutput();
            assertEquals("java", view.getStringInput());
            System.setIn(System.in);
        }
}
