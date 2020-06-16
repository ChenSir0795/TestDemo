package IO;
//import java.io.*;
//public class Test {
//
//	public static void main(String[] args) throws Exception{
//		// TODO Auto-generated method stub
//		
//
//		FileInputStream in= new FileInputStream("F:\\C.java");
//		InputStreamReader isr = new InputStreamReader(in);
//		BufferedReader br=new BufferedReader(isr);
//		FileOutputStream out = new FileOutputStream("F:\\C1.java");
//		OutputStreamWriter OSW= new OutputStreamWriter(out);
//		BufferedWriter bw =new BufferedWriter(OSW);
//		String line;
//		while ((line=br.readLine())!= null){
//			bw.write(line);
//		}
//		br.close();
//		bw.close();
//	}
//}
import java.io.*;
public class Test{
    private String strFinal = "";
    public void open(String fileName) {
        try {
            BufferedReader in = new BufferedReader(new FileReader(fileName));
            String s = null;
            while ((s = in.readLine()) != null) {
                strFinal = strFinal + s + "\n";
            }
            in.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    public void save(String fileName){
        try{
            BufferedReader in = new BufferedReader(new StringReader(strFinal));
            PrintWriter out = new PrintWriter(new FileWriter(fileName));
            int lineCount = 1;
            String s = null;
            while((s = in.readLine())!=null){
                out.println(lineCount+++": "+s);
            }
            in.close();
            out.close();
        }catch(IOException e){
            System.out.print(e);
        }
    }
    public static void main(String args[])throws IOException{
        Test obj = new Test();
        obj.open("F:\\C.java");
        obj.save("F:\\C.java");
    }
}