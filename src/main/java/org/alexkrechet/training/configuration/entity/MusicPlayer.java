package org.alexkrechet.training.configuration.entity;

import org.alexkrechet.training.configuration.Music;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;
import java.util.Random;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;

    private List<Music> musicList;

    public MusicPlayer() {}

    public MusicPlayer(@Qualifier("musicList") List<Music> musicList) {
        this.musicList = musicList;
    }

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
        int randomGenre = random.nextInt(3);
        return "Playing : " + musicList.get(randomGenre).getSong().get(randomSong);
    }
}
