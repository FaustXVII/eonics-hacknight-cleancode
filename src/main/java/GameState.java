public class GameState {
    private int credits = 50;

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getCredits() {
        return credits;
    }

    public void addToCredits(int addValue){
        credits += addValue;
    }

    public void removeFromCredits(int removeValue){
        credits += removeValue;
    }
}
