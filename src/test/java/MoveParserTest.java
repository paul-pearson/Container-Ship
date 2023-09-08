import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MoveParserTest {

    private MoveParser moveParser;

    @Before
    public void setUp() {
        moveParser = new MoveParser();
    }

    @Test
    public void shouldParseLine() {
        String line = "move 5 from 2 to 1";

        Move move = moveParser.parse(line);

        Assert.assertEquals(2, move.getFrom());
        Assert.assertEquals(1, move.getTo());
        Assert.assertEquals(5, move.getAmount());
    }
}
