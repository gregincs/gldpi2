package view;

import java.awt.Color;
import java.awt.Font;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.annotations.XYPointerAnnotation;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYSeries;
import org.jfree.ui.TextAnchor;

/**
 *
 * @author itallorossi
 */
public class PatternChart extends javax.swing.JPanel {

    JFreeChart chart;
    ChartPanel myChartPanel;
    ValueAxis xAxis;
    public TimeSeries series;
    int state = 0;

    /**
     * Creates new form CharPanel
     */
    public PatternChart(int x, int y) {
        initComponents();
        setSize(x, y);
    }

    public void criaGrafico() {
        this.series = new TimeSeries("kWh", Millisecond.class);
        TimeSeriesCollection dataset = new TimeSeriesCollection(this.series);

        chart = ChartFactory.createTimeSeriesChart("Curva de Carga", "Hora", "Potência Ativa (kWh)", dataset, true, true, false);

        XYPlot xyplot = (XYPlot) chart.getPlot();
        xyplot.setBackgroundPaint(Color.lightGray);
        xyplot.setForegroundAlpha(0.65F);
        xyplot.setDomainGridlinePaint(Color.white);
        xyplot.setRangeGridlinePaint(Color.white);

        xAxis = xyplot.getDomainAxis();

        xAxis.setTickMarkPaint(Color.black);
        xAxis.setRange(0, 86400000); // 24 horas = 86400000 mili
        xAxis.setAutoRange(true);
        xAxis.setFixedAutoRange(60000.0);

        ValueAxis yAxis = xyplot.getRangeAxis();
        yAxis.setRange(0, 6);
        yAxis.setAutoRange(true);

        XYPointerAnnotation xypointerannotation = new XYPointerAnnotation("Test", 5D, -500D, 2.3561944901923448D);
        xypointerannotation.setTipRadius(0.0D);
        xypointerannotation.setBaseRadius(35D);
        xypointerannotation.setFont(new Font("SansSerif", 0, 9));
        xypointerannotation.setPaint(Color.blue);
        xypointerannotation.setTextAnchor(TextAnchor.HALF_ASCENT_RIGHT);
        xyplot.addAnnotation(xypointerannotation);

        myChartPanel = new ChartPanel(chart, true);
        myChartPanel.setSize(this.getWidth(), this.getHeight());
        myChartPanel.setVisible(true);
        this.removeAll();
        this.add(myChartPanel);
        this.revalidate();
        this.repaint();
        state = 1;
    }

    public void changeSize(int x, int y) {
        if (state != 0) {
            myChartPanel.setSize(x, y);
            this.setSize(x, y);
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

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
