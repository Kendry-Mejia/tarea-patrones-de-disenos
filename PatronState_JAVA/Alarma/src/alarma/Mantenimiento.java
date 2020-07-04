public class Mantenimiento implements Estado {
    
    public void ejecutarAccion(){
        System.out.println("Estado en Mantenimiento: No Atento");
        System.out.println("Enviar correo para informar el estado");
    }
}
