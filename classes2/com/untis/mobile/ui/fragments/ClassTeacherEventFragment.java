// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.fragments;

import org.joda.time.base.c;
import android.content.Context;
import android.widget.ListAdapter;
import java.util.Comparator;
import java.util.Collections;
import android.widget.ListView;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import java.util.Collection;
import androidx.annotation.k0;
import com.untis.mobile.utils.comparator.b;
import org.joda.time.l0;
import android.os.Bundle;
import androidx.annotation.j0;
import java.util.ArrayList;
import com.untis.mobile.services.masterdata.a;
import com.untis.mobile.persistence.models.classbook.classregevent.Event;
import java.util.List;
import com.untis.mobile.persistence.models.profile.Profile;
import com.untis.mobile.ui.fragments.common.UmFragment;

public class ClassTeacherEventFragment extends UmFragment
{
    public static final String K = "ctef_stardust";
    private static final String L = "tomaten";
    private static final String M = "salat";
    private Profile G;
    private final List<Event> H;
    private a I;
    private com.untis.mobile.services.classbook.a J;
    
    public ClassTeacherEventFragment() {
        this.H = new ArrayList<Event>();
    }
    
    @j0
    public static ClassTeacherEventFragment s(@j0 final Profile profile, @j0 final List<Event> list) {
        final ClassTeacherEventFragment classTeacherEventFragment = new ClassTeacherEventFragment();
        final Bundle arguments = new Bundle();
        arguments.putString("tomaten", profile.getUniqueId());
        arguments.putLongArray("salat", v(list));
        classTeacherEventFragment.setArguments(arguments);
        return classTeacherEventFragment;
    }
    
    @j0
    private List<Event> u(@k0 final long[] array) {
        if (array != null && array.length != 0) {
            final ArrayList<Event> list = new ArrayList<Event>();
            for (int length = array.length, i = 0; i < length; ++i) {
                final Event v = this.J.v(array[i]);
                if (v != null) {
                    list.add(v);
                }
            }
            return list;
        }
        return new ArrayList<Event>();
    }
    
    @j0
    private static long[] v(@j0 final List<Event> list) {
        final long[] array = new long[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            array[i] = list.get(i).getId();
        }
        return array;
    }
    
    public void onCreate(@k0 final Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = bundle;
        if (bundle == null) {
            arguments = this.getArguments();
        }
        if (arguments != null) {
            final Profile l = com.untis.mobile.services.profile.legacy.j0.G.l(arguments.getString("tomaten", ""));
            this.G = l;
            this.I = l.getMasterDataService();
            this.J = this.G.getClassBookService();
            if (this.G != null) {
                this.H.addAll(this.u(arguments.getLongArray("salat")));
            }
        }
    }
    
    @k0
    public View onCreateView(@j0 final LayoutInflater layoutInflater, @k0 final ViewGroup viewGroup, @k0 final Bundle bundle) {
        final Context context = this.getContext();
        if (context == null) {
            return null;
        }
        final View inflate = layoutInflater.inflate(2131493077, viewGroup, false);
        final ListView listView = (ListView)inflate.findViewById(2131297529);
        Collections.sort(this.H, new j(this));
        listView.setAdapter((ListAdapter)new i(context, this.G, this.H));
        return inflate;
    }
    
    public void onSaveInstanceState(@j0 final Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("tomaten", this.G.getUniqueId());
        bundle.putLongArray("salat", v(this.H));
    }
}
