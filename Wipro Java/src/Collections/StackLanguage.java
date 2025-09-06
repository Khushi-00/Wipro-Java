package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class StackLanguage {

	public static void main(String[] args) {
		Stack<String> languages = new Stack<>();

        languages.push("French");
        languages.push("German");
        languages.push("Japanese");
        languages.push("Sanskrit");
        
        System.out.println("First Stack: " + languages);
        System.out.println("Top of the stack (peek): " + languages.peek());
        System.out.println("Popped element: " + languages.pop());
        System.out.println("Is the stack empty? " + languages.empty());
        System.out.println("Final Stack: " + languages);
        
        //Inherited from Vector
        
        System.out.println("First element: " + languages.firstElement());

        int index = languages.indexOf("French");
        System.out.println("Index of 'French': " + index);
        System.out.println("Capacity of stack: " + languages.capacity());
        List<String> moreLanguages = new ArrayList<>();
        moreLanguages.add("Korean");
        moreLanguages.add("Hindi");

        languages.addAll(moreLanguages);
        System.out.println("Stack after addAll: " + languages);

	}

}
