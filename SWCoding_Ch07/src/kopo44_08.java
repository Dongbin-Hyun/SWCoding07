
public class kopo44_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kopo44_iArray = {1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11,2121,121, 11, 5, 6, 33};
		//intp[] iArray �迭 ����
		

			
		int kopo44_iMax = kopo44_iArray[0];//ù��° ���� iMax ����
		int kopo44_iMaxPt = 0;//�ʱ�ȭ ����
		for (int kopo44_j = 0; kopo44_j < kopo44_iArray.length; kopo44_j++) {//�迭�� �ִ� ������ ���ʷ� ���ϱ� ���� for �󺹹�
			if (kopo44_iMax < kopo44_iArray[kopo44_j]) {//iMax�� ������ �迭�� ���� �� �װͺ��� �۴ٸ�
				kopo44_iMax = kopo44_iArray[kopo44_j];//iMax�� �ִ��� �� �迭�� ������ ����
				kopo44_iMaxPt = kopo44_j;// j��� ����
			}
		}
		
		int kopo44_iMin = kopo44_iArray[0];//ù��° ���� iMin ����
		int kopo44_iMinPt = 0;//�ʱ�ȭ ����
		for (int kopo44_k = 0; kopo44_k < kopo44_iArray.length; kopo44_k++) {//�迭�� �ִ� ������ ���ʷ� ���ϱ� ���� for �󺹹�
			if (kopo44_iMin > kopo44_iArray[kopo44_k]) {//iMin�� �ּڰ��� ���� �迭������ �װͺ��� ũ�ٸ�
				kopo44_iMin = kopo44_iArray[kopo44_k];//�ּڰ��� ����
				kopo44_iMinPt = kopo44_k;//iMinPt = k ����
			}
		}
		System.out.printf("Max : iArray[%d] = %d\n", kopo44_iMaxPt, kopo44_iMax);//��¾��
		System.out.printf("Min : iArray[%d] = %d\n", kopo44_iMinPt, kopo44_iMin);//��¾��
		
		}
	
}


