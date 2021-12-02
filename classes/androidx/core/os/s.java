// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import android.os.Process;
import android.os.UserHandle;
import android.annotation.SuppressLint;
import java.lang.reflect.Method;
import androidx.annotation.p0;
import android.os.Build$VERSION;

public final class s
{
    private s() {
    }
    
    public static boolean a(final int n) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 24) {
            return c.a(n);
        }
        if (sdk_INT >= 17) {
            return b.a(n);
        }
        return sdk_INT != 16 || a.a(n);
    }
    
    @p0(16)
    static class a
    {
        private static final Object a;
        private static Method b;
        private static boolean c;
        
        static {
            a = new Object();
        }
        
        private a() {
        }
        
        @SuppressLint({ "PrivateApi" })
        static boolean a(final int i) {
            try {
                Object o = s.a.a;
                synchronized (o) {
                    if (!s.a.c) {
                        s.a.c = true;
                        s.a.b = Class.forName("android.os.UserId").getDeclaredMethod("isApp", Integer.TYPE);
                    }
                    // monitorexit(o)
                    o = s.a.b;
                    if (o == null) {
                        return true;
                    }
                    o = ((Method)o).invoke(null, i);
                    if (o != null) {
                        return (boolean)o;
                    }
                    o = new NullPointerException();
                    throw o;
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            return true;
        }
    }
    
    @p0(17)
    static class b
    {
        private static final Object a;
        private static Method b;
        private static boolean c;
        
        static {
            a = new Object();
        }
        
        private b() {
        }
        
        @SuppressLint({ "DiscouragedPrivateApi" })
        static boolean a(final int i) {
            try {
                Object o = s.b.a;
                synchronized (o) {
                    if (!s.b.c) {
                        s.b.c = true;
                        s.b.b = UserHandle.class.getDeclaredMethod("isApp", Integer.TYPE);
                    }
                    // monitorexit(o)
                    o = s.b.b;
                    if (o == null) {
                        return true;
                    }
                    if (((Method)o).invoke(null, i) != null) {
                        return true;
                    }
                    o = new NullPointerException();
                    throw o;
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            return true;
        }
    }
    
    @p0(24)
    static class c
    {
        private c() {
        }
        
        static boolean a(final int n) {
            return Process.isApplicationUid(n);
        }
    }
}
