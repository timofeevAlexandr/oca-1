package chapter_2;

//What is the output of the following code snippet?
public class Task_18 {

    public static void main(String[] args) {
        int count = 0;
        ROW_LOOP:
        for (int row = 1; row <= 3; row++)
            for (int col = 1; col <= 2; col++) {
                if (row * col % 2 == 0) continue ROW_LOOP;
                count++;
            }
        System.out.println(count);
    }

//    A. 1
//    B. 2
//    C. 3
//    D. 4
//    E. 6
//    F. The code will not compile because of line 6.
}

//B
