
public class kopo44_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] kopo44_OneRec = {
				"�������,������� ���� ,�����׷�,�����ݾ�(��),�켱����",
				"���ʻ�Ȱ(����),���α��ʻ�Ȱ������� ���� ������(����),����޿�,10000,1",
				"���ʻ�Ȱ(�Ƿ�),���α��ʻ�Ȱ������� ���� ������(�Ƿ�),�Ƿ�޿�,10000,1",
				"���ʻ�Ȱ(����),���α��ʻ�Ȱ������� ���� ������(����),�����޿�,5000,1",
				"���ʻ�Ȱ(�ְ�),���α��ʻ�Ȱ������� ���� ������(�ְ�),�ְű޿�,5000,1",
				"������(����Ȯ��),����������Ȯ��(�� ������ �켱����) ,�켱����,5000,2",
				"������(��Ȱ�������),��Ȱ���������,��������Ȱ���������,5000,2",
				"������(��ּ���),��������ּ����� ,�����������,5000,2",
				"������(�Ѻθ���),�Ѻθ����������� ,�Ѻθ���,5000,2",
				"������(���κδ�氨���),���κδ�氨����� ,���������κδ�氨�����,5000,2",
				"�����(����),����κ������� ���� ����� ������ ���� ����� ,�����,5000,3",
				"����������(1~3��),���������� �� ���� �� ������ ���� ������ ���� 1~3�� ������,�Ϲ�,5000,3",
				"5.18������(1~3��),5.18 ���������� ���쿡 ���� ������ ���� 1~3�� ������ ,�Ϲ�,5000,3",
				"����������(��������),���������� ���쿡 ���� ������ ���� ���������� �Ǵ� ������������ �Ǹ��� �������� ���� 1�� ,�Ϲ�,5000,3",
				"3�ڳడ���̻�,�����ֿ��� ���谡 ��(�)3�� �Ǵ� ��(��)3�� �̻��� ����(�ֹε�ϵ���� ��Ź�Ƶ� ����) ,�Ϲ�,4000,4"

		};
		int kopo44_numberV;
		String[] kopo44_field_name = kopo44_OneRec[0].split(",");
		for (int kopo44_i = 1; kopo44_i < kopo44_OneRec.length - 1; kopo44_i++) {

			String[] kopo44_field = kopo44_OneRec[kopo44_i].split(",");
			kopo44_numberV = Integer.parseInt(kopo44_field[4]);

			String kopo44_strNum = String.valueOf(kopo44_numberV);
			String kopo44_korReadNum = "";



			String [] kopo44_numHead = {"��", "��", "��", "��", "��", "��", "��", "ĥ", "��", "��"};
			String [] kopo44_numTail = {"", "��", "��", "õ", "��", "��", "��", "õ", "��", "��"};

			int kopo44_numA = 0;
			int kopo44_numB = kopo44_strNum.length() -1;

			while (true) {//while �ݺ����� ������ i >=0���� �����Ͽ� i�� 0�� ���ų� ũ�ٸ� �ݺ����� ����ǵ��� �Ѵ�.
				if(kopo44_numA >= kopo44_strNum.length()) break;// ���� i�� sNumVal�� ���̿� ���ų� ũ�ٸ� break���� �����Ѵ�.

				if(kopo44_strNum.substring(kopo44_numA, kopo44_numA + 1).equals("0")) {//���� sNumVal�� i����, i�� 1�� ���� ������ ���ڿ��� �ڸ� ���� 0�� ���ٸ�
					if(kopo44_numTail[kopo44_numB].equals("��") || kopo44_numTail[kopo44_numB].equals("��")) {//���� unitX�� [j]�ε��� ���� ���̰ų� unitX�� [j]�ε��� ���� ���̸�
						kopo44_korReadNum = kopo44_korReadNum + kopo44_numTail[kopo44_numB];//sNumVoice���� unitX[j]�ε��� ���� �����Ѵ�. (sNumVoice += unitX[j]�� �ٲ㼭 �ۼ��� �� �ִ�)
					} else {//���� if������ �������� �ʴ´ٸ�
						//�ƹ��͵� �����ʴ´�.
					}
				} else if (kopo44_strNum.substring(kopo44_numA, kopo44_numA + 1).equals("1") && kopo44_numB > 5) {//�߰��� �κ����� //���� sNumVal�� i����, i�� 1�� ���� ������ ���ڿ��� �ڸ� ���� 1�� ���ų�
					kopo44_korReadNum = kopo44_korReadNum + kopo44_numTail[kopo44_numB];// j�� 5���� ũ�ٸ� sNumVoice���� unitX[j]�ε��� ���� �����Ѵ�. 
					//(sNumVoice += unitX[j]�� �ٲ㼭 �ۼ��� �� �ִ�)

				} else {//���� sNumVal�� i����, i�� 1�� ���� ������ ���ڿ��� �ڸ� ���� 0�� ���� �ʴٸ�
					kopo44_korReadNum = kopo44_korReadNum//sNumVoice�� ���� 
							+ kopo44_numHead[Integer.parseInt(kopo44_strNum.substring(kopo44_numA, kopo44_numA + 1))]
									//units�� ���������� ����ȯ�� (sNumVal�� i����, i�� 1�� ���� ������ ���ڿ��� �ڸ� ��)�� �ε���]�� ���� ���ϰ�
									+ kopo44_numTail[kopo44_numB];//unitX[j]�� ���� ���Ѵ�.
				}
				kopo44_numA++;//i�� ���� 1 ������Ų��.
				kopo44_numB--;//j�� ���� 1 ���ҽ�Ų��.
			}


			System.out.printf("*********************************************************\n");

			for (int kopo44_j = 0; kopo44_j < kopo44_field_name.length; kopo44_j++) {
				if (kopo44_j == 4) {
					System.out.printf(" %s : %s (%s)\n", kopo44_field_name[kopo44_j], kopo44_field[kopo44_j], kopo44_korReadNum);
				} else {
					System.out.printf(" %s : %s\n", kopo44_field_name[kopo44_j], kopo44_field[kopo44_j]);
				}
			}
			System.out.printf("*********************************************************\n");

		}
	}

}
