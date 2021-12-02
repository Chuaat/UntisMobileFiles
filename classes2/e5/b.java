// 
// Decompiled by Procyon v0.5.36
// 

package e5;

import com.untis.mobile.persistence.models.EntityType;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.masterdata.Klasse;

public class b extends a
{
    @j0
    private final Klasse G;
    
    public b(@j0 final Klasse g) {
        this.G = g;
    }
    
    @Override
    public long f() {
        return this.G.getId();
    }
    
    @j0
    @Override
    public EntityType g() {
        return EntityType.CLASS;
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
