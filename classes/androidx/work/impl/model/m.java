// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import androidx.annotation.j0;
import androidx.room.n1;
import java.util.List;
import androidx.room.e1;
import androidx.room.l0;

@l0
public interface m
{
    @e1(onConflict = 5)
    void a(final l p0);
    
    @n1("SELECT work_spec_id FROM workname WHERE name=:name")
    List<String> b(final String p0);
    
    @j0
    @n1("SELECT name FROM workname WHERE work_spec_id=:workSpecId")
    List<String> c(@j0 final String p0);
}
