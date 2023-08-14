package Forloop;

public class Seven {
	public static void main(String args[]) {
		int nsum = 0, psum = 0;
		for (int i = -45; i <= 45; i++) {
			if (i <= 0 && i >= -45) {
				nsum += i;
			} else {
				psum += i;
			}
		}
		System.out.println("negative sum:" + nsum);
		System.out.println("positive sum:" + psum);
	}
}
