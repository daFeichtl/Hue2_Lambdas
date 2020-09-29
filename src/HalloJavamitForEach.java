import java.util.ArrayList;
import java.util.List;

public class HalloJavamitForEach {
    List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        new HalloJavamitForEach().printList();
    }
    //Beispiel 2
    private void printList(){
        list.add("Hellou");
        list.add("WASSUP");
        for (String s : list) {
            System.out.println(s);
        }
        list.forEach((String s) -> System.out.println(s));
        list.forEach(System.out::println);
    }

}
