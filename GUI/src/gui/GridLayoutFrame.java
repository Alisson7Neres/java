package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GridLayoutFrame extends JFrame implements ActionListener{
	
	private final JButton[] buttons; // array de botões
	private static final String[] names = 
		{"one", "two", "three", "four", "five", "six"};
	private boolean toggle = true; // alterna entre dois layouts
	private final Container container; // contêiner do frame
	private final GridLayout gridLayout1; // primeiro gridLayout
	private final GridLayout gridLayout2; // segundo gridLayout

	// construtor sem argumento
	public GridLayoutFrame() {
		super("GridLayout Demo");
		gridLayout1 = new GridLayout(2, 3, 5, 5); // 2 por 3; lacunas de 5
		gridLayout2 = new GridLayout(3, 2); // 3 por 2; nenhuma lacuna
		container = getContentPane();
		setLayout(gridLayout1);
		buttons = new JButton[names.length];
		
		for(int count = 0; count < names.length; count ++) {
			buttons[count] = new JButton(names[count]);
			buttons[count].addActionListener(this); // ouvinte registrado
			add(buttons[count]);
		}
	}
	@Override
	public void actionPerformed(ActionEvent event) {
		if(toggle) // define layout com base nos botões de alternação
			container.setLayout(gridLayout2);
		else 
			container.setLayout(gridLayout1);
		
		toggle = !toggle;
		container.validate(); // refaz o layout do contêiner
	}
}
