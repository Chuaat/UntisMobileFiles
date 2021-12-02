// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import android.annotation.SuppressLint;
import android.os.Build$VERSION;
import androidx.annotation.j0;
import android.os.Message;

public final class m
{
    private static boolean a = true;
    private static boolean b = true;
    
    private m() {
    }
    
    @SuppressLint({ "NewApi" })
    public static boolean a(@j0 final Message message) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 22) {
            return message.isAsynchronous();
        }
        if (m.b && sdk_INT >= 16) {
            try {
                return message.isAsynchronous();
            }
            catch (NoSuchMethodError noSuchMethodError) {
                m.b = false;
            }
        }
        return false;
    }
    
    @SuppressLint({ "NewApi" })
    public static void b(@j0 final Message message, final boolean b) {
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 22) {
            message.setAsynchronous(b);
            return;
        }
        if (m.a && sdk_INT >= 16) {
            try {
                message.setAsynchronous(b);
            }
            catch (NoSuchMethodError noSuchMethodError) {
                m.a = false;
            }
        }
    }
}
