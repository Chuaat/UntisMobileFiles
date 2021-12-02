// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.settings.opensource;

import android.os.Parcelable$Creator;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 '2\u00020\u0001:\u0001\u001cB?\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u0012\u0006\u0010\u001d\u001a\u00020\t\u0012\u0006\u0010\u0017\u001a\u00020\t\u0012\u0006\u0010#\u001a\u00020\u001e\u0012\u0006\u0010\u001a\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b$\u0010%B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b$\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\u0019\u0010\u000e\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u0011\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u0019\u0010\u0014\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\rR\u0019\u0010\u0017\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u000b\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u001a\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u000b\u001a\u0004\b\u0019\u0010\rR\u0019\u0010\u001d\u001a\u00020\t8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000b\u001a\u0004\b\u001c\u0010\rR\u0019\u0010#\u001a\u00020\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006(" }, d2 = { "Lcom/untis/mobile/ui/activities/settings/opensource/j;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "M", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "projectUrl", "G", "f", "title", "H", "c", "description", "J", "g", "version", "L", "b", "authorUrl", "I", "a", "author", "Lcom/untis/mobile/ui/activities/settings/opensource/a;", "K", "Lcom/untis/mobile/ui/activities/settings/opensource/a;", "d", "()Lcom/untis/mobile/ui/activities/settings/opensource/a;", "license", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/untis/mobile/ui/activities/settings/opensource/a;Ljava/lang/String;Ljava/lang/String;)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class j implements Parcelable
{
    @e
    public static final a CREATOR;
    @e
    private final String G;
    @e
    private final String H;
    @e
    private final String I;
    @e
    private final String J;
    @e
    private final com.untis.mobile.ui.activities.settings.opensource.a K;
    @e
    private final String L;
    @e
    private final String M;
    
    static {
        CREATOR = new a(null);
    }
    
    public j(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        String string2 = parcel.readString();
        if (string2 == null) {
            string2 = "";
        }
        String string3 = parcel.readString();
        if (string3 == null) {
            string3 = "";
        }
        String string4 = parcel.readString();
        if (string4 == null) {
            string4 = "";
        }
        final com.untis.mobile.ui.activities.settings.opensource.a a = com.untis.mobile.ui.activities.settings.opensource.a.J.a(parcel.readInt());
        String string5 = parcel.readString();
        if (string5 == null) {
            string5 = "";
        }
        String string6 = parcel.readString();
        if (string6 == null) {
            string6 = "";
        }
        this(string, string2, string3, string4, a, string5, string6);
    }
    
    public j(@e final String g, @e final String h, @e final String i, @e final String j, @e final com.untis.mobile.ui.activities.settings.opensource.a k, @e final String l, @e final String m) {
        k0.p(g, "title");
        k0.p(h, "description");
        k0.p(i, "author");
        k0.p(j, "version");
        k0.p(k, "license");
        k0.p(l, "authorUrl");
        k0.p(m, "projectUrl");
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
    }
    
    @e
    public final String a() {
        return this.I;
    }
    
    @e
    public final String b() {
        return this.L;
    }
    
    @e
    public final String c() {
        return this.H;
    }
    
    @e
    public final com.untis.mobile.ui.activities.settings.opensource.a d() {
        return this.K;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @e
    public final String e() {
        return this.M;
    }
    
    @e
    public final String f() {
        return this.G;
    }
    
    @e
    public final String g() {
        return this.J;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeString(this.G);
        parcel.writeString(this.H);
        parcel.writeString(this.I);
        parcel.writeString(this.J);
        parcel.writeInt(this.K.g());
        parcel.writeString(this.L);
        parcel.writeString(this.M);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "com/untis/mobile/ui/activities/settings/opensource/j$a", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/ui/activities/settings/opensource/j;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/untis/mobile/ui/activities/settings/opensource/j;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a implements Parcelable$Creator<j>
    {
        private a() {
        }
        
        @e
        public j a(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new j(parcel);
        }
        
        @e
        public j[] b(final int n) {
            return new j[n];
        }
    }
}
