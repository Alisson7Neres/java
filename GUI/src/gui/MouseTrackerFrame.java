package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseTrackerFrame extends JFrame {

	private final JPanel mousePanel; // painel em que os eventos de mouse ocorrem
	private final JLabel statusBar;

	// construtor MouseTrackerFrame configura GUI e
	// registra rotinas de tratamento de evento de mouse

	public MouseTrackerFrame() {
		super("Demonstrating Mouse Events");
		// setLayout(new FlowLayout());

		mousePanel = new JPanel();
		mousePanel.setBackground(Color.WHITE);
		add(mousePanel, BorderLayout.CENTER);

		statusBar = new JLabel("Mouse outside JPanel");
		add(statusBar, BorderLayout.SOUTH); // adiciona rótulo ao JFrame

		// cria e registra listener para mouse e eventos de movimento de mouse
		MouseHandler handler = new MouseHandler();
		mousePanel.addMouseListener(handler);
		mousePanel.addMouseMotionListener(handler);
	}

	private class MouseHandler implements MouseListener, MouseMotionListener {

		// rotinas de tratamento de evento MouseListener
		// trata evento quando o mouse é liberado imediatamente depois de ter sido
		// pressionado
		@Override
		public void mouseDragged(MouseEvent event) {
			statusBar.setText(String.format("Dragged at [%d, %d]", event.getX(), event.getY()));

		}

		@Override
		public void mouseMoved(MouseEvent event) {
			statusBar.setText(String.format("Moved at [%d, %d]", event.getX(), event.getY()));

		}

		@Override
		public void mouseClicked(MouseEvent event) {
			statusBar.setText(String.format("Clicked at [%d, %d]", event.getX(), event.getY()));

		}

		@Override
		public void mouseEntered(MouseEvent event) {
			statusBar.setText(String.format("Mouse entered at [%d, %d]", event.getX(), event.getY()));
			mousePanel.setBackground(Color.GREEN);

		}

		@Override
		public void mouseExited(MouseEvent event) {
			statusBar.setText("Mouse outside JPanel");
			mousePanel.setBackground(Color.WHITE);

		}

		@Override
		public void mousePressed(MouseEvent event) {
			statusBar.setText(String.format("Pressed at [%d, %d]", event.getX(), event.getY()));

		}

		@Override
		public void mouseReleased(MouseEvent event) {
			statusBar.setText(String.format("Released at [%d, %d]", event.getX(), event.getY()));

		}

	}

}
