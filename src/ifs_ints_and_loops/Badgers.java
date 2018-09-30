package ifs_ints_and_loops;

public class Badgers {
	public static void main(String[] args) {
		String Lyric1 = "badgers ";
		String Lyric2 = "mushrooms ";
		String Lyric3 = "snake ";
		for (int I = 0; I < 3; I++) {
			for (int i = 0; i < 12; i++) {
				System.out.print(Lyric1);
			}
			for (int i = 0; i < 2; i++) {
				System.out.println(Lyric2);
			}
		}
		for (int i = 0; i < 11; i++) {
			System.out.print(Lyric1);
		}
		System.out.println("Argh!");
		for (int i = 0; i < 4; i++) {
			System.out.print(Lyric3);
		}
	}
}
