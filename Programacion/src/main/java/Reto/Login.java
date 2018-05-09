package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton registrarseButton;
    private JButton salirButton;
    private JPanel Login;
    private JButton iniciarSesionButton;


    public Login() {
        registrarseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                VentanaRegistrar registrar = new VentanaRegistrar();
            }
        });
        iniciarSesionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String Usuario = textField1.getText();
                String Contrasenia = passwordField1.getText();

                if(Usuario.equalsIgnoreCase("Admi")){

                    VentanaAdmi admi = new VentanaAdmi();


                } else{
                    System.out.println("Usuario o contraseña incorrecto");
                }
                textField1.setText("");
                passwordField1.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Login");
        frame.setContentPane(new Login().Login);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);



    }
}
