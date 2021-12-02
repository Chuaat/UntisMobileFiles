// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public interface q
{
    public static final q f = new v();
    public static final q g = new o();
    public static final q h = new h("continue");
    public static final q i = new h("break");
    public static final q j = new h("return");
    public static final q k = new g(Boolean.TRUE);
    public static final q l = new g(Boolean.FALSE);
    public static final q m = new u("");
    
    q c();
    
    Double g();
    
    q i(final String p0, final g5 p1, final List<q> p2);
    
    String k();
    
    Boolean m();
    
    Iterator<q> p();
}
