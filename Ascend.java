// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int first = (int)(Math.random() * (lim - 0 + 1));
		int second = (int)(Math.random() * (lim - 0 + 1));
		int third = (int)(Math.random() * (lim - 0 + 1));
		int temp;
		System.out.println(first + " "  + second + " " + third);
		if (first > second) {
			temp = first;
			first = second;
			second = temp;
		}
		if (first > third) {
			temp = first;
			first = third;
			third = temp;
		}
		if (second > third) {
			temp = second;
			second = third;
			third = temp;
		}
		System.out.println(first + " "  + second + " " + third);
	}
}
