import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest extends MarkdownParse{
    @Test
    public void addition() {
       assertEquals(2, 1 + 1);
    }

    @Test
    public void test() throws IOException{
        Path fileName = Path.of("test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("ilovemoney");
        assertEquals(expected, links);
    }
}
    
