
package deportista;

import java.util.Arrays;
import java.util.Scanner;  
public class Arreglo {
  Scanner lector = new Scanner(System.in);
  int contadorDepor;
  int opcion1;
  int opcion2;
  int opcion3;
  int contadorComp;
  Deportista arregDepor [] = new Deportista [100];
  Comp arregComp [] = new Comp [100];
  
  public Arreglo(){
  
      do{
          
           System.out.println(" ");
           System.out.println("Menu general: ");
           System.out.println("Para ingresar al menu de gestión digite 1");
           System.out.println("Para ingresar al menu de inscripción digite 2");
           System.out.println("Para salir digite 3");
           opcion1 = lector.nextInt();
           
           switch (opcion1){
           
               case 1:
                   gestion();
                   break;
               case 2:
                   inscripcion();
                   break;
               case 3:
                   break;
               default: 
                  System.out.println("No es una opcion valida"); 
                  
           
           }
      }
      while(opcion1 != 3);
  
  }
    
   public void gestion(){
 
       do{
           System.out.println(" ");
           System.out.println("Menu general de gestion: ");
           System.out.println("Para ingresar un deportista al sistema digite 1");
           System.out.println("Para actualizar digite 2");
           System.out.println("Para eliminar un deportista digite 3");
           System.out.println("Para buscar un deportista digite 4");
           System.out.println("Para ir de nuevo al menu principal digite 5");
           opcion2 = lector.nextInt();
           
           switch(opcion2){
           
               case 1:
                   ingresar();
                   break;
               case 2:
                   actualizar ();
                   break;
               case 3:
                   eliminar1();
                   break;
               case 4:
                   buscar();
                   break;
               case 5:
                   break;
               default:
                   System.out.println("Comando NO valido");
           
           }
       }
       
       while(opcion2 != 5);
   
   }
   
   public void inscripcion(){
   
        do{
           
           System.out.println(" ");
           System.out.println("Menu de inscripcion: ");
           System.out.println("Para inscribir un deportista a una competencia digite 1");
           System.out.println("Para eliminar un deportista de una competencia digite 2");
           System.out.println("Para mostrar los nadadores inscritos a una prueba digite 3");
           System.out.println("Para ir de nuevo al menu principal digite 4");
           opcion3 = lector.nextInt();
           
           switch(opcion3){
           
               case 1:
                   inscribir();
                   break;
               case 2:
                   eliminar2();
                   break;
               case 3:
                  mostrar();
                   break;
               case 4:
                   break;
               default:
                   System.out.println("Comando NO valido");
           }
        }
        while(opcion3 != 4);
        
   }
       
   public void ingresar(){
   
       String nombre;
       int anio;
       int id;
       String rama;
       String modalidad;
       int i = 0;
       
       System.out.println(" ");
       System.out.println("Ingrese el nombre del deportista: ");
       nombre = lector.next();
       System.out.println("Ingrese el anio de nacimiento: ");
       anio = lector.nextInt();
       System.out.println("Ingrese el documento de identidad: ");
       id = lector.nextInt();
       while(i<contadorDepor){
           
           if(arregDepor[i].getId()==id){
           
           System.out.println("Este ID ya existe!");
           System.out.println("Ingrese nuevamente el ID");
           id = lector.nextInt();
           i = 0;
           }
           else {
           i++;
           }
       }
       
       System.out.println("Ingrese la rama (masculino o femenino) ");
       rama = lector.next();
       
       Deportista tempDepor = new Deportista(nombre, anio, id, rama);
       
       arregDepor[contadorDepor] = tempDepor;
       contadorDepor++;
   
   }
   
   public void actualizar(){
   
   String nombre;
   int anio;
   int id;
   String rama;
   String modalidad;
   double x;
   int y = 6;
   System.out.println(" ");
   System.out.println("Ingrese el ID del nadador que quiere actualizar: ");
   x = lector.nextInt();
   for(int i=0; i<contadorDepor; i++){
   
       if(arregDepor[i].getId()==x){
           
           //ingresar();
       System.out.println(" ");
       System.out.println("Ingrese el nombre del deportista: ");
       nombre = lector.next();
       System.out.println("Ingrese el anio de nacimiento: ");
       anio = lector.nextInt();
       System.out.println("Ingrese el documento de identidad: ");
       id = lector.nextInt();
       System.out.println("Ingrese la rama (masculino o femenino) ");
       rama = lector.next();
       
       Deportista tempDepor = new Deportista(nombre, anio, id, rama);
       
       arregDepor[i] = tempDepor;
           
           y =0;
           
       }
       
       }
         if(y!=0){
       System.out.println("No se encontro el usuario");  
       }
   
   
   
   }
   
   public void buscar(){
   
   double x;
   int y = 6;
   System.out.println(" ");
   System.out.println("Ingrese el ID a buscar: ");
   x = lector.nextDouble();
   for(int i=0; i<contadorDepor; i++){
   
       if(arregDepor[i].getId()==x){
       
           System.out.println("Nombre: "+arregDepor[i].getNombre());
           System.out.println("Año de nacimiento: "+arregDepor[i].getAnio());
           System.out.println("Documento de identidad: "+arregDepor[i].getId());
           System.out.println("Rama: "+arregDepor[i].getRama());
           System.out.println("Modalidad: "+arregDepor[i].getModalidad());
           y =0;
           
       }
       
           
       }
   if(y!=0){
       System.out.println("No se encontro el usuario");
       }
       
   }
   
   
   public void eliminar1(){
       
   double x;
   int y = 6;
   System.out.println(" ");
   System.out.println("Ingrese el ID del nadador que desea eliminar: ");
   x = lector.nextInt();
   for(int i=0; i<contadorDepor; i++){
   
       if(arregDepor[i].getId()==x){
           
           for(int r =i; r<contadorDepor; r++){
           
               arregDepor[r]=arregDepor[r+1];
           }
       
           y =0;  
           contadorDepor--;
       }
       
       
       }
   if(y!=0){
       System.out.println("No se encontro el usuario");
           
       }
   
   }
   
   public void inscribir(){
   
   int x;
   int y = 6;
   int h [] = new int [6];
   System.out.println(" ");
   System.out.println("Ingrese el ID del nadador que quiere inscribir: ");
   x = lector.nextInt();
   for(int i=0; i<contadorDepor; i++){
   
       if(arregDepor[i].getId()==x){
           
           Comp tempComp = new Comp();
           tempComp.setNombre(arregDepor[i].getNombre());
           tempComp.setId(arregDepor[i].getId());
       
           for(int r=0; r<6; r++){
               
               System.out.println("Ingrese 1 si el estilo es libre, 2 si es mariposa, 3 si es pecho, 4 si es espalda. Ingrese 0 para salir ");
               h[r] = lector.nextInt();
             
               if(h[r]==0){
                  r = 100; 
               
               }
               else {
               
               }
           
           
           }
           tempComp.setEstilo(h);
           tempComp.setCategoria(arregDepor[i].getModalidad());
           arregComp[i]=tempComp;
           contadorComp++;
           
           y =0;
           
       }
       
           
       }
   if(y!=0){
       System.out.println("No se encontro el usuario");
       }
   
   
   }
   
   public void eliminar2(){
   int x;
   int y = 6;
   int h[]= new int [5];
   int w;
   System.out.println(" ");
   System.out.println("Ingrese el ID del nadador al que desea retirar de alguna prueba: ");
   x = lector.nextInt();
   for(int i=0; i<contadorDepor; i++){
   
       if(arregDepor[i].getId()==x){
           
           y=0;
           
            h = arregComp[i].getEstilo();
            System.out.println("El nadador esta inscrito a las siguientes pruebas: ");
           
           for(int r=0; r<5; r++){
               
               if(h[r]==1){
               System.out.println("Libre ");
                
               }
               
               if(h[r]==2){
               System.out.println("Mariposa ");
                
               }
               
               if(h[r]==3){
               System.out.println("Pecho ");
                
               }
               
               if(h[r]==4){
               System.out.println("Espalda ");
                
               }
               
           }
           
           System.out.println("Ingrese 1 si quiere eliminar el estilo libre, 2 si es mariposa, 3 si es pecho, 4 si es espalda. ");
            w = lector.nextInt();
            
            for (int u = 0; u<5; u++){
            
            if(h[u]==w){
               
               for(int t =u; t<5; t++){
           
               h[t]=h[t+1];
                }
                
             }
               
            
            }

               
               
       }
           
      
           
     }
    if(y!=0){
       System.out.println("No se encontro el usuario");
       }
   
   }
   
   public void mostrar(){
       
       int q;
       int h [] = new int [5];
       int y;
       
       y = 6;
       
       System.out.println("Ingrese 1 si quiere ver los nadadores inscritos en el estilo libre, 2 si desea ver los de mariposa, 3 si desea ver los de pecho, 4 si quiere ver los de espalda.");
       q = lector.nextInt();
       
       System.out.println(" ");
       System.out.println("Nadadores: ");
       for (int i =0; i<contadorComp; i++){
       
       h = arregComp[i].getEstilo();
       
       for (int z=0; z<5; z++){
           
           if(h[z]==q){
           
               System.out.println(arregComp[i].getNombre()+" ---> "+arregComp[i].getCategoria());
               y=0;
           
           }
       
       
       }
       
       
       }
       if(y!=0){
       System.out.println(" ");
       System.out.println("No hay nadadores inscritos en esta competencia");
       }
      
   
   
   }
   
}
   
   
   
    

