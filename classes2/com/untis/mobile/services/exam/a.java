// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.exam;

import h5.b;
import h5.h;
import h5.f;
import h5.d;
import java.util.concurrent.TimeoutException;
import h5.c;
import androidx.annotation.k0;
import org.joda.time.t;
import com.untis.mobile.persistence.models.exam.Exam;
import java.util.List;
import rx.g;
import androidx.annotation.j0;
import com.untis.mobile.persistence.models.profile.Profile;

public interface a
{
    @j0
    g<List<Exam>> a(@j0 final Profile p0);
    
    void b(@j0 final Profile p0, @j0 final List<Exam> p1);
    
    @Deprecated
    @k0
    List<Exam> c(@j0 final Profile p0, @j0 final t p1, @j0 final t p2);
    
    @j0
    g<List<Exam>> d(@j0 final Profile p0);
    
    @Deprecated
    @j0
    List<Exam> e(@j0 final Profile p0, @j0 final t p1, @j0 final t p2) throws h5.a, c, TimeoutException, d, f, h, b;
}
