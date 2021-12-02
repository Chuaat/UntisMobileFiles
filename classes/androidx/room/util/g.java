// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room.util;

import android.util.Log;
import java.util.StringTokenizer;
import java.util.ArrayList;
import androidx.annotation.k0;
import java.util.List;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class g
{
    public static final String[] a;
    
    static {
        a = new String[0];
    }
    
    private g() {
    }
    
    public static void a(final StringBuilder sb, final int n) {
        for (int i = 0; i < n; ++i) {
            sb.append("?");
            if (i < n - 1) {
                sb.append(",");
            }
        }
    }
    
    @k0
    public static String b(@k0 final List<Integer> list) {
        if (list == null) {
            return null;
        }
        final int size = list.size();
        if (size == 0) {
            return "";
        }
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; ++i) {
            sb.append(Integer.toString(list.get(i)));
            if (i < size - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }
    
    public static StringBuilder c() {
        return new StringBuilder();
    }
    
    @k0
    public static List<Integer> d(@k0 String str) {
        if (str == null) {
            return null;
        }
        final ArrayList<Integer> list = new ArrayList<Integer>();
        str = (String)new StringTokenizer(str, ",");
        while (((StringTokenizer)str).hasMoreElements()) {
            final String nextToken = ((StringTokenizer)str).nextToken();
            try {
                list.add(Integer.parseInt(nextToken));
            }
            catch (NumberFormatException ex) {
                Log.e("ROOM", "Malformed integer list", (Throwable)ex);
            }
        }
        return list;
    }
}
