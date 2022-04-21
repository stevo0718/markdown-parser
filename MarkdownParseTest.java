import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class MarkdownParseTest {
   @Test
   public void addition() {
       assertEquals(2, 1 + 1);
   }

   @Test
   public void test() {
    List<String> list = List.of("ilovemoney");
    Path fileName = Path.of("test-file3.md");
    String content = "";
    try{
        content = Files.readString(fileName);
        
    }
    catch(IOException e){

    }
    ArrayList<String> links = MarkdownParse.getLinks(content);
    assertEquals(list, links);
   }
}
    
