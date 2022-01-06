package Swing;

import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.ActionEvent;

public class forgot_pass extends JFrame {
	//forgot
	JFrame f3 = new JFrame();
	JLabel lbEnter = new JLabel("Enter code");
	JTextField tfenter = new JTextField(10);
	JButton btCancel3 = new JButton("Cancel");
	JButton btContinue3 = new JButton("Continue");
	//sign up
	JFrame f = new JFrame("Account");
	JLabel lbforgotpass = new JLabel("Account");
	JLabel lb1 = new JLabel();
	JLabel lbName = new JLabel("UserName");
	JTextField tfName = new JTextField(10);
	//Nhap username
	JLabel lbPass = new JLabel("Tai khoan");
	JTextField tfPass = new JTextField(10);
	JButton btforgot = new JButton("Forgot Pass");
	JButton btLogin = new JButton("Login");
	JButton btcan = new JButton("Cancel");
	//frame 2
	public forgot_pass() {
		f.setLocation(250,250);
		f.setLayout(new GridLayout(5,2));
		Container con = f.getContentPane();
		con.add(lbforgotpass);
		con.add(lb1);
		con.add(lbName);
		con.add(tfName);
		con.add(lbPass);
		con.add(tfPass);
		
		con.add(btcan);
		btcan.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 f.dispose();
			}
		
		});
		
		con.add(btforgot);
		con.add(btLogin);
		f.pack();
		f.setSize(300,200);
		f.setVisible(true);
		btforgot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e1) {
				jframe3();
//				 f.dispose();
			}
	});
	}
	public void jframe3() {
		f3.setLocation(400,400);
		f3.setLayout(new GridLayout(2,2));
		Container con3 = f3.getContentPane();
		con3.add(lbEnter);
		con3.add(tfenter);
		con3.add(btCancel3);
	con3.add(btContinue3);
	
		btContinue3.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				 f3.dispose();
		};
		
	
	});

			f3.pack();
			f3.setSize(500,200);
				f3.setVisible(true);
		btLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				jframe2();
				 f.dispose();
			}
		});
	}
	

	public void jframe2() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Container con = getContentPane();
		con.setLocation(250,250);
		JPanel jpnMain = new JPanel();
		jpnMain.setLayout(new BorderLayout());
		jpnMain.setLayout(new GridLayout(4,1));
		setSize(600,1000);
		// Panel 
		JPanel jpn1 = new JPanel();
		jpnMain.add(jpn1, BorderLayout.NORTH);
		Border border = BorderFactory.createLineBorder(Color.ORANGE);
		TitledBorder bdt1= BorderFactory.createTitledBorder(border, "Danh sach ");
		jpn1.setBorder(bdt1);
		jpn1.setLayout(new BorderLayout());
		
		
		JPanel leftPanel = new JPanel();
		jpn1.add(leftPanel, BorderLayout.WEST);
		leftPanel.setLayout(new GridLayout(9,1));
		
		JLabel jlb1 = new JLabel(" Ho va ten ");
		leftPanel.add(jlb1);
		JLabel jlb3 = new JLabel("Quê quán  ");
		leftPanel.add(jlb3);
		JLabel jlb2 = new JLabel(" Dia chi  ");
		leftPanel.add(jlb2);
		JLabel jlb4 = new JLabel(" CCCD ");
		leftPanel.add(jlb4);
		JLabel jlb5 = new JLabel(" So tien tro ");
		leftPanel.add(jlb5);
		//JLabel jlb6 = new JLabel(" Diem tin hoc dai cuong  ");
		//leftPanel.add(jlb6);
		//nhap 
		JPanel Center = new JPanel();
		jpn1.add(Center, BorderLayout.CENTER);
		Center.setLayout(new GridLayout(9,1));
		
		JTextField jtf1 = new JTextField(50);
		Center.add(jtf1);
	
		JTextField jtf2 = new JTextField(50);
		String[] h = {"An Giang"
				, "Bà rịa – Vũng tàu"
				, "Bắc Giang"
				, "Bắc Kạn"
				, "Bạc Liêu"
				,"Bắc Ninh"
				, "	Bến Tre"
				, "	Bình Định"
				, "	Bình Dương"
				, "	Bình Phước"
				, "	Bình Thuận"
				, "	Cà Mau"
				, "	Cần Thơ"
				, "	Cao Bằng "
				, "	Đà Nẵng"
				, "Đắk Lắk"
				, "Đắk Nông"
				, "Điện Biên"
				, "Đồng Nai"
				, "Đồng Thápn"
				, "Gia Lai"
				, "Hà Giang"
				, "Hà Nam"
				, "Hà Nội \r\n"
				, "Hà Tĩnh\r\n"
				, "Hải Dương\r\n"
				, "Hải Phòng\r\n"
				, "Hậu Giang\r\n"
				, "Hòa Bình\r\n"
				, "Hưng Yên\r\n"
				, "Khánh Hòa\r\n"
				, "Kiên Giang\r\n"
				, "Kon Tum\r\n"
				, "Lai Châu\r\n"
				, "Lâm Đồng\r\n"
				, "Lạng Sơn\r\n"
				, "Lào Cai\r\n"
				, "Long An\r\n"
				, "Nam Định\r\n"
				, "Nghệ An\r\n"
				, "Ninh Bình\r\n"
				, "Ninh Thuận\r\n"
				, "Phú Thọ\r\n"
				, "Phú Yên\r\n"
				, "Quảng Bình\r\n"
				, "Quảng Nam\r\n"
				, "Quảng Ngãi\r\n"
				, "Quảng Ninh\r\n"
				, "Quảng Trị\r\n"
				, "Sóc Trăng\r\n"
				, "Sơn La\r\n"
				, "Tây Ninh\r\n"
				, "Thái Bình\r\n"
				, "Thái Nguyên\r\n"
				, "Thanh Hóa\r\n"
				, "Thừa Thiên Huế\r\n"
				, "Tiền Giang\r\n"
				, "Thành phố Hồ Chí Minh\r\n"
				, "Trà Vinh\r\n"
				, "Tuyên Quang\r\n"
				, "Vĩnh Long\r\n"
				, "Vĩnh Phúc\r\n"
				, "Yên Bái"};
		JComboBox jcb = new JComboBox(h);
		Center.add(jcb);
		Center.add(jtf2);
			
		JPanel rightPanel = new JPanel();
		jpn1.add(rightPanel, BorderLayout.EAST);
		rightPanel.setLayout(new GridLayout(5,0));
		JTextField jtf3 = new JTextField(50);	
		Center.add(jtf3);
		
		JTextField jtf4 = new JTextField(50);
		Center.add(jtf4);
		
		//JTextField jtf6 = new JTextField(50);	
		//Center.add(jtf6);
		
		JLabel b3= new JLabel();
		b3.setVisible(true);
		JLabel b4= new JLabel();
		b4.setVisible(true);
		JLabel b5= new JLabel();
		b5.setVisible(true);
		JLabel b6= new JLabel();
		b5.setVisible(true);
		rightPanel.add(b3);
		rightPanel.add(b4);
		rightPanel.add(b5);
		rightPanel.add(b6);
		JButton jbt1 = new JButton("Them");		
		rightPanel.add(jbt1);
		JButton jbt2 = new JButton("Dong");		
		rightPanel.add(jbt2);
		JButton jbt3 = new JButton("Xoa");		
		rightPanel.add(jbt3);
		JButton jbt4 = new JButton("Tim kiem");		
		rightPanel.add(jbt4);
		jbt1.setSize(50, 50);
		jbt2.setSize(50, 50);
		jbt3.setSize(50, 50);
		JPanel jpn2 = new JPanel();
		jpnMain.add(jpn2,BorderLayout.SOUTH);
		Border bd = BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder bdt2 = BorderFactory.createTitledBorder(bd, "Database ");
		jpn2.setBorder(bdt2);
		
		JPanel jp1 = new JPanel();

		jp1.setLayout(new FlowLayout(100, 100, 100));
		DefaultTableModel dm=new DefaultTableModel();
		dm.addColumn("Họ và tên ");
		dm.addColumn("Quê quán ");
		dm.addColumn("Dia chi");
		dm.addColumn("CCCD");
		dm.addColumn("Tien tro");

		
		JTable jtb = new JTable(dm);
		dm.addRow(new String[]{"Trần Đức Vũ","Thừa Thiên Huế","Tứ Hạ","123456789","1.000.000"});
		dm.addRow(new String[]{"Trịnh Công Toàn","Thừa Thiên Huế","Tứ Hạ","123456789","1.000.000"});
		dm.addRow(new String[]{"Phan Thi Mỹ Linh","Quảng Trị","","123456789","1.000.000"});
		JScrollPane sc=new JScrollPane(jtb);
		jpn2.add(sc, BorderLayout.CENTER);
		
		
		
		jbt1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dm.addRow(new String [] {jtf1.getText(),(String)jcb.getSelectedItem(),jtf2.getText(),jtf3.getText(),jtf4.getText()});				
			}		
		});
		
		jtb.addMouseListener(new MouseListener() {

			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int row = jtb.getSelectedRow();
				String name = (String) jtb.getValueAt(row, 0);
				jtf1.setText(name);
			}

			@Override
			
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			} 

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		jbt2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dm.removeRow(getDefaultCloseOperation());				
			}
			
		});
		jbt3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
			
			}
			
		});
		this.setVisible(true);
		this.setDefaultCloseOperation(3);
		this.setLocationRelativeTo(null );
		
		
		con.add(jpnMain);
		con.setSize(400,400);
	//	con.setLocation(null);
		con.setVisible(true);
		
	}		
		//f2.setLocation(200,200);
	class choose extends JFrame {
		JFrame f4 = new JFrame ("Choose");
		JButton btcustomer = new JButton("Customer");
		JButton btlanlords = new JButton("Lanlords");
		JButton btHouse = new JButton("House");
		public choose(){
			f4.setLocation(300,20);
			f3.setLayout(new GridLayout(2,2));
			Container cont4 = f4.getContentPane();
			
			cont4.add(btlanlords);
			cont4.add(btHouse);
			cont4.add(btcustomer);
			btcustomer.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
				//	new Ìnorcusstomer();
					 f.dispose();
				}
		
		});
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	new forgot_pass();
	//lab8 wd = new lab8();
	//JPanel pn1 = new JPanel();
	//frame.add(pn1);
	
	//frame.setVisible(true);
	
}
	}
