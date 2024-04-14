
package FabricaAbstracta;
import ProductoAbstracto.*;

public interface FabricaFichas {
    Ficha crearAlfil(); 
    Ficha crearCaballo();
    Ficha crearDama();
    Ficha crearPeon();
    Ficha crearRey();
    Ficha crearTorre();
}
