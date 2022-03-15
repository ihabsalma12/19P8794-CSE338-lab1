import java.util.Scanner;

public class Physicist {

    public String sumVector() {
        int sum [] = {0, 0, 0};
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        for(int i = 0; i < x; i++){
            for(int j = 0; j < 3; j++){
                sum[j] = sum[j] + input.nextInt();
            }
        }
        boolean flag = false;
        for(int i = 0; i < 3; i++){
            if(sum[i] != 0) flag = true;
        }
        if(flag) return "NO";
        else return "YES";
    }


}
