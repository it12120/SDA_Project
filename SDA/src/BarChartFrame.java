import java.awt.Color;

import javax.swing.JFrame;
import org.jfree.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import java.awt.Toolkit;

public class BarChartFrame extends JFrame{
	
	
	private DataBase db;
	
	public BarChartFrame(DataBase db){
		setTitle("BarChart Pwlisewn");
		setIconImage(Toolkit.getDefaultToolkit().getImage(BarChartFrame.class.getResource("/Icons/Chrome.png")));
		
		this.db = db;
		
		DefaultCategoryDataset dataset = new DefaultCategoryDataset();
		
		for(Proion pr : db.getProiontaSet()){
			dataset.addValue(pr.getSynolikesPwliseis(), "1", "'"+pr.getBarcode()+"'");
		}
		
		JFreeChart chart =  ChartFactory.createBarChart3D("Pwliseis Proiontwn", "Barcode", "Posotita", dataset, PlotOrientation.VERTICAL, false, true, false);
		
		
		
		ChartPanel chartPanel = new ChartPanel(chart);
		
		this.setContentPane(chartPanel);
		
		this.setVisible(true);
		this.pack();
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
	}
		
	
	
		
	
}
