package diagramaClases;

public class Trabajadores extends Personas {
	String nombre;
	int edad ;
	String cargo;
    public Trabajadores(){}
    public Trabajadores(String nombre, int edad, String cargo){
        this.nombre = nombre;
        this.edad = edad;
        this.cargo = cargo;
  
    }
}
