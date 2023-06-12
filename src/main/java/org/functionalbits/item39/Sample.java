package org.functionalbits.item39;

public class Sample {
    @Test
    public static void m1() {} // This will pass

    public static void m2() {} // This won't run

    @Test
    public static void m3() { // This will fail
        throw new RuntimeException("Boom");
    }

    @Test
    public void m5() {} // INVALID USE: non-static method
}
