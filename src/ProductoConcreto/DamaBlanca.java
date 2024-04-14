
package ProductoConcreto;
import ProductoAbstracto.Ficha;

public class DamaBlanca implements Ficha{

    @Override
    public void movimiento() {
        System.out.println("Se mueve Dama Blanca");
    }
    
}

