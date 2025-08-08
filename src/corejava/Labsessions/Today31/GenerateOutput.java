package corejava.Labsessions.Today31;

public class GenerateOutput {

	public static void main(String[] args) {
		String input = "a2b3c4";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i += 2) {
            char ch = input.charAt(i);             
            int count = Character.getNumericValue(input.charAt(i + 1));  
           
            for (int j = 0; j < count; j++) {
                output.append(ch);
            }
        }

        System.out.println(output.toString());  
    }

}
