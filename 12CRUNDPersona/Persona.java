

public class Persona {
    private int id,edad;
    private String nombre;
    /*apellido paterno 
     * apellido materno
     * direccion
     * colonia
     * telefono
     */
    public Persona(){

    }
    public Persona(int edad,int id,String nombre ){
        this.id = id;
        this.edad = edad;
        this.nombre = nombre;

    }
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;  
    }
    public int getEdad(){
        return edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;  
    }
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;  
    }
}
