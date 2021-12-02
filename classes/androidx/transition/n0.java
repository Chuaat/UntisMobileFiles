// 
// Decompiled by Procyon v0.5.36
// 

package androidx.transition;

import java.util.Iterator;
import androidx.annotation.j0;
import java.util.HashMap;
import java.util.ArrayList;
import android.view.View;
import java.util.Map;

public class n0
{
    public final Map<String, Object> a;
    public View b;
    final ArrayList<g0> c;
    
    @Deprecated
    public n0() {
        this.a = new HashMap<String, Object>();
        this.c = new ArrayList<g0>();
    }
    
    public n0(@j0 final View b) {
        this.a = new HashMap<String, Object>();
        this.c = new ArrayList<g0>();
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (o instanceof n0) {
            final View b = this.b;
            final n0 n0 = (n0)o;
            if (b == n0.b && this.a.equals(n0.a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public int hashCode() {
        return this.b.hashCode() * 31 + this.a.hashCode();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("TransitionValues@");
        sb.append(Integer.toHexString(this.hashCode()));
        sb.append(":\n");
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append("    view = ");
        sb2.append(this.b);
        sb2.append("\n");
        final String string2 = sb2.toString();
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(string2);
        sb3.append("    values:");
        String str = sb3.toString();
        for (final String str2 : this.a.keySet()) {
            final StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            sb4.append("    ");
            sb4.append(str2);
            sb4.append(": ");
            sb4.append(this.a.get(str2));
            sb4.append("\n");
            str = sb4.toString();
        }
        return str;
    }
}
