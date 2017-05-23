final class Acronym {
    private String acronym;

    Acronym(String phrase) {
        String acronym = "";

        for(int i=1; i<phrase.length()-1; i++) {
            String substring = phrase.substring(i, i + 1);
            String substringBefore = phrase.substring(i - 1, i);

            if(substring.equals(" ") || substring.equals("-")) {
                //If is ' ' or '-': convert next char to upper case and skip next char
                acronym += phrase.substring(i+1, i+2).toUpperCase();
                i = i+1;
                continue;
            }

            if(substring.toLowerCase().equals(substring.toUpperCase())) {
                //If is a punctuation mark (, ; : ...), skip
                continue;
            }

            if(substring.toUpperCase().equals(substring) && substringBefore.toLowerCase().equals(substringBefore)) {
                //If is an upper case and the char before is a lower case: convert next char to upper case
                acronym += substring;
            }
        }

        this.acronym = phrase.substring(0, 1).toUpperCase() + acronym;
    }

    String get() {
        return acronym;
    }

}
