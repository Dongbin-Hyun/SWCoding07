import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class kopo44_02 {//Ŭ����

	String kopo44_blank = "";//black�� ����

	public String kopo44_HanBlankForeword(String kop44_s, int kopo44_number) {//HanBlackForeword �޼ҵ� 
		for (int kopo44_i = 0; kopo44_i < kopo44_number; kopo44_i ++) {//i�� 0���� number �̸����� �ݺ� for��
			kopo44_blank += " ";	//black�� " "�߰�
		}
		return kopo44_blank.concat(kop44_s);//concat�� ��Ʈ�� ������ ���� �̾� �ٿ��ִ� ��ɾ�
	}

	public String kopo44_HanBlankBackword(String kopo44_s, int kopo44_number) {//HanBlankBackword �޼ҵ�
		for (int i = 0; i < kopo44_number; i ++) {//i�� 0���� number �̸����� �ݺ� for��
			kopo44_blank += " ";	//black�� " "�߰�
		}
		return kopo44_s.concat(kopo44_blank);//concat�� ��Ʈ�� ������ ���� �̾� �ٿ��ִ� ��ɾ�
	}

	public static int kopo44_HanCount(String kopo44_str){//https://selfdevelope.tistory.com/383
		//HanCount �޼ҵ�

		StringBuffer kopo44_sb=new StringBuffer();//��Ʈ������ ����

		if(kopo44_str!=null && kopo44_str.length()!=0){//str�� ���� �ƴϰ� ���̰� 0�� �ƴ϶��

			Pattern kopo44_p = Pattern.compile("[��-�R]");//�ѱ��� ã�� ���ִ� ���� 

			Matcher kopo44_m = kopo44_p.matcher(kopo44_str);//��Ī�� ����

			while(kopo44_m.find()){

				kopo44_sb.append(kopo44_m.group());//�̾ �ٿ���

			}

		}
		
		return kopo44_sb.length();//���ڼ��� ī��Ʈ �ϱ⿡ �װ��� ī��Ʈ�� ���̰� �ѱ� ����

	}




}
