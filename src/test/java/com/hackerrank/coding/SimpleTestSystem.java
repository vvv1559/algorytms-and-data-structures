package com.hackerrank.coding;

import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SimpleTestSystem {
    private final static InputStream defaultIn = System.in;
    private final static PrintStream defaultOut = System.out;

    private static class ReadablePrintStream extends PrintStream {
        final StringBuilder stringBuilder = new StringBuilder();

        public ReadablePrintStream(OutputStream out) {
            super(out);
        }

        @Override
        public void print(boolean b) {
            stringBuilder.append(b);
        }

        @Override
        public void print(char c) {
            stringBuilder.append(c);
        }

        @Override
        public void print(int i) {
            stringBuilder.append(i);
        }

        @Override
        public void print(long l) {
            stringBuilder.append(l);
        }

        @Override
        public void print(float f) {
            stringBuilder.append(f);
        }

        @Override
        public void print(double d) {
            stringBuilder.append(d);
        }

        @Override
        public void print(char[] s) {
            stringBuilder.append(s);
        }

        @Override
        public void print(String s) {
            stringBuilder.append(s);
        }

        @Override
        public void print(Object obj) {
            stringBuilder.append(obj);
        }

        @Override
        public void println() {
            stringBuilder.append('\n');
        }

        @Override
        public void println(boolean x) {
            stringBuilder.append(x).append('\n');
        }

        @Override
        public void println(char x) {
            stringBuilder.append(x).append('\n');
        }

        @Override
        public void println(int x) {
            stringBuilder.append(x).append('\n');
        }

        @Override
        public void println(long x) {
            stringBuilder.append(x).append('\n');
        }

        @Override
        public void println(float x) {
            stringBuilder.append(x).append('\n');
        }

        @Override
        public void println(double x) {
            stringBuilder.append(x).append('\n');
        }

        @Override
        public void println(char[] x) {
            stringBuilder.append(x).append('\n');
        }

        @Override
        public void println(String x) {
            stringBuilder.append(x).append('\n');
        }

        @Override
        public void println(Object x) {
            stringBuilder.append(x).append('\n');
        }

        @Override
        public String toString() {
            return stringBuilder.toString();
        }
    }

    public static String doTest(Class<?> clazz, String data) {
        try {
            final InputStream testInput = new ByteArrayInputStream(data.getBytes("UTF-8"));
            final PrintStream testOut = new ReadablePrintStream(new ByteArrayOutputStream());
            System.setIn(testInput);
            System.setOut(testOut);

            final Method mainMethod = clazz.getDeclaredMethod("main", String[].class);
            final Object[] emptyArgs = new String[1];
            mainMethod.invoke(null, emptyArgs);

            return testOut.toString().trim();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.setIn(defaultIn);
            System.setOut(defaultOut);
        }

        return "";
    }

    private static class EchoMain {
        public static void main(String[] args) {
            final Scanner inScanner = new Scanner(System.in);
            final List<String> result = new ArrayList<>();

            while (inScanner.hasNext()) {
                result.add(inScanner.next());
            }
            System.out.print(result.stream().collect(Collectors.joining(" ")));
        }
    }

    @Test
    public void check() {
        Assert.assertEquals("Test OK", doTest(EchoMain.class, "Test OK"));
        Assert.assertNotEquals("Test not OK", doTest(EchoMain.class, "Test OK"));
    }

}
