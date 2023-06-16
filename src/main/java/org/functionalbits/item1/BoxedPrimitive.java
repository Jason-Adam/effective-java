package org.functionalbits.item1;

public class BoxedPrimitive {
    public static Boolean valueOf(boolean b) {
        return b ? Boolean.TRUE : Boolean.FALSE;
    }

    public static Boolean from(String s) {
        return Boolean.parseBoolean(s);
    }
}
