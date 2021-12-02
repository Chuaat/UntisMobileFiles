// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.clearcut;

public final class j5 extends d<j5, a> implements u2
{
    private static volatile d3<j5> zzbg;
    private static final j5 zzsg;
    private byte zzsf;
    
    static {
        j1.o(j5.class, zzsg = new j5());
    }
    
    private j5() {
        this.zzsf = 2;
    }
    
    public static j5 v() {
        return j5.zzsg;
    }
    
    @Override
    protected final Object k(int n, Object o, final Object o2) {
        final int[] a = k5.a;
        final int n2 = 1;
        switch (a[n - 1]) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 7: {
                n = n2;
                if (o == null) {
                    n = 0;
                }
                this.zzsf = (byte)n;
                return null;
            }
            case 6: {
                return this.zzsf;
            }
            case 5: {
                final d3<j5> zzbg;
                if ((zzbg = j5.zzbg) == null) {
                    synchronized (j5.class) {
                        if (j5.zzbg == null) {
                            o = (j5.zzbg = (d3<j5>)new b(j5.zzsg));
                        }
                    }
                }
                return zzbg;
            }
            case 4: {
                return j5.zzsg;
            }
            case 3: {
                return j1.m(j5.zzsg, "\u0003\u0000", null);
            }
            case 2: {
                return new a((k5)null);
            }
            case 1: {
                return new j5();
            }
        }
    }
    
    public static final class a extends c<j5, a> implements u2
    {
        private a() {
            super(j5.zzsg);
        }
    }
}
