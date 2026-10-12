public class BicicletaMontanya extends Bicicleta {
    private int cantidadSuspensiones;

    public BicicletaMontanya(String codigoBicicleta, int anioFabricacion, double peso, int cantidadSuspensiones) {
        super(codigoBicicleta, anioFabricacion, peso);
        setCantidadSuspensiones(cantidadSuspensiones);
    }

    public int getCantidadSuspensiones() {
        return cantidadSuspensiones;
    }

    public void setCantidadSuspensiones(int cantidadSuspensiones) {
        if (cantidadSuspensiones < 0) {
            throw new IllegalArgumentException("La cantidad de suspensiones no puede ser negativa.");
        }
        this.cantidadSuspensiones = cantidadSuspensiones;
    }

    @Override
    public double calcularCostoMantencion() {
        double costoBase = 30000;
        if (cantidadSuspensiones > 1) {
            costoBase *= 1.15;
        }
        return costoBase;
    }

    public String obtenerDetalleCompleto() {
        return "Tipo: Bicicleta Montaña | " + super.toString() + " | Peso: " + getPeso() + " kg | Suspensiones: " + cantidadSuspensiones + " | Costo mantención: $" + (int)calcularCostoMantencion();
    }
}