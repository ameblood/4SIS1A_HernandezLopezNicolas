import java.util.Scanner;

public class Conejo extends Animal{
    Scanner entrada = new Scanner(System.in);
    
    //aqui
    String sex;
    public Conejo(){

    }

    public Conejo(String nombre, String raza, String tipo_alimento, int edad, String sex){
        //debo de poder acceder a la clase super
        super(nombre, raza, tipo_alimento, edad);
        this.sex = sex;
    }

    //recibir
    public String getsex(){
        System.out.println("cuantas veces su conejo hace el sin respeto a la semana?");
        sex = entrada.nextLine();
        return sex;
    }

    //enviar
    public void setsex(String sex){
        this.sex = sex;
    }

    //el metodo propio del perro
    public void mostrarConejo(){
        System.out.println("El nombre del perro es: " + getNombre() + "\n" + "Su raza es: " + getRaza() + "\n" + "Se alimenta de: " +
        getTipo_alimento() +  "\n" + "Tiene la edad de: " + getEdad() + "\n" + "la cantidad que copula es: " + sex);
    }




    
}