package chapter_1;

public class Task_21 {

    int count;

    public void Task_21() {
        count = 4;
    }

    public static void main(String[] args) {
        Task_21 s = new Task_21();
        System.out.println(s.count);
    }

//    A. 0
//    B. 4
//    C. Compilation fails on line 3.
//    D. Compilation fails on line 4.
//    E. Compilation fails on line 7.
//    F. Compilation fails on line 8.
}

//A, because -public void Task_21- not constructor