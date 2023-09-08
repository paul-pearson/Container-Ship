import java.util.List;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoveParserTest {

    private MoveParser moveParser;

    @Before
    public void setUp() {
        moveParser = new MoveParser("data.txt");
    }

    @Test
    public void shouldParseLine() {
        String line = "move 5 from 2 to 1";

        Move move = moveParser.parse(line);

        Assert.assertEquals(2, move.getFrom());
        Assert.assertEquals(1, move.getTo());
        Assert.assertEquals(5, move.getAmount());
    }

    @Test
    public void shouldGetMoveList() {
        List<Move> moveList = moveParser.getMoveList();

        Assert.assertEquals(502, moveList.size());
        Move firstMove = moveList.get(0);
        Assert.assertEquals(4, firstMove.getFrom());
        Assert.assertEquals(5, firstMove.getTo());
        Assert.assertEquals(5, firstMove.getAmount());
    }
}
