// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import android.net.Uri;
import androidx.annotation.k0;
import androidx.annotation.p0;
import androidx.annotation.j0;
import android.os.Build$VERSION;
import androidx.annotation.t0;
import androidx.room.i0;

public final class c
{
    public static final c i;
    @i0(name = "required_network_type")
    private r a;
    @i0(name = "requires_charging")
    private boolean b;
    @i0(name = "requires_device_idle")
    private boolean c;
    @i0(name = "requires_battery_not_low")
    private boolean d;
    @i0(name = "requires_storage_not_low")
    private boolean e;
    @i0(name = "trigger_content_update_delay")
    private long f;
    @i0(name = "trigger_max_content_delay")
    private long g;
    @i0(name = "content_uri_triggers")
    private d h;
    
    static {
        i = new a().b();
    }
    
    @t0({ t0.a.H })
    public c() {
        this.a = r.G;
        this.f = -1L;
        this.g = -1L;
        this.h = new d();
    }
    
    c(final a a) {
        this.a = r.G;
        this.f = -1L;
        this.g = -1L;
        this.h = new d();
        this.b = a.a;
        final int sdk_INT = Build$VERSION.SDK_INT;
        this.c = (sdk_INT >= 23 && a.b);
        this.a = a.c;
        this.d = a.d;
        this.e = a.e;
        if (sdk_INT >= 24) {
            this.h = a.h;
            this.f = a.f;
            this.g = a.g;
        }
    }
    
    public c(@j0 final c c) {
        this.a = r.G;
        this.f = -1L;
        this.g = -1L;
        this.h = new d();
        this.b = c.b;
        this.c = c.c;
        this.a = c.a;
        this.d = c.d;
        this.e = c.e;
        this.h = c.h;
    }
    
    @j0
    @p0(24)
    @t0({ t0.a.H })
    public d a() {
        return this.h;
    }
    
    @j0
    public r b() {
        return this.a;
    }
    
    @t0({ t0.a.H })
    public long c() {
        return this.f;
    }
    
    @t0({ t0.a.H })
    public long d() {
        return this.g;
    }
    
    @p0(24)
    @t0({ t0.a.H })
    public boolean e() {
        return this.h.c() > 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && c.class == o.getClass()) {
            final c c = (c)o;
            return this.b == c.b && this.c == c.c && this.d == c.d && this.e == c.e && this.f == c.f && this.g == c.g && this.a == c.a && this.h.equals(c.h);
        }
        return false;
    }
    
    public boolean f() {
        return this.d;
    }
    
    public boolean g() {
        return this.b;
    }
    
    @p0(23)
    public boolean h() {
        return this.c;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.a.hashCode();
        final int b = this.b ? 1 : 0;
        final int c = this.c ? 1 : 0;
        final int d = this.d ? 1 : 0;
        final int e = this.e ? 1 : 0;
        final long f = this.f;
        final int n = (int)(f ^ f >>> 32);
        final long g = this.g;
        return ((((((hashCode * 31 + b) * 31 + c) * 31 + d) * 31 + e) * 31 + n) * 31 + (int)(g ^ g >>> 32)) * 31 + this.h.hashCode();
    }
    
    public boolean i() {
        return this.e;
    }
    
    @p0(24)
    @t0({ t0.a.H })
    public void j(@k0 final d h) {
        this.h = h;
    }
    
    @t0({ t0.a.H })
    public void k(@j0 final r a) {
        this.a = a;
    }
    
    @t0({ t0.a.H })
    public void l(final boolean d) {
        this.d = d;
    }
    
    @t0({ t0.a.H })
    public void m(final boolean b) {
        this.b = b;
    }
    
    @p0(23)
    @t0({ t0.a.H })
    public void n(final boolean c) {
        this.c = c;
    }
    
    @t0({ t0.a.H })
    public void o(final boolean e) {
        this.e = e;
    }
    
    @t0({ t0.a.H })
    public void p(final long f) {
        this.f = f;
    }
    
    @t0({ t0.a.H })
    public void q(final long g) {
        this.g = g;
    }
    
    public static final class a
    {
        boolean a;
        boolean b;
        r c;
        boolean d;
        boolean e;
        long f;
        long g;
        d h;
        
        public a() {
            this.a = false;
            this.b = false;
            this.c = r.G;
            this.d = false;
            this.e = false;
            this.f = -1L;
            this.g = -1L;
            this.h = new d();
        }
        
        @j0
        @p0(24)
        public a a(@j0 final Uri uri, final boolean b) {
            this.h.a(uri, b);
            return this;
        }
        
        @j0
        public c b() {
            return new c(this);
        }
        
        @j0
        public a c(@j0 final r c) {
            this.c = c;
            return this;
        }
        
        @j0
        public a d(final boolean d) {
            this.d = d;
            return this;
        }
        
        @j0
        public a e(final boolean a) {
            this.a = a;
            return this;
        }
        
        @j0
        @p0(23)
        public a f(final boolean b) {
            this.b = b;
            return this;
        }
        
        @j0
        public a g(final boolean e) {
            this.e = e;
            return this;
        }
        
        @j0
        @p0(24)
        public a h(final long duration, @j0 final TimeUnit timeUnit) {
            this.g = timeUnit.toMillis(duration);
            return this;
        }
        
        @j0
        @p0(26)
        public a i(final Duration duration) {
            this.g = duration.toMillis();
            return this;
        }
        
        @j0
        @p0(24)
        public a j(final long duration, @j0 final TimeUnit timeUnit) {
            this.f = timeUnit.toMillis(duration);
            return this;
        }
        
        @j0
        @p0(26)
        public a k(final Duration duration) {
            this.f = duration.toMillis();
            return this;
        }
    }
}
