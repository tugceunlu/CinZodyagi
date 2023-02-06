import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year;
        System.out.print("Doğduğunuz yılı giriniz: ");
        year = input.nextInt();
        int a = year %12;

        switch (a){

            case 0:
                System.out.print("Maymun");
                break;

            case 1:
                System.out.print("Horoz");
                break;
            case 2:
                System.out.print("Köpek");
                break;
            case 3:
                System.out.print("Domuz");

                break;

            case 4:
                System.out.print("Fare");

                break;

            case 5:
                System.out.print("Öküz");

                break;

            case 6:
                System.out.print("Kaplan");

                break;

            case 7:
                System.out.print("Tavşan");

                break;

            case 8:
                System.out.print("Ejderha");

                break;

            case 9:
                System.out.print("Yılan");

                break;

            case 10:
                System.out.print("At");

                break;

            case 11:
                System.out.print("Koyun");

                break;
        }
    }
}
