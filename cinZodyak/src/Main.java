import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kalan, yil;
        Scanner input = new Scanner(System.in);
        System.out.println("Dogum tarihiniz: ");
        yil = input.nextInt();

        kalan = yil % 12;

        switch (kalan) {
            case 0:
                System.out.println("CIN ZODYAGI BURCUNUZ: MAYMUN");
                break;
            case 1:
                System.out.println("CIN ZODYAGI BURCUNUZ: HOROZ");
                break;
            case 2:
                System.out.println("CIN ZODYAGI BURCUNUZ: KOPEK");
                break;
            case 3:
                System.out.println("CIN ZODYAGI BURCUNUZ: DOMUZ");
                break;
            case 4:
                System.out.println("CIN ZODYAGI BURCUNUZ: FARE");
                break;
            case 5:
                System.out.println("CIN ZODYAGI BURCUNUZ: OKUZ");
                break;
            case 6:
                System.out.println("CIN ZODYAGI BURCUNUZ: KAPLAN");
                break;
            case 7:
                System.out.println("CIN ZODYAGI BURCUNUZ: TAVSAN");
                break;
            case 8:
                System.out.println("CIN ZODYAGI BURCUNUZ: EJDERHA");
                break;
            case 9:
                System.out.println("CIN ZODYAGI BURCUNUZ: YILAN");
                break;
            case 10:
                System.out.println("CIN ZODYAGI BURCUNUZ: AT");
                break;
            case 11:
                System.out.println("CIN ZODYAGI BURCUNUZ: KOYUN");
                break;
        }

    }
}