package NO_MORIRE;

import java.awt.Color;
import java.awt.Frame;
import java.awt.ImageCapabilities;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.time.LocalTime;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
    frame.setSize(800, 600);
    JPanel panel = new JPanel();
    
   

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
			

			
			frame.addMouseListener(new MouseListener() {
				
				@Override
			    public void mouseClicked(MouseEvent e) {
			        System.out.println("Mouse clicked at (" + e.getX() + ", " + e.getY() + ")");
			    }

			    @Override
			    public void mousePressed(MouseEvent e) {
			        System.out.println("Mouse pressed at (" + e.getX() + ", " + e.getY() + ")");
			    }

			    @Override
			    public void mouseReleased(MouseEvent e) {
			        System.out.println("Mouse released at (" + e.getX() + ", " + e.getY() + ")");
			    }

			    @Override
			    public void mouseEntered(MouseEvent e) {
			        System.out.println("Mouse entered at (" + e.getX() + ", " + e.getY() + ")");
			    }

			    @Override
			    public void mouseExited(MouseEvent e) {
			        System.out.println("Mouse exited at (" + e.getX() + ", " + e.getY() + ")");
			    }
			});
			
			frame.addKeyListener(new KeyListener() {

				@Override
				public void keyTyped(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}

				@Override
				public void keyPressed(KeyEvent e) {
					// TODO Auto-generated method stub
					switch (e.getKeyCode()) {
					case KeyEvent.VK_E: 
						usuario.abrir();
						
						
						break;
					
                  case KeyEvent.VK_ESCAPE: {
						
						usuario.cerrar();
					}

					}
				}

				@Override
				public void keyReleased(KeyEvent e) {
					// TODO Auto-generated method stub
					
				}
				
			});
		
	        frame.getContentPane().setBackground(Color.YELLOW); 
	        frame.add(panel);
	        frame.setVisible(true);
      
	        
          
			
			
			
		} while (vida <= 0);
		   
		   
		   
		   
		   
		   
		   
		
	} catch (Exception e) {
		// TODO: handle exception
		System.out.println(e);
	}	
    
    
		
	}

}
