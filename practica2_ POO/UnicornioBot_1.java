
public class UnicornioBot_1
{
    private String nombre;
    
    public UnicornioBot_1(String valorNombre){
        nombre = valorNombre;
    }
    public String saludar(){
        String saludo = "Hola "+nombre;
        return saludo;
    }
    public void cambiarNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
}
