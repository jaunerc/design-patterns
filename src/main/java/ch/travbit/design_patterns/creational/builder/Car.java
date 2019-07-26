package ch.travbit.design_patterns.creational.builder;

public class Car {
    private int numDoors;
    private int maxSpeedMph;
    private String colorName;

    private Car() {

    }

    public static class Builder {
        private int numDoors;
        private int maxSpeedMph;
        private String colorName;

        public Builder setNumDoors(int numDoors) {
            this.numDoors = numDoors;
            return this;
        }

        public Builder setMaxSpeedMph(int maxSpeedMph) {
            this.maxSpeedMph = maxSpeedMph;
            return this;
        }

        public Builder setColorName(String colorName) {
            this.colorName = colorName;
            return this;
        }

        public Car build() {
            Car car = new Car();
            car.numDoors = this.numDoors;
            car.maxSpeedMph = this.maxSpeedMph;
            car.colorName = this.colorName;
            return car;
        }
    }
}
