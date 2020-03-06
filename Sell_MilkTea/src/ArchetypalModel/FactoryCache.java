package ArchetypalModel;

import java.util.Hashtable;
import AbstractFactory.AFactory;
import AbstractFactory.BFactory;
import AbstractFactory.Factory;

public class FactoryCache {
	private static Hashtable<String,Factory> shapeMap = new Hashtable<String,Factory>();
	 
    public static Factory getFactory(String factoryId){
    	Factory cachedFactory = shapeMap.get(factoryId);
        return (Factory)cachedFactory.clone();
    }
 
    public static void loadCache(){
    	AFactory Afactory = new AFactory();
    	Afactory.setId("1");
        shapeMap.put(Afactory.getId(),Afactory);
 
        BFactory Bfactory = new BFactory();
        Bfactory.setId("2");
        shapeMap.put(Bfactory.getId(),Bfactory);
    }

}
