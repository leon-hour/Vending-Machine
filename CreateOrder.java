
public class CreateOrder {
public Drink drinkOrderd;
	public CreateOrder() {
		// TODO Auto-generated constructor stub
	}
	public  Drink createTheOrder(Menu menu, boolean rez, int drinkId) {
		if(rez) {

			System.out.println("Your order has been recieved!!!"+drinkId);
			 drinkOrderd = menu.getMenu().get(drinkId);	
			 System.out.println(drinkOrderd.getName());
		}
		return drinkOrderd;
	}
}
