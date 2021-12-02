// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import androidx.annotation.r0;
import java.lang.annotation.Annotation;
import androidx.annotation.t0;
import androidx.annotation.j0;
import androidx.annotation.k;
import android.os.Build$VERSION;

public class a
{
    private a() {
    }
    
    @Deprecated
    @k(api = 24)
    public static boolean a() {
        return Build$VERSION.SDK_INT >= 24;
    }
    
    @Deprecated
    @k(api = 25)
    public static boolean b() {
        return Build$VERSION.SDK_INT >= 25;
    }
    
    @Deprecated
    @k(api = 26)
    public static boolean c() {
        return Build$VERSION.SDK_INT >= 26;
    }
    
    @Deprecated
    @k(api = 27)
    public static boolean d() {
        return Build$VERSION.SDK_INT >= 27;
    }
    
    @Deprecated
    @k(api = 28)
    public static boolean e() {
        return Build$VERSION.SDK_INT >= 28;
    }
    
    @t0({ t0.a.K })
    protected static boolean f(@j0 final String anotherString, @j0 final String anObject) {
        final boolean equals = "REL".equals(anObject);
        boolean b = false;
        if (equals) {
            return false;
        }
        if (anObject.compareTo(anotherString) >= 0) {
            b = true;
        }
        return b;
    }
    
    @Deprecated
    @k(api = 29)
    public static boolean g() {
        return Build$VERSION.SDK_INT >= 29;
    }
    
    @Deprecated
    @k(api = 30)
    public static boolean h() {
        return Build$VERSION.SDK_INT >= 30;
    }
    
    @k(api = 31, codename = "S")
    public static boolean i() {
        return Build$VERSION.SDK_INT >= 31 || f("S", Build$VERSION.CODENAME);
    }
    
    @k(codename = "T")
    @a
    public static boolean j() {
        return f("T", Build$VERSION.CODENAME);
    }
    
    @r0
    public @interface a {
    }
}
