// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.util.Log;
import android.view.View;
import android.content.Intent;
import android.content.Context;
import android.view.View$OnClickListener;

final class o implements View$OnClickListener
{
    private final /* synthetic */ Context G;
    private final /* synthetic */ Intent H;
    
    o(final Context g, final Intent h) {
        this.G = g;
        this.H = h;
    }
    
    public final void onClick(final View view) {
        try {
            this.G.startActivity(this.H);
        }
        catch (ActivityNotFoundException ex) {
            Log.e("DeferredLifecycleHelper", "Failed to start resolution intent", (Throwable)ex);
        }
    }
}
