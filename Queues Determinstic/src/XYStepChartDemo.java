import java.awt.BasicStroke;
import java.awt.Color;
import static java.awt.Color.BLACK;
import static java.awt.Color.BLUE;
import static java.awt.Color.CYAN;
import static java.awt.Color.DARK_GRAY;
import static java.awt.Color.GRAY;
import static java.awt.Color.MAGENTA;
import static java.awt.Color.RED;
import static java.awt.Color.WHITE;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.xy.XYDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;
import org.jfree.ui.RefineryUtilities;
public class XYStepChartDemo {
    private ChartFrame frame = null;

     private int[] array_nt;
    private double u;
    private double λ;
    private int k;
    private int M;
    private int length = 0;

    
    public XYStepChartDemo(double u, double λ, int k, int M) {
        this.u = u;
        this.λ = λ;
        this.k = k;
        this.M = M;
    }
 public XYStepChartDemo(double u, double λ, int k) {
        this.u = u;
        this.λ = λ;
        this.k = k;
        this.M = 0;
    }

    
    void displayChart() {
        if (this.frame == null) {

        
            final String title = "";
            final String xAxisLabel = "Time (t)";
            final String yAxisLabel = "Number of Customers n(t)";

            final XYDataset data = createStepXYDataset();

            final JFreeChart chart = ChartFactory.createXYStepChart(
                    title,
                    xAxisLabel, yAxisLabel,
                    data,
                    PlotOrientation.VERTICAL,
                    false, 
                    true, 
                    false 
            );

           
            chart.setBackgroundPaint(new Color(192,192, 192));
            final XYPlot plot = chart.getXYPlot();
            plot.getRenderer().setSeriesStroke(0, new BasicStroke(2.0f));
            plot.getRenderer().setSeriesPaint(0, BLUE);
            plot.setBackgroundPaint(GRAY  );
            plot.setDomainGridlinesVisible(true);
            plot.setDomainGridlinePaint(BLUE);
            plot.setRangeGridlinesVisible(true);
            plot.setRangeGridlinePaint(BLUE);

            NumberAxis domainAxiss = new NumberAxis(xAxisLabel);
            domainAxiss.setRange(0, 1);

            domainAxiss.setAutoRange(true);
            plot.setDomainAxis(domainAxiss);

//           
            this.frame = new ChartFrame("Deterministic Queue Graph", chart);
            this.frame.pack();
            RefineryUtilities.positionFrameRandomly(this.frame);
            this.frame.setVisible(true);

        } else {
            this.frame.setVisible(true);
            this.frame.requestFocus();
        }
    }

    
    public XYDataset createStepXYDataset() {

        final XYSeries s1 = new XYSeries("", true, true);
    
      DeterministicQ dq;

        if (M == 0) {
            dq = new DeterministicQ(u, λ, k);
            dq.get_ti();
            length = (int) (1 / λ) * 45;
            array_nt = dq.drawnt(length);
        } else {
            dq = new DeterministicQ(u, λ, k, M);
            dq.get_ti_2();
            length = (int) (1 / λ) * 45;
            array_nt = dq.drawnt_2(length);
        }
        for (int i = 0; i < array_nt.length; i++) {
           
            s1.add(i, array_nt[i]);
        }

        final XYSeriesCollection dataset = new XYSeriesCollection();
        dataset.addSeries(s1);
        return dataset;
    }

        

        
//    public static void main(final String[] args) {
//
//        final XYStepChartDemo demo = new XYStepChartDemo(array_nt);
//        demo.displayChart();
//
//    }
}


