
package deportista;

import java.util.Scanner;


public class Comp {
    
    
    private String nombre;
    private int id;
    private int estilo[] = new int [6];
    private String categoria;
    
    
    Scanner lector = new Scanner(System.in);

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public int[] getEstilo() {
        return estilo;
    }

    public void setEstilo(int[] estilo) {
        this.estilo = estilo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    
}
