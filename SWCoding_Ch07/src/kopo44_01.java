
public class kopo44_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		kopo44_02 function = new kopo44_02();
		

		
		System.out.printf("HanBlankForeword[%s]\n", function.HanBlankForeword("한글abcd",15));
		System.out.printf("HanBlankForeword[%s]\n", function.HanBlankForeword("한글한글aa",15));
		System.out.printf("HanBlankBackword[%s]\n", function.HanBlankBackword("한글aa",15));
		System.out.printf("HanBlankBackword[%s]\n", function.HanBlankBackword("한글abcd",15));
		System.out.printf("한글은 [%]개\n]", function.HanCount("한글한글aa"));
	}

}
