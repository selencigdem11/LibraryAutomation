
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.print.*;
 
public class Print implements Printable, ActionListener {
 
 
    public int print(Graphics g, PageFormat pf, int page) throws PrinterException {
 
        if (page > 0) { 
            return NO_SUCH_PAGE;
        }
 
        Graphics2D g2d = (Graphics2D)g;
        g2d.translate(pf.getImageableX(), pf.getImageableY());
 
       
        g.drawString("QR CODE PRINTER", 300, 300);
 
        return PAGE_EXISTS;
    }
 
    public void actionPerformed(ActionEvent e) {
         PrinterJob job = PrinterJob.getPrinterJob();
         job.setPrintable(this);
         boolean ok = job.printDialog();
         if (ok) {
             try {
                  job.print();
             } catch (PrinterException ex) {
           
             }
         }
    }
 
    
    public static void main(String args[]) {
  int id= Admin.bookid;
              String s="C:\\Users\\Nova Stark\\OneDrive\\Masaüstü\\LibraryAutomation  5\\src\\Images\\ID_"+id;
		String qr = s+"_QR.png";
        UIManager.put(qr, Boolean.FALSE);
        JFrame f = new JFrame("Printer For The QR Code");
        f.addWindowListener(new WindowAdapter() {
           public void windowClosing(WindowEvent e) {
         
           }
        });
          f.setLocationRelativeTo(null);
 
      
      JButton printButton= new JButton("\"Print The QR Code\"");
      printButton.setBorderPainted( false );
     
        printButton.addActionListener(new Print());
        
        f.add("Center", printButton);
        f.pack();
        f.setVisible(true);
        
    }
    public static void mainCallerPrintt()
    {
       main(null);
       
    }
    
}