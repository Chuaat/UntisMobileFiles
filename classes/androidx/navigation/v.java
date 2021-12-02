// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import androidx.annotation.i0;
import androidx.annotation.y;
import android.content.ComponentName;
import androidx.annotation.k0;
import android.os.Parcelable;
import androidx.core.app.c0;
import android.app.PendingIntent;
import java.util.Iterator;
import java.util.ArrayDeque;
import android.app.Activity;
import androidx.annotation.j0;
import android.os.Bundle;
import android.content.Intent;
import android.content.Context;

public final class v
{
    private final Context a;
    private final Intent b;
    private e0 c;
    private int d;
    private Bundle e;
    
    public v(@j0 final Context a) {
        this.a = a;
        if (a instanceof Activity) {
            this.b = new Intent(a, (Class)a.getClass());
        }
        else {
            Intent launchIntentForPackage = a.getPackageManager().getLaunchIntentForPackage(a.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
            this.b = launchIntentForPackage;
        }
        this.b.addFlags(268468224);
    }
    
    v(@j0 final NavController navController) {
        this(navController.i());
        this.c = navController.m();
    }
    
    private void c() {
        final ArrayDeque<e0> arrayDeque = new ArrayDeque<e0>();
        arrayDeque.add(this.c);
        a0 a0 = null;
        while (!arrayDeque.isEmpty() && a0 == null) {
            final e0 e0 = arrayDeque.poll();
            if (e0.p() == this.d) {
                a0 = e0;
            }
            else {
                if (!(e0 instanceof e0)) {
                    continue;
                }
                final Iterator<a0> iterator = e0.iterator();
                while (iterator.hasNext()) {
                    arrayDeque.add((e0)iterator.next());
                }
            }
        }
        if (a0 != null) {
            this.b.putExtra("android-support-nav:controller:deepLinkIds", a0.k());
            return;
        }
        final String o = androidx.navigation.a0.o(this.a, this.d);
        final StringBuilder sb = new StringBuilder();
        sb.append("Navigation destination ");
        sb.append(o);
        sb.append(" cannot be found in the navigation graph ");
        sb.append(this.c);
        throw new IllegalArgumentException(sb.toString());
    }
    
    @j0
    public PendingIntent a() {
        final Bundle e = this.e;
        int n = 0;
        if (e != null) {
            final Iterator iterator = e.keySet().iterator();
            n = 0;
            while (iterator.hasNext()) {
                final Object value = this.e.get((String)iterator.next());
                int hashCode;
                if (value != null) {
                    hashCode = value.hashCode();
                }
                else {
                    hashCode = 0;
                }
                n = n * 31 + hashCode;
            }
        }
        return this.b().r(n * 31 + this.d, 134217728);
    }
    
    @j0
    public c0 b() {
        if (this.b.getIntArrayExtra("android-support-nav:controller:deepLinkIds") != null) {
            final c0 f = c0.l(this.a).f(new Intent(this.b));
            for (int i = 0; i < f.p(); ++i) {
                f.m(i).putExtra("android-support-nav:controller:deepLinkIntent", (Parcelable)this.b);
            }
            return f;
        }
        if (this.c == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        throw new IllegalStateException("You must call setDestination() before constructing the deep link");
    }
    
    @j0
    public v d(@k0 final Bundle e) {
        this.e = e;
        this.b.putExtra("android-support-nav:controller:deepLinkExtras", e);
        return this;
    }
    
    @j0
    public v e(@j0 final ComponentName component) {
        this.b.setComponent(component);
        return this;
    }
    
    @j0
    public v f(@j0 final Class<? extends Activity> clazz) {
        return this.e(new ComponentName(this.a, (Class)clazz));
    }
    
    @j0
    public v g(@y final int d) {
        this.d = d;
        if (this.c != null) {
            this.c();
        }
        return this;
    }
    
    @j0
    public v h(@i0 final int n) {
        return this.i(new n0(this.a, new a()).c(n));
    }
    
    @j0
    public v i(@j0 final e0 c) {
        this.c = c;
        if (this.d != 0) {
            this.c();
        }
        return this;
    }
    
    private static class a extends v0
    {
        private final u0<a0> c;
        
        a() {
            this.c = new u0<a0>() {
                @j0
                @Override
                public a0 a() {
                    return new a0("permissive");
                }
                
                @k0
                @Override
                public a0 b(@j0 final a0 a0, @k0 final Bundle bundle, @k0 final o0 o0, @k0 final u0.a a2) {
                    throw new IllegalStateException("navigate is not supported");
                }
                
                @Override
                public boolean e() {
                    throw new IllegalStateException("popBackStack is not supported");
                }
            };
            this.a(new androidx.navigation.i0(this));
        }
        
        @j0
        @Override
        public u0<? extends a0> e(@j0 final String s) {
            try {
                return super.e(s);
            }
            catch (IllegalStateException ex) {
                return this.c;
            }
        }
    }
}
