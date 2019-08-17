package model;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class DataProcessingTelephonBookTest {
    private DataProcessingTelephonBook dataProcessingTelephonBook;
    private ByteArrayOutputStream output = new ByteArrayOutputStream();
    private PrintStream old;

    @Before
    public void setUp() throws Exception {
        dataProcessingTelephonBook = new DataProcessingTelephonBook();
        old =  System.out;
        System.setOut(new PrintStream(output));
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(old);
    }

    @Test
    public void findTelephonNumberOnSurname() {
        String expected = "Иванов И.И.";
        dataProcessingTelephonBook.findTelephonNumberOnSurname(expected);
        assertEquals(output.toString(), "1. +8 800 2000 500\r\n2. +8 800 200 600\r\n");
    }
}