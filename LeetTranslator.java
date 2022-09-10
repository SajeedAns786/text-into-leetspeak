import java.util.*;

/**
 * LeetTranslator translates text into leetspeak
 */
public class LeetTranslator {
    public static void main(String[] args) {
        // Create the mapping between normal characters and leet speak
        Map<Character, Character> leetMap = new HashMap<Character, Character>();
        leetMap.put('a', '@');
        leetMap.put('b', '8');
        leetMap.put('c', '[');
        leetMap.put('d', ')');
        leetMap.put('e', '3');
        leetMap.put('f', '|');
        leetMap.put('g', '9');
        leetMap.put('h', '#');
        leetMap.put('i', '1');
        leetMap.put('j', ';');
        leetMap.put('k', '|');
        leetMap.put('l', '7');
        leetMap.put('m', '3');
        leetMap.put('n', '^');
        leetMap.put('o', '0');
        leetMap.put('p', '9');
        leetMap.put('q', '9');
        leetMap.put('r', 'Я');
        leetMap.put('s', '2');
        leetMap.put('t', '+');
        leetMap.put('u', 'µ');
        leetMap.put('v', 'V');
        leetMap.put('w', 'Ш');
        leetMap.put('x', '×');
        leetMap.put('y', '¥');
        leetMap.put('z', '%');

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter text to translate: ");
        String normalInput = scan.nextLine();
        String output = normalInput;
        Iterator leetIterator = leetMap.keySet().iterator();
        while (leetIterator.hasNext()) {
            Character key = (Character) leetIterator.next();
            output = output.replace(key, leetMap.get(key));
        }

        System.out.println(output);
    }
}
