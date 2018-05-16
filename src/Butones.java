import javax.swing.*;
import java.awt.event.*;
import java.util.*;


public class Butones implements ActionListener
{
   JFrame ventana;
   JButton btn_boton, btn_tmp, btn_iniciar;
   JLabel lbl_x, lbl_y, ubi, marginx, marginy,lbl_acum;
   
   JTextField tf_x, tf_y, locx, locy;
   Random randomGenerator = new Random();
   int acum = 0;
   int cordenadas;
   int distanciax, distanciay;
   int randomIntx = randomGenerator.nextInt(100 );
   int randomInty = randomGenerator.nextInt(100 );
   int a = 30+30*( randomIntx %10), b = 30+20*(randomInty/10);
  
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
      btn_iniciar.setBounds(100,240,80,20);
      btn_iniciar.addActionListener(this);
      ventana.add(btn_iniciar);
      
      lbl_x = new JLabel("X:");
      lbl_x.setBounds(100,265,30,20);
      ventana.add(lbl_x);
      
      ubi = new JLabel("Dirigase a");
      ubi.setBounds(330,115,100,20);
      ventana.add(ubi);
      

      locx = new JTextField();
      locx.setBounds(245,245,100,20);
      ventana.add(locx);
      
      locy = new JTextField();
      locy.setBounds(245,295,100,20);
      ventana.add(locy);
      
      tf_x = new JTextField();
      tf_x.setBounds(115,265,30,20);
      ventana.add(tf_x);
      
      
      lbl_y = new JLabel("Y");
      lbl_y.setBounds(100,290,30,20);
      ventana.add(lbl_y);
      
      tf_y = new JTextField();
      tf_y.setBounds(115,290,30,20);
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
    	
    	 acum++;
         int x, y;
         btn_tmp = (JButton)e.getSource();
         x = btn_tmp.getLocation().x;
         y = btn_tmp.getLocation().y;
         tf_x.setText(String.valueOf(x));
         tf_y.setText(String.valueOf(y));
         
         System.out.println(acum);
         distanciax = a - x;
         distanciay = b - y;
        if ( x == a && y == b)
        {
        	
        	  JOptionPane.showMessageDialog(null, "ENCONTRASTE EL TESORO EN " + acum + " INTENTOS", "InfoBox: " + "felicidades", JOptionPane.INFORMATION_MESSAGE);
        }
        locx.setText(" ");
        locy.setText(" ");
        if ( distanciax  > 0  )  {
        	
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
      
      for ( i = 1 ; i <= 10 ; i++)
      	{
    	  marginx = new JLabel(Integer.toString(i));
          marginx.setBounds(20 + (i * 29), 15, 30,20);
          ventana.add(marginx);
          
          marginy = new JLabel(Integer.toString(i));
          marginy.setBounds(18, 12 + (i * 20), 30,20);
          ventana.add(marginy);
          
        
      	}
      for (i=0;i<100;i++)
      {
         btn_boton = new JButton();
         btn_boton.setBounds(30+30*(i%10), 30+20*(i/10),30,20);
         btn_boton.addActionListener(this);
         ventana.add(btn_boton);
      }
      ventana.repaint();

   }
   
   
}



