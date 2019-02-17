import javax.swing.JFrame; //imports needed package for frame

public class Main {

	public static void main(String[] args) {
		
		JFrame mainPage = new JFrame("The Power Inside"); //mainPage is of type JFrame (creates an object) 
		mainPage.setSize(800, 800);
		mainPage.setVisible(true); //must be done in order to see the JFrame
		MyComponent myComponent = new MyComponent(); //Calls the already prepared class to be used as an object here
		mainPage.add(myComponent);//adds the "component" to de JFrame
		
		//
		//you don't draw on a frame, instead you draw on a canvas, which is called a JComponent
		
	}
}
