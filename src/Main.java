import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String key;
        String code;
        String id;
        String time;
        String browser;
        try {
            FileReader fr = new FileReader("C://input.log");
            BufferedReader br = new BufferedReader(fr);
            String str;

            while((str = br.readLine()) != null) {
                String [] log = str.split("]");
                Print print = new Print(log[0], log[1], log[2], log[3]);
                print.Setting();
                print.PrintResult();
            }

        } catch (FileNotFoundException e){
            System.out.println("파일을 찾지 못했습니다");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
