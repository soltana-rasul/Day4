
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer sb = new StringBuffer("Sandy is 10 years old, and likes...");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		System.out.println(sb.append(" strawberries."));
		System.out.println(sb.insert(35, " fresh"));
		System.out.println(sb.delete(32, 35));
		System.out.println(sb.reverse());

	}

}
