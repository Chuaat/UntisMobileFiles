// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.notifications;

import android.graphics.drawable.Drawable;
import android.content.Context;
import androidx.annotation.j0;
import java.io.Serializable;

public abstract class b<Target> implements Serializable
{
    private final Target G;
    
    public b(@j0 final Target g) {
        this.G = g;
    }
    
    @j0
    public abstract Drawable a(@j0 final Context p0);
    
    @j0
    public abstract String b(@j0 final Context p0);
    
    public Target c() {
        return this.G;
    }
    
    @j0
    public abstract String d(@j0 final Context p0);
    
    public abstract void e(@j0 final com.untis.mobile.ui.activities.common.b p0);
}
