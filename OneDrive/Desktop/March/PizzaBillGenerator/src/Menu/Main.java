package Menu;

public class Main {
	
	public static void main(String arg[]) {
	
		Pizza BasePizza=new Pizza(true);
		BasePizza.addExtraChesse();
		BasePizza.addExtraTopins();
		BasePizza.takeAway();
		BasePizza.getBill();
		/*DeluxPizza dp=new DeluxPizza(true);
		dp.addExtraChesse();
		dp.addExtraTopins();
		dp.getBill();*/
	}
}
