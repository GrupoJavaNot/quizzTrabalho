package interfaceGrafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class IG_Perguntas extends JFrame {

	private JPanel pnlTelaInicial;


	public IG_Perguntas() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 520);
		pnlTelaInicial = new JPanel();
		pnlTelaInicial.setBorder(new EmptyBorder(5, 5, 5, 5));
		setLocationRelativeTo(null);
		setContentPane(pnlTelaInicial);
		pnlTelaInicial.setLayout(null);
		
		
		JLabel lblPergunta = new JLabel("1) Qual a capital de Sao Paulo?");
		lblPergunta.setForeground(Color.WHITE);
		lblPergunta.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblPergunta.setBounds(149, 81, 317, 42);
		pnlTelaInicial.add(lblPergunta);
		
		JRadioButton rdbtnSaoPaulo = new JRadioButton("Sao Paulo");
		rdbtnSaoPaulo.setBounds(159, 131, 109, 23);
		pnlTelaInicial.add(rdbtnSaoPaulo);
		
		JRadioButton radioButton = new JRadioButton("Sao Paulo");
		radioButton.setBounds(169, 157, 109, 23);
		pnlTelaInicial.add(radioButton);
		
		ButtonGroup quiz = new ButtonGroup();
		quiz.add(rdbtnSaoPaulo);
		quiz.add(radioButton);
		
		JButton btnProxima = new JButton("Proxima");
		btnProxima.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent arg0) {
				lblPergunta.setText("Teste 2");
			}
		});
		btnProxima.setBounds(272, 197, 89, 23);
		pnlTelaInicial.add(btnProxima);
		
		JLabel lblBackground = new JLabel("");
		lblBackground.setIcon(new ImageIcon("C:\\Users\\104969\\Desktop\\Trabalho Programador\\24 - Desafio da semana\\Resources\\BG_TelaInicial.jpg"));
		lblBackground.setBounds(0, 0, 750, 520);
		pnlTelaInicial.add(lblBackground);
	}
}
