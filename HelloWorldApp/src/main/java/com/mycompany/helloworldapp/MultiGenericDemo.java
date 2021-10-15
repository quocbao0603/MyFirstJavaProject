// A Simple Java program to show multiple
// type parameters in Java Generics
  
// We use < > to specify Parameter type

class Test<T, U>
{
    T obj1;// An object of type T
    U obj2;// An object of type U
    
     // constructor
    Test(T obj1, U obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    //print object
    public void print(){
        System.out.println(obj1 + " " + obj2);
       
    }
}

  
// Driver class to test above
public class Main
{
    public static void main (String[] args)
    {
        Test <String, Integer> obj =
            new Test<String, Integer>("GfG", 15);
        Test <Integer, Float> obj2 = new Test<Integer, Float>(10, (float)10.02);
        obj.print();
        obj2.print();
    }
}