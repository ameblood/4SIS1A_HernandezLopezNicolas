
import javax.swing.*;
public class Ventana {
    public static void main(String[] arg){
        /*vamos a la teoria que feo */


        JFrame ventana = new JFrame("hola mundo");

        //hay que definir el tamaño de la ventana 
        ventana.setSize(400,150);
        //vamos a definir sus acciones de la ventana,boton de cerrado
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //necesito el panel para poder incorporar componentes 
        JPanel panel = new JPanel();
        //tenemos quw agregarlo a la ventana 
        ventana.add(panel);
        //vamos agregar componentes a ese panel
        agregarComponentes(panel);
        ventana.setVisible(true);
    }
    

    private static void agregarComponentes(JPanel panel){
        //primero se debe de inicializar el panel 
        panel.setLayout(null);
        //agrego compoentes
        JLabel userLabel = new JLabel("nombre de usuario");
        /*para inicializar y definir el tamaño,orientacion y elento */

        userLabel.setBounds(10,10,120,50);
        //lo agregamos al panel
        panel.add(userLabel);
        //campo de texto
        JTextField usertext = new JTextField(20);
        usertext.setBounds(160,20,160,25);
        panel.add(usertext);
        
        JLabel userpassword = new JLabel("password");
        userpassword.setBounds(10, 40, 80, 40);
        panel.add(userpassword);


    }
}
