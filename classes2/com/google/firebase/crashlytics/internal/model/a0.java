// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Annotation;
import com.google.auto.value.AutoValue$Builder;
import androidx.annotation.k0;
import androidx.annotation.j0;
import java.nio.charset.Charset;
import com.google.auto.value.AutoValue;
import h3.a;

@h3.a
@AutoValue
public abstract class a0
{
    public static final String a = "Unity";
    private static final Charset b;
    
    static {
        b = Charset.forName("UTF-8");
    }
    
    @j0
    public static c b() {
        return (c)new com.google.firebase.crashlytics.internal.model.b.b();
    }
    
    @j0
    public abstract String c();
    
    @j0
    public abstract String d();
    
    @j0
    public abstract String e();
    
    @j0
    public abstract String f();
    
    @k0
    public abstract e g();
    
    public abstract int h();
    
    @j0
    public abstract String i();
    
    @k0
    public abstract f j();
    
    @h3.a.b
    public g k() {
        if (this.j() != null) {
            return g.H;
        }
        if (this.g() != null) {
            return g.I;
        }
        return g.G;
    }
    
    @j0
    protected abstract c l();
    
    @j0
    public a0 m(@j0 final b0<f.d> b0) {
        if (this.j() != null) {
            return this.l().i(this.j().o(b0)).a();
        }
        throw new IllegalStateException("Reports without sessions cannot have events added to them.");
    }
    
    @j0
    public a0 n(@j0 final e e) {
        return this.l().i(null).f(e).a();
    }
    
    @j0
    public a0 o(@j0 final String s) {
        final c l = this.l();
        final e g = this.g();
        if (g != null) {
            l.f(g.d().c(s).a());
        }
        final f j = this.j();
        if (j != null) {
            l.i(j.p(s));
        }
        return l.a();
    }
    
    @j0
    public a0 p(final long n, final boolean b, @k0 final String s) {
        final c l = this.l();
        if (this.j() != null) {
            l.i(this.j().q(n, b, s));
        }
        return l.a();
    }
    
    @AutoValue
    public abstract static class a
    {
        @j0
        public static a0.a.a a() {
            return (a0.a.a)new c.b();
        }
        
        @j0
        public abstract int b();
        
        @j0
        public abstract int c();
        
        @j0
        public abstract String d();
        
        @j0
        public abstract long e();
        
        @j0
        public abstract int f();
        
        @j0
        public abstract long g();
        
        @j0
        public abstract long h();
        
        @k0
        public abstract String i();
        
        @AutoValue$Builder
        public abstract static class a
        {
            @j0
            public abstract a0.a a();
            
            @j0
            public abstract a b(@j0 final int p0);
            
            @j0
            public abstract a c(@j0 final int p0);
            
            @j0
            public abstract a d(@j0 final String p0);
            
            @j0
            public abstract a e(@j0 final long p0);
            
            @j0
            public abstract a f(@j0 final int p0);
            
            @j0
            public abstract a g(@j0 final long p0);
            
            @j0
            public abstract a h(@j0 final long p0);
            
            @j0
            public abstract a i(@k0 final String p0);
        }
    }
    
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
        public static final int F0 = 5;
        public static final int G0 = 6;
        public static final int H0 = 9;
        public static final int I0 = 0;
        public static final int J0 = 1;
        public static final int K0 = 7;
    }
    
    @AutoValue$Builder
    public abstract static class c
    {
        @j0
        public abstract a0 a();
        
        @j0
        public abstract c b(@j0 final String p0);
        
        @j0
        public abstract c c(@j0 final String p0);
        
        @j0
        public abstract c d(@j0 final String p0);
        
        @j0
        public abstract c e(@j0 final String p0);
        
        @j0
        public abstract c f(final a0.e p0);
        
        @j0
        public abstract c g(final int p0);
        
        @j0
        public abstract c h(@j0 final String p0);
        
        @j0
        public abstract c i(@j0 final a0.f p0);
    }
    
    @AutoValue
    public abstract static class d
    {
        @j0
        public static a a() {
            return (a)new com.google.firebase.crashlytics.internal.model.d.b();
        }
        
        @j0
        public abstract String b();
        
        @j0
        public abstract String c();
        
        @AutoValue$Builder
        public abstract static class a
        {
            @j0
            public abstract d a();
            
            @j0
            public abstract a b(@j0 final String p0);
            
            @j0
            public abstract a c(@j0 final String p0);
        }
    }
    
    @AutoValue
    public abstract static class e
    {
        @j0
        public static a a() {
            return (a)new com.google.firebase.crashlytics.internal.model.e.b();
        }
        
        @j0
        public abstract b0<b> b();
        
        @k0
        public abstract String c();
        
        abstract a d();
        
        @AutoValue$Builder
        public abstract static class a
        {
            public abstract e a();
            
            public abstract a b(final b0<b> p0);
            
            public abstract a c(final String p0);
        }
        
        @AutoValue
        public abstract static class b
        {
            @j0
            public static a a() {
                return (a)new com.google.firebase.crashlytics.internal.model.f.b();
            }
            
            @j0
            public abstract byte[] b();
            
            @j0
            public abstract String c();
            
            @AutoValue$Builder
            public abstract static class a
            {
                public abstract b a();
                
                public abstract a b(final byte[] p0);
                
                public abstract a c(final String p0);
            }
        }
    }
    
    @AutoValue
    public abstract static class f
    {
        @j0
        public static b a() {
            return new com.google.firebase.crashlytics.internal.model.g.b().c(false);
        }
        
        @j0
        public abstract a b();
        
        @k0
        public abstract c c();
        
        @k0
        public abstract Long d();
        
        @k0
        public abstract b0<d> e();
        
        @j0
        public abstract String f();
        
        public abstract int g();
        
        @h3.a.b
        @j0
        public abstract String h();
        
        @h3.a.a(name = "identifier")
        @j0
        public byte[] i() {
            return this.h().getBytes(a0.b);
        }
        
        @k0
        public abstract e j();
        
        public abstract long k();
        
        @k0
        public abstract a0.f.f l();
        
        public abstract boolean m();
        
        @j0
        public abstract b n();
        
        @j0
        a0.f o(@j0 final b0<d> b0) {
            return this.n().f(b0).a();
        }
        
        @j0
        a0.f p(@j0 final String s) {
            return this.n().b(this.b().j(s)).a();
        }
        
        @j0
        a0.f q(final long l, final boolean b, @k0 final String s) {
            final b n = this.n();
            n.e(l);
            n.c(b);
            if (s != null) {
                n.m(a0.f.f.a().b(s).a()).a();
            }
            return n.a();
        }
        
        @AutoValue
        public abstract static class a
        {
            @j0
            public static a0.f.a.a a() {
                return (a0.f.a.a)new h.b();
            }
            
            @k0
            public abstract String b();
            
            @k0
            public abstract String c();
            
            @k0
            public abstract String d();
            
            @j0
            public abstract String e();
            
            @k0
            public abstract String f();
            
            @k0
            public abstract b g();
            
            @j0
            public abstract String h();
            
            @j0
            protected abstract a0.f.a.a i();
            
            @j0
            a0.f.a j(@j0 final String s) {
                final b g = this.g();
                b.a a;
                if (g != null) {
                    a = g.c();
                }
                else {
                    a = b.a();
                }
                return this.i().g(a.b(s).a()).a();
            }
            
            @AutoValue$Builder
            public abstract static class a
            {
                @j0
                public abstract a0.f.a a();
                
                @j0
                public abstract a b(@k0 final String p0);
                
                @j0
                public abstract a c(@k0 final String p0);
                
                @j0
                public abstract a d(@j0 final String p0);
                
                @j0
                public abstract a e(@j0 final String p0);
                
                @j0
                public abstract a f(@j0 final String p0);
                
                @j0
                public abstract a g(@j0 final b p0);
                
                @j0
                public abstract a h(@j0 final String p0);
            }
            
            @AutoValue
            public abstract static class b
            {
                @j0
                public static a a() {
                    return (a)new i.b();
                }
                
                @j0
                public abstract String b();
                
                @j0
                protected abstract a c();
                
                @AutoValue$Builder
                public abstract static class a
                {
                    @j0
                    public abstract b a();
                    
                    @j0
                    public abstract a b(@j0 final String p0);
                }
            }
        }
        
        @AutoValue$Builder
        public abstract static class b
        {
            @j0
            public abstract a0.f a();
            
            @j0
            public abstract b b(@j0 final a0.f.a p0);
            
            @j0
            public abstract b c(final boolean p0);
            
            @j0
            public abstract b d(@j0 final a0.f.c p0);
            
            @j0
            public abstract b e(@j0 final Long p0);
            
            @j0
            public abstract b f(@j0 final b0<a0.f.d> p0);
            
            @j0
            public abstract b g(@j0 final String p0);
            
            @j0
            public abstract b h(final int p0);
            
            @j0
            public abstract b i(@j0 final String p0);
            
            @j0
            public b j(@j0 final byte[] bytes) {
                return this.i(new String(bytes, a0.b));
            }
            
            @j0
            public abstract b k(@j0 final a0.f.e p0);
            
            @j0
            public abstract b l(final long p0);
            
            @j0
            public abstract b m(@j0 final a0.f.f p0);
        }
        
        @AutoValue
        public abstract static class c
        {
            @j0
            public static a a() {
                return (a)new j.b();
            }
            
            @j0
            public abstract int b();
            
            public abstract int c();
            
            public abstract long d();
            
            @j0
            public abstract String e();
            
            @j0
            public abstract String f();
            
            @j0
            public abstract String g();
            
            public abstract long h();
            
            public abstract int i();
            
            public abstract boolean j();
            
            @AutoValue$Builder
            public abstract static class a
            {
                @j0
                public abstract c a();
                
                @j0
                public abstract a b(final int p0);
                
                @j0
                public abstract a c(final int p0);
                
                @j0
                public abstract a d(final long p0);
                
                @j0
                public abstract a e(@j0 final String p0);
                
                @j0
                public abstract a f(@j0 final String p0);
                
                @j0
                public abstract a g(@j0 final String p0);
                
                @j0
                public abstract a h(final long p0);
                
                @j0
                public abstract a i(final boolean p0);
                
                @j0
                public abstract a j(final int p0);
            }
        }
        
        @AutoValue
        public abstract static class d
        {
            @j0
            public static b a() {
                return (b)new k.b();
            }
            
            @j0
            public abstract a b();
            
            @j0
            public abstract c c();
            
            @k0
            public abstract a0.f.d.d d();
            
            public abstract long e();
            
            @j0
            public abstract String f();
            
            @j0
            public abstract b g();
            
            @AutoValue
            public abstract static class a
            {
                @j0
                public static a0.f.d.a.a a() {
                    return (a0.f.d.a.a)new l.b();
                }
                
                @k0
                public abstract Boolean b();
                
                @k0
                public abstract b0<a0.d> c();
                
                @j0
                public abstract b d();
                
                @k0
                public abstract b0<a0.d> e();
                
                public abstract int f();
                
                @j0
                public abstract a0.f.d.a.a g();
                
                @AutoValue$Builder
                public abstract static class a
                {
                    @j0
                    public abstract a0.f.d.a a();
                    
                    @j0
                    public abstract a b(@k0 final Boolean p0);
                    
                    @j0
                    public abstract a c(@j0 final b0<a0.d> p0);
                    
                    @j0
                    public abstract a d(@j0 final a0.f.d.a.b p0);
                    
                    @j0
                    public abstract a e(@j0 final b0<a0.d> p0);
                    
                    @j0
                    public abstract a f(final int p0);
                }
                
                @AutoValue
                public abstract static class b
                {
                    @j0
                    public static a0.f.d.a.b.b a() {
                        return (a0.f.d.a.b.b)new m.b();
                    }
                    
                    @k0
                    public abstract a0.a b();
                    
                    @j0
                    public abstract b0<a> c();
                    
                    @k0
                    public abstract c d();
                    
                    @j0
                    public abstract d e();
                    
                    @k0
                    public abstract b0<e> f();
                    
                    @AutoValue
                    public abstract static class a
                    {
                        @j0
                        public static a0.f.d.a.b.a.a a() {
                            return (a0.f.d.a.b.a.a)new n.b();
                        }
                        
                        @j0
                        public abstract long b();
                        
                        @j0
                        public abstract String c();
                        
                        public abstract long d();
                        
                        @a.b
                        @k0
                        public abstract String e();
                        
                        @a.a(name = "uuid")
                        @k0
                        public byte[] f() {
                            final String e = this.e();
                            byte[] bytes;
                            if (e != null) {
                                bytes = e.getBytes(a0.b);
                            }
                            else {
                                bytes = null;
                            }
                            return bytes;
                        }
                        
                        @AutoValue$Builder
                        public abstract static class a
                        {
                            @j0
                            public abstract a0.f.d.a.b.a a();
                            
                            @j0
                            public abstract a b(final long p0);
                            
                            @j0
                            public abstract a c(@j0 final String p0);
                            
                            @j0
                            public abstract a d(final long p0);
                            
                            @j0
                            public abstract a e(@k0 final String p0);
                            
                            @j0
                            public a f(@j0 final byte[] bytes) {
                                return this.e(new String(bytes, a0.b));
                            }
                        }
                    }
                    
                    @AutoValue$Builder
                    public abstract static class b
                    {
                        @j0
                        public abstract a0.f.d.a.b a();
                        
                        @j0
                        public abstract b b(@j0 final a0.a p0);
                        
                        @j0
                        public abstract b c(@j0 final b0<a0.f.d.a.b.a> p0);
                        
                        @j0
                        public abstract b d(@j0 final c p0);
                        
                        @j0
                        public abstract b e(@j0 final d p0);
                        
                        @j0
                        public abstract b f(@j0 final b0<e> p0);
                    }
                    
                    @AutoValue
                    public abstract static class c
                    {
                        @j0
                        public static a a() {
                            return (a)new o.b();
                        }
                        
                        @k0
                        public abstract c b();
                        
                        @j0
                        public abstract b0<e.b> c();
                        
                        public abstract int d();
                        
                        @k0
                        public abstract String e();
                        
                        @j0
                        public abstract String f();
                        
                        @AutoValue$Builder
                        public abstract static class a
                        {
                            @j0
                            public abstract c a();
                            
                            @j0
                            public abstract a b(@j0 final c p0);
                            
                            @j0
                            public abstract a c(@j0 final b0<e.b> p0);
                            
                            @j0
                            public abstract a d(final int p0);
                            
                            @j0
                            public abstract a e(@j0 final String p0);
                            
                            @j0
                            public abstract a f(@j0 final String p0);
                        }
                    }
                    
                    @AutoValue
                    public abstract static class d
                    {
                        @j0
                        public static a a() {
                            return (a)new p.b();
                        }
                        
                        @j0
                        public abstract long b();
                        
                        @j0
                        public abstract String c();
                        
                        @j0
                        public abstract String d();
                        
                        @AutoValue$Builder
                        public abstract static class a
                        {
                            @j0
                            public abstract d a();
                            
                            @j0
                            public abstract a b(final long p0);
                            
                            @j0
                            public abstract a c(@j0 final String p0);
                            
                            @j0
                            public abstract a d(@j0 final String p0);
                        }
                    }
                    
                    @AutoValue
                    public abstract static class e
                    {
                        @j0
                        public static a a() {
                            return (a)new q.b();
                        }
                        
                        @j0
                        public abstract b0<b> b();
                        
                        public abstract int c();
                        
                        @j0
                        public abstract String d();
                        
                        @AutoValue$Builder
                        public abstract static class a
                        {
                            @j0
                            public abstract e a();
                            
                            @j0
                            public abstract a b(@j0 final b0<b> p0);
                            
                            @j0
                            public abstract a c(final int p0);
                            
                            @j0
                            public abstract a d(@j0 final String p0);
                        }
                        
                        @AutoValue
                        public abstract static class b
                        {
                            @j0
                            public static a a() {
                                return (a)new r.b();
                            }
                            
                            @k0
                            public abstract String b();
                            
                            public abstract int c();
                            
                            public abstract long d();
                            
                            public abstract long e();
                            
                            @j0
                            public abstract String f();
                            
                            @AutoValue$Builder
                            public abstract static class a
                            {
                                @j0
                                public abstract b a();
                                
                                @j0
                                public abstract a b(@j0 final String p0);
                                
                                @j0
                                public abstract a c(final int p0);
                                
                                @j0
                                public abstract a d(final long p0);
                                
                                @j0
                                public abstract a e(final long p0);
                                
                                @j0
                                public abstract a f(@j0 final String p0);
                            }
                        }
                    }
                }
            }
            
            @AutoValue$Builder
            public abstract static class b
            {
                @j0
                public abstract a0.f.d a();
                
                @j0
                public abstract b b(@j0 final a0.f.d.a p0);
                
                @j0
                public abstract b c(@j0 final a0.f.d.c p0);
                
                @j0
                public abstract b d(@j0 final a0.f.d.d p0);
                
                @j0
                public abstract b e(final long p0);
                
                @j0
                public abstract b f(@j0 final String p0);
            }
            
            @AutoValue
            public abstract static class c
            {
                @j0
                public static a a() {
                    return (a)new s.b();
                }
                
                @k0
                public abstract Double b();
                
                public abstract int c();
                
                public abstract long d();
                
                public abstract int e();
                
                public abstract long f();
                
                public abstract boolean g();
                
                @AutoValue$Builder
                public abstract static class a
                {
                    @j0
                    public abstract c a();
                    
                    @j0
                    public abstract a b(final Double p0);
                    
                    @j0
                    public abstract a c(final int p0);
                    
                    @j0
                    public abstract a d(final long p0);
                    
                    @j0
                    public abstract a e(final int p0);
                    
                    @j0
                    public abstract a f(final boolean p0);
                    
                    @j0
                    public abstract a g(final long p0);
                }
            }
            
            @AutoValue
            public abstract static class d
            {
                @j0
                public static a a() {
                    return (a)new t.b();
                }
                
                @j0
                public abstract String b();
                
                @AutoValue$Builder
                public abstract static class a
                {
                    @j0
                    public abstract d a();
                    
                    @j0
                    public abstract a b(@j0 final String p0);
                }
            }
        }
        
        @AutoValue
        public abstract static class e
        {
            @j0
            public static a a() {
                return (a)new u.b();
            }
            
            @j0
            public abstract String b();
            
            public abstract int c();
            
            @j0
            public abstract String d();
            
            public abstract boolean e();
            
            @AutoValue$Builder
            public abstract static class a
            {
                @j0
                public abstract e a();
                
                @j0
                public abstract a b(@j0 final String p0);
                
                @j0
                public abstract a c(final boolean p0);
                
                @j0
                public abstract a d(final int p0);
                
                @j0
                public abstract a e(@j0 final String p0);
            }
        }
        
        @AutoValue
        public abstract static class f
        {
            @j0
            public static a a() {
                return (a)new v.b();
            }
            
            @j0
            public abstract String b();
            
            @AutoValue$Builder
            public abstract static class a
            {
                @j0
                public abstract f a();
                
                @j0
                public abstract a b(@j0 final String p0);
            }
        }
    }
    
    public enum g
    {
        G, 
        H, 
        I;
    }
}
