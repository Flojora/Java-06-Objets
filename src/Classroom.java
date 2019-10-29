
public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Wilder eleve1 = new Wilder("Joscelin", true);
		Wilder eleve2 = eleve1;
		System.out.println(eleve1.whoAmI());
		Wilder eleve3 = new Wilder("Billy", false);
		System.out.println(eleve3.whoAmI());

	}

}
