// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.utils.mapper.common;

import androidx.annotation.k0;
import java.util.Iterator;
import java.util.ArrayList;
import androidx.annotation.j0;
import java.util.List;

public abstract class c<Source, Target> extends b<Source, Target>
{
    @j0
    public List<Source> i(@j0 final List<Target> list) {
        final ArrayList<Source> list2 = new ArrayList<Source>();
        for (final Target next : list) {
            if (next == null) {
                continue;
            }
            final Source j = this.j(next);
            if (j == null) {
                continue;
            }
            list2.add(j);
        }
        return list2;
    }
    
    @k0
    public abstract Source j(@j0 final Target p0);
}
