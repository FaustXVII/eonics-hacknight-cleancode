package gameObjects;

public class Credits {
    private int numberOfCredits;

    public Credits(final int numberOfCredits){
        this.numberOfCredits = numberOfCredits;
    }

    public void subtract(final Credits credits){
        numberOfCredits -= credits.getNumberOfCredits();
    }

    public void addFourTimes(final Credits credits){
        numberOfCredits += (credits.getNumberOfCredits() * 4);
    }

    public void addTwice(final Credits credits){
        numberOfCredits += (credits.getNumberOfCredits() * 2);
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }
}
