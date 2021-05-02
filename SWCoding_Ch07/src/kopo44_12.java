import java.util.ArrayList;

public class kopo44_12 {//클래스

	private int kopo44_student_id;
	private String kopo44_name;
	private int kopo44_kor;
	private int kopo44_eng;
	private int kopo44_mat;
	//번호 이름 국어 영어 수학을 private으로 선언

	static ArrayList<kopo44_12> kopo44_ArrayOneRec = new ArrayList<kopo44_12>();
	//kopo44_12를 호출하기 위한 선언

	static int kopo44_sumkor = 0;
	static int kopo44_sumeng = 0;
	static int kopo44_summat = 0;
	static int kopo44_sumsum = 0;
	static int kopo44_sumave = 0;
	static final int kopo44_iPerson = 20;
	//static으로 국어 영어 수학 합게 선언 초기화
	//iPerson 20 선언

	public kopo44_12(int kopo44_student_id, String kopo44_name, int kopo44_kor, int kopo44_eng, int kopo44_mat) {
		//kopo44_12 생성자 선언
		this.kopo44_student_id = kopo44_student_id;
		this.kopo44_name = kopo44_name;
		this.kopo44_kor = kopo44_kor;
		this.kopo44_eng = kopo44_eng;
		this.kopo44_mat = kopo44_mat;
		//생성자 매칭
	}

	public int kopo44_student_id() {
		return this.kopo44_student_id;
	}
	//student_id를 매칭시켜서 리턴

	public String kopo44_name() {
		return this.kopo44_name;
	}
	//name를 매칭시켜서 리턴
	public int kopo44_kor() {
		return this.kopo44_kor;
	}
	//kor를 매칭시켜서 리턴
	public int kopo44_eng() {
		return this.kopo44_eng;
	}
	//eng를 매칭시켜서 리턴
	public int kopo44_mat () {
		return this.kopo44_mat;
	}
	//mat를 매칭시켜서 리턴
	public int kopo44_sum() {
		return this.kopo44_kor + this.kopo44_eng + this.kopo44_mat;
	}
	//sum를 매칭시켜서 리턴
	public double kopo44_ave() {
		return this.kopo44_sum() / 3.0;
	}
	//ave를 매칭시켜서 리턴
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//메인메소드

		kopo44_dataSet();//메소드 호출
		kopo44_HeaderPrint();//메소드 호출
		for (int kopo44_i = 0; kopo44_i < kopo44_ArrayOneRec.size(); kopo44_i++) {//각각의 배열에 담긴 자료 순차적으로 뽑기 위한 for 반복문
			kopo44_ItemPrint(kopo44_i);//메소드 호출
		}
		kopo44_TailPrint();//메소드 호출
	}
	
	public static void kopo44_dataSet() {//dataSet 메소드
		for (int kopo44_i = 0; kopo44_i < kopo44_iPerson; kopo44_i++) {//0부터 iPerson 미만까지
			String kopo44_name = String.format("홍길%02d", kopo44_i);
			int kopo44_kor = (int)(Math.random()*100);
			int kopo44_eng = (int)(Math.random()*100);
			int kopo44_mat = (int)(Math.random()*100);
			//이름과 국영수 성적을 뽑아냄
			//성적은 0~100사이의 숫자 랜덤 추출
			kopo44_ArrayOneRec.add(new kopo44_12(kopo44_i, kopo44_name, kopo44_kor, kopo44_eng, kopo44_mat));
			//뽑아낸 값들을 ArrayOneRec배열에 각각 넣음
			
		}
	}
	
	public static void kopo44_HeaderPrint() {//HeaderPrint 메소드
		System.out.printf("****************************************************\n");
		System.out.printf(("%2s %4s %2s %2s %2s %2s	%2s\n"), "번호", "이름", "국어", "영어", "수학", "합계", "평균" );
		System.out.printf("****************************************************\n");
		//출력양식
	}
	
	public static void kopo44_ItemPrint(int kopo44_i) {
		//ItemPrint 메소드
		kopo44_12 kopo44_rec;
		kopo44_rec = kopo44_ArrayOneRec.get(kopo44_i);
		//kopo44_12 호출을 위한 객체선언
		System.out.printf("%4d %4s %3d %3d %3d	%3d	%6.2f\n", kopo44_rec.kopo44_student_id(), kopo44_rec.kopo44_name(), kopo44_rec.kopo44_kor(), kopo44_rec.kopo44_eng(), 
				kopo44_rec.kopo44_mat(), kopo44_rec.kopo44_sum(), kopo44_rec.kopo44_ave());
		//출력양식
		kopo44_sumkor += kopo44_rec.kopo44_kor();
		kopo44_sumeng += kopo44_rec.kopo44_eng();
		kopo44_summat += kopo44_rec.kopo44_mat();
		kopo44_sumsum += kopo44_rec.kopo44_sum();
		kopo44_sumave += kopo44_rec.kopo44_ave();
		//각각의 합계를 구하기 위해 +=로 가산
	}
	
	public static void kopo44_TailPrint() {
		//TailPrint 메소드
		System.out.printf("****************************************************\n");
		//출력양식
		System.out.printf("국어합계 %d		귝어평균: %6.2f\n", kopo44_sumkor, kopo44_sumkor / (double)kopo44_ArrayOneRec.size());
		//출력양식
		System.out.printf("영어합계 %d		영어평균: %6.2f\n", kopo44_sumeng, kopo44_sumeng / (double)kopo44_ArrayOneRec.size());
		//출력양식
		System.out.printf("수학합계 %d		수학평균: %6.2f\n", kopo44_summat, kopo44_summat / (double)kopo44_ArrayOneRec.size());
		//출력양식
		System.out.printf("****************************************************\n");
		//출력양식
		System.out.printf("반평균합계 %d	  반평균: %6.2f\n", kopo44_sumave, kopo44_sumave / (double)kopo44_ArrayOneRec.size());
		//출력양식
	}	



}
