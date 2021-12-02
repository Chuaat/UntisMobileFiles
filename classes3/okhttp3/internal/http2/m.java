// 
// Decompiled by Procyon v0.5.36
// 

package okhttp3.internal.http2;

import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import kotlin.jvm.internal.w;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u0015\n\u0002\b\u0005\u0018\u0000 \u00072\u00020\u0001:\u0001\u0003B\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0019\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0086\u0002J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004J\u0011\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002J\u0006\u0010\u000b\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bJ\u0006\u0010\u000e\u001a\u00020\u0004J\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004J\u000e\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0000R\u0013\u0010\u0015\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0017\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0013\u0010\u0019\u001a\u00020\u00048F@\u0006¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001f" }, d2 = { "Lokhttp3/internal/http2/m;", "", "Lkotlin/j2;", "a", "", "id", "value", "k", "", "i", "b", "l", "defaultValue", "c", "f", "g", "h", "other", "j", "e", "()I", "initialWindowSize", "I", "set", "d", "headerTableSize", "", "[I", "values", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
public final class m
{
    public static final int c = 65535;
    public static final int d = 1;
    public static final int e = 2;
    public static final int f = 4;
    public static final int g = 5;
    public static final int h = 6;
    public static final int i = 7;
    public static final int j = 10;
    public static final a k;
    private int a;
    private final int[] b;
    
    static {
        k = new a(null);
    }
    
    public m() {
        this.b = new int[10];
    }
    
    public final void a() {
        this.a = 0;
        kotlin.collections.m.u2(this.b, 0, 0, 0, 6, (Object)null);
    }
    
    public final int b(final int n) {
        return this.b[n];
    }
    
    public final boolean c(boolean b) {
        if ((this.a & 0x4) != 0x0) {
            if (this.b[2] == 1) {
                b = true;
            }
            else {
                b = false;
            }
        }
        return b;
    }
    
    public final int d() {
        int n;
        if ((this.a & 0x2) != 0x0) {
            n = this.b[1];
        }
        else {
            n = -1;
        }
        return n;
    }
    
    public final int e() {
        int n;
        if ((this.a & 0x80) != 0x0) {
            n = this.b[7];
        }
        else {
            n = 65535;
        }
        return n;
    }
    
    public final int f() {
        int n;
        if ((this.a & 0x10) != 0x0) {
            n = this.b[4];
        }
        else {
            n = Integer.MAX_VALUE;
        }
        return n;
    }
    
    public final int g(int n) {
        if ((this.a & 0x20) != 0x0) {
            n = this.b[5];
        }
        return n;
    }
    
    public final int h(int n) {
        if ((this.a & 0x40) != 0x0) {
            n = this.b[6];
        }
        return n;
    }
    
    public final boolean i(final int n) {
        boolean b = true;
        if ((1 << n & this.a) == 0x0) {
            b = false;
        }
        return b;
    }
    
    public final void j(@e final m m) {
        k0.p((Object)m, "other");
        for (int i = 0; i < 10; ++i) {
            if (m.i(i)) {
                this.k(i, m.b(i));
            }
        }
    }
    
    @e
    public final m k(final int n, final int n2) {
        if (n >= 0) {
            final int[] b = this.b;
            if (n < b.length) {
                this.a |= 1 << n;
                b[n] = n2;
            }
        }
        return this;
    }
    
    public final int l() {
        return Integer.bitCount(this.a);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e" }, d2 = { "okhttp3/internal/http2/m$a", "", "", "COUNT", "I", "DEFAULT_INITIAL_WINDOW_SIZE", "ENABLE_PUSH", "HEADER_TABLE_SIZE", "INITIAL_WINDOW_SIZE", "MAX_CONCURRENT_STREAMS", "MAX_FRAME_SIZE", "MAX_HEADER_LIST_SIZE", "<init>", "()V", "okhttp" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
    }
}
