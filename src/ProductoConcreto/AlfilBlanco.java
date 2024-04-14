
package ProductoConcreto;
import ProductoAbstracto.Ficha;

public class AlfilBlanco implements Ficha{

    @Override
    public void movimiento() {
        System.out.println("Se mueve Alfil Blanco");
    }
    
}
