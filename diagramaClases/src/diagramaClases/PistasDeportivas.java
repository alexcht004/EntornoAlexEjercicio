package diagramaClases;

public class PistasDeportivas extends Instalaciones{
	String nombre;
	int dimencion ;
	String estado;
    public PistasDeportivas(){}
    public PistasDeportivas(String nombre, int dimencion, String estado){
        this.nombre = nombre;
        this.dimencion = dimencion;
        this.estado = estado;
  
    }	
}