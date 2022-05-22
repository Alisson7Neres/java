package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PanelFrame extends JFrame {

	private final JPanel buttonPanel; // painel para armazenar botões
	private final JButton[] buttons;

	// construtor sem argumento
	public PanelFrame() {
		super("Panel Demo");
		buttons = new JButton[5];
		buttonPanel = new JPanel();
		buttonPanel.setLayout(new GridLayout(1, buttons.length));

		// cria e adiciona botões
		for (int count = 0; count < buttons.length; count++) {
			buttons[count] = new JButton("Button " + (count + 1));
			buttonPanel.add(buttons[count]); // adiciona botão ao painel
		}

		add(buttonPanel, BorderLayout.SOUTH); // adiciona painel ao JFrame
	}

}
