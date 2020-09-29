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
