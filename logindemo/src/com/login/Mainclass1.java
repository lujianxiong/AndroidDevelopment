package com.login;

public class Mainclass1 {
	public Mainclass1() {
        LoginForm form=new LoginForm();
        form.initControls();
        form.showControls();
	}
	public static void main(String[] args) {
		 new Mainclass1();//³ÌÐòÈë¿Ú
	}

}
