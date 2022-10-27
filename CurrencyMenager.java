
public class CurrencyMenager {

	public CurrencyMenager() {
		// TODO Auto-generated constructor stub
	}
	public static Currency getCurrency(String inputCurrency) {
		for(Currency currency1:Currency.values())
		{
			if(currency1.name().equals(inputCurrency)) {
				return currency1;
			}
		}
		System.out.println(" Wrong currency or our program does'nt suport that currency!");
		return null;
	}

}
