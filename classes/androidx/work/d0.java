// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work;

import androidx.lifecycle.LiveData;
import x2.a;
import android.app.PendingIntent;
import java.util.UUID;
import java.util.List;
import java.util.Collections;
import androidx.work.impl.j;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.t0;
import android.annotation.SuppressLint;

@SuppressLint({ "AddedAbstractMethod" })
public abstract class d0
{
    @t0({ t0.a.H })
    protected d0() {
    }
    
    public static void A(@j0 final Context context, @j0 final b b) {
        j.A(context, b);
    }
    
    @Deprecated
    @j0
    public static d0 o() {
        final j g = j.G();
        if (g != null) {
            return g;
        }
        throw new IllegalStateException("WorkManager is not initialized properly.  The most likely cause is that you disabled WorkManagerInitializer in your manifest but forgot to call WorkManager#initialize in your Application#onCreate or a ContentProvider.");
    }
    
    @j0
    public static d0 p(@j0 final Context context) {
        return j.H(context);
    }
    
    @j0
    public abstract u B();
    
    @j0
    public final b0 a(@j0 final String s, @j0 final k k, @j0 final s o) {
        return this.b(s, k, Collections.singletonList(o));
    }
    
    @j0
    public abstract b0 b(@j0 final String p0, @j0 final k p1, @j0 final List<s> p2);
    
    @j0
    public final b0 c(@j0 final s o) {
        return this.d(Collections.singletonList(o));
    }
    
    @j0
    public abstract b0 d(@j0 final List<s> p0);
    
    @j0
    public abstract u e();
    
    @j0
    public abstract u f(@j0 final String p0);
    
    @j0
    public abstract u g(@j0 final String p0);
    
    @j0
    public abstract u h(@j0 final UUID p0);
    
    @j0
    public abstract PendingIntent i(@j0 final UUID p0);
    
    @j0
    public final u j(@j0 final f0 o) {
        return this.k(Collections.singletonList(o));
    }
    
    @j0
    public abstract u k(@j0 final List<? extends f0> p0);
    
    @j0
    public abstract u l(@j0 final String p0, @j0 final androidx.work.j p1, @j0 final w p2);
    
    @j0
    public u m(@j0 final String s, @j0 final k k, @j0 final s o) {
        return this.n(s, k, Collections.singletonList(o));
    }
    
    @j0
    public abstract u n(@j0 final String p0, @j0 final k p1, @j0 final List<s> p2);
    
    @j0
    public abstract a<Long> q();
    
    @j0
    public abstract LiveData<Long> r();
    
    @j0
    public abstract a<c0> s(@j0 final UUID p0);
    
    @j0
    public abstract LiveData<c0> t(@j0 final UUID p0);
    
    @j0
    public abstract a<List<c0>> u(@j0 final e0 p0);
    
    @j0
    public abstract a<List<c0>> v(@j0 final String p0);
    
    @j0
    public abstract LiveData<List<c0>> w(@j0 final String p0);
    
    @j0
    public abstract a<List<c0>> x(@j0 final String p0);
    
    @j0
    public abstract LiveData<List<c0>> y(@j0 final String p0);
    
    @j0
    public abstract LiveData<List<c0>> z(@j0 final e0 p0);
}
