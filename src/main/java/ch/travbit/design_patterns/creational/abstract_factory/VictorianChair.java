package ch.travbit.design_patterns.creational.abstract_factory;

public class VictorianChair implements Chair {
    @Override
    public boolean hasLegs() {
        return false;
    }

    @Override
    public void sitOn() {

    }
}
