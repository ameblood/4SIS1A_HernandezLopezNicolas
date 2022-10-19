import java.util.Scanner;
public class Uron extends Animal{
    Scanner entrada = new Scanner(System.in);
    //aqui
    int horas;
    public Uron(){

    }

    public Uron(String nombre, String raza, String tipo_alimento, int edad, int horas){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.horas = horas;
    }

    //recibir
    public int gethoras(){
        System.out.println("cuantas horas duerme al dia?");
        horas = entrada.nextInt();
        return horas;
    }

    //enviar
    public void sethoras(int horas){
        this.horas = horas;
    }

    //el metodo propio del perro
    public void mostrarUron(){
        System.out.println("El nombre del perro es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + "esa cosa duerme : " + horas + " al dia" );
    }
}
