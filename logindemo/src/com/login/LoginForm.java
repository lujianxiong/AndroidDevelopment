package com.login;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
//������ʾ���棬ֻ����������йصķ������¼������� 
public class LoginForm extends JFrame  {
    private UserDAO dao;
    private JButton btnLogin=null;
    private JButton btnClear=null;
    private JTextField txtId=null;
    private JPasswordField txtPwd=null;
    private JLabel lblId=null;
    private JLabel lblPwd=null;
    public LoginForm() {
         setVisible(true);   //ģ�Ϳ��ӻ�
    }
    public void initControls()//��ʼ���ؼ�
    {
        btnLogin=new JButton("��¼");  //���尴ť
        btnClear=new JButton("���");
        lblId=new JLabel("�˺ţ�");   //�����ǩ
        lblPwd=new JLabel("���룺");
        txtId=new JTextField();    //�����ı���
        txtPwd=new JPasswordField();
        
        lblId.setBounds(70,50,40,20);    //�������x�����y������
        lblPwd.setBounds(70,80,40,20);
        txtId.setBounds(120,50,100,20);
        txtPwd.setBounds(120,80,100,20);
        btnLogin.setBounds(60,130,70,20);
        btnClear.setBounds(160,130,70,20);
       
        btnLogin.addActionListener(new ActionListener() {   //������¼����ť����¼������ӿ�
            @Override        //ʵ��ActionListner�ӿ�.����һ��������ʵ��ActionListner�ӿ�,ʵ������,�ٰ�����Ϊ���������������
            public void actionPerformed(ActionEvent e) {
            Validate();     //ʹ�� validate ������ʹ�����ٴβ�������������൱��ˢ��
            }
        });
        btnClear.addActionListener(new ActionListener() {    //������ա���ť����¼������ӿ�
            @Override
            public void actionPerformed(ActionEvent e) {
                 txtId.setText("");      //����ʺ�
                 txtPwd.setText("");     //�������
            }
        });
    }
    public void showControls()//�����ӿؼ�
    {
        Container container=this.getContentPane();
        setTitle("��¼����");
        setLayout(null);//���Բ���
        setSize(300,250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//���ùرմ���Ĭ�Ϸ�ʽ
        setBackground(Color.blue);
        container.add(btnClear);
        container.add(btnLogin);
        container.add(lblId);
        container.add(lblPwd);
        container.add(txtId);
        container.add(txtPwd);
        setVisible(true);
    }
     
    public void Validate()//��֤�û�   JFrame�и�validate����������
    {
        dao=new UserDAO();
        String userId=txtId.getText().trim();
        //Trim() ���ܣ�ɾ���ַ����ж���Ŀո񣬵�����Ӣ���ַ����б���һ����Ϊ�����֮��ָ��Ŀո�
        String password=txtPwd.getText().trim();
        if(dao.findUser(userId, password)==true) 
        {       //��������ᵯ����Ϣ����ʾ��Ĭ�ϴ���һ����Ϣͼ��
        	    //��һ��������parentComponent -ȷ��Frame��������ʾ�ĶԻ���; ���null ��ʹ��Ĭ��ֵ
            JOptionPane.showMessageDialog(null, "��ϲ�㣬��¼�ɹ���");   
        }
        else 
        {                                 //null�� ��ʾ��Ϣ�����⡢ͼ��
        	JOptionPane.showMessageDialog(null, "���ź�����¼ʧ�ܣ�", "ERROE",JOptionPane.ERROR_MESSAGE); 
        }
    }
}
