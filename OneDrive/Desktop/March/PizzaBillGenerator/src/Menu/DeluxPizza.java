package Menu;

public class DeluxPizza extends Pizza {

	public DeluxPizza(Boolean veg) {
		super(veg);
		super.addExtraChesse();
		super.addExtraTopins();
	}
		@Override
		public void addExtraChesse() {	
		}		
		@Override
		public void addExtraTopins() {
		}
}