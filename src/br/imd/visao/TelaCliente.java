package br.imd.visao;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.imd.modelo.Cliente;


public class TelaCliente extends JInternalFrame implements ActionListener{
	
	// r�tulos
	JLabel lnome =  new JLabel("Nome.:");
	JLabel lidade = new JLabel("Idade.:");
	JLabel lcpf =   new JLabel("CPF..:");
	JLabel lrg =    new JLabel("RG...:");
			
	// campos
	JTextField tnome  = new JTextField();
	JTextField tidade = new JTextField();
	JTextField tcpf   = new JTextField();
	JTextField trg    = new JTextField();
			
	// bot�es
	JButton b1 = new JButton("Submeter");
	JButton b2 = new JButton("Limpar");

	public TelaCliente(String str)  {
		super(str,false,true);
		
		Container ct = this.getContentPane();
		ct.setLayout(null);
			
		// coordenadas
		lnome.setBounds(10,10,100,30);
		tnome.setBounds(55,10,280,25);
		lidade.setBounds(10,40,100,30);
		tidade.setBounds(55,40,22,25);
		lcpf.setBounds(10,70,100,30);
		tcpf.setBounds(55,70,100,25);
		lrg.setBounds(10,100,100,30);
		trg.setBounds(55,100,60,25);

		// idem
		b1.setBounds(10 ,140,100,30);
		b2.setBounds(120,140,100,30);
				
		// adicionando componentes
		ct.add(lnome);
		ct.add(tnome);
		ct.add(lidade);
		ct.add(tidade);
		ct.add(lcpf);
		ct.add(tcpf);
		ct.add(lrg);
		ct.add(trg);
		ct.add(b1);
		ct.add(b2);
		
		// evento dos bot�es
		b1.addActionListener(this);		
		b2.addActionListener(this);
		
		// especifica��es do formul�rio
		setSize(350,230);
		setTitle(str);

	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == b1){
			Cliente cliente = new Cliente(tnome.getText(), 
			tidade.getText(), tcpf.getText(), trg.getText());
		}
		
		tnome.setText("");
		tidade.setText("");
		tcpf.setText("");
		trg.setText("");
	}
}
