// 
// Decompiled by Procyon v0.5.36
// 

package org.joda.time.format;

public class k
{
    private static q a;
    private static q b;
    private static q c;
    private static q d;
    private static q e;
    
    protected k() {
    }
    
    public static q a() {
        if (k.b == null) {
            k.b = new r().i("P").L().K(4).F().K(2).m().e().y("T").h().l().t().R();
        }
        return k.b;
    }
    
    public static q b() {
        if (k.c == null) {
            k.c = new r().i("P").L().K(4).F().u("-").K(2).m().u("-").e().y("T").h().u(":").l().u(":").t().R();
        }
        return k.c;
    }
    
    public static q c() {
        if (k.e == null) {
            k.e = new r().i("P").L().K(4).F().u("-").K(2).n("W").E().u("-").e().y("T").h().u(":").l().u(":").t().R();
        }
        return k.e;
    }
    
    public static q d() {
        if (k.d == null) {
            k.d = new r().i("P").L().K(4).F().K(2).n("W").E().e().y("T").h().l().t().R();
        }
        return k.d;
    }
    
    public static q e() {
        if (k.a == null) {
            k.a = new r().i("P").F().A("Y").m().A("M").E().A("W").e().A("D").y("T").h().A("H").l().A("M").t().A("S").R();
        }
        return k.a;
    }
}
