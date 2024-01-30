public class ArithmeticOperations {
    double number1;
    double number2;

    public ArithmeticOperations(double number1, double number2){
        this.number1 = number1;
        this.number2 = number2;
    }

    public double addition(){
        return this.number1 + this.number2;

    }
    public double subtraction(){
        return this.number1 - this.number2;
    }
    public double multiplication(){
        return this.number1 * this.number2;
    }
    public double division(){
        return this.number1 / this.number2;
    }

    public static boolean additionSumEven(double number1){
        boolean additionSumEven  = (number1 % 2) == 0;
        return additionSumEven;
    }
    public static boolean additionSumEven1(double number2){
        boolean additionSumEven  = (number2 % 2) == 0;
        return additionSumEven;
    }
    public static boolean subtractionSumEven(double number1){
        boolean subtractionSumEven  = (number1 % 2) == 0;
        return subtractionSumEven;
    }
    public static boolean subtractionSumEven2(double number2){
        boolean subtractionSumEven2  = (number2 % 2) == 0;
        return subtractionSumEven2;
    }
    public static boolean multiplicationSumEven(double number1){
        boolean multiplicationSumEven  = (number1 % 2) == 0;
        return multiplicationSumEven;
    }
    public static boolean multiplicationSumEven1(double number2){
        boolean multiplicationSumEven1  = (number2 % 2) == 0;
        return multiplicationSumEven1;
    }
    public static boolean divisionSumEven(double number1){
        boolean divisionSumEven  = (number1 % 2) == 0;
        return divisionSumEven;
    }
    public static boolean divisionSumEven1(double number2){
        boolean divisionSumEven1 = (number2 % 2) == 0;
        return divisionSumEven1;
    }


}

