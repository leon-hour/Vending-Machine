
public class ChangeCalculator {
private double change;
	public ChangeCalculator(boolean isTheOrderValid, Drink drink, int inputMoney) {
		if(isTheOrderValid == true && inputMoney>drink.getPrice()) {
			change = inputMoney - drink.getPrice();
		}
		/*else if(isTheOrderValid == false){
			change = inputMoney;
			System.err.println("You have enter wrong Number!!!!");
		}*/
		else if(isTheOrderValid == true && inputMoney<drink.getPrice()){
			change = inputMoney;
			System.err.println("The money you have enterd are'nt enought!!!");
		}
		System.out.println("The change is: " + change );
	}
}