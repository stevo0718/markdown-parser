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

    //Lab report 4 tests
    @Test
    public void test6() throws IOException{
        Path fileName = Path.of("test-file6.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("%60google.com");
        expected.add("google.com");
        expected.add("ucsd.edu");
        assertEquals(expected, links);
    }

    @Test
    public void test7() throws IOException{
        Path fileName = Path.of("test-file7.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("a.com");
        expected.add("a.com(())");
        expected.add("example.com");
        assertEquals(expected, links);
    }

    @Test
    public void test8() throws IOException{
        Path fileName = Path.of("test-file8.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        assertEquals(expected, links);
    }

    @Test
    public void test9() throws IOException{
        Path fileName = Path.of("test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        assertEquals(expected, links);
    }
}
    
