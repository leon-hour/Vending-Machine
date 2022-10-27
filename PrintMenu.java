
import java.util.HashMap;


public class PrintMenu {
public Menu menu;
	public PrintMenu(Menu menu) {
		HashMap<Integer, Drink> menu1 = menu.getMenu();
		for(java.util.Map.Entry<Integer, Drink> drinks : menu1.entrySet()) {
			System.out.println( drinks.getKey() + " | " + drinks.getValue().getName() +" | "+ drinks.getValue().getPrice());
		}
	}
}
