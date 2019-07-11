public class CreatePerson {
	public static void main(String s[]) {
		Person p = new Person();
		p.setName(s[0]);
		p.setEmail(s[1]);
		System.out.println(p);
	}
}
