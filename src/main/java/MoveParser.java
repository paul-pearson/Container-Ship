import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class MoveParser {

    private String dataFilename;

    public MoveParser(String dataFilename) {
        this.dataFilename = dataFilename;
    }

    public List<Move> getMoveList() {
        List<Move> moveList = new ArrayList<Move>();
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    this.getClass().getResourceAsStream(dataFilename)));
            String line;
            while ((line = br.readLine()) != null) {
                moveList.add(parse(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return moveList;
    }

    public Move parse(String line) {
        String[] split = line.split(" ");
        Move move = new Move(Integer.parseInt(split[3]), Integer.parseInt(split[5]), Integer.parseInt(split[1]));
        return move;
    }
}
