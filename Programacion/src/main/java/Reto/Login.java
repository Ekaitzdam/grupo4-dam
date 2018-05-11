package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton registrarseButton;
    private JButton salirButton;
    private JPanel panelLogin;
    private JButton iniciarSesionButton;


    public Login() {
        final JFrame frame = new JFrame("panelLogin");
        frame.setContentPane(panelLogin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.getRootPane().setDefaultButton(iniciarSesionButton);
        frame.setVisible(true);

        registrarseButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                VentanaRegistrar registrar = new VentanaRegistrar();


            }
        });
        iniciarSesionButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String Usuario = textField1.getText();
                String Contrasenia = new String(passwordField1.getPassword());

                if(Usuario.equalsIgnoreCase("Admi")){

                    VentanaAdmi admi = new VentanaAdmi();
                    frame.dispose();

                } else{
                    System.out.println("Usuario o contraseña incorrecto");
                }
                textField1.setText("");
                passwordField1.setText("");
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();

            }
        });
    }

    public static void main(String[] args) {
        Reto.Login login = new Login();



    }
}
