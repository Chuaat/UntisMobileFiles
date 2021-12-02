// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec;

import java.util.Comparator;

public class l implements Comparator
{
    private final k G;
    
    @Deprecated
    public l() {
        this.G = null;
    }
    
    public l(final k g) {
        this.G = g;
    }
    
    @Override
    public int compare(final Object o, final Object o2) {
        int compareTo;
        try {
            compareTo = ((Comparable)this.G.a(o)).compareTo(this.G.a(o2));
        }
        catch (h h) {
            compareTo = 0;
        }
        return compareTo;
    }
}
