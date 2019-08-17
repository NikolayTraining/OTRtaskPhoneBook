package view;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class ConsoleWorkTest {
    private ConsoleWork consoleWork;
    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    private PrintStream old;

    @Before
    public void setUp() throws Exception {
        consoleWork = new ConsoleWork();
        old =  System.out;
        System.setOut(new PrintStream(output));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(old);
    }

    @Test
    public void enterConsoleSurname() {
        InputStream in1 = new ByteArrayInputStream("Иванов И.И.\n".getBytes());
        System.setIn(in1);
        boolean enterMessage= consoleWork.enterConsoleSurname();
        assertFalse(enterMessage);
        assertEquals(output.toString(), "If you want to exit, enter: 'exit' or 'выход' \r\n" +
                "Введите ФИО (формат: Фамилия И.О.): \r\n1. +8 800 2000 500\r\n2. +8 800 200 600\r\n" +
                "If you want to exit, enter: 'exit' or 'выход' \r\n" +
                "Введите ФИО (формат: Фамилия И.О.): \r\nNo line found\r\n");
    }
}