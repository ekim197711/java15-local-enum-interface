package com.example.demo.space;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SpaceShipTest {

    @Test
    public void flyAway() {
        SpaceShip.builder()
                .fuel(99)
                .model("Round")
                .build()
                .flyAway();

    }

    @Test
    public void shoot() {
        SpaceShip.builder()
                .fuel(44)
                .model("Huge aggressive")
                .build()
                .shoot();
    }
}