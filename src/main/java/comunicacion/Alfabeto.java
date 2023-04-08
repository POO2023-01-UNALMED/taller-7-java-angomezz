package comunicacion;

public class Alfabeto extends Pictograma{
    private String[] letras;
    private String interpretacion;

    //constructor
    public Alfabeto(String origen, String[] letras, String interpretacion) {
        super(origen);
        this.letras = letras;
        this.interpretacion = interpretacion;
    }

    //metodos get y set
    public String[] getLetras() {
        return letras;
    }
    public void setLetras(String[] letras) {
        this.letras = letras;
    }

    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }


    //metodo propio
    public int cantidadLetras(){
        return letras.length;
    }

    //metodos abstractos
    public String interpretacion(){
        return interpretacion;
    }

    public String toString(){
        String alf = "";
        for(i = 0; i < letras.length; i++){
            if(i != letras.length-1){
                alf += letras[i] + ", ";
            } else{
                alf += letras[i];
            }
        }
        return alf;
    }



}