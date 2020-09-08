package com.qa;

public class Main {

	public static void main(String[] args) {
		TemperatureConverter x = new TemperatureConverter();
		x.convertFahrenheitToCelsius(70);
//		System.out.println(x.convertFahrenheitToCelsius(70));


		System.out.println(x.convertKelvinToCelsius(70));
	}

}
