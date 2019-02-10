import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Vector;
import java.text.*;
import java.util.Date;

class StudentInfo extends JFrame{
Container cont;
JPanel p1,p2,p3,p4,p5,p6,p7,p8;
JLabel L1,L2,L3,L4,L5;
JLabel p4Label_1,p4Label_2;
JButton p4b1,p4b2,p4b3,p4b4;
JTextField p4tf1;


JLabel p5L1,p5L2;
JTextField p5tf1,p5tf2;
JButton p5b1,p5b2;

JButton p6b1,p6b2,p6b3;
JLabel p6L1,p6L2;
JTextField p6tf1,p6tf2;
JButton p7b1;

JButton p8b1,p8b2;

JLabel p8L1,p8L2,p8L3;
JTextField p8tf1,p8tf2,p8tf3;
JLabel cLabel;
JTextField tf1,tf2,tf3,tf4;
JButton b1,b2,b3,b4;
String id,name,home;

JScrollPane scrollPane;

final Vector colName;
final Vector data;

Timer timer;

StudentInfo(){

    super("Student Information");
	setLayout(null);
    cont=getContentPane();
    cont.setLayout(null);
    cont.setBounds(0,0,700,600);
     //*****Panel  1 *****//
    p1=new JPanel();
    p1.setLayout(null);
    p1.setBounds(0,0,600,500);
    p1.setBackground(Color.PINK);

     //*       JLabel***********//
		L1= new JLabel("ID                :");
		L2= new JLabel("Name         :");
		L3 = new JLabel("Home District:");



		 p1.add(L1);
	     L1.setBounds(10,50,100,25);

		 p1.add(L2);
		 L2.setBounds(10,80,100,25);

		 p1.add(L3);
		 L3.setBounds(10,110,100,25);

	       /***  JTextField      ****/

           tf1=new JTextField();
           p1.add(tf1);
           tf1.setBounds(100,50,150,25);

           tf2=new JTextField();
		   p1.add(tf2);
		   tf2.setBounds(100,80,150,25);

           tf3=new JTextField();
		   p1.add(tf3);
		   tf3.setBounds(100,110,150,25);


		    ///***JButton********//
		   		   b1=new JButton("ok");
		   		   p1.add(b1);
		   		   b1.setBounds(100,150,100,25);

		   		   b2=new JButton("Forward");
				   p1.add(b2);
				   b2.setBounds(210,150,100,25);



    p2=new JPanel();
    p1.add(p2);
    p2.setLayout(null);
    p2.setBounds(0,0,600,50);
    p2.setBackground(Color.RED);
    cLabel=new JLabel("Starting...");
    p2.add(cLabel);
    cLabel.setBounds(20,20,100,25);
    cLabel.setForeground(Color.YELLOW);

 timer = new Timer(1000, null);
		timer.setInitialDelay(0);
		timer.start();


    p3=new JPanel();
    p1.add(p3);
    p3.setLayout(null);
    p3.setBounds(0,300,600,50);
    p3.setBackground(Color.GRAY);
    cont.add(p1);


   	///***JButton********//

   	  b3=new JButton("Exit");
	  p3.add(b3);
	  b3.setBounds(120,10,100,25);



  //*****JPanel 4***//
  p4=new JPanel();

  p4.setLayout(null);
  p4.setBounds(0,0,600,500);
  p4.setBackground(Color.PINK);

  p4Label_1=new JLabel("Insert ID:");
 	      p4.add(p4Label_1);
 	      p4Label_1.setBounds(20,50,100,25);
          p4Label_1.setForeground(Color.RED);

 	      p4tf1=new JTextField();
 	      p4tf1=new JTextField();
 	      p4.add(p4tf1);
	      p4tf1.setBounds(100,50,150,25);

	      p4b1=new JButton("search");
		  p4.add(p4b1);
	      p4b1.setBounds(90,200,80,25);

	      p4b2=new JButton("Back");
	      p4.add(p4b2);
	      p4b2.setBounds(180,200,80,25);

	      p4b3=new JButton("View All");
		  p4.add(p4b3);
	      p4b3.setBounds(270,200,80,25);


	        p4b4=new JButton("Forward");
		    p4.add(p4b4);
          p4b4.setBounds(360,200,100,25);
       ///******Panel  5*****//
	      p5=new JPanel();
	      p5.setLayout(null);
	      p5.setBounds(0,0,600,500);
          p5.setBackground(Color.PINK);

	     p5L1=new JLabel("Name          :");
		  p5.add(p5L1);
		  p5L1.setBounds(25,50,100,20);

		  p5L2=new JLabel("Home Dist:");
		  p5.add(p5L2);
		  p5L2.setBounds(25,90,100,20);

		  p5tf1=new JTextField();
		  p5.add(p5tf1);
		  p5tf1.setBounds(100,50,150,25);

		  p5tf2=new JTextField();
		  p5.add(p5tf2);
		  p5tf2.setBounds(100,90,150,25);

		  p5b1=new JButton("Back");
          p5.add(p5b1);
          p5b1.setBounds(50,200,100,25);




          //*****Panel  6**********///
          p6=new JPanel();
          p6.setLayout(null);
          p6.setBounds(0,0,600,500);
		  p6.setBackground(Color.PINK);



           p6L1=new JLabel("Enter ID to Delete:");
		   p6.add(p6L1);
		   p6L1.setBounds(20,50,150,25);
           p6L1.setForeground(Color.RED);


           p6tf1=new JTextField();
		   p6.add(p6tf1);
           p6tf1.setBounds(150,50,150,25);

		  p6b1=new JButton("Forward");
		  p6.add(p6b1);
	      p6b1.setBounds(120,200,100,25);

          p6b2=new JButton("Deleted");
		  p6.add(p6b2);
	      p6b2.setBounds(230,200,80,25);

          p6b3=new JButton("Back");
		  p6.add(p6b3);
          p6b3.setBounds(10,200,100,25);

	      /////**********Panel  7***////

          p7=new JPanel();
          p7.setLayout(null);

          p7.setBounds(0,0,600,500);
          p7.setBackground(Color.PINK);

          p7b1=new JButton("Back");
		  p7.add(p7b1);
          p7b1.setBounds(100,320,100,25);
          JScrollPane scrollPane;
          colName=new Vector();
          data=new Vector();


         ////************Panel  8******///
         p8=new JPanel();
         p8.setLayout(null);
         p8.setBounds(0,0,600,500);
		 p8.setBackground(Color.PINK);

         p8L1= new JLabel("ID                :");
		 p8L2= new JLabel("Name         :");
		 p8L3 = new JLabel("Home District:");

        p8.add(p8L1);
	    p8L1.setBounds(10,50,100,25);

	    p8.add(p8L2);
	    p8L2.setBounds(10,80,100,25);

	   p8.add(p8L3);
	   p8L3.setBounds(10,110,100,25);


	     p8tf1=new JTextField();
	     p8.add(p8tf1);
	   	 p8tf1.setBounds(100,50,150,25);

	    p8tf2=new JTextField();
	    p8.add(p8tf2);
	    p8tf2.setBounds(100,80,150,25);

	    p8tf3=new JTextField();
		p8.add(p8tf3);
		p8tf3.setBounds(100,110,150,25);


        p8b1=new JButton("Updated");
		p8.add(p8b1);
	    p8b1.setBounds(200,200,80,25);

       p8b2=new JButton("Back");
       p8.add(p8b2);
       p8b2.setBounds(50,200,100,25);



    try{

		    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	        Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","ict");
	        Statement st = con.createStatement();
	        ResultSet rs= st.executeQuery("Select * from Student_3");
	        ResultSetMetaData md = rs.getMetaData();
	        int columns = md.getColumnCount();
			for (int i = 1; i <= columns; i++) {
	        colName.addElement( md.getColumnName(i) );
	        }
	        while (rs.next()) {
			Vector row= new Vector(columns);
			for (int i = 1; i <= columns; i++) {
			row.addElement( rs.getObject(i) );
	          }
		    data.addElement( row );
		    }

	        }
	       catch(Exception e){ }
	       JTable table = new JTable(data, colName);
	       table.setBackground(Color.GREEN);

		   scrollPane = new JScrollPane(table);
		   scrollPane.setBounds(10,10,400,300);

	       p7.add(scrollPane);


timer.addActionListener(new ActionListener(){
public void actionPerformed(ActionEvent ae){

 if (ae.getSource() == timer){
							Date t = new Date();
							DateFormat df = DateFormat.getTimeInstance(DateFormat.MEDIUM);
							String time = df.format(t);
							cLabel.setText(time);
			}

}



});
 b1.addActionListener(new ActionListener(){

          public void actionPerformed(ActionEvent ae){
               if(ae.getSource()==b1){
									 id=tf1.getText();
									 name=tf2.getText();
									 home=tf3.getText();
									  JOptionPane.showMessageDialog(null,"Value Inserted");
									  try{
									  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
								      Connection con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","ict");
								      Statement st=con.createStatement();
									  String sql=("INSERT INTO Student_3 values('"+id+"','"+name+"','"+home+"')");

									  st.executeUpdate(sql);
								      con.close();
								    }catch(Exception e){e.printStackTrace();}


		  }

		      }
	   });


     b2.addActionListener(new ActionListener(){

	 		   		   public void actionPerformed(ActionEvent ae){
	 		   			   if(ae.getSource()==b2){
	 		   				 cont.removeAll();
	 		   				 cont.add(p4);
	 		   				  p4.repaint();


	 		   			  }

	 		     }

		   });
	b3.addActionListener(new ActionListener(){

	   	   public void actionPerformed(ActionEvent ae){

	   		   if(ae.getSource()==b3){
	   			   System.exit(1);

	   		   }

	   	   }
	   });

	    p4b1.addActionListener(new ActionListener(){

	   	 	 public void actionPerformed(ActionEvent ae){
	          String value=p4tf1.getText();
	   	 	  if(ae.getSource()==p4b1){
	   	 	  cont.removeAll();
	   	 	  cont.add(p5);
	   	 	  p5.repaint();

            Connection con = null;
			  try{


			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","ict");

		    PreparedStatement st=con.prepareStatement("select * from Student_3 where id=?");
		    st.setString(1,value);

		   ResultSet res=st.executeQuery();
		   res.next();
		   p4tf1.setText(Integer.toString(res.getInt(1)));
	        p5tf1.setText(res.getString(2));
		   p5tf2.setText(res.getString(3));

		  con.close();

	     }catch(Exception e)
			{
		JOptionPane.showMessageDialog(null,"Can not edit data");
		   	}



	   	 		   }

	   	 		     }

		   });

p4b2.addActionListener(new ActionListener(){

		   		   public void actionPerformed(ActionEvent ae){


		   			   if(ae.getSource()==p4b2){
		   				    cont.removeAll();
		   				   	   			  			  cont.add(p1);
		   				   			  			  p1.repaint();


		   			   }

		   		   }

		   });
  p5b1.addActionListener(new ActionListener(){

	public void actionPerformed(ActionEvent ae){

         if(ae.getSource()==p5b1){
		   		   cont.removeAll();
		   		   cont.add(p4);
		   		   p4.repaint();


		   		     }

		   	   }

		   });
 p4b3.addActionListener(new ActionListener(){

		   		   	 public void actionPerformed(ActionEvent ae){


		   		   		if(ae.getSource()==p4b3){
		   		   		cont.removeAll();
		   		   	    cont.add(p7);
		   		   		p7.repaint();





		   		   			  }

		   		   		   }

		   });
 p4b4.addActionListener(new ActionListener(){

		   public void actionPerformed(ActionEvent ae){

            if(ae.getSource()==p4b4){
		   		   	 cont.removeAll();
		   		   	 cont.add(p6);
		   		   	 p6.repaint();


		   		   	 }

		   		  }

		   });
 p6b3.addActionListener(new ActionListener(){

		   public void actionPerformed(ActionEvent ae){

		          if(ae.getSource()==p6b3){
		   		  cont.removeAll();
		   		  cont.add(p4);
		   		   p4.repaint();

		   		   		 }

		   	  	 }

		   });
 p6b2.addActionListener(new ActionListener(){

		   public void actionPerformed(ActionEvent ae){
                   String value_1=p6tf1.getText();
		          if(ae.getSource()==p6b2){


		   		  Connection con = null;
				  		   		try{
				  				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

				  				con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","ict");
				  				PreparedStatement st=con.prepareStatement("DELETE FROM Student_3 WHERE id = ?");
				  				st.setString(1,value_1);
				  				st.executeUpdate();
				  				JOptionPane.showMessageDialog(p6,"Record is deleted successfully.");
				  				con.close();
				  				}
				  				catch(Exception e)
				  				{
				  				JOptionPane.showMessageDialog(p6,"Error in deleting record.");
                              }

		   		   		 }

		   	  	 }

		   });

 p6b1.addActionListener(new ActionListener(){

		   		   		   public void actionPerformed(ActionEvent ae){

                             if(ae.getSource()==p6b1){

                          cont.removeAll();
						 cont.add(p8);
		   		   	  p8.repaint();

		   		   			 }

		   		   	 }

		   });
 p7b1.addActionListener(new ActionListener(){

		   		   		   public void actionPerformed(ActionEvent ae){

                    if(ae.getSource()==p7b1){
		   		      cont.removeAll();
		   		   	  cont.add(p4);
		   		   	  p4.repaint();


		   		   			 }

		   		   	 }

		   });

 p8b2.addActionListener(new ActionListener(){

		   		   		   public void actionPerformed(ActionEvent ae){

                    if(ae.getSource()==p8b2){
		   		      cont.removeAll();
		   		   	  cont.add(p6);
		   		   	  p6.repaint();


		   		   			 }

		   		   	 }

		   });

 p8b1.addActionListener(new ActionListener(){

	 public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==p8b1){
		   		  cont.removeAll();
		   		   		   	  cont.add(p8);
		   		   		   	  p8.repaint();



           Connection con = null;

           try{
			 int x=JOptionPane.showConfirmDialog(p1,"Confirm edit? All data will be replaced");
			if(x==0){
				 try{
					 String value1=tf1.getText();
					 String value2=tf2.getText();
					 String value3=tf3.getText();

					 Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

					 con=DriverManager.getConnection("jdbc:mysql://localhost/test","root","ict");
					 Statement st=con.createStatement();


					  st.executeUpdate("update Student_3  set name='"+value2+"', home='"+value3+"' where id='"+value1+"'");
					 JOptionPane.showMessageDialog(p1,"Updated successfully");
					 con.close();
					 }
					 catch(Exception ex)
					 {
					  JOptionPane.showMessageDialog(p1,"Error in updating edit fields");
					  }
					  }
					 }
					 catch(Exception ex)
					 {
					 JOptionPane.showMessageDialog(p1,"Error");

                      }


		             }

		   }

		   });



    setSize(500,400);
    setVisible(true);
    setLocation(200,100);




}


    public static void main(String args[]){
	StudentInfo a=new StudentInfo();
	a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}