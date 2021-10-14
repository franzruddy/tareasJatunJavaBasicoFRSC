
public class Ejercicio4_Prefijo_legado_de_los_ancestros{
    public String encontrarPrefijo(String nuevnombre, String prefijo){
        String res = "";
        boolean esPrefijo= true;
        for(int pos=0;pos<prefijo.length() && esPrefijo==true;pos++){
            char actNuevnombre = nuevnombre.toLowerCase().charAt(pos);
            char actPrefijo = prefijo.toLowerCase().charAt(pos);
                       
            if(actNuevnombre != actPrefijo){
                esPrefijo = false;
                res = "El nombre "+ nuevnombre +", No comienza con el prefijo "+prefijo;
            }else{
                res = "El nombre "+ nuevnombre +", Si comienza con el prefijo "+prefijo;
            }
        }
        return res;
        
    }
}
