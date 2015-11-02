package printTankArr;

public class PrintTankArr {


	public static void main(String[] args) {
		Tank[] tanks = new Tank[5];
		tanks[0] = new Tank();
		tanks[0].color = "Gray";
		tanks[0].maxSpeed = 80;
		tanks[0].name = "Tank";
		tanks[0].crew = 3;
		
		printTankArr(tanks);
		
	}

	private static void printTankArr(Tank[] tanks) {
		for (int i = 0; i < 5; i++) {
			if (tanks[i] != null) {
				tanks[i].printSelf();
				System.out.println(tanks[i].toString());
			}
		}

	}

}
