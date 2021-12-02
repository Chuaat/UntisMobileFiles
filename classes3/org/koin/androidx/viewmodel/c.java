// 
// Decompiled by Procyon v0.5.36
// 

package org.koin.androidx.viewmodel;

import kotlin.jvm.internal.w;
import kotlin.jvm.internal.k0;
import androidx.lifecycle.d1;
import org.jetbrains.annotations.f;
import l7.a;
import androidx.lifecycle.y;
import org.jetbrains.annotations.e;
import kotlin.reflect.d;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001BY\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b\u0012\u0006\u0010\u001c\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000f\u0012\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0018\u00010\rj\u0004\u0018\u0001`\u0015¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\b8\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR'\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rj\u0004\u0018\u0001`\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R'\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0018\u00010\rj\u0004\u0018\u0001`\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0019\u0010\u001c\u001a\u00020\u00188\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001f" }, d2 = { "Lorg/koin/androidx/viewmodel/c;", "", "T", "Ll7/a;", "qualifier", "Ll7/a;", "e", "()Ll7/a;", "Lkotlin/reflect/d;", "a", "Lkotlin/reflect/d;", "()Lkotlin/reflect/d;", "clazz", "Lkotlin/Function0;", "Landroidx/lifecycle/d1;", "Lorg/koin/androidx/viewmodel/ViewModelStoreOwnerDefinition;", "from", "Ln6/a;", "b", "()Ln6/a;", "Lorg/koin/core/parameter/a;", "Lorg/koin/core/parameter/ParametersDefinition;", "parameters", "d", "Landroidx/lifecycle/y;", "Landroidx/lifecycle/y;", "c", "()Landroidx/lifecycle/y;", "owner", "<init>", "(Lkotlin/reflect/d;Landroidx/lifecycle/y;Ll7/a;Ln6/a;Ln6/a;)V", "koin-androidx-viewmodel_release" }, k = 1, mv = { 1, 4, 0 })
public final class c<T>
{
    @e
    private final d<T> a;
    @e
    private final y b;
    @f
    private final a c;
    @f
    private final n6.a<d1> d;
    @f
    private final n6.a<org.koin.core.parameter.a> e;
    
    public c(@e final d<T> a, @e final y b, @f final a c, @f final n6.a<? extends d1> d, @f final n6.a<org.koin.core.parameter.a> e) {
        k0.q((Object)a, "clazz");
        k0.q((Object)b, "owner");
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = (n6.a<d1>)d;
        this.e = e;
    }
    
    @e
    public final d<T> a() {
        return this.a;
    }
    
    @f
    public final n6.a<d1> b() {
        return this.d;
    }
    
    @e
    public final y c() {
        return this.b;
    }
    
    @f
    public final n6.a<org.koin.core.parameter.a> d() {
        return this.e;
    }
    
    @f
    public final a e() {
        return this.c;
    }
}
