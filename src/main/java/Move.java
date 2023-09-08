public class Move {

    private int from;
    private int to;
    private int amount;

    public int getFrom() {
        return from;
    }

    public int getTo() {
        return to;
    }

    public int getAmount() {
        return amount;
    }

    public Move(int from, int to, int amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }
}
