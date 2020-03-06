package AbstractFactory;

public abstract class Factory implements Cloneable{
	private String id;
    protected Factory factory;
	
    public abstract Milk CreateMilk();

    public abstract Tea CreateTea();
 
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
 
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }

}
