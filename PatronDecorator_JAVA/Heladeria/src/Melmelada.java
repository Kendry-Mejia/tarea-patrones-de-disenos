/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexm
 */
public class Melmelada extends DecoradorHelado {
    private Helado helado;
    
    public Melmelada(Helado h){
        this.helado = h;
    }
     
    public String getDescripcion(){
        return helado.getDescripcion()+" + melmelada";
    }
}
