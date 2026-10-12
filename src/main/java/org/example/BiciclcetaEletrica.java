package org.example;

public class BiciclcetaEletrica { public class BicicletaElectrica extends Bicicleta implements ConGarantiaExtendida {
    private int autonomia;
    private boolean bateriaCertificada;
    private boolean garantiaActiva;

    public BicicletaElectrica(String codigo, int anioFabricacion, double peso, int autonomia, boolean bateriaCertificada) {
        super(codigo, anioFabricacion, peso);
        setAutonomia(autonomia);
        setBateriaCertificada(bateriaCertificada);
        this.garantiaActiva = false;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        if (autonomia <= 0) {
            throw new IllegalArgumentException("Autonomia invalida");
        }
        this.autonomia = autonomia;
    }

    public boolean isBateriaCertificada() {
        return bateriaCertificada;
    }

    public void setBateriaCertificada(boolean bateriaCertificada) {
        this.bateriaCertificada = bateriaCertificada;
    }

    @Override
    public boolean tieneGarantiaExtendida() {
        return garantiaActiva;
    }

    @Override
    public void activarGarantiaExtendida() {
        this.garantiaActiva = true;
    }

    @Override
    public double calcularCostoMantencion() {
        double costo = 45000;
        if (!bateriaCertificada) {
            costo = costo * 1.25;
        }
        return costo;
    }
}