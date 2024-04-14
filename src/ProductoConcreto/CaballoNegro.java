
package ProductoConcreto;
import ProductoAbstracto.Ficha;

public class CaballoNegro implements Ficha{

    @Override
    public void movimiento() {
        System.out.println("Se mueve Caballo Negro");
    }
    
}

