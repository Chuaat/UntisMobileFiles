// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.datatransport.cct.internal;

import h3.a$a;
import com.google.firebase.encoders.json.e;
import androidx.annotation.j0;
import java.util.List;
import com.google.auto.value.AutoValue;
import h3.a;

@a
@AutoValue
public abstract class j
{
    @j0
    public static j a(@j0 final List<m> list) {
        return new d(list);
    }
    
    @j0
    public static com.google.firebase.encoders.a b() {
        return new e().k(b.b).l(true).j();
    }
    
    @a$a(name = "logRequest")
    @j0
    public abstract List<m> c();
}
