import java.util.Scanner;

public class Main 
{
  public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
    System.out.println("Podaj znak z jakiego zrobić kwadrat");
    char znak = scanner.next().charAt(0);

    System.out.print("Podaj rozmiar kwadratu: ");
    int rozmiar = scanner.nextInt();

    for(int i = 0; i < rozmiar; i++)
      {
        for(int j = 0; j < rozmiar; j++)
          {
            System.out.print(znak+" ");
          }
        System.out.println();
      }
  }
}
 