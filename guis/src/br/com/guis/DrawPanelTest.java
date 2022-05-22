package br.com.guis;

import javax.swing.JFrame;

public class DrawPanelTest {
	
	public static void main(String[] args) {
		
		// Cria um painel que contém nosso desenho
		DrawPanel panel = new DrawPanel();
		
		// Cria um novo quadro para armazenar o painel
		JFrame application = new JFrame();
		
		// Configura o frame para ser encerrado quando ele é fechado
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		application.add(panel); // Adiciona o painel ao frame
		application.setSize(250, 250); // Configura o tamanho do frame
		application.setVisible(true); // Torna o frame visível
	}

}
