
package ProductoConcreto;
import ProductoAbstracto.Ficha;

public class TorreNegra implements Ficha{

    @Override
    public void movimiento() {
        System.out.println("Se mueve Torre Negra");
    }
    
}

