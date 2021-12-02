// 
// Decompiled by Procyon v0.5.36
// 

package e5;

import com.untis.mobile.persistence.models.EntityType;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.masterdata.Room;

public class c extends a
{
    @j0
    private final Room G;
    
    public c(@j0 final Room g) {
        this.G = g;
    }
    
    @Override
    public long f() {
        return this.G.getId();
    }
    
    @j0
    @Override
    public EntityType g() {
        return EntityType.ROOM;
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
