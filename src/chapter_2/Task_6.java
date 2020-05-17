package chapter_2;

//What is the output of the following code snippet?
public class Task_6 {

    public static void main(String[] args) {
        int x = 4;
        long y = x * 4 - x++;
        if (y < 10) System.out.println("Too Low");
        else System.out.println("Just right");      //6
        //else System.out.println("Too High");        //7
    }

//    A. Too Low
//    B. Just Right
//    C. Too High
//    D. Compiles but throws a NullPointerException.
//    E. The code will not compile because of line 6.
//    F. The code will not compile because of line 7.
}

//F