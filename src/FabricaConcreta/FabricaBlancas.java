
package FabricaConcreta;
import FabricaAbstracta.FabricaFichas;
import ProductoAbstracto.*;
import ProductoConcreto.*;

public class FabricaBlancas implements FabricaFichas{

    @Override
    public Ficha crearAlfil() {
        return new AlfilBlanco();
    }

    @Override
    public Ficha crearCaballo() {
        return new CaballoBlanco();    
    }

    @Override
    public Ficha crearDama() {
        return new DamaBlanca();    
    }

    @Override
    public Ficha crearPeon() {
        return new PeonBlanco();    
    }

    @Override
    public Ficha crearRey() {
        return new ReyBlanco();    
    }

    @Override
    public Ficha crearTorre() {
        return new TorreBlanca();    
    }
    
}
