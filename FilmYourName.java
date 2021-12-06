/***
 * Class FilmYourName
 * implements interface FilmRomance
 * class ini dibuat agar dapat dilakukan adapter pattern
 * 
 * @author Fikrul Akhyar
 * @version 1.3
 */

public class FilmYourName implements FilmRomance {

    /**
     * Override method romance dari interface FilmRomance
     */
    @Override
    public void romance() {
        System.out.println("Film Romance");
    }
}
