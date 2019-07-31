package ch.travbit.design_patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class MonsterFactory {

    static Map<String, MonsterType> monsterTypes = new HashMap<>();

    public static MonsterType getMonsterType(String name, String color, int damage) {
        MonsterType monsterType = monsterTypes.get(name);
        if (monsterType == null) {
            monsterType = new MonsterType(color, damage);
            monsterTypes.put(name, monsterType);
        }
        return monsterType;
    }

    private MonsterFactory() {}
}
