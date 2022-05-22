package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FlowLayoutFrame extends JFrame{
	
	private final JButton leftJButton; // botão para configurar alinhamento à esquerda
	private final JButton centerJButton; // botão para configurar alinhamento à esquerda
	private final JButton rightJButton; // botão para configurar alinhamento à esquerda
	private final FlowLayout layout; // objeto de layout
	private final Container container; // contêiner para configurar layout
	
	// configura GUI e registra listeners de botão
	public FlowLayoutFrame() {
		super("FlowLayout Demo");
		
		layout = new FlowLayout();
		container = getContentPane(); // obtém contêiner para layout
		setLayout(layout);
		
		// configura leftJButton e registra listener
		leftJButton = new JButton("Left");
		add(leftJButton);
		leftJButton.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent event) {
						layout.setAlignment(FlowLayout.LEFT);
						
						layout.layoutContainer(container);
					}
				});
		
		// configura centerJButton e registra o listener
		centerJButton = new JButton("Center");
		add(centerJButton);
		centerJButton.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						layout.setAlignment(FlowLayout.CENTER);
						
						layout.layoutContainer(container);
						
					}
				});
		
		// configura rithJButton e registra o listener
		rightJButton = new JButton("Right");
		add(rightJButton);
		rightJButton.addActionListener(
				new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent arg0) {
						layout.setAlignment(FlowLayout.RIGHT);
						
						layout.layoutContainer(container);
						
					}
				});
	}

}
