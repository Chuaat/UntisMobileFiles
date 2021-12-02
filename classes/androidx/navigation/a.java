// 
// Decompiled by Procyon v0.5.36
// 

package androidx.navigation;

import androidx.annotation.j0;
import android.os.Bundle;

public final class a implements d0
{
    private final int a;
    
    public a(final int a) {
        this.a = a;
    }
    
    @Override
    public boolean equals(final Object o) {
        return this == o || (o != null && a.class == o.getClass() && this.getActionId() == ((a)o).getActionId());
    }
    
    @Override
    public int getActionId() {
        return this.a;
    }
    
    @j0
    @Override
    public Bundle getArguments() {
        return new Bundle();
    }
    
    @Override
    public int hashCode() {
        return 31 + this.getActionId();
    }
    
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ActionOnlyNavDirections(actionId=");
        sb.append(this.getActionId());
        sb.append(")");
        return sb.toString();
    }
}
