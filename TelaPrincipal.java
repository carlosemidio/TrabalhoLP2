package br.imd.visao;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import br.imd.controle.Banco;
import br.imd.modelo.Cliente;
import br.imd.modelo.Fornecedor;
import br.imd.modelo.Produto;

public class TelaPrincipal extends JFrame implements ActionListener{
	
	JDesktopPane dtp = new JDesktopPane();
	
	JMenuBar mnbar   = new JMenuBar();	
	JMenu fileMenu   = new JMenu("Cadastros");
	JMenu fileRels   = new JMenu("Relatórios");
	JMenuItem exitMenu = new JMenuItem("Sair");
	JMenuItem mItem1 = new JMenuItem("Clientes");
	JMenuItem mItem2 = new JMenuItem("Fornecedores");
	JMenuItem mItem3 = new JMenuItem("Produtos");
	JMenuItem mItem4 = new JMenuItem("Geral");
	
	Banco bc = new Banco();
		 		
	public TelaPrincipal(){
		Container ct = this.getContentPane();
		ct.setLayout(new BorderLayout());
		
		setJMenuBar(mnbar);
		mnbar.add(fileMenu);
		mnbar.add(fileRels);
		mnbar.add(exitMenu);

		fileMenu.add(mItem1);
		fileMenu.add(mItem2);
		fileMenu.add(mItem3);
		fileRels.add(mItem4);
		
		ct.add(BorderLayout.CENTER, dtp);
		
		setSize(800,600);
		setResizable(false);
		setTitle("Sistema de Controle de Vendas");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		// eventos
		mItem1.addActionListener(this);	
		mItem2.addActionListener(this);
		mItem3.addActionListener(this);
		mItem4.addActionListener(this);
		exitMenu.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == mItem1){
			TelaCliente tlCliente = new TelaCliente("Clientes", bc);
			dtp.add(tlCliente);
			tlCliente.setVisible(true);
		}
		if (e.getSource() == mItem2){
			TelaFornecedor tlFornecedor = new TelaFornecedor("Fornecedores", bc);
			dtp.add(tlFornecedor);
			tlFornecedor.setVisible(true);
		}
		if (e.getSource() == mItem3){
			TelaProduto tlProduto = new TelaProduto("Produtos", bc);
			dtp.add(tlProduto);
			tlProduto.setVisible(true);
		}
		
		if (e.getSource() == mItem4){
			TelaRelatorios tlRelatorios = new TelaRelatorios("Geral", bc);
			dtp.add(tlRelatorios);
			tlRelatorios.setVisible(true);
		}
		if (e.getSource() == exitMenu) {
			System.exit(0);
		}
	}
	
	public static void main(String[] args) {
		TelaPrincipal telaPai = new TelaPrincipal();
		telaPai.setVisible(true);
	}
}