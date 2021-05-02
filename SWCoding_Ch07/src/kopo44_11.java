import java.util.ArrayList;

public class kopo44_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kopo44_iTestMax = 100000;
		ArrayList<Integer> kopo44_iAL = new ArrayList<Integer>();
		
		for (int kopo44_i = 0; kopo44_i < kopo44_iTestMax; kopo44_i++) {
			kopo44_iAL.add((int)(Math.random()*10000000));
		}
		
		for (int kopo44_i = 0; kopo44_i < kopo44_iAL.size(); kopo44_i++) {
			System.out.printf(" ArrayList %d = %d\n", kopo44_i, kopo44_iAL.get(kopo44_i));
		}
		
		System.out.printf("******************************************");
		kopo44_iAL.sort(null);
		for (int kopo44_i = 0; kopo44_i < kopo44_iAL.size(); kopo44_i++) {
			System.out.printf(" ArrayList %d = %d\n", kopo44_i, kopo44_iAL.get(kopo44_i));
		}
	}

}
