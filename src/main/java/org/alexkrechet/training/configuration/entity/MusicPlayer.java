package org.alexkrechet.training.configuration.entity;

import org.alexkrechet.training.configuration.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("classicMusic")
    private Music music;

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    public MusicPlayer() {}

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic()
    {
        System.out.println(getName());
        System.out.println(getVolume());
        Random random = new Random();
        int randomSong = random.nextInt(3);
        return "Playing : " + music.getSong().get(randomSong);
    }
}
