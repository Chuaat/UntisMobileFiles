// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.annotation.j0;

class a
{
    @j0
    private final f.d a;
    @j0
    private final Handler b;
    
    a(@j0 final f.d a) {
        this.a = a;
        this.b = androidx.core.provider.b.a();
    }
    
    a(@j0 final f.d a, @j0 final Handler b) {
        this.a = a;
        this.b = b;
    }
    
    private void a(final int n) {
        this.b.post((Runnable)new Runnable() {
            final /* synthetic */ f.d G = androidx.core.provider.a.this.a;
            
            @Override
            public void run() {
                this.G.a(n);
            }
        });
    }
    
    private void c(@j0 final Typeface typeface) {
        this.b.post((Runnable)new Runnable() {
            final /* synthetic */ f.d G = androidx.core.provider.a.this.a;
            
            @Override
            public void run() {
                this.G.b(typeface);
            }
        });
    }
    
    void b(@j0 final e.e e) {
        if (e.a()) {
            this.c(e.a);
        }
        else {
            this.a(e.b);
        }
    }
}
