package ch.travbit.design_patterns.creational.prototype;

public class CarPrototype implements Cloneable {

    private int numDoors;
    private int horsePower;
    private boolean fourWheelDrive;
    private String colour;

    public CarPrototype() {
        numDoors = 4;
        horsePower = 120;
        fourWheelDrive = false;
        colour = "red";
    }

    public int getNumDoors() {
        return numDoors;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setNumDoors(int numDoors) {
        this.numDoors = numDoors;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
