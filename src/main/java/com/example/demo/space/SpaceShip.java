package com.example.demo.space;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SpaceShip {
    private String model;
    private Integer fuel;

    public void flyAway(){
        enum Noise{LOUD, WHISPER}
        Noise noise;
        if (model.startsWith("P"))
            noise = Noise.LOUD;
        else
            noise = Noise.WHISPER;
        switch (noise){
            case LOUD -> {
                System.out.println("WRUUUMMMMMMMMMMMM");
            }
            case WHISPER -> {
                System.out.println("tjiiuu");
            }
        }
    }

    public void shoot(){
        interface Spacegun{
            void makeSound();
        }
        Spacegun mySpaceGun = new Spacegun(){
            @Override
            public void makeSound() {
                System.out.println("ZZzzzaappppp");
            }
        };

        mySpaceGun.makeSound();

    }
}
