package com.game;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class javaUtil {
	public static Object getObject(){
		try{
			DocumentBuilderFactory dFactory=DocumentBuilderFactory.newInstance();
			DocumentBuilder build=dFactory.newDocumentBuilder();
			Document doc;
			doc=(Document) build.parse(new File("src/com/game/config.xml"));
			
			NodeList n1=doc.getElementsByTagName("className");
			Node classNode=n1.item(0).getFirstChild();
			String cName="com.game."+classNode.getNodeValue();
			
			Class<?> c=Class.forName(cName);
			Object obj=c.newInstance();
			return obj;
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return null;
		}
		
	}
	
}
