package Cajero;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Login extends Administrador {

    private JLabel lblencabezado;
    private JLabel lblusuario;
    private JLabel lblcontraseña;
    private JTextField txtusuario;
    private JPasswordField contraseña;
    private JButton btningresar;
    private JButton btncancelar;
    private JPanel panel;
    private String usuarioadmin;
    private String contraseñaadmin;

    private void datos(String Us, String pass) {
        usuarioadmin = "ipc1Admin";
        contraseñaadmin = "aux1";

    }

    public Login() {
        setSize(350, 300);
        setTitle("Login");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        Container contenedor = getContentPane();
        this.setLocationRelativeTo(null);

        //panel.setLayout(null);
        lblencabezado = new JLabel();
        lblencabezado.setText("INICIAR SESIÓN");
        lblencabezado.setBounds(100, 0, 300, 50);
        lblencabezado.setFont(new Font("Letter Gothic Std",Font.BOLD,18));
        

        lblusuario = new JLabel();
        lblusuario.setText("Usuario");
        lblusuario.setBounds(70, 60, 100, 40);
        lblusuario.setFont(new Font("Letter Gothic Std",Font.BOLD,14));

        txtusuario = new JTextField();
        txtusuario.setText("");
        txtusuario.setBounds(170, 70, 100, 20);

        lblcontraseña = new JLabel();
        lblcontraseña.setText("Contraseña");
        lblcontraseña.setBounds(new Rectangle(70, 110, 100, 20));
        lblcontraseña.setFont(new Font("Letter Gothic Std",Font.BOLD,14));

        contraseña = new JPasswordField();
        contraseña.setText("");
        contraseña.setBounds(170, 110, 100, 20);

        btncancelar = new JButton();
        btncancelar.setText("Cancelar");
        btncancelar.setBounds(50, 180, 100, 40);
        btncancelar.addActionListener((ActionEvent e) -> {
            System.exit(0);
        });

        btningresar = new JButton();
        btningresar.setText("Ingresar");
        btningresar.setBounds(180, 180, 100, 40);
        btningresar.addActionListener((ActionEvent e) -> {
            datos(usuarioadmin, contraseñaadmin);

            if (usuarioadmin.equals(txtusuario.getText()) && contraseñaadmin.equals(contraseña.getText())) {
                Administrador admin1 = new Administrador();
                admin1.setVisible(true);
                this.setVisible(false);
            } else if (user1[1].equals(txtusuario.getText()) && user1[2].equals(contraseña.getText())) {
                Transacciones trans1 = new Transacciones();
                trans1.setVisible(true);
                this.setVisible(false);
            }/*else if (user2[1].equals(txtusuario.getText()) && user2[2].equals(contraseña.getText())) {
                Transacciones trans1 = new Transacciones();
                trans1.setVisible(true);
                this.setVisible(false);
            }else if (user3[1].equals(txtusuario.getText()) && user3[2].equals(contraseña.getText())) {
                Transacciones trans1 = new Transacciones();
                trans1.setVisible(true);
                this.setVisible(false);
            }else if (user4[1].equals(txtusuario.getText()) && user4[2].equals(contraseña.getText())) {
                Transacciones trans1 = new Transacciones();
                trans1.setVisible(true);
                this.setVisible(false);
            }else if (user5[1].equals(txtusuario.getText()) && user5[2].equals(contraseña.getText())) {
                Transacciones trans1 = new Transacciones();
                trans1.setVisible(true);
                this.setVisible(false);
            }else if (user6[1].equals(txtusuario.getText()) && user6[2].equals(contraseña.getText())) {
                Transacciones trans1 = new Transacciones();
                trans1.setVisible(true);
                this.setVisible(false);
            }else if (user7[1].equals(txtusuario.getText()) && user7[2].equals(contraseña.getText())) {
                Transacciones trans1 = new Transacciones();
                trans1.setVisible(true);
                this.setVisible(false);
            }else if (user8[1].equals(txtusuario.getText()) && user8[2].equals(contraseña.getText())) {
                Transacciones trans1 = new Transacciones();
                trans1.setVisible(true);
                this.setVisible(false);
            }else if (user9[1].equals(txtusuario.getText()) && user9[2].equals(contraseña.getText())) {
                Transacciones trans1 = new Transacciones();
                trans1.setVisible(true);
                this.setVisible(false);
            }else if (user10[1].equals(txtusuario.getText()) && user10[2].equals(contraseña.getText())) {
                Transacciones trans1 = new Transacciones();
                trans1.setVisible(true);
                this.setVisible(false);
            }*/ else {
                JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña no validos \n Ingrese de nuevo");
            }
        });

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.lightGray);
        panel.add(lblencabezado);
        panel.add(lblusuario);
        panel.add(lblcontraseña);
        panel.add(txtusuario);
        panel.add(contraseña);
        panel.add(btncancelar);
        panel.add(btningresar);
        contenedor.add(panel);

    }

}
