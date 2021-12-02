// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import androidx.room.n1;
import java.util.List;
import androidx.room.e1;
import androidx.room.l0;

@l0
public interface b
{
    @e1(onConflict = 5)
    void a(final a p0);
    
    @n1("SELECT work_spec_id FROM dependency WHERE prerequisite_id=:id")
    List<String> b(final String p0);
    
    @n1("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=:id AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)")
    boolean c(final String p0);
    
    @n1("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=:id")
    boolean d(final String p0);
    
    @n1("SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id")
    List<String> e(final String p0);
}
