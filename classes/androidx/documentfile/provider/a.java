// 
// Decompiled by Procyon v0.5.36
// 

package androidx.documentfile.provider;

import android.provider.DocumentsContract;
import android.os.Build$VERSION;
import android.net.Uri;
import android.content.Context;
import androidx.annotation.j0;
import java.io.File;
import androidx.annotation.k0;

public abstract class a
{
    static final String b = "DocumentFile";
    @k0
    private final a a;
    
    a(@k0 final a a) {
        this.a = a;
    }
    
    @j0
    public static a h(@j0 final File file) {
        return new c(null, file);
    }
    
    @k0
    public static a i(@j0 final Context context, @j0 final Uri uri) {
        if (Build$VERSION.SDK_INT >= 19) {
            return new d(null, context, uri);
        }
        return null;
    }
    
    @k0
    public static a j(@j0 final Context context, @j0 final Uri uri) {
        if (Build$VERSION.SDK_INT >= 21) {
            return new e(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
        }
        return null;
    }
    
    public static boolean p(@j0 final Context context, @k0 final Uri uri) {
        return Build$VERSION.SDK_INT >= 19 && DocumentsContract.isDocumentUri(context, uri);
    }
    
    public abstract boolean a();
    
    public abstract boolean b();
    
    @k0
    public abstract a c(@j0 final String p0);
    
    @k0
    public abstract a d(@j0 final String p0, @j0 final String p1);
    
    public abstract boolean e();
    
    public abstract boolean f();
    
    @k0
    public a g(@j0 final String s) {
        for (final a a : this.u()) {
            if (s.equals(a.k())) {
                return a;
            }
        }
        return null;
    }
    
    @k0
    public abstract String k();
    
    @k0
    public a l() {
        return this.a;
    }
    
    @k0
    public abstract String m();
    
    @j0
    public abstract Uri n();
    
    public abstract boolean o();
    
    public abstract boolean q();
    
    public abstract boolean r();
    
    public abstract long s();
    
    public abstract long t();
    
    @j0
    public abstract a[] u();
    
    public abstract boolean v(@j0 final String p0);
}
