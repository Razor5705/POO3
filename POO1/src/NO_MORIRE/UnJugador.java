package NO_MORIRE;

import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalTime;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class UnJugador {

	record Coordenadas(double X, double Y, double Z) {
		
	}
	
	record ItemStack(String Item, int Cantidad) {
		
	}
	
	
	
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Cargando Mundo...");
		JOptionPane.showMessageDialog(null, "Iniciando Mundo ");
		
		
		
    Coordenadas spawn = new Coordenadas(10.0, 55.0, 10.0);
    Razor64_ usuario =  new Razor64_(18, "defaultskin.png");
    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400, 400);
    Frame frame1 = new Frame("Block Breaker");
    frame1.setSize(400, 400);

    int vida = 20;
    
    
    System.out.printf(usuario.getNombre() + usuario.toString());
    System.out.println("\nBienvenido a Minecraft" +
    "\nMuevete con las flechas para seguir con tu camino");
    
    
    
	   try {
		
		do {
			frame.addKeyListener(new KeyListener()
			
			{
				
				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					switch (e.getKeyCode()) {
					case KeyEvent.VK_UP: 
						
						 System.out.println("Movimiento hacia arriba");
	                        break;
					
	                 case KeyEvent.VK_DOWN:      
	                        
	                	 System.out.println("Movimiento hacia abajo");
	                        break;
					
	                 case KeyEvent.VK_RIGHT:  
	                	 
	                	 System.out.println("Movimiento hacia la derecha");
	                        break;
	                        
	                 case KeyEvent.VK_LEFT:
	                	 
	                	 System.out.println("Movimiento hacia la izquierda");
	                        break;
	                        
					default:
						throw new IllegalArgumentException("Unexpected value: " );
					}
				}
				
				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
			});
			
			frame.addMouseListener(new MouseAdapter() {

				@Override
				public void mouseClicked(MouseEvent e) {
					// TODO Auto-generated method stub
					int x = e.getX();
	                int y = e.getY();

	                if (x >= 100 && x <= 150 && y >= 100 && y <= 150) {
	                    System.out.println("¡Bloque roto!");
	                }
				}
	                
				
			});
	        frame.setVisible(true);
	        frame1.setVisible(true);
      
	        
          
			
			
			
		} while (vida <= 0);
		   
		   
		   
		   
		   
		   
		   
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}	
    
    
		
	}

}
