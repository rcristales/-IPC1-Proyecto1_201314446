package Cajero;

import javax.swing.JFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.*;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Grafica extends JFrame {

    private JFreeChart Grafica;
    DefaultCategoryDataset datos = new DefaultCategoryDataset();

    public Grafica() {

        datos.addValue(2, "Julio", "Retiros");
        datos.addValue(3, "Julio", "Consultas");
        datos.addValue(4, "Julio", "Transferencias");
        datos.addValue(3, "Agosto", "Retiros");
        datos.addValue(1, "Agosto", "Consultas");
        datos.addValue(2, "Agosto", "Transferencias");
        datos.addValue(4, "Septiembre", "Retiros");
        datos.addValue(2, "Septiembre", "Consultas");
        datos.addValue(1, "Septiembre", "Transferencias");

        Grafica = ChartFactory.createBarChart("Transacciones por Mes", "Tipo de Transacción", "Cantidad de Transacciones", datos, PlotOrientation.VERTICAL, true, true, false);

        ChartPanel panel = new ChartPanel(Grafica);

        JFrame ventana = new JFrame("Grafica");
        ventana.getContentPane().add(panel);
        ventana.pack();
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLocationRelativeTo(null);

    }

}
