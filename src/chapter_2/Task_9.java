package chapter_2;

//How many times will the following code print "Hello World"?
public class Task_9 {

    public static void main(String[] args) {
        for (int i = 0; i < 10; ) {
            i = i++;
            System.out.println("Hello World");
        }
    }

//    A. 9
//    B. 10
//    C. 11
//    D. The code will not compile because of line 3.
//    E. The code will not compile because of line 5.
//    F. The code contains an infinite loop and does not terminate.
}

//F
