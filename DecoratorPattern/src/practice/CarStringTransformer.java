package practice;

public class CarStringTransformer implements ItemTransformer<Car, String> {

	@Override
	public String transform(Car car) {

		return "Car name " + car.getName() + "Car model " + car.getModel();
	}

}
