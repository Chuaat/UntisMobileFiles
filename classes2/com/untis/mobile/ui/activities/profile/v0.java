// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.ui.activities.profile;

import android.os.Parcelable$Creator;
import kotlin.jvm.internal.k0;
import android.os.Parcel;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0017\u0018\u0000 '2\u00020\u0001:\u0001\u0014B9\u0012\b\b\u0002\u0010#\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0011¢\u0006\u0004\b$\u0010%B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b$\u0010&J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016R\"\u0010\u0010\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u001c\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u000b\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\"\u0010\u001f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u000b\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\"\u0010#\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000f¨\u0006(" }, d2 = { "Lcom/untis/mobile/ui/activities/profile/v0;", "Landroid/os/Parcelable;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "", "H", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "i", "(Ljava/lang/String;)V", "userAppSharedSecret", "", "K", "J", "a", "()J", "f", "(J)V", "schoolId", "I", "b", "g", "schoolLogin", "c", "h", "schoolUrl", "G", "e", "j", "userLogin", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;J)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class v0 implements Parcelable
{
    @e
    public static final a CREATOR;
    @e
    private String G;
    @e
    private String H;
    @e
    private String I;
    @e
    private String J;
    private long K;
    
    static {
        CREATOR = new a(null);
    }
    
    public v0() {
        this(null, null, null, null, 0L, 31, null);
    }
    
    public v0(@e final Parcel parcel) {
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
        this(string, string2, string3, string4, parcel.readLong());
    }
    
    public v0(@e final String g, @e final String h, @e final String i, @e final String j, final long k) {
        k0.p(g, "userLogin");
        k0.p(h, "userAppSharedSecret");
        k0.p(i, "schoolLogin");
        k0.p(j, "schoolUrl");
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
    }
    
    public final long a() {
        return this.K;
    }
    
    @e
    public final String b() {
        return this.I;
    }
    
    @e
    public final String c() {
        return this.J;
    }
    
    @e
    public final String d() {
        return this.H;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @e
    public final String e() {
        return this.G;
    }
    
    public final void f(final long k) {
        this.K = k;
    }
    
    public final void g(@e final String i) {
        k0.p(i, "<set-?>");
        this.I = i;
    }
    
    public final void h(@e final String j) {
        k0.p(j, "<set-?>");
        this.J = j;
    }
    
    public final void i(@e final String h) {
        k0.p(h, "<set-?>");
        this.H = h;
    }
    
    public final void j(@e final String g) {
        k0.p(g, "<set-?>");
        this.G = g;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeString(this.G);
        parcel.writeString(this.H);
        parcel.writeString(this.I);
        parcel.writeString(this.J);
        parcel.writeLong(this.K);
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "com/untis/mobile/ui/activities/profile/v0$a", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/ui/activities/profile/v0;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/untis/mobile/ui/activities/profile/v0;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a implements Parcelable$Creator<v0>
    {
        private a() {
        }
        
        @e
        public v0 a(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new v0(parcel);
        }
        
        @e
        public v0[] b(final int n) {
            return new v0[n];
        }
    }
}
