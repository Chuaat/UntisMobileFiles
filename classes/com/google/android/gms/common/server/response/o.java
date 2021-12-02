// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.server.response;

import java.util.List;
import h2.c;
import android.os.Parcel;
import java.util.Iterator;
import java.util.Map;
import androidx.annotation.k0;
import java.util.ArrayList;
import android.os.Parcelable$Creator;
import h2.d;
import com.google.android.gms.common.internal.b0;
import h2.a;

@b0
@h2.d.a(creator = "FieldMappingDictionaryEntryCreator")
public final class o extends a
{
    public static final Parcelable$Creator<o> CREATOR;
    @g(id = 1)
    private final int G;
    @c(id = 2)
    final String H;
    @k0
    @c(id = 3)
    final ArrayList<r> I;
    
    static {
        CREATOR = (Parcelable$Creator)new s();
    }
    
    @b
    o(@e(id = 1) final int g, @e(id = 2) final String h, @e(id = 3) final ArrayList<r> i) {
        this.G = g;
        this.H = h;
        this.I = i;
    }
    
    o(String h, final Map<String, com.google.android.gms.common.server.response.a.a<?, ?>> map) {
        this.G = 1;
        this.H = h;
        ArrayList<r> i;
        if (map == null) {
            i = null;
        }
        else {
            final ArrayList<r> list = new ArrayList<r>();
            final Iterator<String> iterator = map.keySet().iterator();
            while (true) {
                i = list;
                if (!iterator.hasNext()) {
                    break;
                }
                h = iterator.next();
                list.add(new r(h, map.get(h)));
            }
        }
        this.I = i;
    }
    
    public final void writeToParcel(final Parcel parcel, int a) {
        a = h2.c.a(parcel);
        h2.c.F(parcel, 1, this.G);
        h2.c.X(parcel, 2, this.H, false);
        h2.c.c0(parcel, 3, this.I, false);
        h2.c.b(parcel, a);
    }
}
