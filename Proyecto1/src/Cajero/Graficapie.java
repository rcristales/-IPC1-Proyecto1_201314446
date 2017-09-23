package Cajero;

import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;

public class Graficapie extends JFrame {
    
    private JFreeChart Grafica;
    DefaultPieDataset datos = new DefaultPieDataset();

    public Graficapie() {

        datos.setValue("Luis", 20);
        datos.setValue("Beatriz", 30);
        datos.setValue("Rosa",40 );
        datos.setValue("Carlos",10);

        Grafica = ChartFactory.createPieChart("Transacciones por usuario ", datos, true, true, false);

        ChartPanel panel = new ChartPanel(Grafica);

        JFrame ventana = new JFrame("Grafica por usuario");
        ventana.getContentPane().add(panel);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

    }
}
