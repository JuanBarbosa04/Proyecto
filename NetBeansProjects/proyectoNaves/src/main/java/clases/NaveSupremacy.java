
package clases;

public class NaveSupremacy extends Naves{

   public NaveSupremacy(int cantidadPersonas, double consumoLP, int cantidadDeNaves, double cantidadParsec) {
        super(cantidadPersonas, consumoLP, cantidadDeNaves,cantidadParsec);
    }
   
   
   public void calcularConsumoRecorrido(){
       super.calcularConsumoRecorido();
       consumoR=consumoR+(consumoR*0.1);
   }
   
    public double getConsumoRecorrido(){
        calcularConsumoRecorido();
        return consumoR;
    }
   
   }
    
    
    

