
package ProductoConcreto;
import ProductoAbstracto.Ficha;

public class PeonNegro implements Ficha{

    @Override
    public void movimiento() {
        System.out.println("Se mueve Peon Negro");
    }
    
}

