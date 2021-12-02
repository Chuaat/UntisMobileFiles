// 
// Decompiled by Procyon v0.5.36
// 

package com.getkeepsafe.relinker.elf;

import java.io.IOException;

public interface c
{
    public abstract static class a
    {
        public static final int c = 0;
        public static final int d = 1;
        public static final int e = 5;
        public long a;
        public long b;
    }
    
    public abstract static class b
    {
        public static final int j = 1;
        public static final int k = 2;
        public static final int l = 2;
        public boolean a;
        public int b;
        public long c;
        public long d;
        public int e;
        public int f;
        public int g;
        public int h;
        public int i;
        
        public abstract a a(final long p0, final int p1) throws IOException;
        
        public abstract c b(final long p0) throws IOException;
        
        public abstract d c(final int p0) throws IOException;
    }
    
    public abstract static class c
    {
        public static final int e = 1;
        public static final int f = 2;
        public long a;
        public long b;
        public long c;
        public long d;
    }
    
    public abstract static class d
    {
        public long a;
    }
}
