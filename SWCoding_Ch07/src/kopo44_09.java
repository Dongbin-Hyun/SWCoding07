
public class kopo44_09 {//Ŭ����
	
	public String kopo44_name;
	public int kopo44_kor;
	public int kopo44_eng;
	public int kopo44_mat;
	//name kor mat public���� ����
	public kopo44_09(String name, int kor, int eng, int mat) {
		this.kopo44_name = name;
		this.kopo44_kor = kor;
		this.kopo44_eng = eng;
		this.kopo44_mat = mat;
	//public���� kopo44_09 ������ ����	
	}
	
	public String kopo44_name() {
		return this.kopo44_name;
	}
	//public ������ name�� ������ name���� ����
	public int kopo44_kor() {
		return this.kopo44_kor;
	}
	//public ������ kor�� ������ kor���� ����
	public int kopo44_eng() {
		return this.kopo44_eng;
	}
	//public ������ eng�� ������ eng���� ����
	public int kopo44_mat() {
		return this.kopo44_mat;
	}
	//public ������ mat�� ������ mat���� ����
	public int kopo44_sum() {
		return this.kopo44_kor + this.kopo44_eng + this.kopo44_mat;
	}
	//public ������ sum�� ������ sum���� ����
	public double kopo44_ave() {
		return this.kopo44_sum()/3.0;
	}
	//public ������ ave�� ������ ave���� ����
	public static void main(String[] args) {//���� �޼ҵ�
		
		int kopo44_iPerson = 5;//iPerson 5 ����
		
		kopo44_09[] kopo44_inData = new kopo44_09[kopo44_iPerson];//kopo44_09�� �ִ� �޼ҵ� ȣ���� ���� ��ü����
		
		for (int kopo44_i = 0; kopo44_i < kopo44_iPerson; kopo44_i++) {//for�ݺ���
			String kopo44_name = String.format("ȫ��%02d", kopo44_i);
			int kopo44_kor = (int)(Math.random()*100);
			int kopo44_eng = (int)(Math.random()*100);
			int kopo44_mat = (int)(Math.random()*100);
			//�̸��� ȫ��i�� �ް� kor eng mat�� �������� 0~100 ���� ����
			kopo44_inData[kopo44_i] = new kopo44_09(kopo44_name, kopo44_kor, kopo44_eng, kopo44_mat);
			//���� ������ inData[i]�� ���������� ����
		}
		
		for (int kopo44_i = 0; kopo44_i < kopo44_inData.length; kopo44_i++) {//for �ݺ�
			System.out.printf("��ȣ:%d, �̸�:%s, ����:%3d��, ����:%3d��, ����:%3d��, ����:%3d��, ���:%3f��\n", kopo44_i, kopo44_inData[kopo44_i].kopo44_name,
					kopo44_inData[kopo44_i].kopo44_kor, kopo44_inData[kopo44_i].kopo44_eng, kopo44_inData[kopo44_i].kopo44_mat, kopo44_inData[kopo44_i].kopo44_sum(),
					kopo44_inData[kopo44_i].kopo44_ave());
			//��¾��
		}
		
		
	}
}
