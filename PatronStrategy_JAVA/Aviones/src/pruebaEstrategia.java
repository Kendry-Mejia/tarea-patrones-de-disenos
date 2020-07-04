
public class pruebaEstrategia {
    public static void main(String[] args){
      Avioncomercial avioncomercial= new Avioncomercial();
      
      System.out.println("avion comercial");
      avioncomercial.setAlgoritmo(new Tierra());
      avioncomercial.mover();
      avioncomercial.setAlgoritmo(new Aire());
      avioncomercial.mover();
      
       System.out.println("avion comercial rapido");
        avioncomercial.setAlgoritmo(new Rapidez());
         avioncomercial.mover();
    }
    
    
}
