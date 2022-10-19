
import javax.swing.JOptionPane;

public class Datos {
    Estudiante obj[] = new Estudiante[10];
    int x = 0;

    void menu(){
        String var="si";
        String mensaje="";
        while(var.equalsIgnoreCase("si"));
        int op=Integer.parseInt(JOptionPane.showInputDialog("ingrese la opcion deseada: \n"+ "1 dar de alta a un numevo estudiante \n"+"2  mostra"));
        switch(op){

            case 1:
            pedirEstudiante(){

            }
            break;
            case 2:
            mostrarEstudiante(){

            }
            break;
            default:
            JOptionPane.showMessageDialog(null, "opcion no valida");
        }
        mensaje=JOptionPane.showInputDialog(null,"desea repetir");
    }

    public void pedirEstudiante(){
        String nom=JOptionPane.showIn

    }

}
