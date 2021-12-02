// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common.parentsday;

import java.io.Serializable;

public class UMPDay implements Serializable
{
    public String endDateTime;
    public long id;
    public String name;
    public String startDateTime;
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof UMPDay)) {
            return false;
        }
        if (this.id != ((UMPDay)o).id) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        final long id = this.id;
        return (int)(id ^ id >>> 32);
    }
}
