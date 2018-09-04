import java.io.File;
import java.io.*;
import java.io.FileOutputStream;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import com.google.zxing.oned.Code128Writer;
import java.io.File;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.Reader;
import com.google.zxing.common.*;
import com.google.zxing.*;
import com.google.zxing.client.result.*;
import javax.imageio.*;
import java.awt.image.*;
import com.google.zxing.client.j2se.*;
import java.net.*;
import java.io.File;
import java.io.IOException;

public class Main_1 extends GUI implements ActionListener,WindowListener,MouseListener,FocusListener,KeyListener
{
JFrame frame1,frame2,frame3;
Dimension p1;
int x,y,k;
Container sc1,sc2,sc3,sc4,sc5,sc7,sc8,sc9,lg_s,lg_f,lg_su,l_i,l_1,l_2,l_3,l_4,l_5;
JLabel lb1,toolbar,ipaw,code,name,textte,dir,success,name2,textte2,dir2,dir3,background,bg_1,bg_2,bg_3,bg_4,bg_5,bg_6,bg_7,bg_8,dialog,b_i,b_1,b_2,b_3,b_4,b_5;
JTextField name_t,name2_t,dir2_t,dir3_t,lg_1,s_1,s_2,s_5;
JFileChooser dir_t;
JPasswordField s_3,s_4,lg_2;
Font f1;
    JButton b1,b2,b3,b4,help,d1_1,d2_1,generate,loginb,signup,signup_back,signup_register,di,d1_b,d1_f,d2_b,d2_f,d3_b,d3_f,d4_b,d4_f,d5_b,d5_f,option,question,popout,dir1b,app,demo,send,cb,skip_1;
JTextArea ar1,ar2,ar3,text;
JScrollPane sp1,sp2,sp3,sp4,txt;
JDialog d1,d2,d3,d4,help_d,successful,login,sign_up,d_i,d_1,d_2,d_3,d_4,d_5;
JList list;
File file1;
int status;
public void go()throws IOException,FileNotFoundException
{
status=0;
x=0;
y=0;
k=0;
frame1=new JFrame();
frame2=new JFrame();
frame3=new JFrame();
d1=new JDialog(frame1,"Create QR Code",true);
d2=new JDialog(frame1,"Create Bar Code",true);
d3=new JDialog(frame1,"Decode QR Code",true);
d4=new JDialog(frame1,"Welcome to SeCon",true);
d_i=new JDialog(frame1,"Intoduction",true);
d_1=new JDialog(frame1,"Security",true);
d_2=new JDialog(frame1,"Time Travelling",true);
d_3=new JDialog(frame1,"QR Code encryption",true);
d_4=new JDialog(frame1,"Searchable Chat History",true);
d_5=new JDialog(frame1,"Fully Customizable",true);
d4.addKeyListener(this);
help_d=new JDialog(frame1,"Help",true);
login=new JDialog(frame1,"Login",true);
sign_up=new JDialog(frame1,"Sign-up",true);
//lg=new JLabel("Enter your serial key   :");
//lg.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,14));

//skip button
skip_1 = new JButton ("skip");
skip_1.setBounds(300,300,50,50);

loginb=new JButton(new ImageIcon("C:\\qr codes\\loginb.jpg"));
signup_register=new JButton(new ImageIcon("C:\\qr codes\\signupregi.jpg"));
signup_back=new JButton(new ImageIcon("C:\\qr codes\\signup_back.jpg"));
signup=new JButton(new ImageIcon("C:\\qr codes\\signup.jpg"));
lg_1=new JTextField("Username");
lg_2=new JPasswordField("Password");
s_1=new JTextField("");
s_2=new JTextField("");
s_3=new JPasswordField("");
s_4=new JPasswordField("");
s_5=new JTextField("");
 String names[]={"New Chat","Profile & status","Archive","Scan QR","Secon Web","Go Secon","Settings","Logout"};
list = new JList(names);
list.setBounds(270,3,175,200);
list.setBackground(Color.gray);
list.setFont(new Font("Centaur",Font.BOLD,20));
list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);     
lg_1.setOpaque(false);
lg_1.setBorder(null);
lg_2.setOpaque(false);
lg_2.setBorder(null);
s_1.setOpaque(false);
s_1.setBorder(null);
s_2.setOpaque(false);
s_2.setBorder(null);
s_3.setOpaque(false);
s_3.setBorder(null);
s_4.setOpaque(false);
s_4.setBorder(null);
s_5.setOpaque(false);
s_5.setBorder(null);
s_1.setBounds(90,195,400,50);
s_2.setBounds(90,285,400,50);
s_3.setBounds(90,377,400,50);
s_4.setBounds(90,470,400,50);
s_5.setBounds(90,562,400,50);

s_2.setOpaque(false);
s_2.setBorder(null);
s_3.setOpaque(false);
s_3.setBorder(null);
s_4.setOpaque(false);
s_4.setBorder(null);
s_5.setOpaque(false);
s_5.setBorder(null);
lg_s=login.getLayeredPane();
lg_su=sign_up.getLayeredPane();
lg_f=d4.getLayeredPane();
l_i=d_i.getLayeredPane();
l_1=d_1.getLayeredPane();
l_2=d_2.getLayeredPane();
l_3=d_3.getLayeredPane();
l_4=d_4.getLayeredPane();
l_5=d_5.getLayeredPane();
lg_f.setLayout(null);
l_i.setLayout(null);
l_1.setLayout(null);    
l_2.setLayout(null);
l_3.setLayout(null);
l_4.setLayout(null);
l_5.setLayout(null);
lg_s.setLayout(null);
login.setSize(550,780);
sign_up.setSize(600,746);
signup_register.setSize(380,40);
//lg.setBounds(10,60,200,30);
lg_1.setBounds(110,290,200,30);
lg_2.setBounds(110,340,200,30);
lg_1.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,14));
lg_2.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,14));
s_1.setFont(new Font("Centaur",Font.BOLD,20));
s_2.setFont(new Font("Centaur",Font.BOLD,20));
s_3.setFont(new Font("Centaur",Font.BOLD,20));
s_4.setFont(new Font("Centaur",Font.BOLD,20));
s_5.setFont(new Font("Centaur",Font.BOLD,20));
lg_1.setForeground(Color.gray);
lg_2.setForeground(Color.gray);
loginb.setBounds(80,420,380,40);
signup_register.setBounds(115,630,380,40);
signup_back.setBounds(0,250,38,279);
signup.setBounds(80,470,380,40);
background=new JLabel(new ImageIcon("C:\\qr codes\\Untitled-1.jpg"));
background.setBounds(-10,-35,600,600);
successful=new JDialog(frame1,"Successfully Created!!",true);
success=new JLabel("Successfully Created!!");
successful.setSize(240,140);
success.setBounds(40,40,200,30);
sc8=successful.getContentPane();
dir3=new JLabel("Filepath of the qr code :");
generate=new JButton(new ImageIcon("C:\\qr codes\\generate.jpg"));
generate.setBounds(140,100,120,30);
bg_1=new JLabel(new ImageIcon("C:\\qr codes\\frame1.jpg"));
bg_2=new JLabel(new ImageIcon("C:\\qr codes\\frame2.jpg"));
bg_3=new JLabel(new ImageIcon("C:\\qr codes\\login.jpg"));
bg_4=new JLabel(new ImageIcon("C:\\qr codes\\page1secon.jpg"));
bg_5=new JLabel(new ImageIcon("C:\\qr codes\\signupf.jpg"));
bg_6=new JLabel(new ImageIcon("C:\\qr codes\\chatmenu.jpg"));
bg_7=new JLabel(new ImageIcon("C:\\qr codes\\dir3.jpg"));
bg_8=new JLabel(new ImageIcon("C:\\qr codes\\dir3.jpg"));
b_i=new JLabel(new ImageIcon("C:\\qr codes\\intropage.jpg"));
b_1=new JLabel(new ImageIcon("C:\\qr codes\\1.jpg"));
b_2=new JLabel(new ImageIcon("C:\\qr codes\\2.jpg"));
b_3=new JLabel(new ImageIcon("C:\\qr codes\\3.jpg"));
b_4=new JLabel(new ImageIcon("C:\\qr codes\\4.jpg"));
b_5=new JLabel(new ImageIcon("C:\\qr codes\\5.jpg"));
bg_5.setBounds(0,0,600,746);
dialog=new JLabel(new ImageIcon("C:\\qr codes\\dialog.jpg"));
dialog.setBounds(0,0,800,800);
d4.addMouseListener(this);
bg_5.addMouseListener(this);
bg_1.setBounds(0,0,600,600);
bg_2.setBounds(0,0,300,600);
bg_3.setBounds(0,0,550,750);
bg_4.setBounds(0,0,500,550);
bg_6.setBounds(0,0,450,600);
bg_7.setBounds(0,0,600,350);
bg_8.setBounds(0,0,600,350);
b_i.setBounds(0,0,650,627);
b_1.setBounds(0,0,650,627);
b_2.setBounds(0,0,650,627);
b_3.setBounds(0,0,650,627);
b_4.setBounds(0,0,650,627);
b_5.setBounds(0,0,650,627);
lg_1.addFocusListener(this);
lg_2.addFocusListener(this);
dir3_t=new JTextField();
sc8.setLayout(null);
d1.setSize(600,350);
d2.setSize(600,350);
d3.setSize(450,200);
d4.setSize(500,550);
d_i.setSize(668,670);
d_1.setSize(668,670);
d_2.setSize(668,670);
d_3.setSize(668,670);
d_4.setSize(668,670);
d_5.setSize(668,670);
help_d.setSize(600,600);
sc1=frame1.getLayeredPane();
sc2=frame2.getLayeredPane();
sc3=d1.getLayeredPane();
sc4=d2.getLayeredPane();
sc5=d3.getLayeredPane();
sc7=help_d.getLayeredPane();
sc9=frame3.getLayeredPane();
sc7.setLayout(null);
sc3.setLayout(null);
sc5.setLayout(null);
sc9.setLayout(null);
f1=new Font("Castellar",Font.PLAIN,28);
name=new JLabel("Name of the the QR code file   =");
name2=new JLabel("Name of the Bar code file   =");
textte=new JLabel("Text to encode    =");
textte2=new JLabel("Text to encode   =");
dir=new JLabel("Directory (to save)    =");
dir2=new JLabel("Directory (to save)    =");
name_t=new JTextField();
name2_t=new JTextField();
dir_t=new JFileChooser();
dir2_t=new JTextField();
dir1b=new JButton("Choose File..");
app=new JButton(new ImageIcon("C:\\qr codes\\appconnect.jpg"));
demo=new JButton(new ImageIcon("C:\\qr codes\\demo.jpg"));
send=new JButton(new ImageIcon("C:\\qr codes\\send.jpg"));
cb=new JButton(new ImageIcon("C:\\qr codes\\cb.jpg"));
dir1b.setBounds(220,260,140,30);
dir1b.addActionListener(this);
app.addActionListener(this);
dir2_t.setBounds(220,260,200,30);
sc4.setLayout(null);
ar2=new JTextArea();
ar3=new JTextArea();
text=new JTextArea();
sp2=new JScrollPane(ar2);
sp3=new JScrollPane(ar3);
txt=new JScrollPane(text);
sp2.setBounds(220,50,300,180);
sp3.setBounds(220,50,300,180);
txt.setBounds(12,558,392,27);
txt.setBorder(null);
name_t.setBounds(220,10,200,30);
name2_t.setBounds(220,10,200,30);
dir3_t.setBounds(220,60,200,30);
name.setBounds(10,10,200,30);
dir3.setBounds(10,60,200,30);
name2.setBounds(10,10,200,30);
dir.setBounds(10,260,200,30);
dir2.setBounds(10,260,200,30);
textte.setBounds(10,50,200,30);
textte2.setBounds(10,50,200,30);
name_t.setOpaque(false);
name2_t.setOpaque(false);
dir2_t.setOpaque(false);
dir3_t.setOpaque(false);
textte.setOpaque(false);
textte2.setOpaque(false);
code=new JLabel(new ImageIcon("C:\\qr codes\\shomik.png"));
code.setBounds(90,12,400,300);
ar1=new JTextArea();
ar1.setEditable(false);
ar1.setBackground(Color.pink);
ar1.setForeground(Color.black);
sp1=new JScrollPane(ar1);
sp1.setBounds(90,310,400,220);
ar1.setText("Shomik");
sc1.setLayout(null);
sc2.setLayout(null);
b1=new JButton(new ImageIcon("C:\\qr codes\\button1.jpg"));
b2=new JButton(new ImageIcon("C:\\qr codes\\button2.jpg"));
b3=new JButton(new ImageIcon("C:\\qr codes\\button3.jpg"));
b4=new JButton(new ImageIcon("C:\\qr codes\\button4.jpg"));
help=new JButton(new ImageIcon("C:\\qr codes\\BUTTON5.jpg"));
d1_1=new JButton(new ImageIcon("C:\\qr codes\\create.jpg"));
d2_1=new JButton(new ImageIcon("C:\\qr codes\\create.jpg"));
di=new JButton(new ImageIcon("C:\\qr codes\\introp_b.jpg"));
d1_b=new JButton(new ImageIcon("C:\\qr codes\\pages_b.jpg"));
d1_f=new JButton(new ImageIcon("C:\\qr codes\\introp_b.jpg"));
d2_b=new JButton(new ImageIcon("C:\\qr codes\\pages_b.jpg"));
d2_f=new JButton(new ImageIcon("C:\\qr codes\\introp_b.jpg"));
d3_b=new JButton(new ImageIcon("C:\\qr codes\\pages_b.jpg"));
d3_f=new JButton(new ImageIcon("C:\\qr codes\\introp_b.jpg"));
d4_b=new JButton(new ImageIcon("C:\\qr codes\\pages_b.jpg"));
d4_f=new JButton(new ImageIcon("C:\\qr codes\\introp_b.jpg"));
d5_b=new JButton(new ImageIcon("C:\\qr codes\\pages_b.jpg"));
d5_f=new JButton(new ImageIcon("C:\\qr codes\\introp_b.jpg"));
option=new JButton(new ImageIcon("C:\\qr codes\\optionbutton.jpg"));
question=new JButton(new ImageIcon("C:\\qr codes\\question.jpg"));
popout=new JButton(new ImageIcon("C:\\qr codes\\popout.jpg"));
question.setBounds(225,335,20,20);
popout.setBounds(225,335,220,50);
question.setBorder(null);
popout.setBorder(null);
option.setBounds(408,0,043,59);
d1_1.setBounds(450,260,100,30);
d2_1.setBounds(450,260,100,30);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
help.addActionListener(this);
d1_1.addActionListener(this);
d2_1.addActionListener(this);
di.addActionListener(this);
d1_f.addActionListener(this);
d1_b.addActionListener(this);
d2_f.addActionListener(this);
d2_b.addActionListener(this);
d3_f.addActionListener(this);
d3_b.addActionListener(this);
d4_f.addActionListener(this);
d4_b.addActionListener(this);
d5_f.addActionListener(this);
d5_b.addActionListener(this);
question.addActionListener(this);
popout.addActionListener(this);
question.addMouseListener(this);
popout.addMouseListener(this);
b_i.addKeyListener(this);
b_1.addKeyListener(this);
b_2.addKeyListener(this);
b_3.addKeyListener(this);
b_4.addKeyListener(this);
b_5.addKeyListener(this);
d_i.addKeyListener(this);
d_1.addKeyListener(this);
b_2.addKeyListener(this);
d_3.addKeyListener(this);
d_4.addKeyListener(this);
d_5.addKeyListener(this);
s_5.addKeyListener(this);
option.addActionListener(this);
bg_4.addMouseListener(this);
frame3.addMouseListener(this);
generate.addActionListener(this);
loginb.addActionListener(this);
signup_register.addActionListener(this);
signup_back.addActionListener(this);
signup_back.addActionListener(this);
signup.addActionListener(this);
login.addWindowListener(this);
sign_up.addWindowListener(this);
s_4.addFocusListener(this);
frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame2.setSize(300,600);
frame3.setSize(460,610);
frame1.setSize(600,600);
b1.setBounds(50,340,200,30);
b2.setBounds(50,380,200,30);
b3.setBounds(50,420,200,30);
b4.setBounds(50,460,200,30);
di.setBounds(624,262,23,163);
d1_f.setBounds(627,258,23,163);
d1_b.setBounds(1,258,23,163);
d2_f.setBounds(627,258,23,163);
d2_b.setBounds(1,258,23,163);
d3_f.setBounds(627,258,23,163);
d3_b.setBounds(1,258,23,163);
d4_f.setBounds(627,258,23,163);
d4_b.setBounds(1,258,23,163);
d5_f.setBounds(627,258,23,163);
d5_b.setBounds(1,258,23,163);
help.setBounds(50,500,200,30);
lb1=new JLabel(new ImageIcon("C:\\qr codes\\logo1.jpg"));
lb1.setBounds(55,10,200,200);
frame1.setTitle("SECON");
toolbar=new JLabel("TOOLBAR");
ipaw=new JLabel("SeCon");
toolbar.setFont(f1);
ipaw.setFont(new Font("Garamond",Font.BOLD,50));
s_1.addMouseListener(this);
s_2.addMouseListener(this);
s_3.addMouseListener(this);
s_4.addMouseListener(this);
s_5.addMouseListener(this);
ipaw.setForeground(new Color(242,94,92));
toolbar.setForeground(new Color(242,94,92));
toolbar.setBounds(75,160,200,200);
ipaw.setBounds(80,175,140,100);
p1=frame1.getToolkit().getScreenSize();
x=(p1.width/5)+200;
sc3.add(dialog,new Integer(5));
sc4.add(dialog,new Integer(5));
y=p1.height/5;

app.setBounds(152,662,256,41);
demo.setBounds(0,105,450,44);
demo.addActionListener(this);

send.setBounds(410,554,36,35);
send.addActionListener(this);
send.setBorder(null);


cb.setBounds(2,58,215,44);
cb.addActionListener(this);
cb.setBorder(null);


frame1.setLocation(x+298+450,y);
login.setLocation(p1.width/3,p1.height/3);
sign_up.setLocationRelativeTo(frame1);
d_i.setLocationRelativeTo(frame1);
d_1.setLocationRelativeTo(frame1);
d_2.setLocationRelativeTo(frame1);
d_3.setLocationRelativeTo(frame1);
d_4.setLocationRelativeTo(frame1);
d_5.setLocationRelativeTo(frame1);
frame2.setLocation(x,y);
frame3.setLocation(x+298,y);
frame2.setUndecorated(true);
d4.setUndecorated(true);
login.setLocationRelativeTo(frame1);
d4.setLocationRelativeTo(frame1);
d1.setLocation(x-100,y+100);
successful.setLocation(x-100,y+100);
d2.setLocation(x-100,y+100);
d3.setLocation(x-100,y+100);
help_d.setLocation(x-100,y+100);
sc2.add(bg_1,new Integer(8));
sc2.add(toolbar,new Integer(10));
sc2.add(ipaw,new Integer(12));
sc2.add(b1,new Integer(12));
sc2.add(b2,new Integer(12));
sc2.add(b3,new Integer(12));
sc2.add(b4,new Integer(12));
sc2.add(help,new Integer(12));
sc1.add(code,new Integer(10));
sc1.add(sp1,new Integer(12));
sc3.add(name,new Integer(10));
sc3.add(textte,new Integer(10));
sc3.add(name_t,new Integer(10));
sc3.add(bg_7,new Integer(7));
sc2.add(lb1,new Integer(10));
sc3.add(sp2,new Integer(10));
sc3.add(d1_1,new Integer(10));
sc3.add(dir_t,new Integer(10));
sc3.add(dir1b,new Integer(10));
sc3.add(dir,new Integer(10));
sc8.add(success,new Integer(10));
sc4.add(name2,new Integer(10));
sc4.add(textte2,new Integer(10));
sc4.add(name2_t,new Integer(10));
sc4.add(sp3,new Integer(10));
sc4.add(dir2_t,new Integer(10));
sc4.add(dir2,new Integer(10));
sc4.add(d2_1,new Integer(10));
sc4.add(bg_8,new Integer(7));
sc5.add(dir3_t,new Integer(10));
sc5.add(generate,new Integer(10));
sc5.add(dir3,new Integer(10));
sc7.add(background,new Integer(10));
sc9.add(bg_6,new Integer(10));
sc9.add(demo,new Integer(12));
sc9.add(list,new Integer(18));
sc9.add(option,new Integer(18));

lg_s.add(loginb,new Integer(10));
lg_s.add(app,new Integer(10));
lg_su.add(signup_back,new Integer(12));
lg_su.add(s_1,new Integer(12));
lg_su.add(s_2,new Integer(14));
lg_su.add(s_3,new Integer(16));
lg_su.add(s_4,new Integer(18));
lg_su.add(s_5,new Integer(20));
lg_su.add(bg_5,new Integer(10));
lg_su.add(question,new Integer(22));
lg_su.add(popout,new Integer(22));
lg_su.add(signup_register,new Integer(12));
lg_s.add(signup,new Integer(10));
lg_s.add(lg_1,new Integer(10));
lg_s.add(lg_2,new Integer(12));
lg_s.add(bg_3,new Integer(5));
lg_f.add(bg_4,new Integer(10));
l_i.add(b_i,new Integer(10));



l_5.add(di,new Integer(12));
l_2.add(b_2,new Integer(10));
l_3.add(b_3,new Integer(10));
l_4.add(b_4,new Integer(10));
l_5.add(b_5,new Integer(10));
l_1.add(b_1,new Integer(10));
l_1.add(d1_b,new Integer(12));
l_1.add(d1_f,new Integer(14));
l_2.add(d2_b,new Integer(12));
l_2.add(d2_f,new Integer(14));
l_3.add(d3_b,new Integer(12));
l_3.add(d3_f,new Integer(14));
l_4.add(d4_b,new Integer(12));
l_4.add(d4_f,new Integer(14));
l_5.add(d5_b,new Integer(12));
l_5.add(d5_f,new Integer(14));
sc1.add(bg_1,new Integer(5));

sc2.add(bg_2,5);

sc9.add(send,new Integer(20));
        sc9.add(txt,new Integer(14));
        sc9.add(cb,new Integer(14));
sc5.add(dialog,new Integer(10));

d4.setVisible(true);
list.setVisible(false);
list.addMouseListener(this);
popout.setVisible(false);
lg_1.addKeyListener(this);
lg_2.addKeyListener(this);
s_3.addKeyListener(this);
text.addFocusListener(this);
cb.setVisible(false);
send.setVisible(false);
txt.setVisible(false);
}
public void actionPerformed(ActionEvent ae)
{
try
{
    
    if(ae.getSource()==cb)
    {
    cb.setVisible(false);
    bg_6.setIcon(new ImageIcon("C:\\qr codes\\chatmenu.jpg"));
    demo.setVisible(true);
    frame3.setSize(465,610);
    send.setVisible(false);
    txt.setVisible(false);
    bg_6.repaint();
        bg_6.revalidate();
    }
    if(ae.getSource()==demo)
    {
        demo.setVisible(false);
        bg_6.setIcon(new ImageIcon("C:\\qr codes\\box.jpg"));
        cb.setVisible(true);
send.setVisible(true);
txt.setVisible(true);
        frame3.setSize(465,650);
        bg_6.repaint();
        bg_6.revalidate();
    }
    if(ae.getSource()==dir1b)
    dir_t.showSaveDialog(frame2);
if(ae.getSource()==b1)
d1.setVisible(true);
if(ae.getSource()==b2)
d2.setVisible(true);
if(ae.getSource()==b3)
{
d3.setTitle("Decode QR Code");
dir3.setText("Filepath of the QR Code file   :");
d3.setVisible(true);
}
if(ae.getSource()==b4)
{
d3.setTitle("My location");




//dir3.setText("Filepath of the Bar Code file   :");
//d3.setVisible(true);
}
if(ae.getSource()==help)
help_d.setVisible(true);
if(ae.getSource()==d1_1)
{
String text =encode(ar2.getText()); // this is the text that we want to encode  
  
int width = 400;  
int height = 300; // change the height and width as per your requirement  
  
// (ImageIO.getWriterFormatNames() returns a list of supported formats)  
String imageFormat ="png"; // could be "gif", "tiff", "jpeg"   
BitMatrix bitMatrix = new QRCodeWriter().encode(text, BarcodeFormat.QR_CODE, width, height); 
File file = dir_t.getSelectedFile();
String directory=("D:\\")+file.getName();
file1=new File(directory); 
MatrixToImageWriter.writeToStream(bitMatrix, imageFormat, new FileOutputStream(file1));
success.setText("Successfully Created!!");
successful.setVisible(true);
}
if(ae.getSource()==d2_1)
{

           int width = 440; 
           int height = 48;
            
              
           BitMatrix bitMatrix;
        try {
            bitMatrix = new Code128Writer().encode(encode(ar3.getText()),BarcodeFormat.CODE_128,width,height,null);
            MatrixToImageWriter.writeToStream(bitMatrix, "png", new FileOutputStream(new File((dir2_t.getText()+name2_t.getText()))));
        } catch (WriterException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        success.setText("Successfully Created!!");
        successful.setVisible(true);
}
if(ae.getSource()==generate)
{
InputStream barCodeInputStream = new FileInputStream(new File(dir3_t.getText()));  
BufferedImage barCodeBufferedImage = ImageIO.read(barCodeInputStream);  
  
LuminanceSource source = new BufferedImageLuminanceSource(barCodeBufferedImage);  
BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));  
Reader reader = new MultiFormatReader();  
Result result = reader.decode(bitmap);  
ar1.setText(decode((result.getText())));
code.setIcon(new ImageIcon(dir3_t.getText()));
d3.setVisible(false);  
sc1.repaint();
}
/*if(ae.getSource()==loginb)
{
if(lg_1.getText().equals("shubham"))
{  
    login.setVisible(false);
    login.dispatchEvent(new WindowEvent(login, WindowEvent.WINDOW_CLOSING));
    frame1.setVisible(false);
frame2.setVisible(true);
frame3.setVisible(true);
    

}
}*/
if(ae.getSource()==signup)
{
    login.setVisible(false);
    sign_up.setVisible(true);
}
if(ae.getSource()==signup_back)
{
    sign_up.setVisible(false);
    sign_up.dispatchEvent(new WindowEvent(sign_up, WindowEvent.WINDOW_CLOSING));
    login.setVisible(true);
}
if(ae.getSource()==di)
{
    d_i.setVisible(false);
    d_1.setVisible(true);
    status=1;
}
if(ae.getSource()==d1_f)
{
    d_1.setVisible(false);
    d_2.setVisible(true);
    status=2;
}
if(ae.getSource()==d2_f)
{
    d_2.setVisible(false);
    d_3.setVisible(true);
    status=3;
}
if(ae.getSource()==d3_f)
{
    d_3.setVisible(false);
    d_4.setVisible(true);
    status=4;
}
if(ae.getSource()==d4_f)
{
    d_4.setVisible(false);
    d_5.setVisible(true);
    status=5;
}
if(ae.getSource()==d5_f)
{
    d_5.setVisible(false);
    login.setVisible(true);
}
if(ae.getSource()==d1_b)
{
    d_1.setVisible(false);
    d_i.setVisible(true);
    status=0;
}
if(ae.getSource()==d2_b)
{
    d_2.setVisible(false);
    d_1.setVisible(true);
    status=1;
}
if(ae.getSource()==d3_b)
{
    d_3.setVisible(false);
    d_2.setVisible(true);
    status=2;
}
if(ae.getSource()==d4_b)
{
    d_4.setVisible(false);
    d_3.setVisible(true);
    status=3;
}
if(ae.getSource()==d5_b)
{
    d_5.setVisible(false);
    d_4.setVisible(true);
    status=4;
}
if(ae.getSource()==option)
    {
        list.setVisible(true);
    }
    if(ae.getSource()==signup_register)
    {
        String s1,s2;
        s1=s_2.getText();
        s2=s_3.getText();
        this.write(s1,s2);
        bg_3.setIcon(new ImageIcon("C:\\qr codes\\login_2.jpg"));
        login.repaint();
        login.revalidate();
        sign_up.setVisible(false);
        login.setVisible(true);
    }
    if(ae.getSource()==loginb)
    {
        int value=0;
        String k1,k2;
        k1=lg_1.getText();
        k2=lg_2.getText();
        value=this.read(k1,k2);
        if(value==1)
        {
            login.setVisible(false);
    login.dispatchEvent(new WindowEvent(login, WindowEvent.WINDOW_CLOSING));
    frame1.setVisible(true);
frame2.setVisible(true);
frame3.setVisible(true);
        }
        else
        {
            bg_3.setIcon(new ImageIcon("C:\\qr codes\\login_1.jpg"));
                bg_5.repaint();
                bg_5.revalidate();
        }
    }
    if(ae.getSource()==send)
    {
        
    }
        
}
catch(Exception ap)
{
}
}
public void  windowActivated(WindowEvent ar)
{
}
public void  windowClosed(WindowEvent ar)
{
}
public void  windowClosing(WindowEvent ar)
{
        if(ar.getWindow()==login)
        {
            frame1.setVisible(false);
            frame2.setVisible(false);
}
}
public void  windowDeactivated(WindowEvent ar)
{
}
public void  windowDeiconified(WindowEvent ar)
{
}
public void  windowIconified(WindowEvent ar)
{
}
public void  windowOpened(WindowEvent ar)
{

}
public void mouseClicked(MouseEvent am)
{
    if(am.getSource()==bg_4)
{
d4.setVisible(false);
d_i.setVisible(true);
}
if(am.getSource()==frame3)
list.setVisible(false);
if(am.getSource()==list)
{
    String s=list.getSelectedValue().toString();
    if(s.equalsIgnoreCase("logout"))
    {
        frame1.setVisible(false);
frame2.setVisible(false);
frame3.setVisible(false);
login.setVisible(true);
    }
    if(s.equalsIgnoreCase("secon web"))
    {
        try {
        Desktop desktop = Desktop.isDesktopSupported() ? Desktop.getDesktop() : null;
        URL url=new URL("C:\\qr codes\\secon_web.html");
    if (desktop != null && desktop.isSupported(Desktop.Action.BROWSE)) {
        
            desktop.browse(url.toURI());
        }} catch (MalformedURLException e) {
            e.printStackTrace();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    }
}
public void mouseExited(MouseEvent am)
{
}
public void mouseEntered(MouseEvent am)
{
if((am.getSource()==question)||(am.getSource()==popout))
    {
    question.setVisible(false);
    popout.setVisible(true);
}
if(am.getSource()==bg_5)
{
    popout.setVisible(false);
    question.setVisible(true);
}
if(am.getSource()==s_1)
{
    popout.setVisible(false);
    question.setVisible(true);
}
if(am.getSource()==s_2)
{
    popout.setVisible(false);
    question.setVisible(true);
}
if(am.getSource()==s_3)
{
    popout.setVisible(false);
    question.setVisible(true);
}
if(am.getSource()==s_4)
{
    popout.setVisible(false);
    question.setVisible(true);
}
if(am.getSource()==s_5)
{
    popout.setVisible(false);
    question.setVisible(true);
}
}
public void mouseReleased(MouseEvent am)
{
}
public void mousePressed(MouseEvent am)
{
}
public void focusGained(FocusEvent af)
{
    if(af.getSource()==lg_1)
    {
    lg_1.setText("");
    lg_1.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,12));
    lg_1.setForeground(Color.black);
}
if(af.getSource()==lg_2)
    {
    lg_2.setText("");
    lg_2.setFont(new Font("Arial Rounded MT Bold",Font.BOLD,12));
    lg_2.setForeground(Color.black);
}
if(af.getSource()==s_4)
k=1;
if(af.getSource()==text)
{
    txt.setBounds(12,458,392,127);
    txt.repaint();
    txt.revalidate();
}
}
public void focusLost(FocusEvent af)
{
    if(af.getSource()==s_4)
    {
        if(k==1)
        {
            
            if((s_3.getText()=="")&&(s_4.getText()==""))
            {
                bg_5.setIcon(new ImageIcon("C:\\qr codes\\signupf_2.jpg"));
                bg_5.repaint();
                bg_5.revalidate();
            }
            else if((s_3.getText()).equals(s_4.getText()))
            {
                bg_5.setIcon(new ImageIcon("C:\\qr codes\\signupf_1.jpg"));
                bg_5.repaint();
                bg_5.revalidate();
            }
            else
            {
                bg_5.setIcon(new ImageIcon("C:\\qr codes\\signupf_2.jpg"));
                bg_5.repaint();
                bg_5.revalidate();
            }
        }
    }
    
}
public void keyPressed(KeyEvent ak)
{
    if(ak.getSource()==s_3)
    {
        String s=s_3.getText();
        if((s.length()>=1)&&(s.length()<8))
        {
        bg_5.setIcon(new ImageIcon("C:\\qr codes\\img1.gif"));
        bg_5.repaint();
        bg_5.revalidate();
    }
    if((s.length()>=8)&&(s.length()<12))
        {
        bg_5.setIcon(new ImageIcon("C:\\qr codes\\img2.gif"));
        bg_5.repaint();
        bg_5.revalidate();
    }
    if((s.length()>=12)&&(s.length()<14))
        {
        bg_5.setIcon(new ImageIcon("C:\\qr codes\\img3.gif"));
        bg_5.repaint();
        bg_5.revalidate();
    }
    if((s.length()>=14)&&(s.length()<18))
        {
        bg_5.setIcon(new ImageIcon("C:\\qr codes\\img4.gif"));
        bg_5.repaint();
        bg_5.revalidate();
    }
    if((s.length()>=18)&&(s.length()<21))
        {
        bg_5.setIcon(new ImageIcon("C:\\qr codes\\img5.gif"));
        bg_5.repaint();
        bg_5.revalidate();
    }
    }
    if(ak.getSource()==s_5)
    {
        
            int key = ak.getKeyCode();

            /* Restrict input to only integers */
            if (key < 96 && key > 105) 
            {
                bg_5.setText("");
                bg_5.setIcon(new ImageIcon("C:\\qr codes\\signupf_3jpg"));
                bg_5.repaint();
                bg_5.revalidate();
            }
            else
            {
            bg_5.setIcon(new ImageIcon("C:\\qr codes\\signupf.jpg"));
            bg_5.repaint();
            bg_5.revalidate();
        }
    }
    int key = ak.getKeyCode();
    if((ak.getSource()==d4)&&(key == KeyEvent.VK_ENTER))
    {
        d4.setVisible(false);
        login.setVisible(true);
    }
    if((ak.getSource()==d4)&&(key != KeyEvent.VK_ENTER))
    {
        d4.setVisible(false);
        d_i.setVisible(true);
    }
        if(ak.getSource()==bg_4)
{
d4.setVisible(false);
login.setVisible(true);
}
if((ak.getKeyCode())==KeyEvent.VK_RIGHT)
{
if(status==0)
{
    d_i.setVisible(false);
    d_1.setVisible(true);
    status=1;
}
if(status==1)
{
    d_1.setVisible(false);
    d_2.setVisible(true);
    status=2;
}
if(status==2)
{
    d_2.setVisible(false);
    d_3.setVisible(true);
    status=3;
}
if(status==3)
{
    d_3.setVisible(false);
    d_4.setVisible(true);
    status=4;
}
if(status==4)
{
    d_4.setVisible(false);
    d_5.setVisible(true);
    status=5;
}
if(status==5)
{
    d_5.setVisible(false);
    login.setVisible(true);
}    
}
else if(ak.getKeyCode()==KeyEvent.VK_LEFT)
{
    if(status==1)
{
    d_1.setVisible(false);
    d_i.setVisible(true);
    status=0;
}
if(status==2)
{
    d_2.setVisible(false);
    d_1.setVisible(true);
    status=1;
}
if(status==3)
{
    d_3.setVisible(false);
    d_2.setVisible(true);
    status=2;
}
if(status==4)
{
    d_4.setVisible(false);
    d_3.setVisible(true);
    status=3;
}
if(status==5)
{
    d_5.setVisible(false);
    d_4.setVisible(true);
    status=4;
}
}
if(ak.getSource()==lg_2)
{
    if(key==KeyEvent.VK_ENTER)
    {
        int value=0;
        String k1,k2;
        k1=lg_1.getText();
        k2=lg_2.getText();
        value=this.read(k1,k2);
        if(value==1)
        {
            login.setVisible(false);
    login.dispatchEvent(new WindowEvent(login, WindowEvent.WINDOW_CLOSING));
    frame1.setVisible(true);
frame2.setVisible(true);
frame3.setVisible(true);
        }
        else
        {
            bg_3.setIcon(new ImageIcon("C:\\qr codes\\login_1.jpg"));
                bg_5.repaint();
                bg_5.revalidate();
        }
    }
}
}
public void keyReleased(KeyEvent ak)
{
}
public void keyTyped(KeyEvent ak)
{

}
public void write(String s1, String s2)
{
       try{  
     FileOutputStream fout=new FileOutputStream("D:\\login.txt",true);
     s1=encode(s1);
     s2=encode(s2);
     byte b1[]=("#"+s1).getBytes();
     byte b2[]=("/"+s2).getBytes();   
     fout.write(b1);
     fout.write(b2);
     fout.close();  
    }catch(Exception e){System.out.println(e);}  
  }
  public int read(String c1, String c2)
  {
      String s1,s2;s1="";s2="";
      int t=0,k=0;
       try{  
    FileInputStream fin=new FileInputStream("D:\\login.txt");  
    int i=0;  
    while((i=fin.read())!=-1){
    if((char)(i)=='#')
    {
    t=1;
    if((s1.equalsIgnoreCase(""))&&(s2.equalsIgnoreCase("")));
    else
    {
        s1=decode(s1);
    s2=decode(s2);
    k=0;
        if((c1.equalsIgnoreCase(s1))&&(c2.equalsIgnoreCase(s2)))
    {
    return 1;
}
 else
 {
     s1="";
     s2="";
    }
    }
}
    if(((char)(i)=='/')&&(t==0))
    k=1;
    if(((char)(i)!='/')&&(t==0))
    {
        if(k==1)
        s2=s2+Character.toString((char)(i));
        else
        s1=s1+Character.toString((char)(i));
    }
    if(t==1)
    t=0;
    }
    fin.close();
    s1=decode(s1);
    s2=decode(s2);
    if((c1.equalsIgnoreCase(s1))&&(c2.equalsIgnoreCase(s2)))
    {
    return 1;
}
 else return 0;
  }
  catch(Exception e){System.out.println(e);}  
     return -99; 
    }
  
public static void main(String args[])throws IOException,FileNotFoundException
{
    int status;status=0;
Main_1 obj=new Main_1();
obj.go();
obj.getClass().getResourceAsStream("dialog.jpg");
}
}