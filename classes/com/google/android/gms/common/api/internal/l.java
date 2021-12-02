// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.api.internal;

import androidx.fragment.app.d;
import androidx.annotation.j0;
import android.content.ContextWrapper;
import com.google.android.gms.common.internal.x;
import androidx.annotation.RecentlyNonNull;
import android.app.Activity;
import f2.a;

@a
public class l
{
    private final Object a;
    
    public l(@RecentlyNonNull final Activity activity) {
        this.a = x.l(activity, "Activity must not be null");
    }
    
    @a
    public l(@RecentlyNonNull final ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
    
    @j0
    @a
    public Activity a() {
        return (Activity)this.a;
    }
    
    @j0
    @a
    public d b() {
        return (d)this.a;
    }
    
    @j0
    @a
    public Object c() {
        return this.a;
    }
    
    @RecentlyNonNull
    @a
    public boolean d() {
        return false;
    }
    
    @RecentlyNonNull
    @a
    public boolean e() {
        return this.a instanceof d;
    }
    
    @RecentlyNonNull
    public final boolean f() {
        return this.a instanceof Activity;
    }
}
