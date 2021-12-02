// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.auth.api.signin;

import android.os.Bundle;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.api.Scope;
import java.util.List;
import androidx.annotation.RecentlyNonNull;

public interface a
{
    @RecentlyNonNull
    @f2.a
    public static final int a = 1;
    @RecentlyNonNull
    @f2.a
    public static final int b = 3;
    
    @RecentlyNonNull
    @f2.a
    int a();
    
    @RecentlyNullable
    @f2.a
    List<Scope> b();
    
    @RecentlyNonNull
    @f2.a
    Bundle c();
}
