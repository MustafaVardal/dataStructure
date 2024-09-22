package util;


public class Stack {


    private static final int INITIAL_SIZE = 10;


    private int top;
    private int[] s;

    public Stack() {
        this.s = new int[INITIAL_SIZE];
        this.top = -1; // First index value 0 that's why we take -1

    }

    public boolean isEmpty() {

        /*if (this.top == -1){
            return true;
        } else {
            return false;
        }*/ // Same thing because it will return same result with induction we can understand.
        return this.top == -1;
    }

    public void push(int x) {
        this.top++;

        if (this.top == this.s.length) {
            // Need to expand the array size.
            int[] newS = new int[this.s.length * 2];
            System.arraycopy(this.s, 0, newS, 0, this.s.length);

            this.s = newS;
        }
        this.s[this.top] = x;
    }

    public int pop(){
        if (this.isEmpty()){
            throw new IllegalStateException("Stack is empty, can not pop.");
        } else {
            this.top--;
            return this.s[this.top+1];
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(5);
        stack.push(6);
        stack.push(7);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
