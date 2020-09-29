import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {
    List<String> list = new ArrayList<>();

    private void printList(){
        list.add("Hellou");
        list.add("WASSUP");
        for (String s : list) {
            System.out.println(s);
        }
    }
}
