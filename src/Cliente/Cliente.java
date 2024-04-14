package Cliente;
import FabricaConcreta.*;
import FabricaAbstracta.*;
import ProductoAbstracto.*;
import ProductoConcreto.*;

public class Cliente {

    public static void main(String[] args) {
        FabricaFichas fabricaFichas;
        
        FabricaBlancas fabricaBlancas = new FabricaBlancas();
        FabricaNegras fabricaNegras = new FabricaNegras();
        
        Ficha peonBlanco = crearProducto(fabricaBlancas, "Peon");        
        peonBlanco.movimiento();
        ((PeonBlanco) peonBlanco).saludar();
        
        Ficha peonNegro = crearProducto(fabricaNegras, "Peon");        
        peonNegro.movimiento();
    }
    
    public static Ficha crearProducto(FabricaFichas fabricaFichas, String tipoFicha){
        switch(tipoFicha) {
            case "Alfil":
                return fabricaFichas.crearAlfil();
            case "Caballo":
                return fabricaFichas.crearCaballo();
            case "Dama":
                return fabricaFichas.crearDama();
            case "Peon":
                return fabricaFichas.crearPeon();
            case "Rey":
                return fabricaFichas.crearRey();
            case "Torre":
                return fabricaFichas.crearTorre();
            default:
                return null;
        }
    }
    
}
