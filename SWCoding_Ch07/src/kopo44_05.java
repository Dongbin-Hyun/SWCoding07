
public class kopo44_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] kopo44_OneRec = {
				"지원대상,지원대상 기준 ,지원그룹,지원금액(원),우선순위",
				"기초생활(생계),국민기초생활보장법에 정한 수급자(생계),생계급여,10000,1",
				"기초생활(의료),국민기초생활보장법에 정한 수급자(의료),의료급여,10000,1",
				"기초생활(교육),국민기초생활보장법에 정한 수급자(교육),교육급여,5000,1",
				"기초생활(주거),국민기초생활보장법에 정한 수급자(주거),주거급여,5000,1",
				"차상위(계층확인),차상위계층확인(구 차상위 우선돌봄) ,우선돌봄,5000,2",
				"차상위(자활사업참여),자활사업참여자,차상위자활사업참여자,5000,2",
				"차상위(장애수당),차상위장애수당자 ,차상위장애인,5000,2",
				"차상위(한부모가족),한부모가족지원가정 ,한부모가족,5000,2",
				"차상위(본인부담경감대상),본인부담경감대상자 ,차상위본인부담경감대상자,5000,2",
				"장애인(중증),장애인복지법에 의한 장애의 정도가 심한 장애인 ,장애인,5000,3",
				"국가유공자(1~3급),국가유공자 등 예우 및 지원에 관한 볍률에 의한 1~3급 상이자,일반,5000,3",
				"5.18유공자(1~3급),5.18 민주유공자 예우에 관한 법률에 의한 1~3급 상이자 ,일반,5000,3",
				"독립유공자(유족포함),독립유공자 예우에 관한 법률에 의한 독립유공자 또는 독립유공자의 권리를 이전받은 유족 1인 ,일반,5000,3",
				"3자녀가구이상,세대주와의 관계가 자(子)3명 또는 손(孫)3명 이상인 가구(주민등록등본기준 위탁아동 포함) ,일반,4000,4"

		};
		int kopo44_numberV;
		String[] kopo44_field_name = kopo44_OneRec[0].split(",");
		for (int kopo44_i = 1; kopo44_i < kopo44_OneRec.length - 1; kopo44_i++) {

			String[] kopo44_field = kopo44_OneRec[kopo44_i].split(",");
			kopo44_numberV = Integer.parseInt(kopo44_field[4]);

			String kopo44_strNum = String.valueOf(kopo44_numberV);
			String kopo44_korReadNum = "";



			String [] kopo44_numHead = {"영", "일", "이", "삼", "사", "오", "육", "칠", "팔", "구"};
			String [] kopo44_numTail = {"", "십", "백", "천", "만", "십", "백", "천", "억", "십"};

			int kopo44_numA = 0;
			int kopo44_numB = kopo44_strNum.length() -1;

			while (true) {//while 반복문의 조건을 i >=0으로 설정하여 i가 0과 같거나 크다면 반복문이 수행되도록 한다.
				if(kopo44_numA >= kopo44_strNum.length()) break;// 만약 i가 sNumVal의 길이와 같거나 크다면 break문을 수행한다.

				if(kopo44_strNum.substring(kopo44_numA, kopo44_numA + 1).equals("0")) {//만약 sNumVal의 i부터, i에 1을 더한 값까지 문자열을 자른 값이 0과 같다면
					if(kopo44_numTail[kopo44_numB].equals("만") || kopo44_numTail[kopo44_numB].equals("억")) {//만약 unitX의 [j]인덱스 값이 만이거나 unitX의 [j]인덱스 값이 억이면
						kopo44_korReadNum = kopo44_korReadNum + kopo44_numTail[kopo44_numB];//sNumVoice값에 unitX[j]인덱스 값을 저장한다. (sNumVoice += unitX[j]로 바꿔서 작성할 수 있다)
					} else {//만약 if조건을 만족하지 않는다면
						//아무것도 하지않는다.
					}
				} else if (kopo44_strNum.substring(kopo44_numA, kopo44_numA + 1).equals("1") && kopo44_numB > 5) {//추가한 부분으로 //만약 sNumVal의 i부터, i에 1을 더한 값까지 문자열을 자른 값이 1과 같거나
					kopo44_korReadNum = kopo44_korReadNum + kopo44_numTail[kopo44_numB];// j가 5보다 크다면 sNumVoice값에 unitX[j]인덱스 값을 저장한다. 
					//(sNumVoice += unitX[j]로 바꿔서 작성할 수 있다)

				} else {//만약 sNumVal의 i부터, i에 1을 더한 값까지 문자열을 자른 값이 0과 같지 않다면
					kopo44_korReadNum = kopo44_korReadNum//sNumVoice의 값에 
							+ kopo44_numHead[Integer.parseInt(kopo44_strNum.substring(kopo44_numA, kopo44_numA + 1))]
									//units의 숫자형으로 형변환한 (sNumVal의 i부터, i에 1을 더한 값까지 문자열을 자른 값)의 인덱스]의 값을 더하고
									+ kopo44_numTail[kopo44_numB];//unitX[j]의 값을 더한다.
				}
				kopo44_numA++;//i의 값을 1 증가시킨다.
				kopo44_numB--;//j의 값을 1 감소시킨다.
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
