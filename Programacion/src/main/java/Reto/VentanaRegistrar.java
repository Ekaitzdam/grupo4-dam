package Reto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaRegistrar {
    private JTextField textUsuario;
    private JTextField textNombre;
    private JTextField textEmail;
    private JPasswordField passwordPass;
    private JButton registrarseButton;
    private JButton atrasButton;
    private JPanel VentanaRegistrar;
    private JPasswordField passwordConfirPass;


    public VentanaRegistrar() {
        JFrame frame = new JFrame("VentanaRegistrar");
        frame.setContentPane(VentanaRegistrar);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.getRootPane().setDefaultButton(registrarseButton);
        frame.setVisible(true);
        atrasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
        registrarseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                String usuario = textUsuario.getText();
                String nombre = textNombre.getText();
                String email = textEmail.getText();
                String pass = new String(passwordPass.getPassword());
                String confirPass = new String(passwordConfirPass.getPassword());

                textUsuario.setText("");
                textNombre.setText("");
                textEmail.setText("");
                passwordPass.setText("");
                passwordConfirPass.setText("");

                if(!confirPass.equalsIgnoreCase(pass)){
                    JOptionPane.showMessageDialog(null,"La contraseña no coincide");

                }
            }
        });
    }
}
