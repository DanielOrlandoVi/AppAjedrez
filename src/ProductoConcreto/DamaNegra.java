
package ProductoConcreto;
import ProductoAbstracto.Ficha;

public class DamaNegra implements Ficha{

    @Override
    public void movimiento() {
        System.out.println("Se mueve Dama Negra");
    }
    
}