
public class Q7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		students s = new students();
		int stu = 25;
		s.getStuNum();
		System.out.println(stu);
		
	}

}

class students{
	private int stuNum;
	private int stuGrade;
	public int getStuNum() {
		return stuNum;
	}
	public int getStuGrade() {
		return stuGrade;
	}
	public void setStuGrade(int stuGrade) {
		this.stuGrade = stuGrade;
	}
	public void setStuNum(int stuNum) {
		this.stuNum = stuNum;
	}
}
class studentNumber{
	public void checkG(int stu) {
		stu = 23;
	}
}
