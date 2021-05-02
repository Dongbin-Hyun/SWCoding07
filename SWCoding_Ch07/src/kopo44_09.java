
public class kopo44_09 {//클래스
	
	public String kopo44_name;
	public int kopo44_kor;
	public int kopo44_eng;
	public int kopo44_mat;
	//name kor mat public으로 선언
	public kopo44_09(String name, int kor, int eng, int mat) {
		this.kopo44_name = name;
		this.kopo44_kor = kor;
		this.kopo44_eng = eng;
		this.kopo44_mat = mat;
	//public으로 kopo44_09 생성자 생성	
	}
	
	public String kopo44_name() {
		return this.kopo44_name;
	}
	//public 선언한 name을 생성자 name으로 리턴
	public int kopo44_kor() {
		return this.kopo44_kor;
	}
	//public 선언한 kor을 생성자 kor으로 리턴
	public int kopo44_eng() {
		return this.kopo44_eng;
	}
	//public 선언한 eng을 생성자 eng으로 리턴
	public int kopo44_mat() {
		return this.kopo44_mat;
	}
	//public 선언한 mat을 생성자 mat으로 리턴
	public int kopo44_sum() {
		return this.kopo44_kor + this.kopo44_eng + this.kopo44_mat;
	}
	//public 선언한 sum을 생성자 sum으로 리턴
	public double kopo44_ave() {
		return this.kopo44_sum()/3.0;
	}
	//public 선언한 ave을 생성자 ave으로 리턴
	public static void main(String[] args) {//메인 메소드
		
		int kopo44_iPerson = 5;//iPerson 5 선언
		
		kopo44_09[] kopo44_inData = new kopo44_09[kopo44_iPerson];//kopo44_09에 있는 메소드 호출을 위한 객체선언
		
		for (int kopo44_i = 0; kopo44_i < kopo44_iPerson; kopo44_i++) {//for반복문
			String kopo44_name = String.format("홍길%02d", kopo44_i);
			int kopo44_kor = (int)(Math.random()*100);
			int kopo44_eng = (int)(Math.random()*100);
			int kopo44_mat = (int)(Math.random()*100);
			//이름을 홍길i로 받고 kor eng mat를 랜덤으로 0~100 사이 받음
			kopo44_inData[kopo44_i] = new kopo44_09(kopo44_name, kopo44_kor, kopo44_eng, kopo44_mat);
			//받은 값들을 inData[i]에 순차적으로 넣음
		}
		
		for (int kopo44_i = 0; kopo44_i < kopo44_inData.length; kopo44_i++) {//for 반복
			System.out.printf("번호:%d, 이름:%s, 국어:%3d점, 영어:%3d점, 수학:%3d점, 총합:%3d점, 평균:%3f점\n", kopo44_i, kopo44_inData[kopo44_i].kopo44_name,
					kopo44_inData[kopo44_i].kopo44_kor, kopo44_inData[kopo44_i].kopo44_eng, kopo44_inData[kopo44_i].kopo44_mat, kopo44_inData[kopo44_i].kopo44_sum(),
					kopo44_inData[kopo44_i].kopo44_ave());
			//출력양식
		}
		
		
	}
}
