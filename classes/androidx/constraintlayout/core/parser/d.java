// 
// Decompiled by Procyon v0.5.36
// 

package androidx.constraintlayout.core.parser;

import java.util.ArrayList;

public class d extends b
{
    private static ArrayList<String> O;
    
    static {
        (d.O = new ArrayList<String>()).add("ConstraintSets");
        d.O.add("Variables");
        d.O.add("Generate");
        d.O.add("Transitions");
        d.O.add("KeyFrames");
        d.O.add("KeyAttributes");
        d.O.add("KeyPositions");
        d.O.add("KeyCycles");
    }
    
    public d(final char[] array) {
        super(array);
    }
    
    public static c D(final char[] array) {
        return new d(array);
    }
    
    public static c j0(final String s, final c c) {
        final d d = new d(s.toCharArray());
        d.z(0L);
        d.w(s.length() - 1);
        d.m0(c);
        return d;
    }
    
    @Override
    protected String A(final int n, int n2) {
        final StringBuilder sb = new StringBuilder(this.i());
        this.b(sb, n);
        final String f = this.f();
        if (super.N.size() > 0) {
            sb.append(f);
            sb.append(": ");
            if (d.O.contains(f)) {
                n2 = 3;
            }
            if (n2 <= 0) {
                final String b = super.N.get(0).B();
                if (b.length() + n < c.L) {
                    sb.append(b);
                    return sb.toString();
                }
            }
            sb.append(super.N.get(0).A(n, n2 - 1));
            return sb.toString();
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(f);
        sb2.append(": <> ");
        return sb2.toString();
    }
    
    @Override
    protected String B() {
        StringBuilder sb;
        String b;
        if (super.N.size() > 0) {
            sb = new StringBuilder();
            sb.append(this.i());
            sb.append(this.f());
            sb.append(": ");
            b = super.N.get(0).B();
        }
        else {
            sb = new StringBuilder();
            sb.append(this.i());
            sb.append(this.f());
            b = ": <> ";
        }
        sb.append(b);
        return sb.toString();
    }
    
    public String k0() {
        return this.f();
    }
    
    public c l0() {
        if (super.N.size() > 0) {
            return super.N.get(0);
        }
        return null;
    }
    
    public void m0(final c c) {
        if (super.N.size() > 0) {
            super.N.set(0, c);
        }
        else {
            super.N.add(c);
        }
    }
}
