package s21212_00;

public class S21212_00v2 {
   
public static void main(String[] args) {
      
    int odd = 0;
     int even = 0;

     for (int cnt = 1; cnt < 11; cnt++) {

        if (cnt % 2 == 1) {
           odd = odd + cnt;
        }
        if (cnt % 2 == 0) {
           even = even + cnt;
        }
        System.out.println("cnt:" + cnt + " odd:" + odd + " even:" + even + " sum:" + (odd + even));
        }

    }

}
