import java.util.Arrays;
public class Ejercicio3_AnomaliaenelEquilibrio{
    public String busquedadelDesequilibrio(int arr[]){
        String res = "";
        int li=0;
        int ls=arr.length-1;
        int poslatIsquierda=(li+ls)/2;
        
        //int sumaIsquierda = 0;
        int sumaDerecha = poslatIsquierda;
        //for(int i=0; i<=poslatIsquierda; i++){
        //    sumaIsquierda=sumaIsquierda + arr[i];
        //    res = "la Suma es " + sumaIsquierda;
        //} 
        for(int j=poslatIsquierda; j<=ls; j++){
            sumaDerecha=sumaDerecha + arr[j];
            res = "la Suma es " + sumaDerecha;
        } 
        return res;
    }  
}