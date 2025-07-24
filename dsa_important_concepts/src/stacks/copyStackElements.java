package stacks;

import java.util.Scanner;
import java.util.Stack;

public class copyStackElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        System.out.print("Enter no of elements : ");
        int n = sc.nextInt();
        // run a loop
        for (int i = 1; i <= n; i++) {
            int x = sc.nextInt();
            stack.push(x);
        }
        System.out.print("Normal stack : ");
        System.out.println(stack);

        // printing the stack in reverse order
        Stack<Integer> rt = new Stack<>();
        while (!stack.isEmpty()){
            rt.push(stack.pop());
        }

        System.out.println(rt);
        Stack<Integer> res = new Stack<>();
        while (!rt.isEmpty()){
            res.push(rt.pop());
        }
        System.out.print("res stack : ");
        System.out.println(res);
    }
}
