
package FabricaConcreta;
import FabricaAbstracta.FabricaFichas;
import ProductoAbstracto.*;
import ProductoConcreto.*;

public class FabricaNegras implements FabricaFichas{

    @Override
    public Ficha crearAlfil() {
        return new AlfilNegro();
    }

    @Override
    public Ficha crearCaballo() {
        return new CaballoNegro();    
    }

    @Override
    public Ficha crearDama() {
        return new DamaNegra();    
    }

    @Override
    public Ficha crearPeon() {
        return new PeonNegro();    
    }

    @Override
    public Ficha crearRey() {
        return new ReyNegro();    
    }

    @Override
    public Ficha crearTorre() {
        return new TorreNegra();    
    }
    
}
