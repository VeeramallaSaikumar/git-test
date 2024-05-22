package Menu;

public class Pizza {
	private int price;
	private Boolean veg;
	
	private int addExtraChessePrice = 100;
	private int addExtraTopinsPrice = 130;
	private int backPackPrice =10;
	private int basePizzaPrice;
	
	private boolean isExtraChesseAdded=false;
	private boolean isExtraTopinsAdded=false;
	private boolean isOptedForTakeAway=false;
	public Pizza(Boolean veg)
	{
		this.veg =veg;
		if(this.veg) {
			this.price=300;
			
		}
		else {
			this.price=400;
		}
		basePizzaPrice=this.price;
	}	
	public void addExtraChesse() {
		isExtraChesseAdded=true;
		this.price +=addExtraChessePrice;
		
	}
	public void addExtraTopins() {
		isExtraTopinsAdded=true;
		this.price +=addExtraTopinsPrice;
	}
	public void takeAway() {
		isOptedForTakeAway=true;
		this.price +=backPackPrice;
	
    }
	public void getBill() {
	String bill="";
	System.out.println("Pizza :"+basePizzaPrice);
	
	if(isExtraChesseAdded) {
		bill +="Extra Chesse added :" +addExtraChessePrice + "\n";
	}
	if(isExtraTopinsAdded) {
		bill +="Extra Topins added :" +addExtraTopinsPrice + "\n";
	}
	if(isOptedForTakeAway) {
		bill +="Extra Chesse added :" +backPackPrice + "\n";
	}
	bill +="Bill :" +this.price +"\n";
	System.out.println(bill);
    }	
}