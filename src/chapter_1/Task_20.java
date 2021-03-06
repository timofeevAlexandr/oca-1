package chapter_1;

//What is true about the following code? (Choose all that apply)
public class Task_20 {

    protected void finalize() {
        System.out.println("Roar!");
    }

    public static void main(String[] args) {
        Task_20 bear = new Task_20();
        bear = null;
        System.gc();
    }

//    A. finalize() is guaranteed to be called.
//    B. finalize() might or might not be called
//    C. finalize() is guaranteed not to be called.
//    D. Garbage collection is guaranteed to run.
//    E. Garbage collection might or might not run.
//    F. Garbage collection is guaranteed not to run.
//    G. The code does not compile.
}

//B, E
