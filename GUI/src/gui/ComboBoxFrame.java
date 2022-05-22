package gui;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ComboBoxFrame extends JFrame {

	private final JComboBox<String> imagesJComboBox; // contém nomes de ícones
	private final JLabel label; // exibe o ícone selecionado

	private static final String[] names = { "/bug.png", "/bug2.png","/bug3.png", "/bug4.png"};
	private final Icon[] icons = { new ImageIcon(getClass().getResource(names[0])),
			new ImageIcon(getClass().getResource(names[1])),
			new ImageIcon(getClass().getResource(names[2])),
			new ImageIcon(getClass().getResource(names[3]))};

	// construtor ComboBoxFrame adiciona JComboBox ao JFrame
	public ComboBoxFrame() {
		super("Testing JComboBox");
		setLayout(new FlowLayout()); // configura o layout de frame

		imagesJComboBox = new JComboBox<String>(names); // configura JComboBox
		imagesJComboBox.setMaximumRowCount(3); // exibe três linhas

		imagesJComboBox.addItemListener(new ItemListener() // classe interna anônima
		{
			// trata evento JComboBox

			@Override
			public void itemStateChanged(ItemEvent event) {
				// determina se o item está selecionado
				if (event.getStateChange() == ItemEvent.SELECTED)
					label.setIcon(icons[imagesJComboBox.getSelectedIndex()]);
			}
		});
		
		add(imagesJComboBox); // adiciona caixa de combinação ao JFrame
		label = new JLabel(icons[0]); // exibe primeiro ícone
		add(label);

	}
}
