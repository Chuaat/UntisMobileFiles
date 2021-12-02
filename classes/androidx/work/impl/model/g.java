// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import androidx.lifecycle.LiveData;
import androidx.room.l2;
import java.util.List;
import androidx.annotation.j0;
import androidx.sqlite.db.f;
import androidx.room.l0;

@l0
public interface g
{
    @j0
    @l2(observedEntities = { r.class })
    List<r.c> a(@j0 final f p0);
    
    @j0
    @l2(observedEntities = { r.class })
    LiveData<List<r.c>> b(@j0 final f p0);
}
