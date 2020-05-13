package chapter_1;

//Suppose we have a class named Task_19. Which of the following statements are true?
//            (Choose all that apply)
public class Task_19 {

    public static void main(String[] args) {
        Task_19 one = new Task_19();    //3
        Task_19 two = new Task_19();    //4
        Task_19 three = one;            //5
        one = null;                     //6
        Task_19 four = one;             //7
        three = null;                   //8
        two = null;                     //9
        two = new Task_19();            //10
        System.gc();                    //11
    }

//    A. The Rabbit object from line 3 is first eligible for garbage collection immediately
//    following line 6.
//    B. The Rabbit object from line 3 is first eligible for garbage collection immediately
//    following line 8.
//    C. The Rabbit object from line 3 is first eligible for garbage collection immediately
//    following line 12.
//    D. The Rabbit object from line 4 is first eligible for garbage collection immediately
//    following line 9.
//    E. The Rabbit object from line 4 is first eligible for garbage collection immediately
//    following line 11.
//    F. The Rabbit object from line 4 is first eligible for garbage collection immediately
//    following line 12.
}

//B, D