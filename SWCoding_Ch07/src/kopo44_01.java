
public class kopo44_01 {//Ŭ����

	public static void main(String[] args) {//���θ޼ҵ�
		// TODO Auto-generated method stub
		
		kopo44_02 kop44_function = new kopo44_02();//kopo44_02 �ҷ����� ���� ��ü����
		

		
		System.out.printf("HanBlankForeword[%s]\n", kop44_function.kopo44_HanBlankForeword("�ѱ�abcd",15));
		//kopo44_02�� HanBlankForeword ȣ��
		System.out.printf("HanBlankForeword[%s]\n", kop44_function.kopo44_HanBlankForeword("�ѱ��ѱ�aa",15));
		//kopo44_02�� HanBlankForeword ȣ��
		System.out.printf("HanBlankBackword[%s]\n", kop44_function.kopo44_HanBlankBackword("�ѱ�aa",15));
		//kopo44_02�� HanBlakcBackword ȣ��
		System.out.printf("HanBlankBackword[%s]\n", kop44_function.kopo44_HanBlankBackword("�ѱ�abcd",15));
		//kopo44_02�� HanBlakcBackword ȣ��
		System.out.printf("�ѱ��� [%s]��\n", kop44_function.kopo44_HanCount("�ѱ��ѱ�aa"));
		//kopo44_02�� HanCount ȣ��
	}

}
