package org.alexkrechet.training.configuration;

import org.alexkrechet.training.configuration.entity.MusicPlayer;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {
    public static void main (String [] arg){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();

        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());

        context.close();
    }
}
