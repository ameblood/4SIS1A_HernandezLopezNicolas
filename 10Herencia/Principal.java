import java.util.Scanner;

public class Principal {

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int op,op2,op1;
        
        //hago la instancia del animal perro
        perro dog = new perro();
        Gato cat = new Gato();
        Hamster reou = new Hamster();
        Conejo bad = new Conejo();
        Cuyo nose = new Cuyo();
        Uron risa = new Uron();
        Pez gluglu = new Pez();

        /*Quiero que se cree un menu mediante el cual el usuario pueda ingresar los datos de los animales:
         * 
         * 1.- Perro
         * 2.- Gato
         * 3.- Hamster
         * 4.- Conejo
         * 5.- Cuyo
         * 6.- Uron
         * 7.- Otro
         * 
         * Debera de poder ingresar cada uno de los datos y asi mismo deberan de entregar el diagrama de clases hecho en star uml aplicando la herencia correspondiente y el programa
        */
        do{
        System.out.println("Lee las opciones y escoje tu animalito ");
        System.out.println(" 1 perro ");
        System.out.println(" 2 gato ");
        System.out.println(" 3 Hamster");
        System.out.println(" 4 Conejo ");
        System.out.println(" 5 Cuyo ");
        System.out.println(" 6 Uron ");
        System.out.println(" 7 Sorpresa ");
        System.out.println("Digita tu opcion ");
        op = entrada.nextInt();

        switch(op){
            case 1:
            do{
            dog.mostrarPerro();
            System.out.println("deseas repetir la lista de animales ?");
        System.out.println("1 si ");
        System.out.println(" 2 no ");
        op1 = entrada.nextInt();
        }while(op1 != 2); 
            break;

            case 2:
            do{
            cat.mostrarGato();
            System.out.println("deseas repetir la lista de animales ?");
             System.out.println("1 si ");
            System.out.println(" 2 no ");
             op1 = entrada.nextInt();
              }while(op1 != 2); 
            break;

            case 3:
            do{
            reou.mostrarHamster();
            System.out.println("deseas repetir la lista de animales ?");
            System.out.println("1 si ");
             System.out.println(" 2 no ");
            op1 = entrada.nextInt();
            }while(op1 != 2); 
            break;

            case 4:
            do{
            bad.mostrarConejo();
             System.out.println("deseas repetir la lista de animales ?");
             System.out.println("1 si ");
             System.out.println(" 2 no ");
             op1 = entrada.nextInt();
             }while(op1 != 2); 
            break;

            case 5:
            do{
            nose.mostrarCuyo();
            System.out.println("deseas repetir la lista de animales ?");
            System.out.println("1 si ");
            System.out.println(" 2 no ");
            op1 = entrada.nextInt();
            }while(op1 != 2); 
            break;

            case 6:
            do{
            risa.mostrarUron();
            System.out.println("deseas repetir la lista de animales ?");
            System.out.println("1 si ");
            System.out.println(" 2 no ");
            op1 = entrada.nextInt();
            }while(op1 != 2); 
            break;

            case 7:do{
            gluglu.mostrarPez();
            System.out.println("deseas repetir la lista de animales ?");
            System.out.println("1 si ");
            System.out.println(" 2 no ");
            op1 = entrada.nextInt();
            }while(op1 != 2); 
            break;
        }
        System.out.println("deseas repetir la lista de animales ?");
        System.out.println("1 si ");
        System.out.println(" 2 no ");
        op2 = entrada.nextInt();
        

        }while(op2 != 2); 
    }    
}