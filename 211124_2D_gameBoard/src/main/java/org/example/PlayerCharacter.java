package org.example;

public class PlayerCharacter {
    public static int x = 0;
    public static int y = 0;

    public static int getX () {
        return x;
    }

    public static int getY () {
        return y;
    }

    public static int move (String key) {
        if (key.equals("W")) {
            return y + 1;
        }
        if (key.equals("S")) {
            return y - 1;
        }
        if (key.equals("D")) {
            return x + 1;
        }
        if (key.equals("A")) {
            return x - 1;
        }
        else return 66; // when no key is pressed
    };

}
