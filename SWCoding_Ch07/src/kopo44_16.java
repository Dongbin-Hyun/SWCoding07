

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class kopo44_16 {
	
	static ArrayList <kopo44_15> kopo44_ArrayOneRec = new ArrayList <kopo44_15>();//클래스의 ArrayLlist ArrayOneRec을 생성.
	
	static int kopo44_sumkor = 0;//전역변수 sumkor을 정의하고 값을 0으로 초기화.
	static int kopo44_sumeng = 0;//전역변수 sumeng을 정의하고 값을 0으로 초기화.
	static int kopo44_summat = 0;//전역변수 summat을 정의하고 값을 0으로 초기화.
	static int kopo44_sumsum = 0;//전역변수 sumsum을 정의하고 값을 0으로 초기화.
	static int kopo44_sumavg = 0;//전역변수 sumavg을 정의하고 값을 0으로 초기화.
	static int kopo44_pcnt = 0;//전역변수 pcnt를 정의하고 값을 0으로 초기화
	static int kopo44_cnt = 0;//전역변수 cnt을 정의하고 값을 0으로 초기화.
	static int kopo44_pagesumkor = 0;// 전역변수 pagekorsum을 정의하고 값을 0으로 초기화.
	static int kopo44_pagesumeng = 0;// 전역변수 pageengsum을 정의하고 값을 0으로 초기화.
	static int kopo44_pagesummat = 0;// 전역변수 pagematsum을 정의하고 값을 0으로 초기화.
	static int kopo44_pagesumsum = 0;// 전역변수 pagetotalsum을 정의하고 값을 0으로 초기화.
	static int kopo44_pagesumavg = 0;// 전역변수 pageavg을 정의하고 값을 0으로 초기화.
	static final int kopo44_iPerson = 200;//전역변수 iPerson을 정의하고 값을 200으로 초기화.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		kopo44_dataSet();//dataSet함수를 실행하여 data를 받아옴.
		kopo44_dataSort();//dataSort함수를 실행하여 data들을 정렬.
		kopo44_pcnt = 1;
		for(int i = 0; i < kopo44_ArrayOneRec.size(); i++) {//for반복문은 i는 0부터 ArrayOneRec의 크기까지 i를 1씩 증가시키면서 수행.
			
			if(kopo44_cnt % 30 == 0) {//만약 cnt가 30으로 나누었을때 나머지가 0이라면
				
				kopo44_HeaderPrint();//HeaderPrint함수를 실행하여 Header를 화면에 출력
				kopo44_pcnt ++; 
			}
			
			kopo44_ItemPrint(i);//ItemPrint함수를 파라미터로 i로 주고 실행.
			
			kopo44_cnt++;//전역변수 cnt를 1씩 증가.
			
			
			if(kopo44_cnt % 30 == 0) {//만약 cnt가 30으로 나누었을때 나머지가 0이라면
				
				kopo44_TailPrint();//TailPrint함수를 실행하여 Tail을 화면에 출력.
				kopo44_resetPagesum();//resetPagesum함수를 실행하여 pagesum변수들을 0으로 리셋.
			}
			
		}
		kopo44_TailPrint();//TailPrint함수를 실행하여 Tail을 화면에 출력.


	}

	private static void kopo44_dataSort() {//dataSort함수를 생성.
		Comparator<kopo44_15> kopo44_st = new Comparator<kopo44_15>() {//Comparator 클래스를 받아서 객체를 만들고 인스턴스를 생성하여서 객체에 연결.
			public int compare1(kopo44_15 kopo44_a1, kopo44_15 kopo44_a2) {//함수 compare을 만들고 파라미터로 a1과 a2를 받음.
				return (kopo44_a2.kopo44_sum() - kopo44_a1.kopo44_sum());//리턴값으로 a2의 sum함수에서 a1의 sum함수를 뺀 값을 받음.
			}

			@Override
			public int compare(kopo44_15 kopo44_o1, kopo44_15 kopo44_o2) {//compare 메소드를 오버로딩하고 파라미터로 o1과 o2를 받음.
				// TODO Auto-generated method stub
				return (kopo44_o2.kopo44_sum() - kopo44_o1.kopo44_sum());//리턴값으로 o2의 sum함수에서 o1의 sum함수를 뺀 값을 받음.
			}

		};
		Collections.sort(kopo44_ArrayOneRec, kopo44_st);//Collections.sort로 ArrayOneRec 배열을 정렬.
		
	}

	private static void kopo44_TailPrint() {
		// TODO Auto-generated method stub
		
		System.out.printf("=========================================\n");//*선과 줄바꿈을 화면에 출력함.
		System.out.printf("현재페이지\n");//현재페이지와 줄바꿈을 화면에 출력함
		System.out.printf("국어합계 %7d  국어평균: %6.2f\n", kopo44_pagesumkor, kopo44_pagesumkor / 30.);//변수 pagesumkor과 cnt로 나눈 sumpagekor를 화면에 출력함.
		System.out.printf("영어합계 %7d  영어평균: %6.2f\n", kopo44_pagesumeng, kopo44_pagesumeng / 30.);//변수 pagesumeng과 cnt로 나눈 sumpageeng를 화면에 출력함.
		System.out.printf("수학합계 %7d  수학평균: %6.2f\n", kopo44_pagesummat, kopo44_pagesummat / 30.);//변수 pagesummat과 cnt로 나눈 sumpagemat를 화면에 출력함.
		System.out.printf("반평균합계 %5d    반평균: %6.2f\n", kopo44_pagesumavg, kopo44_pagesumavg / 30.);//변수 pagesumavg과 cnt로 나눈 sumpageavg를 화면에 출력함.
		System.out.printf("=========================================\n");//*선과 줄바꿈을 화면에 출력함.
		System.out.printf("누적페이지\n");//누적페이지와 줄바꿈을 화면에 출력함
		System.out.printf("국어합계 %7d  국어평균: %6.2f\n", kopo44_sumkor, kopo44_sumkor / (double)kopo44_cnt);//변수 sumkor과 cnt로 나눈 sumkor를 화면에 출력함.
		System.out.printf("영어합계 %7d  영어평균: %6.2f\n", kopo44_sumeng, kopo44_sumeng / (double)kopo44_cnt);//변수 sumeng과 cnt로 나눈 sumeng를 화면에 출력함.
		System.out.printf("수학합계 %7d  수학평균: %6.2f\n", kopo44_summat, kopo44_summat / (double)kopo44_cnt);//변수 summat과 cnt로 나눈 summat를 화면에 출력함.
		System.out.printf("반평균합계 %5d    반평균: %6.2f\n", kopo44_sumavg, kopo44_sumavg / (double)kopo44_cnt);//변수 sumavg과 cnt로 나눈 sumavg를 화면에 출력함.
		System.out.println();//줄바꿈을 화면에 출력함.

		
	}

	private static void kopo44_ItemPrint(int i) {//ItemPring함수를 생성하고 파라미터로 숫자형 변수 i를 주었다..
		// TODO Auto-generated method stub
		kopo44_15 kopo44_rec;//P9OneRec 클래스를 받아서 객체를 만든다.
		
		kopo44_rec = kopo44_ArrayOneRec.get(i);//인스턴스를 생성하여서 객체에 연결.
		System.out.printf("%3d  %-5s %3d  %3d  %3d  %3d  %6.2f\n", kopo44_rec.kopo44_student_id(), kopo44_rec.kopo44_name(), kopo44_rec.kopo44_kor(), 
				kopo44_rec.kopo44_eng(), kopo44_rec.kopo44_mat(), kopo44_rec.kopo44_sum(), kopo44_rec.kopo44_avg());
		//변수들을 화면에 출력함.
		kopo44_sumkor += kopo44_rec.kopo44_kor();// 변수 sumkor에 rec.kor()을 가산.
		kopo44_sumeng += kopo44_rec.kopo44_eng();// 변수 sumeng에 rec.eng()를 가산.
		kopo44_summat += kopo44_rec.kopo44_mat();// 변수 summat에 rec.mat()을 가산.
		kopo44_sumsum += kopo44_rec.kopo44_sum();// 변수 sumsum에 rec.sum()을 가산.
		kopo44_sumavg += kopo44_rec.kopo44_avg();// 변수 sumavg에 rec.avg()를 가산.
		kopo44_pagesumkor += kopo44_rec.kopo44_kor();// 변수 pagesumkor에 rec.kor()을 가산.
		kopo44_pagesumeng += kopo44_rec.kopo44_eng();// 변수 pagesumeng에 rec.eng()를 가산.
		kopo44_pagesummat += kopo44_rec.kopo44_mat();// 변수 pagesummat에 rec.mat()을 가산.
		kopo44_pagesumsum += kopo44_rec.kopo44_sum();// 변수 pagesumsum에 rec.sum()을 가산.
		kopo44_pagesumavg += kopo44_rec.kopo44_avg();// 변수 pagesumavg에 rec.avg()를 가산.
		
	}
	
	private static void kopo44_resetPagesum() {//resetPagesum함수를 생성.
		// TODO Auto-generated method stub
		kopo44_pagesumkor = 0;// 변수 pagesumkor를 0으로 초기화.
		kopo44_pagesumeng = 0;// 변수 pagesumeng를 0으로 초기화.
		kopo44_pagesummat = 0;// 변수 pagesummat를 0으로 초기화.
		kopo44_pagesumsum = 0;// 변수 pagesumsum를 0으로 초기화.
		kopo44_pagesumavg = 0;// 변수 pagesumavg를 0으로 초기화.
		
	}

	private static void kopo44_HeaderPrint() {//HeaderPring함수를 생성.
		
		
		Date kopo44_d = new Date();//시스템의 날짜 및 시간을 읽을 수 있도록 java.util 패키지의 Date 클래스를 생성.
		SimpleDateFormat kopo44_sf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");//받아온 날짜의 형식을 변환하기위해 SimpleDateFormat 클래스를 생성하고
		 //Format형식을 ("yyyy/MM/dd HH:mm:ss")로 지정.
		System.out.printf("%16s\n","성적집계표");//성적집계표와 줄바꿈을 화면에 출력함
		System.out.printf("PAGE : %d  출력일자 : %s\n", kopo44_pcnt, kopo44_sf.format(kopo44_d));//날짜를 받아온 변수 d에 아까 지정한 SimpleDateFormat으로 yyyy.MM.dd HH:mm:ss 형태로 출력함.
		System.out.printf("=========================================\n");//*선과 줄바꿈을 화면에 출력함.
		System.out.printf("%2s%4s %3s %2s %2s %2s   %2s\n", "번호", "이름", "국어", "영어", "수학", "합계", "평균");//Header를 화면에 출력함.
		System.out.printf("=========================================\n");//*선과 줄바꿈을 화면에 출력함.
		
	}

	private static void kopo44_dataSet() {//dataSetPrint함수를 생성.
		// TODO Auto-generated method stub
		for (int kopo44_i = 0; kopo44_i < kopo44_iPerson; kopo44_i++) {//for반복문으로 i가 0부터 iPerson보다 작을때까지 1씩 증가시키면서 수행.
			String kopo44_name = String.format("홍길%02d", kopo44_i + 1);//변수 name에 i + 1를 string으로 형변환한 현재 홍길%02d를 값으로 저장. 
			int kopo44_kor = (int)(Math.random() * 100);//변수 kor에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장.
			int kopo44_eng = (int)(Math.random() * 100);//변수 eng에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장.
			int kopo44_mat = (int)(Math.random() * 100);//변수 mat에 숫자형으로 형변환한 (Math.random() * 100)를 값으로 저장.
			kopo44_ArrayOneRec.add(new kopo44_15(kopo44_i + 1, kopo44_name, kopo44_kor, kopo44_eng, kopo44_mat));//ArrayList에 P9OneRec 함수를 통해서 만들어진 값을 저장.
		}
	}
}

