package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import javax.swing.JToolBar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		frame.setBounds(100, 100, 658, 442);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) panel.getLayout();
		flowLayout.setAlignOnBaseline(true);
		panel.setBounds(578, 54, 50, 50);
		frame.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		FlowLayout flowLayout_1 = (FlowLayout) panel_1.getLayout();
		flowLayout_1.setAlignOnBaseline(true);
		panel_1.setBounds(578, 114, 50, 50);
		frame.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(578, 175, 50, 50);
		frame.getContentPane().add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(578, 233, 50, 50);
		frame.getContentPane().add(panel_3);
		
		JPanel panel_3_1 = new JPanel();
		panel_3_1.setBounds(578, 293, 50, 50);
		frame.getContentPane().add(panel_3_1);
		
		JPanel panel_3_2 = new JPanel();
		panel_3_2.setBounds(578, 350, 50, 50);
		frame.getContentPane().add(panel_3_2);
		
		JToolBar toolbar = new JToolBar();
		toolbar.setRollover(true);
		toolbar.setForeground(new Color(0, 0, 0));
		toolbar.setBackground(new Color(128, 0, 128));
		toolbar.setBounds(20, 12, 608, 30);
		frame.getContentPane().add(toolbar);
		
		JLabel lblPhotofilter = new JLabel("PhotoFilters");
		lblPhotofilter.setForeground(new Color(255, 255, 255));
		toolbar.add(lblPhotofilter);
		
		
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(160, 54, 395, 289);
		frame.getContentPane().add(panel_4);
		
		JButton btnSave = new JButton("save");
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setBackground(new Color(128, 0, 128));
		btnSave.setBounds(295, 362, 117, 25);
		frame.getContentPane().add(btnSave);
		
		JButton btnSave_1 = new JButton("Open Image");
		btnSave_1.setBounds(20, 108, 120, 26);
		frame.getContentPane().add(btnSave_1);
		btnSave_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSave_1.setForeground(Color.WHITE);
		btnSave_1.setBackground(new Color(128, 0, 128));
		
		JButton btnSave_1_1 = new JButton("Load url");
		btnSave_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSave_1_1.setForeground(Color.WHITE);
		btnSave_1_1.setBackground(new Color(128, 0, 128));
		btnSave_1_1.setBounds(20, 227, 120, 26);
		frame.getContentPane().add(btnSave_1_1);
	}
}
