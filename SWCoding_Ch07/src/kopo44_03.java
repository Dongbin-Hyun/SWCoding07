import java.text.DecimalFormat;//DecimalForamt import

public class kopo44_03 {//Ŭ����

	public static void main(String[] args) {//���� �޼ҵ�
		// TODO Auto-generated method stub
		DecimalFormat kopo44_df = new DecimalFormat("###,###,###,###");//�ܼ�â�� ǥ�õ� �ݾ��� ǥ������
		String[] kopo44_OneRec = {//���������� ����� ��
				 " ��-0d974rion-��a0 5,000,000 2 10,000,000",
				 " a����4�����θ�     14,020 4     56,080",
				 " ����Ʈ-ǻ�����α�    25,000 1     25,000",
				 " ����-��Ϲ���Ĩ          10 2         20",
				 "*�뱸�����¸�����      1,206 5      6,030",
				 "*õ�������ְ���        1,350 4      5,400",
				 "*�����������ް�      7,01910     70,190",
				 "*�����ī����20Kg     35,000 1     35,000",
				 " �񸻸���1ũ��Ư     9,90010     99,000",
				 " �Ƶ�ٽ�-���۽�Ÿ    89,000 1     89,000",
				 " �Ƶ�ٽ�-�߱��۷�   123,500 1    123,500",
				 "*��d����ٹ��߱�ġ 9,999,999 2 19,999,998",
				 "*���ֿ���������ġ     12,000 4     48,000",
				 " ��ü������-Ŀ�Ǹ�   143,200 1    143,200",
				 " �����ѳ���-��Ƽ��     8,900 4     35,600",
				 "*���ִ²ܸ���ȣ��      1,080 5      5,400",
				 " ��ȭ��-�Ŷ��           790 3      2,370",
				 " ��ɽŶ���          670 3      2,010",
				 " �̸�Ʈ/�����ʹ�       9,900 1      9,900",
				 " ����ũ-����̿���   412,900 2    825,800",
				 " ���������÷�1��     7,741 1      7,741",
				 " ��������Ư���߱�      1,230 2      2,460",
				 " ����-��ݺ�����ġ       300 3        900",
				 "*����󱹻�ٳ���      1,900 5      9,500",
				 "*��                    7,800 1      7,800",
				 " �����к���ü�߰�     23,000 1     23,000",
				 " Ȳ���鵵�ͽ�����          1 6          6",
				 " ������-��īĨ����     1,200 2      1,000",//Ʋ�������� ����
				 " �����۽�-�ֽ�����        12 1         12",
				 " �ƽ�-��ī�����     6,400 1      6,400"
		};
		
		String[] kopo44_name = new String[kopo44_OneRec.length];//���ڿ� �迭 name�� �����ϰ� OneRec�� ���̸�ŭ �迭�� ����.
		int[] kopo44_price = new int[kopo44_OneRec.length];//������ �迭 price�� �����ϰ� OneRec�� ���̸�ŭ �迭�� ����.
		int[] kopo44_amount = new int[kopo44_OneRec.length];//������ �迭 amount�� �����ϰ� OneRec�� ���̸�ŭ �迭�� ����.
		int[] kopo44_sum = new int[kopo44_OneRec.length];//������ �迭 sum�� �����ϰ� OneRec�� ���̸�ŭ �迭�� ����.
		int[] kopo44_comsum = new int [kopo44_OneRec.length];//������ �迭 comsum�� �����ϰ� OneRec�� ���̸�ŭ �迭�� ����.
		
		for(int kopo44_i = 0; kopo44_i < kopo44_OneRec.length; kopo44_i++) {//for�ݺ����� i�� 0���� i�� OneRec ���̺��� ���� ������ i�� 1�� ������Ű�鼭 ����.
			byte[] kopo44_bb = kopo44_OneRec[kopo44_i].getBytes();//getBytes�� �̿��Ͽ� word�� ����Ʈ������ �޾� ����Ʈ�迭 wdcount�� ����.
			kopo44_name[kopo44_i] = new String(kopo44_bb, 0, 19);//name �迭�� �ε��� i���� 0���� 19��ŭ ������ ������ �߶� �߰�.
			kopo44_price[kopo44_i] = Integer.parseInt(new String(kopo44_bb, 19, 9).trim().replace(",", ""));
			//price �迭�� �ε��� i���� 19���� 9��ŭ������ ������ �ڸ��� ������ ������ trim���� �����ϰ� ,�� replace�� �����ش��� �߰�. 
			kopo44_amount[kopo44_i] = Integer.parseInt(new String(kopo44_bb, 28, 3).trim());
			//amount �迭�� �ε��� i���� 28���� 3��ŭ������ ������ �ڸ��� ������ ������ trim���� �����ϰ� ,�� replace�� �����ش��� �߰�. 
			kopo44_sum[kopo44_i] = Integer.parseInt(new String(kopo44_bb, 31, 10).trim().replace(",", ""));
			//sum �迭�� �ε��� i���� 31���� 10��ŭ������ ������ �ڸ��� ������ ������ trim���� �����ϰ� ,�� replace�� �����ش��� �߰�. 
		}
		
		for(int kopo44_i = 0; kopo44_i < kopo44_OneRec.length; kopo44_i++) {//for�ݺ����� i�� 0���� i�� OneRec ���̺��� ���� ������ i�� 1�� ������Ű�鼭 ����.
			kopo44_comsum[kopo44_i] = kopo44_price[kopo44_i] * kopo44_amount[kopo44_i];//comsum�� �ε��� i��°�� price�ε��� i��°�� amount �ε��� i��°�� ���� ����.
			if(kopo44_comsum[kopo44_i] != kopo44_sum[kopo44_i]) {//���� comsum�� �ε��� i��°�� sum�� �ε��� i��°�� ���� �ʴٸ�
				System.out.printf("************************\n");//*���� �ٹٲ��� ȭ�鿡 ���.
				System.out.printf("����[%s]\n", kopo44_OneRec[kopo44_i]);//OneRec�� �ε��� i��°�� ȭ�鿡 ���.
				System.out.printf("����[%s%9s%3d%10s]\n", kopo44_name[kopo44_i], kopo44_df.format(kopo44_price[kopo44_i]), kopo44_amount[kopo44_i], kopo44_df.format(kopo44_comsum[kopo44_i]));
				//���� ����� �Ͽ��� ����� �� ��갪 comsum�� �ε��� i��°�� �ٸ�������� �Բ� ȭ�鿡 ���.
				System.out.printf("************************\n");//*���� �ٹٲ��� ȭ�鿡 ���.
			}
		}
		
	}
	
}

