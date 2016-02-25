package deportista;
import java.util.Scanner;

public class Deportista {
    
    private String nombre;
    private int anio;
    private int id;
    private String rama;
    private String modalidad;
    private String estilo[] = new String [5];
    
    Scanner lector = new Scanner(System.in);
  
public Deportista(String nombre, int anio, int id, String rama){

        this.nombre = nombre;
        this.anio = anio;
        this.id = id;
        this.rama = rama;
        this.modalidad = categoria(anio);

        }

public String categoria (int anio){
    
    String m;
    m="";
    
    if (anio >= 2006 && anio <= 2010){
    m = "infantil A";
    }
    
    if (anio >= 1999 && anio <= 2005){
    m = "infantil B";
    }
    
    if (anio >= 1991 && anio <=1998){
    m = "Juvenil";
    }
        
    if (anio <= 1990){
        m = "Senior";
        }

     return m;
}

    public String getNombre() {
        return nombre;
    }


    public int getAnio() {
        return anio;
    }


    public int getId() {
        return id;
    }

    public String getRama() {
        return rama;
    }
    
    public String getModalidad() {
        return modalidad;
    }

 
    
}
