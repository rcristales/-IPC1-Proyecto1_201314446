package Cajero;

import static Cajero.Administrador.user1;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Retiro extends JFrame {

    private JLabel titulo1;
    private JLabel nombre;
    private JLabel mostrarnombre;
    private JLabel elegirmonto;
    private JButton btncien;
    private JButton btndoscientos;
    private JButton btnquinientos;
    private JButton btnmil;
    private JButton btndosmil;
    private JButton btnconfirmar;
    private JLabel lblconfirmar;
    private JButton btnsalir;
    private JPanel panel5;
    private int cantidad =0 ;
    private int cantidad1=0;

    public Retiro() {
        setSize(500, 500);
        setTitle("Retiros");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        Container contenedortrans = getContentPane();
        this.setLocationRelativeTo(null);

        titulo1 = new JLabel();
        titulo1.setText("Retiro de Efectivo");
        titulo1.setBounds(new Rectangle(180, 10, 260, 20));
        titulo1.setFont(new Font("Letter Gothic Std",Font.BOLD,18));

        /*nombre = new JLabel();
        nombre.setText("Nombre:");
        nombre.setBounds(new Rectangle(140, 40, 260, 20));

        mostrarnombre = new JLabel();
        mostrarnombre.setText("");
        mostrarnombre.setBounds(new Rectangle(200, 40, 260, 20));*/

        elegirmonto = new JLabel();
        elegirmonto.setText("Seleccione una Cantidad a Retirar");
        elegirmonto.setBounds(new Rectangle(150, 40, 250, 20));

        btncien = new JButton();
        btncien.setText("Q100.00");
        btncien.setBounds(new Rectangle(150, 90, 200, 20));
        btncien.addActionListener((ActionEvent e) -> {
            cantidad = cantidad + 100;

        });

        btndoscientos = new JButton();
        btndoscientos.setText("Q200.00");
        btndoscientos.setBounds(new Rectangle(150, 130, 200, 20));
        btndoscientos.addActionListener((ActionEvent e) -> {
            cantidad =cantidad + 200;

        });

        btnquinientos = new JButton();
        btnquinientos.setText("Q500.00");
        btnquinientos.setBounds(new Rectangle(150, 170, 200, 20));
        btnquinientos.addActionListener((ActionEvent e) -> {
            cantidad = cantidad + 500;

        });

        btnmil = new JButton();
        btnmil.setText("Q1000.00");
        btnmil.setBounds(new Rectangle(150, 210, 200, 20));
        btnmil.addActionListener((ActionEvent e) -> {
            cantidad = cantidad + 1000;

        });

        btndosmil = new JButton();
        btndosmil.setText("Q2000.00");
        btndosmil.setBounds(new Rectangle(150, 250, 200, 20));
        btncien.addActionListener((ActionEvent e) -> {
            cantidad = cantidad + 2000;

        });

        lblconfirmar = new JLabel();
        lblconfirmar.setText("Q." + cantidad +"");
        lblconfirmar.setBounds(new Rectangle(250, 290, 100, 20));

        btnconfirmar = new JButton();
        btnconfirmar.setText("Confirmar");
        btnconfirmar.setBounds(new Rectangle(200, 330, 100, 30));
        btnconfirmar.addActionListener((ActionEvent e) -> {
            cantidad1 = Integer.parseInt(user1[3]);
            if (cantidad < cantidad1) {
                cantidad1 = cantidad1 - cantidad;
                user1[3] = cantidad1 + "";
                Retiro re = new Retiro();
                re.recibo();

            } else {
                JOptionPane.showMessageDialog(this, "Su Saldo es Insuficiente para el Retiro \n Ingrese de Nuevo y vuelva a intentarlo");
                Login inicio = new Login();
                inicio.setVisible(true);
                this.setVisible(false);
            }

        });

        btnsalir = new JButton();
        btnsalir.setText("Salir");
        btnsalir.setBounds(new Rectangle(200, 400, 100, 30));
        btnsalir.addActionListener((ActionEvent e) -> {
            Login inicio = new Login();
            inicio.setVisible(true);
            this.setVisible(false);
        });

        panel5 = new JPanel();
        panel5.setLayout(null);
        panel5.setBackground(Color.LIGHT_GRAY);

        panel5.add(titulo1);
        //panel5.add(nombre);
        //panel5.add(mostrarnombre);
        panel5.add(elegirmonto);
        panel5.add(btncien);
        panel5.add(btndoscientos);
        panel5.add(btnquinientos);
        panel5.add(btnmil);
        panel5.add(btndosmil);
        panel5.add(lblconfirmar);
        panel5.add(btnconfirmar);
        panel5.add(btnsalir);
        contenedortrans.add(panel5);

    }

    public void recibo() {
        try {
            File archivo = new File("Transaccion.html");
            FileWriter Recibo = new FileWriter(archivo, true);
            PrintWriter Formato = new PrintWriter(archivo);
            Formato.println("html>");
            Formato.println("<Head>");
            Formato.println("<title>Transaccion:</title>");
            Formato.println("/<Head>");
            Formato.println(" <h1><center>Gracias por su retiro, se le ha entregado:</center></h1>");
            Formato.println("<h2> Billetes de 200 = " + 0 + "</h2>");
            Formato.println("<h2> Billetes de 100 = " + cantidad + "</h2>");
            Formato.println(" </body>");
            Formato.println("</html>");

//nos aseguramos de cerrar el archivo
            Formato.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
