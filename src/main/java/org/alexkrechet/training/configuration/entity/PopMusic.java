package org.alexkrechet.training.configuration.entity;

import org.alexkrechet.training.configuration.Music;

public class PopMusic implements Music {
    @Override
    public String getSong() {
        return "One more time";
    }
}
