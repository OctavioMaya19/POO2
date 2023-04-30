package Entidad;

public class Cafetera {
    private int capaMax;
    private int capActual;

    public Cafetera() {
    }

    public Cafetera(int capaMax, int capActual) {
        this.capaMax = capaMax;
        this.capActual = capActual;
    }

    public int getCapaMax() {
        return capaMax;
    }

    public void setCapaMax(int capaMax) {
        this.capaMax = capaMax;
    }

    public int getCapActual() {
        return capActual;
    }

    public void setCapActual(int capActual) {
        this.capActual = capActual;
    }
    
}
