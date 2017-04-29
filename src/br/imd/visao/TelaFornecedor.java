package br.imd.visao;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.imd.modelo.Fornecedor;


public class TelaFornecedor extends JInternalFrame implements ActionListener{
	
	// rótulos
	JLabel lcodigo =  new JLabel("Código.:");
	JLabel lnome = new JLabel("Nome.:");
	JLabel lcnpj =   new JLabel("CNPJ..:");
			
	// campos
	JTextField tcodigo  = new JTextField();
	JTextField tnome = new JTextField();
	JTextField tcnpj   = new JTextField();
			
	// botões
	JButton b1 = new JButton("Submeter");
	JButton b2 = new JButton("Limpar");

	public TelaFornecedor(String str)  {
		super(str,false,true);
		
		Container ct = this.getContentPane();
		ct.setLayout(null);
			
		// coordenadas
		lcodigo.setBounds(10,10,100,30);
		tcodigo.setBounds(55,10,100,25);
		lnome.setBounds(10,40,100,30);
		tnome.setBounds(55,40,200,25);
		lcnpj.setBounds(10,70,100,30);
		tcnpj.setBounds(55,70,100,25);

		// idem
		b1.setBounds(10 ,140,100,30);
		b2.setBounds(120,140,100,30);
				
		// adicionando componentes
		ct.add(lcodigo);
		ct.add(tcodigo);
		ct.add(lnome);
		ct.add(tnome);
		ct.add(lcnpj);
		ct.add(tcnpj);
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
			Fornecedor fornecedor = new Fornecedor(tcodigo.getText(), 
			tnome.getText(), tcnpj.getText());
		}
		
		tcodigo.setText("");
		tnome.setText("");
		tcnpj.setText("");
	}
}
