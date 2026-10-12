package org.example;

public class Bicicleta {// Diferencia con C: Java es POO y usa tipado estatico (los tipos se revisan al compilar, no al ejecutar)
    public abstract class Bicicleta {
        private String codigo;
        private int anioFabricacion;
        private double peso;

        public Bicicleta(String codigo, int anioFabricacion, double peso) {
            setCodigo(codigo);
            setAnioFabricacion(anioFabricacion);
            setPeso(peso);
        }

        public String getCodigo() {
            return codigo;
        }

        public void setCodigo(String codigo) {
            if (codigo == null || codigo.trim().isEmpty()) {
                throw new IllegalArgumentException("El codigo no puede estar vacio");
            }
            this.codigo = codigo;
        }

        public int getAnioFabricacion() {
            return anioFabricacion;
        }

        public void setAnioFabricacion(int anioFabricacion) {
            if (anioFabricacion < 2000 || anioFabricacion > 2026) {
                throw new IllegalArgumentException("El aÃ±o debe estar entre 2000 y 2026");
            }
            this.anioFabricacion = anioFabricacion;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(double peso) {
            if (peso <= 0) {
                throw new IllegalArgumentException("El peso debe ser positivo");
            }
            this.peso = peso;
        }

        public abstract double calcularCostoMantencion();

        @Override
        public String toString() {
            return "CÃ³digo: " + codigo + " | AÃ±o: " + anioFabricacion;
        }
    }
}