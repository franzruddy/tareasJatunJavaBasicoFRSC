public class Ejercicio4_ElFulgordelasEstrellas
{
    public String verificarEstrellasApagadas(int[] arr, int inicio, int fin)
    {
        String res="";
        if (inicio <=fin && inicio>=0 && inicio<arr.length && fin>=0 && fin<arr.length){
            int contador = 0;
            for(int pos = inicio; pos<=fin; pos ++){
                int numActual = arr[pos];
                if(numActual == 0){
                    contador++;
                }
            }
            res = "hay"+contador+"estrellas que dejaron de brillar";
        }else{
            res ="Algun dato no es valido";
        }
        return res;   
    }
}
