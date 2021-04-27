
public class kopo44_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] iArray = {1, 7, 5, 3, 2, 1, 3, 4, 9, 12, 1, 212, 33, 11, 21, 11,2121,121, 11, 5, 6, 33};
		
//		for (int i = 0; i < iArray.length; i++) {
//			System.out.printf("iArray[%d] = %d\n", i, iArray[i]);
			
		int iMax = iArray[0];
		int iMaxPt = 0;
		for (int j = 0; j < iArray.length; j++) {
			if (iMax < iArray[j]) {
				iMax = iArray[j];
				iMaxPt = j;
			}
		}
		
		int iMin = iArray[0];
		int iMinPt = 0;
		for (int k = 0; k < iArray.length; k++) {
			if (iMin > iArray[k]) {
				iMin = iArray[k];
				iMinPt = k;
			}
		}
		System.out.printf("Max : iArray[%d] = %d\n", iMaxPt, iMax);
		System.out.printf("Min : iArray[%d] = %d\n", iMinPt, iMin);
		
		}
	
}


