// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import androidx.annotation.j0;
import android.annotation.SuppressLint;
import android.app.Application;

public class b extends w0
{
    @SuppressLint({ "StaticFieldLeak" })
    private Application a;
    
    public b(@j0 final Application a) {
        this.a = a;
    }
    
    @j0
    public <T extends Application> T a() {
        return (T)this.a;
    }
}
