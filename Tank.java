package printTankArr;

public class Tank {
	String color;
	int crew;
	int maxSpeed;
	String name;

	public String toString() {
		return "Tank color: " + color + ", crew: " + crew + ", max speed: "
				+ maxSpeed + " km/h" + ", name: " + name;
	}

	public void printSelf() {
		System.out.println(toString());
	}
}
