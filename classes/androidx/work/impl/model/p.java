// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import androidx.room.e1;
import java.util.List;
import androidx.annotation.k0;
import androidx.work.f;
import androidx.room.n1;
import androidx.annotation.j0;
import androidx.room.l0;
import androidx.annotation.t0;

@t0({ t0.a.H })
@l0
public interface p
{
    @n1("DELETE from WorkProgress where work_spec_id=:workSpecId")
    void d(@j0 final String p0);
    
    @n1("DELETE FROM WorkProgress")
    void e();
    
    @k0
    @n1("SELECT progress FROM WorkProgress WHERE work_spec_id=:workSpecId")
    f f(@j0 final String p0);
    
    @j0
    @n1("SELECT progress FROM WorkProgress WHERE work_spec_id IN (:workSpecIds)")
    List<f> g(@j0 final List<String> p0);
    
    @e1(onConflict = 1)
    void h(@j0 final o p0);
}
