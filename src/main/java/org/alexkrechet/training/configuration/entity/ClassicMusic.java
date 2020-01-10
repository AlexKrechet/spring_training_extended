package org.alexkrechet.training.configuration.entity;

import org.alexkrechet.training.configuration.Music;

public class ClassicMusic implements Music {
    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}
