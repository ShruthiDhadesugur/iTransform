package com.basicassignment;

public class Question9 {

	int size;
	int arr[];
	int top;
 
	Question9(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
	}
 
	public void push(int pushedElement) {
		if (!isFull()) {
			top++;
			arr[top] = pushedElement;
			System.out.println("Pushed element:" + pushedElement);
		} else {
			System.out.println("Stack is full !");
		}
	}
 
	public int pop() {
		if (!isEmpty()) {
			int returnedTop = top;
			top--;
			System.out.println("Popped element :" + arr[returnedTop]);
			return arr[returnedTop];
 
		} else {
			System.out.println("Stack is empty !");
			return -1;
		}
	}
 
	public int peek() {
		if(!this.isEmpty())
                        return arr[top];
	                {
                        System.out.println("Stack is Empty");
                        return -1;
                }
	}
 
	public boolean isEmpty() {
		return (top == -1);
	}
 
	public boolean isFull() {
		return (size - 1 == top);
	}
 
	public static void main(String[] args) {
		Question9 sa = new Question9(10);
		sa.pop();
		System.out.println("Pushed elements");
		sa.push(78);
		sa.push(54);
		sa.push(78);
		sa.push(55);
		System.out.println("Popped elements");
		sa.pop();
		sa.pop();
		sa.pop();
		

	}

}
