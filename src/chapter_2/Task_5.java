package chapter_2;

//What is the output of the following code snippet?
public class Task_5 {

    public static void main(String... args) {
        java.util.List<Integer> list = new java.util.ArrayList<Integer>();
        list.add(10);
        list.add(14);
        for (int x : list) {
            System.out.print(x + ", ");
            break;
        }
    }

//    A. 10, 14,
//    B. 10, 14
//    C. 10,
//    D. The code will not compile because of line 7.
//    E. The code will not compile because of line 8.
//    F. The code contains an infinite loop and does not terminate.
}

//C