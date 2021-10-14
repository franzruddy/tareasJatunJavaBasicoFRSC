public class CajaRegistradora_2{
    private int total; //5 Bs.
    
    public CajaRegistradora_2(){
        total = 0;
    }
    public String registrarPrecio(int precio, int cantidad){
        String respuesta = "";
        if (precio >0 && cantidad >0){
            total = total +(precio*cantidad);
            respuesta = "Registro de precio exitoso !";
        }else{
            respuesta = "Error! Alguno de los datos no son validos ";
        }
        return respuesta;
        //total = total+(precio*cantidad);
        //total = 5+(p*c);
        //return "Precio Registrado";
    }
    public String consultarTotal(){
        return "El total a pagar es: "+total+" Bs.";
    }
    public String cobrar(int dinero){
        //if-else, o se utiliza un swich-case
        String respuesta = "";
        if(dinero<total){
            respuesta = "Error: el dinero indicado no cubre la compra"; 
        }else{
            int cambio = dinero-total;
            respuesta = "Cobro exitoso, el cambio a devolver es:  "+cambio+" Bs.";
            total = 0;
        }
        return respuesta;
    }
}
