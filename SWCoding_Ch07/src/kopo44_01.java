
public class kopo44_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		kopo44_02 function = new kopo44_02();
		

		
		System.out.printf("HanBlankForeword[%s]\n", function.HanBlankForeword("�ѱ�abcd",15));
		System.out.printf("HanBlankForeword[%s]\n", function.HanBlankForeword("�ѱ��ѱ�aa",15));
		System.out.printf("HanBlankBackword[%s]\n", function.HanBlankBackword("�ѱ�aa",15));
		System.out.printf("HanBlankBackword[%s]\n", function.HanBlankBackword("�ѱ�abcd",15));
		System.out.printf("�ѱ��� [%]��\n]", function.HanCount("�ѱ��ѱ�aa"));
	}

}
