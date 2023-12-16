package org.max.hometask_1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Gaming {
    public static void main(String[] args) {
        Player player = new Player ("Vladislav", true);
        int winstat = 0;
        int round;

        for (round = 0; round < 1000; round++) {
            Game game = new Game (player, getDoors());
            if (game.round(0).prize()) winstat++;
        }
        System.out.println("From " + round + "gamer won " + winstat + "games");
    }

    private static List<Door> getDoors() {
        List<Door> doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
        Collections.shuffle(doors);
        return doors;
    }
}
