import static org.junit.Assert.*;

import java.nio.file.DirectoryStream.Filter;
import java.util.ArrayList;
import java.util.List;

import org.junit.*;

public class ListTests{
    @Test 
	public void testFilter() {
        List<String> input1 = new ArrayList<>();
        input1.add("a");
        input1.add("banana");
        input1.add("123456");
        input1.add("c");
        
        List<String> expect1 = new ArrayList<>();
        expect1.add("banana");
        expect1.add("123456");

        LengthChecker sc = new LengthChecker();
        input1 = ListExamples.filter(input1, sc);

        assertEquals(expect1, input1);
    }

}