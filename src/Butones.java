import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Butones implements ActionListener
{
   JFrame ventana;
   JButton btn_boton, btn_tmp,buton2, btn_iniciar;
   JLabel lbl_x, lbl_y;
   JTextField tf_x, tf_y;
  
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
      btn_iniciar.setBounds(130,40,80,20);
      btn_iniciar.addActionListener(this);
      ventana.add(btn_iniciar);
      
      lbl_x = new JLabel("X:");
      lbl_x.setBounds(130,65,30,20);
      ventana.add(lbl_x);
      
      tf_x = new JTextField();
      tf_x.setBounds(165,65,30,20);
      ventana.add(tf_x);
      
      lbl_y = new JLabel("Y");
      lbl_y.setBounds(130,90,30,20);
      ventana.add(lbl_y);
      
      tf_y = new JTextField();
      tf_y.setBounds(165,90,30,20);
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
      }   
   }
   
   public void crear()
   {
      int i;
      System.out.println("crear");
      
         btn_boton = new JButton();
         btn_boton.setBounds(50, 40,30,20);
         btn_boton.addActionListener(this);
         ventana.add(btn_boton);
         
         btn_boton = new JButton();
         btn_boton.setBounds(50+32,40 ,30,20);
         btn_boton.addActionListener(this);
         ventana.add(btn_boton);
      
         ventana.repaint();

   }
   
   
}

