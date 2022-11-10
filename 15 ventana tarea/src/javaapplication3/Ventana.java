/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author adria
 */
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ventana extends JFrame {

    private JPanel mainPanel;
    private JTextField userBox;
    private JPasswordField passBox;

    public Ventana() {
        this.setTitle("");
        this.setSize(400, 300);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        iniciarComponentes();

    }

    
    private void iniciarComponentes() {
        colocarPaneles();
        colocarBotones();
        colocarEtiquetas();
        
       

    }

    private void colocarPaneles() {
        mainPanel = new JPanel();
        mainPanel.setLayout(null);
        this.getContentPane().add(mainPanel); 

    }

    private void colocarBotones() {

        userBox = new JTextField();
        passBox = new JPasswordField();

        //Boton de salir
        JButton registroButton = new JButton("Registrarse");
        registroButton.setBounds(180, 80, 120, 30);
        registroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                    JOptionPane.showMessageDialog(null, "fue mucho para mi");
                System.exit(5);
            
                
            }
        });
        mainPanel.add(registroButton);

     

        JButton loginButton = new JButton("iniciar Sesion");
        loginButton.setBounds(10, 80, 120, 25);
        mainPanel.add(loginButton);

        ActionListener userLoginButton = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String usuarioUser = "Nicolas";
                String usuarioPass = "Hernandez";

                if (usuarioUser.equals(userBox.getText())) {
                    String contrasena = "";

                    for (int i = 0; i < passBox.getPassword().length; i++) {
                        contrasena += passBox.getPassword()[i];
                    }

                    if (usuarioPass.equals(contrasena)) {
                        JOptionPane.showMessageDialog(null, "Bienvenido parse");
                    } else {
                        JOptionPane.showMessageDialog(null, "Contraseña incorrecta");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "no te has registrado UwU");
                }


            }
        };

        loginButton.addActionListener(userLoginButton);
    }

    private void colocarEtiquetas() {

        


        //Etiqueta de usuario y contraseña
        JLabel userLabel = new JLabel("Usuario");
        userLabel.setBounds(10, 10, 120, 50);
        mainPanel.add(userLabel);
       
        userBox.setBounds(160, 20, 160, 25);
        mainPanel.add(userBox);

        JLabel userPass = new JLabel("Contraseña");
        userPass.setBounds(10, 40, 80, 50);
        mainPanel.add(userPass);
        passBox.setBounds(160, 50, 160, 25);
        mainPanel.add(passBox);

    }
}

   
    
