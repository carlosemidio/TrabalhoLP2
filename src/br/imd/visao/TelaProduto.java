package br.imd.visao;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.imd.modelo.Fornecedor;
import br.imd.modelo.Produto;

public class TelaProduto extends JInternalFrame implements ActionListener{

	// rótulos
	JLabel lcodigo =  new JLabel("Código.:");
	JLabel ldescricao = new JLabel("Descrição.:");
	JLabel lunidade =   new JLabel("Unidade.:");
			
	// campos
	JTextField tcodigo  = new JTextField();
	JTextField tdescricao = new JTextField();
	JTextField tunidade   = new JTextField();
			
	// botões
	JButton b1 = new JButton("Submeter");
	JButton b2 = new JButton("Limpar");

	public TelaProduto(String str)  {
		super(str,false,true);
		
		Container ct = this.getContentPane();
		ct.setLayout(null);
			
		// coordenadas
		lcodigo.setBounds(10,10,100,30);
		tcodigo.setBounds(73,10,100,25);
		ldescricao.setBounds(10,40,150,30);
		tdescricao.setBounds(73,40,200,25);
		lunidade.setBounds(10,70,100,30);
		tunidade.setBounds(73,70,50,25);

		// idem
		b1.setBounds(10 ,140,100,30);
		b2.setBounds(120,140,100,30);
				
		// adicionando componentes
		ct.add(lcodigo);
		ct.add(tcodigo);
		ct.add(ldescricao);
		ct.add(tdescricao);
		ct.add(lunidade);
		ct.add(tunidade);
		ct.add(b1);
		ct.add(b2);
		
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
