// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.exam;

import h5.h;
import h5.f;
import java.util.concurrent.TimeoutException;
import h5.c;
import java.util.Iterator;
import com.untis.mobile.persistence.models.profile.Child;
import h5.d;
import java.util.ArrayList;
import org.joda.time.t;
import com.untis.mobile.persistence.models.exam.Exam;
import java.util.List;
import rx.g;
import com.untis.mobile.persistence.models.profile.Profile;
import androidx.annotation.j0;
import android.content.Context;
import androidx.annotation.k0;

public class b implements a
{
    @k0
    private static b b;
    @j0
    private Context a;
    
    private b(@j0 final Context a) {
        this.a = a;
    }
    
    @j0
    public static a f(@j0 final Context context) {
        final b b = com.untis.mobile.services.exam.b.b;
        if (b == null) {
            com.untis.mobile.services.exam.b.b = new b(context.getApplicationContext());
        }
        else {
            b.g(context.getApplicationContext());
        }
        return com.untis.mobile.services.exam.b.b;
    }
    
    private void g(@j0 final Context a) {
        this.a = a;
    }
    
    @j0
    @Override
    public g<List<Exam>> a(@j0 final Profile profile) {
        return null;
    }
    
    @Override
    public void b(@j0 final Profile profile, @j0 final List<Exam> list) {
    }
    
    @k0
    @Override
    public List<Exam> c(@j0 final Profile profile, @j0 final t t, @j0 final t t2) {
        return null;
    }
    
    @j0
    @Override
    public g<List<Exam>> d(@j0 final Profile profile) {
        return null;
    }
    
    @j0
    @Override
    public List<Exam> e(@j0 final Profile profile, @j0 final t t, @j0 final t t2) throws h5.a, c, TimeoutException, d, f, h, h5.b {
        final ArrayList<Exam> list = new ArrayList<Exam>();
        switch (b$a.a[profile.getEntityType().ordinal()]) {
            default: {
                throw new d(-666);
            }
            case 6:
            case 7:
            case 8: {
                for (Child child : profile.getUserChildren()) {}
            }
            case 1:
            case 2:
            case 3:
            case 4:
            case 5: {
                return list;
            }
        }
    }
}
