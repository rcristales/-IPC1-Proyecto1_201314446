
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
import javax.swing.JTextField;
import javax.swing.WindowConstants;

/**
 *
 * @author Robert Cristales
 */
public class Transferencialibre extends Administrador {

    private JLabel lbltitulo1;
    private JLabel lblusuario;
    private JComboBox lista;
    private JLabel ingresarmonto;
    private JTextField txtingresarmonto;
    private JButton btnconfirmar;
    private JButton btnsalir; 
    JPanel panel4;

    public Transferencialibre() {
        setSize(500, 500);
        setTitle("Transferencia Libre");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        Container contenedortranslibre = getContentPane();
        this.setLocationRelativeTo(null);
        
        lbltitulo1 = new JLabel();
        lbltitulo1.setText("Modulo de Transferencias Libres");
        lbltitulo1.setBounds(new Rectangle(100, 10, 350, 20));
        lbltitulo1.setFont(new Font("Letter Gothic Std",Font.BOLD,20));

        lblusuario = new JLabel();
        lblusuario.setText("Seleccione Usuario a Transferir");
        lblusuario.setBounds(new Rectangle(30, 60, 250, 20));
        lblusuario.setFont(new Font("Letter Gothic Std",Font.BOLD,13));

        lista = new JComboBox();
        lista.setBounds(new Rectangle(240, 60, 250, 20));
        lista.addItem(user2[0]);
        lista.addItem(user3[0]);
        lista.addItem(user4[0]);
        lista.addItem(user5[0]);
        lista.addItem(user1[0]);
        add(lista);

        ingresarmonto = new JLabel();
        ingresarmonto.setText("Ingrese Monto a Transferir Q.");
        ingresarmonto.setBounds(new Rectangle(170, 110, 250, 20));
        ingresarmonto.setFont(new Font("Letter Gothic Std",Font.BOLD,13));

        txtingresarmonto = new JTextField();
        txtingresarmonto.setText("");
        txtingresarmonto.setBounds(new Rectangle(200, 160, 100, 20));

        btnconfirmar = new JButton();
        btnconfirmar.setText("Confirmar");
        btnconfirmar.setBounds(new Rectangle(200, 210, 100, 20));
        
        btnsalir = new JButton ();
        btnsalir.setText("Salir");
        btnsalir.setBounds(new Rectangle(200, 400 , 100, 30));
        btnsalir.addActionListener((ActionEvent e) -> {
            Login inicio = new Login();
            inicio.setVisible(true);
            this.setVisible(false);
        });

        panel4 = new JPanel();
        panel4.setLayout(null);
        panel4.setBackground(Color.LIGHT_GRAY);

        panel4.add(lbltitulo1);
        panel4.add(lblusuario);
        panel4.add(lista);
        panel4.add(ingresarmonto);
        panel4.add(txtingresarmonto);
        panel4.add(btnconfirmar);
        panel4.add(btnsalir);
        contenedortranslibre.add(panel4);

    }

}
