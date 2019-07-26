package ch.travbit.design_patterns.structural.adapter;

public class CmykToRgbAdapter implements CmykColorAdapter {

    private RgbMonitor monitor;

    public CmykToRgbAdapter() {
        monitor = new RgbMonitor();
    }

    @Override
    public void showColor(CmykColor cmykColor) {
        RgbColor rgbColor = convertFromCmyk(cmykColor);
        monitor.showColor(rgbColor);
    }

    private RgbColor convertFromCmyk(CmykColor cmyk) {
        int r = Math.round(255 * (1 - cmyk.getC()) * (1 - cmyk.getK()));
        int g = Math.round(255 * (1 - cmyk.getM()) * (1 - cmyk.getK()));
        int b = Math.round(255 * (1 - cmyk.getY()) * (1 - cmyk.getK()));
        return new RgbColor(r, g, b);
    }
}
