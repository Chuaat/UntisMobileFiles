// 
// Decompiled by Procyon v0.5.36
// 

package com.amulyakhare.textdrawable.util;

import java.util.Arrays;
import java.util.Random;
import java.util.List;

public class a
{
    public static a c;
    public static a d;
    private final List<Integer> a;
    private final Random b;
    
    static {
        a.c = a(Arrays.asList(-957596, -686759, -416706, -1784274, -9977996, -10902850, -14642227, -5414233, -8366207));
        a.d = a(Arrays.asList(-1739917, -1023342, -4560696, -6982195, -8812853, -10177034, -11549705, -11677471, -11684180, -8271996, -5319295, -30107, -2825897, -10929, -18611, -6190977, -7297874));
    }
    
    private a(final List<Integer> a) {
        this.a = a;
        this.b = new Random(System.currentTimeMillis());
    }
    
    public static a a(final List<Integer> list) {
        return new a(list);
    }
    
    public int b(final Object o) {
        return this.a.get(Math.abs(o.hashCode()) % this.a.size());
    }
    
    public int c() {
        final List<Integer> a = this.a;
        return a.get(this.b.nextInt(a.size()));
    }
}
