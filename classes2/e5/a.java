// 
// Decompiled by Procyon v0.5.36
// 

package e5;

import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.utils.comparator.b;
import androidx.annotation.j0;

public abstract class a implements Comparable<a>
{
    public int b(@j0 final a a) {
        String s;
        if (this instanceof f) {
            s = ((f)this).j();
        }
        else {
            s = this.i();
        }
        String s2;
        if (a instanceof f) {
            s2 = ((f)a).j();
        }
        else {
            s2 = a.i();
        }
        return b.G.b(s, s2);
    }
    
    public boolean d(@j0 String lowerCase) {
        lowerCase = lowerCase.toLowerCase();
        return this.i().toLowerCase().contains(lowerCase) || this.h().toLowerCase().contains(lowerCase);
    }
    
    public abstract long f();
    
    @j0
    public abstract EntityType g();
    
    @j0
    public abstract String h();
    
    @j0
    public abstract String i();
}
