// 
// Decompiled by Procyon v0.5.36
// 

package io.realm;

import java.util.Locale;
import c6.h;

public interface y
{
    a[] a();
    
    a[] b();
    
    a[] c();
    
    @h
    Throwable d();
    
    int[] e();
    
    int[] f();
    
    int[] g();
    
    b getState();
    
    public static class a
    {
        public final int a;
        public final int b;
        
        public a(final int a, final int b) {
            this.a = a;
            this.b = b;
        }
        
        @Override
        public String toString() {
            return String.format(Locale.ENGLISH, "startIndex: %d, length: %d", this.a, this.b);
        }
    }
    
    public enum b
    {
        G, 
        H, 
        I;
    }
}
