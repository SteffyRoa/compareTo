
package programacionfuncional;

/**
 *
 * @author sroa
 */
public class Empleado implements Comparable <Empleado> {
    //Comparable es una inerteace para comparacion de objetos.
    
  //Definimos atributos
    private String nombre;
    private int edad;
    private double sueldo;

    public Empleado(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + '}';
    }

  //***NOMBRE
    /*Override
    public int compareTo(Empleado t) {
       if(this.nombre.compareTo(t.nombre)> 0) return 1;//1**si lo queremos de forma ABCDE sino invirtiendo los valores
       if(this.nombre.compareTo(t.nombre)<0 )return -1;//-1
       return 0;
*/
    //****EDAD
 /*      @Override
    public int compareTo(Empleado t) {
       if(this.edad> t.edad) return 1;//1**si lo queremos de forma MENOR A MAYOR sino invirtiendo los valores
       if(this.edad<t.edad )return -1;//-1
       return 0;
*/
    
/*    
    //SUELDO
      @Override
    public int compareTo(Empleado t) {
       if(this.sueldo> t.sueldo) return 1;//1**si lo queremos de forma MENOR A MAYOR sino invirtiendo los valores
       if(this.sueldo<t.sueldo )return -1;//-1
       return 0;
    }
  */  

    @Override
    public int compareTo(Empleado t) {
        return this.nombre.compareTo(t.nombre);
    }
    
    
}
