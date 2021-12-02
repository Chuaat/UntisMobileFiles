// 
// Decompiled by Procyon v0.5.36
// 

package org.apache.commons.codec.language.bm;

import org.apache.commons.codec.k;

public class a implements k
{
    private e a;
    
    public a() {
        this.a = new e(d.I, h.H, true);
    }
    
    @Override
    public Object a(final Object o) throws org.apache.commons.codec.h {
        if (o instanceof String) {
            return this.d((String)o);
        }
        throw new org.apache.commons.codec.h("BeiderMorseEncoder encode parameter is not of type String");
    }
    
    public d b() {
        return this.a.f();
    }
    
    public h c() {
        return this.a.g();
    }
    
    @Override
    public String d(final String s) throws org.apache.commons.codec.h {
        if (s == null) {
            return null;
        }
        return this.a.b(s);
    }
    
    public boolean f() {
        return this.a.h();
    }
    
    public void g(final boolean b) {
        this.a = new e(this.a.f(), this.a.g(), b, this.a.e());
    }
    
    public void h(final int n) {
        this.a = new e(this.a.f(), this.a.g(), this.a.h(), n);
    }
    
    public void i(final d d) {
        this.a = new e(d, this.a.g(), this.a.h(), this.a.e());
    }
    
    public void j(final h h) {
        this.a = new e(this.a.f(), h, this.a.h(), this.a.e());
    }
}
