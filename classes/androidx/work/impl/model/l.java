// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import androidx.room.i0;
import androidx.annotation.j0;
import androidx.room.d1;
import androidx.room.w0;
import androidx.room.s0;
import androidx.annotation.t0;

@t0({ t0.a.H })
@s0(foreignKeys = { @w0(childColumns = { "work_spec_id" }, entity = r.class, onDelete = 5, onUpdate = 5, parentColumns = { "id" }) }, indices = { @d1({ "work_spec_id" }) }, primaryKeys = { "name", "work_spec_id" })
public class l
{
    @j0
    @i0(name = "name")
    public final String a;
    @j0
    @i0(name = "work_spec_id")
    public final String b;
    
    public l(@j0 final String a, @j0 final String b) {
        this.a = a;
        this.b = b;
    }
}
