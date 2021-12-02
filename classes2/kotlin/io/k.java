// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.io;

import org.jetbrains.annotations.f;
import kotlin.h0;
import java.util.ArrayDeque;
import kotlin.collections.c;
import java.util.Iterator;
import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import org.jetbrains.annotations.e;
import java.io.IOException;
import n6.p;
import kotlin.j2;
import n6.l;
import kotlin.Metadata;
import java.io.File;
import kotlin.sequences.m;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0015\u0012$B\u008b\u0001\b\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0018\u00010\u0005\u00128\u0010 \u001a4\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u0018\u0012\u0013\u0012\u00110\f¢\u0006\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\b(\u001f\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e¢\u0006\u0004\b!\u0010\"B\u001b\b\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b!\u0010#J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002J\u001a\u0010\b\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u0005J\u001a\u0010\n\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t0\u0005J \u0010\r\u001a\u00020\u00002\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000bJ\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\u00028\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u000e8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006%" }, d2 = { "Lkotlin/io/k;", "Lkotlin/sequences/m;", "Ljava/io/File;", "", "iterator", "Lkotlin/Function1;", "", "function", "j", "Lkotlin/j2;", "l", "Lkotlin/Function2;", "Ljava/io/IOException;", "k", "", "depth", "i", "Lkotlin/io/m;", "b", "Lkotlin/io/m;", "direction", "a", "Ljava/io/File;", "start", "f", "I", "maxDepth", "onEnter", "onLeave", "Lkotlin/t0;", "name", "e", "onFail", "<init>", "(Ljava/io/File;Lkotlin/io/m;Ln6/l;Ln6/l;Ln6/p;I)V", "(Ljava/io/File;Lkotlin/io/m;)V", "c", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
public final class k implements m<File>
{
    private final File a;
    private final kotlin.io.m b;
    private final l<File, Boolean> c;
    private final l<File, j2> d;
    private final p<File, IOException, j2> e;
    private final int f;
    
    public k(@e final File file, @e final kotlin.io.m m) {
        k0.p(file, "start");
        k0.p(m, "direction");
        this(file, m, null, null, null, 0, 32, null);
    }
    
    private k(final File a, final kotlin.io.m b, final l<? super File, Boolean> c, final l<? super File, j2> d, final p<? super File, ? super IOException, j2> e, final int f) {
        this.a = a;
        this.b = b;
        this.c = (l<File, Boolean>)c;
        this.d = (l<File, j2>)d;
        this.e = (p<File, IOException, j2>)e;
        this.f = f;
    }
    
    public static final /* synthetic */ kotlin.io.m c(final k k) {
        return k.b;
    }
    
    public static final /* synthetic */ int d(final k k) {
        return k.f;
    }
    
    public static final /* synthetic */ l e(final k k) {
        return k.c;
    }
    
    public static final /* synthetic */ p f(final k k) {
        return k.e;
    }
    
    public static final /* synthetic */ l g(final k k) {
        return k.d;
    }
    
    public static final /* synthetic */ File h(final k k) {
        return k.a;
    }
    
    @e
    public final k i(final int i) {
        if (i > 0) {
            return new k(this.a, this.b, this.c, this.d, this.e, i);
        }
        final StringBuilder sb = new StringBuilder();
        sb.append("depth must be positive, but was ");
        sb.append(i);
        sb.append('.');
        throw new IllegalArgumentException(sb.toString());
    }
    
    @e
    public Iterator<File> iterator() {
        return new b();
    }
    
    @e
    public final k j(@e final l<? super File, Boolean> l) {
        k0.p(l, "function");
        return new k(this.a, this.b, l, this.d, this.e, this.f);
    }
    
    @e
    public final k k(@e final p<? super File, ? super IOException, j2> p) {
        k0.p(p, "function");
        return new k(this.a, this.b, this.c, this.d, p, this.f);
    }
    
    @e
    public final k l(@e final l<? super File, j2> l) {
        k0.p(l, "function");
        return new k(this.a, this.b, this.c, l, this.e, this.f);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006" }, d2 = { "kotlin/io/k$a", "Lkotlin/io/k$c;", "Ljava/io/File;", "rootDir", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private abstract static class a extends k.c
    {
        public a(@e final File file) {
            k0.p(file, "rootDir");
            super(file);
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\b\u0010\u0011B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0082\u0010J\b\u0010\b\u001a\u00020\u0007H\u0014R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0012" }, d2 = { "kotlin/io/k$b", "Lkotlin/collections/c;", "Ljava/io/File;", "root", "Lkotlin/io/k$a;", "e", "f", "Lkotlin/j2;", "a", "Ljava/util/ArrayDeque;", "Lkotlin/io/k$c;", "I", "Ljava/util/ArrayDeque;", "state", "<init>", "(Lkotlin/io/k;)V", "b", "c", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private final class b extends kotlin.collections.c<File>
    {
        private final ArrayDeque<k.c> I;
        
        public b() {
            final ArrayDeque<k.b.b> i = new ArrayDeque<k.b.b>();
            this.I = (ArrayDeque<k.c>)i;
            if (k.h(k.this).isDirectory()) {
                i.push((k.b.b)this.e(k.h(k.this)));
            }
            else if (k.h(k.this).isFile()) {
                i.push(new k.b.b(k.h(k.this)));
            }
            else {
                this.b();
            }
        }
        
        private final k.a e(final File file) {
            final int n = kotlin.io.l.a[k.c(k.this).ordinal()];
            k.a a;
            if (n != 1) {
                if (n != 2) {
                    throw new h0();
                }
                a = new a(file);
            }
            else {
                a = new c(file);
            }
            return a;
        }
        
        private final File f() {
            while (true) {
                final k.c c = this.I.peek();
                if (c == null) {
                    return null;
                }
                final File b = c.b();
                if (b == null) {
                    this.I.pop();
                }
                else {
                    if (k0.g(b, c.a()) || !b.isDirectory() || this.I.size() >= k.d(k.this)) {
                        return b;
                    }
                    this.I.push(this.e(b));
                }
            }
        }
        
        @Override
        protected void a() {
            final File f = this.f();
            if (f != null) {
                this.c(f);
            }
            else {
                this.b();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0014" }, d2 = { "kotlin/io/k$b$a", "Lkotlin/io/k$a;", "Ljava/io/File;", "b", "", "c", "[Ljava/io/File;", "fileList", "", "e", "Z", "failed", "rootVisited", "", "d", "I", "fileIndex", "rootDir", "<init>", "(Lkotlin/io/k$b;Ljava/io/File;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
        private final class a extends k.a
        {
            private boolean b;
            private File[] c;
            private int d;
            private boolean e;
            
            public a(final File file) {
                k0.p(file, "rootDir");
                super(file);
            }
            
            @f
            @Override
            public File b() {
                if (!this.e && this.c == null) {
                    final l e = k.e(k.this);
                    if (e != null && !e.invoke(((k.c)this).a())) {
                        return null;
                    }
                    if ((this.c = ((k.c)this).a().listFiles()) == null) {
                        final p f = k.f(k.this);
                        if (f != null) {
                            final j2 j2 = f.invoke(((k.c)this).a(), new kotlin.io.a(((k.c)this).a(), null, "Cannot list files in a directory", 2, null));
                        }
                        this.e = true;
                    }
                }
                final File[] c = this.c;
                if (c != null) {
                    final int d = this.d;
                    k0.m(c);
                    if (d < c.length) {
                        final File[] c2 = this.c;
                        k0.m(c2);
                        return c2[this.d++];
                    }
                }
                if (!this.b) {
                    this.b = true;
                    return ((k.c)this).a();
                }
                final l g = k.g(k.this);
                if (g != null) {
                    final j2 j3 = g.invoke(((k.c)this).a());
                }
                return null;
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\n" }, d2 = { "kotlin/io/k$b$b", "Lkotlin/io/k$c;", "Ljava/io/File;", "b", "", "Z", "visited", "rootFile", "<init>", "(Lkotlin/io/k$b;Ljava/io/File;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
        private final class b extends k.c
        {
            private boolean b;
            
            public b(final File file) {
                k0.p(file, "rootFile");
                super(file);
            }
            
            @f
            @Override
            public File b() {
                if (this.b) {
                    return null;
                }
                this.b = true;
                return ((k.c)this).a();
            }
        }
        
        @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u001e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u0012" }, d2 = { "kotlin/io/k$b$c", "Lkotlin/io/k$a;", "Ljava/io/File;", "b", "", "d", "I", "fileIndex", "", "c", "[Ljava/io/File;", "fileList", "", "Z", "rootVisited", "rootDir", "<init>", "(Lkotlin/io/k$b;Ljava/io/File;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
        private final class c extends k.a
        {
            private boolean b;
            private File[] c;
            private int d;
            
            public c(final File file) {
                k0.p(file, "rootDir");
                super(file);
            }
            
            @f
            @Override
            public File b() {
                if (this.b) {
                    final File[] c = this.c;
                    if (c != null) {
                        final int d = this.d;
                        k0.m(c);
                        if (d >= c.length) {
                            final l g = k.g(k.this);
                            if (g != null) {
                                final j2 j2 = g.invoke(((k.c)this).a());
                            }
                            return null;
                        }
                    }
                    Label_0229: {
                        if (this.c == null) {
                            if ((this.c = ((k.c)this).a().listFiles()) == null) {
                                final p f = k.f(k.this);
                                if (f != null) {
                                    final j2 j3 = f.invoke(((k.c)this).a(), new a(((k.c)this).a(), null, "Cannot list files in a directory", 2, null));
                                }
                            }
                            final File[] c2 = this.c;
                            if (c2 != null) {
                                k0.m(c2);
                                if (c2.length != 0) {
                                    break Label_0229;
                                }
                            }
                            final l g2 = k.g(k.this);
                            if (g2 != null) {
                                final j2 j4 = g2.invoke(((k.c)this).a());
                            }
                            return null;
                        }
                    }
                    final File[] c3 = this.c;
                    k0.m(c3);
                    return c3[this.d++];
                }
                final l e = k.e(k.this);
                if (e != null && !e.invoke(((k.c)this).a())) {
                    return null;
                }
                this.b = true;
                return ((k.c)this).a();
            }
        }
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\"\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006¨\u0006\n" }, d2 = { "kotlin/io/k$c", "", "Ljava/io/File;", "b", "a", "Ljava/io/File;", "()Ljava/io/File;", "root", "<init>", "(Ljava/io/File;)V", "kotlin-stdlib" }, k = 1, mv = { 1, 5, 1 })
    private abstract static class c
    {
        @e
        private final File a;
        
        public c(@e final File a) {
            k0.p(a, "root");
            this.a = a;
        }
        
        @e
        public final File a() {
            return this.a;
        }
        
        @f
        public abstract File b();
    }
}
