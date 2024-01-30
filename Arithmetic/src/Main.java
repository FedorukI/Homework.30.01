import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите значение 1: ");
        double var1 = scanner.nextDouble();
        boolean additionSumEven = ArithmeticOperations.additionSumEven(var1);
        System.out.println("Sum Even: " + additionSumEven);



        System.out.println("Введите значение 2: ");
        double var2 = scanner.nextDouble();
        boolean additionSumEven1 = ArithmeticOperations.additionSumEven1(var2);
        System.out.println("Sum Even: " + additionSumEven1);
        ArithmeticOperations arithmetic = new ArithmeticOperations(var1, var2);
        System.out.println("Результат: " + arithmetic.addition());




        System.out.println("Введите значение 1: " );
        double subtraction1 = scanner.nextDouble();
        boolean subtractionSumEven = ArithmeticOperations.subtractionSumEven(subtraction1);
        System.out.println("Sum Even: " + subtractionSumEven);
        System.out.println("Введите значение 2: " );
        double subtraction2 = scanner.nextDouble();
        boolean subtractionSumEven2 = ArithmeticOperations.subtractionSumEven2(subtraction2);
        System.out.println("Sum Even: " + subtractionSumEven2);
        ArithmeticOperations arithmetic1 = new ArithmeticOperations(subtraction1,subtraction2);
        System.out.println("Результат: " + arithmetic1.subtraction());




        System.out.println("Введите значение 1: " );
        double multiplication1 = scanner.nextDouble();
        boolean multiplicationSumEven = ArithmeticOperations.multiplicationSumEven(multiplication1);
        System.out.println("Sum Even: " + multiplicationSumEven);
        System.out.println("Введите значение 2: " );
        double multiplication2 = scanner.nextDouble();
        boolean multiplicationSumEven1 = ArithmeticOperations.multiplicationSumEven1(multiplication2);
        System.out.println("Sum Even: " + multiplicationSumEven1);

        ArithmeticOperations arithmetic2 = new ArithmeticOperations(multiplication1,multiplication2);
        System.out.println("Результат: " + arithmetic2.multiplication());






        System.out.println("Введите значение 1: " );
        double division1 = scanner.nextDouble();
        boolean divisionSumEven = ArithmeticOperations.divisionSumEven(division1);
        System.out.println("Sum Even: " + divisionSumEven);
        System.out.println("Введите значение 2: " );
        double division2 = scanner.nextDouble();
        boolean divisionSumEven1 = ArithmeticOperations.divisionSumEven1(division2);
        System.out.println("Sum Even: " + divisionSumEven1);
        ArithmeticOperations arithmetic3 = new ArithmeticOperations(division1,division2);
        System.out.println("Результат: " + arithmetic3.division());

        System.out.println("если честно списал дз, не было времени, но половину сделал сам");
    }


    }
