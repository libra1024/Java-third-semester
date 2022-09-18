public class Memory {

    private int lowestValue = 50;
    private int highestValue = 50;

    public int getLowestValue() {

        return this.lowestValue;
    }

    public int getHighestValue() {

        return this.highestValue;
    }

    public void setValue(int value) {

        if (value >= 0 && value <= 100) {
            if (value >= highestValue) {
                this.highestValue = value;
            } else if (value <= this.lowestValue) {
                this.lowestValue = value;
            }
        }
    }
}
