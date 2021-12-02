// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import androidx.room.l1;
import androidx.room.i0;
import androidx.annotation.j0;
import androidx.room.w0;
import androidx.room.s0;
import androidx.annotation.t0;

@t0({ t0.a.H })
@s0(foreignKeys = { @w0(childColumns = { "work_spec_id" }, entity = r.class, onDelete = 5, onUpdate = 5, parentColumns = { "id" }) })
public class i
{
    @j0
    @i0(name = "work_spec_id")
    @l1
    public final String a;
    @i0(name = "system_id")
    public final int b;
    
    public i(@j0 final String a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof i)) {
            return false;
        }
        final i i = (i)o;
        return this.b == i.b && this.a.equals(i.a);
    }
    
    @Override
    public int hashCode() {
        return this.a.hashCode() * 31 + this.b;
    }
}
