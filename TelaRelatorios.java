package br.imd.visao;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import br.imd.controle.Banco;
import br.imd.modelo.Produto;

public class TelaRelatorios extends JInternalFrame{
	
	JTextArea ta = new JTextArea(10,20);
	Banco bc;
	
	public TelaRelatorios(String str, Banco bc)  {
		super(str,true,true);
		
		Container ct = this.getContentPane();
		ct.setLayout(new BorderLayout());
	
		this.bc = bc;
		ta.append(bc.toString());
		
		setVisible(true);
		getContentPane().add(new JScrollPane(ta));
		
		// especificações do formulário
		setSize(350,230);
		setTitle(str);
	}
}
