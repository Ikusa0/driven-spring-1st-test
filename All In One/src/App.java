import java.io.File;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        PrintStream file = new PrintStream(new File("Result.txt"));
        PrintStream console = System.out;
        System.setOut(file);

        Solutions.firstQuestion(new int[] {-3, -2, -1, 0, 1, 2, 3,});
        Solutions.secondQuestion(new int[] {0, 1, 2, 5, 10, 15, 20, 25, 30});
        Solutions.thirdQuestion(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        Solutions.fourthQuestion(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9});
        Solutions.fifthQuestion(new String[] {"Manga", "Caqui", "Morango", "Morango", "Morango", "Amora"}, new String[] {"Morango", "Banana", "Maçã", "Uva", "Caqui", "Manga"});
        
        System.setOut(console);
        Holidayzer.run();
    }
}

class Solutions {
    private Solutions() {}

    public static void firstQuestion(int[] numbers) {
        System.out.println("[1] ------ O que é esse número?");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(String.format("[input: %d] ------ %d é %s e %s", numbers[i], numbers[i], Util.isOddOrEven(numbers[i]), Util.isPositiveOrNegative(numbers[i])));
        }
        System.out.println();
    }

    public static void secondQuestion(int[] numbers) {
        System.out.println("[2] ------ Fibonacci?");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(String.format("[input: %d] ------ %s", numbers[i], Util.fibonacci(numbers[i])));
        }
        System.out.println();
    }

    public static void thirdQuestion(int[] numbers) {
        System.out.println("[3] ------ MultiplicaAí");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(String.format("[input: %d]%n %s", numbers[i], Util.multiplicationTable(numbers[i])));
        }
        System.out.println();
    }

    public static void fourthQuestion(int[] numbers) {
        System.out.println("[4] ------ Pirâmide de Números");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(String.format("[input: %d]%n%s", numbers[i], Util.numberPyramid(numbers[i])));
        }
        System.out.println();
    }

    public static void fifthQuestion(String[] array1, String[] array2) {
        System.out.println("[5] ------ - Duplicados não!");
        System.out.println(String.format("Array 1: %s%nArray 2: %s%nResultado: %s", Arrays.toString(array1), Arrays.toString(array2), Util.findDuplicates(array1, array2)));
        System.out.println();
    }
}

class Util {
    private Util() {}

    public static String isPositiveOrNegative(int num) {
        return num >= 0 ? "positivo" : "negativo";
    }

    public static String isOddOrEven(int num) {
        return num % 2 == 0 ? "par" : "ímpar";
    }

    public static String fibonacci(int num) {
        if (num <= 0) {
            return "";
        } 
        
        if (num == 1) {
            return "0";
        }

        int[] fibNumbers = new int[num];
        fibNumbers[0] = 0;
        fibNumbers[1] = 1;

        for (int i = 2; i < num; i++) {
            fibNumbers[i] = fibNumbers[i - 1] + fibNumbers[i - 2];
        }

        return Arrays.toString(fibNumbers).replaceAll("[\\[\\],]", "");
    }

    public static String multiplicationTable(int num) {
        String[] table = new String[10];

        for (int i = 1; i <= 10; i++) {
            table[i - 1] = String.format("%d x %d = %d", num, i, num * i);
        }

        return Arrays.toString(table).replace(",", "\n").replaceAll("[\\[\\]]","");
    }

    public static String numberPyramid(int num) {
        if (num <= 0) {
            return "";
        }
        String[] pyramid = new String[num];

        for (int i = 1; i <= num; i++) {
            pyramid[i - 1] = String.format("%d", i).repeat(i);
        }

        return Arrays.toString(pyramid).replaceAll("[\\[\\],]", "").replace(" ", "\n");
    }

    public static Set findDuplicates(String[] array1, String[] array2) {
        Set<String> duplicates = new HashSet<String>();
        
        for(int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    duplicates.add(array1[i]);
                }
            }
        }

        return duplicates;
    }
}
