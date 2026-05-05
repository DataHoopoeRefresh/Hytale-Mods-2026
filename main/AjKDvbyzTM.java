import java.util.HashMap;
import java.util.Map;
import java.util.Set;
public class StringUtility {
public static Map<Character, Integer> countCharacters(String input) {
Map<Character, Integer> charCount = new HashMap<>();
for (char c : input.toCharArray()) {
charCount.put(c, charCount.getOrDefault(c, 0) + 1);
}
return charCount;
}
public static String reverseString(String input) {
StringBuilder reversed = new StringBuilder();
for (int i = input.length() - 1; i >= 0; i--) {
reversed.append(input.charAt(i));
}
return reversed.toString();
}
public static String toUpperCase(String input) {
return input.toUpperCase();
}
public static String toLowerCase(String input) {
return input.toLowerCase();
}
public static Set<Character> getUniqueCharacters(String input) {
return countCharacters(input).keySet();
}
public static void main(String[] args) {
String sample = "Hello World!";
System.out.println("Original: " + sample);
System.out.println("Reversed: " + reverseString(sample));
System.out.println("Uppercase: " + toUpperCase(sample));
System.out.println("Lowercase: " + toLowerCase(sample));
System.out.println("Unique Characters: " + getUniqueCharacters(sample));
}
}
