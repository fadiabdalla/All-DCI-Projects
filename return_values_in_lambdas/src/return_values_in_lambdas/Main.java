package return_values_in_lambdas;

@FunctionalInterface
interface Concat {

	String concatenate(String text1, String text2);
}

public class Main {

	public static void main(String[] args) {

		Concat concat = (t1, t2) -> {

			String concatenated = t1 + " " + t2;

			return concatenated;

		};

		merg(concat);

		Concat concat2 = (t1, t2) -> {

			return t1 + " " + t2;

		};

		merg(concat2);

		Concat concat3 = (t1, t2) ->  t1 + " " + t2;

		

		merg(concat3);

	}

	public static void merg(Concat c) {

		System.out.println(c.concatenate("Hello", "Fadi"));
	}

}
