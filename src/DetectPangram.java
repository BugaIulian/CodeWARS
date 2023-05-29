public class DetectPangram {

    public static void main(String[] args) {
        boolean check = check("The quick brown fox jumps over the lazy dog.");
    }

    private static boolean check(String s) {
    String regex = "^(?=.*[aA])(?=.*[bB])(?=.*[cC])(?=.*[dD])(?=.*[eE])(?=.*[fF])(?=.*[gG])(?=.*[hH])(?=.*[iI])(?=.*[jJ])(?=.*[kK])(?=.*[lL])(?=.*[mM])(?=.*[nN])(?=.*[oO])(?=.*[pP])(?=.*[qQ])(?=.*[rR])(?=.*[sS])(?=.*[tT])(?=.*[uU])(?=.*[vV])(?=.*[wW])(?=.*[xX])(?=.*[yY])(?=.*[zZ]).*$";

        return s.matches(regex);
    }
}
