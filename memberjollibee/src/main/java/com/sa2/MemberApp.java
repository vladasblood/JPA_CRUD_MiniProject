package com.sa2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.Image;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;
import javax.swing.SwingConstants;
import javax.swing.border.TitledBorder;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Toolkit;


import javax.swing.border.EtchedBorder;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MemberApp {

	private JFrame frame;
	private JTextField txtPosition;
	private JTextField txtID;
	private JTextField txtfName;
	private JTextField txtmName;
	private JTextField txtlName;
	private JTextField txtAddress;
	private JTextField txtSearchID;
    //private JButton readBtn, updateBtn, deleteBtn, clearBtn, submitBtn;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MemberApp window = new MemberApp();
					
					window.frame.setVisible(true);
					window.frame.pack();
					window.frame.setLocationRelativeTo(null);	
					
				} catch (Exception e) {
					e.printStackTrace();
				} 
				
			}
		});
		
	}

	/**
	 * Create the application.
	 */
	public MemberApp() {

		initialize();
		
		}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
        
        //final JButton readBtn, updateBtn, deleteBtn, clearBtn, submitBtn;

		frame = new JFrame("Jollibee Foods Corporation - CRUD Operation");
		JOptionPane.showMessageDialog(frame.getContentPane(), "Click Employee's Action: Query or New" );
		
		Image ficon = Toolkit.getDefaultToolkit().getImage(System.getProperty("user.dir") + "\\img\\jolli.png\\");
		frame.setIconImage(ficon);
		
		BorderLayout borderLayout = (BorderLayout) frame.getContentPane().getLayout();
		frame.setBounds(100, 100, 700, 600);
		frame.setPreferredSize(new Dimension (700,600));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel MainPanel = new JPanel();
		MainPanel.setBackground(new Color(65, 56, 58));
		MainPanel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(0, 0, 0), new Color(224, 22, 61)), "Personal Information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		frame.getContentPane().add(MainPanel, BorderLayout.CENTER);
		MainPanel.setLayout(new GridLayout(6, 2, 0, 15));
		
		
		JLabel labelID = new JLabel("ID");
		labelID.setForeground(new Color(224, 22, 61));
		labelID.setFont(new Font("Dubai", Font.BOLD, 16));
		MainPanel.add(labelID);
		
		txtID = new JTextField();
		txtID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {

				char key_input = e.getKeyChar();
				
				if(key_input >= '0' && key_input <= '9') {
					txtID.setEditable(true);
				}
				else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE) {
						txtID.setEditable(true);
					} else {
						txtID.setEditable(false);
					}
				}
				
			}
		});
		
		txtID.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtID.setEnabled(false);
		MainPanel.add(txtID);
		txtID.setColumns(10);
		
		JLabel labelPosition = new JLabel("Position");
		labelPosition.setForeground(new Color(224, 22, 61));
		labelPosition.setFont(new Font("Dubai", Font.BOLD, 16));
		MainPanel.add(labelPosition);
		
		txtPosition = new JTextField();
		txtPosition.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				char key_input = e.getKeyChar();
				
				if(key_input >= 'A' && key_input <= 'Z' || key_input >= 'a' && key_input <= 'z') {
					txtPosition.setEditable(true);
				}
				else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE) {
						txtPosition.setEditable(true);
					} else {
						txtPosition.setEditable(false);
					}
				}
				
			}
		});
		txtPosition.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtPosition.setEnabled(false);
		MainPanel.add(txtPosition);
		txtPosition.setColumns(10);
		
		JLabel labelfName = new JLabel("First Name");
		labelfName.setForeground(new Color(224, 22, 61));
		labelfName.setFont(new Font("Dubai", Font.BOLD, 16));
		MainPanel.add(labelfName);
		
		txtfName = new JTextField();
		txtfName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				char key_input = e.getKeyChar();
				
				if(key_input >= 'A' && key_input <= 'Z' || key_input >= 'a' && key_input <= 'z') {
					txtfName.setEditable(true);
				}
				else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE) {
						txtfName.setEditable(true);
					} else {
						txtfName.setEditable(false);
					}
				}
				
			}
		});
		txtfName.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtfName.setEnabled(false);
		MainPanel.add(txtfName);
		txtfName.setColumns(10);
		
		JLabel labelmName = new JLabel("Middle Name");
		labelmName.setForeground(new Color(224, 22, 61));
		labelmName.setFont(new Font("Dubai", Font.BOLD, 16));
		MainPanel.add(labelmName);
		
		txtmName = new JTextField();
		txtmName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				char key_input = e.getKeyChar();
				
				if(key_input >= 'A' && key_input <= 'Z' || key_input >= 'a' && key_input <= 'z') {
					txtmName.setEditable(true);
				}
				else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE) {
						txtmName.setEditable(true);
					} else {
						txtmName.setEditable(false);
					}
				}
				
			}
		});
		txtmName.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtmName.setEnabled(false);
		MainPanel.add(txtmName);
		txtmName.setColumns(10);
		
		JLabel labellName = new JLabel("Last Name");
		labellName.setForeground(new Color(224, 22, 61));
		labellName.setFont(new Font("Dubai", Font.BOLD, 16));
		MainPanel.add(labellName);
		
		txtlName = new JTextField();
		txtlName.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				char key_input = e.getKeyChar();
				
				if(key_input >= 'A' && key_input <= 'Z' || key_input >= 'a' && key_input <= 'z') {
					txtlName.setEditable(true);
				}
				else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE) {
						txtlName.setEditable(true);
					} else {
						txtlName.setEditable(false);
					}
				}
				
			}
		});
		txtlName.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtlName.setEnabled(false);
		MainPanel.add(txtlName);
		txtlName.setColumns(10);
		
		JLabel labelAddress = new JLabel("Address");
		labelAddress.setForeground(new Color(224, 22, 61));
		labelAddress.setFont(new Font("Dubai", Font.BOLD, 16));
		MainPanel.add(labelAddress);
		
		txtAddress = new JTextField();
		txtAddress.setFont(new Font("Calibri", Font.PLAIN, 15));
		txtAddress.setEnabled(false);
		MainPanel.add(txtAddress);
		txtAddress.setColumns(10);
		
		JPanel Buttons = new JPanel();
		Buttons.setBackground(new Color(65, 56, 58));
		frame.getContentPane().add(Buttons, BorderLayout.EAST);
		GridBagLayout gbl_Buttons = new GridBagLayout();
		gbl_Buttons.rowHeights = new int[] {75};
		gbl_Buttons.columnWidths = new int[] {30, 30, 30};
		gbl_Buttons.columnWeights = new double[]{0.0, 0.0};
		gbl_Buttons.rowWeights = new double[]{0.0, 0.0, 0.0};
		Buttons.setLayout(gbl_Buttons);
		
		final JButton submitBtn = new JButton("CREATE");
		submitBtn.setForeground(new Color(255, 255, 255));
		submitBtn.setFont(new Font("DialogInput", Font.BOLD, 18));
		submitBtn.setBackground(new Color(35, 31, 32));
		submitBtn.setEnabled(false);
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtID.getText().trim().isEmpty() 
						|| txtPosition.getText().trim().isEmpty() || txtfName.getText().trim().isEmpty() ||
						txtmName.getText().trim().isEmpty() || txtlName.getText().trim().isEmpty() ||
						txtAddress.getText().trim().isEmpty()
				) {
					JOptionPane.showMessageDialog(frame.getContentPane(), "Fill up Necessary details!");
				}
				else {			
		
					EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
							.createEntityManagerFactory("memberjollibee");
					
					EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
					EntityTransaction et = null;
					System.out.println("EM:" + em.isOpen());
					
					//new
					int createID = Integer.parseInt(txtID.getText());
					
					try {
						
						et = em.getTransaction();
						
						et.begin();		
							
						Member mem  = new Member();

						mem.setId(Integer.parseInt(txtID.getText()));
					
						mem.setPosition(txtPosition.getText());
						
						mem.setfName(txtfName.getText());
						
						mem.setmName(txtmName.getText());

						mem.setlName(txtlName.getText());
						
						mem.setAddress(txtAddress.getText());
					
						em.persist(mem);
						et.commit();	
						
						JOptionPane.showMessageDialog(frame.getContentPane(), "Employee Added Successfully!");
						
						txtID.setText("");
						txtPosition.setText("");
						txtfName.setText("");
						txtmName.setText("");
						txtlName.setText("");
						txtAddress.setText("");
						
					} catch (Exception ex) {
						txtID.setText("");
						JOptionPane.showMessageDialog(frame.getContentPane(), "ID Already Existed!");
						
					} finally {
						em.close();
						ENTITY_MANAGER_FACTORY.close();
					}			
				}
			}
		});
		GridBagConstraints gbc_submitBtn = new GridBagConstraints();
		gbc_submitBtn.ipady = 30;
		gbc_submitBtn.fill = GridBagConstraints.HORIZONTAL;
		gbc_submitBtn.anchor = GridBagConstraints.NORTH;
		gbc_submitBtn.gridx = 1;
		gbc_submitBtn.gridy = 0;
		Buttons.add(submitBtn, gbc_submitBtn);
		
		final JButton clearBtn = new JButton("CLEAR TEXT");
		clearBtn.setForeground(new Color(255, 255, 255));
		clearBtn.setFont(new Font("DialogInput", Font.BOLD, 18));
		clearBtn.setBackground(new Color(35, 31, 32));
		clearBtn.setEnabled(false);
		clearBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtID.setText("");
				txtPosition.setText("");
				txtfName.setText("");
				txtmName.setText("");
				txtlName.setText("");
				txtAddress.setText("");
			}
		});
		GridBagConstraints gbc_clearBtn = new GridBagConstraints();
		gbc_clearBtn.ipady = 30;
		gbc_clearBtn.anchor = GridBagConstraints.NORTHWEST;
		gbc_clearBtn.gridx = 1;
		gbc_clearBtn.gridy = 2;
		Buttons.add(clearBtn, gbc_clearBtn);
		
		JPanel Jollibee = new JPanel();
		Jollibee.setBackground(new Color(35, 31, 32));
		frame.getContentPane().add(Jollibee, BorderLayout.NORTH);
		Jollibee.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		ImageIcon li = new ImageIcon(System.getProperty("user.dir") + "\\img\\jolli.png");
		Image img = (li).getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		li = new ImageIcon(img);
		lblNewLabel_2.setIcon(li);
		Jollibee.add(lblNewLabel_2);
		
		JLabel lblNewLabel = new JLabel("Jollibee");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Gill Sans Ultra Bold", Font.PLAIN, 50));
		Jollibee.add(lblNewLabel);

		JPanel Query = new JPanel();
		frame.getContentPane().add(Query, BorderLayout.SOUTH);
		Query.setLayout(new GridLayout(4, 1, 0, 0));
		
		JPanel searchID = new JPanel();
		searchID.setBackground(new Color(35, 31, 32));
		Query.add(searchID);
		searchID.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 5));
		
		JLabel lblNewLabel_1 = new JLabel("Search ID");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setForeground(new Color(224, 22, 61));
		lblNewLabel_1.setFont(new Font("Dubai", Font.BOLD, 16));
		searchID.add(lblNewLabel_1);
		
		txtSearchID = new JTextField();
		txtSearchID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				char key_input = e.getKeyChar();
				
				if(key_input >= '0' && key_input <= '9') {
					txtSearchID.setEditable(true);
				}
				else {
					if(e.getExtendedKeyCode()==KeyEvent.VK_BACK_SPACE) {
						txtSearchID.setEditable(true);
					} else {
						txtSearchID.setEditable(false);
					}
				}
				
			}
		});
		txtSearchID.setBackground(new Color(255, 255, 255));
		txtSearchID.setForeground(new Color(35, 31, 32));
		txtSearchID.setFont(new Font("Calibri", Font.BOLD, 15));
		txtSearchID.setEnabled(false);
		searchID.add(txtSearchID);
		txtSearchID.setColumns(10);
		
		
		
		////////////////////////////////----------RESULT PANEL-------------------
		
		
		JPanel Result = new JPanel();
		Result.setBackground(new Color(65, 56, 58));
		Query.add(Result);
		
		/////////////////////////-----UPDATE
		
		final JButton updateBtn = new JButton("UPDATE");
		updateBtn.setForeground(new Color(255, 255, 255));
		updateBtn.setBackground(new Color(35, 31, 32));
		updateBtn.setFont(new Font("DialogInput", Font.BOLD, 18));
		updateBtn.setEnabled(false);
		updateBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(txtPosition.getText().trim().isEmpty() || txtfName.getText().trim().isEmpty() ||
						txtmName.getText().trim().isEmpty() || txtlName.getText().trim().isEmpty() ||
						txtAddress.getText().trim().isEmpty()
				) {
					JOptionPane.showMessageDialog(frame.getContentPane(), "Fill up Necessary details!");
				} 
				else {
					EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
							.createEntityManagerFactory("memberjollibee");
					
					EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
					EntityTransaction et = null;
					
					
					try {
						
						et = em.getTransaction();
						
						et.begin();			
						
						int getID = Integer.parseInt(txtSearchID.getText());
						
						Member preMem = em.find(Member.class, getID);
										
						em.detach(preMem);
			
						Member mem  = em.find(Member.class, getID);
						
						preMem.setPosition(txtPosition.getText());
						preMem.setfName(txtfName.getText());
						preMem.setmName(txtmName.getText());
						preMem.setlName(txtlName.getText());
						preMem.setAddress(txtAddress.getText());
						
						em.merge(preMem);
						et.commit();	
						
						JOptionPane.showMessageDialog(null, "ID: " + getID + " has been updated!");
								
					}catch(Exception exs){
						if (et != null) {
							et.rollback();
						}
						
						JOptionPane.showMessageDialog(frame.getContentPane(), "Your Searched ID does not exist in the Database!");
						
					} finally {
						em.close();
						ENTITY_MANAGER_FACTORY.close();
					}
				}
			}
		});
		Result.add(updateBtn);
		
/////////////////////////-----DELETE
		
		final JButton deleteBtn = new JButton("DELETE");
		deleteBtn.setForeground(new Color(255, 255, 255));
		deleteBtn.setBackground(new Color(35, 31, 32));
		deleteBtn.setFont(new Font("DialogInput", Font.BOLD, 18));
		deleteBtn.setEnabled(false);
		deleteBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
						.createEntityManagerFactory("memberjollibee");
				
				EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
				EntityTransaction et = null;
				
				try {
					
					et = em.getTransaction();
					
					et.begin();		
					int getID = Integer.parseInt(txtSearchID.getText());
					
					Member mem = em.find(Member.class, getID);
					
					//Test-cases
					System.out.println(getID);
					System.out.println(mem.getId());
					
					em.remove(mem);
					
					et.commit();
					
					txtPosition.setEnabled(false);
					txtfName.setEnabled(false);
					txtmName.setEnabled(false);
					txtlName.setEnabled(false);
					txtAddress.setEnabled(false);
					 
					JOptionPane.showMessageDialog(frame.getContentPane(), "ID: " + getID + " is now deleted!");
					
				} catch (Exception exes) {
					
					if (et != null) {
						et.rollback();
					}
					
					JOptionPane.showMessageDialog(null, "Search ID is Unavailable!");
					
				} finally {
					em.close();
					ENTITY_MANAGER_FACTORY.close();
				}
				
			}
			
		});
		
		Result.add(deleteBtn);

/////////////////////////-----READ
		
		final JButton readBtn = new JButton("READ");
		searchID.add(readBtn);
		readBtn.setForeground(new Color(255, 255, 255));
		readBtn.setBackground(new Color(35, 31, 32));
		readBtn.setFont(new Font("DialogInput", Font.BOLD, 18));
		readBtn.setEnabled(false);
		readBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				updateBtn.setEnabled(true);
				deleteBtn.setEnabled(true);
				txtPosition.setEnabled(true);
				txtfName.setEnabled(true);
				txtmName.setEnabled(true);
				txtlName.setEnabled(true);
				txtAddress.setEnabled(true);
				clearBtn.setEnabled(true);
				
				EntityManagerFactory ENTITY_MANAGER_FACTORY = Persistence
						.createEntityManagerFactory("memberjollibee");
				
				EntityManager em = ENTITY_MANAGER_FACTORY.createEntityManager();
				EntityTransaction et = null;
				
				int readID = Integer.parseInt(txtSearchID.getText());
				
				try {
					
					et = em.getTransaction();
					
					et.begin();			
					Member mem  = em.find(Member.class, readID);
					
					txtPosition.setText(mem.getPosition());
					txtfName.setText(mem.getfName());
					txtmName.setText(mem.getmName());
					txtlName.setText(mem.getlName());
					txtAddress.setText(mem.getAddress());
					
					em.persist(mem);
					et.commit();	
					
					JOptionPane.showMessageDialog(null, "ID: " + readID + " has been found!");
								
				}catch(Exception exs){
					if (et != null) {
						et.rollback();
					}
					
					JOptionPane.showMessageDialog(frame.getContentPane(), "Your Searched ID does not exist in the Database!");
					
					//exs.printStackTrace();
				} finally {
					em.close();
					ENTITY_MANAGER_FACTORY.close();
				}
				
			}
		});
		
////////////////////////////////----------QUERY PANEL-------------------
		
/////////////////////////-----QUERY EMPLOYEE
		
		JButton EnableQuery = new JButton("QUERY EMPLOYEE");
		EnableQuery.setFont(new Font("Dubai Medium", Font.PLAIN, 20));
		EnableQuery.setForeground(new Color(224, 22, 61));
		EnableQuery.setBackground(new Color(35, 31, 32));
		EnableQuery.setOpaque(true);
	
		EnableQuery.setFocusPainted(false);

		//EnableQuery.set
		EnableQuery.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				//Enable
				readBtn.setEnabled(true);		
				txtSearchID.setEnabled(true);
				
				//Disable
				txtID.setEnabled(false);
				submitBtn.setEnabled(false);
				txtPosition.setEnabled(false);
				txtfName.setEnabled(false);
				txtmName.setEnabled(false);
				txtlName.setEnabled(false);
				txtAddress.setEnabled(false);
				clearBtn.setEnabled(false);
				
//				JButton sourceQuery = (JButton) e.getSource();
//				sourceQuery.setBackground(Color.WHITE);
			}
		});
		Query.add(EnableQuery);
		
/////////////////////////-----NEW EMPLOYEE
		
		JButton btnNewButton = new JButton("NEW EMPLOYEE");
		btnNewButton.setFont(new Font("Dubai Medium", Font.PLAIN, 20));
		btnNewButton.setOpaque(true);
		btnNewButton.setFocusPainted(false);
		btnNewButton.setForeground(new Color(224, 22, 61));
		btnNewButton.setBackground(new Color(35, 31, 32));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Enable
				submitBtn.setEnabled(true);
				clearBtn.setEnabled(true);
				txtID.setEnabled(true);
				txtID.setText("");
				
				txtPosition.setEnabled(true);
				txtPosition.setText("");
				
				txtfName.setEnabled(true);
				txtfName.setText("");
				
				txtmName.setEnabled(true);
				txtmName.setText("");
				
				txtlName.setEnabled(true);
				txtlName.setText("");
				
				txtAddress.setEnabled(true);
				txtAddress.setText("");
				
				//Disable
				readBtn.setEnabled(false);
				updateBtn.setEnabled(false);
				deleteBtn.setEnabled(false);
				txtSearchID.setEnabled(false);

			}
		});
		Query.add(btnNewButton);
	}
	
}


