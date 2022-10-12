package io.codelex.polymorphism.practice.exercise2;

import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {

        List<Sound> soundList = new ArrayList<>();

        Firework a = new Firework();
        Parrot b = new Parrot();
        Radio c = new Radio();

        soundList.add(a);
        soundList.add(b);
        soundList.add(c);

        soundList.forEach(Sound::playSound);

    }
}
