import java.util.*;
import java.lang.*;
import java.io.*;

public class test3 {

    public static boolean isBalanced(String input2) {
        if (input2.length() % 2 != 0) {
            return false; // Jika panjang string ganjil, tidak mungkin seimbang
        }

        Stack<Character> stack = new Stack<>();
        for (char bracket : input2.toCharArray()) {
            if (bracket == '(' || bracket == '[' || bracket == '{') {
                stack.push(bracket); // Tanda kurung buka, tambahkan ke stack
            } else {
                if (stack.isEmpty()) {
                    return false; // Tanda kurung tutup tanpa tanda kurung buka yang sesuai sebelumnya
                }
                char top = stack.pop();
                if ((bracket == ')' && top != '(')
                        || (bracket == ']' && top != '[')
                        || (bracket == '}' && top != '{')) {
                    return false; // Tanda kurung tutup tidak sesuai dengan tanda kurung buka yang ada di stack
                }
            }
        }

        return stack.isEmpty(); // Stack harus kosong pada akhirnya agar dianggap seimbang
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String input2;
        System.out.print("Input: ");
        input2 = input.next();

        System.out.print("Output: ");
        if (isBalanced(input2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}