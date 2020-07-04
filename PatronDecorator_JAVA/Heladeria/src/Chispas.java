
public class Chispas extends DecoradorHelado {
    private Helado helado;
    
    public Chispas(Helado h){
        this.helado = h;
    }
     
    @Override
    public String getDescripcion(){
        return helado.getDescripcion()+" + chispas";
    }
}
