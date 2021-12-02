// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.api.common;

import java.io.Serializable;

public class UMPerson implements Serializable
{
    public String firstName;
    public long id;
    public String lastName;
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (!(o instanceof UMPerson)) {
            return false;
        }
        if (this.id != ((UMPerson)o).id) {
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
