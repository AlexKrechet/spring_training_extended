package org.alexkrechet.training.configuration;

import org.alexkrechet.training.configuration.entity.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main (String [] arg){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        Music music = context.getBean("musicBean", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);

        musicPlayer.playMusic();

        context.close();
    }
}
