
public class MenuController {
	public MenuController() {
	}
	public static boolean checkIfTheOrderEnterdIsValid( Menu menu, int drinkId) {
		if(menu.getMenu().keySet().contains(drinkId)) {
			return true;
		}
		else {
			return false;
		}
		}
}
