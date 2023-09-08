import java.util.ArrayList;
import java.util.List;

public class Ship {

    private List<List<String>> stacks = new ArrayList<>();

    public Ship(List<List<String>> stacks) {
        this.stacks = stacks;
    }

    public void doMove(Move move) {
        int from = move.getFrom();
        int to = move.getTo();
        int amount = move.getAmount();
        List<String> fromStack = stacks.get(from - 1);
        List<String> toStack = stacks.get(to - 1);
        for (int i = 0; i < amount; i++) {
            String container = fromStack.remove(fromStack.size() - 1);
            toStack.add(container);
        }
    }

    public String getWord() {
        StringBuilder sb = new StringBuilder();
        for (List<String> stack : stacks) {
            if (!stack.isEmpty()) {
                sb.append(stack.get(stack.size() - 1));
            }
        }
        return sb.toString();
    }

}
