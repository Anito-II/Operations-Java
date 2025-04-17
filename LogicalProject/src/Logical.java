
public class Logical {

	void compareTwoAges(int ag1, int ag2) {

		if (ag1 < 0 && ag2 < 0) {
			System.out.println("Invalid input: Age must be a positive");
		} else {
			if (ag1 > ag2) {
				System.out.println("Rohan is older than Siddharth");
			} else if (ag2 > ag1) {
				System.out.println("Siddharth is older than Rohan");
			} else {
				System.out.println("Rohan and Siddharth are of the same age.");
			}
		}
	}
}
