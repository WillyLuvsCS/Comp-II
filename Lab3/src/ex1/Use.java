package ex1;

public class Use {

    /**
     * Returns a new array where every occurrence of tab[j] in tabIn
     * is replaced by tabOut[j]. If the inputs are invalid, returns null.
     */

    public static String[] replace(String[] tabIn, String[] tab, String[] tabOut) {

        // Default return value: null means "invalid input" or "failed checks"
        String[] out = null;

        // We use ok to track whether all validation rules pass
        boolean ok = true;

        // -------------------------
        // 1) Validate the inputs
        // -------------------------

        // Rule 1: none of the arrays can be null
        if (tabIn == null || tab == null || tabOut == null) {
            ok = false;
        } else {

            // Rule 2: no element inside tabIn can be null
            // (we stop early if ok becomes false)
            for (int i = 0; ok && i < tabIn.length; i++) {
                if (tabIn[i] == null) {
                    ok = false;
                }
            }

            // Only continue validation if tabIn was valid
            if (ok) {

                // Rule 3: tab and tabOut must have the same length
                if (tab.length != tabOut.length) {
                    ok = false;
                } else {

                    // Rule 4: no element inside tab or tabOut can be null
                    for (int i = 0; ok && i < tab.length; i++) {
                        if (tab[i] == null || tabOut[i] == null) {
                            ok = false;
                        }
                    }
                }
            }
        }

        // if Null checks make something false

        // -------------------------
        // 2) Do the replacement
        // -------------------------
        if (ok) {

            // Create output array same length as tabIn
            out = new String[tabIn.length];

            // For each element in tabIn...
            for (int i = 0; i < tabIn.length; i++) {

                boolean found = false;

                // Search for tabIn[i] inside tab[]
                // Stop early if found becomes true
                for (int j = 0; !found && j < tab.length; j++) {

                    // Use .equals() for String content comparison
                    if (tabIn[i].equals(tab[j])) {

                        // Replace with the matching element from tabOut
                        out[i] = tabOut[j];
                        found = true;
                    }
                }

                // If no match was found in tab[], keep the original word
                if (!found) {
                    out[i] = tabIn[i];
                }
            }
        }

        // Return the result (null if invalid inputs)
        return out;
    }
}
