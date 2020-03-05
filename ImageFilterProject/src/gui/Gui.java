package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JToolBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Gui {

	private JFrame frame;

	/**hiroko.com, jhipster.tech, jdlstudio, boilerplate
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gui window = new Gui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 250, 250));
		frame.getContentPane().setBackground(new Color(221, 160, 221));
		frame.setBounds(100, 100, 578, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	
		JLabel image = new JLabel( new ImageIcon("cat.png"));
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignOnBaseline(true);
		panel.setBounds(500, 45, 50, 50);
		

		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setAlignOnBaseline(true);
		panel_1.setBounds(500, 107, 50, 50);
	//	panel_1.add( image, BorderLayout.CENTER);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(500, 169, 50, 50);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(500, 231, 50, 50);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(500, 294, 50, 50);
		frame.getContentPane().add(panel_3_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBounds(500, 355, 50, 50);
		frame.getContentPane().add(panel_3_2);
		
		JToolBar toolBar = new JToolBar();
		toolBar.setForeground(new Color(255, 255, 255));
		toolBar.setBackground(new Color(128, 0, 128));
		toolBar.setBounds(20, 12, 538, 19);
		frame.getContentPane().add(toolBar);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(20, 55, 442, 264);
		frame.getContentPane().add(panel_4);
		
		JButton btnSave = new JButton("save");
		btnSave.setBackground(new Color(128, 0, 128));
		btnSave.setBounds(188, 355, 117, 25);
		frame.getContentPane().add(btnSave);
	}
}
