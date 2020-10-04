import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NumberTester { //Beispiel 3
    private String fileName;
    private int testCounter;
    private NumberTest numberTest;
    private final String seperator = " "; //Leerzeichen
    private String[] allTests;
    private int anzTest;

    public NumberTester(String fileName) { //für Hilfe siehe BeispielProgramme.pdf im Downloads-Ordner
        this.fileName = fileName;
        try {
            Scanner scan = new Scanner(new File(fileName));
            try {
                allTests = new String[(int) new File(fileName).length()+1];
            }
            catch (ClassCastException c){
                System.out.println("File too large! max Integer.MaxValue-1!");
            }
            anzTest = Integer.parseInt(scan.nextLine());
            testCounter=0;
            while(scan.hasNext()){
                allTests[testCounter] = scan.nextLine();
                testCounter++;
            }
            testFile();
            System.out.println("Anzahl der wirklichen Tests: "+testCounter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void setOddEvenTester(NumberTest oddTester){ //checkt ob gerade Zahlen
        this.numberTest = oddTester;
    }

    public void setPrimeTester(NumberTest primeTester) {
        this.numberTest = primeTester;
    }

    public void setPalindromeTester(NumberTest palindromeTester) {
        this.numberTest = palindromeTester;
    }
    public void testFile(){
        int input0=1;
        Scanner scanner = new Scanner(System.in,"Windows-1252");
        if (anzTest != testCounter){
            System.out.println("\\u001b[33m[WARNING]\\u001b[37m Da die Anzahl der Einträge nicht mit der Rechennummer einstimmt, soll die Eintragsnummer (Zeile 1) berechnet werden oder alle Einträge?\n" +
                    "1..Eintragsnummer\n" +
                    "2..alle Einträge");
            try {
                input0 = Integer.parseInt(scanner.nextLine());
            }
            catch(Exception e) {
                input0 = 1;
            }
        }
        switch (input0){
            case 1:
                logic(anzTest);
                break;
            case 2:
                logic(testCounter);
                break;
            default:
                System.out.println("WAIT THATS ILLEGAL!");
                break;
        }
    }
    private void logic(int length){

    }
}