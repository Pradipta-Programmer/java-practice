class Register {
    String[] stud;  // Array to store student names
    int cap;         // Maximum capacity of the array
    int top;         // Index pointing to the topmost position in the register

    // Constructor to initialize the register
    public Register(int max) {
        cap = max;
        top = -1;  // Initialize top to -1 (indicating that the register is empty)
        stud = new String[cap];  // Create the string array with size 'cap'
    }

    // Method to add a student's name to the top of the register (stack operation)
    void push(String n) {
        if (top == cap - 1) {
            // If the register is full (overflow condition)
            System.out.println("OVERFLOW");
        } else {
            top++;  // Increment top to add at the next available position
            stud[top] = n;  // Add the student's name to the array at the top position
        }
    }

    // Method to remove and return the name from the top of the register
    String pop() {
        if (top == -1) {
            // If the register is empty (underflow condition)
            return "$$";
        } else {
            String name = stud[top];  // Store the name to return
            top--;  // Decrement top to remove the topmost name
            return name;  // Return the removed name
        }
    }

    // Method to display all the names in the register
    void display() {
        if (top == -1) {
            // If the register is empty, display a message
            System.out.println("Register is empty.");
        } else {
            System.out.println("Names in the register:");
            for (int i = 0; i <= top; i++) {
                System.out.println(stud[i]);  // Print each name in the register
            }
        }
    }
}
