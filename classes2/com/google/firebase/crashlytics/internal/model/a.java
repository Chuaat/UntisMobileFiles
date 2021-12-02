// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.crashlytics.internal.model;

import java.io.IOException;
import com.google.firebase.encoders.e;
import i3.b;

public final class a implements a
{
    public static final int a = 2;
    public static final a b;
    
    static {
        b = new a();
    }
    
    private a() {
    }
    
    @Override
    public void a(final i3.b<?> b) {
        final c a = c.a;
        b.b(a0.class, a);
        b.b(com.google.firebase.crashlytics.internal.model.b.class, a);
        final i a2 = i.a;
        b.b(a0.f.class, a2);
        b.b(com.google.firebase.crashlytics.internal.model.g.class, a2);
        final f a3 = f.a;
        b.b(a0.f.a.class, a3);
        b.b(com.google.firebase.crashlytics.internal.model.h.class, a3);
        final g a4 = g.a;
        b.b(a0.f.a.b.class, a4);
        b.b(com.google.firebase.crashlytics.internal.model.i.class, a4);
        final u a5 = u.a;
        b.b(a0.f.f.class, a5);
        b.b(v.class, a5);
        final t a6 = t.a;
        b.b(a0.f.e.class, a6);
        b.b(com.google.firebase.crashlytics.internal.model.u.class, a6);
        final h a7 = h.a;
        b.b(a0.f.c.class, a7);
        b.b(com.google.firebase.crashlytics.internal.model.j.class, a7);
        final r a8 = r.a;
        b.b(a0.f.d.class, a8);
        b.b(com.google.firebase.crashlytics.internal.model.k.class, a8);
        final j a9 = j.a;
        b.b(a0.f.d.a.class, a9);
        b.b(com.google.firebase.crashlytics.internal.model.l.class, a9);
        final l a10 = l.a;
        b.b(a0.f.d.a.b.class, a10);
        b.b(com.google.firebase.crashlytics.internal.model.m.class, a10);
        final o a11 = o.a;
        b.b(a0.f.d.a.b.e.class, a11);
        b.b(com.google.firebase.crashlytics.internal.model.q.class, a11);
        final p a12 = p.a;
        b.b(a0.f.d.a.b.e.b.class, a12);
        b.b(com.google.firebase.crashlytics.internal.model.r.class, a12);
        final m a13 = m.a;
        b.b(a0.f.d.a.b.c.class, a13);
        b.b(com.google.firebase.crashlytics.internal.model.o.class, a13);
        final a a14 = com.google.firebase.crashlytics.internal.model.a.a.a;
        b.b(a0.a.class, a14);
        b.b(com.google.firebase.crashlytics.internal.model.c.class, a14);
        final n a15 = n.a;
        b.b(a0.f.d.a.b.d.class, a15);
        b.b(com.google.firebase.crashlytics.internal.model.p.class, a15);
        final k a16 = k.a;
        b.b(a0.f.d.a.b.a.class, a16);
        b.b(com.google.firebase.crashlytics.internal.model.n.class, a16);
        final b a17 = com.google.firebase.crashlytics.internal.model.a.b.a;
        b.b(a0.d.class, a17);
        b.b(com.google.firebase.crashlytics.internal.model.d.class, a17);
        final q a18 = q.a;
        b.b(a0.f.d.c.class, a18);
        b.b(com.google.firebase.crashlytics.internal.model.s.class, a18);
        final s a19 = s.a;
        b.b(a0.f.d.d.class, a19);
        b.b(com.google.firebase.crashlytics.internal.model.t.class, a19);
        final d a20 = d.a;
        b.b(a0.e.class, a20);
        b.b(com.google.firebase.crashlytics.internal.model.e.class, a20);
        final e a21 = e.a;
        b.b(a0.e.b.class, a21);
        b.b(com.google.firebase.crashlytics.internal.model.f.class, a21);
    }
    
    private static final class a implements e<a0.a>
    {
        static final a a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        private static final com.google.firebase.encoders.d e;
        private static final com.google.firebase.encoders.d f;
        private static final com.google.firebase.encoders.d g;
        private static final com.google.firebase.encoders.d h;
        private static final com.google.firebase.encoders.d i;
        
        static {
            a = new a();
            b = com.google.firebase.encoders.d.d("pid");
            c = com.google.firebase.encoders.d.d("processName");
            d = com.google.firebase.encoders.d.d("reasonCode");
            e = com.google.firebase.encoders.d.d("importance");
            f = com.google.firebase.encoders.d.d("pss");
            g = com.google.firebase.encoders.d.d("rss");
            h = com.google.firebase.encoders.d.d("timestamp");
            i = com.google.firebase.encoders.d.d("traceFile");
        }
        
        public void b(final a0.a a, final com.google.firebase.encoders.f f) throws IOException {
            f.c(a.b, a.c());
            f.n(a.c, a.d());
            f.c(a.d, a.f());
            f.c(a.e, a.b());
            f.b(a.f, a.e());
            f.b(a.g, a.g());
            f.b(a.h, a.h());
            f.n(a.i, a.i());
        }
    }
    
    private static final class b implements e<a0.d>
    {
        static final b a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        
        static {
            a = new b();
            b = com.google.firebase.encoders.d.d("key");
            c = com.google.firebase.encoders.d.d("value");
        }
        
        public void b(final a0.d d, final com.google.firebase.encoders.f f) throws IOException {
            f.n(com.google.firebase.crashlytics.internal.model.a.b.b, d.b());
            f.n(com.google.firebase.crashlytics.internal.model.a.b.c, d.c());
        }
    }
    
    private static final class c implements e<a0>
    {
        static final c a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        private static final com.google.firebase.encoders.d e;
        private static final com.google.firebase.encoders.d f;
        private static final com.google.firebase.encoders.d g;
        private static final com.google.firebase.encoders.d h;
        private static final com.google.firebase.encoders.d i;
        
        static {
            a = new c();
            b = com.google.firebase.encoders.d.d("sdkVersion");
            c = com.google.firebase.encoders.d.d("gmpAppId");
            d = com.google.firebase.encoders.d.d("platform");
            e = com.google.firebase.encoders.d.d("installationUuid");
            f = com.google.firebase.encoders.d.d("buildVersion");
            g = com.google.firebase.encoders.d.d("displayVersion");
            h = com.google.firebase.encoders.d.d("session");
            i = com.google.firebase.encoders.d.d("ndkPayload");
        }
        
        public void b(final a0 a0, final com.google.firebase.encoders.f f) throws IOException {
            f.n(com.google.firebase.crashlytics.internal.model.a.c.b, a0.i());
            f.n(com.google.firebase.crashlytics.internal.model.a.c.c, a0.e());
            f.c(com.google.firebase.crashlytics.internal.model.a.c.d, a0.h());
            f.n(com.google.firebase.crashlytics.internal.model.a.c.e, a0.f());
            f.n(com.google.firebase.crashlytics.internal.model.a.c.f, a0.c());
            f.n(com.google.firebase.crashlytics.internal.model.a.c.g, a0.d());
            f.n(com.google.firebase.crashlytics.internal.model.a.c.h, a0.j());
            f.n(com.google.firebase.crashlytics.internal.model.a.c.i, a0.g());
        }
    }
    
    private static final class d implements e<a0.e>
    {
        static final d a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        
        static {
            a = new d();
            b = com.google.firebase.encoders.d.d("files");
            c = com.google.firebase.encoders.d.d("orgId");
        }
        
        public void b(final a0.e e, final com.google.firebase.encoders.f f) throws IOException {
            f.n(d.b, e.b());
            f.n(d.c, e.c());
        }
    }
    
    private static final class e implements com.google.firebase.encoders.e<a0.e.b>
    {
        static final e a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        
        static {
            a = new e();
            b = com.google.firebase.encoders.d.d("filename");
            c = com.google.firebase.encoders.d.d("contents");
        }
        
        public void b(final a0.e.b b, final com.google.firebase.encoders.f f) throws IOException {
            f.n(e.b, b.c());
            f.n(e.c, b.b());
        }
    }
    
    private static final class f implements e<a0.f.a>
    {
        static final f a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        private static final com.google.firebase.encoders.d e;
        private static final com.google.firebase.encoders.d f;
        private static final com.google.firebase.encoders.d g;
        private static final com.google.firebase.encoders.d h;
        
        static {
            a = new f();
            b = com.google.firebase.encoders.d.d("identifier");
            c = com.google.firebase.encoders.d.d("version");
            d = com.google.firebase.encoders.d.d("displayVersion");
            e = com.google.firebase.encoders.d.d("organization");
            f = com.google.firebase.encoders.d.d("installationUuid");
            g = com.google.firebase.encoders.d.d("developmentPlatform");
            h = com.google.firebase.encoders.d.d("developmentPlatformVersion");
        }
        
        public void b(final a0.f.a a, final com.google.firebase.encoders.f f) throws IOException {
            f.n(f.b, a.e());
            f.n(f.c, a.h());
            f.n(f.d, a.d());
            f.n(f.e, a.g());
            f.n(f.f, a.f());
            f.n(f.g, a.b());
            f.n(f.h, a.c());
        }
    }
    
    private static final class g implements e<a0.f.a.b>
    {
        static final g a;
        private static final com.google.firebase.encoders.d b;
        
        static {
            a = new g();
            b = com.google.firebase.encoders.d.d("clsId");
        }
        
        public void b(final a0.f.a.b b, final com.google.firebase.encoders.f f) throws IOException {
            f.n(g.b, b.b());
        }
    }
    
    private static final class h implements e<a0.f.c>
    {
        static final h a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        private static final com.google.firebase.encoders.d e;
        private static final com.google.firebase.encoders.d f;
        private static final com.google.firebase.encoders.d g;
        private static final com.google.firebase.encoders.d h;
        private static final com.google.firebase.encoders.d i;
        private static final com.google.firebase.encoders.d j;
        
        static {
            a = new h();
            b = com.google.firebase.encoders.d.d("arch");
            c = com.google.firebase.encoders.d.d("model");
            d = com.google.firebase.encoders.d.d("cores");
            e = com.google.firebase.encoders.d.d("ram");
            f = com.google.firebase.encoders.d.d("diskSpace");
            g = com.google.firebase.encoders.d.d("simulator");
            h = com.google.firebase.encoders.d.d("state");
            i = com.google.firebase.encoders.d.d("manufacturer");
            j = com.google.firebase.encoders.d.d("modelClass");
        }
        
        public void b(final a0.f.c c, final com.google.firebase.encoders.f f) throws IOException {
            f.c(com.google.firebase.crashlytics.internal.model.a.h.b, c.b());
            f.n(com.google.firebase.crashlytics.internal.model.a.h.c, c.f());
            f.c(com.google.firebase.crashlytics.internal.model.a.h.d, c.c());
            f.b(com.google.firebase.crashlytics.internal.model.a.h.e, c.h());
            f.b(com.google.firebase.crashlytics.internal.model.a.h.f, c.d());
            f.a(com.google.firebase.crashlytics.internal.model.a.h.g, c.j());
            f.c(com.google.firebase.crashlytics.internal.model.a.h.h, c.i());
            f.n(com.google.firebase.crashlytics.internal.model.a.h.i, c.e());
            f.n(com.google.firebase.crashlytics.internal.model.a.h.j, c.g());
        }
    }
    
    private static final class i implements e<a0.f>
    {
        static final i a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        private static final com.google.firebase.encoders.d e;
        private static final com.google.firebase.encoders.d f;
        private static final com.google.firebase.encoders.d g;
        private static final com.google.firebase.encoders.d h;
        private static final com.google.firebase.encoders.d i;
        private static final com.google.firebase.encoders.d j;
        private static final com.google.firebase.encoders.d k;
        private static final com.google.firebase.encoders.d l;
        
        static {
            a = new i();
            b = com.google.firebase.encoders.d.d("generator");
            c = com.google.firebase.encoders.d.d("identifier");
            d = com.google.firebase.encoders.d.d("startedAt");
            e = com.google.firebase.encoders.d.d("endedAt");
            f = com.google.firebase.encoders.d.d("crashed");
            g = com.google.firebase.encoders.d.d("app");
            h = com.google.firebase.encoders.d.d("user");
            i = com.google.firebase.encoders.d.d("os");
            j = com.google.firebase.encoders.d.d("device");
            k = com.google.firebase.encoders.d.d("events");
            l = com.google.firebase.encoders.d.d("generatorType");
        }
        
        public void b(final a0.f f, final com.google.firebase.encoders.f f2) throws IOException {
            f2.n(com.google.firebase.crashlytics.internal.model.a.i.b, f.f());
            f2.n(com.google.firebase.crashlytics.internal.model.a.i.c, f.i());
            f2.b(com.google.firebase.crashlytics.internal.model.a.i.d, f.k());
            f2.n(com.google.firebase.crashlytics.internal.model.a.i.e, f.d());
            f2.a(com.google.firebase.crashlytics.internal.model.a.i.f, f.m());
            f2.n(com.google.firebase.crashlytics.internal.model.a.i.g, f.b());
            f2.n(com.google.firebase.crashlytics.internal.model.a.i.h, f.l());
            f2.n(com.google.firebase.crashlytics.internal.model.a.i.i, f.j());
            f2.n(com.google.firebase.crashlytics.internal.model.a.i.j, f.c());
            f2.n(com.google.firebase.crashlytics.internal.model.a.i.k, f.e());
            f2.c(com.google.firebase.crashlytics.internal.model.a.i.l, f.g());
        }
    }
    
    private static final class j implements e<a0.f.d.a>
    {
        static final j a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        private static final com.google.firebase.encoders.d e;
        private static final com.google.firebase.encoders.d f;
        
        static {
            a = new j();
            b = com.google.firebase.encoders.d.d("execution");
            c = com.google.firebase.encoders.d.d("customAttributes");
            d = com.google.firebase.encoders.d.d("internalKeys");
            e = com.google.firebase.encoders.d.d("background");
            f = com.google.firebase.encoders.d.d("uiOrientation");
        }
        
        public void b(final a0.f.d.a a, final com.google.firebase.encoders.f f) throws IOException {
            f.n(j.b, a.d());
            f.n(j.c, a.c());
            f.n(j.d, a.e());
            f.n(j.e, a.b());
            f.c(j.f, a.f());
        }
    }
    
    private static final class k implements e<a0.f.d.a.b.a>
    {
        static final k a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        private static final com.google.firebase.encoders.d e;
        
        static {
            a = new k();
            b = com.google.firebase.encoders.d.d("baseAddress");
            c = com.google.firebase.encoders.d.d("size");
            d = com.google.firebase.encoders.d.d("name");
            e = com.google.firebase.encoders.d.d("uuid");
        }
        
        public void b(final a0.f.d.a.b.a a, final com.google.firebase.encoders.f f) throws IOException {
            f.b(k.b, a.b());
            f.b(k.c, a.d());
            f.n(k.d, a.c());
            f.n(k.e, a.f());
        }
    }
    
    private static final class l implements e<a0.f.d.a.b>
    {
        static final l a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        private static final com.google.firebase.encoders.d e;
        private static final com.google.firebase.encoders.d f;
        
        static {
            a = new l();
            b = com.google.firebase.encoders.d.d("threads");
            c = com.google.firebase.encoders.d.d("exception");
            d = com.google.firebase.encoders.d.d("appExitInfo");
            e = com.google.firebase.encoders.d.d("signal");
            f = com.google.firebase.encoders.d.d("binaries");
        }
        
        public void b(final a0.f.d.a.b b, final com.google.firebase.encoders.f f) throws IOException {
            f.n(l.b, b.f());
            f.n(l.c, b.d());
            f.n(l.d, b.b());
            f.n(l.e, b.e());
            f.n(l.f, b.c());
        }
    }
    
    private static final class m implements e<a0.f.d.a.b.c>
    {
        static final m a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        private static final com.google.firebase.encoders.d e;
        private static final com.google.firebase.encoders.d f;
        
        static {
            a = new m();
            b = com.google.firebase.encoders.d.d("type");
            c = com.google.firebase.encoders.d.d("reason");
            d = com.google.firebase.encoders.d.d("frames");
            e = com.google.firebase.encoders.d.d("causedBy");
            f = com.google.firebase.encoders.d.d("overflowCount");
        }
        
        public void b(final a0.f.d.a.b.c c, final com.google.firebase.encoders.f f) throws IOException {
            f.n(m.b, c.f());
            f.n(m.c, c.e());
            f.n(m.d, c.c());
            f.n(m.e, c.b());
            f.c(m.f, c.d());
        }
    }
    
    private static final class n implements e<a0.f.d.a.b.d>
    {
        static final n a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        
        static {
            a = new n();
            b = com.google.firebase.encoders.d.d("name");
            c = com.google.firebase.encoders.d.d("code");
            d = com.google.firebase.encoders.d.d("address");
        }
        
        public void b(final a0.f.d.a.b.d d, final com.google.firebase.encoders.f f) throws IOException {
            f.n(n.b, d.d());
            f.n(n.c, d.c());
            f.b(n.d, d.b());
        }
    }
    
    private static final class o implements e<a0.f.d.a.b.e>
    {
        static final o a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        
        static {
            a = new o();
            b = com.google.firebase.encoders.d.d("name");
            c = com.google.firebase.encoders.d.d("importance");
            d = com.google.firebase.encoders.d.d("frames");
        }
        
        public void b(final a0.f.d.a.b.e e, final com.google.firebase.encoders.f f) throws IOException {
            f.n(o.b, e.d());
            f.c(o.c, e.c());
            f.n(o.d, e.b());
        }
    }
    
    private static final class p implements e<a0.f.d.a.b.e.b>
    {
        static final p a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        private static final com.google.firebase.encoders.d e;
        private static final com.google.firebase.encoders.d f;
        
        static {
            a = new p();
            b = com.google.firebase.encoders.d.d("pc");
            c = com.google.firebase.encoders.d.d("symbol");
            d = com.google.firebase.encoders.d.d("file");
            e = com.google.firebase.encoders.d.d("offset");
            f = com.google.firebase.encoders.d.d("importance");
        }
        
        public void b(final a0.f.d.a.b.e.b b, final com.google.firebase.encoders.f f) throws IOException {
            f.b(p.b, b.e());
            f.n(p.c, b.f());
            f.n(p.d, b.b());
            f.b(p.e, b.d());
            f.c(p.f, b.c());
        }
    }
    
    private static final class q implements e<a0.f.d.c>
    {
        static final q a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        private static final com.google.firebase.encoders.d e;
        private static final com.google.firebase.encoders.d f;
        private static final com.google.firebase.encoders.d g;
        
        static {
            a = new q();
            b = com.google.firebase.encoders.d.d("batteryLevel");
            c = com.google.firebase.encoders.d.d("batteryVelocity");
            d = com.google.firebase.encoders.d.d("proximityOn");
            e = com.google.firebase.encoders.d.d("orientation");
            f = com.google.firebase.encoders.d.d("ramUsed");
            g = com.google.firebase.encoders.d.d("diskUsed");
        }
        
        public void b(final a0.f.d.c c, final com.google.firebase.encoders.f f) throws IOException {
            f.n(q.b, c.b());
            f.c(q.c, c.c());
            f.a(q.d, c.g());
            f.c(q.e, c.e());
            f.b(q.f, c.f());
            f.b(q.g, c.d());
        }
    }
    
    private static final class r implements e<a0.f.d>
    {
        static final r a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        private static final com.google.firebase.encoders.d e;
        private static final com.google.firebase.encoders.d f;
        
        static {
            a = new r();
            b = com.google.firebase.encoders.d.d("timestamp");
            c = com.google.firebase.encoders.d.d("type");
            d = com.google.firebase.encoders.d.d("app");
            e = com.google.firebase.encoders.d.d("device");
            f = com.google.firebase.encoders.d.d("log");
        }
        
        public void b(final a0.f.d d, final com.google.firebase.encoders.f f) throws IOException {
            f.b(r.b, d.e());
            f.n(r.c, d.f());
            f.n(r.d, d.b());
            f.n(r.e, d.c());
            f.n(r.f, d.d());
        }
    }
    
    private static final class s implements e<a0.f.d.d>
    {
        static final s a;
        private static final com.google.firebase.encoders.d b;
        
        static {
            a = new s();
            b = com.google.firebase.encoders.d.d("content");
        }
        
        public void b(final a0.f.d.d d, final com.google.firebase.encoders.f f) throws IOException {
            f.n(s.b, d.b());
        }
    }
    
    private static final class t implements e<a0.f.e>
    {
        static final t a;
        private static final com.google.firebase.encoders.d b;
        private static final com.google.firebase.encoders.d c;
        private static final com.google.firebase.encoders.d d;
        private static final com.google.firebase.encoders.d e;
        
        static {
            a = new t();
            b = com.google.firebase.encoders.d.d("platform");
            c = com.google.firebase.encoders.d.d("version");
            d = com.google.firebase.encoders.d.d("buildVersion");
            e = com.google.firebase.encoders.d.d("jailbroken");
        }
        
        public void b(final a0.f.e e, final com.google.firebase.encoders.f f) throws IOException {
            f.c(t.b, e.c());
            f.n(t.c, e.d());
            f.n(t.d, e.b());
            f.a(t.e, e.e());
        }
    }
    
    private static final class u implements e<a0.f.f>
    {
        static final u a;
        private static final com.google.firebase.encoders.d b;
        
        static {
            a = new u();
            b = com.google.firebase.encoders.d.d("identifier");
        }
        
        public void b(final a0.f.f f, final com.google.firebase.encoders.f f2) throws IOException {
            f2.n(u.b, f.b());
        }
    }
}
