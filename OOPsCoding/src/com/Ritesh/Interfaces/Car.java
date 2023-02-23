package com.Ritesh.Interfaces;

public class Car implements Engine, Brake{
    @Override
    public void brake() {
        System.out.println("Braking car...");
    }

    @Override
    public void start() {
        System.out.println("Starting car...");
    }

    @Override
    public void stop() {
        System.out.println("Stopping car...");
    }

    @Override
    public void acc() {
        System.out.println("Accelerating car...");
    }
}
