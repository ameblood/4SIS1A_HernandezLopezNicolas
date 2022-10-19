import java.util.Scanner;

public class examen {
    public static void main(String args[]){ 
        
        Scanner entrada = new Scanner(System.in); 
        String arreglo[] = new String[1];
        String palabrasec;
        String nose[];
        int intentos = 20;
        int op;

        System.out.print("\033[H\033[2J");
        System.out.flush();

        System.out.println("\t\t\t\t\t JUEGO DEL AHORCADO ");

        System.out.println("");

        do{
        //aqui pide una palabra y lo gusrda en un arreglo
        for(int i=0;i<arreglo.length;i++){
            System.out.print("Ingrese una palabra : ");
            palabrasec = entrada.nextLine(); 
            arreglo[i]= palabrasec;
            System.out.println(".length");
            System.out.print("\033[H\033[2J");
            System.out.flush();
            //aqui transforma la palabra en __
            int letratraspalabrasecreta = palabrasec.length();
            char []palabraguiones = new char[letratraspalabrasecreta];
            for(int j=0;j<palabraguiones.length;j++){
                palabraguiones[j] = '_';
        }
        boolean juegoterminado=false;
        do{
            System.out.println("Tienes: " + intentos + " Puntos");
            System.out.println(palabraguiones);
            System.out.println("Introduce una letra");
            char letra = entrada.next().charAt(0);
            boolean algunaletraacertada=false;
            for(int j=0;j<palabrasec.length();j++){
                if(palabrasec.charAt(j)==letra){
                   palabraguiones[j]=letra;
                    algunaletraacertada=true;
                  
                }
            }
            if(!algunaletraacertada)
            { System.out.println("No has hacertado ninguna");
            System.out.println("");
            System.out.println("Una pista");
            System.out.println("Son: " + arreglo[i].length() + " letras que adivinar");
            System.out.println("Otra pista: la primera letra es: " + palabrasec.substring(0,1) );
            System.out.println("Otra pista: la cuarta letra es: " + palabrasec.substring(3,4)); 

        }
        
            --intentos;
            if(intentos==0){ System.out.println("\t\t\t GAMER OVER ");
                    juegoterminado=true;
                }
            else{
                boolean juegoganado=!hayguiones(palabraguiones);
                if(juegoganado){
                 System.out.print("\033[H\033[2J");
                 System.out.flush();
                 System.out.println("\n\n\n\t\t\tWIN ");
                 System.out.println("\n\n\n\t\tLa palabra es: " +palabrasec);
                 juegoterminado=true;
                }
            }
        }while(!juegoterminado);
    }
    System.out.println("quiere repetir  el juego? 1-si, 2-no");
    op = entrada.nextInt();
    }while(op!=2);

}




static boolean hayguiones(char[] array){
    for(char l:array){
        if(l=='_')return true;
    }
    return false;
}
}
     // a n i m   l e s
     //  a 
     // do {

     // while (letra!= )
