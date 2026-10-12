package org.example;

public class BiciclcetaMontaya {public class BicicletaMontanya extends Bicicleta {
    private int suspensiones;

    public BicicletaMontanya(String codigo, int anioFabricacion, double peso, int suspensiones) {
        super(codigo, anioFabricacion, peso);
        setSuspensiones(suspensiones);
    }

    public int getSuspensiones() {
        return suspensiones;
    }

    public void setSuspensiones(int suspensiones) {
        if (suspensiones < 0) {
            throw new IllegalArgumentException("Cantidad de suspensiones invalida");
        }
        this.suspensiones = suspensiones;
    }

    @Override
    public double calcularCostoMantencion() {
        double costo = 30000;
        if (suspensiones > 1) {
            costo = costo * 1.15;
        }
        return costo;
    }
}
}