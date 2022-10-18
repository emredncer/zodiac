import java.util.Scanner;
public class zodiac {
    public static void main(String[] args) {
        int year,zodiac;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum yılınızı giriniz: ");
        year = input.nextInt();
        zodiac = year % 12;
        switch (zodiac){
            case 0:
                System.out.print("Çin zodyağınız: Maymun");
                break ;
            case 1:
                System.out.print("Çin zodyağınız: Horoz");
                break ;
            case 2:
                System.out.print("Çin zodyağınız: Köpek");
                break ;
            case 3:
                System.out.print("Çin zodyağınız: Domuz");
                break ;
            case 4:
                System.out.print("Çin zodyağınız: Fare");
                break ;
            case 5:
                System.out.print("Çin zodyağınız: Öküz");
                break ;
            case 6:
                System.out.print("Çin zodyağınız: Kaplan");
                break ;
            case 7:
                System.out.print("Çin zodyağınız: Tavşan");
                break ;
            case 8:
                System.out.print("Çin zodyağınız: Ejderha");
                break ;
            case 9:
                System.out.print("Çin zodyağınız: Yılan");
                break ;
            case 10:
                System.out.print("Çin zodyağınız: At");
                break ;
            case 11:
                System.out.print("Çin zodyağınız: Koyun");
                break ;
            default:
                System.out.println("Not possible");
        }
    }
}
