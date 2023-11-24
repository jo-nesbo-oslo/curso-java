package mx.com.kabec.parent;

public class Vehicle {
	/*
	 * tarea nov 24: Agregar un método a la super clase y ese método que tenga su
	 * propia implementación en cada clase hija además de sobreeescribir el método
	 * toString()
	 * 
	 * Las clases deben tener al menos dos constructores, 5 propiedades y getters
	 *
	 */

	private String engine;
	private int wheels;
	private int seats;
	private int fuelTank;
	private String lights;

	public Vehicle() {
		this.engine = "petrol";
		this.wheels = 4;
		this.seats = 4;
		this.fuelTank = 35;
		this.lights = "LED";

	}

	public Vehicle(String engine, int wheels, int seats, int fuelTank, String lights) {

		this.engine = engine;
		this.wheels = wheels;
		this.seats = seats;
		this.fuelTank = fuelTank;
		this.lights = lights;
	}

	public String getEngine() {
		return engine;
	}

	public int getWheels() {
		return wheels;
	}

	public int getSeats() {
		return seats;
	}

	public int getFuelTank() {
		return fuelTank;
	}

	public String getLights() {
		return lights;
	}

}
