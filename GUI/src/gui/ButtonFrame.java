package gui;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ButtonFrame extends JFrame{
	
	private final JButton plainJButton; //botão apenas com texto
	private final JButton fancyButton; // botão com ícones
	
	// BUttonFrame adiciona JButtons ao JFrame
	public ButtonFrame() {
		super("Testing Buttons");
		setLayout(new FlowLayout());
		
		plainJButton = new JButton("Plain Button"); // botão com texto
		add(plainJButton); // adiciona plainJButton ao JFrame
		
		Icon bug = new ImageIcon(getClass().getResource("/bug.png"));
		Icon bug2 = new ImageIcon(getClass().getResource("/bug2.png"));
		fancyButton = new JButton("Fancy Button", bug); // configura imagem
		fancyButton.setRolloverIcon(bug2);
		add(fancyButton); // adiciona fancyJButton ao JFrame
		
		// cria novo ButtonHandler de tratamento para tratamento de evento de botão
		ButtonHandler handler = new ButtonHandler();
		fancyButton.addActionListener(handler);
		plainJButton.addActionListener(handler);
	}
	
	// classe interna para tratamento de evento de botão
	private class ButtonHandler implements ActionListener {
		
		// Trata evento de botão
		@Override
		public void actionPerformed(ActionEvent event) {
			JOptionPane.showMessageDialog(ButtonFrame.this, String.format(
					"You pressed: %s", event.getActionCommand()));
		}
	}

}
