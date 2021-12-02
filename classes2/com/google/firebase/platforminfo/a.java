// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.platforminfo;

import c6.g;
import java.util.Objects;

final class a extends f
{
    private final String a;
    private final String b;
    
    a(final String s, final String s2) {
        Objects.requireNonNull(s, "Null libraryName");
        this.a = s;
        Objects.requireNonNull(s2, "Null version");
        this.b = s2;
    }
    
    @g
    @Override
    public String b() {
        return this.a;
    }
    
    @g
    @Override
    public String c() {
        return this.b;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (o == this) {
            return true;
        }
        if (o instanceof f) {
            final f f = (f)o;
            if (!this.a.equals(f.b()) || !this.b.equals(f.c())) {
                b = false;
            }
            return b;
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return (this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("LibraryVersion{libraryName=");
        sb.append(this.a);
        sb.append(", version=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
