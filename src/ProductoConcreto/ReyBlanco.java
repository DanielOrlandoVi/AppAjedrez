
package ProductoConcreto;
import ProductoAbstracto.Ficha;

public class ReyBlanco implements Ficha{

    @Override
    public void movimiento() {
        System.out.println("Se mueve Rey Blanco");
    }
    
}

