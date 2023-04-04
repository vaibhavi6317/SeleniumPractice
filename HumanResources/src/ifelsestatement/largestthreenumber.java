package ifelsestatement;

public class largestthreenumber {

	public static void main(String[] args) {
		short a=100;
		short b=500;
		short c=300;
		short largest;
		if(a>b) {
			if(a>c) {
				largest=a;
			}else {
				largest=c;
			}
		}else {
				if(b>c) {
					largest=b;
				}else {
					largest=c;
				}
			}
			System.out.println(largest+"is the largest.");
		}

	}


