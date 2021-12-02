// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.vision.text;

import java.util.List;
import android.graphics.Point;
import androidx.annotation.RecentlyNonNull;
import android.graphics.Rect;

public interface c
{
    @RecentlyNonNull
    Rect a();
    
    @RecentlyNonNull
    String b();
    
    @RecentlyNonNull
    Point[] c();
    
    @RecentlyNonNull
    List<? extends c> getComponents();
    
    @RecentlyNonNull
    String getValue();
}
