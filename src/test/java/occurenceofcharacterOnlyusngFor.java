 
import java.util.*;

class occurenceofcharacterOnlyusngFor {
    public static void main(String args[]) {
        char a[] = {'a', 't', 'q', 't', 'b', 'p', 'a'};
        
        // Array to keep track of counted characters
        char counted[] = new char[a.length];
        int countedIndex = 0;
        
        for (int i = 0; i < a.length; i++) {
            char ch = a[i];

            // Check if this character is already counted
            boolean alreadyCounted = false;
            for (int k = 0; k < countedIndex; k++) {
                if (counted[k] == ch) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) continue;

            // Count occurrences manually
            int count = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[j] == ch) {
                    count++;
                }
            }
            
            // Store the counted character in array
            counted[countedIndex++] = ch;
            
            // Print result
            System.out.println(ch + "==" + count);
        }
    }
}
