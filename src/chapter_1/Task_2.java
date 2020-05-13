package chapter_1;

//What is the output of the following program?
//Empty = false, Brand = null

public class Task_2 {

    private String brand;
    private boolean empty;

    public static void main(String[] args) {
        Task_2 wb = new Task_2();
        System.out.print("Empty = " + wb.empty);
        System.out.print(", Brand = " + wb.brand);
    }
}

//D