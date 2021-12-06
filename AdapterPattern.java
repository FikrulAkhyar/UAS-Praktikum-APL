/***
 * Class AdapterPattern
 * implements interface FilmAction
 * 
 * @author Fikrul Akhyar
 * @version 1.4
 */

public class AdapterPattern implements FilmAction {
    FilmRomance filmRomance;

    /**
     * Method Constructor Adapter Pattern
     * 
     * @param filmRomance
     */
    public AdapterPattern(FilmRomance filmRomance) {
        this.filmRomance = filmRomance;
    }

    /**
     * Override method action interface FilmAction
     */
    @Override
    public void action() {
        filmRomance.romance();
    }
}
