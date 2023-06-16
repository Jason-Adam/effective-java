package org.functionalbits.item3;

// Enum singleton - the preferred approach
public enum Preferred {
    INSTANCE;

    public void leaveTheBuilding() {
        System.out.println("The preferred Elvis has left the building!");
    }
}
