
package Cajero;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class Transacciones extends JFrame{
    private JLabel lbltitulotrans;
    private JButton btnsaldo;
    private JButton btntransferencia;
    private JButton btntransferencialibre;
    private JButton btnreimpresion;
    private JButton btngraficapie;
    private JButton btngraficabarra;
    private JButton btnretiro;
    private JButton btnsalir;
    private JPanel panel;

    public Transacciones() {
        setSize(600, 600);
        setTitle("Transacciones");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        Container contenedortrans = getContentPane();
        this.setLocationRelativeTo(null);
        
        
        lbltitulotrans = new JLabel ();
        lbltitulotrans.setText("Transacciones");
        lbltitulotrans.setBounds(new Rectangle(250, 20, 250, 20));
        lbltitulotrans.setFont(new Font("Letter Gothic Std",Font.BOLD,20));
        
        btnretiro = new JButton ();
        btnretiro.setText("Retiro");
        btnretiro.setBounds(new Rectangle(180, 60, 250, 30));
        btnretiro.addActionListener((ActionEvent e) -> {
            Retiro ret = new Retiro();
            ret.setVisible(true);
            this.setVisible(false);
        });
        
        btnsaldo = new JButton ();
        btnsaldo.setText("Consulta de Saldo");
        btnsaldo.setBounds(new Rectangle(180, 120, 250, 30));
        btnsaldo.addActionListener((ActionEvent e) -> {
            Saldo sal = new Saldo();
            sal.setVisible(true);
            this.setVisible(false);
        });
        btntransferencia = new JButton ();
        btntransferencia.setText("Transferencia entre estudiantes");
        btntransferencia.setBounds(new Rectangle(180, 180, 250, 30));
        btntransferencia.addActionListener((ActionEvent e) -> {
            Transferencia trans1 = new Transferencia();
            trans1.setVisible(true);
            this.setVisible(false);
        });
        
        btntransferencialibre = new JButton ();
        btntransferencialibre.setText("Transferencia Libre");
        btntransferencialibre.setBounds(new Rectangle(180, 240, 250, 30));
        btntransferencialibre.addActionListener((ActionEvent e) -> {
            Transferencialibre trans2 = new Transferencialibre();
            trans2.setVisible(true);
            this.setVisible(false);
        });
        
        btnreimpresion = new JButton ();
        btnreimpresion.setText("Re-impresiòn");
        btnreimpresion.setBounds(new Rectangle(180, 300, 250, 30));
        
        btngraficapie = new JButton ();
        btngraficapie.setText("Grafica de Pie");
        btngraficapie.setBounds(new Rectangle(180, 360, 250, 30));
        
        btngraficabarra = new JButton ();
        btngraficabarra.setText("Grafica de Barra");
        btngraficabarra.setBounds(new Rectangle(180, 420, 250, 30));
        
        btnsalir = new JButton ();
        btnsalir.setText("Salir");
        btnsalir.setBounds(new Rectangle(250, 480 , 100, 30));
        btnsalir.addActionListener((ActionEvent e) -> {
            Login inicio = new Login();
            inicio.setVisible(true);
            this.setVisible(false);
        });
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.setBackground(Color.LIGHT_GRAY);
        
        panel.add(lbltitulotrans);
        panel.add(btnretiro);
        panel.add(btnsaldo);
        panel.add(btntransferencia);
        panel.add(btntransferencialibre);
        panel.add(btnreimpresion);
        panel.add(btngraficapie);
        panel.add(btngraficabarra);
        panel.add(btnsalir);
        contenedortrans.add(panel);
    }    
}
