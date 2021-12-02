// 
// Decompiled by Procyon v0.5.36
// 

package e5;

import com.untis.mobile.persistence.models.EntityType;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.masterdata.Student;

public class d extends a
{
    @j0
    private final Student G;
    
    public d(@j0 final Student g) {
        this.G = g;
    }
    
    @Override
    public long f() {
        return this.G.getId();
    }
    
    @j0
    @Override
    public EntityType g() {
        return EntityType.STUDENT;
    }
    
    @j0
    @Override
    public String h() {
        return "";
    }
    
    @j0
    @Override
    public String i() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.G.getFirstName());
        sb.append(" ");
        sb.append(this.G.getLastName());
        return sb.toString().trim();
    }
}
