// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.systemNotifications;

import android.os.Parcelable$Creator;
import java.io.Serializable;
import com.untis.mobile.ui.activities.period.PeriodDetailActivity;
import kotlin.h0;
import com.untis.mobile.ui.activities.InfoCenterActivity;
import com.untis.mobile.ui.activities.common.b;
import org.jetbrains.annotations.f;
import com.untis.mobile.persistence.models.timetable.TimeTableEntity;
import com.untis.mobile.persistence.models.EntityType;
import kotlin.text.s;
import kotlin.i;
import android.os.Parcel;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import android.os.Parcelable;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u001f\u0018\u0000 ]2\u00020\u0001:\u0001GB\u0089\u0001\u0012\b\b\u0002\u0010Y\u001a\u00020\t\u0012\b\b\u0002\u00102\u001a\u00020\t\u0012\b\b\u0002\u0010Q\u001a\u00020\u0013\u0012\b\b\u0002\u0010J\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0013\u0012\b\b\u0002\u0010\"\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0013\u0012\b\b\u0002\u0010>\u001a\u000207\u0012\b\b\u0002\u00106\u001a\u00020\u0004\u0012\b\b\u0002\u0010F\u001a\u00020?\u0012\b\b\u0002\u0010N\u001a\u00020\u0013\u0012\b\b\u0002\u0010)\u001a\u00020\u0004\u0012\b\b\u0002\u0010V\u001a\u00020\t¢\u0006\u0004\bZ\u0010[B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\bZ\u0010\\J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0011\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\b\u0010\r\u001a\u00020\tH\u0016J\u000e\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000f0\u000eJ\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011R\"\u0010\u001a\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\"\u0010\"\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\"\u0010)\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R(\u00102\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b*\u0010+\u0012\u0004\b0\u00101\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00106\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010$\u001a\u0004\b4\u0010&\"\u0004\b5\u0010(R\"\u0010>\u001a\u0002078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\"\u0010F\u001a\u00020?8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010J\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b$\u0010$\u0012\u0004\bI\u00101\u001a\u0004\bG\u0010&\"\u0004\bH\u0010(R\"\u0010N\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010\u0015\u001a\u0004\bL\u0010\u0017\"\u0004\bM\u0010\u0019R\"\u0010Q\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010\u0015\u001a\u0004\bO\u0010\u0017\"\u0004\bP\u0010\u0019R(\u0010V\u001a\u00020\t8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bR\u0010+\u0012\u0004\bU\u00101\u001a\u0004\bS\u0010-\"\u0004\bT\u0010/R\"\u0010Y\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010+\u001a\u0004\bW\u0010-\"\u0004\bX\u0010/¨\u0006^" }, d2 = { "Lcom/untis/mobile/systemNotifications/a;", "Landroid/os/Parcelable;", "Lcom/untis/mobile/persistence/models/EntityType;", "p", "", "o", "()Ljava/lang/Long;", "Landroid/os/Parcel;", "parcel", "", "flags", "Lkotlin/j2;", "writeToParcel", "describeContents", "Ljava/lang/Class;", "Lcom/untis/mobile/ui/activities/common/b;", "l", "Lcom/untis/mobile/persistence/models/timetable/TimeTableEntity;", "G", "", "M", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "A", "(Ljava/lang/String;)V", "messageLong", "K", "q", "E", "title", "L", "h", "z", "message", "R", "J", "n", "()J", "D", "(J)V", "target", "H", "I", "f", "()I", "y", "(I)V", "getJobId$annotations", "()V", "jobId", "O", "c", "v", "entityId", "Lcom/untis/mobile/systemNotifications/e;", "N", "Lcom/untis/mobile/systemNotifications/e;", "r", "()Lcom/untis/mobile/systemNotifications/e;", "F", "(Lcom/untis/mobile/systemNotifications/e;)V", "type", "", "P", "Z", "s", "()Z", "u", "(Z)V", "isDeleted", "a", "t", "getDateTime$annotations", "dateTime", "Q", "d", "w", "extras", "m", "C", "profileId", "S", "j", "B", "getOffset$annotations", "offset", "e", "x", "id", "<init>", "(IILjava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/untis/mobile/systemNotifications/e;JZLjava/lang/String;JI)V", "(Landroid/os/Parcel;)V", "CREATOR", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class a implements Parcelable
{
    @e
    public static final a CREATOR;
    private int G;
    private int H;
    @e
    private String I;
    private long J;
    @e
    private String K;
    @e
    private String L;
    @e
    private String M;
    @e
    private com.untis.mobile.systemNotifications.e N;
    private long O;
    private boolean P;
    @e
    private String Q;
    private long R;
    private int S;
    
    static {
        CREATOR = new a(null);
    }
    
    public a() {
        this(0, 0, null, 0L, null, null, null, null, 0L, false, null, 0L, 0, 8191, null);
    }
    
    public a(final int g, final int h, @e final String i, final long j, @e final String k, @e final String l, @e final String m, @e final com.untis.mobile.systemNotifications.e n, final long o, final boolean p13, @e final String q, final long r, final int s) {
        k0.p(i, "profileId");
        k0.p(k, "title");
        k0.p(l, "message");
        k0.p(m, "messageLong");
        k0.p(n, "type");
        k0.p(q, "extras");
        this.G = g;
        this.H = h;
        this.I = i;
        this.J = j;
        this.K = k;
        this.L = l;
        this.M = m;
        this.N = n;
        this.O = o;
        this.P = p13;
        this.Q = q;
        this.R = r;
        this.S = s;
    }
    
    public a(@e final Parcel parcel) {
        k0.p(parcel, "parcel");
        final int int1 = parcel.readInt();
        final int int2 = parcel.readInt();
        String string = parcel.readString();
        if (string == null) {
            string = "";
        }
        final long long1 = parcel.readLong();
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
        final com.untis.mobile.systemNotifications.e a = com.untis.mobile.systemNotifications.e.H.a(parcel.readInt());
        final long long2 = parcel.readLong();
        final boolean b = parcel.readByte() != 0;
        String string5 = parcel.readString();
        if (string5 == null) {
            string5 = "";
        }
        this(int1, int2, string, long1, string2, string3, string4, a, long2, b, string5, parcel.readLong(), parcel.readInt());
    }
    
    private final Long o() {
        Long z0;
        try {
            z0 = s.Z0((String)s.S4((CharSequence)this.Q, new String[] { "@" }, false, 0, 6, (Object)null).get(1));
        }
        catch (Exception ex) {
            z0 = null;
        }
        return z0;
    }
    
    private final EntityType p() {
        EntityType by = null;
        try {
            final EntityType.Companion companion = EntityType.Companion;
            final Integer x0 = s.X0((String)s.S4((CharSequence)this.Q, new String[] { "@" }, false, 0, 6, (Object)null).get(0));
            if (x0 == null) {
                return null;
            }
            by = companion.findBy((int)x0);
            return by;
        }
        catch (Exception ex) {
            return by;
        }
    }
    
    public final void A(@e final String m) {
        k0.p(m, "<set-?>");
        this.M = m;
    }
    
    public final void B(final int s) {
        this.S = s;
    }
    
    public final void C(@e final String i) {
        k0.p(i, "<set-?>");
        this.I = i;
    }
    
    public final void D(final long r) {
        this.R = r;
    }
    
    public final void E(@e final String k) {
        k0.p(k, "<set-?>");
        this.K = k;
    }
    
    public final void F(@e final com.untis.mobile.systemNotifications.e n) {
        k0.p(n, "<set-?>");
        this.N = n;
    }
    
    @f
    public final TimeTableEntity G() {
        final EntityType p = this.p();
        if (p == null) {
            return null;
        }
        final Long o = this.o();
        if (o == null) {
            return null;
        }
        return new TimeTableEntity(p, o, false, 0, 0L, null, 60, null);
    }
    
    public final long a() {
        return this.J;
    }
    
    public final long c() {
        return this.O;
    }
    
    @e
    public final String d() {
        return this.Q;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public final int e() {
        return this.G;
    }
    
    public final int f() {
        return this.H;
    }
    
    @e
    public final String h() {
        return this.L;
    }
    
    @e
    public final String i() {
        return this.M;
    }
    
    public final int j() {
        return this.S;
    }
    
    @e
    public final Class<? extends com.untis.mobile.ui.activities.common.b> l() {
        final Class<InfoCenterActivity> clazz = InfoCenterActivity.class;
        final int n = b.a[this.N.ordinal()];
        Serializable s = clazz;
        if (n != 1) {
            s = clazz;
            if (n != 2) {
                if (n != 3) {
                    s = clazz;
                    if (n != 4) {
                        if (n != 5) {
                            throw new h0();
                        }
                        s = clazz;
                    }
                }
                else {
                    s = PeriodDetailActivity.class;
                }
            }
        }
        return (Class<? extends com.untis.mobile.ui.activities.common.b>)s;
    }
    
    @e
    public final String m() {
        return this.I;
    }
    
    public final long n() {
        return this.R;
    }
    
    @e
    public final String q() {
        return this.K;
    }
    
    @e
    public final com.untis.mobile.systemNotifications.e r() {
        return this.N;
    }
    
    public final boolean s() {
        return this.P;
    }
    
    public final void t(final long j) {
        this.J = j;
    }
    
    public final void u(final boolean p) {
        this.P = p;
    }
    
    public final void v(final long o) {
        this.O = o;
    }
    
    public final void w(@e final String q) {
        k0.p(q, "<set-?>");
        this.Q = q;
    }
    
    public void writeToParcel(@e final Parcel parcel, final int n) {
        k0.p(parcel, "parcel");
        parcel.writeInt(this.G);
        parcel.writeInt(this.H);
        parcel.writeString(this.I);
        parcel.writeLong(this.J);
        parcel.writeString(this.K);
        parcel.writeString(this.L);
        parcel.writeString(this.M);
        parcel.writeInt(this.N.d());
        parcel.writeLong(this.O);
        parcel.writeByte((byte)(byte)(this.P ? 1 : 0));
        parcel.writeString(this.Q);
        parcel.writeLong(this.R);
        parcel.writeInt(this.S);
    }
    
    public final void x(final int g) {
        this.G = g;
    }
    
    public final void y(final int h) {
        this.H = h;
    }
    
    public final void z(@e final String l) {
        k0.p(l, "<set-?>");
        this.L = l;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\r" }, d2 = { "com/untis/mobile/systemNotifications/a$a", "Landroid/os/Parcelable$Creator;", "Lcom/untis/mobile/systemNotifications/a;", "Landroid/os/Parcel;", "parcel", "a", "", "size", "", "b", "(I)[Lcom/untis/mobile/systemNotifications/a;", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a implements Parcelable$Creator<com.untis.mobile.systemNotifications.a>
    {
        private a() {
        }
        
        @e
        public com.untis.mobile.systemNotifications.a a(@e final Parcel parcel) {
            k0.p(parcel, "parcel");
            return new com.untis.mobile.systemNotifications.a(parcel);
        }
        
        @e
        public com.untis.mobile.systemNotifications.a[] b(final int n) {
            return new com.untis.mobile.systemNotifications.a[n];
        }
    }
}
