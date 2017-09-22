
package Cajero;

import java.awt.Color;
import java.awt.Container;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class Retiro extends JFrame {
    private JLabel    titulo1;
    private JLabel    nombre;
    private JLabel    mostrarnombre;
    private JLabel    elegirmonto;
    private JButton   btncien;
    private JButton   btndoscientos;
    private JButton   btnquinientos;
    private JButton   btnmil;
    private JButton   btndosmil;
    private JButton   btnsalir;
    private JPanel    panel5;

    public Retiro() {
        setSize(500, 500);
        setTitle("Retiros");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        Container contenedortrans = getContentPane();
        this.setLocationRelativeTo(null);
        
        titulo1 = new JLabel();
        titulo1.setText("Retiro de Efectivo");
        titulo1.setBounds(new Rectangle(200, 10, 260, 20));
        
        nombre = new JLabel();
        nombre.setText("Nombre:");
        nombre.setBounds(new Rectangle(140, 40, 260, 20));
       
        mostrarnombre = new JLabel();
        mostrarnombre.setText("");
        mostrarnombre.setBounds(new Rectangle(200, 40, 260, 20));
        
        elegirmonto = new JLabel();
        elegirmonto.setText("Seleccione una Cantidad a Retirar");
        elegirmonto.setBounds(new Rectangle(150, 90, 250, 20));
        
        btncien = new JButton ();
        btncien.setText("Q100.00");
        btncien.setBounds(new Rectangle(150, 170, 200, 20));
        
        btndoscientos = new JButton ();
        btndoscientos.setText("Q200.00");
        btndoscientos.setBounds(new Rectangle(150, 210, 200, 20));
        
        btnquinientos = new JButton ();
        btnquinientos.setText("Q500.00");
        btnquinientos.setBounds(new Rectangle(150, 250, 200, 20));
        
        btnmil = new JButton ();
        btnmil.setText("Q1000.00");
        btnmil.setBounds(new Rectangle(150, 290, 200, 20));
        
        btndosmil = new JButton ();
        btndosmil.setText("Q2000.00");
        btndosmil.setBounds(new Rectangle(150, 330, 200, 20));
        
        btnsalir = new JButton ();
        btnsalir.setText("Salir");
        btnsalir.setBounds(new Rectangle(200, 400 , 100, 30));
        btnsalir.addActionListener((ActionEvent e) -> {
            Login inicio = new Login();
            inicio.setVisible(true);
            this.setVisible(false);
        });
        
        panel5 = new JPanel();
        panel5.setLayout(null);
        panel5.setBackground(Color.LIGHT_GRAY);
        
        panel5.add(titulo1);
        panel5.add(nombre);
        panel5.add(mostrarnombre);
        panel5.add(elegirmonto);
        panel5.add(btncien);
        panel5.add(btndoscientos);
        panel5.add(btnquinientos);
        panel5.add(btnmil);
        panel5.add(btndosmil);
        panel5.add(btnsalir);
        contenedortrans.add(panel5);
        
    }
    
    
    
}
