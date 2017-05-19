public class PangramChecker {

    public boolean isPangram(String input) {
        input = input.toLowerCase();
        char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
        int counter = alphabet.length;

        for(int i=0; i<alphabet.length; i++) {
            if(input.indexOf(alphabet[i]) != -1) {
                counter--;
            }
        }

        return (counter == 0);
    }

}
