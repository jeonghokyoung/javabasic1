package ex01.io.printstream;

public class Program {

	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		kor1 = 50;
		kor2 = 60;
		kor3 = 80;
		
		total=kor1 + kor2 + kor3;
		avg = total/3.0f;
		
		//-------------성적출력 부분
		
		System.out.println("┌──────────────┐");
		System.out.println("│    성적 출력   │");
		System.out.println("└──────────────┘");
		
		System.out.printf("국어1 : %3d\n",kor1);
		System.out.printf("국어2 : %3d\n",kor2);
		System.out.printf("국어3 : %3d\n",kor3);
		
		System.out.printf("총점 : %3d\n",total);
		System.out.printf("평균 : %6.2f\n",avg);
		
		System.out.write(56);
		System.out.write(48);
		System.out.flush();
		
	}

}
