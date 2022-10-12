
import java.util.Scanner;
public class cadena {
        
    Scanner entrada = new Scanner(System.in);
    /*metodo cadena */
    public void cadenas(){
        String s1 = "hola habia una vez un patiro que decia miau y que queria mimir pero no lo dejaban y por eso estaba triste";


            System.out.println("el tamaño de la cadena es" + s1.length());
            // si comieza con??
            System.out.println("la cadena inicia v o f con hola?... " + s1.startsWith("hola"));

            /*se finaliza */
            System.out.println("la cadena termina v o f con gato?" + s1.endsWith("gato"));

            //vamos a leer una variable
            System.out.println("ingrese una palabra");
            String s2 = entrada.nextLine();
            System.out.println(" la palabra es: " + s2);


            //vamos a obtener subcadenas de la palabra
            System.out.println("parte de una subcadena de s1" + s1.indexOf("tito"));
            //vamos a sustraer palabras
            System.out.println("primera parte: " + s1.substring(12));
            System.out.println("segunda parte: " + s1.substring(7,20));


            int valor = 24;
            String s3= String.valueOf(valor);

            System.out.println("el valor es de: "+ s3 + " como cadena");
            /*
             * 2 + 2 = 22 en cadena            
             * 2 + 2 = 4 en numero * 
             */

            String s4 = "20";
            int numeri = Integer.parseInt(s4);
            System.out.println("el valor de : " + numeri + " ahora es un numero");


            String s5 = "20.89";

            double numero1 = Double.parseDouble(s5);
            System.out.println(" el valor de: " + numero1 + " ahora es decimal");
            numero1 = numero1 + numeri;
            System.out.println("el resultado es: " + numero1);
            //convertir de otra forma entero a una cadena

            Integer x = 5;

            System.out.println("el valor de: " + x.toString() + "ahora es un numero");
            System.out.println("el valor de: " + Integer.toString(12) + "ahora es una cadena");
            





    }

}
