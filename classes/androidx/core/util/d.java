// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.util;

import androidx.annotation.t0;

@t0({ t0.a.I })
public class d
{
    private d() {
    }
    
    public static void a(final Object o, final StringBuilder sb) {
        String hexString;
        if (o == null) {
            hexString = "null";
        }
        else {
            String str;
            if ((str = o.getClass().getSimpleName()).length() <= 0) {
                final String name = o.getClass().getName();
                final int lastIndex = name.lastIndexOf(46);
                str = name;
                if (lastIndex > 0) {
                    str = name.substring(lastIndex + 1);
                }
            }
            sb.append(str);
            sb.append('{');
            hexString = Integer.toHexString(System.identityHashCode(o));
        }
        sb.append(hexString);
    }
}
