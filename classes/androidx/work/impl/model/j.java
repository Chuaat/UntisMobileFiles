// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import androidx.annotation.k0;
import androidx.room.e1;
import androidx.room.n1;
import androidx.annotation.j0;
import java.util.List;
import androidx.room.l0;

@l0
public interface j
{
    @j0
    @n1("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    List<String> a();
    
    @e1(onConflict = 1)
    void b(@j0 final i p0);
    
    @k0
    @n1("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId")
    i c(@j0 final String p0);
    
    @n1("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void d(@j0 final String p0);
}
