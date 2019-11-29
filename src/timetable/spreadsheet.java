
package timetable;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
public class spreadsheet extends JFrame
{
    public spreadsheet()
    {
    	JButton b=new JButton("add row");
    	b.setBounds(40,350,150,30);
    	add(b);
    	
    	//headers for the table
    	String[] columns = {"mon","tue", "wed","thu","friday","sat"};
         
        //actual data for the table in a 2d array
    	Object[][] data = {
    		    {" ", "","","  ","","", new Boolean(false)},
    		    {" ", "","","  ","","", new Boolean(false)},
    		    {" ", "","","  ","","", new Boolean(false)},
    		    {" ", "","","  ","","", new Boolean(false)},
    		    {" ", "","","  ","","", new Boolean(false)},
    		    {" ", "","","  ","","", new Boolean(false)},
    		    {" ", "","","  ","","", new Boolean(false)},
    		    {" ", "","","  ","","", new Boolean(false)},
    		    {" ", "","","  ","","", new Boolean(false)},
    		};
        //create table with data
        JTable table = new JTable(data, columns);
         
        //add the table to the frame
        this.add(new JScrollPane(table));
         
        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
    }
     
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new spreadsheet();
            }
        });
    }   
}