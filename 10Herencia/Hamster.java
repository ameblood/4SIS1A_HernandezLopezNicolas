import java.util.Scanner;
public class Hamster extends Animal{
    Scanner entrada = new Scanner(System.in);
    //aqui
    int vueltas;
    public Hamster(){

    }

    public Hamster(String nombre, String raza, String tipo_alimento, int edad, int vueltas){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.vueltas = vueltas;
    }

    //recibir
    public int getvueltas(){
        System.out.println("cuantas vueltas da tu hamster enm su rueda al dia?");
        vueltas = entrada.nextInt();
        return vueltas;
    }

    //enviar
    public void setansiedad(int vueltas){
        this.vueltas = vueltas;
    }

    //el metodo propio del perro
    public void mostrarHamster(){
        System.out.println("El nombre del perro es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + "da : " + vueltas + " vueltas");
    }
}
