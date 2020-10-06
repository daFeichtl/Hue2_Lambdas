import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        new HalloJavamitForEach().printList();
        NumberTester tester = new NumberTester("numbers.txt");
        new Main().runNr4();
    }
    private void runNr4(){
        Scanner scanner = new Scanner(System.in, "Windows-1252");
        int chosen = 0;
        AbstractCalculator calc = null;
        while(chosen !=4){
            System.out.println("Choose Calc:\n1..Relational calc\n2..Vector calc\n3.. Complex calc\n4.. Exit");
            chosen = Integer.parseInt(scanner.nextLine());
            switch (chosen){
                case 1:
                    calc = new RationalCalculator();
                    break;
                case 2:
                    calc = new VectorCalculator();
                    break;
                case 3:
                    calc = new ComplexCalculator();
                    break;
                case 4:
                    System.out.println("Bye");
                    break;
                default:
                    System.out.println("Illegal input!");
                    break;
            }
            if (chosen ==4)
                break;
            int chosenOperation = 0;
            while(chosenOperation != 5 || chosen != 4){
                Number x;
                Number y;
                try {
                    System.out.println("Enter number x a:");
                    double xa = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter number x b:");
                    double xb = Double.parseDouble(scanner.nextLine());
                    x = new Number(xa,xb);
                    System.out.println("Enter number y a:");
                    double ya = Double.parseDouble(scanner.nextLine());
                    System.out.println("Enter number y b:");
                    double yb = Double.parseDouble(scanner.nextLine());
                    y = new Number(ya,yb);
                }
                catch (ClassCastException c){
                    System.out.println("Illegal number input!");
                    break;
                }
                System.out.println("1.. add\n2.. subtract\n3.. multiply\n4.. divide\n5.. re-enter numbers");
                chosenOperation = Integer.parseInt(scanner.nextLine());
                Number result = null;
                switch (chosenOperation) {
                    case 1:
                        result = calc.add(x, y);
                        break;
                    case 2:
                        result = calc.subtract(x, y);
                        break;
                    case 3:
                        result = calc.multiply(x, y);
                        break;
                    case 4:
                        result = calc.divide(x, y);
                        break;
                    case 5:
                        System.out.println("Returning...");
                        break;
                    default:
                        System.out.println("Illegal input!");
                        break;
                }
                System.out.println("________________________\nSolution:\na = "+result.getA()+"\nb = "+result.getB()+"\n________________________");
                break;
            }
        }
    }
}
