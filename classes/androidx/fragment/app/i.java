// 
// Decompiled by Procyon v0.5.36
// 

package androidx.fragment.app;

import android.content.IntentSender$SendIntentException;
import androidx.core.app.a;
import android.content.IntentSender;
import android.os.Bundle;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.view.LayoutInflater;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.view.View;
import androidx.core.util.n;
import android.os.Handler;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.k0;
import android.app.Activity;

public abstract class i<E> extends f
{
    @k0
    private final Activity G;
    @j0
    private final Context H;
    @j0
    private final Handler I;
    private final int J;
    final FragmentManager K;
    
    i(@k0 final Activity g, @j0 final Context context, @j0 final Handler handler, final int j) {
        this.K = new l();
        this.G = g;
        this.H = n.h(context, "context == null");
        this.I = n.h(handler, "handler == null");
        this.J = j;
    }
    
    public i(@j0 final Context context, @j0 final Handler handler, final int n) {
        Activity activity;
        if (context instanceof Activity) {
            activity = (Activity)context;
        }
        else {
            activity = null;
        }
        this(activity, context, handler, n);
    }
    
    i(@j0 final d d) {
        this(d, (Context)d, new Handler(), 0);
    }
    
    @k0
    @Override
    public View c(final int n) {
        return null;
    }
    
    @Override
    public boolean d() {
        return true;
    }
    
    @k0
    Activity e() {
        return this.G;
    }
    
    @j0
    Context f() {
        return this.H;
    }
    
    @j0
    Handler g() {
        return this.I;
    }
    
    public void h(@j0 final String s, @k0 final FileDescriptor fileDescriptor, @j0 final PrintWriter printWriter, @k0 final String[] array) {
    }
    
    @k0
    public abstract E i();
    
    @j0
    public LayoutInflater j() {
        return LayoutInflater.from(this.H);
    }
    
    public int k() {
        return this.J;
    }
    
    public boolean l() {
        return true;
    }
    
    @Deprecated
    public void m(@j0 final Fragment fragment, @j0 final String[] array, final int n) {
    }
    
    public boolean n(@j0 final Fragment fragment) {
        return true;
    }
    
    public boolean o(@j0 final String s) {
        return false;
    }
    
    public void p(@j0 final Fragment fragment, @SuppressLint({ "UnknownNullness" }) final Intent intent, final int n) {
        this.q(fragment, intent, n, null);
    }
    
    public void q(@j0 final Fragment fragment, @SuppressLint({ "UnknownNullness" }) final Intent intent, final int n, @k0 final Bundle bundle) {
        if (n == -1) {
            androidx.core.content.d.t(this.H, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }
    
    @Deprecated
    public void r(@j0 final Fragment fragment, @SuppressLint({ "UnknownNullness" }) final IntentSender intentSender, final int n, @k0 final Intent intent, final int n2, final int n3, final int n4, @k0 final Bundle bundle) throws IntentSender$SendIntentException {
        if (n == -1) {
            a.L(this.G, intentSender, n, intent, n2, n3, n4, bundle);
            return;
        }
        throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
    }
    
    public void s() {
    }
}
