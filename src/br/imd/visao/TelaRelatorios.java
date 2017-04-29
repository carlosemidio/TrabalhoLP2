package br.imd.visao;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;

import br.imd.modelo.Produto;

public class TelaRelatorios extends JInternalFrame implements ActionListener{
	JButton b = new JButton("Geral");
	
	public TelaRelatorios(String str)  {
		super(str,false,true);
		
		Container ct = this.getContentPane();
		ct.setLayout(null);
			

		// idem
		b.setBounds(10 ,140,100,30);

				
		// adicionando componentes
		ct.add(b);
		
		// evento dos botões
		b1.addActionListener(this);		
		b2.addActionListener(this);
		
		// especificações do formulário
		setSize(350,230);
		setTitle(str);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1){
			Produto fornecedor = new Produto(tcodigo.getText(), 
			tdescricao.getText(), tunidade.getText());
		}
		
		tcodigo.setText("");
		tdescricao.setText("");
		tunidade.setText("");
	}
}
