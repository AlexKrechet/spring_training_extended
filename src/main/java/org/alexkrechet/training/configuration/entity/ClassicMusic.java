package org.alexkrechet.training.configuration.entity;

import org.alexkrechet.training.configuration.Music;

public class ClassicMusic implements Music {
    private ClassicMusic(){}

    public static ClassicMusic getClassicMusic(){
        return new ClassicMusic();
    }

    public void initializationMethod(){
        System.out.println("Doing bean initialization");
    }
    public void destroyMethod(){
        System.out.println("Doing bean destruction");
    }
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
