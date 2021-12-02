// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.internal.vision;

import java.util.List;

public final class q3
{
    public static final class a extends p6<q3.a, q3.a.a> implements b8
    {
        private static final q3.a zzf;
        private static volatile m8<q3.a> zzg;
        private int zzc;
        private String zzd;
        private String zze;
        
        static {
            p6.y(q3.a.class, zzf = new q3.a());
        }
        
        private a() {
            this.zzd = "";
            this.zze = "";
        }
        
        public static q3.a.a F() {
            return ((p6<p6, p6.b>)q3.a.zzf).B();
        }
        
        private final void H(final String zzd) {
            zzd.getClass();
            this.zzc |= 0x1;
            this.zzd = zzd;
        }
        
        private final void K(final String zze) {
            zze.getClass();
            this.zzc |= 0x2;
            this.zze = zze;
        }
        
        @Override
        protected final Object v(final int n, Object o, final Object o2) {
            switch (s3.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final m8<q3.a> zzg;
                    if ((zzg = q3.a.zzg) == null) {
                        synchronized (q3.a.class) {
                            if (q3.a.zzg == null) {
                                o = (q3.a.zzg = (m8<q3.a>)new p6.a(q3.a.zzf));
                            }
                        }
                    }
                    return zzg;
                }
                case 4: {
                    return q3.a.zzf;
                }
                case 3: {
                    return p6.w(q3.a.zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1008\u0001", new Object[] { "zzc", "zzd", "zze" });
                }
                case 2: {
                    return new q3.a.a((s3)null);
                }
                case 1: {
                    return new q3.a();
                }
            }
        }
        
        public static final class a extends p6.b<q3.a, a> implements b8
        {
            private a() {
                super(q3.a.zzf);
            }
            
            public final a x(final String s) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((q3.a)super.H).H(s);
                return this;
            }
            
            public final a y(final String s) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((q3.a)super.H).K(s);
                return this;
            }
        }
    }
    
    public static final class b extends p6<b, a> implements b8
    {
        private static final w6<Integer, k4> zzd;
        private static final b zze;
        private static volatile m8<b> zzf;
        private x6 zzc;
        
        static {
            zzd = (w6)new t3();
            p6.y(b.class, zze = new b());
        }
        
        private b() {
            this.zzc = p6.D();
        }
        
        @Override
        protected final Object v(final int n, Object o, final Object o2) {
            switch (s3.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final m8<b> zzf;
                    if ((zzf = b.zzf) == null) {
                        synchronized (b.class) {
                            if (b.zzf == null) {
                                o = (b.zzf = (m8<b>)new p6.a(b.zze));
                            }
                        }
                    }
                    return zzf;
                }
                case 4: {
                    return b.zze;
                }
                case 3: {
                    return p6.w(b.zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001e", new Object[] { "zzc", k4.d() });
                }
                case 2: {
                    return new a((s3)null);
                }
                case 1: {
                    return new b();
                }
            }
        }
        
        public static final class a extends p6.b<q3.b, a> implements b8
        {
            private a() {
                super(q3.b.zze);
            }
        }
    }
    
    public static final class c extends p6<c, a> implements b8
    {
        private static final c zzg;
        private static volatile m8<c> zzh;
        private int zzc;
        private int zzd;
        private int zze;
        private String zzf;
        
        static {
            p6.y(c.class, zzg = new c());
        }
        
        private c() {
            this.zzf = "";
        }
        
        @Override
        protected final Object v(final int n, Object o, final Object o2) {
            switch (s3.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final m8<c> zzh;
                    if ((zzh = c.zzh) == null) {
                        synchronized (c.class) {
                            if (c.zzh == null) {
                                o = (c.zzh = (m8<c>)new p6.a(c.zzg));
                            }
                        }
                    }
                    return zzh;
                }
                case 4: {
                    return c.zzg;
                }
                case 3: {
                    return p6.w(c.zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u1008\u0002", new Object[] { "zzc", "zzd", k4.d(), "zze", m4.d(), "zzf" });
                }
                case 2: {
                    return new a((s3)null);
                }
                case 1: {
                    return new c();
                }
            }
        }
        
        public static final class a extends p6.b<q3.c, a> implements b8
        {
            private a() {
                super(q3.c.zzg);
            }
        }
    }
    
    public static final class d extends p6<d, a> implements b8
    {
        private static final d zzd;
        private static volatile m8<d> zze;
        private z6<m> zzc;
        
        static {
            p6.y(d.class, zzd = new d());
        }
        
        private d() {
            this.zzc = p6.E();
        }
        
        public static a F() {
            return ((p6<p6, p6.b>)d.zzd).B();
        }
        
        private final void H(final m m) {
            m.getClass();
            final z6<m> zzc = this.zzc;
            if (!zzc.zza()) {
                this.zzc = p6.u(zzc);
            }
            this.zzc.add(m);
        }
        
        @Override
        protected final Object v(final int n, Object o, final Object o2) {
            switch (s3.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final m8<d> zze;
                    if ((zze = d.zze) == null) {
                        synchronized (d.class) {
                            if (d.zze == null) {
                                o = (d.zze = (m8<d>)new p6.a(d.zzd));
                            }
                        }
                    }
                    return zze;
                }
                case 4: {
                    return d.zzd;
                }
                case 3: {
                    return p6.w(d.zzd, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[] { "zzc", m.class });
                }
                case 2: {
                    return new a((s3)null);
                }
                case 1: {
                    return new d();
                }
            }
        }
        
        public static final class a extends p6.b<q3.d, a> implements b8
        {
            private a() {
                super(q3.d.zzd);
            }
            
            public final a x(final m.a a) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((q3.d)super.H).H((m)((p6.b)a).o());
                return this;
            }
            
            public final a y(final m m) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((q3.d)super.H).H(m);
                return this;
            }
        }
    }
    
    public static final class e extends p6<e, a> implements b8
    {
        private static final e zzl;
        private static volatile m8<e> zzm;
        private int zzc;
        private String zzd;
        private boolean zze;
        private int zzf;
        private long zzg;
        private long zzh;
        private long zzi;
        private String zzj;
        private boolean zzk;
        
        static {
            p6.y(e.class, zzl = new e());
        }
        
        private e() {
            this.zzd = "";
            this.zzj = "";
        }
        
        @Override
        protected final Object v(final int n, Object o, final Object o2) {
            switch (s3.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final m8<e> zzm;
                    if ((zzm = e.zzm) == null) {
                        synchronized (e.class) {
                            if (e.zzm == null) {
                                o = (e.zzm = (m8<e>)new p6.a(e.zzl));
                            }
                        }
                    }
                    return zzm;
                }
                case 4: {
                    return e.zzl;
                }
                case 3: {
                    return p6.w(e.zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u100c\u0002\u0004\u1002\u0003\u0005\u1002\u0004\u0006\u1002\u0005\u0007\u1008\u0006\b\u1007\u0007", new Object[] { "zzc", "zzd", "zze", "zzf", b.d(), "zzg", "zzh", "zzi", "zzj", "zzk" });
                }
                case 2: {
                    return new a((s3)null);
                }
                case 1: {
                    return new e();
                }
            }
        }
        
        public static final class a extends p6.b<q3.e, a> implements b8
        {
            private a() {
                super(q3.e.zzl);
            }
        }
        
        public enum b implements s6
        {
            H(0), 
            I(1), 
            J(2), 
            K(3);
            
            private static final v6<b> L;
            private final int G;
            
            static {
                L = new u3();
            }
            
            private b(final int g) {
                this.G = g;
            }
            
            public static b b(final int n) {
                if (n == 0) {
                    return b.H;
                }
                if (n == 1) {
                    return b.I;
                }
                if (n == 2) {
                    return b.J;
                }
                if (n != 3) {
                    return null;
                }
                return b.K;
            }
            
            public static u6 d() {
                return v3.a;
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("<");
                sb.append(b.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.G);
                sb.append(" name=");
                sb.append(this.name());
                sb.append('>');
                return sb.toString();
            }
            
            @Override
            public final int zza() {
                return this.G;
            }
        }
    }
    
    public static final class f extends p6<f, b> implements b8
    {
        private static final f zzl;
        private static volatile m8<f> zzm;
        private int zzc;
        private String zzd;
        private String zze;
        private z6<String> zzf;
        private int zzg;
        private String zzh;
        private long zzi;
        private long zzj;
        private z6<n> zzk;
        
        static {
            p6.y(f.class, zzl = new f());
        }
        
        private f() {
            this.zzd = "";
            this.zze = "";
            this.zzf = p6.E();
            this.zzh = "";
            this.zzk = p6.E();
        }
        
        public static b F() {
            return ((p6<p6, p6.b>)f.zzl).B();
        }
        
        private final void G(final long zzi) {
            this.zzc |= 0x10;
            this.zzi = zzi;
        }
        
        private final void K(final Iterable<? extends n> iterable) {
            final z6<n> zzk = this.zzk;
            if (!zzk.zza()) {
                this.zzk = p6.u(zzk);
            }
            r4.b((Iterable<Object>)iterable, (List<? super Object>)this.zzk);
        }
        
        private final void L(final String zzd) {
            zzd.getClass();
            this.zzc |= 0x1;
            this.zzd = zzd;
        }
        
        private final void N(final long zzj) {
            this.zzc |= 0x20;
            this.zzj = zzj;
        }
        
        @Override
        protected final Object v(final int n, Object o, final Object o2) {
            switch (s3.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final m8<f> zzm;
                    if ((zzm = f.zzm) == null) {
                        synchronized (f.class) {
                            if (f.zzm == null) {
                                o = (f.zzm = (m8<f>)new p6.a(f.zzl));
                            }
                        }
                    }
                    return zzm;
                }
                case 4: {
                    return f.zzl;
                }
                case 3: {
                    return p6.w(f.zzl, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u1008\u0001\u0003\u001a\u0004\u100c\u0002\u0005\u1008\u0003\u0006\u1002\u0004\u0007\u1002\u0005\b\u001b", new Object[] { "zzc", "zzd", "zze", "zzf", "zzg", a.d(), "zzh", "zzi", "zzj", "zzk", n.class });
                }
                case 2: {
                    return new b((s3)null);
                }
                case 1: {
                    return new f();
                }
            }
        }
        
        public enum a implements s6
        {
            H(0), 
            I(1), 
            J(2), 
            K(3);
            
            private static final v6<a> L;
            private final int G;
            
            static {
                L = new x3();
            }
            
            private a(final int g) {
                this.G = g;
            }
            
            public static a b(final int n) {
                if (n == 0) {
                    return a.H;
                }
                if (n == 1) {
                    return a.I;
                }
                if (n == 2) {
                    return a.J;
                }
                if (n != 3) {
                    return null;
                }
                return a.K;
            }
            
            public static u6 d() {
                return w3.a;
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("<");
                sb.append(a.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.G);
                sb.append(" name=");
                sb.append(this.name());
                sb.append('>');
                return sb.toString();
            }
            
            @Override
            public final int zza() {
                return this.G;
            }
        }
        
        public static final class b extends p6.b<q3.f, b> implements b8
        {
            private b() {
                super(q3.f.zzl);
            }
            
            public final b A(final long n) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((q3.f)super.H).N(n);
                return this;
            }
            
            public final b x(final long n) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((q3.f)super.H).G(n);
                return this;
            }
            
            public final b y(final Iterable<? extends n> iterable) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((q3.f)super.H).K(iterable);
                return this;
            }
            
            public final b z(final String s) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((q3.f)super.H).L(s);
                return this;
            }
        }
    }
    
    public static final class g extends p6<g, a> implements b8
    {
        private static final g zzj;
        private static volatile m8<g> zzk;
        private int zzc;
        private int zzd;
        private int zze;
        private int zzf;
        private boolean zzg;
        private boolean zzh;
        private float zzi;
        
        static {
            p6.y(g.class, zzj = new g());
        }
        
        private g() {
        }
        
        public static a F() {
            return ((p6<p6, p6.b>)g.zzj).B();
        }
        
        private final void G(final float zzi) {
            this.zzc |= 0x20;
            this.zzi = zzi;
        }
        
        private final void H(final b b) {
            this.zzf = b.zza();
            this.zzc |= 0x4;
        }
        
        private final void I(final c c) {
            this.zze = c.zza();
            this.zzc |= 0x2;
        }
        
        private final void J(final d d) {
            this.zzd = d.zza();
            this.zzc |= 0x1;
        }
        
        private final void P(final boolean zzg) {
            this.zzc |= 0x8;
            this.zzg = zzg;
        }
        
        private final void S(final boolean zzh) {
            this.zzc |= 0x10;
            this.zzh = zzh;
        }
        
        @Override
        protected final Object v(final int n, Object o, final Object o2) {
            switch (s3.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final m8<g> zzk;
                    if ((zzk = g.zzk) == null) {
                        synchronized (g.class) {
                            if (g.zzk == null) {
                                o = (g.zzk = (m8<g>)new p6.a(g.zzj));
                            }
                        }
                    }
                    return zzk;
                }
                case 4: {
                    return g.zzj;
                }
                case 3: {
                    return p6.w(g.zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u100c\u0001\u0003\u100c\u0002\u0004\u1007\u0003\u0005\u1007\u0004\u0006\u1001\u0005", new Object[] { "zzc", "zzd", d.d(), "zze", c.d(), "zzf", b.d(), "zzg", "zzh", "zzi" });
                }
                case 2: {
                    return new a((s3)null);
                }
                case 1: {
                    return new g();
                }
            }
        }
        
        public static final class a extends p6.b<q3.g, a> implements b8
        {
            private a() {
                super(q3.g.zzj);
            }
            
            public final a A(final q3.g.d d) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((q3.g)super.H).J(d);
                return this;
            }
            
            public final a B(final boolean b) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((q3.g)super.H).P(b);
                return this;
            }
            
            public final a C(final boolean b) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((q3.g)super.H).S(b);
                return this;
            }
            
            public final a x(final float n) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((q3.g)super.H).G(n);
                return this;
            }
            
            public final a y(final q3.g.b b) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((q3.g)super.H).H(b);
                return this;
            }
            
            public final a z(final q3.g.c c) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((q3.g)super.H).I(c);
                return this;
            }
        }
        
        public enum b implements s6
        {
            H(0), 
            I(1), 
            J(2);
            
            private static final v6<b> K;
            private final int G;
            
            static {
                K = new y3();
            }
            
            private b(final int g) {
                this.G = g;
            }
            
            public static b b(final int n) {
                if (n == 0) {
                    return b.H;
                }
                if (n == 1) {
                    return b.I;
                }
                if (n != 2) {
                    return null;
                }
                return b.J;
            }
            
            public static u6 d() {
                return z3.a;
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("<");
                sb.append(b.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.G);
                sb.append(" name=");
                sb.append(this.name());
                sb.append('>');
                return sb.toString();
            }
            
            @Override
            public final int zza() {
                return this.G;
            }
        }
        
        public enum c implements s6
        {
            H(0), 
            I(1), 
            J(2), 
            K(3);
            
            private static final v6<c> L;
            private final int G;
            
            static {
                L = new b4();
            }
            
            private c(final int g) {
                this.G = g;
            }
            
            public static c b(final int n) {
                if (n == 0) {
                    return c.H;
                }
                if (n == 1) {
                    return c.I;
                }
                if (n == 2) {
                    return c.J;
                }
                if (n != 3) {
                    return null;
                }
                return c.K;
            }
            
            public static u6 d() {
                return a4.a;
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("<");
                sb.append(c.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.G);
                sb.append(" name=");
                sb.append(this.name());
                sb.append('>');
                return sb.toString();
            }
            
            @Override
            public final int zza() {
                return this.G;
            }
        }
        
        public enum d implements s6
        {
            H(0), 
            I(1), 
            J(2), 
            K(3);
            
            private static final v6<d> L;
            private final int G;
            
            static {
                L = new c4();
            }
            
            private d(final int g) {
                this.G = g;
            }
            
            public static d b(final int n) {
                if (n == 0) {
                    return d.H;
                }
                if (n == 1) {
                    return d.I;
                }
                if (n == 2) {
                    return d.J;
                }
                if (n != 3) {
                    return null;
                }
                return d.K;
            }
            
            public static u6 d() {
                return d4.a;
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("<");
                sb.append(d.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.G);
                sb.append(" name=");
                sb.append(this.name());
                sb.append('>');
                return sb.toString();
            }
            
            @Override
            public final int zza() {
                return this.G;
            }
        }
    }
    
    public static final class h extends p6<h, a> implements b8
    {
        private static final h zzj;
        private static volatile m8<h> zzk;
        private int zzc;
        private float zzd;
        private float zze;
        private float zzf;
        private float zzg;
        private float zzh;
        private float zzi;
        
        static {
            p6.y(h.class, zzj = new h());
        }
        
        private h() {
        }
        
        public static a F() {
            return ((p6<p6, p6.b>)h.zzj).B();
        }
        
        private final void G(final float zzd) {
            this.zzc |= 0x1;
            this.zzd = zzd;
        }
        
        private final void J(final float zze) {
            this.zzc |= 0x2;
            this.zze = zze;
        }
        
        private final void L(final float zzf) {
            this.zzc |= 0x4;
            this.zzf = zzf;
        }
        
        private final void N(final float zzg) {
            this.zzc |= 0x8;
            this.zzg = zzg;
        }
        
        private final void P(final float zzh) {
            this.zzc |= 0x10;
            this.zzh = zzh;
        }
        
        private final void R(final float zzi) {
            this.zzc |= 0x20;
            this.zzi = zzi;
        }
        
        @Override
        protected final Object v(final int n, Object o, final Object o2) {
            switch (s3.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final m8<h> zzk;
                    if ((zzk = h.zzk) == null) {
                        synchronized (h.class) {
                            if (h.zzk == null) {
                                o = (h.zzk = (m8<h>)new p6.a(h.zzj));
                            }
                        }
                    }
                    return zzk;
                }
                case 4: {
                    return h.zzj;
                }
                case 3: {
                    return p6.w(h.zzj, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u1001\u0000\u0002\u1001\u0001\u0003\u1001\u0002\u0004\u1001\u0003\u0005\u1001\u0004\u0006\u1001\u0005", new Object[] { "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi" });
                }
                case 2: {
                    return new a((s3)null);
                }
                case 1: {
                    return new h();
                }
            }
        }
        
        public static final class a extends p6.b<h, a> implements b8
        {
            private a() {
                super(h.zzj);
            }
            
            public final a A(final float n) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((h)super.H).N(n);
                return this;
            }
            
            public final a B(final float n) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((h)super.H).P(n);
                return this;
            }
            
            public final a C(final float n) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((h)super.H).R(n);
                return this;
            }
            
            public final a x(final float n) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((h)super.H).G(n);
                return this;
            }
            
            public final a y(final float n) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((h)super.H).J(n);
                return this;
            }
            
            public final a z(final float n) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((h)super.H).L(n);
                return this;
            }
        }
    }
    
    public static final class i extends p6<i, a> implements b8
    {
        private static final i zzg;
        private static volatile m8<i> zzh;
        private int zzc;
        private j zzd;
        private l zze;
        private z6<q3.f> zzf;
        
        static {
            p6.y(i.class, zzg = new i());
        }
        
        private i() {
            this.zzf = p6.E();
        }
        
        public static a F() {
            return ((p6<p6, p6.b>)i.zzg).B();
        }
        
        private final void G(final q3.f f) {
            f.getClass();
            this.N();
            this.zzf.add(f);
        }
        
        private final void K(final j zzd) {
            zzd.getClass();
            this.zzd = zzd;
            this.zzc |= 0x1;
        }
        
        private final void L(final Iterable<? extends q3.f> iterable) {
            this.N();
            r4.b((Iterable<Object>)iterable, (List<? super Object>)this.zzf);
        }
        
        private final void N() {
            final z6<q3.f> zzf = this.zzf;
            if (!zzf.zza()) {
                this.zzf = p6.u(zzf);
            }
        }
        
        @Override
        protected final Object v(final int n, Object o, final Object o2) {
            switch (s3.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final m8<i> zzh;
                    if ((zzh = i.zzh) == null) {
                        synchronized (i.class) {
                            if (i.zzh == null) {
                                o = (i.zzh = (m8<i>)new p6.a(i.zzg));
                            }
                        }
                    }
                    return zzh;
                }
                case 4: {
                    return i.zzg;
                }
                case 3: {
                    return p6.w(i.zzg, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u001b", new Object[] { "zzc", "zzd", "zze", "zzf", q3.f.class });
                }
                case 2: {
                    return new a((s3)null);
                }
                case 1: {
                    return new i();
                }
            }
        }
        
        public static final class a extends p6.b<i, a> implements b8
        {
            private a() {
                super(i.zzg);
            }
            
            public final a x(final q3.f.b b) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((i)super.H).G((q3.f)((p6.b)b).o());
                return this;
            }
            
            public final a y(final j j) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((i)super.H).K(j);
                return this;
            }
            
            public final a z(final Iterable<? extends q3.f> iterable) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((i)super.H).L(iterable);
                return this;
            }
        }
    }
    
    public static final class j extends p6<j, b> implements b8
    {
        private static final j zzi;
        private static volatile m8<j> zzj;
        private int zzc;
        private int zzd;
        private long zze;
        private long zzf;
        private long zzg;
        private long zzh;
        
        static {
            p6.y(j.class, zzi = new j());
        }
        
        private j() {
        }
        
        public static b F() {
            return ((p6<p6, p6.b>)j.zzi).B();
        }
        
        private final void G(final long zze) {
            this.zzc |= 0x2;
            this.zze = zze;
        }
        
        private final void J(final long zzf) {
            this.zzc |= 0x4;
            this.zzf = zzf;
        }
        
        private final void L(final long zzg) {
            this.zzc |= 0x8;
            this.zzg = zzg;
        }
        
        private final void N(final long zzh) {
            this.zzc |= 0x10;
            this.zzh = zzh;
        }
        
        @Override
        protected final Object v(final int n, Object o, final Object o2) {
            switch (s3.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final m8<j> zzj;
                    if ((zzj = j.zzj) == null) {
                        synchronized (j.class) {
                            if (j.zzj == null) {
                                o = (j.zzj = (m8<j>)new p6.a(j.zzi));
                            }
                        }
                    }
                    return zzj;
                }
                case 4: {
                    return j.zzi;
                }
                case 3: {
                    return p6.w(j.zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u100c\u0000\u0002\u1002\u0001\u0003\u1002\u0002\u0004\u1002\u0004\u0005\u1002\u0003", new Object[] { "zzc", "zzd", a.d(), "zze", "zzf", "zzh", "zzg" });
                }
                case 2: {
                    return new b((s3)null);
                }
                case 1: {
                    return new j();
                }
            }
        }
        
        public enum a implements s6
        {
            H(0), 
            I(1), 
            J(2), 
            K(3);
            
            private static final v6<a> L;
            private final int G;
            
            static {
                L = new f4();
            }
            
            private a(final int g) {
                this.G = g;
            }
            
            public static a b(final int n) {
                if (n == 0) {
                    return a.H;
                }
                if (n == 1) {
                    return a.I;
                }
                if (n == 2) {
                    return a.J;
                }
                if (n != 3) {
                    return null;
                }
                return a.K;
            }
            
            public static u6 d() {
                return e4.a;
            }
            
            @Override
            public final String toString() {
                final StringBuilder sb = new StringBuilder("<");
                sb.append(a.class.getName());
                sb.append('@');
                sb.append(Integer.toHexString(System.identityHashCode(this)));
                sb.append(" number=");
                sb.append(this.G);
                sb.append(" name=");
                sb.append(this.name());
                sb.append('>');
                return sb.toString();
            }
            
            @Override
            public final int zza() {
                return this.G;
            }
        }
        
        public static final class b extends p6.b<j, b> implements b8
        {
            private b() {
                super(j.zzi);
            }
            
            public final b A(final long n) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((j)super.H).N(n);
                return this;
            }
            
            public final b x(final long n) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((j)super.H).G(n);
                return this;
            }
            
            public final b y(final long n) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((j)super.H).J(n);
                return this;
            }
            
            public final b z(final long n) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((j)super.H).L(n);
                return this;
            }
        }
    }
    
    public static final class k extends p6<k, a> implements b8
    {
        private static final k zzj;
        private static volatile m8<k> zzk;
        private int zzc;
        private String zzd;
        private long zze;
        private q3.a zzf;
        private String zzg;
        private q3.g zzh;
        private q3.b zzi;
        
        static {
            p6.y(k.class, zzj = new k());
        }
        
        private k() {
            this.zzd = "";
            this.zzg = "";
        }
        
        public static a F() {
            return ((p6<p6, p6.b>)k.zzj).B();
        }
        
        private final void G(final long zze) {
            this.zzc |= 0x2;
            this.zze = zze;
        }
        
        private final void H(final q3.a zzf) {
            zzf.getClass();
            this.zzf = zzf;
            this.zzc |= 0x4;
        }
        
        private final void I(final q3.g zzh) {
            zzh.getClass();
            this.zzh = zzh;
            this.zzc |= 0x10;
        }
        
        private final void N(final String zzd) {
            zzd.getClass();
            this.zzc |= 0x1;
            this.zzd = zzd;
        }
        
        private final void Q(final String zzg) {
            zzg.getClass();
            this.zzc |= 0x8;
            this.zzg = zzg;
        }
        
        @Override
        protected final Object v(final int n, Object o, final Object o2) {
            switch (s3.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final m8<k> zzk;
                    if ((zzk = k.zzk) == null) {
                        synchronized (k.class) {
                            if (k.zzk == null) {
                                o = (k.zzk = (m8<k>)new p6.a(k.zzj));
                            }
                        }
                    }
                    return zzk;
                }
                case 4: {
                    return k.zzj;
                }
                case 3: {
                    return p6.w(k.zzj, "\u0001\u0006\u0000\u0001\u0001\u0011\u0006\u0000\u0000\u0000\u0001\u1008\u0000\u0002\u1002\u0001\u0003\u1009\u0002\u0006\u1008\u0003\u0010\u1009\u0004\u0011\u1009\u0005", new Object[] { "zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi" });
                }
                case 2: {
                    return new a((s3)null);
                }
                case 1: {
                    return new k();
                }
            }
        }
        
        public static final class a extends p6.b<k, a> implements b8
        {
            private a() {
                super(k.zzj);
            }
            
            public final a A(final String s) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((k)super.H).N(s);
                return this;
            }
            
            public final a B(final String s) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((k)super.H).Q(s);
                return this;
            }
            
            public final a x(final long n) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((k)super.H).G(n);
                return this;
            }
            
            public final a y(final q3.a a) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((k)super.H).H(a);
                return this;
            }
            
            public final a z(final q3.g.a a) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((k)super.H).I((q3.g)((p6.b)a).o());
                return this;
            }
        }
    }
    
    public static final class l extends p6<l, a> implements b8
    {
        private static final l zzf;
        private static volatile m8<l> zzg;
        private int zzc;
        private long zzd;
        private long zze;
        
        static {
            p6.y(l.class, zzf = new l());
        }
        
        private l() {
        }
        
        @Override
        protected final Object v(final int n, Object o, final Object o2) {
            switch (s3.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final m8<l> zzg;
                    if ((zzg = l.zzg) == null) {
                        synchronized (l.class) {
                            if (l.zzg == null) {
                                o = (l.zzg = (m8<l>)new p6.a(l.zzf));
                            }
                        }
                    }
                    return zzg;
                }
                case 4: {
                    return l.zzf;
                }
                case 3: {
                    return p6.w(l.zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1002\u0000\u0002\u1002\u0001", new Object[] { "zzc", "zzd", "zze" });
                }
                case 2: {
                    return new a((s3)null);
                }
                case 1: {
                    return new l();
                }
            }
        }
        
        public static final class a extends p6.b<l, a> implements b8
        {
            private a() {
                super(l.zzf);
            }
        }
    }
    
    public static final class m extends p6<m, a> implements b8
    {
        private static final m zzf;
        private static volatile m8<m> zzg;
        private int zzc;
        private int zzd;
        private int zze;
        
        static {
            p6.y(m.class, zzf = new m());
        }
        
        private m() {
        }
        
        public static a F() {
            return ((p6<p6, p6.b>)m.zzf).B();
        }
        
        private final void G(final int zzd) {
            this.zzc |= 0x1;
            this.zzd = zzd;
        }
        
        private final void K(final int zze) {
            this.zzc |= 0x2;
            this.zze = zze;
        }
        
        @Override
        protected final Object v(final int n, Object o, final Object o2) {
            switch (s3.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final m8<m> zzg;
                    if ((zzg = m.zzg) == null) {
                        synchronized (m.class) {
                            if (m.zzg == null) {
                                o = (m.zzg = (m8<m>)new p6.a(m.zzf));
                            }
                        }
                    }
                    return zzg;
                }
                case 4: {
                    return m.zzf;
                }
                case 3: {
                    return p6.w(m.zzf, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u1004\u0000\u0002\u1004\u0001", new Object[] { "zzc", "zzd", "zze" });
                }
                case 2: {
                    return new a((s3)null);
                }
                case 1: {
                    return new m();
                }
            }
        }
        
        public static final class a extends p6.b<m, a> implements b8
        {
            private a() {
                super(m.zzf);
            }
            
            public final a x(final int n) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((m)super.H).G(n);
                return this;
            }
            
            public final a y(final int n) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((m)super.H).K(n);
                return this;
            }
        }
    }
    
    public static final class n extends p6<n, a> implements b8
    {
        private static final n zzh;
        private static volatile m8<n> zzi;
        private int zzc;
        private q3.d zzd;
        private int zze;
        private h zzf;
        private q3.c zzg;
        
        static {
            p6.y(n.class, zzh = new n());
        }
        
        private n() {
        }
        
        public static a F() {
            return ((p6<p6, p6.b>)n.zzh).B();
        }
        
        private final void G(final int zze) {
            this.zzc |= 0x2;
            this.zze = zze;
        }
        
        private final void H(final q3.d zzd) {
            zzd.getClass();
            this.zzd = zzd;
            this.zzc |= 0x1;
        }
        
        private final void I(final h zzf) {
            zzf.getClass();
            this.zzf = zzf;
            this.zzc |= 0x4;
        }
        
        @Override
        protected final Object v(final int n, Object o, final Object o2) {
            switch (s3.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final m8<n> zzi;
                    if ((zzi = q3.n.zzi) == null) {
                        synchronized (n.class) {
                            if (q3.n.zzi == null) {
                                o = (q3.n.zzi = (m8<n>)new p6.a(q3.n.zzh));
                            }
                        }
                    }
                    return zzi;
                }
                case 4: {
                    return q3.n.zzh;
                }
                case 3: {
                    return p6.w(q3.n.zzh, "\u0001\u0004\u0000\u0001\u0001\u0011\u0004\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1004\u0001\u0010\u1009\u0002\u0011\u1009\u0003", new Object[] { "zzc", "zzd", "zze", "zzf", "zzg" });
                }
                case 2: {
                    return new a((s3)null);
                }
                case 1: {
                    return new n();
                }
            }
        }
        
        public static final class a extends p6.b<n, a> implements b8
        {
            private a() {
                super(n.zzh);
            }
            
            public final a A(final h h) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((n)super.H).I(h);
                return this;
            }
            
            public final a x(final int n) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((n)super.H).G(n);
                return this;
            }
            
            public final a y(final q3.d.a a) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((n)super.H).H((q3.d)((p6.b)a).o());
                return this;
            }
            
            public final a z(final q3.d d) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((n)super.H).H(d);
                return this;
            }
        }
    }
    
    public static final class o extends p6<o, a> implements b8
    {
        private static final o zzi;
        private static volatile m8<o> zzj;
        private int zzc;
        private q3.e zzd;
        private k zze;
        private i zzf;
        private int zzg;
        private boolean zzh;
        
        static {
            p6.y(o.class, zzi = new o());
        }
        
        private o() {
        }
        
        public static a F() {
            return ((p6<p6, p6.b>)o.zzi).B();
        }
        
        private final void G(final i zzf) {
            zzf.getClass();
            this.zzf = zzf;
            this.zzc |= 0x4;
        }
        
        private final void H(final k zze) {
            zze.getClass();
            this.zze = zze;
            this.zzc |= 0x2;
        }
        
        static /* synthetic */ void K(final o o, final boolean b) {
            o.L(true);
        }
        
        private final void L(final boolean b) {
            this.zzc |= 0x10;
            this.zzh = true;
        }
        
        @Override
        protected final Object v(final int n, Object o, final Object o2) {
            switch (s3.a[n - 1]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final m8<o> zzj;
                    if ((zzj = q3.o.zzj) == null) {
                        synchronized (o.class) {
                            if (q3.o.zzj == null) {
                                o = (q3.o.zzj = (m8<o>)new p6.a(q3.o.zzi));
                            }
                        }
                    }
                    return zzj;
                }
                case 4: {
                    return q3.o.zzi;
                }
                case 3: {
                    return p6.w(q3.o.zzi, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1004\u0003\u0005\u1007\u0004", new Object[] { "zzc", "zzd", "zze", "zzf", "zzg", "zzh" });
                }
                case 2: {
                    return new a((s3)null);
                }
                case 1: {
                    return new o();
                }
            }
        }
        
        public static final class a extends p6.b<o, a> implements b8
        {
            private a() {
                super(o.zzi);
            }
            
            public final a x(final i i) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((o)super.H).G(i);
                return this;
            }
            
            public final a y(final k.a a) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                ((o)super.H).H((k)((p6.b)a).o());
                return this;
            }
            
            public final a z(final boolean b) {
                if (super.I) {
                    ((p6.b)this).u();
                    super.I = false;
                }
                o.K((o)super.H, true);
                return this;
            }
        }
    }
}
