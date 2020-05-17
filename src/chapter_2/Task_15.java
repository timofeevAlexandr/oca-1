package chapter_2;

//What is the output of the following code snippet?
public class Task_15 {

    public static void main(String[] args) {
        int x = 1, y = 15;               //3
        //while x < 10                     //4
        y--;                             //5
        x++;                             //6
        System.out.println(x+", "+y);    //7
    }

//    A. 10, 5
//    B. 10, 6
//    C. 11, 5
//    D. The code will not compile because of line 3.
//    E. The code will not compile because of line 4.
//    F. The code contains an infinite loop and does not terminate.
}

//E
