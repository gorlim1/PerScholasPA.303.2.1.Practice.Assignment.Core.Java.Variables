import com.perscholas.java_basics.*;

public class Main {
    public static void main(String[] args) {

        //Call the first to eighth assignment examples' methods in order

        FirstExampleAddTwoIntegers addTwoIntegersObject = new FirstExampleAddTwoIntegers();
        addTwoIntegersObject.printIntegerSum();
        System.out.println();

        SecondExampleAddTwoDoubles addTwoDoublesObject = new SecondExampleAddTwoDoubles();
        addTwoDoublesObject.printDoubleSum();
        System.out.println();

        ThirdExampleAddIntegerAndDouble addIntegerAndDoubleObject = new ThirdExampleAddIntegerAndDouble();
        addIntegerAndDoubleObject.printIntegerAndDoubleSum();
        System.out.println();

        FourthExampleDivideTwoIntegers divideTwoIntegersObject = new FourthExampleDivideTwoIntegers();
        divideTwoIntegersObject.printIntegerDivision();
        System.out.println();

        FifthExampleDivideTwoDoublesCast divideTwoDoublesCastObject = new FifthExampleDivideTwoDoublesCast();
        divideTwoDoublesCastObject.printDivideTwoDoublesCast();
        System.out.println();

        SixthExampleDivideTwoIntegersCast divideTwoIntegersCastObject = new SixthExampleDivideTwoIntegersCast();
        divideTwoIntegersCastObject.printDivideTwoIntegersCast();
        System.out.println();

        SeventhExampleConstantCalculation constantCalculationObject = new SeventhExampleConstantCalculation();
        constantCalculationObject.printGravityFreeFallVelocity();
        System.out.println();

        EighthExampleCafe cafeObject = new EighthExampleCafe();
        cafeObject.printCafeOrder();
        System.out.println();
    }
}