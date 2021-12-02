// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.androidx.viewmodel;

import androidx.activity.ComponentActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.d1;
import androidx.lifecycle.y;
import kotlin.s0;
import kotlin.jvm.internal.m0;
import org.koin.core.b;
import kotlin.reflect.d;
import androidx.lifecycle.z0$b;
import kotlin.jvm.internal.k0;
import androidx.lifecycle.z0;
import androidx.lifecycle.w0;
import androidx.lifecycle.c1;
import org.koin.core.scope.a;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a)\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\b\u0010\t\u001a\"\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u001a*\u0010\u000f\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0010" }, d2 = { "Landroidx/lifecycle/w0;", "T", "Lorg/koin/core/a;", "Lorg/koin/androidx/viewmodel/c;", "parameters", "c", "(Lorg/koin/core/a;Lorg/koin/androidx/viewmodel/c;)Landroidx/lifecycle/w0;", "Landroidx/lifecycle/z0;", "b", "(Landroidx/lifecycle/z0;Lorg/koin/androidx/viewmodel/c;)Landroidx/lifecycle/w0;", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/c1;", "d", "Lorg/koin/core/scope/a;", "vmStore", "a", "koin-androidx-viewmodel_release" }, k = 2, mv = { 1, 4, 0 })
public final class e
{
    @org.jetbrains.annotations.e
    public static final <T extends w0> z0 a(@org.jetbrains.annotations.e final a a, @org.jetbrains.annotations.e final c1 c1, @org.jetbrains.annotations.e final c<T> c2) {
        k0.q((Object)a, "$this$createViewModelProvider");
        k0.q((Object)c1, "vmStore");
        k0.q((Object)c2, "parameters");
        return new z0(c1, (z0$b)new z0$b() {
            @org.jetbrains.annotations.e
            public <T extends w0> T a(@org.jetbrains.annotations.e final Class<T> clazz) {
                k0.q((Object)clazz, "modelClass");
                return a.t(c2.a(), c2.e(), c2.d());
            }
        });
    }
    
    @org.jetbrains.annotations.e
    public static final <T extends w0> T b(@org.jetbrains.annotations.e final z0 z0, @org.jetbrains.annotations.e final c<T> c) {
        k0.q((Object)z0, "$this$getInstance");
        k0.q((Object)c, "parameters");
        final Class c2 = m6.a.c((d)c.a());
        final b.a c3 = b.c;
        if (c3.b().e(org.koin.core.logger.b.G)) {
            c3.b().a("!- ViewModelProvider getting instance");
            final kotlin.s0<Object, Double> a = n7.a.a((n6.a<?>)new n6.a<T>() {
                @org.jetbrains.annotations.e
                public final T invoke() {
                    w0 w0;
                    if (c.e() != null) {
                        w0 = z0.b(c.e().toString(), c2);
                    }
                    else {
                        w0 = z0.a(c2);
                    }
                    return (T)w0;
                }
            });
            final w0 w0 = (w0)a.a();
            final double doubleValue = ((Number)a.b()).doubleValue();
            final org.koin.core.logger.c b = c3.b();
            final StringBuilder sb = new StringBuilder();
            sb.append("!- ViewModelProvider got instance in ");
            sb.append(doubleValue);
            b.a(sb.toString());
            k0.h((Object)w0, "instance");
            return (T)w0;
        }
        w0 w2;
        if (c.e() != null) {
            w2 = z0.b(c.e().toString(), c2);
        }
        else {
            w2 = z0.a(c2);
        }
        k0.h((Object)w2, "if (parameters.qualifier\u2026.get(javaClass)\n        }");
        return (T)w2;
    }
    
    @org.jetbrains.annotations.e
    public static final <T extends w0> T c(@org.jetbrains.annotations.e final org.koin.core.a a, @org.jetbrains.annotations.e final c<T> c) {
        k0.q((Object)a, "$this$getViewModel");
        k0.q((Object)c, "parameters");
        return b(a(a.y(), d(c.c(), c), c), c);
    }
    
    @org.jetbrains.annotations.e
    public static final <T extends w0> c1 d(@org.jetbrains.annotations.e final y obj, @org.jetbrains.annotations.e final c<T> c) {
        k0.q((Object)obj, "$this$getViewModelStore");
        k0.q((Object)c, "parameters");
        c1 c2;
        if (c.b() != null) {
            c2 = ((d1)c.b().invoke()).getViewModelStore();
            k0.h((Object)c2, "parameters.from.invoke().viewModelStore");
        }
        else {
            if (obj instanceof androidx.fragment.app.d) {
                c2 = ((ComponentActivity)obj).getViewModelStore();
            }
            else {
                if (!(obj instanceof Fragment)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Can't getByClass ViewModel '");
                    sb.append(c.a());
                    sb.append("' on ");
                    sb.append(obj);
                    sb.append(" - Is not a FragmentActivity nor a Fragment neither a valid ViewModelStoreOwner");
                    throw new IllegalStateException(sb.toString().toString());
                }
                c2 = ((Fragment)obj).getViewModelStore();
            }
            k0.h((Object)c2, "this.viewModelStore");
        }
        return c2;
    }
}
