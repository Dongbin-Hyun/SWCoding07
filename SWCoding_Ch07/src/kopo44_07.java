import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class kopo44_07 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileWriter kopo44_fw = new FileWriter("D:\\kopo44_07.txt", true);
		BufferedWriter kopo44_bw = new BufferedWriter(kopo44_fw);
		StringBuffer kopo44_sf = new StringBuffer();
		
		BufferedReader kopo44_br = new BufferedReader(new InputStreamReader(System.in));
		String kopo44_str = "";
		while (!(kopo44_str=kopo44_br.readLine()).startsWith("s"))
			kopo44_sf.append(kopo44_str + "\n");
		
		kopo44_br.close();
		kopo44_fw.write(kopo44_sf.toString());
		kopo44_fw.flush();
		kopo44_fw.close();
		System.out.println("저장이 완료되었습니다.");
	}	

}
