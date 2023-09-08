import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class ShipTest {

    @Test
    public void shouldDoMove() {
        List<List<String>> stacks = new ArrayList<>();
        List<String> stack1 = createStack("Z", "N");
        List<String> stack2 = createStack("M", "C", "D");
        List<String> stack3 = createStack("P");
        stacks.add(stack1);
        stacks.add(stack2);
        stacks.add(stack3);
        Ship ship = new Ship(stacks);

        ship.doMove(new Move(2, 1, 1));

        Assert.assertEquals("DCP", ship.getWord());

    }

    private List<String> createStack(String... letters) {
        List<String> stack = new ArrayList<>();
        for (String container : letters) {
            stack.add(container);
        }
        return stack;
    }
}
