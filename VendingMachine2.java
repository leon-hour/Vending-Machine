
public class VendingMachine2 {
private static double priceRate;
	public static void main(String[] args) {
		System.err.println("Vending machine without GUI(Graphical user interface)version 1.2");
		String currency = args[0];
		Currency currentCurrency = CurrencyMenager.getCurrency(currency);
		InputData inputData = new InputData();
		//inputData.inputCurrency();
		Menu menu = new Menu();
		switch(currentCurrency) {
		case DOLLAR:
			priceRate = 0.97025;
			break;
		case EURO:
			priceRate =1;
			break;
		case WON:
			priceRate = 1384.09;
			break;
		case YEN:
			priceRate = 142.19;
			break;
		case POUND:
			priceRate = 0.87887;
			break;		
		}
		menu.createMenu(priceRate);
		new PrintMenu(menu);
		inputData.printInputData(menu, currentCurrency);	
		int inputMoney = inputData.getInputMoney();
		int orderdDrinkId = inputData.getOrderDinkId();
		new MenuController();
		boolean isTheOrderValid =   MenuController.checkIfTheOrderEnterdIsValid(menu, orderdDrinkId);
		CreateOrder createOrder = new CreateOrder();
		Drink drinkOrderd = createOrder.createTheOrder(menu, isTheOrderValid, orderdDrinkId);
		new ChangeCalculator(isTheOrderValid,drinkOrderd,inputMoney);
	}
}
