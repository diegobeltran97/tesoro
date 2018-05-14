import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class Butones implements ActionListener
{
   JFrame ventana;
   JButton btn_boton, btn_tmp, btn_iniciar;
   JLabel lbl_x, lbl_y, ubi;
   JTextField tf_x, tf_y, locx, locy;
   Random randomGenerator = new Random();
   int cordenadas;
   int distanciax, distanciay;
   int randomIntx = randomGenerator.nextInt(100 );
   int randomInty = randomGenerator.nextInt(100 );
   int a = 1+30*( randomIntx %10), b = 1+20*(randomInty/10);
  
   Random rnd;
   
   public static void main(String[] args)
   {
      new Butones();
   }
   
   Butones()
   {
      rnd = new Random();
      
      ventana = new JFrame("botones");
      ventana.setBounds(100,100,500,500);
      ventana.setLayout(null);
      ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      btn_iniciar = new JButton("Iniciar");
      btn_iniciar.setBounds(370,40,80,20);
      btn_iniciar.addActionListener(this);
      ventana.add(btn_iniciar);
      
      lbl_x = new JLabel("X:");
      lbl_x.setBounds(350,65,30,20);
      ventana.add(lbl_x);
      
      ubi = new JLabel("Dirigase a");
      ubi.setBounds(330,115,100,20);
      ventana.add(ubi);
      
      locx = new JTextField();
      locx.setBounds(335,135,100,20);
      ventana.add(locx);
      
      locy = new JTextField();
      locy.setBounds(335,155,100,20);
      ventana.add(locy);
      
      tf_x = new JTextField();
      tf_x.setBounds(375,65,30,20);
      ventana.add(tf_x);
      
      
      lbl_y = new JLabel("Y");
      lbl_y.setBounds(350,90,30,20);
      ventana.add(lbl_y);
      
      tf_y = new JTextField();
      tf_y.setBounds(375,90,30,20);
      ventana.add(tf_y);


      ventana.setVisible(true);
   
   }
   
   public void actionPerformed(ActionEvent e)
   {
      // System.out.println("actionPerformed");
      
      if (e.getSource() == btn_iniciar)
         crear();
      else
      {
    	
    	  
         int x, y;
         btn_tmp = (JButton)e.getSource();
         x = btn_tmp.getLocation().x;
         y = btn_tmp.getLocation().y;
         tf_x.setText(String.valueOf(x));
         tf_y.setText(String.valueOf(y));
         
         System.out.println(a + " " +b);
         distanciax = a - x;
         distanciay = b - y;
        if ( x == a && y == b)
        {
        	
        	  JOptionPane.showMessageDialog(null, "ENCONTRASTE EL TESORO", "InfoBox: " + "felicidades", JOptionPane.INFORMATION_MESSAGE);
        }
        locx.setText(" ");
        locy.setText(" ");
        if ( distanciax  > 0  )  {
        	System.out.println(distanciax);
        	locx.setText("Este");
        }
        if ( distanciax  < 0 )  {
        	locx.setText("Oeste" );
        }
        if ( distanciay  > 0 )  {
        	locy.setText("Sur" );
        }
        if ( distanciay  < 0 )  {
        	locy.setText("Norte" );
        	
        }
       
       
        
        
      
        
       
        
         
      }   
   }
   
   public void crear()
   {
      int i;
      //System.out.println("crear");
      for (i=0;i<100;i++)
      {
         btn_boton = new JButton();
         btn_boton.setBounds(1+30*(i%10), 1+20*(i/10),30,20);
         btn_boton.addActionListener(this);
         ventana.add(btn_boton);
      }
      ventana.repaint();

   }
   
   
}



