package chapter_2;

//What is the output of the following code snippet?
public class Task_8 {

    public static void main(String[] args) {
        boolean x = true, z = true;
        int y = 20;
        x = (y != 10) ^ (z=false);
        System.out.println(x+", "+y+", "+z);
    }

//    A. true, 10, true
//    B. true, 20, false
//    C. false, 20, true
//    D. false, 20, false
//    E. false, 20, true
//    F. The code will not compile because of line 5.
}

//B
