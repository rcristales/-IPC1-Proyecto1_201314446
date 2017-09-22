
package Cajero;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;


public class Transferencia extends Administrador {
    JLabel    titulo1;
    JLabel    usuario;
    JComboBox lista;
    JLabel    elegirmonto;
    JButton   btncien;
    JButton   btndoscientos;
    JButton   btnquinientos;
    JButton   btnmil;
    JButton   btndosmil;
    JButton   btnsalir;
    JPanel    panel3;

    public Transferencia() {
        setSize(500, 500);
        setTitle("Transferencia");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        Container contenedortrans = getContentPane();
        this.setLocationRelativeTo(null);
        
        titulo1 = new JLabel();
        titulo1.setText("Modulo de Transferencias");
        titulo1.setBounds(new Rectangle(150, 10, 400, 20));
        titulo1.setFont(new Font("Letter Gothic Std",Font.BOLD,20));
        
        usuario = new JLabel();
        usuario.setText("Seleccione Usuario a Transferir");
        usuario.setBounds(new Rectangle(30, 60, 250, 20));
        usuario.setFont(new Font("Letter Gothic Std",Font.BOLD,13));
        
        lista = new JComboBox();
        lista.setBounds(new Rectangle(240, 60, 250, 20));
        lista.addItem(user2[0]);
        lista.addItem(user3[0]);
        lista.addItem(user4[0]);
        lista.addItem(user5[0]);
        lista.addItem(user1[0]);
        add(lista);
        
        elegirmonto = new JLabel();
        elegirmonto.setText("Seleccione un Valor a Transferir");
        elegirmonto.setBounds(new Rectangle(110, 130, 300, 20));
        elegirmonto.setFont(new Font("Letter Gothic Std",Font.BOLD,18));
        
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
        
        panel3 = new JPanel();
        panel3.setLayout(null);
        panel3.setBackground(Color.LIGHT_GRAY);
        
        panel3.add(titulo1);
        panel3.add(usuario);
        panel3.add(lista);
        panel3.add(elegirmonto);
        panel3.add(btncien);
        panel3.add(btndoscientos);
        panel3.add(btnquinientos);
        panel3.add(btnmil);
        panel3.add(btndosmil);
        panel3.add(btnsalir);
        contenedortrans.add(panel3);
        
    }
    
    
}
