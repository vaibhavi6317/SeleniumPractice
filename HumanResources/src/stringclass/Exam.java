package stringclass;

public class Exam {

	public static void main(String[] args) {
		String s1="Deccan";
		String s2="Deccan";
		String s3="Viman";
		System.out.println(s1.compareTo(s2));//D-D  =0
		System.out.println(s1.compareTo(s3));//D-V  =-18
		System.out.println(s3.compareTo(s1));//V-D  =18

	}

}
//D=68
//V=86