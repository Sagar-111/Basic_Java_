package ch.d_Introducing_Classes;

public class Stack {

	int[] stck = new int[10];
	int tos;

//	Initialize top of stack.
	Stack() {
		tos = -1;
	}

//	Push item to the stack.
	void push(int item) {
		if (tos == 9) {
			System.out.println("Stack is full.");
		} else {
			stck[++tos] = item;
		}
	}

//	Pop an item from the stack.
	int pop() {
		if (tos < 0) {
			System.out.println("Stack underflow.");
			return 0;
		} else {
			return stck[tos--];
		}

	}

}
