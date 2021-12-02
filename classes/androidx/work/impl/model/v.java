// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import androidx.room.n1;
import java.util.List;
import androidx.room.e1;
import androidx.room.l0;

@l0
public interface v
{
    @e1(onConflict = 5)
    void a(final u p0);
    
    @n1("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    List<String> b(final String p0);
    
    @n1("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    List<String> c(final String p0);
}
