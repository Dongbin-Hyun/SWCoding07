import java.util.ArrayList;

public class kopo44_10 {


	public static void main(String[] args) {//�������κ��� ���α׷�����
		// TODO Auto-generated method stub
		ArrayList kopo44_iAL = new ArrayList();//ArrayList Ŭ������ �޾Ƽ� ��ü�� ����� �ν��Ͻ��� �����Ͽ��� ��ü�� ����.

		kopo44_iAL.add("abc");//ArrayList�� �� abc�� ����.
		kopo44_iAL.add("abcd");//ArrayList�� �� abcd�� ����.
		kopo44_iAL.add("efga");//ArrayList�� �� efga�� ����.
		kopo44_iAL.add("������0");//ArrayList�� �� ������0�� ����.
		kopo44_iAL.add("1234");//ArrayList�� �� 1234�� ����.
		kopo44_iAL.add("12rk34");//ArrayList�� �� 12rk34�� ����.

		System.out.printf("***************************************\n");//*���� �ٹٲ��� ȭ�鿡 ���.
		System.out.printf(" ���� ArraySize %d \n", kopo44_iAL.size());//���� iAL�� ũ�⸦ ȭ�鿡 ���.
		for(int kopo44_i = 0; kopo44_i < kopo44_iAL.size(); kopo44_i++) {//for�ݺ����� i�� 0���� i�� iAl�� ũ�⺸�� ���������� i�� 1�� ������Ű�鼭 ����.
			System.out.printf(" ArraySize %d = %s\n", kopo44_i,kopo44_iAL.get(kopo44_i));//���� i�� iAL�� i�ε��� ���� ȭ�鿡 ���.
		}

		kopo44_iAL.set(3,  "������");
		System.out.printf("***************************************\n");//*���� �ٹٲ��� ȭ�鿡 ���.
		System.out.printf(" ���뺯�� ArraySize %d \n", kopo44_iAL.size());
		for(int kopo44_i = 0; kopo44_i < kopo44_iAL.size(); kopo44_i++) {//for�ݺ����� i�� 0���� i�� iAl�� ũ�⺸�� ���������� i�� 1�� ������Ű�鼭 ����.
			System.out.printf(" ArraySize %d = %s\n", kopo44_i,kopo44_iAL.get(kopo44_i));//���� i�� iAL�� i�ε��� ���� ȭ�鿡 ���.
		}

		kopo44_iAL.remove(4);
		System.out.printf("***************************************\n");//*���� �ٹٲ��� ȭ�鿡 ���.
		System.out.printf(" ������� ArraySize %d \n", kopo44_iAL.size());
		for(int kopo44_i = 0; kopo44_i < kopo44_iAL.size(); kopo44_i++) {//for�ݺ����� i�� 0���� i�� iAl�� ũ�⺸�� ���������� i�� 1�� ������Ű�鼭 ����.
			System.out.printf(" ArraySize %d = %s\n", kopo44_i,kopo44_iAL.get(kopo44_i));//���� i�� iAL�� i�ε��� ���� ȭ�鿡 ���.
		}

		kopo44_iAL.sort(null);;
		System.out.printf("***************************************\n");//*���� �ٹٲ��� ȭ�鿡 ���.
		System.out.printf(" ����Ʈsort ArraySize %d \n", kopo44_iAL.size());
		for(int kopo44_i = 0; kopo44_i < kopo44_iAL.size(); kopo44_i++) {//for�ݺ����� i�� 0���� i�� iAl�� ũ�⺸�� ���������� i�� 1�� ������Ű�鼭 ����.
			System.out.printf(" ArraySize %d = %s\n", kopo44_i,kopo44_iAL.get(kopo44_i));//���� i�� iAL�� i�ε��� ���� ȭ�鿡 ���.
		}

		kopo44_iAL.clear();;
		System.out.printf("***************************************\n");//*���� �ٹٲ��� ȭ�鿡 ���.
		System.out.printf(" ���� ���� ArraySize %d \n", kopo44_iAL.size());
		for(int kopo44_i = 0; kopo44_i < kopo44_iAL.size(); kopo44_i++) {//for�ݺ����� i�� 0���� i�� iAl�� ũ�⺸�� ���������� i�� 1�� ������Ű�鼭 ����.
			System.out.printf(" ArraySize %d = %s\n", kopo44_i,kopo44_iAL.get(kopo44_i));//���� i�� iAL�� i�ε��� ���� ȭ�鿡 ���.
		}

	}

}
