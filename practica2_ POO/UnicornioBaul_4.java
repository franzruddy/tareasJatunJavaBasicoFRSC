

public class UnicornioBaul_4
{
    int intentos = 5;
    int numerodeCaja;
    boolean abierta = false;
    public UnicornioBaul_4 (){
        numerodeCaja = 1111;
    }
    public String consultaestadoBaul (){
        String respuesta= "";
        if (abierta){
            respuesta="El Baul esta abierto";
        }else{
            respuesta= "El Baul esta cerrado"; 
        }
        return respuesta;
    }
    public String nuevoCodigoBaul (int nuevoNumero_Baul){
        String respuesta = "";
        if (nuevoNumero_Baul>0 && nuevoNumero_Baul<9999){
            numerodeCaja = nuevoNumero_Baul;
            respuesta = "Nuevo codigo de bual Exitoso";
        }else{
            respuesta = "Error ! el numero es incorecto"; 
        }
        return respuesta;
    }
    
    public String insertecodigo (int codigo_Baul){
        String respuesta = "";
        do{
        if (codigo_Baul==numerodeCaja){
            abierta = true;
            respuesta = "La clave es correcta";
        }else{
            respuesta = "La clave es incorrecta";
        }
        intentos--;
       }while((intentos>0)&&(!abierta));
       return respuesta;
    }
}
