// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.widget.link;

import android.view.ViewGroup;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.EntityType;
import androidx.core.content.d;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.Iterator;
import com.untis.mobile.persistence.models.profile.Child;
import android.widget.TextView;
import android.view.View;
import com.untis.mobile.persistence.models.DisplayableEntity;
import java.util.List;
import com.untis.mobile.persistence.models.profile.Profile;
import android.view.LayoutInflater;
import androidx.annotation.j0;
import android.content.Context;
import android.widget.BaseAdapter;

public class j extends BaseAdapter
{
    @j0
    private final Context G;
    @j0
    private final LayoutInflater H;
    @j0
    private final Profile I;
    @j0
    private final List<DisplayableEntity> J;
    
    public j(@j0 Context applicationContext, @j0 final Profile i, @j0 final List<DisplayableEntity> j) {
        applicationContext = applicationContext.getApplicationContext();
        this.G = applicationContext;
        this.H = LayoutInflater.from(applicationContext);
        this.I = i;
        this.J = j;
    }
    
    private void a(@j0 final View view, @j0 final DisplayableEntity displayableEntity) {
        final TextView textView = (TextView)view.findViewById(2131298363);
        final Iterator<Child> iterator = this.I.getUserChildren().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == displayableEntity.entityId()) {
                textView.setText((CharSequence)displayableEntity.getDisplayableTitle());
                break;
            }
        }
    }
    
    private void b(@j0 final View view, @j0 final DisplayableEntity displayableEntity) {
        final ImageView imageView = (ImageView)view.findViewById(2131298366);
        final TextView textView = (TextView)view.findViewById(2131298368);
        final TextView textView2 = (TextView)view.findViewById(2131298367);
        imageView.setImageDrawable(this.d(displayableEntity));
        textView.setText((CharSequence)displayableEntity.getDisplayableTitle());
        textView2.setText((CharSequence)displayableEntity.getDisplayableDescription());
    }
    
    private void c(@j0 final View view, @j0 final DisplayableEntity displayableEntity) {
        ((TextView)view.findViewById(2131298369)).setText((CharSequence)displayableEntity.getDisplayableTitle());
    }
    
    @j0
    private Drawable d(@j0 final DisplayableEntity displayableEntity) {
        final int n = j$a.a[displayableEntity.entityType().ordinal()];
        Context context;
        int n2;
        if (n != 2) {
            if (n != 3) {
                if (n != 4) {
                    if (n != 5) {
                        if (n != 6) {
                            context = this.G;
                            n2 = 2131230884;
                        }
                        else {
                            context = this.G;
                            n2 = 2131230950;
                        }
                    }
                    else {
                        context = this.G;
                        n2 = 2131230932;
                    }
                }
                else {
                    context = this.G;
                    n2 = 2131230951;
                }
            }
            else {
                context = this.G;
                n2 = 2131230952;
            }
        }
        else {
            context = this.G;
            n2 = 2131230876;
        }
        return d.i(context, n2);
    }
    
    private boolean f(@j0 final DisplayableEntity displayableEntity) {
        if (!EntityType.STUDENT.equals(displayableEntity.entityType())) {
            return false;
        }
        final Iterator<Child> iterator = this.I.getUserChildren().iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getId() == displayableEntity.entityId()) {
                return true;
            }
        }
        return false;
    }
    
    private boolean g(@j0 final DisplayableEntity displayableEntity) {
        return this.I.getEntityType().equals(displayableEntity.entityType()) && this.I.getEntityId() == displayableEntity.entityId();
    }
    
    public DisplayableEntity e(final int n) {
        return this.J.get(n);
    }
    
    public int getCount() {
        return this.J.size();
    }
    
    public long getItemId(final int n) {
        return n;
    }
    
    public View getView(final int n, @k0 View view, @k0 final ViewGroup viewGroup) {
        final DisplayableEntity e = this.e(n);
        if (this.g(e)) {
            view = this.H.inflate(2131493270, viewGroup, false);
            this.c(view, e);
        }
        else if (this.f(e)) {
            view = this.H.inflate(2131493267, viewGroup, false);
            this.a(view, e);
        }
        else {
            view = this.H.inflate(2131493269, viewGroup, false);
            this.b(view, e);
        }
        return view;
    }
}
