package org.fundacionjala.stringsearch;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * this class found words using wildcards
 */
public class SearchEngine {

    private static final int DEFAULT_VALUE_OF_ELSE = -1;

    public static int find(String once, String haystack) {
        String regex = "\\Q" + once.replaceAll("_", "\\\\E.\\\\Q") + "\\E";
        Matcher matcher = Pattern.compile(regex).matcher(haystack);
        return matcher.find() ? matcher.start() : DEFAULT_VALUE_OF_ELSE;
    }

}
