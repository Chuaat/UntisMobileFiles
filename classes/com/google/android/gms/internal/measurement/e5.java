// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.measurement;

import java.util.List;

public final class e5 extends j9<e5, d5> implements ta
{
    private static final e5 zze;
    private boolean zzA;
    private String zzB;
    private long zzC;
    private int zzD;
    private String zzE;
    private String zzF;
    private boolean zzG;
    private r9<q4> zzH;
    private String zzI;
    private int zzJ;
    private int zzK;
    private int zzL;
    private String zzM;
    private long zzN;
    private long zzO;
    private String zzP;
    private String zzQ;
    private int zzR;
    private String zzS;
    private i5 zzT;
    private p9 zzU;
    private long zzV;
    private long zzW;
    private String zzX;
    private String zzY;
    private int zzZ;
    private boolean zzaa;
    private String zzab;
    private boolean zzac;
    private a5 zzad;
    private int zzf;
    private int zzg;
    private int zzh;
    private r9<u4> zzi;
    private r9<o5> zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private String zzp;
    private String zzq;
    private String zzr;
    private String zzs;
    private int zzt;
    private String zzu;
    private String zzv;
    private String zzw;
    private long zzx;
    private long zzy;
    private String zzz;
    
    static {
        j9.n(e5.class, zze = new e5());
    }
    
    private e5() {
        this.zzi = j9.j();
        this.zzj = j9.j();
        this.zzp = "";
        this.zzq = "";
        this.zzr = "";
        this.zzs = "";
        this.zzu = "";
        this.zzv = "";
        this.zzw = "";
        this.zzz = "";
        this.zzB = "";
        this.zzE = "";
        this.zzF = "";
        this.zzH = j9.j();
        this.zzI = "";
        this.zzM = "";
        this.zzP = "";
        this.zzQ = "";
        this.zzS = "";
        this.zzU = j9.r();
        this.zzX = "";
        this.zzY = "";
        this.zzab = "";
    }
    
    public static d5 F1() {
        return ((j9<j9, f9>)e5.zze).o();
    }
    
    private final void Y0() {
        final r9<u4> zzi = this.zzi;
        if (!zzi.a()) {
            this.zzi = j9.k(zzi);
        }
    }
    
    private final void Z0() {
        final r9<o5> zzj = this.zzj;
        if (!zzj.a()) {
            this.zzj = j9.k(zzj);
        }
    }
    
    public final String A() {
        return this.zzP;
    }
    
    public final long A1() {
        return this.zzn;
    }
    
    public final String B() {
        return this.zzI;
    }
    
    public final long B1() {
        return this.zzl;
    }
    
    public final String C() {
        return this.zzX;
    }
    
    public final long C1() {
        return this.zzk;
    }
    
    public final String D() {
        return this.zzF;
    }
    
    public final long D1() {
        return this.zzy;
    }
    
    public final String E() {
        return this.zzE;
    }
    
    public final u4 E1(final int n) {
        return this.zzi.get(n);
    }
    
    public final String F() {
        return this.zzq;
    }
    
    public final String G() {
        return this.zzp;
    }
    
    public final String H() {
        return this.zzz;
    }
    
    public final o5 H1(final int n) {
        return this.zzj.get(n);
    }
    
    public final String I() {
        return this.zzs;
    }
    
    public final String I1() {
        return this.zzS;
    }
    
    public final List<q4> J() {
        return this.zzH;
    }
    
    public final String J1() {
        return this.zzv;
    }
    
    public final List<u4> K() {
        return this.zzi;
    }
    
    public final String K1() {
        return this.zzB;
    }
    
    public final List<o5> L() {
        return this.zzj;
    }
    
    public final int W() {
        return this.zzJ;
    }
    
    public final int X0() {
        return this.zzD;
    }
    
    public final boolean a1() {
        return (this.zzf & 0x80000) != 0x0;
    }
    
    public final boolean b1() {
        return (this.zzg & 0x10) != 0x0;
    }
    
    public final boolean c1() {
        return (this.zzf & 0x8) != 0x0;
    }
    
    public final boolean d1() {
        return (this.zzf & 0x4000) != 0x0;
    }
    
    public final boolean e1() {
        return (this.zzf & 0x20000) != 0x0;
    }
    
    public final boolean f1() {
        return (this.zzf & 0x20) != 0x0;
    }
    
    public final boolean g1() {
        return (this.zzf & 0x10) != 0x0;
    }
    
    public final boolean h1() {
        return (this.zzf & 0x1) != 0x0;
    }
    
    public final boolean i1() {
        return (this.zzg & 0x2) != 0x0;
    }
    
    public final boolean j1() {
        return (this.zzf & 0x800000) != 0x0;
    }
    
    public final boolean k1() {
        return (this.zzf & 0x4) != 0x0;
    }
    
    public final boolean l1() {
        return (this.zzf & 0x400) != 0x0;
    }
    
    public final boolean m1() {
        return (this.zzf & 0x2) != 0x0;
    }
    
    public final boolean n1() {
        return (this.zzf & 0x8000) != 0x0;
    }
    
    public final int o1() {
        return this.zzi.size();
    }
    
    public final int p1() {
        return this.zzh;
    }
    
    public final boolean q0() {
        return this.zzA;
    }
    
    public final int q1() {
        return this.zzR;
    }
    
    public final boolean r0() {
        return this.zzG;
    }
    
    public final int r1() {
        return this.zzt;
    }
    
    public final boolean s0() {
        return (this.zzf & 0x40000000) != 0x0;
    }
    
    public final int s1() {
        return this.zzj.size();
    }
    
    public final boolean t0() {
        return (this.zzf & 0x2000000) != 0x0;
    }
    
    public final long t1() {
        return this.zzO;
    }
    
    @Override
    protected final Object u(int n, final Object o, final Object o2) {
        if (--n == 0) {
            return 1;
        }
        if (n == 2) {
            return j9.m(e5.zze, "\u00011\u0000\u0002\u0001;1\u0000\u0004\u0000\u0001\u1004\u0000\u0002\u001b\u0003\u001b\u0004\u1002\u0001\u0005\u1002\u0002\u0006\u1002\u0003\u0007\u1002\u0005\b\u1008\u0006\t\u1008\u0007\n\u1008\b\u000b\u1008\t\f\u1004\n\r\u1008\u000b\u000e\u1008\f\u0010\u1008\r\u0011\u1002\u000e\u0012\u1002\u000f\u0013\u1008\u0010\u0014\u1007\u0011\u0015\u1008\u0012\u0016\u1002\u0013\u0017\u1004\u0014\u0018\u1008\u0015\u0019\u1008\u0016\u001a\u1002\u0004\u001c\u1007\u0017\u001d\u001b\u001e\u1008\u0018\u001f\u1004\u0019 \u1004\u001a!\u1004\u001b\"\u1008\u001c#\u1002\u001d$\u1002\u001e%\u1008\u001f&\u1008 '\u1004!)\u1008\",\u1009#-\u001d.\u1002$/\u1002%2\u1008&4\u1008'5\u100c(7\u1007)9\u1008*:\u1007+;\u1009,", new Object[] { "zzf", "zzg", "zzh", "zzi", u4.class, "zzj", o5.class, "zzk", "zzl", "zzm", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", "zzE", "zzF", "zzn", "zzG", "zzH", q4.class, "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", "zzZ", m4.a, "zzaa", "zzab", "zzac", "zzad" });
        }
        if (n == 3) {
            return new e5();
        }
        if (n == 4) {
            return new d5((l4)null);
        }
        if (n != 5) {
            return null;
        }
        return e5.zze;
    }
    
    public final boolean u0() {
        return (this.zzf & 0x100000) != 0x0;
    }
    
    public final long u1() {
        return this.zzN;
    }
    
    public final String v() {
        return this.zzu;
    }
    
    public final boolean v0() {
        return (this.zzf & 0x20000000) != 0x0;
    }
    
    public final long v1() {
        return this.zzC;
    }
    
    public final String w() {
        return this.zzw;
    }
    
    public final boolean w0() {
        return (this.zzg & 0x80) != 0x0;
    }
    
    public final long w1() {
        return this.zzV;
    }
    
    public final String x() {
        return this.zzY;
    }
    
    public final long x1() {
        return this.zzm;
    }
    
    public final long y1() {
        return this.zzx;
    }
    
    public final String z() {
        return this.zzr;
    }
    
    public final long z1() {
        return this.zzo;
    }
}
