package ch.travbit.design_patterns.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Monster> monsters = new ArrayList<>();
        MonsterType typeA = MonsterFactory.getMonsterType("typeA", "blue", 100);
        MonsterType typeB = MonsterFactory.getMonsterType("typeB", "red", 100);

        for (int i = 0; i < 100; i++) {
            monsters.add(new Monster(10 * i, 10 * i, typeA));
            monsters.add(new Monster(-10 * i, -10 * i, typeB));
        }
    }
}
