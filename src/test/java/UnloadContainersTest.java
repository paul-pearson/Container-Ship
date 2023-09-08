import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class UnloadContainersTest {

    @Test
    public void shouldGetWords() {
        UnloadContainers unloadContainers = new UnloadContainers();

        List<String> words = unloadContainers.executeAll();

        Assert.assertEquals(4, words.size());
        Assert.assertEquals("WELLDONE!", words.get(0));
        Assert.assertEquals("FANTASTIC", words.get(1));
        Assert.assertEquals("WONDERFUL", words.get(2));
        Assert.assertEquals("LEGENDARY", words.get(3));
    }
}
