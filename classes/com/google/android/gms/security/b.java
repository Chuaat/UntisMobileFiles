// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.security;

import com.google.android.gms.common.j;
import com.google.android.gms.common.i;
import android.content.Context;
import android.os.AsyncTask;

final class b extends AsyncTask<Void, Void, Integer>
{
    private final /* synthetic */ Context a;
    private final /* synthetic */ a.a b;
    
    b(final Context a, final a.a b) {
        this.a = a;
        this.b = b;
    }
    
    private final Integer a(final Void... array) {
        try {
            com.google.android.gms.security.a.a(this.a);
            return 0;
        }
        catch (i j) {
            return j.G;
        }
        catch (j k) {
            return k.b();
        }
    }
}
