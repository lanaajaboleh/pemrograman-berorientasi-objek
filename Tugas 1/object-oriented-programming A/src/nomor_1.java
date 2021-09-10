import java.util.Scanner;

public class nomor_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] horoskop = {"Monkey", "Rooster", "Dog", "Pig", "Rat", "Cow", "Tiger", "Rabbit",
                "Dragon", "Snake", "Horse", "Goat"};

        while (true){
            System.out.println("Program Horoskop Cina");
            System.out.println("Tahun Lahir:");
            int tahun = in.nextInt();
            if (tahun > 0) {
                System.out.println("Horoskop: " + horoskop[tahun % 12]);
                System.out.println("================================");
            } else if (tahun == -1) {
                System.out.println("================================");
                    System.out.println("Program sudah dihentikan");
                    break;
            } else {
                System.out.println("Input Anda salah!");
            }
        }
        in.close();
    }
}
