// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit;

import android.annotation.SuppressLint;
import androidx.webkit.internal.u;
import androidx.annotation.j0;
import androidx.webkit.internal.v;
import androidx.webkit.internal.s;
import android.webkit.WebResourceRequest;

public class o
{
    private o() {
    }
    
    private static s a(final WebResourceRequest webResourceRequest) {
        return v.c().j(webResourceRequest);
    }
    
    @SuppressLint({ "NewApi" })
    public static boolean b(@j0 final WebResourceRequest webResourceRequest) {
        final u d0 = u.d0;
        if (d0.j()) {
            return webResourceRequest.isRedirect();
        }
        if (d0.k()) {
            return a(webResourceRequest).a();
        }
        throw u.f();
    }
}
