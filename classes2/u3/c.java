// 
// Decompiled by Procyon v0.5.36
// 

package u3;

import kotlin.j2;
import com.google.firebase.remoteconfig.r;
import com.google.firebase.ktx.b;
import kotlin.jvm.internal.k0;
import com.google.firebase.remoteconfig.s;
import com.google.firebase.remoteconfig.l;
import org.jetbrains.annotations.e;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0012\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0015\u0010\b\u001a\u00020\u0007*\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0086\u0002\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0017\u0010\r\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0002\b\f\"\u0017\u0010\u0012\u001a\u00020\u0003*\u00020\u00008F@\u0006¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013" }, d2 = { "Lcom/google/firebase/ktx/b;", "Lcom/google/firebase/e;", "app", "Lcom/google/firebase/remoteconfig/l;", "c", "", "key", "Lcom/google/firebase/remoteconfig/s;", "a", "Lkotlin/Function1;", "Lcom/google/firebase/remoteconfig/r$b;", "Lkotlin/j2;", "Lkotlin/s;", "init", "Lcom/google/firebase/remoteconfig/r;", "d", "b", "(Lcom/google/firebase/ktx/b;)Lcom/google/firebase/remoteconfig/l;", "remoteConfig", "com.google.firebase-firebase-config-ktx" }, k = 2, mv = { 1, 4, 0 })
public final class c
{
    @e
    public static final String a = "fire-cfg-ktx";
    
    @e
    public static final s a(@e final l l, @e final String s) {
        k0.q(l, "receiver$0");
        k0.q(s, "key");
        final s p2 = l.p(s);
        k0.h(p2, "this.getValue(key)");
        return p2;
    }
    
    @e
    public static final l b(@e final b b) {
        k0.q(b, "receiver$0");
        final l k = l.k();
        k0.h(k, "FirebaseRemoteConfig.getInstance()");
        return k;
    }
    
    @e
    public static final l c(@e final b b, @e final com.google.firebase.e e) {
        k0.q(b, "receiver$0");
        k0.q(e, "app");
        final l l = com.google.firebase.remoteconfig.l.l(e);
        k0.h(l, "FirebaseRemoteConfig.getInstance(app)");
        return l;
    }
    
    @e
    public static final r d(@e final n6.l<? super r.b, j2> l) {
        k0.q(l, "init");
        final r.b b = new r.b();
        l.invoke(b);
        final r c = b.c();
        k0.h(c, "builder.build()");
        return c;
    }
}
