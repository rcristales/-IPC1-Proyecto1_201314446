package Cajero;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Administrador extends JFrame {

    private JLabel lbltitulo;
    private JLabel lblnuevo;
    private JLabel lblnombrenuevo;
    private JLabel lblusuarionuevo;
    private JLabel lblcontraseñanuevo;
    private JLabel lblconfcontraseñanuevo;
    private JPasswordField txtconfcontraseñanuevo;
    private JLabel lblsaldoinicial;
    private JLabel lblempresaatiende;
    private JLabel lblmontomaximo;
    private JTextField txtnombrenuevo;
    private JTextField txtusuarionuevo;
    private JPasswordField txtcontraseñanuevo;
    private JTextField txtsaldoinicial;
    private JTextField txtempresaatiende;
    private JTextField txtmontomaximo;
    private JButton btnguardar;
    private JPanel panel;
    private String nombre;
    private String usuario;
    private String contraseña;
    private String saldoinicial;
    private String empresa;
    private String monto;
    private String confcontraseña;
    
    public static String user1[] = new String[6];
    public static String user2[] = new String[6];
    public static String user3[] = new String[6];
    public static String user4[] = new String[6];
    public static String user5[] = new String[6];
    public static String user6[] = new String[6];
    public static String user7[] = new String[6];
    public static String user8[] = new String[6];
    public static String user9[] = new String[6];
    public static String user10[] = new String[6];

    

    public Administrador() {
        setSize(600, 600);
        setTitle("Administrador");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        Container contenedoradmin = getContentPane();
        this.setLocationRelativeTo(null);
        
        //datos de usuarios
        user1[0]="Roberto Carlos Garcia Cristales";//posicion 0 es el nombre
        user1[1]="ipc1";//posicion 1 es el usuario
        user1[2]="aux1";//posicion 2 es la contraseña
        user1[3]="1000";//posicion 3 es el saldo inicial
        user1[4]="ProPisto";//posicion 4 es la empresa que atiende
        user1[5]="2000"; //posicion 5 es el monto maximo
        
        user2[0]="Beatriz Yesenia Rafael Ramirez";//posicion 0 es el nombre
        user2[1]="byrr";//posicion 1 es el usuario
        user2[2]="byrr123";//posicion 2 es la contraseña
        user2[3]="1000";//posicion 3 es el saldo inicial
        user2[4]="CashMoney";//posicion 4 es la empresa que atiende
        user2[5]="2000"; //posicion 5 es el monto maximo
        
        user3[0]="Luis Miguel Garcia Cristales";//posicion 0 es el nombre
        user3[1]="lmgc";//posicion 1 es el usuario
        user3[2]="lmgc123";//posicion 2 es la contraseña
        user3[3]="1000";//posicion 3 es el saldo inicial
        user3[4]="ProPisto";//posicion 4 es la empresa que atiende
        user3[5]="2000"; //posicion 5 es el monto maximo
        
        user4[0]="Rosa Elvira Cristales Ramirez";//posicion 0 es el nombre
        user4[1]="recr";//posicion 1 es el usuario
        user4[2]="recr";//posicion 2 es la contraseña
        user4[3]="1000";//posicion 3 es el saldo inicial
        user4[4]="CashMoney";//posicion 4 es la empresa que atiende
        user4[5]="2000"; //posicion 5 es el monto maximo
        
        user5[0]="Carlos Roberto Garcia Castro";//posicion 0 es el nombre
        user5[1]="crgc";//posicion 1 es el usuario
        user5[2]="crgc123";//posicion 2 es la contraseña
        user5[3]="1000";//posicion 3 es el saldo inicial
        user5[4]="ProPisto";//posicion 4 es la empresa que atiende
        user5[5]="2000"; //posicion 5 es el monto maximo
        

        lbltitulo = new JLabel();
        lbltitulo.setText("Sistema de Administraciòn");
        lbltitulo.setBounds(new Rectangle(200, 20, 300, 20));
        lbltitulo.setFont(new Font("Letter Gothic Std",Font.BOLD,19));

        lblnuevo = new JLabel();
        lblnuevo.setText("Ingreso de Nuevos Usuarios");
        lblnuevo.setBounds(new Rectangle(215, 50, 300, 20));
        lblnuevo.setFont(new Font("Letter Gothic Std",Font.BOLD,16));

        lblnombrenuevo = new JLabel();
        lblnombrenuevo.setText("Nombre");
        lblnombrenuevo.setBounds(new Rectangle(80, 90, 100, 20));
        lblnombrenuevo.setFont(new Font("Letter Gothic Std",Font.BOLD,14));

        txtnombrenuevo = new JTextField();
        txtnombrenuevo.setText("");
        txtnombrenuevo.setBounds(new Rectangle(300, 90, 200, 20));
        nombre = txtnombrenuevo.getText();

        lblusuarionuevo = new JLabel();
        lblusuarionuevo.setText("Usuario");
        lblusuarionuevo.setBounds(new Rectangle(80, 130, 100, 20));
        lblusuarionuevo.setFont(new Font("Letter Gothic Std",Font.BOLD,14));

        txtusuarionuevo = new JTextField();
        txtusuarionuevo.setText("");
        txtusuarionuevo.setBounds(new Rectangle(300, 130, 200, 20));
        usuario = txtusuarionuevo.getText();

        lblcontraseñanuevo = new JLabel();
        lblcontraseñanuevo.setText("Contraseña");
        lblcontraseñanuevo.setBounds(new Rectangle(80, 170, 100, 20));
        lblcontraseñanuevo.setFont(new Font("Letter Gothic Std",Font.BOLD,14));

        txtcontraseñanuevo = new JPasswordField();
        txtcontraseñanuevo.setText("");
        txtcontraseñanuevo.setBounds(new Rectangle(300, 170, 200, 20));
        contraseña = txtcontraseñanuevo.getText();

        lblconfcontraseñanuevo = new JLabel();
        lblconfcontraseñanuevo.setText("Confirme Contraseña");
        lblconfcontraseñanuevo.setBounds(new Rectangle(80, 210, 200, 20));
        lblconfcontraseñanuevo.setFont(new Font("Letter Gothic Std",Font.BOLD,14));
        
        txtconfcontraseñanuevo = new JPasswordField();
        txtconfcontraseñanuevo.setText("");
        txtconfcontraseñanuevo.setBounds(new Rectangle(300, 210, 200, 20));
        confcontraseña = txtcontraseñanuevo.getText();

        lblsaldoinicial = new JLabel();
        lblsaldoinicial.setText("Saldo Inicial");
        lblsaldoinicial.setBounds(new Rectangle(80, 250, 100, 20));
        lblsaldoinicial.setFont(new Font("Letter Gothic Std",Font.BOLD,14));

        txtsaldoinicial = new JTextField();
        txtsaldoinicial.setText("");
        txtsaldoinicial.setBounds(new Rectangle(300, 250, 200, 20));
        saldoinicial = txtsaldoinicial.getText();

        lblempresaatiende = new JLabel();
        lblempresaatiende.setText("Empresa que atiende");
        lblempresaatiende.setBounds(new Rectangle(80, 290, 150, 20));
        lblempresaatiende.setFont(new Font("Letter Gothic Std",Font.BOLD,14));
        
        txtempresaatiende = new JTextField();
        txtempresaatiende.setText("");
        txtempresaatiende.setBounds(new Rectangle(300, 290, 200, 20));
        empresa = txtempresaatiende.getText();

        lblmontomaximo = new JLabel();
        lblmontomaximo.setText("Monto Màximo");
        lblmontomaximo.setBounds(new Rectangle(80, 330, 150, 20));
        lblmontomaximo.setFont(new Font("Letter Gothic Std",Font.BOLD,14));
        
        txtmontomaximo = new JTextField();
        txtmontomaximo.setText("");
        txtmontomaximo.setBounds(new Rectangle(300, 330, 200, 20));
        monto = txtmontomaximo.getText();

        btnguardar = new JButton();
        btnguardar.setText("Guardar");
        btnguardar.setBounds(new Rectangle(250, 370, 100, 20));
        btnguardar.addActionListener((ActionEvent e) -> {

            //llenando los usuarios
            /*if (user1.equals("")) {
                for (int i = 0; i < user1.length; i++) {
                    user1[i] = nombre;
                    i++;
                    user1[i] = usuario;
                    i++;
                    if (contraseña.equals(confcontraseña)) {
                        user1[i] = contraseña;
                        i++;
                    } else {
                        JOptionPane.showMessageDialog(this, "Ha ingresado contraseñas diferentes  \n Ingreselas de nuevo");
                    }
                    user1[i] = saldoinicial;
                    i++;
                    user1[i] = empresa;
                    i++;
                    user1[i] = monto;

                }

            }

            if (user2.equals("")) {
                for (int i = 0; i < user2.length; i++) {
                    user2[i] = nombre;
                    i++;
                    user2[i] = usuario;
                    i++;
                    if (contraseña.equals(confcontraseña)) {
                        user2[i] = contraseña;
                        i++;
                    } else {
                        JOptionPane.showMessageDialog(this, "Ha ingresado contraseñas diferentes  \n Ingreselas de nuevo");
                    }
                    user2[i] = saldoinicial;
                    i++;
                    user2[i] = empresa;
                    i++;
                    user2[i] = monto;

                }

            }
            if (user3.equals("")) {
                for (int i = 0; i < user3.length; i++) {
                    user3[i] = nombre;
                    i++;
                    user3[i] = usuario;
                    i++;
                    if (contraseña.equals(confcontraseña)) {
                        user3[i] = contraseña;
                        i++;
                    } else {
                        JOptionPane.showMessageDialog(this, "Ha ingresado contraseñas diferentes  \n Ingreselas de nuevo");
                    }
                    user3[i] = saldoinicial;
                    i++;
                    user3[i] = empresa;
                    i++;
                    user3[i] = monto;

                }

            }
            if (user4.equals("")) {
                for (int i = 0; i < user4.length; i++) {
                    user4[i] = nombre;
                    i++;
                    user4[i] = usuario;
                    i++;
                    if (contraseña.equals(confcontraseña)) {
                        user4[i] = contraseña;
                        i++;
                    } else {
                        JOptionPane.showMessageDialog(this, "Ha ingresado contraseñas diferentes  \n Ingreselas de nuevo");
                    }
                    user4[i] = saldoinicial;
                    i++;
                    user4[i] = empresa;
                    i++;
                    user4[i] = monto;

                }

            }
            if (user5.equals("")) {
                for (int i = 0; i < user5.length; i++) {
                    user5[i] = nombre;
                    i++;
                    user5[i] = usuario;
                    i++;
                    if (contraseña.equals(confcontraseña)) {
                        user5[i] = contraseña;
                        i++;
                    } else {
                        JOptionPane.showMessageDialog(this, "Ha ingresado contraseñas diferentes  \n Ingreselas de nuevo");
                    }
                    user5[i] = saldoinicial;
                    i++;
                    user5[i] = empresa;
                    i++;
                    user5[i] = monto;

                }

            }
            if (user6.equals("")) {
                for (int i = 0; i < user6.length; i++) {
                    user6[i] = nombre;
                    i++;
                    user6[i] = usuario;
                    i++;
                    if (contraseña.equals(confcontraseña)) {
                        user6[i] = contraseña;
                        i++;
                    } else {
                        JOptionPane.showMessageDialog(this, "Ha ingresado contraseñas diferentes  \n Ingreselas de nuevo");
                    }
                    user6[i] = saldoinicial;
                    i++;
                    user6[i] = empresa;
                    i++;
                    user6[i] = monto;

                }

            }
            if (user7.equals("")) {
                for (int i = 0; i < user7.length; i++) {
                    user7[i] = nombre;
                    i++;
                    user7[i] = usuario;
                    i++;
                    if (contraseña.equals(confcontraseña)) {
                        user7[i] = contraseña;
                        i++;
                    } else {
                        JOptionPane.showMessageDialog(this, "Ha ingresado contraseñas diferentes  \n Ingreselas de nuevo");
                    }
                    user7[i] = saldoinicial;
                    i++;
                    user7[i] = empresa;
                    i++;
                    user7[i] = monto;

                }

            }
            if (user8.equals("")) {
                for (int i = 0; i < user8.length; i++) {
                    user8[i] = nombre;
                    i++;
                    user8[i] = usuario;
                    i++;
                    if (contraseña.equals(confcontraseña)) {
                        user8[i] = contraseña;
                        i++;
                    } else {
                        JOptionPane.showMessageDialog(this, "Ha ingresado contraseñas diferentes  \n Ingreselas de nuevo");
                    }
                    user8[i] = saldoinicial;
                    i++;
                    user8[i] = empresa;
                    i++;
                    user8[i] = monto;

                }

            }

            if (user9.equals("")) {
                for (int i = 0; i < user9.length; i++) {
                    user9[i] = nombre;
                    i++;
                    user9[i] = usuario;
                    i++;
                    if (contraseña.equals(confcontraseña)) {
                        user9[i] = contraseña;
                        i++;
                    } else {
                        JOptionPane.showMessageDialog(this, "Ha ingresado contraseñas diferentes  \n Ingreselas de nuevo");
                    }
                    user9[i] = saldoinicial;
                    i++;
                    user9[i] = empresa;
                    i++;
                    user9[i] = monto;

                }

            }

            if (user10.equals("")) {
                for (int i = 0; i < user10.length; i++) {
                    user10[i] = nombre;
                    i++;
                    user10[i] = usuario;
                    i++;
                   if (contraseña.equals(confcontraseña)) {
                        user10[i] = contraseña;
                        i++;
                    } else {
                        JOptionPane.showMessageDialog(this, "Ha ingresado contraseñas diferentes  \n Ingreselas de nuevo");
                    }
                    user10[i] = saldoinicial;
                    i++;
                    user10[i] = empresa;
                    i++;
                    user10[i] = monto;

                }

            }*/
            //limpiando las casillas de texto
            txtnombrenuevo.setText("");
            txtusuarionuevo.setText("");
            txtcontraseñanuevo.setText("");
            txtcontraseñanuevo.setText("");
            txtsaldoinicial.setText("");
            txtempresaatiende.setText("");
            txtmontomaximo.setText("");
        });

        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);

        panel.add(lbltitulo);
        panel.add(lblnuevo);
        panel.add(lblnombrenuevo);
        panel.add(txtnombrenuevo);
        panel.add(lblusuarionuevo);
        panel.add(txtusuarionuevo);
        panel.add(lblcontraseñanuevo);
        panel.add(txtcontraseñanuevo);
        panel.add(lblconfcontraseñanuevo);
        panel.add(txtconfcontraseñanuevo);
        panel.add(lblsaldoinicial);
        panel.add(txtsaldoinicial);
        panel.add(lblempresaatiende);
        panel.add(txtempresaatiende);
        panel.add(lblmontomaximo);
        panel.add(txtmontomaximo);
        panel.add(btnguardar);
        contenedoradmin.add(panel);
    }

}
