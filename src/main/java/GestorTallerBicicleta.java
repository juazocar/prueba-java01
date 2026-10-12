import java.util.ArrayList;
import java.util.List;

public class GestorTallerBicicleta {
    private List<Bicicleta> bicicletas;

    public GestorTallerBicicleta() {
        this.bicicletas = new ArrayList<>();
    }

    public void registrarBicicleta(Bicicleta bicicleta) {
        if (bicicleta != null) {
            bicicletas.add(bicicleta);
            System.out.println(bicicleta.getCodigoBicicleta() + " (" + bicicleta.getClass().getSimpleName() + ") registrada correctamente.");
        }
    }

    public Bicicleta buscarPorCodigo(String codigo) {
        for (Bicicleta b : bicicletas) {
            if (b.getCodigoBicicleta().equalsIgnoreCase(codigo)) {
                return b;
            }
        }
        return null;
    }

    public void listarBicicletas() {
        System.out.println("\n=== LISTADO DE BICICLETAS ===");
        for (Bicicleta b : bicicletas) {
            System.out.println(b.toString());
        }
    }
}