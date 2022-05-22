package gui;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class RadioButtonFrame extends JFrame{
	
	private final JTextField textField; // utilizado para exibir alterações de fonte
	private final Font plainFont; // fonte para texto simples
	private final Font boldFont; // fonte para texto em negrito
	private final Font italicFont; // fonte para texto em itálico
	private final Font boldItalicFont; // fonte para texto em negrito e itálico
	
	private final JRadioButton plainJRadioButton; // seleciona texto simples
	private final JRadioButton boldJRadioButton; // seleciona texto em negrito
	private final JRadioButton italicJRadioButton; // seleciona texto em itálico
	private final JRadioButton boldItalicJRadioButton; // negrito e itálico
	private final ButtonGroup radioGroup; // contém botões de opção
	
	// construtor RadioButtonFrame adiciona JRadioButtons ao JFrame
	public RadioButtonFrame() {
		super("RadioButton Test");
		setLayout(new FlowLayout());
		
		textField = new JTextField("Watch the font style change", 23);
		add(textField);
		
		// cria botões de opção
		plainJRadioButton = new JRadioButton("Plain", true);
		boldJRadioButton = new JRadioButton("bold", false);
		italicJRadioButton = new JRadioButton("Italic", false);
		boldItalicJRadioButton = new JRadioButton("bold/italic", false);
		add(plainJRadioButton); 
		add(boldJRadioButton);
		add(italicJRadioButton);
		add(boldItalicJRadioButton);
		
		// cria relacionamento lógico entre JRadioButtons
		radioGroup = new ButtonGroup(); // cria ButtonGroup
		radioGroup.add(plainJRadioButton);
		radioGroup.add(boldJRadioButton);
		radioGroup.add(italicJRadioButton);
		radioGroup.add(boldItalicJRadioButton);
		
		// cria fonte objetos
		plainFont = new Font("Serif", Font.PLAIN, 14);
		boldFont = new Font("Serif", Font.BOLD, 14);
		italicFont = new Font("Serif", Font.ITALIC, 14);
		boldItalicFont = new Font("Serif", Font.BOLD + Font.ITALIC ,14);
		textField.setFont(plainFont);
		
		// registra eventos para JRadioButtons
		plainJRadioButton.addItemListener(
				new RadioButtonHandler(plainFont));
		boldJRadioButton.addItemListener(
				new RadioButtonHandler(boldFont));
		italicJRadioButton.addItemListener(
				new RadioButtonHandler(italicFont));
		boldItalicJRadioButton.addItemListener(
				new RadioButtonHandler(boldItalicFont));
	}
	
	// classe interna private para tratar eventos de botão de opção
	private class RadioButtonHandler implements ItemListener {
		private Font font; // font associada com esse listener
		
		public RadioButtonHandler(Font f) {
			font = f;
		}
		
		// trata eventos de botão de opção
		
		@Override
		public void itemStateChanged(ItemEvent event) {
			textField.setFont(font);
		}
	}

}
;;