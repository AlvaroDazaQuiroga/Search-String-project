package org.fundacionjala.stringsearch;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Test for {@Link SearchEngine}
 */
public class WildsTest {
    private String haystack = "Once upon a midnight dreary, while I pondered, weak and weary";

    @Test
    public void normalSearchTest() {
        assertEquals(0, SearchEngine.find("Once", haystack));
        assertEquals(12, SearchEngine.find("midnight", haystack));
        assertEquals(-1, SearchEngine.find("codewars", haystack));
        assertEquals(0, SearchEngine.find("", haystack));
    }

    @Test
    public void wildSearchTest() {
        assertEquals(5, SearchEngine.find("_po_", haystack));
        assertEquals(12, SearchEngine.find("___night", haystack));
        assertEquals(21, SearchEngine.find("_r_ar_", haystack));
    }

}
