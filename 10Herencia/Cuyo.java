
import java.util.Scanner;
public class Cuyo extends Animal{
    Scanner entrada = new Scanner(System.in);
    //aqui
    String ansiedad;
    public Cuyo(){

    }

    public Cuyo(String nombre, String raza, String tipo_alimento, int edad, String ansiedad){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.ansiedad = ansiedad;
    }

    //recibir
    public String getansiedad(){
        System.out.println("tiene mucha ansiedad tu cuyo?");
        ansiedad = entrada.nextLine();
        return ansiedad;
    }

    //enviar
    public void setansiedad(String ansiedad){
        this.ansiedad = ansiedad;
    }

    //el metodo propio del perro
    public void mostrarCuyo(){
        System.out.println("El nombre del perro es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + "la ansiedad es : " + ansiedad);
    }




    
}