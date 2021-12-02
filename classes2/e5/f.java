// 
// Decompiled by Procyon v0.5.36
// 

package e5;

import com.untis.mobile.persistence.models.EntityType;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.masterdata.Teacher;

public class f extends a
{
    @j0
    private final Teacher G;
    
    public f(@j0 final Teacher g) {
        this.G = g;
    }
    
    @Override
    public long f() {
        return this.G.getId();
    }
    
    @j0
    @Override
    public EntityType g() {
        return EntityType.TEACHER;
    }
    
    @j0
    @Override
    public String h() {
        final StringBuilder sb = new StringBuilder();
        sb.append(this.G.getFirstName());
        sb.append(" ");
        sb.append(this.G.getLastName());
        return sb.toString().trim();
    }
    
    @j0
    @Override
    public String i() {
        return this.G.getName().trim();
    }
    
    @j0
    public String j() {
        return String.format("%s %s", this.G.getLastName(), this.G.getFirstName()).trim();
    }
}
