import java.text.DecimalFormat;//DecimalForamt import

public class kopo44_03 {//클래스

	public static void main(String[] args) {//메인 메소드
		// TODO Auto-generated method stub
		DecimalFormat kopo44_df = new DecimalFormat("###,###,###,###");//콘솔창에 표시될 금액의 표시형식
		String[] kopo44_OneRec = {//영수증에서 출력한 값
				 " 참-0d974rion-초a0 5,000,000 2 10,000,000",
				 " a갈아4만든배로만     14,020 4     56,080",
				 " 질레트-퓨전프로글    25,000 1     25,000",
				 " 해태-허니버터칩          10 2         20",
				 "*대구에서온맛난사      1,206 5      6,030",
				 "*천혜향제주감귤        1,350 4      5,400",
				 "*강원도고랭지햇감      7,01910     70,190",
				 "*고시히카리쌀20Kg     35,000 1     35,000",
				 " 비말마스1크블랙특     9,90010     99,000",
				 " 아디다스-슈퍼스타    89,000 1     89,000",
				 " 아디다스-야구글러   123,500 1    123,500",
				 "*직d접담근배추김치 9,999,999 2 19,999,998",
				 "*제주원산지은갈치     12,000 4     48,000",
				 " 돌체구스토-커피머   143,200 1    143,200",
				 " 깨끗한나라-물티슈     8,900 4     35,600",
				 "*맛있는꿀맛애호박      1,080 5      5,400",
				 " 공화춘-컵라면           790 3      2,370",
				 " 농심신라면블랙          670 3      2,010",
				 " 이마트/연어초밥       9,900 1      9,900",
				 " 피코크-들깨미역국   412,900 2    825,800",
				 " 녹차원흑당시럽1입     7,741 1      7,741",
				 " 상투과좌특별중기      1,230 2      2,460",
				 " 동원-양반볶음김치       300 3        900",
				 "*유기농국산바나나      1,900 5      9,500",
				 "*김                    7,800 1      7,800",
				 " 디지털복합체중계     23,000 1     23,000",
				 " 황도백도믹스통조          1 6          6",
				 " 오리온-포카칩오리     1,200 2      1,000",//틀린값으로 변경
				 " 프링글스-핫스파이        12 1         12",
				 " 맥심-모카골드대용     6,400 1      6,400"
		};
		
		String[] kopo44_name = new String[kopo44_OneRec.length];//문자열 배열 name을 정의하고 OneRec의 길이만큼 배열을 생성.
		int[] kopo44_price = new int[kopo44_OneRec.length];//숫자형 배열 price을 정의하고 OneRec의 길이만큼 배열을 생성.
		int[] kopo44_amount = new int[kopo44_OneRec.length];//숫자형 배열 amount을 정의하고 OneRec의 길이만큼 배열을 생성.
		int[] kopo44_sum = new int[kopo44_OneRec.length];//숫자형 배열 sum을 정의하고 OneRec의 길이만큼 배열을 생성.
		int[] kopo44_comsum = new int [kopo44_OneRec.length];//숫자형 배열 comsum을 정의하고 OneRec의 길이만큼 배열을 생성.
		
		for(int kopo44_i = 0; kopo44_i < kopo44_OneRec.length; kopo44_i++) {//for반복문을 i는 0부터 i가 OneRec 길이보다 작을 때까지 i를 1씩 증가시키면서 수행.
			byte[] kopo44_bb = kopo44_OneRec[kopo44_i].getBytes();//getBytes를 이용하여 word를 바이트값으로 받아 바이트배열 wdcount에 저장.
			kopo44_name[kopo44_i] = new String(kopo44_bb, 0, 19);//name 배열의 인덱스 i번에 0부터 19만큼 길이의 내용을 잘라서 추가.
			kopo44_price[kopo44_i] = Integer.parseInt(new String(kopo44_bb, 19, 9).trim().replace(",", ""));
			//price 배열의 인덱스 i번에 19부터 9만큼길이의 내용을 자르고 양쪽의 공백을 trim으로 제거하고 ,는 replace로 없애준다음 추가. 
			kopo44_amount[kopo44_i] = Integer.parseInt(new String(kopo44_bb, 28, 3).trim());
			//amount 배열의 인덱스 i번에 28부터 3만큼길이의 내용을 자르고 양쪽의 공백을 trim으로 제거하고 ,는 replace로 없애준다음 추가. 
			kopo44_sum[kopo44_i] = Integer.parseInt(new String(kopo44_bb, 31, 10).trim().replace(",", ""));
			//sum 배열의 인덱스 i번에 31부터 10만큼길이의 내용을 자르고 양쪽의 공백을 trim으로 제거하고 ,는 replace로 없애준다음 추가. 
		}
		
		for(int kopo44_i = 0; kopo44_i < kopo44_OneRec.length; kopo44_i++) {//for반복문을 i는 0부터 i가 OneRec 길이보다 작을 때까지 i를 1씩 증가시키면서 수행.
			kopo44_comsum[kopo44_i] = kopo44_price[kopo44_i] * kopo44_amount[kopo44_i];//comsum의 인덱스 i번째에 price인덱스 i번째와 amount 인덱스 i번째의 곱을 저장.
			if(kopo44_comsum[kopo44_i] != kopo44_sum[kopo44_i]) {//만약 comsum의 인덱스 i번째와 sum의 인덱스 i번째가 같지 않다면
				System.out.printf("************************\n");//*선과 줄바꿈을 화면에 출력.
				System.out.printf("오류[%s]\n", kopo44_OneRec[kopo44_i]);//OneRec의 인덱스 i번째를 화면에 출력.
				System.out.printf("수정[%s%9s%3d%10s]\n", kopo44_name[kopo44_i], kopo44_df.format(kopo44_price[kopo44_i]), kopo44_amount[kopo44_i], kopo44_df.format(kopo44_comsum[kopo44_i]));
				//새로 계산을 하여서 제대로 된 계산값 comsum의 인덱스 i번째를 다른변수들과 함께 화면에 출력.
				System.out.printf("************************\n");//*선과 줄바꿈을 화면에 출력.
			}
		}
		
	}
	
}

