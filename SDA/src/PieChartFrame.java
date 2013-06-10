import java.awt.Toolkit;

import javax.swing.JFrame;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;


public class PieChartFrame extends JFrame{

private DataBase db;
	public PieChartFrame(DataBase db){
		setTitle("PieChart Pwlisewn");
		setIconImage(Toolkit.getDefaultToolkit().getImage(BarChartFrame.class.getResource("/Icons/Chrome.png")));
       this.db=db;
		DefaultPieDataset pieDataset = new DefaultPieDataset(); 
/*
		pieDataset.setValue("Proion A", 70); 
		pieDataset.setValue("Proion B", 20); 
		pieDataset.setValue("Proion C", 10); 
*/
		for(Proion pr : db.getProiontaSet()){
			pieDataset.setValue(""+pr.getBarcode()+"",pr.getSynolikesPwliseis() );
			//pieDataset.addValue(pr.getSynolikesPwliseis(), "1", "'"+pr.getBarcode()+"'");
		}
		//PiePlot plot = new PiePlot(pieDataset); 

		//JFreeChart chart = new JFreeChart("Pwliseis Proiontwn", plot);
		
		
		
		
		
		JFreeChart chart = ChartFactory.createPieChart3D("Poliseis Proionton ", pieDataset, true, true, true);
		
		
		
		
		
		

		ChartPanel chartPanel = new ChartPanel(chart);

		this.setContentPane(chartPanel);

		this.setVisible(true);
		this.pack();
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

}
