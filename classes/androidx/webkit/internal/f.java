// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import java.util.concurrent.Executor;
import androidx.annotation.b1;
import androidx.annotation.j0;
import androidx.webkit.b;
import java.util.List;
import org.chromium.support_lib_boundary.ProxyControllerBoundaryInterface;
import androidx.webkit.c;

public class f extends c
{
    private ProxyControllerBoundaryInterface a;
    
    private ProxyControllerBoundaryInterface d() {
        if (this.a == null) {
            this.a = v.d().getProxyController();
        }
        return this.a;
    }
    
    @b1
    @j0
    public static String[][] e(@j0 final List<b.b> list) {
        final String[][] array = new String[list.size()][2];
        for (int i = 0; i < list.size(); ++i) {
            array[i][0] = list.get(i).a();
            array[i][1] = list.get(i).b();
        }
        return array;
    }
    
    @Override
    public void a(@j0 final Executor executor, @j0 final Runnable runnable) {
        if (u.v0.k()) {
            this.d().clearProxyOverride(runnable, executor);
            return;
        }
        throw u.f();
    }
    
    @Override
    public void c(@j0 final b b, @j0 final Executor executor, @j0 final Runnable runnable) {
        if (u.v0.k()) {
            this.d().setProxyOverride(e(b.b()), (String[])b.a().toArray(new String[0]), runnable, executor);
            return;
        }
        throw u.f();
    }
}
