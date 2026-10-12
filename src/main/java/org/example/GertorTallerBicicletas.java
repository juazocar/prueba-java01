package org.example;

public class GertorTallerBicicletas {import java.util.ArrayList;
import java.util.List;

    public class GestorTallerBicicletas {
        private List<Bicicleta> listaBicis;

        public GestorTallerBicicletas() {
            listaBicis = new ArrayList<>();
        }

        public void registrarBicicleta(Bicicleta b) {
            if (b != null) {
                listaBicis.add(b);
                System.out.println(b.getCodigo() + " (" + b.getClass().getSimpleName() + ") registrada correctamente.");
            }
        }

        public Bicicleta buscarPorCodigo(String cod) {
            for (Bicicleta b : listaBicis) {
                if (b.getCodigo().equalsIgnoreCase(cod)) {
                    return b;
                }
            }
            return null;
        }

        public List<Bicicleta> getListaBicis() {
            return listaBicis;
        }
    }
}