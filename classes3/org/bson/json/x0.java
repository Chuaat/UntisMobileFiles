// 
// Decompiled by Procyon v0.5.36
// 

package org.bson.json;

import e7.a;

public final class x0
{
    private final boolean a;
    private final String b;
    private final String c;
    private final int d;
    
    private x0(final b b) {
        this.a = b.a;
        String b2;
        if (b.b != null) {
            b2 = b.b;
        }
        else {
            b2 = System.getProperty("line.separator");
        }
        this.b = b2;
        this.c = b.c;
        this.d = b.d;
    }
    
    public static b a() {
        return new b();
    }
    
    public String b() {
        return this.c;
    }
    
    public int c() {
        return this.d;
    }
    
    public String d() {
        return this.b;
    }
    
    public boolean e() {
        return this.a;
    }
    
    public static final class b
    {
        private boolean a;
        private String b;
        private String c;
        private int d;
        
        private b() {
            this.b = System.getProperty("line.separator");
            this.c = "  ";
        }
        
        public x0 e() {
            return new x0(this, null);
        }
        
        public b f(final boolean a) {
            this.a = a;
            return this;
        }
        
        public b g(final String c) {
            e7.a.e("indentCharacters", c);
            this.c = c;
            return this;
        }
        
        public b h(final int d) {
            this.d = d;
            return this;
        }
        
        public b i(final String b) {
            e7.a.e("newLineCharacters", b);
            this.b = b;
            return this;
        }
    }
}
