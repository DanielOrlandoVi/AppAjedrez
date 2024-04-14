
package ProductoConcreto;
import ProductoAbstracto.Ficha;

public class PeonBlanco implements Ficha{

    @Override
    public void movimiento() {
        System.out.println("Se mueve Peon Blanco");
    }
    public void saludar(){
        System.out.println("Hola mundo, soy un peon blanco");
    }
    
}
