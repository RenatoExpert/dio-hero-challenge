import java.util.Scanner;

public class MyGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner();

		System.out.print("Hero's name: ");
		String name = scanner.nextLine();

		System.out.print("Experience: ");
		int experience = scanner.nextInt();
		String level = get_level(experience);

		String message = String.format("O Herói de nome %s está no nível de %s", name, level);
		System.out.println(message);
	}
	private String get_level(int experience) {
		String level;
		if(experience <= 1000) {
			level = "Ferro";
		} else if(experience <= 2000) {
			level = "Bronze";
		} else if(experience <= 5000) {
			level = "Prata";
		} else if(experiene <= 7000) {
			level = "Ouro";
		} else if(experience <= 8000) {
			level = "Platina";
		} else if(experience <= 9000) {
			level = "Ascendente";
		} else if(experience <= 1000) {
			level = "Imortal";
		} else {
			level = "Radiante";
		}
		return level;
	}
}
