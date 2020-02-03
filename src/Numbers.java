import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj liczbę: ");
        int number = scanner.nextInt();

        while (number <= 100 || number >= 200 || number %3 != 0){

            if (number <= 100) {
                System.out.println("Liczba jest za mała");
            }
            else if (number >=200){
                System.out.println("Liczba jest za duża");
            }
            else if (number %3 != 0){
                System.out.println("Liczba nie jest podzielna przez 3");
            }
            System.out.println("Podaj inną liczbę: ");
            number = scanner.nextInt();
        }
        System.out.println("Brawo! \uD83D\uDC4F");

        }

    }
