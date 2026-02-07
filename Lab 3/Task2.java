
class Stack {

    public int tos;
    public int [] stack;

    // constructor
    Stack() {
        tos = -1;
        stack = new int[10];
    }


    //methods
    public void push(int value) {
        tos++;
        stack[tos] = value;
    }

    public int pop() {
        stack[tos] = 0;
        return stack[--tos];
    }

    public void displayStack() {
        System.out.print("TOS: " + tos + "---------- ");
        for(int i = 0; i < stack.length; i++) {
            System.out.print(stack[i] + "|" );
        }
        System.out.println("");
    }
}

public class Task2 {
    public static void main(String[] a) {

        Stack s1 = new Stack();

        s1.push(333);
        s1.push(111);
        s1.push(555);


        System.out.println("---------------------------- BEFORE POP ----------------------------");

        s1.displayStack();


        s1.pop();
        s1.pop();

        System.out.println("---------------------------- AFTER POP ----------------------------");

        s1.displayStack();



    }
}
