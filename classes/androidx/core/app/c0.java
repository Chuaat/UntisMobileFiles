// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import androidx.core.content.d;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.app.PendingIntent;
import androidx.annotation.k0;
import java.util.Iterator;
import android.content.pm.PackageManager$NameNotFoundException;
import android.util.Log;
import android.app.Activity;
import android.content.ComponentName;
import androidx.annotation.j0;
import android.content.Context;
import java.util.ArrayList;
import android.content.Intent;

public final class c0 implements Iterable<Intent>
{
    private static final String I = "TaskStackBuilder";
    private final ArrayList<Intent> G;
    private final Context H;
    
    private c0(final Context h) {
        this.G = new ArrayList<Intent>();
        this.H = h;
    }
    
    @j0
    public static c0 l(@j0 final Context context) {
        return new c0(context);
    }
    
    @Deprecated
    public static c0 n(final Context context) {
        return l(context);
    }
    
    @j0
    public c0 b(@j0 final Intent e) {
        this.G.add(e);
        return this;
    }
    
    @j0
    public c0 f(@j0 final Intent intent) {
        ComponentName componentName;
        if ((componentName = intent.getComponent()) == null) {
            componentName = intent.resolveActivity(this.H.getPackageManager());
        }
        if (componentName != null) {
            this.i(componentName);
        }
        this.b(intent);
        return this;
    }
    
    @j0
    public c0 h(@j0 final Activity activity) {
        Intent supportParentActivityIntent;
        if (activity instanceof a) {
            supportParentActivityIntent = ((a)activity).getSupportParentActivityIntent();
        }
        else {
            supportParentActivityIntent = null;
        }
        Intent a = supportParentActivityIntent;
        if (supportParentActivityIntent == null) {
            a = n.a(activity);
        }
        if (a != null) {
            ComponentName componentName;
            if ((componentName = a.getComponent()) == null) {
                componentName = a.resolveActivity(this.H.getPackageManager());
            }
            this.i(componentName);
            this.b(a);
        }
        return this;
    }
    
    public c0 i(ComponentName component) {
        final int size = this.G.size();
        try {
            Context context = this.H;
            while (true) {
                final Intent b = n.b(context, component);
                if (b == null) {
                    break;
                }
                this.G.add(size, b);
                context = this.H;
                component = b.getComponent();
            }
            return this;
        }
        catch (PackageManager$NameNotFoundException cause) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException((Throwable)cause);
        }
    }
    
    @Deprecated
    @Override
    public Iterator<Intent> iterator() {
        return this.G.iterator();
    }
    
    @j0
    public c0 k(@j0 final Class<?> clazz) {
        return this.i(new ComponentName(this.H, (Class)clazz));
    }
    
    @k0
    public Intent m(final int index) {
        return this.G.get(index);
    }
    
    @Deprecated
    public Intent o(final int n) {
        return this.m(n);
    }
    
    public int p() {
        return this.G.size();
    }
    
    @j0
    public Intent[] q() {
        final int size = this.G.size();
        final Intent[] array = new Intent[size];
        if (size == 0) {
            return array;
        }
        array[0] = new Intent((Intent)this.G.get(0)).addFlags(268484608);
        for (int i = 1; i < size; ++i) {
            array[i] = new Intent((Intent)this.G.get(i));
        }
        return array;
    }
    
    @k0
    public PendingIntent r(final int n, final int n2) {
        return this.t(n, n2, null);
    }
    
    @k0
    public PendingIntent t(final int n, final int n2, @k0 final Bundle bundle) {
        if (this.G.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot getPendingIntent");
        }
        final ArrayList<Intent> g = this.G;
        final Intent[] array = g.toArray(new Intent[g.size()]);
        array[0] = new Intent(array[0]).addFlags(268484608);
        if (Build$VERSION.SDK_INT >= 16) {
            return PendingIntent.getActivities(this.H, n, array, n2, bundle);
        }
        return PendingIntent.getActivities(this.H, n, array, n2);
    }
    
    public void v() {
        this.w(null);
    }
    
    public void w(@k0 final Bundle bundle) {
        if (!this.G.isEmpty()) {
            final ArrayList<Intent> g = this.G;
            final Intent[] array = g.toArray(new Intent[g.size()]);
            array[0] = new Intent(array[0]).addFlags(268484608);
            if (!d.s(this.H, array, bundle)) {
                final Intent intent = new Intent(array[array.length - 1]);
                intent.addFlags(268435456);
                this.H.startActivity(intent);
            }
            return;
        }
        throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    }
    
    public interface a
    {
        @k0
        Intent getSupportParentActivityIntent();
    }
}
