// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.model;

import androidx.room.e1;
import androidx.annotation.k0;
import androidx.room.n1;
import androidx.lifecycle.LiveData;
import androidx.annotation.j0;
import androidx.room.l0;

@l0
public interface e
{
    @j0
    @n1("SELECT long_value FROM Preference where `key`=:key")
    LiveData<Long> a(@j0 final String p0);
    
    @k0
    @n1("SELECT long_value FROM Preference where `key`=:key")
    Long b(@j0 final String p0);
    
    @e1(onConflict = 1)
    void c(@j0 final d p0);
}
