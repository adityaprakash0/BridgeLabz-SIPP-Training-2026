public class CallStack {

    static class Frame {
        String functionName;
        Frame next;

        Frame(String functionName) {
            this.functionName = functionName;
            this.next = null;
        }
    }

    private Frame top = null;

    public void push(String functionName) {
        Frame newFrame = new Frame(functionName);
        newFrame.next = top;
        top = newFrame;
    }

    public String pop() {
        if (isEmpty()) {
            return "No active call to return from";
        }

        String name = top.functionName;
        top = top.next;
        return name;
    }

    public String peek() {
        if (isEmpty()) {
            return "Call Stack is Empty";
        }

        return top.functionName;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Call Stack is Empty");
            return;
        }

        System.out.println("Current Call Stack:");
        Frame temp = top;
        while (temp != null) {
            System.out.println(temp.functionName);
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        CallStack stack = new CallStack();

        stack.push("main()");
        stack.push("login()");
        stack.push("validateUser()");
        stack.push("checkPassword()");

        stack.display();

        System.out.println("\nCurrent Function: " + stack.peek());

        System.out.println("\nFunction Returned: " + stack.pop());
        System.out.println("Function Returned: " + stack.pop());

        System.out.println("\nAfter Returning:");
        stack.display();
    }
}
