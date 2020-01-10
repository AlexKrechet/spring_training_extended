package org.alexkrechet.training.configuration.entity;

import org.alexkrechet.training.configuration.Music;

public class RockMusic implements Music {
    @Override
    public String getSong() {
        return "Wind cries Mary";
    }
}
