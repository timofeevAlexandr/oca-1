package chapter_2;

//What is the output of the following code snippet?
public class Task_17 {

    public static void main(String[] args) {
        boolean keepGoing = true;
        int result = 15, i = 10;
        do {
            i--;
            if (i == 8) keepGoing = false;
            result -= 2;
            } while (keepGoing);
        System.out.println(result);
    }

//    A. 7
//    B. 9
//    C. 10
//    D. 11
//    E. 15
//    F. The code will not compile because of line 8.
}


//D