/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package _tests;

import controller.CostCtrl;
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import model.Cost;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.RefineryUtilities;

/**
 *
 * @author Matheus
 */
public class CostPanel extends javax.swing.JPanel {
    private static final long serialVersionUID = 1L;
    
    public TimeSeries series;
    public JFreeChart result;
    public ChartPanel myChartPanel;
    int state;

    /**
     * Creates new form CostPanel
     */
    public CostPanel(int x, int y) {
        initComponents();
        setSize(x, y);
        
}   
    
    public void criarGrafico(){
        series = new TimeSeries("R$/kWh", Millisecond.class);
        final TimeSeriesCollection dataset = new TimeSeriesCollection(series);
                       
        result = ChartFactory.createTimeSeriesChart("Gráfico de Custo","Hora", "Valor em Real (R$)",dataset,true,true,false);
        final XYPlot plot = result.getXYPlot();
        ValueAxis axis = plot.getDomainAxis();
        axis.setAutoRange(true);
        axis.setFixedAutoRange(60000.0);  // 60 seconds
        axis = plot.getRangeAxis();
        axis.setRange(0.0, 100.0);
        
        myChartPanel = new ChartPanel(result, true);
        myChartPanel.setSize(this.getWidth(), this.getHeight());
        myChartPanel.setVisible(true);
        this.removeAll();
        this.add(myChartPanel);
        this.revalidate();
        this.repaint();
        state = 1;
        
        state = 1;
    }

    public void changeSize(int width, int height){
        if(state==1){
            myChartPanel.setSize(width, height);
            this.setSize(width, height);
        }
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
