package ch.travbit.design_patterns.structural.adapter;

public class RgbMonitor {

    public void showColor(RgbColor color) {
        String colorStr = new StringBuilder().append("RGB:")
                .append(color.getR())
                .append("-")
                .append(color.getG())
                .append("-")
                .append(color.getB())
                .toString();
        System.out.println(colorStr);
    }
}
