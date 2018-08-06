package com.courserra.competitive_programming;


import com.google.common.base.Stopwatch;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InOutTestCase {

    private final int timeLimitSeconds;
    private final Class<?> testClass;

    public InOutTestCase(Class<?> testClass, int timeLimitSeconds) {
        this.timeLimitSeconds = (int) Math.round(1.5 * timeLimitSeconds);
        this.testClass = testClass;
    }

    public String testInOut(String... vals) throws Exception {
        Stopwatch stopwatch = Stopwatch.createStarted();
        new Thread(() -> createWatchDog(timeLimitSeconds, stopwatch, vals)).start();
        String result = test(vals);
        stopwatch.stop();
        return result;
    }

    public String testInOut(int... vals) throws Exception {
        String[] dataStr = IntStream.of(vals).boxed().map(Objects::toString).toArray(String[]::new);
        return testInOut(dataStr);
    }

    private String test(String[] vals) throws Exception {
        String data = Arrays.stream(vals).map(Object::toString).collect(Collectors.joining(" "));

        InputStream stdIn = System.in;
        PrintStream stdOut = System.out;
        try (InputStream testInput = new ByteArrayInputStream(data.getBytes(StandardCharsets.UTF_8));
             ByteArrayOutputStream out = new ByteArrayOutputStream();
        ) {
            System.setIn(testInput);
            System.setOut(new PrintStream(out));
            Method mainMethod = testClass.getDeclaredMethod("main", String[].class);
            mainMethod.invoke(data, (Object) new String[0]);
            String outStr = out.toString();
            return outStr.substring(0, outStr.length() - 1);
        } finally {
            System.setIn(stdIn);
            System.setOut(stdOut);
        }
    }

    private static void createWatchDog(int limitSeconds, Stopwatch stopwatch, Object[] vals) {
        while (stopwatch.isRunning()) {
            if (stopwatch.elapsed(TimeUnit.SECONDS) > limitSeconds) {
                System.err.println("Time limit is exceeded!!! DataSet: " + Arrays.toString(vals));
                System.exit(-1);
            } else {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
            }
        }
    }

    public static int[] maximumTest(int val, int count) {
        int[] data = new int[count];
        Arrays.fill(data, val);
        return data;
    }
}
