package br.com.universidade.control;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.com.universidade.model.Student;

public class StudentAVGGUI {
	
	public static void main(String[] args) throws NumberFormatException {
		
		
		Student student = new Student("",0);
		
		JTextField nota1 = new JTextField();
		JTextField nota2 = new JTextField();
		JTextField nota3 = new JTextField();
		JTextField nota4 = new JTextField();
		JTextField nota5 = new JTextField();
		
		Object[] notas = {
			"Análise e Desenvolvimento", nota1,
			"Redes de Segurança", nota2,
			"Sistema da informação", nota3,
			"Lógica de algoritimo", nota4,
			"Sistemas legados", nota5
		};
		
		double converte1 = Double.parseDouble(nota1.getText());
		student.setAverage(converte1);
		
		double converte2 = Double.parseDouble(nota1.getText());
		student.setAverage(converte2);
		
		double converte3 = Double.parseDouble(nota1.getText());
		student.setAverage(converte3);
		
		double converte4 = Double.parseDouble(nota1.getText());
		student.setAverage(converte4);
		
		double converte5 = Double.parseDouble(nota1.getText());
		student.setAverage(converte5);
		
		
		JOptionPane.showConfirmDialog(null, notas, "Avaliação", JOptionPane.OK_CANCEL_OPTION);
		
	}

}
