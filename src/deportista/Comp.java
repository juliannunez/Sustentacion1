
package deportista;

import java.util.Scanner;


public class Comp {
    
    
    private String nombre;
    private double id;
    private int estilo[] = new int [6];
    
    
    Scanner lector = new Scanner(System.in);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }
    

    public int[] getEstilo() {
        return estilo;
    }

    public void setEstilo(int[] estilo) {
        this.estilo = estilo;
    }
    
    
}
