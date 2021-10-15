// Java Program to Illustrate Error
// Stack overflow error via infinite recursion
 
// Class 1
class StackOverflow {
 
    // method of this class
    public static void test(int i)
    {
        // No correct as base condition leads to
        // non-stop recursion.
        if (i == 0)
            return;
        else {
            test(i++);
        }
    }
}
 
// Class 2
// Main class
public class ErrorCompileTimeTest{
 
    // Main driver method
    public static void main(String[] args)
    {
        // Testing for error by passing
        // custom integer as an argument
        StackOverflow.test(5);
    }
}