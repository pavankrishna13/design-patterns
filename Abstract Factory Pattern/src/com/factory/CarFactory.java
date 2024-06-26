package com.factory;

import com.product.Engine;
import com.product.Transmission;

public abstract class CarFactory {
	
	public abstract Engine getEngine();
	
	public abstract Transmission getTransmission();
	
	public static CarFactory getCarFactory(String brand) {
		switch(brand.toLowerCase()) {
		case "maruti":
			return new MarutiFactory();
		case "toyota":
			return new ToyotaFactory();
		default :
			throw new RuntimeException("Brand not supported");
		}
	}

}
