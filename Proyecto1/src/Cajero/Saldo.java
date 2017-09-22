package Cajero;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Saldo extends JFrame {
    private JLabel lbltitulo;
    private JLabel lblnombre;
    private JLabel lblmostrarnombre;
    private JLabel lblsaldo;
    private JLabel lblmostrarsaldo;
    private JLabel lblfecha;
    private JLabel lblmostrarfecha;
    private JLabel lblhora;
    private JLabel lblmostrarhora;
    private JButton btnsalir;
    private JPanel panel2;
    
    public static String Fecha(){
        Date fecha = new Date();
        SimpleDateFormat formatofecha = new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }

    public Saldo() {
        setSize(400, 400);
        setTitle("Consulta de Saldo");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        Container contenedorsaldo = getContentPane();
        this.setLocationRelativeTo(null);
        
        Calendar calendario = Calendar.getInstance();
        String hora;
        hora = calendario.get(Calendar.HOUR_OF_DAY)+":"+calendario.get(Calendar.MINUTE)+":"+calendario.get(Calendar.SECOND);
        
        lbltitulo = new JLabel();
        lbltitulo.setText("Saldo Actual");
        lbltitulo.setBounds(new Rectangle(150, 10, 200, 20));
        lbltitulo.setFont(new Font("Letter Gothic Std",Font.BOLD,18));
        
        /*lblnombre = new JLabel();
        lblnombre.setText("Nombre");
        lblnombre.setBounds(new Rectangle(50, 50, 250, 20));*/
        
        /*lblmostrarnombre = new JLabel();
        lblmostrarnombre.setText("-------------");
        lblmostrarnombre.setBounds(new Rectangle(200, 50, 250, 20));*/

        lblsaldo = new JLabel();
        lblsaldo.setText("Saldo de la Cuenta");
        lblsaldo.setBounds(new Rectangle(50, 90, 250, 20));
        
        lblmostrarsaldo = new JLabel();
        lblmostrarsaldo.setText("Q----------");
        lblmostrarsaldo.setBounds(new Rectangle(200, 90, 250, 20));

        lblfecha = new JLabel();
        lblfecha.setText("Fecha");
        lblfecha.setBounds(new Rectangle(50, 130, 250, 20));

        lblmostrarfecha = new JLabel();
        lblmostrarfecha.setText(Fecha());
        lblmostrarfecha.setBounds(new Rectangle(200, 130, 250, 20));

        lblhora = new JLabel();
        lblhora.setText("Hora");
        lblhora.setBounds(new Rectangle(50, 170, 250, 20));

        lblmostrarhora = new JLabel();
        lblmostrarhora.setText(hora);
        lblmostrarhora.setBounds(new Rectangle(200, 170, 250, 20));
        
        btnsalir = new JButton ();
        btnsalir.setText("Salir");
        btnsalir.setBounds(new Rectangle(180, 200, 100, 30));
        btnsalir.addActionListener((ActionEvent e) -> {
            Login inicio = new Login();
            inicio.setVisible(true);
            this.setVisible(false);
        });
        
        panel2 = new JPanel();
        panel2.setLayout(null);
        panel2.setBackground(Color.LIGHT_GRAY);
        
        panel2.add(lbltitulo);
        //panel2.add(lblnombre);
        //panel2.add(lblmostrarnombre);
        panel2.add(lblsaldo);
        panel2.add(lblmostrarsaldo);
        panel2.add(lblfecha);
        panel2.add(lblmostrarfecha);
        panel2.add(lblhora);
        panel2.add(lblmostrarhora);
        panel2.add(btnsalir);
        contenedorsaldo.add(panel2);
        
        
    }

}
