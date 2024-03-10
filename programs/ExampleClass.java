public class ExampleClass {
    private static int staticVariable; // Static variable (class variable)
    private int instanceVariable; // Instance variable

    public static void staticMethod() { // Static method (class method)
        staticVariable = 10; // Accessing static variable directly
        // Do something...
    }

    public void instanceMethod() { // Instance method
        staticVariable = 20; // Accessing static variable directly
        instanceVariable = 30; // Accessing instance variable
        // Do something...
    }

    public static void main(String[] args) {
        staticVariable = 5; // Accessing static variable directly

        ExampleClass obj1 = new ExampleClass();
        obj1.instanceVariable = 15; // Accessing instance variable through object reference

        ExampleClass.staticVariable = 25; // Accessing static variable through class name

        staticMethod(); // Invoking static method directly

        obj1.instanceMethod(); // Invoking instance method through object reference
    }
}
