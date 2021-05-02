import java.util.ArrayList;

public class kopo44_12 {//Ŭ����

	private int kopo44_student_id;
	private String kopo44_name;
	private int kopo44_kor;
	private int kopo44_eng;
	private int kopo44_mat;
	//��ȣ �̸� ���� ���� ������ private���� ����

	static ArrayList<kopo44_12> kopo44_ArrayOneRec = new ArrayList<kopo44_12>();
	//kopo44_12�� ȣ���ϱ� ���� ����

	static int kopo44_sumkor = 0;
	static int kopo44_sumeng = 0;
	static int kopo44_summat = 0;
	static int kopo44_sumsum = 0;
	static int kopo44_sumave = 0;
	static final int kopo44_iPerson = 20;
	//static���� ���� ���� ���� �հ� ���� �ʱ�ȭ
	//iPerson 20 ����

	public kopo44_12(int kopo44_student_id, String kopo44_name, int kopo44_kor, int kopo44_eng, int kopo44_mat) {
		//kopo44_12 ������ ����
		this.kopo44_student_id = kopo44_student_id;
		this.kopo44_name = kopo44_name;
		this.kopo44_kor = kopo44_kor;
		this.kopo44_eng = kopo44_eng;
		this.kopo44_mat = kopo44_mat;
		//������ ��Ī
	}

	public int kopo44_student_id() {
		return this.kopo44_student_id;
	}
	//student_id�� ��Ī���Ѽ� ����

	public String kopo44_name() {
		return this.kopo44_name;
	}
	//name�� ��Ī���Ѽ� ����
	public int kopo44_kor() {
		return this.kopo44_kor;
	}
	//kor�� ��Ī���Ѽ� ����
	public int kopo44_eng() {
		return this.kopo44_eng;
	}
	//eng�� ��Ī���Ѽ� ����
	public int kopo44_mat () {
		return this.kopo44_mat;
	}
	//mat�� ��Ī���Ѽ� ����
	public int kopo44_sum() {
		return this.kopo44_kor + this.kopo44_eng + this.kopo44_mat;
	}
	//sum�� ��Ī���Ѽ� ����
	public double kopo44_ave() {
		return this.kopo44_sum() / 3.0;
	}
	//ave�� ��Ī���Ѽ� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//���θ޼ҵ�

		kopo44_dataSet();//�޼ҵ� ȣ��
		kopo44_HeaderPrint();//�޼ҵ� ȣ��
		for (int kopo44_i = 0; kopo44_i < kopo44_ArrayOneRec.size(); kopo44_i++) {//������ �迭�� ��� �ڷ� ���������� �̱� ���� for �ݺ���
			kopo44_ItemPrint(kopo44_i);//�޼ҵ� ȣ��
		}
		kopo44_TailPrint();//�޼ҵ� ȣ��
	}
	
	public static void kopo44_dataSet() {//dataSet �޼ҵ�
		for (int kopo44_i = 0; kopo44_i < kopo44_iPerson; kopo44_i++) {//0���� iPerson �̸�����
			String kopo44_name = String.format("ȫ��%02d", kopo44_i);
			int kopo44_kor = (int)(Math.random()*100);
			int kopo44_eng = (int)(Math.random()*100);
			int kopo44_mat = (int)(Math.random()*100);
			//�̸��� ������ ������ �̾Ƴ�
			//������ 0~100������ ���� ���� ����
			kopo44_ArrayOneRec.add(new kopo44_12(kopo44_i, kopo44_name, kopo44_kor, kopo44_eng, kopo44_mat));
			//�̾Ƴ� ������ ArrayOneRec�迭�� ���� ����
			
		}
	}
	
	public static void kopo44_HeaderPrint() {//HeaderPrint �޼ҵ�
		System.out.printf("****************************************************\n");
		System.out.printf(("%2s %4s %2s %2s %2s %2s	%2s\n"), "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���" );
		System.out.printf("****************************************************\n");
		//��¾��
	}
	
	public static void kopo44_ItemPrint(int kopo44_i) {
		//ItemPrint �޼ҵ�
		kopo44_12 kopo44_rec;
		kopo44_rec = kopo44_ArrayOneRec.get(kopo44_i);
		//kopo44_12 ȣ���� ���� ��ü����
		System.out.printf("%4d %4s %3d %3d %3d	%3d	%6.2f\n", kopo44_rec.kopo44_student_id(), kopo44_rec.kopo44_name(), kopo44_rec.kopo44_kor(), kopo44_rec.kopo44_eng(), 
				kopo44_rec.kopo44_mat(), kopo44_rec.kopo44_sum(), kopo44_rec.kopo44_ave());
		//��¾��
		kopo44_sumkor += kopo44_rec.kopo44_kor();
		kopo44_sumeng += kopo44_rec.kopo44_eng();
		kopo44_summat += kopo44_rec.kopo44_mat();
		kopo44_sumsum += kopo44_rec.kopo44_sum();
		kopo44_sumave += kopo44_rec.kopo44_ave();
		//������ �հ踦 ���ϱ� ���� +=�� ����
	}
	
	public static void kopo44_TailPrint() {
		//TailPrint �޼ҵ�
		System.out.printf("****************************************************\n");
		//��¾��
		System.out.printf("�����հ� %d		������: %6.2f\n", kopo44_sumkor, kopo44_sumkor / (double)kopo44_ArrayOneRec.size());
		//��¾��
		System.out.printf("�����հ� %d		�������: %6.2f\n", kopo44_sumeng, kopo44_sumeng / (double)kopo44_ArrayOneRec.size());
		//��¾��
		System.out.printf("�����հ� %d		�������: %6.2f\n", kopo44_summat, kopo44_summat / (double)kopo44_ArrayOneRec.size());
		//��¾��
		System.out.printf("****************************************************\n");
		//��¾��
		System.out.printf("������հ� %d	  �����: %6.2f\n", kopo44_sumave, kopo44_sumave / (double)kopo44_ArrayOneRec.size());
		//��¾��
	}	



}
