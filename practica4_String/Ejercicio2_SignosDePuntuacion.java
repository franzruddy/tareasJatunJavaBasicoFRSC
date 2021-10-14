
public class Ejercicio2_SignosDePuntuacion{
    public String calcularSingnosPuntuacion(String nuevoVerso){
        String res="";
        int contSignos=0;
        for(int pos=0; pos<nuevoVerso.length();pos++){
            char x = nuevoVerso.charAt(pos);
            if(x=='.'||x==','||x==';'||x=='!'||x=='¡'||x=='¿'||x=='?'){
                contSignos++;
                res = "Existen "+ contSignos +" signos de puntuación";
            }
        }
        return res;
    }
}
