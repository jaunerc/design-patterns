package ch.travbit.design_patterns.structural.flyweight;

public class Monster {

    private int x, y;
    private MonsterType type;

    public Monster(int x, int y, MonsterType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }
}
