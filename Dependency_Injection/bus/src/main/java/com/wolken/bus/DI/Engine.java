package com.wolken.bus.DI;



public class Engine {
    String coolantType;

    public Engine(String coolantType) {
        System.out.println("Engine coolant called");
        this.coolantType = coolantType;
    }
}

