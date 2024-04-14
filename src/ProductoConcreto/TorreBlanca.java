
package ProductoConcreto;
import ProductoAbstracto.Ficha;

public class TorreBlanca implements Ficha{

    @Override
    public void movimiento() {
        System.out.println("Se mueve Torre Blanca");
    }
    
}
