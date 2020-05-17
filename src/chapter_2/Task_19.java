package chapter_2;

//What is the result of the following code snippet?
public class Task_19 {

    public static void main(String[] args) {
        int m = 9, n = 1, x = 0;
        while (m > n) {
            m--;
            n += 2;
            x += m + n;
        }
        System.out.println(x);
    }

//    A. 11
//    B. 13
//    C. 23
//    D. 36
//    E. 50
//    F. The code will not compile because of line 7.
}

//D
