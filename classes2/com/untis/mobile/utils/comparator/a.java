// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.comparator;

import androidx.annotation.k0;
import com.untis.mobile.persistence.models.Displayable;
import androidx.annotation.j0;
import java.util.Comparator;

public class a implements Comparator<String>
{
    @j0
    public static final a G;
    
    static {
        G = new a();
    }
    
    @j0
    private String c(@j0 final String s, final int n, int i) {
        final StringBuilder sb = new StringBuilder();
        final char char1 = s.charAt(i);
        sb.append(char1);
        int j = ++i;
        if (this.d(char1)) {
            while (j < n) {
                final char char2 = s.charAt(j);
                if (!this.d(char2)) {
                    break;
                }
                sb.append(char2);
                ++j;
            }
        }
        else {
            while (i < n) {
                final char char3 = s.charAt(i);
                if (this.d(char3)) {
                    break;
                }
                sb.append(char3);
                ++i;
            }
        }
        return sb.toString();
    }
    
    private boolean d(final char c) {
        return c >= '0' && c <= '9';
    }
    
    public int a(@k0 final Displayable displayable, @k0 final Displayable displayable2) {
        String displayableTitle = "";
        String displayableTitle2;
        if (displayable != null) {
            displayableTitle2 = displayable.getDisplayableTitle();
        }
        else {
            displayableTitle2 = "";
        }
        if (displayable2 != null) {
            displayableTitle = displayable2.getDisplayableTitle();
        }
        return this.b(displayableTitle2, displayableTitle);
    }
    
    public int b(@k0 String lowerCase, @k0 String lowerCase2) {
        if (lowerCase != null && lowerCase2 != null) {
            lowerCase = lowerCase.toLowerCase();
            lowerCase2 = lowerCase2.toLowerCase();
            final int length = lowerCase.length();
            final int length2 = lowerCase2.length();
            int n = 0;
            int n2 = 0;
            while (n < length && n2 < length2) {
                final String c = this.c(lowerCase, length, n);
                final int n3 = n + c.length();
                final String c2 = this.c(lowerCase2, length2, n2);
                final int n4 = n2 + c2.length();
                int compareTo;
                if (this.d(c.charAt(0)) && this.d(c2.charAt(0))) {
                    final int length3 = c.length();
                    final int n5 = length3 - c2.length();
                    if ((compareTo = n5) == 0) {
                        int i = 0;
                        compareTo = n5;
                        while (i < length3) {
                            compareTo = c.charAt(i) - c2.charAt(i);
                            if (compareTo != 0) {
                                return compareTo;
                            }
                            ++i;
                        }
                    }
                }
                else {
                    compareTo = c.compareTo(c2);
                }
                n = n3;
                n2 = n4;
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return length - length2;
        }
        return 0;
    }
}
