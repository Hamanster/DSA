public class Problem_4 {
	public static void main(String[] args) {
		String chars = "carbon";
		generate("", chars);
	}

	public static void generate(String prefix, String remaining) {
		int n = remaining.length();
		if (n == 0) {
			System.out.println(prefix);
		} else {
			for (int i = 0; i < n; i++) {
				generate(prefix + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i+1, n));
			}
		}
	}
}

