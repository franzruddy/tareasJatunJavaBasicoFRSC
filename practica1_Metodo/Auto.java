/** Clase Auto 
 * Atibutos marca, modelo y cantidad 
 * Auror: Franz Ruddy Salinas
 * version: 001
 */
public class Auto{
    // varialbles
    private String marca;
    private String modelo;
    private int cantidad;

    //metodo contructor, parametros Marca, Modelo
    public Auto(String valorMarca, String valorModelo){ 
        marca = valorMarca;
        modelo = valorModelo;
        cantidad = 1;
    }

    // metodo get
    public String getMarca (){
        return marca;
    }

    public String getModelo (){
        return modelo;
    }

    public int getCantidad (){
        return cantidad;
    }

    // metodo set
    public void setMarca (String valor){
        marca = valor;
    }

    public void setModelo (String valor){
        modelo = valor;
    }

    public void setcantidad (int valor){
        valor = valor;
    }
}
