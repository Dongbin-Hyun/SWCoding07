
public class kopo44_01 {//클래스

	public static void main(String[] args) {//메인메소드
		// TODO Auto-generated method stub
		
		kopo44_02 kop44_function = new kopo44_02();//kopo44_02 불러오기 위한 객체선언
		

		
		System.out.printf("HanBlankForeword[%s]\n", kop44_function.kopo44_HanBlankForeword("한글abcd",15));
		//kopo44_02의 HanBlankForeword 호출
		System.out.printf("HanBlankForeword[%s]\n", kop44_function.kopo44_HanBlankForeword("한글한글aa",15));
		//kopo44_02의 HanBlankForeword 호출
		System.out.printf("HanBlankBackword[%s]\n", kop44_function.kopo44_HanBlankBackword("한글aa",15));
		//kopo44_02의 HanBlakcBackword 호출
		System.out.printf("HanBlankBackword[%s]\n", kop44_function.kopo44_HanBlankBackword("한글abcd",15));
		//kopo44_02의 HanBlakcBackword 호출
		System.out.printf("한글은 [%s]개\n", kop44_function.kopo44_HanCount("한글한글aa"));
		//kopo44_02의 HanCount 호출
	}

}
