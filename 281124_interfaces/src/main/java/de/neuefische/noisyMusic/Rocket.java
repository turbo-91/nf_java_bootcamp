package de.neuefische.noisyMusic;

public class Rocket implements CanMakeNoise {

    public String makeNoise() {
        return "Some rocket noise";
    }

    public String stopNoise() {
        return "Stopped rocket noise";
    }
}
