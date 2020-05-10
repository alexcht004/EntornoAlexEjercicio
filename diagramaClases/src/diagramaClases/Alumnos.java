package diagramaClases;

public class Alumnos extends Personas{
	String nombre;
	int edad ;
	String rendimiento;
    public Alumnos(){}
    public Alumnos(String nombre, int edad, String rendimiento){
        this.nombre = nombre;
        this.edad = edad;
        this.rendimiento = rendimiento;
  
    }	
}