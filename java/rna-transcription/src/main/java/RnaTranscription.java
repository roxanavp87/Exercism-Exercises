public class RnaTranscription {
    public String transcribe(String dnaStrand) {

        char dna[] = dnaStrand.toCharArray();

        for(int i=0; i<dna.length; i++) {
            switch (dna[i]) {
                case 'C':
                    dna[i] = 'G';
                    break;
                case 'G':
                    dna[i] = 'C';
                    break;
                case 'A':
                    dna[i] = 'T';
                    break;
                case 'U':
                    dna[i] = 'A';
            }
        }
        return new String(dna);
    }
}