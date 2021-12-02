// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.cli;

import java.util.Iterator;
import java.util.List;

public class i extends o
{
    private List G;
    
    public i(final String s) {
        super(s);
    }
    
    public i(final List g) {
        this(a(g));
        this.G = g;
    }
    
    private static String a(final List list) {
        final StringBuffer sb = new StringBuffer("Missing required option");
        String str;
        if (list.size() == 1) {
            str = "";
        }
        else {
            str = "s";
        }
        sb.append(str);
        sb.append(": ");
        final Iterator<Object> iterator = list.iterator();
        while (iterator.hasNext()) {
            sb.append(iterator.next());
            if (iterator.hasNext()) {
                sb.append(", ");
            }
        }
        return sb.toString();
    }
    
    public List b() {
        return this.G;
    }
}
