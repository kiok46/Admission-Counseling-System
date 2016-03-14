import java.sql.*;
import java.util.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


    public class JDBCExample {
    public static void main(String  args[]) throws Exception 
         { 
            //get the connetion
    	final Vector columnNames = new Vector();
    	final Vector data = new Vector();
    	try{
            Connection  connection = getConnection (); 
            Statement stmt = connection.createStatement();
            String sql = "SELECT SSN,FNAME,LNAME, SALARY FROM EMP";
            ResultSet rs = stmt.executeQuery(sql);
            ResultSetMetaData md = rs.getMetaData();
            int columns = md.getColumnCount();
            for (int i = 1; i <= columns; i++) {
            	columnNames.addElement( md.getColumnName(i) );
            	}
            	while (rs.next()) {
            	Vector row = new Vector(columns);
            	for (int i = 1; i <= columns; i++) {
            	row.addElement( rs.getObject(i) );
            	}
            	data.addElement( row );
            	}
            	}
            	catch(Exception e){}
            	 
            	JTable table = new JTable(data, columnNames);
            	JScrollPane scrollPane = new JScrollPane(table);
            	JPanel jpn = new JPanel();
            	jpn.add(scrollPane);            	
            	JFrame emp = new JFrame();

            	JLabel jlb1,jlb2;
                JTextField jtf1,jtf2;
                JButton jbfirst,jbprev,jbnext,jblast;
                JPanel jpn1,jpn2,jpn3;
            	jlb1=new JLabel("Name ");
                jlb2=new JLabel("SSN ");
                jtf1=new JTextField();
                jtf1.setSize(50, 10);
                jtf1.setText("            ");
                jtf2=new JTextField();
                jtf2.setSize(50, 10);
                jtf2.setText("            ");
                jbfirst=new JButton("First");
                jblast=new JButton("Last");
                jbnext=new JButton("Next");
                jbprev=new JButton("Previous");
                jpn1=new JPanel();
                jpn2=new JPanel();
                jpn3=new JPanel();
                jpn1.add(jlb1);
                jpn1.add(jtf1);
                jpn2.add(jlb2);
                jpn2.add(jtf2);
                jpn3.add(jbfirst);
                jpn3.add(jbprev);
                jpn3.add(jbnext);
                jpn3.add(jblast);
                emp.setLayout(new BoxLayout(emp.getContentPane(),BoxLayout.PAGE_AXIS));
                emp.add(jpn);  
                emp.add(jpn1);
                emp.add(jpn2);
                emp.add(jpn3);            	  
            	emp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            	emp.pack();
            	emp.setVisible(true);
        }
          
            private static Connection  getConnection() throws ClassNotFoundException, SQLException 
            { 
                Class. forName ( "COM.ibm.db2os390.sqlj.jdbc.DB2SQLJDriver"  ); 
                Connection  connection = 
                        DriverManager.getConnection("jdbc:db2://localhost:50000/COMPANY","SHIVAM","i'mpgoodwnos"); 
              
                System. out .println( "From JDBC, connection obtained " );
                return connection;
            } 
            
  
}//end JDBCExample

    
