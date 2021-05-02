

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class kopo44_16 {
	
	static ArrayList <kopo44_15> kopo44_ArrayOneRec = new ArrayList <kopo44_15>();//Ŭ������ ArrayLlist ArrayOneRec�� ����.
	
	static int kopo44_sumkor = 0;//�������� sumkor�� �����ϰ� ���� 0���� �ʱ�ȭ.
	static int kopo44_sumeng = 0;//�������� sumeng�� �����ϰ� ���� 0���� �ʱ�ȭ.
	static int kopo44_summat = 0;//�������� summat�� �����ϰ� ���� 0���� �ʱ�ȭ.
	static int kopo44_sumsum = 0;//�������� sumsum�� �����ϰ� ���� 0���� �ʱ�ȭ.
	static int kopo44_sumavg = 0;//�������� sumavg�� �����ϰ� ���� 0���� �ʱ�ȭ.
	static int kopo44_pcnt = 0;//�������� pcnt�� �����ϰ� ���� 0���� �ʱ�ȭ
	static int kopo44_cnt = 0;//�������� cnt�� �����ϰ� ���� 0���� �ʱ�ȭ.
	static int kopo44_pagesumkor = 0;// �������� pagekorsum�� �����ϰ� ���� 0���� �ʱ�ȭ.
	static int kopo44_pagesumeng = 0;// �������� pageengsum�� �����ϰ� ���� 0���� �ʱ�ȭ.
	static int kopo44_pagesummat = 0;// �������� pagematsum�� �����ϰ� ���� 0���� �ʱ�ȭ.
	static int kopo44_pagesumsum = 0;// �������� pagetotalsum�� �����ϰ� ���� 0���� �ʱ�ȭ.
	static int kopo44_pagesumavg = 0;// �������� pageavg�� �����ϰ� ���� 0���� �ʱ�ȭ.
	static final int kopo44_iPerson = 200;//�������� iPerson�� �����ϰ� ���� 200���� �ʱ�ȭ.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kopo44_dataSet();//dataSet�Լ��� �����Ͽ� data�� �޾ƿ�.
		kopo44_dataSort();//dataSort�Լ��� �����Ͽ� data���� ����.
		kopo44_pcnt = 1;
		for(int i = 0; i < kopo44_ArrayOneRec.size(); i++) {//for�ݺ����� i�� 0���� ArrayOneRec�� ũ����� i�� 1�� ������Ű�鼭 ����.
			
			if(kopo44_cnt % 30 == 0) {//���� cnt�� 30���� ���������� �������� 0�̶��
				
				kopo44_HeaderPrint();//HeaderPrint�Լ��� �����Ͽ� Header�� ȭ�鿡 ���
				kopo44_pcnt ++; 
			}
			
			kopo44_ItemPrint(i);//ItemPrint�Լ��� �Ķ���ͷ� i�� �ְ� ����.
			
			kopo44_cnt++;//�������� cnt�� 1�� ����.
			
			
			if(kopo44_cnt % 30 == 0) {//���� cnt�� 30���� ���������� �������� 0�̶��
				
				kopo44_TailPrint();//TailPrint�Լ��� �����Ͽ� Tail�� ȭ�鿡 ���.
				kopo44_resetPagesum();//resetPagesum�Լ��� �����Ͽ� pagesum�������� 0���� ����.
			}
			
		}
		kopo44_TailPrint();//TailPrint�Լ��� �����Ͽ� Tail�� ȭ�鿡 ���.


	}

	private static void kopo44_dataSort() {//dataSort�Լ��� ����.
		Comparator<kopo44_15> kopo44_st = new Comparator<kopo44_15>() {//Comparator Ŭ������ �޾Ƽ� ��ü�� ����� �ν��Ͻ��� �����Ͽ��� ��ü�� ����.
			public int compare1(kopo44_15 kopo44_a1, kopo44_15 kopo44_a2) {//�Լ� compare�� ����� �Ķ���ͷ� a1�� a2�� ����.
				return (kopo44_a2.kopo44_sum() - kopo44_a1.kopo44_sum());//���ϰ����� a2�� sum�Լ����� a1�� sum�Լ��� �� ���� ����.
			}

			@Override
			public int compare(kopo44_15 kopo44_o1, kopo44_15 kopo44_o2) {//compare �޼ҵ带 �����ε��ϰ� �Ķ���ͷ� o1�� o2�� ����.
				// TODO Auto-generated method stub
				return (kopo44_o2.kopo44_sum() - kopo44_o1.kopo44_sum());//���ϰ����� o2�� sum�Լ����� o1�� sum�Լ��� �� ���� ����.
			}

		};
		Collections.sort(kopo44_ArrayOneRec, kopo44_st);//Collections.sort�� ArrayOneRec �迭�� ����.
		
	}

	private static void kopo44_TailPrint() {
		// TODO Auto-generated method stub
		
		System.out.printf("=========================================\n");//*���� �ٹٲ��� ȭ�鿡 �����.
		System.out.printf("����������\n");//������������ �ٹٲ��� ȭ�鿡 �����
		System.out.printf("�����հ� %7d  �������: %6.2f\n", kopo44_pagesumkor, kopo44_pagesumkor / 30.);//���� pagesumkor�� cnt�� ���� sumpagekor�� ȭ�鿡 �����.
		System.out.printf("�����հ� %7d  �������: %6.2f\n", kopo44_pagesumeng, kopo44_pagesumeng / 30.);//���� pagesumeng�� cnt�� ���� sumpageeng�� ȭ�鿡 �����.
		System.out.printf("�����հ� %7d  �������: %6.2f\n", kopo44_pagesummat, kopo44_pagesummat / 30.);//���� pagesummat�� cnt�� ���� sumpagemat�� ȭ�鿡 �����.
		System.out.printf("������հ� %5d    �����: %6.2f\n", kopo44_pagesumavg, kopo44_pagesumavg / 30.);//���� pagesumavg�� cnt�� ���� sumpageavg�� ȭ�鿡 �����.
		System.out.printf("=========================================\n");//*���� �ٹٲ��� ȭ�鿡 �����.
		System.out.printf("����������\n");//������������ �ٹٲ��� ȭ�鿡 �����
		System.out.printf("�����հ� %7d  �������: %6.2f\n", kopo44_sumkor, kopo44_sumkor / (double)kopo44_cnt);//���� sumkor�� cnt�� ���� sumkor�� ȭ�鿡 �����.
		System.out.printf("�����հ� %7d  �������: %6.2f\n", kopo44_sumeng, kopo44_sumeng / (double)kopo44_cnt);//���� sumeng�� cnt�� ���� sumeng�� ȭ�鿡 �����.
		System.out.printf("�����հ� %7d  �������: %6.2f\n", kopo44_summat, kopo44_summat / (double)kopo44_cnt);//���� summat�� cnt�� ���� summat�� ȭ�鿡 �����.
		System.out.printf("������հ� %5d    �����: %6.2f\n", kopo44_sumavg, kopo44_sumavg / (double)kopo44_cnt);//���� sumavg�� cnt�� ���� sumavg�� ȭ�鿡 �����.
		System.out.println();//�ٹٲ��� ȭ�鿡 �����.

		
	}

	private static void kopo44_ItemPrint(int i) {//ItemPring�Լ��� �����ϰ� �Ķ���ͷ� ������ ���� i�� �־���..
		// TODO Auto-generated method stub
		kopo44_15 kopo44_rec;//P9OneRec Ŭ������ �޾Ƽ� ��ü�� �����.
		
		kopo44_rec = kopo44_ArrayOneRec.get(i);//�ν��Ͻ��� �����Ͽ��� ��ü�� ����.
		System.out.printf("%3d  %-5s %3d  %3d  %3d  %3d  %6.2f\n", kopo44_rec.kopo44_student_id(), kopo44_rec.kopo44_name(), kopo44_rec.kopo44_kor(), 
				kopo44_rec.kopo44_eng(), kopo44_rec.kopo44_mat(), kopo44_rec.kopo44_sum(), kopo44_rec.kopo44_avg());
		//�������� ȭ�鿡 �����.
		kopo44_sumkor += kopo44_rec.kopo44_kor();// ���� sumkor�� rec.kor()�� ����.
		kopo44_sumeng += kopo44_rec.kopo44_eng();// ���� sumeng�� rec.eng()�� ����.
		kopo44_summat += kopo44_rec.kopo44_mat();// ���� summat�� rec.mat()�� ����.
		kopo44_sumsum += kopo44_rec.kopo44_sum();// ���� sumsum�� rec.sum()�� ����.
		kopo44_sumavg += kopo44_rec.kopo44_avg();// ���� sumavg�� rec.avg()�� ����.
		kopo44_pagesumkor += kopo44_rec.kopo44_kor();// ���� pagesumkor�� rec.kor()�� ����.
		kopo44_pagesumeng += kopo44_rec.kopo44_eng();// ���� pagesumeng�� rec.eng()�� ����.
		kopo44_pagesummat += kopo44_rec.kopo44_mat();// ���� pagesummat�� rec.mat()�� ����.
		kopo44_pagesumsum += kopo44_rec.kopo44_sum();// ���� pagesumsum�� rec.sum()�� ����.
		kopo44_pagesumavg += kopo44_rec.kopo44_avg();// ���� pagesumavg�� rec.avg()�� ����.
		
	}
	
	private static void kopo44_resetPagesum() {//resetPagesum�Լ��� ����.
		// TODO Auto-generated method stub
		kopo44_pagesumkor = 0;// ���� pagesumkor�� 0���� �ʱ�ȭ.
		kopo44_pagesumeng = 0;// ���� pagesumeng�� 0���� �ʱ�ȭ.
		kopo44_pagesummat = 0;// ���� pagesummat�� 0���� �ʱ�ȭ.
		kopo44_pagesumsum = 0;// ���� pagesumsum�� 0���� �ʱ�ȭ.
		kopo44_pagesumavg = 0;// ���� pagesumavg�� 0���� �ʱ�ȭ.
		
	}

	private static void kopo44_HeaderPrint() {//HeaderPring�Լ��� ����.
		
		
		Date kopo44_d = new Date();//�ý����� ��¥ �� �ð��� ���� �� �ֵ��� java.util ��Ű���� Date Ŭ������ ����.
		SimpleDateFormat kopo44_sf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");//�޾ƿ� ��¥�� ������ ��ȯ�ϱ����� SimpleDateFormat Ŭ������ �����ϰ�
		 //Format������ ("yyyy/MM/dd HH:mm:ss")�� ����.
		System.out.printf("%16s\n","��������ǥ");//��������ǥ�� �ٹٲ��� ȭ�鿡 �����
		System.out.printf("PAGE : %d  ������� : %s\n", kopo44_pcnt, kopo44_sf.format(kopo44_d));//��¥�� �޾ƿ� ���� d�� �Ʊ� ������ SimpleDateFormat���� yyyy.MM.dd HH:mm:ss ���·� �����.
		System.out.printf("=========================================\n");//*���� �ٹٲ��� ȭ�鿡 �����.
		System.out.printf("%2s%4s %3s %2s %2s %2s   %2s\n", "��ȣ", "�̸�", "����", "����", "����", "�հ�", "���");//Header�� ȭ�鿡 �����.
		System.out.printf("=========================================\n");//*���� �ٹٲ��� ȭ�鿡 �����.
		
	}

	private static void kopo44_dataSet() {//dataSetPrint�Լ��� ����.
		// TODO Auto-generated method stub
		for (int kopo44_i = 0; kopo44_i < kopo44_iPerson; kopo44_i++) {//for�ݺ������� i�� 0���� iPerson���� ���������� 1�� ������Ű�鼭 ����.
			String kopo44_name = String.format("ȫ��%02d", kopo44_i + 1);//���� name�� i + 1�� string���� ����ȯ�� ���� ȫ��%02d�� ������ ����. 
			int kopo44_kor = (int)(Math.random() * 100);//���� kor�� ���������� ����ȯ�� (Math.random() * 100)�� ������ ����.
			int kopo44_eng = (int)(Math.random() * 100);//���� eng�� ���������� ����ȯ�� (Math.random() * 100)�� ������ ����.
			int kopo44_mat = (int)(Math.random() * 100);//���� mat�� ���������� ����ȯ�� (Math.random() * 100)�� ������ ����.
			kopo44_ArrayOneRec.add(new kopo44_15(kopo44_i + 1, kopo44_name, kopo44_kor, kopo44_eng, kopo44_mat));//ArrayList�� P9OneRec �Լ��� ���ؼ� ������� ���� ����.
		}
	}
}

