import java.util.ArrayList;

public class kopo44_10 {


	public static void main(String[] args) {//메인으로부터 프로그램시작
		// TODO Auto-generated method stub
		ArrayList kopo44_iAL = new ArrayList();//ArrayList 클래스를 받아서 객체를 만들고 인스턴스를 생성하여서 객체에 연결.

		kopo44_iAL.add("abc");//ArrayList에 값 abc를 저장.
		kopo44_iAL.add("abcd");//ArrayList에 값 abcd를 저장.
		kopo44_iAL.add("efga");//ArrayList에 값 efga를 저장.
		kopo44_iAL.add("가나다0");//ArrayList에 값 가나다0를 저장.
		kopo44_iAL.add("1234");//ArrayList에 값 1234를 저장.
		kopo44_iAL.add("12rk34");//ArrayList에 값 12rk34를 저장.

		System.out.printf("***************************************\n");//*선과 줄바꿈을 화면에 출력.
		System.out.printf(" 시작 ArraySize %d \n", kopo44_iAL.size());//변수 iAL의 크기를 화면에 출력.
		for(int kopo44_i = 0; kopo44_i < kopo44_iAL.size(); kopo44_i++) {//for반복문은 i는 0부터 i가 iAl의 크기보다 작을때까지 i를 1씩 증가시키면서 수행.
			System.out.printf(" ArraySize %d = %s\n", kopo44_i,kopo44_iAL.get(kopo44_i));//변수 i와 iAL의 i인덱스 값을 화면에 출력.
		}

		kopo44_iAL.set(3,  "가라라라");
		System.out.printf("***************************************\n");//*선과 줄바꿈을 화면에 출력.
		System.out.printf(" 내용변경 ArraySize %d \n", kopo44_iAL.size());
		for(int kopo44_i = 0; kopo44_i < kopo44_iAL.size(); kopo44_i++) {//for반복문은 i는 0부터 i가 iAl의 크기보다 작을때까지 i를 1씩 증가시키면서 수행.
			System.out.printf(" ArraySize %d = %s\n", kopo44_i,kopo44_iAL.get(kopo44_i));//변수 i와 iAL의 i인덱스 값을 화면에 출력.
		}

		kopo44_iAL.remove(4);
		System.out.printf("***************************************\n");//*선과 줄바꿈을 화면에 출력.
		System.out.printf(" 내용삭제 ArraySize %d \n", kopo44_iAL.size());
		for(int kopo44_i = 0; kopo44_i < kopo44_iAL.size(); kopo44_i++) {//for반복문은 i는 0부터 i가 iAl의 크기보다 작을때까지 i를 1씩 증가시키면서 수행.
			System.out.printf(" ArraySize %d = %s\n", kopo44_i,kopo44_iAL.get(kopo44_i));//변수 i와 iAL의 i인덱스 값을 화면에 출력.
		}

		kopo44_iAL.sort(null);;
		System.out.printf("***************************************\n");//*선과 줄바꿈을 화면에 출력.
		System.out.printf(" 리스트sort ArraySize %d \n", kopo44_iAL.size());
		for(int kopo44_i = 0; kopo44_i < kopo44_iAL.size(); kopo44_i++) {//for반복문은 i는 0부터 i가 iAl의 크기보다 작을때까지 i를 1씩 증가시키면서 수행.
			System.out.printf(" ArraySize %d = %s\n", kopo44_i,kopo44_iAL.get(kopo44_i));//변수 i와 iAL의 i인덱스 값을 화면에 출력.
		}

		kopo44_iAL.clear();;
		System.out.printf("***************************************\n");//*선과 줄바꿈을 화면에 출력.
		System.out.printf(" 전부 삭제 ArraySize %d \n", kopo44_iAL.size());
		for(int kopo44_i = 0; kopo44_i < kopo44_iAL.size(); kopo44_i++) {//for반복문은 i는 0부터 i가 iAl의 크기보다 작을때까지 i를 1씩 증가시키면서 수행.
			System.out.printf(" ArraySize %d = %s\n", kopo44_i,kopo44_iAL.get(kopo44_i));//변수 i와 iAL의 i인덱스 값을 화면에 출력.
		}

	}

}
