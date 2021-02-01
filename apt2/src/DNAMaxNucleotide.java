public class DNAMaxNucleotide {
    public int count(String strand, String nuc) {
        return strand.length() - strand.replace(nuc, "").length();
    }

    public String max(String[] strands, String nuc) {
        // fill in code here
        int MaxStrLen = 1;
        String ReturnString = "";
        for (String strand : strands) {
            if (count(strand, nuc) > MaxStrLen) {
                MaxStrLen = count(strand, nuc);
                ReturnString = strand;
            }
            else if ((count(strand, nuc) == MaxStrLen) && (strand.length() > ReturnString.length())) {
                MaxStrLen = count(strand, nuc);
                ReturnString = strand;
            }
        }
        return ReturnString;
    }
}
