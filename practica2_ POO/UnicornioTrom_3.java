
/**
 * Write a description of class UnicornioTrom here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UnicornioTrom_3
{
    private int numeroalAsar=1+(int)(Math.random()*10);
    private int dineroenMaquina = 1000;
    private int fichas;
    private boolean ganador=false;
   int contador=0;
    public UnicornioTrom_3 (){
        fichas = 0;
    }
        
    public String consultaDinerienMaquina (){
        String respuesta = "";
        if (!ganador){
            respuesta ="Existe dinero para Jugar";
        }else{
            respuesta = "No existe dinero no puedes Jugar";
        }
        return respuesta;
    }
    public String registrodeFichas (int cantidadFichas){
        fichas = fichas+cantidadFichas;
        return "Fichas registradas: "+fichas;
    }
    public String juegoalasar (int inseteNumero){
        String respuesta = "";
        do{
            
            if (inseteNumero==numeroalAsar){
                ganador = true;
                respuesta = "Felicidades Ganastes el premio de: "+ dineroenMaquina;
                
            }else{
                respuesta = "Fallaste este intento";
            }
            contador++;
        }while(contador<fichas && ganador == false);
        return respuesta;
    }
}
