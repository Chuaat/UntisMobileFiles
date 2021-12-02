// 
// Decompiled by Procyon v0.5.36
// 

package a;

import androidx.annotation.k0;
import android.content.Context;
import androidx.annotation.j0;

public interface a
{
    void addOnContextAvailableListener(@j0 final c p0);
    
    @k0
    Context peekAvailableContext();
    
    void removeOnContextAvailableListener(@j0 final c p0);
}
