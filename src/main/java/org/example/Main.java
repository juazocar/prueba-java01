package org.example;



// Nota IE1.1: A diferencia del paradigma imperativo, en POO se agrupan datos y metodos en clases.
// El tipado estatico de Java permite detectar errores de sintaxis y tipos en tiempo de compilacion y no en ejecucion.

public class Main {
    public static void main(String[] args) {
        try {
            GestorTallerBicicletas gestor = new GestorTallerBicicletas();

            // Creacion de bicicletas segun la tabla
            BicicletaElectrica e1 = new BicicletaElectrica("BIC-E01", 2023, 22.5, 60, false);
            BicicletaElectrica e2 = new BicicletaElectrica("BIC-E02", 2022, 24.0, 45, true);
            BicicletaMontanya m1 = new BicicletaMontanya("BIC-M01", 2021, 13.5, 2);
            BicicletaMontanya m2 = new BicicletaMontanya("BIC-M02", 2020, 12.0, 1);

            // Garantia para BIC-E01
            e1.activarGarantiaExtendida();

            // Agregar al gestor
            gestor.registrarBicicleta(e1);
            gestor.registrarBicicleta(e2);
            gestor.registrarBicicleta(m1);
            gestor.registrarBicicleta(m2);

            System.out.println("\n=== BUSQUEDA POR CODIGO: \"BIC-E01\" ===");
            Bicicleta buscada = gestor.buscarPorCodigo("BIC-E01");

            if (buscada != null && buscada instanceof BicicletaElectrica) {
                BicicletaElectrica elec = (BicicletaElectrica) buscada;
                String cert = elec.isBateriaCertificada() ? "Si" : "No";
                String gar = elec.tieneGarantiaExtendida() ? "Si" : "No";

                System.out.println("Tipo: Bicicleta ElÃ©ctrica | CÃ³digo: " + elec.getCodigo() +
                        " | AÃ±o: " + elec.getAnioFabricacion() + " | Peso: " + elec.getPeso() + " kg" +
                        " | AutonomÃ­a: " + elec.getAutonomia() + " km | BaterÃ­a certificada: " + cert);
                System.out.println("Garantia extendida: " + gar + " | Costo mantenciÃ³n: $" + (int)elec.calcularCostoMantencion());
            }
            System.out.println("---");

            System.out.println("\n=== LISTADO DE BICICLETAS ===");
            for (Bicicleta b : gestor.getListaBicis()) {
                System.out.println(b.toString());
            }

        } catch (IllegalArgumentException ex) {
            System.out.println("Error en las validaciones: " + ex.getMessage());
        } catch (Exception ex) {
            System.out.println("Error inesperado: " + ex.getMessage());
        }
    }
}