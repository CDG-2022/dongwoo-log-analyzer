import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class main {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("input.log");
            BufferedReader br = new BufferedReader(fr);

        } catch (FileNotFoundException e){
            System.out.println("파일을 찾지 못했습니다");
        }

    }
}
