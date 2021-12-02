// 
// Decompiled by Procyon v0.5.36
// 

package androidx.webkit.internal;

import androidx.annotation.k0;
import androidx.webkit.m;
import java.lang.reflect.InvocationHandler;
import androidx.annotation.j0;
import androidx.webkit.l;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;

public class n implements WebMessageBoundaryInterface
{
    private l a;
    
    public n(@j0 final l a) {
        this.a = a;
    }
    
    @j0
    private static m[] a(final InvocationHandler[] array) {
        final m[] array2 = new m[array.length];
        for (int i = 0; i < array.length; ++i) {
            array2[i] = new q(array[i]);
        }
        return array2;
    }
    
    @j0
    public static l b(@j0 final WebMessageBoundaryInterface webMessageBoundaryInterface) {
        return new l(webMessageBoundaryInterface.getData(), a(webMessageBoundaryInterface.getPorts()));
    }
    
    @k0
    public String getData() {
        return this.a.a();
    }
    
    @k0
    public InvocationHandler[] getPorts() {
        final m[] b = this.a.b();
        if (b == null) {
            return null;
        }
        final InvocationHandler[] array = new InvocationHandler[b.length];
        for (int i = 0; i < b.length; ++i) {
            array[i] = b[i].c();
        }
        return array;
    }
    
    @j0
    public String[] getSupportedFeatures() {
        return new String[0];
    }
}
