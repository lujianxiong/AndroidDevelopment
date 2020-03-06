package AbstractFactory;

public class AFactory extends Factory{
//A厂
    public Milk CreateMilk(){
    	Milk milk = new PureMilk();
    	System.out.println("(产地：A厂)");
        return milk;
    }

    public Tea CreateTea(){
    	Tea tea = new GreenTea();
    	System.out.println("(产地：A厂)");
        return tea;
    }
}
