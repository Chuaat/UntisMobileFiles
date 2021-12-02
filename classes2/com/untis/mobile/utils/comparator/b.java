// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.comparator;

import com.untis.mobile.persistence.models.Displayable;
import androidx.annotation.j0;
import java.util.Comparator;

public class b implements Comparator<String>
{
    @j0
    public static final b G;
    
    static {
        G = new b();
    }
    
    @j0
    public static String d(@j0 final String s) {
        return s.replace("\u00e4", "ae").replace("\u00f6", "oe").replace("\u00fc", "ue").replace("\u00c4", "Ae").replace("\u00d6", "Oe").replace("\u00dc", "Ue").replace("\u00df", "sz");
    }
    
    public int a(@j0 final Displayable displayable, @j0 final Displayable displayable2) {
        return this.b(displayable.getDisplayableTitle(), displayable2.getDisplayableTitle());
    }
    
    public int b(@j0 final String s, @j0 final String s2) {
        return a.G.b(d(s), d(s2));
    }
    
    public int c(@j0 final String s, @j0 final String s2) {
        return d(s).compareToIgnoreCase(d(s2));
    }
}
