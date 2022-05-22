package br.com.guis;

import java.awt.Graphics;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class DrawPanel extends JPanel{
	
	// Desenha um X a partir dos cantos do painel
	public void paintComponent(Graphics g) {
		
		// Chama paintComponent para assegurar que o painel é exibido corretamente
		super.paintComponent(g);
		
		int width = getWidth(); // Largura total
		int height = getHeight(); // Altura total
		
		// Desenha uma linha a partit do canto superior esquerdo até o inferior direito
		g.drawLine(0, 0, width, height);
		
		// Desenha uma linha a partir do canto inferior esquerdo até o superior direito
		g.drawLine(0, height , width, 0);
	}
}
