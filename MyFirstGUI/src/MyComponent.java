import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JComponent;

public class MyComponent extends JComponent{  //Por ahora esto se deja asi en lo que se entiende
	
	private static int counter = 0; //cuenta cuantas veces llama la funcion de paint component
	//a private variable means its encapsuled in only one particular class. Useful if you dont want to take risks
	public void paintComponent(Graphics g) {
		
		Graphics2D g2 = (Graphics2D) g;
		Rectangle r = new Rectangle (10, 10, 80, 50); //Rectangle(x,y,width, height)
		g2.draw(r);
		
		counter++;
		System.out.println(counter);
	}

}
