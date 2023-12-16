package org.max.hometask_1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Testing {
    static List<Door> doors;

    @BeforeEach
    void createDoors () {
        doors = new ArrayList<>();
        doors.add(new Door(true));
        doors.add(new Door(false));
        doors.add(new Door(false));
    }

    @Test
    void checkWinWithNoRisk () {
        //given
        Player player = new Player ("Vladislav", false);
        Game game = new Game (player, doors);
        Door door = game.round (0);
        Assertions.assertTrue(door.prize());
    }

    @Test
    void checkWinWithRisk () {
        Player player = new Player ("Vladislav", true);
        Game game = new Game(player, doors);
        Door door = game.round(1);
        Assertions.assertTrue(door.prize());
    }

    @Test
    void checkLoseWithRisk () {
        Player player = new Player ("Vladislav", true);
        Game game = new Game (player, doors);
        Door door = game.round (0);
        Assertions.assertFalse(door.prize());
    }

    @Test
    void checkLoseWithNoRisk () {
        Player player = new Player ("Vladislav", false);
        Game game = new Game (player, doors);
        Door door = game.round (1);
        Assertions.assertFalse(door.prize());
    }
}
