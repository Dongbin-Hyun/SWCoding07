import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class kopo44_02 {//Å¬·¡½º

	String kopo44_blank = "";//black¸¦ ¼±¾ð

	public String kopo44_HanBlankForeword(String kop44_s, int kopo44_number) {//HanBlackForeword ¸Þ¼Òµå 
		for (int kopo44_i = 0; kopo44_i < kopo44_number; kopo44_i ++) {//i´Â 0ºÎÅÍ number ¹Ì¸¸±îÁö ¹Ýº¹ for¹®
			kopo44_blank += " ";	//black¿¡ " "Ãß°¡
		}
		return kopo44_blank.concat(kop44_s);//concatÀº ½ºÆ®¸µ ¼±¾ðÇÑ °ÍÀ» ÀÌ¾î ºÙ¿©ÁÖ´Â ¸í·É¾î
	}

	public String kopo44_HanBlankBackword(String kopo44_s, int kopo44_number) {//HanBlankBackword ¸Þ¼Òµå
		for (int i = 0; i < kopo44_number; i ++) {//i´Â 0ºÎÅÍ number ¹Ì¸¸±îÁö ¹Ýº¹ for¹®
			kopo44_blank += " ";	//black¿¡ " "Ãß°¡
		}
		return kopo44_s.concat(kopo44_blank);//concatÀº ½ºÆ®¸µ ¼±¾ðÇÑ °ÍÀ» ÀÌ¾î ºÙ¿©ÁÖ´Â ¸í·É¾î
	}

	public static int kopo44_HanCount(String kopo44_str){//https://selfdevelope.tistory.com/383
		//HanCount ¸Þ¼Òµå

		StringBuffer kopo44_sb=new StringBuffer();//½ºÆ®¸µ¹öÆÛ ¼±¾ð

		if(kopo44_str!=null && kopo44_str.length()!=0){//strÀÌ ºó°ªÀÌ ¾Æ´Ï°í ±æÀÌ°¡ 0ÀÌ ¾Æ´Ï¶ó¸é

			Pattern kopo44_p = Pattern.compile("[°¡-ÆR]");//ÇÑ±ÛÀ» Ã£°Ô ÇØÁÖ´Â ·ÎÁ÷ 

			Matcher kopo44_m = kopo44_p.matcher(kopo44_str);//¸ÅÄªÀ» ÇØÁÜ

			while(kopo44_m.find()){

				kopo44_sb.append(kopo44_m.group());//ÀÌ¾î¼­ ºÙ¿©ÁÜ

			}

		}
		
		return kopo44_sb.length();//±ÛÀÚ¼ö¸¦ Ä«¿îÆ® ÇÏ±â¿¡ ±×°ÍÀ» Ä«¿îÆ®ÇÑ ±æÀÌ°¡ ÇÑ±Û ±æÀÌ

	}




}
