// A Simple Java program to show working of user defined
// Generic classes
   
// We use < > to specify Parameter type
class Test<T>
{
    // An object of type T is declared
    T obj;
    Test(T obj) {  this.obj = obj;  }  // constructor
    public T getObject()  { return this.obj; }
}
   
// Driver class to test above
public class GenericDemo
{
    public static void main (String[] args)
    {
        // instance of Integer type
        Test <Integer> IntegerGenericObj = new Test<Integer>(15);
        System.out.println(IntegerGenericObj.getObject());
   
        // instance of String type
        Test <String> StringGenericObj = new Test<String>("GeeksForGeeks");
        System.out.println(StringGenericObj.getObject());
    }
}