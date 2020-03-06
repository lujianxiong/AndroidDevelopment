package AbstractFactory;

public class BFactory extends Factory{
	//B厂
    public Milk CreateMilk(){
    	Milk milk = new Yogurt();
    	System.out.println("(产地：B厂)");
        return milk;
    }

    public Tea CreateTea(){
    	Tea tea = new RedTea();
    	System.out.println("(产地：B厂)");
        return tea;
    }
}
