package CurrencyConverter;

import java.util.ArrayList;
import java.util.HashMap;

public class Currency {
	private String name;
	private String shortName;
	private HashMap<String, Double> exchangeValues = new HashMap<String, Double>();
	
	// "Currency" Constructor
	public Currency(String nameValue, String shortNameValue) {
		this.name = nameValue;
		this.shortName = shortNameValue;
	}
	
	// Getter for name
	public String getName() {
		return this.name;
	}
	
	// Setter for name
	public void setName(String name) {
		this.name = name;
	}
	
	// Getter for shortName
	public String getShortName() {
		return this.shortName;
	}
	
	// Setter for shortName
	public void setShortName(String shortName) {
		this.shortName = shortName;
	}
	
	// Getter for exchangeValues
	public HashMap<String, Double> getExchangeValues() {
		return this.exchangeValues;
	}
	
	// Setter for exchangeValues
	public void setExchangeValues(String key, Double value) {
		this.exchangeValues.put(key, value);
	}
	
	// Set default values for a currency
	public void defaultValues() {
		String currency = this.name;
		
		switch (currency) {	
			case "Indian Rupee ₹":
				this.exchangeValues.put("INR", 1.0000);
				this.exchangeValues.put("USD", 0.0138);
				this.exchangeValues.put("EUR", 0.0115);
				this.exchangeValues.put("GBP", 0.0099);
				this.exchangeValues.put("CNY", 0.0895);
				this.exchangeValues.put("JPY", 1.5005);
				break;
			case "US Dollar $":
				this.exchangeValues.put("INR", 72.6855);
				this.exchangeValues.put("USD", 1.00);
				this.exchangeValues.put("EUR", 0.838);
				this.exchangeValues.put("GBP", 0.7193);
				this.exchangeValues.put("CNY", 6.506);
				this.exchangeValues.put("JPY", 109.069);
				break;
			case "Euro €":
				this.exchangeValues.put("INR", 86.77);
				this.exchangeValues.put("USD", 1.1934);
				this.exchangeValues.put("EUR", 1.00);
				this.exchangeValues.put("GBP", 0.8584);
				this.exchangeValues.put("CNY", 7.763);
				this.exchangeValues.put("JPY", 132.57);
				break;
			case "British Pound £":
				this.exchangeValues.put("INR", 101.052);
				this.exchangeValues.put("USD", 1.3903);
				this.exchangeValues.put("EUR", 1.165);
				this.exchangeValues.put("GBP", 1.00);
				this.exchangeValues.put("CNY", 9.0358);
				this.exchangeValues.put("JPY", 151.63);
				break;
			case "Chinese Yuan Renminbi ¥":
				this.exchangeValues.put("INR", 11.1721);
				this.exchangeValues.put("USD", 0.1537);
				this.exchangeValues.put("EUR", 0.1288);
				this.exchangeValues.put("GBP", 0.1107);
				this.exchangeValues.put("CNY", 1.00);
				this.exchangeValues.put("JPY", 16.7636);
				break;
			case "Japanese Yen JP¥":
				this.exchangeValues.put("INR", 0.6664);
				this.exchangeValues.put("USD", 0.0092);
				this.exchangeValues.put("EUR", 0.0077);
				this.exchangeValues.put("GBP", 0.0066);
				this.exchangeValues.put("CNY", 0.0597);
				this.exchangeValues.put("JPY", 1.000);
				break;
		}
	}
	
	// Initialize currencies
	public static ArrayList<Currency> init() {
		ArrayList<Currency> currencies = new ArrayList<Currency>();
		
		currencies.add( new Currency("Indian Rupee ₹", "INR") );
		currencies.add( new Currency("US Dollar $", "USD") );
		currencies.add( new Currency("Euro €", "EUR") );
		currencies.add( new Currency("British Pound £", "GBP") );
		currencies.add( new Currency("Chinese Yuan Renminbi ¥", "CNY") );
		currencies.add( new Currency("Japanese Yen JP¥", "JPY") );
		for (Integer i =0; i < currencies.size(); i++) {
			currencies.get(i).defaultValues();
		}		
		
		return currencies;
	}
	
	// Convert a currency to another
	public static Double convert(Double amount, Double exchangeValue) {
		Double price;
		price = amount * exchangeValue;
		price = Math.round(price * 100d) / 100d;
		
		return price;
	}
}
