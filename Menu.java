
import java.util.HashMap;

public class Menu {

	HashMap<Integer,Drink> menu = new HashMap<Integer, Drink>();
	public void createMenu(double priceRate) {
		menu.put(101,new Drink("Expresso",1.80*priceRate));
		menu.put(102,new Drink("Cappuccino",1.60*priceRate));
		menu.put(103,new Drink("Macchiato",2.00*priceRate));
		menu.put(104,new Drink("Caffe Amerincano",1.80*priceRate));
		menu.put(105,new Drink("Cafe Latte",1.20*priceRate));
		menu.put(201,new Drink("Camomil Tea",1.80*priceRate));
		menu.put(202,new Drink("Green Tea",1.20*priceRate));
		menu.put(203,new Drink("Mint Tea",1.40*priceRate));
		menu.put(204,new Drink("Ginger Tea",1.70*priceRate));
		menu.put(205,new Drink("Black Tea",1.50*priceRate));
	}
    public HashMap<Integer, Drink> getMenu() {
		return menu;
    }
}
