
package herencia;

public class estudiante extends persona {
    private int codigoEstudiante;
    private float notafinal;
     
    
    public estudiante (String nombre,String apellido,int edad, int codigoEstudiante,float notafinal){
 
        super(nombre,apellido,edad);
        this.codigoEstudiante= codigoEstudiante;
        this.notafinal=notafinal;
    }
    
public void mostrarDatos(){
   System.out.println("Nombre:"+ getNombre()+
           "\nApellido:"+getApellido()+
           "\nEdad:"+getEdad()+
           "\nCodigoEstudiante:"+codigoEstudiante+
           "\nNotafinal:"+notafinal);
   
}
// COMENTNAOD PARA SUBIR A GITHUB
}
 
    
