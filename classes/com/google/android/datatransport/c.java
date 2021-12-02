// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport;

import androidx.annotation.k0;
import java.util.Objects;
import androidx.annotation.j0;

public final class c
{
    private final String a;
    
    private c(@j0 final String s) {
        Objects.requireNonNull(s, "name is null");
        this.a = s;
    }
    
    public static c b(@j0 final String s) {
        return new c(s);
    }
    
    public String a() {
        return this.a;
    }
    
    @Override
    public boolean equals(@k0 final Object o) {
        return this == o || (o instanceof c && this.a.equals(((c)o).a));
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @j0
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Encoding{name=\"");
        sb.append(this.a);
        sb.append("\"}");
        return sb.toString();
    }
}
