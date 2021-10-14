/**         El Recuerdo del Ciprés
 *El juego de la sombra tiene como objetivo predecir, 
cada hora que pasa, cuando será la magnitud de la 
sombra que proyecta el ciprés.
 * Ejemplo:
 * si tienes somba 13 y queremos predecir hasta 7 horas
 * [13, 14,  7,  9, 12,  6,  3]
 *  0    1   2   3   4   5   6
 *  
 *Si tu numero actual es par, el siguiente será igual a su mitad.
 *Si tu numero actual es impar, el siguiente será igual a el 
valor del actual mas x, donde x es 
una variable numérica que tiene como valor inicial uno, 
cada vez que es utilizada su valor 
de incrementa en uno mas.
 */
public class Ejercicio5_ElRecuerdoDelCipres{
    public int[] predecirHoras (int valorInicial, int posFinal){      
        int arr[]=new int[posFinal];
        arr[0]=valorInicial;
        int incremento = 1;
        for(int posInicial=0;posInicial<posFinal-1;posInicial++){
            valorInicial = arr[posInicial];
            if(valorInicial%2==0){
                arr[posInicial+1]=valorInicial/2;
            }else{
                if(valorInicial%2!=0){
                    arr[posInicial+1]=valorInicial+incremento;
                    incremento++;
                }      
            }
        }
        return arr;
    }
}
