// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.util;

import java.util.Iterator;
import java.util.HashMap;
import androidx.annotation.RecentlyNonNull;
import f2.a;

@a
public class s
{
    @a
    public static void a(@RecentlyNonNull final StringBuilder sb, @RecentlyNonNull final HashMap<String, String> hashMap) {
        sb.append("{");
        final Iterator<String> iterator = hashMap.keySet().iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final String s = iterator.next();
            if (n == 0) {
                sb.append(",");
            }
            else {
                n = 0;
            }
            final String str = hashMap.get(s);
            sb.append("\"");
            sb.append(s);
            sb.append("\":");
            if (str == null) {
                sb.append("null");
            }
            else {
                sb.append("\"");
                sb.append(str);
                sb.append("\"");
            }
        }
        sb.append("}");
    }
}
