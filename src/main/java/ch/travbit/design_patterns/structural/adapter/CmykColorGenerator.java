package ch.travbit.design_patterns.structural.adapter;

import java.util.Random;

public class CmykColorGenerator {

    private Random random;

    public CmykColorGenerator() {
        random = new Random();
    }

    public void showRandomColor() {
        CmykToRgbAdapter adapter = new CmykToRgbAdapter();
        adapter.showColor(createRandomCmykColor());
    }

    public CmykColor createRandomCmykColor() {
        float c = random.nextFloat();
        float m = random.nextFloat();
        float y = random.nextFloat();
        float k = random.nextFloat();
        return new CmykColor(c, m, y, k);
    }
}
