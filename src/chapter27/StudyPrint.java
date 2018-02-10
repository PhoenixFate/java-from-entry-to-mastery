package chapter27;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;

public class StudyPrint {
	public static void main(String[] args) {
		try {
			PrinterJob printerJob=PrinterJob.getPrinterJob();
			if(!printerJob.printDialog()){
				return;
			}
			printerJob.setPrintable(new Printable(){

				@Override
				public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
					if(pageIndex>0){
						return Printable.NO_SUCH_PAGE;
					}
					int x=(int)pageFormat.getImageableX();
					int y=(int)pageFormat.getImageableY();
					Graphics2D g2d=(Graphics2D)graphics;
					g2d.setStroke(new BasicStroke(4.0f));
					g2d.setColor(Color.blue);
					g2d.drawOval(x+10,y+10,130,130);
					return Printable.PAGE_EXISTS;	
				}	
			});
			printerJob.setJobName("打印图形");
			printerJob.print();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
