import java.util.Scanner;

public class nomor_2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("Enter number of inputs: ");
        int input = in.nextInt();
        for(int i=0; i<input; i++){
            System.out.print("Enter input integer: ");
            int angka = in.nextInt();
            if(angka > 99)System.out.print("Error - input exceeds 99");
            else{
                int mod = angka % 10;
                if (mod == 1) System.out.print("one ");
                else if (mod == 2) System.out.print("two ");
                else if (mod == 3) System.out.print("three ");
                else if (mod == 4) System.out.print("four ");
                else if (mod == 5) System.out.print("five ");
                else if (mod == 6) System.out.print("six ");
                else if (mod == 7) System.out.print("seven ");
                else if (mod == 8) System.out.print("eight ");
                else if (mod == 9) System.out.print("nine ");
                if(angka > 9){
                    int fnum =  angka / 10;
                    if (fnum == 1) System.out.print("one ");
                    else if (fnum == 2) System.out.print("two ");
                    else if (fnum == 3) System.out.print("three ");
                    else if (fnum == 4) System.out.print("four ");
                    else if (fnum == 5) System.out.print("five ");
                    else if (fnum == 6) System.out.print("six ");
                    else if (fnum == 7) System.out.print("seven ");
                    else if (fnum == 8) System.out.print("eight ");
                    else if (fnum == 9) System.out.print("nine ");
                }
            }
            System.out.println("");
        }
        in.close();
    }
}
