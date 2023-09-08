public class MoveParser {

    public Move parse(String line) {
        String[] split = line.split(" ");
        Move move = new Move(Integer.parseInt(split[3]), Integer.parseInt(split[5]), Integer.parseInt(split[1]));
        return move;
    }
}
