package gakpe_mentoring;

class Car{
	private int gas;
	private String carName;
	
	Car() {	}
	Car(String carName) {
		this.carName= carName;
	}
	Car(int gas) {
		this.gas = gas;
	}
	Car(String carName, int gas) {
		this.carName = carName;
		this.gas = gas;
	}
	public void setGas(int gas) {
		this.gas = gas;
	}
	public int getGas() {
		return gas;
	}
	public void setCarName(String carName) {
		this.carName = carName;
	}
	public String getCarName() {
		return carName;
	}
	public int move(int gas) {
		if(this.gas >= gas) {
			this.gas -= gas;
			return this.gas;
		}
		else
			return this.gas - gas;
	}
	public int refuel(int amount) {
		gas += amount;
		return gas;
	}
}

class Main {
	public static void main(String[] args) {
		Car[] cars = new Car[4];
		String[] carNames = {"kia", "ferrari", "bmw", "toyota"};
		int[] carGas = {10, 20, 15, 17};

		for (int i = 0; i < cars.length; i++) {
			cars[i] = new Car(carNames[i], carGas[i]);
		}
    
		for (int i = 0; i < 7; i++) {
			for(Car car : cars) {
				int a = car.move(5);
				if(a >= 0) {
					System.out.println(car.getCarName() + " move, resume gas: " + a);
				}
				else {
					System.out.println(car.getCarName() + " out of gas, resume gas: " + a);
					System.out.println("fuel amount: 10, resume fuel: " + car.refuel(10));
				}
			System.out.println();
    	}
    }
}
}
