import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UnloadContainers {

    /*
     Starting container arrangement

                    [A] [L]     [J]
                [B] [Q] [R]     [D] [T]
                [G] [H] [H] [M] [N] [E]
            [J] [L] [D] [L] [J] [H] [B]
        [Q] [L] [W] [S] [V] [N] [F] [N]
    [W] [N] [H] [M] [L] [B] [R] [T] [Q]
    [L] [O] [C] [W] [D] [J] [W] [Z] [E]
    [S] [J] [S] [T] [O] [M] [D] [!] [H]
     1   2   3   4   5   6   7   8   9

     */

    public static void main(String[] args) throws IOException {
        UnloadContainers unloadContainers = new UnloadContainers();
        unloadContainers.executeAll();
    }

    private void executeAll() {
        execute(getShip0(), "data.txt");
        execute(getShip1(), "data1.txt");
        execute(getShip2(), "data2.txt");
        execute(getShip3(), "data3.txt");
    }

    private void execute(Ship ship, String filename) {
        MoveParser moveParser = new MoveParser(filename);
        List<Move> moveList = moveParser.getMoveList();
        for (Move move : moveList) {
            ship.doMove(move);
        }
        System.out.println(ship.getWord());
    }

    public Ship getShip0() {
        List<List<String>> stacks = new ArrayList<>();
        List<String> stack1 = createStack("S", "L", "W");
        List<String> stack2 = createStack("J", "O", "N", "Q");
        List<String> stack3 = createStack("S", "C", "H", "L", "J");
        List<String> stack4 = createStack("T", "W", "M", "W", "L", "G", "B");
        List<String> stack5 = createStack("O", "D", "L", "S", "D", "H", "Q", "A");
        List<String> stack6 = createStack("M", "J", "B", "V", "L", "H", "R", "L");
        List<String> stack7 = createStack("D", "W", "R", "N", "J", "M");
        List<String> stack8 = createStack("!", "Z", "T", "F", "H", "N", "D", "J");
        List<String> stack9 = createStack("H", "E", "Q", "N", "B", "E", "T");
        stacks.add(stack1);
        stacks.add(stack2);
        stacks.add(stack3);
        stacks.add(stack4);
        stacks.add(stack5);
        stacks.add(stack6);
        stacks.add(stack7);
        stacks.add(stack8);
        stacks.add(stack9);
        Ship ship = new Ship(stacks);
        return ship;
    }

    public Ship getShip1() {
        List<List<String>> stacks = new ArrayList<>();
        List<String> stack1 = createStack("S", "L", "W");
        List<String> stack2 = createStack("J", "T", "T", "Q");
        List<String> stack3 = createStack("S", "C", "H", "F", "J");
        List<String> stack4 = createStack("T", "F", "M", "W", "T", "G", "B");
        List<String> stack5 = createStack("S", "A", "L", "S", "D", "H", "Q", "B");
        List<String> stack6 = createStack("M", "J", "B", "V", "N", "H", "R", "L");
        List<String> stack7 = createStack("D", "W", "R", "N", "J", "M");
        List<String> stack8 = createStack("C", "Z", "T", "F", "H", "N", "D", "J");
        List<String> stack9 = createStack("H", "A", "Q", "N", "B", "I", "T");
        stacks.add(stack1);
        stacks.add(stack2);
        stacks.add(stack3);
        stacks.add(stack4);
        stacks.add(stack5);
        stacks.add(stack6);
        stacks.add(stack7);
        stacks.add(stack8);
        stacks.add(stack9);
        Ship ship = new Ship(stacks);
        return ship;
    }

    public Ship getShip2() {
        List<List<String>> stacks = new ArrayList<>();
        List<String> stack1 = createStack("Z", "J", "G");
        List<String> stack2 = createStack("Q", "L", "R", "P", "W", "N", "V", "C");
        List<String> stack3 = createStack("F", "P", "M", "C", "L", "G", "R");
        List<String> stack4 = createStack("L", "F", "B", "W", "U", "F", "M");
        List<String> stack5 = createStack("G", "C", "F", "S", "V", "Q");
        List<String> stack6 = createStack("W", "H", "J", "Z", "M", "Q", "D", "L");
        List<String> stack7 = createStack("H", "F", "S", "B", "V");
        List<String> stack8 = createStack("F", "J", "Z", "O");
        List<String> stack9 = createStack("E", "C", "D", "L", "F", "H", "B", "T");
        stacks.add(stack1);
        stacks.add(stack2);
        stacks.add(stack3);
        stacks.add(stack4);
        stacks.add(stack5);
        stacks.add(stack6);
        stacks.add(stack7);
        stacks.add(stack8);
        stacks.add(stack9);
        Ship ship = new Ship(stacks);
        return ship;
    }

    public Ship getShip3() {
        List<List<String>> stacks = new ArrayList<>();
        List<String> stack1 = createStack("D", "T", "R", "B", "J", "L", "W", "G");
        List<String> stack2 = createStack("S", "W", "Y");
        List<String> stack3 = createStack("R", "A", "T", "M");
        List<String> stack4 = createStack("D", "T", "C", "H", "E", "P", "V");
        List<String> stack5 = createStack("D", "P", "T", "L", "D", "Z");
        List<String> stack6 = createStack("F", "B", "R", "Z", "J", "Q", "C", "D");
        List<String> stack7 = createStack("S", "B", "N", "J", "G", "F", "T", "R");
        List<String> stack8 = createStack("L", "E", "R", "B", "T", "V", "M");
        List<String> stack9 = createStack("Q", "P", "D", "L", "R");
        stacks.add(stack1);
        stacks.add(stack2);
        stacks.add(stack3);
        stacks.add(stack4);
        stacks.add(stack5);
        stacks.add(stack6);
        stacks.add(stack7);
        stacks.add(stack8);
        stacks.add(stack9);
        Ship ship = new Ship(stacks);
        return ship;
    }



    private List<String> createStack(String... letters) {
        List<String> stack = new ArrayList<>();
        for (String container : letters) {
            stack.add(container);
        }
        return stack;
    }
}
