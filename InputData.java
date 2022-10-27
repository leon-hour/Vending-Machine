import java.util.Scanner;

public class InputData {
private int orderId;
private int inputMoney;
	public void printInputData( Menu menu,Currency currency) {
		try (Scanner scan = new Scanner(System.in)) {
			inputMoney = scan.nextInt();
			while(inputMoney<=0) {
					System.err.println("Negative value!");
					inputMoney = (int)(scan.nextInt());
			}
			System.out.println("You have enterd: "+ inputMoney +" "+currency);
			System.out.println("Please enter the numer before your the name of the drink you want to order: ");
				orderId = scan.nextInt();
				while(MenuController.checkIfTheOrderEnterdIsValid(menu,orderId) == false) {
					orderId = scan.nextInt();
				}
		}
		;
		}
public int getOrderDinkId() {
	return orderId;
}
public int getInputMoney() {
	return inputMoney;
}
}
