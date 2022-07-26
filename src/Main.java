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
            Result result = new Result();
            while((str = br.readLine()) != null) {
                String [] log = str.split("]");
                result.setFirst(log[0]);
                result.setSecond(log[1]);
                result.setThird(log[2]);
                result.setFourth(log[3]);
                result.Setting();
                result.ResultStateCode();
                result.ResultPercentageBrowser();
                result.ResultApiServiceId();
            }
            result.PrintResult();

        } catch (FileNotFoundException e){
            System.out.println("파일을 찾지 못했습니다");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
