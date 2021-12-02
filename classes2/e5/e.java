// 
// Decompiled by Procyon v0.5.36
// 

package e5;

import com.untis.mobile.persistence.models.EntityType;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.masterdata.Subject;

public class e extends a
{
    @j0
    private final Subject G;
    
    public e(@j0 final Subject g) {
        this.G = g;
    }
    
    @Override
    public long f() {
        return this.G.getId();
    }
    
    @j0
    @Override
    public EntityType g() {
        return EntityType.SUBJECT;
    }
    
    @j0
    @Override
    public String h() {
        return this.G.getLongName().trim();
    }
    
    @j0
    @Override
    public String i() {
        return this.G.getName().trim();
    }
}
