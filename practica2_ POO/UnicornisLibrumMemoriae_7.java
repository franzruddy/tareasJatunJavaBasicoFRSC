public class UnicornisLibrumMemoriae_7
{
    private String tareaActual;
    private int contadordeTrareas;
    private boolean estadoConcluido;
    public UnicornisLibrumMemoriae_7(String tareaInicial){
        tareaActual=tareaInicial;
        contadorTareas = 0;
        estadoConcluido=false;
    }
    public String consultaTarea(){
        return tareaActual;
    }
        
}
