package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JPanel;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.JToolBar;
import javax.swing.filechooser.FileNameExtensionFilter;



import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;

public class Gui {

	private JFrame frame;
JLabel label;
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
		
		JToolBar toolbar = new JToolBar();
		toolbar.setRollover(true);
		toolbar.setForeground(new Color(0, 0, 0));
		toolbar.setBackground(new Color(128, 0, 128));
		toolbar.setBounds(20, 12, 608, 30);
		frame.getContentPane().add(toolbar);
		
		JLabel lblPhotofilter = new JLabel("PhotoFilters");
		lblPhotofilter.setForeground(new Color(255, 255, 255));
		toolbar.add(lblPhotofilter);
		
		JButton btnSave = new JButton("save");
		btnSave.setForeground(new Color(255, 255, 255));
		btnSave.setBackground(new Color(128, 0, 128));
		btnSave.setBounds(295, 362, 117, 25);
		frame.getContentPane().add(btnSave);
		
		JButton openFile = new JButton("Open Image");
		openFile.setBounds(20, 108, 120, 26);
		frame.getContentPane().add(openFile);
		openFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				  JFileChooser file= new JFileChooser();
				  file.setCurrentDirectory(new File(System.getProperty("user.home")));
				  FileNameExtensionFilter filter = new FileNameExtensionFilter("*.images","png","jpg");
				  file.addChoosableFileFilter(filter);
				  int result= file.showSaveDialog(null);
				  if(result== JFileChooser.APPROVE_OPTION) {
					  File selectedFile= file.getSelectedFile();
					  String path= selectedFile.getAbsolutePath();
					  label.setIcon(ResizeImage(path));
				  }else if (result==JFileChooser.CANCEL_OPTION) {
					  System.out.println("No file selected");
				  }
			}
		});
		openFile.setForeground(Color.WHITE);
		openFile.setBackground(new Color(127, 0, 128));
		
		JButton btnSave_1_1 = new JButton("Load url");
		btnSave_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSave_1_1.setForeground(Color.WHITE);
		btnSave_1_1.setBackground(new Color(128, 0, 128));
		btnSave_1_1.setBounds(20, 227, 120, 26);
		frame.getContentPane().add(btnSave_1_1);
		
		JButton btnNewButton = new JButton();
		btnNewButton.setBounds(578, 54, 50, 49);
		  try {
			    Image img = ImageIO.read(getClass().getResource("/cat.png"));
			    Image newimg = img.getScaledInstance( btnNewButton.getWidth(), btnNewButton.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ; 
			    btnNewButton.setIcon(new ImageIcon(newimg));
			  } catch (Exception ex) {
			    System.out.println(ex);
			  }
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton();
		btnNewButton_1.setBounds(578, 110, 50, 49);
		  try {
			    Image img = ImageIO.read(getClass().getResource("/artifacter.png"));
			    Image newimg = img.getScaledInstance( btnNewButton_1.getWidth(), btnNewButton_1.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ; 
			    btnNewButton_1.setIcon(new ImageIcon(newimg));
			  } catch (Exception ex) {
			    System.out.println(ex);
			  }
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton();
		btnNewButton_2.setBounds(578, 170, 50, 49);
		  try {
			    Image img = ImageIO.read(getClass().getResource("/rainbow.png"));
			    Image newimg = img.getScaledInstance( btnNewButton_2.getWidth(), btnNewButton_2.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ; 
			    btnNewButton_2.setIcon(new ImageIcon(newimg));
			  } catch (Exception ex) {
			    System.out.println(ex);
			  }
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton();
		btnNewButton_3.setBounds(578, 229, 50, 49);
		  try {
			    Image img = ImageIO.read(getClass().getResource("/repeater.png"));
			    Image newimg = img.getScaledInstance( btnNewButton_3.getWidth(), btnNewButton_3.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ; 
			    btnNewButton_3.setIcon(new ImageIcon(newimg));
			  } catch (Exception ex) {
			    System.out.println(ex);
			  }
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton();
		btnNewButton_4.setBounds(578, 289, 50, 49);
		  try {
			    Image img = ImageIO.read(getClass().getResource("/--rgb-shifter.png"));
			    Image newimg = img.getScaledInstance( btnNewButton_4.getWidth(), btnNewButton_4.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ; 
			    btnNewButton_4.setIcon(new ImageIcon(newimg));
			  } catch (Exception ex) {
			    System.out.println(ex);
			  }
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton();
		btnNewButton_5.setBounds(578, 343, 50, 49);
		  try {
			    Image img = ImageIO.read(getClass().getResource("/--rgb-shift-repeater.png"));
			    Image newimg = img.getScaledInstance( btnNewButton_5.getWidth(), btnNewButton_5.getHeight(),  java.awt.Image.SCALE_SMOOTH ) ; 
			    btnNewButton_5.setIcon(new ImageIcon(newimg));
			  } catch (Exception ex) {
			    System.out.println(ex);
			  }
		frame.getContentPane().add(btnNewButton_5);
		
		label = new JLabel();
		label.setBounds(195, 108, 326, 198);
		frame.getContentPane().add(label);
	}
	  public ImageIcon ResizeImage(String ImagePath) {
		  ImageIcon MyImage=new ImageIcon(ImagePath);
		  Image img=MyImage.getImage();
		  Image newImg=img.getScaledInstance(label.getWidth(), label.getHeight(), Image.SCALE_SMOOTH);
		  ImageIcon image= new ImageIcon(newImg);
		  return image;
	  }
	  
}