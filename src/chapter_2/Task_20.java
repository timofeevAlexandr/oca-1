package chapter_2;

//What is the result of the following code snippet?
public class Task_20 {

    public static void main(String[] args) {
        final char a = 'A', d = 'D';
        char grade = 'B';
        switch (grade) {
            case a:
            case 'B':
                System.out.print("great");
            case 'C':
                System.out.print("good");
                break;
            case d:
            case 'F':
                System.out.print("not good");
        }
    }

//    A. great
//    B. greatgood
//    C. The code will not compile because of line 3.
//    D. The code will not compile because of line 6.
//    E. The code will not compile because of lines 6 and 9.
}

//B
