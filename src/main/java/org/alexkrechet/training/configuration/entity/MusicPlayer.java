package org.alexkrechet.training.configuration.entity;

import org.alexkrechet.training.configuration.Music;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer {
    @Autowired
    @Qualifier("rockMusic")
    private Music music;

    private String name;
    private int volume;

    public MusicPlayer() {}

    public MusicPlayer(@Qualifier("musicPlayer.name") String name,
                       @Qualifier("musicPlayer.volume") int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public String playMusic()
    {
        return "Playing : " + music.getSong();
    }
}
