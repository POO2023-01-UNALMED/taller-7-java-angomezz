package comunicacion;

public class Fabula extends Escrito{
    private String ensenanza;
    private String interpretacion;

    //constructor
    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion){
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    //metodos get y set
    public String getEnsenanza() {
        return ensenanza;
    }
    public void setEnsenanza(String ensenanza) {
        this.ensenanza = ensenanza;
    }

    public String getInterpretacion() {
        return interpretacion;
    }
    public void setInterpretacion(String interpretacion) {
        this.interpretacion = interpretacion;
    }

    //metodo propio
    public int palabrasTotales(int f){
        return super.getPaginas()*f*1;
    }

    //metodos abstractos
    public String interpretacion(){
        return interpretacion;
    }

    public String toString(){
        return super.getOrigen() + "\n" + super.getTitulo() + "\n" + super.getAutor() + "\n" + super.getPaginas()
        + "\n" + getEnsenanza();
    }
}