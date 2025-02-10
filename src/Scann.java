import java.util.Scanner;

public class Scann {
    Scanner scanner = new Scanner(System.in);

    public Koordinat scan(){
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        return new Koordinat(x,y);
    }

}
