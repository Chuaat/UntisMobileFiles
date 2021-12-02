// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.app;

import androidx.annotation.i;
import android.annotation.SuppressLint;
import androidx.lifecycle.q0;
import androidx.annotation.k0;
import android.os.Bundle;
import androidx.annotation.j0;
import androidx.lifecycle.s;
import android.view.View;
import android.view.Window$Callback;
import android.view.KeyEvent;
import androidx.lifecycle.a0;
import androidx.collection.m;
import androidx.annotation.t0;
import androidx.core.view.k;
import androidx.lifecycle.y;
import android.app.Activity;

@t0({ t0.a.I })
public class j extends Activity implements y, k.a
{
    private m<Class<? extends a>, a> mExtraDataMap;
    private a0 mLifecycleRegistry;
    
    public j() {
        this.mExtraDataMap = new m<Class<? extends a>, a>();
        this.mLifecycleRegistry = new a0(this);
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        final View decorView = this.getWindow().getDecorView();
        return (decorView != null && k.d(decorView, keyEvent)) || k.e((k.a)this, decorView, (Window$Callback)this, keyEvent);
    }
    
    public boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        final View decorView = this.getWindow().getDecorView();
        return (decorView != null && k.d(decorView, keyEvent)) || super.dispatchKeyShortcutEvent(keyEvent);
    }
    
    @Deprecated
    @t0({ t0.a.I })
    public <T extends a> T getExtraData(final Class<T> clazz) {
        return (T)this.mExtraDataMap.get(clazz);
    }
    
    @j0
    public s getLifecycle() {
        return this.mLifecycleRegistry;
    }
    
    @SuppressLint({ "RestrictedApi" })
    protected void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        q0.g(this);
    }
    
    @i
    protected void onSaveInstanceState(@j0 final Bundle bundle) {
        this.mLifecycleRegistry.l(s.c.I);
        super.onSaveInstanceState(bundle);
    }
    
    @Deprecated
    @t0({ t0.a.I })
    public void putExtraData(final a a) {
        this.mExtraDataMap.put(a.getClass(), a);
    }
    
    @t0({ t0.a.I })
    public boolean superDispatchKeyEvent(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
    
    @Deprecated
    @t0({ t0.a.I })
    public static class a
    {
    }
}
