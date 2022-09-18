

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class UsingSpaceShip extends JFrame implements ActionListener {
	 
	private JButton moveUpButton, moveDownButton;
	private JPanel panel;
	private SpaceShip spaceShip;
	
	

	public static void main(String[] args) {
		
		UsingSpaceShip frame = new UsingSpaceShip();
		 frame.setSize(300, 300);
		 frame.createGUI();
		 frame.setVisible(true);
	      
	}
	

	
	 private void createGUI() {
		 setDefaultCloseOperation(EXIT_ON_CLOSE);
	     Container window = getContentPane();
	     window.setLayout(new FlowLayout());
	        
	     this.panel = new JPanel();
	     this.panel.setPreferredSize(new Dimension(250, 200));
	     this.panel.setBackground(Color.white);
	     window.add(this.panel);
	        
	        
	     this.moveUpButton = new JButton("Up");
	     window.add(this.moveUpButton);
	     this.moveUpButton.addActionListener(this);
	        
	     this.moveDownButton = new JButton("Down");
	     window.add(this.moveDownButton);
	     this.moveDownButton.addActionListener(this);
	        
	     this.spaceShip = new SpaceShip();
	        
	 }
	 
	 public void actionPerformed(ActionEvent event) {
		 Graphics paper = panel.getGraphics();
		 
		 if(event.getSource() == this.moveDownButton) {
			 
			 spaceShip.moveDown(10);
			 
		 }else if(event.getSource() == this.moveUpButton) {
			 spaceShip.moveUp(10);
		 }
		 
		 paper.setColor(Color.white);
	     paper.fillRect(0, 0, 250, 200);
	     spaceShip.display(paper);
		 
	 }

}
