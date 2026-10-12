public class Main {
    public static void main(String[] args) {
        GestorTallerBicicleta gestor = new GestorTallerBicicleta();

        // 1. Instanciar bicicletas con datos especificados
        BicicletaElectrica e01 = new BicicletaElectrica("BIC-E01", 2023, 22.5, 60, false);
        BicicletaElectrica e02 = new BicicletaElectrica("BIC-E02", 2022, 24.0, 45, true);
        BicicletaMontanya m01 = new BicicletaMontanya("BIC-M01", 2021, 13.5, 2);
        BicicletaMontanya m02 = new BicicletaMontanya("BIC-M02", 2020, 12.0, 1);

        // 2. Marcar la bicicleta BIC-E01 con garantía extendida
        e01.activarGarantiaExtendida();

        // 3. Registrar bicicletas en el gestor
        gestor.registrarBicicleta(e01);
        gestor.registrarBicicleta(e02);
        gestor.registrarBicicleta(m01);
        gestor.registrarBicicleta(m02);

        // 4. Búsqueda por código e impresión de detalle
        System.out.println("\n=== BUSQUEDA POR CODIGO: \"BIC-E01\" ===");
        Bicicleta buscada = gestor.buscarPorCodigo("BIC-E01");
        if (buscada instanceof BicicletaElectrica) {
            System.out.println(((BicicletaElectrica) buscada).obtenerDetalleCompleto());
        }

        // 5. Listar todas las bicicletas mediante toString()
        gestor.listarBicicletas();
    }
}