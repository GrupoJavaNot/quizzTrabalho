package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;

public class IG_TelaInicial extends JFrame {

	private JPanel pnlTelaInicial;
	private JTextField txtNome;


	public IG_TelaInicial() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 520);
		pnlTelaInicial = new JPanel();
		pnlTelaInicial.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(pnlTelaInicial);
		pnlTelaInicial.setLayout(null);
		
		
		JLabel lblNomeJogador = new JLabel("Digite o seu nome");
		lblNomeJogador.setForeground(Color.WHITE);
		lblNomeJogador.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNomeJogador.setBounds(64, 316, 148, 42);
		pnlTelaInicial.add(lblNomeJogador);
		
		txtNome = new JTextField();
		txtNome.setBounds(64, 353, 148, 33);
		pnlTelaInicial.add(txtNome);
		txtNome.setColumns(10);
		
		JLabel lblSelcioneACategoria = new JLabel("Categoria");
		lblSelcioneACategoria.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelcioneACategoria.setForeground(Color.WHITE);
		lblSelcioneACategoria.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSelcioneACategoria.setBounds(109, 402, 148, 42);
		pnlTelaInicial.add(lblSelcioneACategoria);
		
		JComboBox comboCategoria = new JComboBox();
		comboCategoria.setBounds(109, 442, 148, 33);
		pnlTelaInicial.add(comboCategoria);
		
		JButton btnNewButton = new JButton("ENTRAR");
		btnNewButton.setBackground(Color.DARK_GRAY);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton.setBounds(307, 379, 153, 53);
		pnlTelaInicial.add(btnNewButton);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon("C:\\Users\\104969\\Desktop\\Trabalho Programador\\24 - Desafio da semana\\Resources\\BG_TelaInicial.jpg"));
		lblBackground.setBounds(0, 0, 750, 520);
		pnlTelaInicial.add(lblBackground);
	}
}
