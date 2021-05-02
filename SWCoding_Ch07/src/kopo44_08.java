
public class kopo44_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] kopo44_iArray = {1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11,2121,121, 11, 5, 6, 33};
		//intp[] iArray 배열 선언
		

			
		int kopo44_iMax = kopo44_iArray[0];//첫번째 값을 iMax 선언
		int kopo44_iMaxPt = 0;//초기화 선언
		for (int kopo44_j = 0; kopo44_j < kopo44_iArray.length; kopo44_j++) {//배열에 있는 값들을 차례로 비교하기 위한 for 빈복문
			if (kopo44_iMax < kopo44_iArray[kopo44_j]) {//iMax가 각각의 배열과 비교할 때 그것보다 작다면
				kopo44_iMax = kopo44_iArray[kopo44_j];//iMax의 최댓값을 그 배열의 값으로 변경
				kopo44_iMaxPt = kopo44_j;// j라고 선언
			}
		}
		
		int kopo44_iMin = kopo44_iArray[0];//첫번째 값을 iMin 선언
		int kopo44_iMinPt = 0;//초기화 선언
		for (int kopo44_k = 0; kopo44_k < kopo44_iArray.length; kopo44_k++) {//배열에 있는 값들을 차례로 비교하기 위한 for 빈복문
			if (kopo44_iMin > kopo44_iArray[kopo44_k]) {//iMin의 최솟값을 각각 배열값들을 그것보다 크다면
				kopo44_iMin = kopo44_iArray[kopo44_k];//최솟값을 변경
				kopo44_iMinPt = kopo44_k;//iMinPt = k 선언
			}
		}
		System.out.printf("Max : iArray[%d] = %d\n", kopo44_iMaxPt, kopo44_iMax);//출력양식
		System.out.printf("Min : iArray[%d] = %d\n", kopo44_iMinPt, kopo44_iMin);//출력양식
		
		}
	
}


