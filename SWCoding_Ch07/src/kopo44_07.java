import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class kopo44_07 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		FileWriter fw = new FileWriter("C:\\Users\\User\\Desktop\\kopo44_07.txt", true);
		BufferedWriter bw = new BufferedWriter(fw);
		StringBuffer sf = new StringBuffer();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = "";
		while (!(str=br.readLine()).startsWith("s"))
			sf.append(str + "\n");
		
		br.close();
		fw.write(sf.toString());
		fw.flush();
		fw.close();
		System.out.println("저장이 완료되었습니다.");
	}	

}
