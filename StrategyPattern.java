/***
 * Class StrategyPattern
 * 
 * @author Fikrul Akhyar
 * @version 1.3
 */

public class StrategyPattern {
    private FilmAction filmAction;

    /**
     * Method setter setFilmAction
     * 
     * @param filmAction
     */
    public void setFilmAction(FilmAction filmAction) {
        this.filmAction = filmAction;
    }

    /**
     * Method getter getFilmAction
     * 
     * @return filmAction
     */
    public FilmAction getFilmAction() {
        return this.filmAction;
    }

    /**
     * Method action untuk memanggil method action kepunyaan atribut filmAction
     */
    public void action() {
        filmAction.action();
    }
}
