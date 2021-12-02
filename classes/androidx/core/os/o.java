// 
// Decompiled by Procyon v0.5.36
// 

package androidx.core.os;

import androidx.annotation.j0;
import android.os.Parcel;

public final class o
{
    private o() {
    }
    
    public static boolean a(@j0 final Parcel parcel) {
        return parcel.readInt() != 0;
    }
    
    public static void b(@j0 final Parcel parcel, final boolean b) {
        parcel.writeInt((int)(b ? 1 : 0));
    }
}
