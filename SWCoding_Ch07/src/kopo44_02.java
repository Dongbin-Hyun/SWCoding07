import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class kopo44_02 {

	String blank = "";

	public String HanBlankForeword(String s, int number) {
		for (int i = 0; i < number; i ++) {
			blank += " ";	
		}
		return blank.concat(s);
	}

	public String HanBlankBackword(String s, int number) {
		for (int i = 0; i < number; i ++) {
			blank += " ";	
		}
		return s.concat(blank);
	}

	public static int HanCount(String str){//https://selfdevelope.tistory.com/383

		StringBuffer sb=new StringBuffer();

		if(str!=null && str.length()!=0){

			Pattern p = Pattern.compile("[°¡-ÆR]");

			Matcher m = p.matcher(str);

			while(m.find()){

				sb.append(m.group());

			}

		}
		
		return sb.length();

	}




}
