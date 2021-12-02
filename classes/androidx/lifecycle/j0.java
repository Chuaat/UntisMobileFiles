// 
// Decompiled by Procyon v0.5.36
// 

package androidx.lifecycle;

import java.util.HashMap;
import java.util.Map;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class j0
{
    private Map<String, Integer> a;
    
    public j0() {
        this.a = new HashMap<String, Integer>();
    }
    
    @t0({ t0.a.I })
    public boolean a(final String s, final int n) {
        final Integer n2 = this.a.get(s);
        boolean b = false;
        int intValue;
        if (n2 != null) {
            intValue = n2;
        }
        else {
            intValue = 0;
        }
        if ((intValue & n) != 0x0) {
            b = true;
        }
        this.a.put(s, n | intValue);
        return b ^ true;
    }
}
