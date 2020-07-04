
    
public class Toppins extends DecoradorHelado {
    private Helado helado;
    
    public Toppins(Helado h){
        this.helado = h;
    }
     
    public String getDescripcion(){
        return helado.getDescripcion()+" + toppins";
    }
}

