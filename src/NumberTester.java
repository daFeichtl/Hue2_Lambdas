import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberTester { //Beispiel 3
    private String fileName;
    private int testCounter;
    private NumberTest oddTester;
    private NumberTest primeTester;
    private NumberTest palindromeTester;
    private final char seperator = 20; //Leerzeichen
    private String[] allTests;
    private int anzTest;

    public NumberTester(String fileName) {
        this.fileName = fileName;
        try {
            Scanner scan = new Scanner(new File(fileName));
            anzTest = Integer.parseInt(scan.nextLine());
            testCounter=0;
            while(scan.hasNext()){
                allTests[testCounter] = scan.nextLine();
                testCounter++;
            }
            System.out.println("Anzahl der wirklichen Tests: "+testCounter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void setOddEvenTester(NumberTest oddTester){ //checkt ob gerade Zahlen
        this.oddTester = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.primeTester = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.palindromeTester = palindromeTester;
    }
    public void testFile(){

    }
}
