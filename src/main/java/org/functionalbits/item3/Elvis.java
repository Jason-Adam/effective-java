package org.functionalbits.item3;

// Singleton with public final field
public class Elvis {
    public static final Elvis INSTANCE = new Elvis();

    private Elvis() {
    }

    public void leaveTheBuilding() {
        System.out.println("Elvis has left the building");
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
