// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.android;

import android.os.Looper;
import io.realm.internal.a;
import c6.h;
import io.realm.internal.OsSharedRealm;
import android.os.Handler;
import io.realm.internal.Keep;
import io.realm.internal.RealmNotifier;

@Keep
public class AndroidRealmNotifier extends RealmNotifier
{
    private Handler handler;
    
    public AndroidRealmNotifier(@h final OsSharedRealm osSharedRealm, final a a) {
        super(osSharedRealm);
        Handler handler;
        if (a.a()) {
            handler = new Handler(Looper.myLooper());
        }
        else {
            handler = null;
        }
        this.handler = handler;
    }
    
    @Override
    public boolean post(final Runnable runnable) {
        final Handler handler = this.handler;
        return handler != null && handler.post(runnable);
    }
}
