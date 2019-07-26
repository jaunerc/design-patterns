package ch.travbit.design_patterns.structural.adapter;

public class CmykColor {
    private float c, m, y, k;

    public CmykColor(float c, float m, float y, float k) {
        this.c = c;
        this.m = m;
        this.y = y;
        this.k = k;
    }

    public float getC() {
        return c;
    }

    public void setC(float c) {
        this.c = c;
    }

    public float getM() {
        return m;
    }

    public void setM(float m) {
        this.m = m;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getK() {
        return k;
    }

    public void setK(float k) {
        this.k = k;
    }
}
