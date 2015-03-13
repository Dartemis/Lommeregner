import javax.swing.*;

public class Gui extends JFrame {
	
	public Gui( String title ){
		super( title );
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setGuiSize();
		
	}
	
	public void setGuiSize(){
		setSize(500, 500);
	}

}
