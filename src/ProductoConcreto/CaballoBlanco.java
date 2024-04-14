
package ProductoConcreto;
import ProductoAbstracto.Ficha;

public class CaballoBlanco implements Ficha{

    @Override
    public void movimiento() {
        System.out.println("Se mueve Caballo Blanco");
    }
    
}
