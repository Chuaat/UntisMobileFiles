// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.telephony;

import androidx.annotation.r;
import java.lang.reflect.InvocationTargetException;
import android.telephony.SubscriptionManager;
import android.os.Build$VERSION;
import java.lang.reflect.Method;
import androidx.annotation.p0;

@p0(22)
public class a
{
    private static Method a;
    
    private a() {
    }
    
    public static int a(int intValue) {
        if (intValue == -1) {
            return -1;
        }
        final int sdk_INT = Build$VERSION.SDK_INT;
        if (sdk_INT >= 29) {
            return androidx.core.telephony.a.a.a(intValue);
        }
        try {
            Label_0087: {
                if (androidx.core.telephony.a.a != null) {
                    break Label_0087;
                }
                Label_0059: {
                    if (sdk_INT < 26) {
                        break Label_0059;
                    }
                    Method a = SubscriptionManager.class.getDeclaredMethod("getSlotIndex", Integer.TYPE);
                    while (true) {
                        androidx.core.telephony.a.a = a;
                        Label_0080: {
                            break Label_0080;
                            try {
                                a = SubscriptionManager.class.getDeclaredMethod("getSlotId", Integer.TYPE);
                                continue;
                                try {
                                    androidx.core.telephony.a.a.setAccessible(true);
                                    final Integer n = (Integer)androidx.core.telephony.a.a.invoke(null, intValue);
                                    if (n != null) {
                                        intValue = n;
                                        return intValue;
                                    }
                                    return -1;
                                }
                                catch (IllegalAccessException ex) {}
                            }
                            catch (IllegalAccessException ex2) {}
                        }
                        break;
                    }
                }
            }
        }
        catch (NoSuchMethodException ex3) {}
        catch (IllegalAccessException ex4) {}
        catch (InvocationTargetException ex5) {}
    }
    
    @p0(29)
    private static class a
    {
        @r
        static int a(final int n) {
            return SubscriptionManager.getSlotIndex(n);
        }
    }
}
