// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import android.annotation.SuppressLint;
import java.lang.reflect.InvocationTargetException;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.graphics.Canvas;
import java.lang.reflect.Method;

class d
{
    private static Method a;
    private static Method b;
    private static boolean c;
    
    private d() {
    }
    
    @SuppressLint({ "SoonBlockedPrivateApi" })
    static void a(@j0 final Canvas obj, final boolean b) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT < 21) {
            goto Label_0161;
        }
        if (sdk_INT >= 29) {
            if (b) {
                ((Canvas)obj).enableZ();
                goto Label_0161;
            }
            ((Canvas)obj).disableZ();
            goto Label_0161;
        }
        else {
            if (sdk_INT == 28) {
                goto Label_0162;
            }
            Label_0095: {
                if (d.c) {
                    break Label_0095;
                }
                try {
                    (d.a = Canvas.class.getDeclaredMethod("insertReorderBarrier", (Class<?>[])new Class[0])).setAccessible(true);
                    (d.b = Canvas.class.getDeclaredMethod("insertInorderBarrier", (Class<?>[])new Class[0])).setAccessible(true);
                    d.c = true;
                    if (!b) {
                        goto Label_0124;
                    }
                    try {
                        final Method a = d.a;
                        if (a != null) {
                            a.invoke(obj, new Object[0]);
                            goto Label_0124;
                        }
                        goto Label_0124;
                    }
                    catch (InvocationTargetException obj) {}
                    catch (IllegalAccessException obj) {}
                }
                catch (NoSuchMethodException ex) {}
            }
        }
    }
}
