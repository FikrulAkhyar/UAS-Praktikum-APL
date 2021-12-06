
/*** Class Main.
* @author Fikrul Akhyar
* @version 1.5
*/

import java.util.Scanner;

public class Main {
    private static Scanner scanner;

    public static void main(String[] args) {
        // Penggunaan Strategy pattern
        System.out.println("Pilih film action favorit : \n1. Avenger\n2. SpiderMan\n3. IronMan");
        scanner = new Scanner(System.in);
        int pilih = scanner.nextInt();

        StrategyPattern film = new StrategyPattern();

        if (pilih == 1) {
            film.setFilmAction(new FilmAvenger());
        } else if (pilih == 2) {
            film.setFilmAction(new FilmSpiderman());
        } else if (pilih == 3) {
            film.setFilmAction(new FilmIronman());
        }

        System.out.println("Film action favorit anda adalah " + film.getFilmAction() + "\n");

        // Penggunaan Adapter Pattern
        FilmRomance yourName = new FilmYourName();

        System.out.print("Genre " + film.getFilmAction() + " adalah ");
        film.action();

        FilmAction romanceAdapter = new AdapterPattern(yourName);
        System.out.print("Genre " + film.getFilmAction() + " sekarang adalah ");
        romanceAdapter.action();
    }
}
