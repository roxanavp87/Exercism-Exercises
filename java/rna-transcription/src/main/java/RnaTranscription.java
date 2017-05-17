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
                case 'T':
                    dna[i] = 'A';
                    break;
                case 'A':
                    dna[i] = 'U';
            }
        }
        return new String(dna);
    }
}