// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import androidx.work.f;
import androidx.room.l1;
import androidx.room.i0;
import androidx.annotation.j0;
import androidx.room.w0;
import androidx.room.s0;
import androidx.annotation.t0;

@t0({ t0.a.H })
@s0(foreignKeys = { @w0(childColumns = { "work_spec_id" }, entity = r.class, onDelete = 5, onUpdate = 5, parentColumns = { "id" }) })
public class o
{
    @j0
    @i0(name = "work_spec_id")
    @l1
    public final String a;
    @j0
    @i0(name = "progress")
    public final f b;
    
    public o(@j0 final String a, @j0 final f b) {
        this.a = a;
        this.b = b;
    }
}
