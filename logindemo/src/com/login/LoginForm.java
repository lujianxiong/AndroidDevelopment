package com.login;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
//负责显示界面，只包含与界面有关的方法和事件处理方法 
public class LoginForm extends JFrame  {
    private UserDAO dao;
    private JButton btnLogin=null;
    private JButton btnClear=null;
    private JTextField txtId=null;
    private JPasswordField txtPwd=null;
    private JLabel lblId=null;
    private JLabel lblPwd=null;
    public LoginForm() {
         setVisible(true);   //模型可视化
    }
    public void initControls()//初始化控件
    {
        btnLogin=new JButton("登录");  //定义按钮
        btnClear=new JButton("清空");
        lblId=new JLabel("账号：");   //定义标签
        lblPwd=new JLabel("密码：");
        txtId=new JTextField();    //定义文本框
        txtPwd=new JPasswordField();
        
        lblId.setBounds(70,50,40,20);    //设置起点x，起点y，宽，高
        lblPwd.setBounds(70,80,40,20);
        txtId.setBounds(120,50,100,20);
        txtPwd.setBounds(120,80,100,20);
        btnLogin.setBounds(60,130,70,20);
        btnClear.setBounds(160,130,70,20);
       
        btnLogin.addActionListener(new ActionListener() {   //给“登录”按钮添加事件监听接口
            @Override        //实现ActionListner接口.定义一个匿名类实现ActionListner接口,实例化它,再把它作为参数传给这个方法
            public void actionPerformed(ActionEvent e) {
            Validate();     //使用 validate 方法会使容器再次布置其子组件，相当于刷新
            }
        });
        btnClear.addActionListener(new ActionListener() {    //给“清空”按钮添加事件监听接口
            @Override
            public void actionPerformed(ActionEvent e) {
                 txtId.setText("");      //清空帐号
                 txtPwd.setText("");     //清空密码
            }
        });
    }
    public void showControls()//面板添加控件
    {
        Container container=this.getContentPane();
        setTitle("登录界面");
        setLayout(null);//绝对布局
        setSize(300,250);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//设置关闭窗口默认方式
        setBackground(Color.blue);
        container.add(btnClear);
        container.add(btnLogin);
        container.add(lblId);
        container.add(lblPwd);
        container.add(txtId);
        container.add(txtPwd);
        setVisible(true);
    }
     
    public void Validate()//验证用户   JFrame有个validate（）函数，
    {
        dao=new UserDAO();
        String userId=txtId.getText().trim();
        //Trim() 功能：删除字符串中多余的空格，但会在英文字符串中保留一个作为词与词之间分隔的空格。
        String password=txtPwd.getText().trim();
        if(dao.findUser(userId, password)==true) 
        {       //这个方法会弹出信息的提示框，默认带有一个信息图标
        	    //第一个参数是parentComponent -确定Frame在其中显示的对话框; 如果null 则使用默认值
            JOptionPane.showMessageDialog(null, "恭喜你，登录成功！");   
        }
        else 
        {                                 //null、 提示消息、标题、图标
        	JOptionPane.showMessageDialog(null, "很遗憾，登录失败！", "ERROE",JOptionPane.ERROR_MESSAGE); 
        }
    }
}
