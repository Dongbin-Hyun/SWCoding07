
public class kopo44_13 {
	
	private int kopo44_student_id;//숫자형 전역변수 student_id를 private으로 정의.
	private String kopo44_name;//문자열형 전역변수 name를 private으로 정의.
	private int kopo44_kor;//숫자형 전역변수 kor를 private으로 정의.
	private int kopo44_eng;//숫자형 전역변수 eng를 private으로 정의.
	private int kopo44_mat;//숫자형 전역변수 mat를 private으로 정의.
	
	public kopo44_13(int kopo44_student_id, String kopo44_name, int kopo44_kor, int kopo44_eng, int kopo44_mat) {//생성자 P6classScore를 정의하고 파라미터로 전역변수 설정.
		this.kopo44_student_id = kopo44_student_id;//this를 이용하여 student_id가 위에있는 전역변수 student_id라고 선언.
		this.kopo44_name = kopo44_name;//this를 이용하여 name이 위에있는 전역변수 name이라고 선언.
		this.kopo44_kor = kopo44_kor;//this를 이용하여 kor이 위에있는 전역변수 kor이라고 선언.
		this.kopo44_eng = kopo44_eng;//this를 이용하여 eng이 위에있는 전역변수 eng이라고 선언.
		this.kopo44_mat = kopo44_mat;//this를 이용하여 mat이 위에있는 전역변수 mat이라고 선언.
	}
	public int kopo44_student_id() {return this.kopo44_student_id;}; //student_id함수를 생성하고 리턴값으로 전역변수 student_id를 줌.
	public String kopo44_name() {return this.kopo44_name;}; //name함수를 생성하고 리턴값으로 전역변수 name을 줌.
	public int kopo44_kor() {return this.kopo44_kor;}; //kor함수를 생성하고 this를 이용하여 kor이 위에있는 전역변수 kor이라고 알려주고 리턴값으로 전역변수 kor을 줌.
	public int kopo44_eng() {return this.kopo44_eng;}; //eng함수를 생성하고 this를 이용하여 eng이 위에있는 전역변수 eng이라고 알려주고 리턴값으로 전역변수 eng을 줌.
	public int kopo44_mat() {return this.kopo44_mat;}; //mat함수를 생성하고 this를 이용하여 mat이 위에있는 전역변수 mat이라고 알려주고 리턴값으로 전역변수 mat을 줌.
	public int kopo44_sum() {return this.kopo44_kor + this.kopo44_eng + this.kopo44_mat;}; //sum함수를 생성하고  this를 이용하여 전역변수들이라고 알려주고 3가지 전역변수의 합을 리턴값으로 줌.
	public double kopo44_avg() {return this.kopo44_sum() / 3.0;}; //avg함수를 생성하고 리턴값으로 sum함수의 리턴값 나누기 3.

}

