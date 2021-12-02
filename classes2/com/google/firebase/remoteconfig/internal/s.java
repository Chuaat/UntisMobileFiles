// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.remoteconfig.internal;

import com.google.firebase.remoteconfig.l;

public class s implements com.google.firebase.remoteconfig.s
{
    private static final String c = "[Value: %s] cannot be converted to a %s.";
    private final String a;
    private final int b;
    
    s(final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    private String e() {
        return this.c().trim();
    }
    
    private void f() {
        if (this.a != null) {
            return;
        }
        throw new IllegalArgumentException("Value is null, and cannot be converted to the desired type.");
    }
    
    @Override
    public long a() {
        if (this.b == 0) {
            return 0L;
        }
        final String e = this.e();
        try {
            return Long.valueOf(e);
        }
        catch (NumberFormatException cause) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", e, "long"), cause);
        }
    }
    
    @Override
    public double b() {
        if (this.b == 0) {
            return 0.0;
        }
        final String e = this.e();
        try {
            return Double.valueOf(e);
        }
        catch (NumberFormatException cause) {
            throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", e, "double"), cause);
        }
    }
    
    @Override
    public String c() {
        if (this.b == 0) {
            return "";
        }
        this.f();
        return this.a;
    }
    
    @Override
    public boolean d() throws IllegalArgumentException {
        if (this.b == 0) {
            return false;
        }
        final String e = this.e();
        if (n.f.matcher(e).matches()) {
            return true;
        }
        if (n.g.matcher(e).matches()) {
            return false;
        }
        throw new IllegalArgumentException(String.format("[Value: %s] cannot be converted to a %s.", e, "boolean"));
    }
    
    @Override
    public int k() {
        return this.b;
    }
    
    @Override
    public byte[] l() {
        if (this.b == 0) {
            return l.p;
        }
        return this.a.getBytes(n.e);
    }
}
