/*
PROJECT NAME : java-basics-maven
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 8/11/2021 3:19 PM
*/

public class NotOperator {

    // Handle both the negative & positive cases :
    public static void ifElseStatementExampel(boolean isValid) {
        if(isValid) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    // Handle only the negative cases (with two blocks) :
    public static void checkIsValidIsFalseWithEmptyIfBlock(boolean isValid) {
        if(isValid) {

        } else {
            System.out.println("Invalid");
        }
    }

    // Handle only the negative cases (with one block) :
    public static void checkIsValidIsFalseWithJustTheIfBlock(boolean isValid) {
        if(isValid == false) {
            System.out.println("Invalid");
        }
    }

    public static void checkIsValidFalseWithTheNotOperator(boolean isValid) {
        if(!isValid) {
            System.out.println("Invalid");
        }
    }

    public static void notOperatorWithBooleanValueAsOperand() {
        System.out.println(!true); // prints false
        System.out.println(!false); // prints true
        System.out.println(!!false); // prints false
    }

    public static void applyNotOperatorToAnExpression_LogicalOperators() {
        boolean x = true;
        boolean y = false;

        System.out.println(!(x && y)); // prints true
        System.out.println(!(x || y)); // prints false
    }

    public static void precedenceExample() {
        boolean x = true;
        boolean y = false;

        System.out.println(!x && y); // prints false
        System.out.println(!(x && y)); // prints true
    }

    public static void pitfalls_simplifyComplexConditionsByReversingLogicExample(int count, int total) {
        if(count < 10 && total < 1000) {
            System.out.println("Some more work to do");
        }
    }

    public static void exitEarlyExample() {
        boolean isValid = false;

        if(!isValid) {
            throw new IllegalArgumentException("Invalid input");
        }
        // Code to execute when isValid == true goes here
    }
}
