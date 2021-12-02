// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.core.instance;

import n6.p;
import n6.l;
import kotlin.collections.v;
import kotlin.text.s;
import java.util.ArrayList;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.koin.core.definition.b;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000 \u0005*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\fB\u0015\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\r¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0005\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\nH&R\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\r8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014" }, d2 = { "Lorg/koin/core/instance/a;", "T", "", "Lorg/koin/core/instance/c;", "context", "c", "(Lorg/koin/core/instance/c;)Ljava/lang/Object;", "b", "", "e", "Lkotlin/j2;", "f", "a", "Lorg/koin/core/definition/b;", "Lorg/koin/core/definition/b;", "d", "()Lorg/koin/core/definition/b;", "beanDefinition", "<init>", "(Lorg/koin/core/definition/b;)V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
public abstract class a<T>
{
    @e
    public static final String b = "\n\t";
    public static final a c;
    @e
    private final b<T> a;
    
    static {
        c = new a(null);
    }
    
    public a(@e final b<T> a) {
        k0.q((Object)a, "beanDefinition");
        this.a = a;
    }
    
    public abstract void a();
    
    public <T> T b(@e final c c) {
        k0.q((Object)c, "context");
        final org.koin.core.b.a c2 = org.koin.core.b.c;
        if (c2.b().e(org.koin.core.logger.b.G)) {
            final org.koin.core.logger.c b = c2.b();
            final StringBuilder sb = new StringBuilder();
            sb.append("| create instance for ");
            sb.append(this.a);
            b.a(sb.toString());
        }
        try {
            final a b2 = c.b();
            final n6.p<org.koin.core.scope.a, a, T> c3 = this.a.c();
            final org.koin.core.scope.a c4 = c.c();
            if (c4 != null) {
                return (T)c3.invoke((Object)c4, (Object)b2);
            }
            throw new IllegalStateException("Can't execute definition instance while this context is not registered against any Koin instance".toString());
        }
        catch (Exception ex) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(ex.toString());
            sb2.append("\n\t");
            final StackTraceElement[] stackTrace = ex.getStackTrace();
            k0.h((Object)stackTrace, "e.stackTrace");
            final ArrayList<StackTraceElement> list = new ArrayList<StackTraceElement>();
            for (final StackTraceElement e : stackTrace) {
                k0.h((Object)e, "it");
                final String className = e.getClassName();
                k0.h((Object)className, "it.className");
                if (!(s.V2(className, "sun.reflect", false, 2, null) ^ true)) {
                    break;
                }
                list.add(e);
            }
            sb2.append(v.Z2((Iterable)list, (CharSequence)"\n\t", (CharSequence)null, (CharSequence)null, 0, (CharSequence)null, (l)null, 62, (Object)null));
            final String string = sb2.toString();
            final org.koin.core.logger.c b3 = org.koin.core.b.c.b();
            final StringBuilder sb3 = new StringBuilder();
            sb3.append("Instance creation error : could not create instance for ");
            sb3.append(this.a);
            sb3.append(": ");
            sb3.append(string);
            b3.b(sb3.toString());
            final StringBuilder sb4 = new StringBuilder();
            sb4.append("Could not create instance for ");
            sb4.append(this.a);
            throw new k7.c(sb4.toString(), ex);
        }
    }
    
    public abstract <T> T c(@e final c p0);
    
    @e
    public final b<T> d() {
        return this.a;
    }
    
    public abstract boolean e(@e final c p0);
    
    public abstract void f(@e final c p0);
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007" }, d2 = { "org/koin/core/instance/a$a", "", "", "ERROR_SEPARATOR", "Ljava/lang/String;", "<init>", "()V", "koin-core" }, k = 1, mv = { 1, 4, 0 })
    public static final class a
    {
        private a() {
        }
    }
}
