// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.realm;

import com.untis.mobile.a;
import java.util.Iterator;
import io.realm.t0;
import java.util.ArrayList;
import java.util.HashSet;
import io.realm.r0;
import io.realm.l;
import org.jetbrains.annotations.f;
import java.util.ListIterator;
import java.util.List;
import android.util.Log;
import kotlin.collections.v;
import kotlin.text.o;
import io.realm.k;
import kotlin.jvm.internal.k0;
import kotlin.jvm.internal.w;
import org.jetbrains.annotations.e;
import kotlin.Metadata;
import io.realm.m0;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\"\u0010\b\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0096\u0002J\b\u0010\u000e\u001a\u00020\rH\u0016¨\u0006\u0011" }, d2 = { "Lcom/untis/mobile/persistence/realm/j;", "Lio/realm/m0;", "Lio/realm/j;", "realm", "", "old", "newVersion", "Lkotlin/j2;", "a", "", "other", "", "equals", "", "hashCode", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class j implements m0
{
    @e
    public static final a a;
    @e
    private static final Class<Boolean> b;
    @e
    private static final Class<Long> c;
    @e
    private static final Class<Integer> d;
    @e
    private static final Class<Float> e;
    
    static {
        a = new a(null);
        final Class<Boolean> type = Boolean.TYPE;
        k0.m(type);
        b = type;
        final Class<Long> type2 = Long.TYPE;
        k0.m(type2);
        c = type2;
        final Class<Integer> type3 = Integer.TYPE;
        k0.m(type3);
        d = type3;
        final Class<Float> type4 = Float.TYPE;
        k0.m(type4);
        e = type4;
    }
    
    public static final /* synthetic */ Class e() {
        return j.b;
    }
    
    public static final /* synthetic */ Class f() {
        return j.e;
    }
    
    public static final /* synthetic */ Class g() {
        return j.d;
    }
    
    public static final /* synthetic */ Class h() {
        return j.c;
    }
    
    private static final void i(final k k) {
        k.V8("sync", k.J8("id") > 0L || k.J8("periodId") > 0L);
    }
    
    private static final void j(final k k) {
        try {
            final String s = k.v8("key");
            k0.o(s, "key");
            final List m = new o("@").m((CharSequence)s, 0);
            List<Object> list = null;
            Label_0112: {
                if (!m.isEmpty()) {
                    final ListIterator<String> listIterator = m.listIterator(m.size());
                    while (listIterator.hasPrevious()) {
                        if (listIterator.previous().length() != 0) {
                            list = v.w5((Iterable<?>)m, listIterator.nextIndex() + 1);
                            break Label_0112;
                        }
                    }
                }
                list = v.E();
            }
            final Object[] array = list.toArray((Object[])new String[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
            }
            final String[] array2 = (String[])array;
            final Integer value = Integer.valueOf(array2[0]);
            k0.o(value, "valueOf(split[0])");
            k.b9("entityType", value.intValue());
            final Long value2 = Long.valueOf(array2[1]);
            k0.o(value2, "valueOf(split[1])");
            k.d9("entityId", value2.longValue());
        }
        catch (Exception ex) {
            Log.e("untis_log", "transformation of realmCustomEntityColor failed", (Throwable)ex);
        }
    }
    
    private static final void k(final k k) {
        if (k.R8("profileId")) {
            k.j9("profileId", "");
        }
        if (k.R8("title")) {
            k.j9("title", "");
        }
        if (k.R8("message")) {
            k.j9("message", "");
        }
        if (k.R8("messageLong")) {
            k.j9("messageLong", "");
        }
        if (k.R8("extras")) {
            k.j9("extras", "");
        }
    }
    
    @Override
    public void a(@f final io.realm.j j, final long n, long n2) {
        // monitorenter(this)
        Label_0017: {
            if (j != null) {
                break Label_0017;
            }
            try {
                Log.e("untis_log", "migration not possible because null");
                return;
                // iftrue(Label_11369:, n2 != 69L)
                // iftrue(Label_8643:, n6 != 55L)
                // iftrue(Label_9255:, n2 != 61L)
                // iftrue(Label_11428:, n4 != 70L)
                // iftrue(Label_0257:, n2 != 45L)
                // iftrue(Label_11003:, h5 != null)
                // iftrue(Label_11058:, h6 != null)
                // iftrue(Label_11177:, n9 != 67L)
                // iftrue(Label_4324:, n2 != 54L)
                // iftrue(Label_11398:, h7 != null)
                // iftrue(Label_8813:, n5 != 56L)
                // iftrue(Label_11090:, c5 != null)
                // iftrue(Label_0129:, n > 44L)
                // iftrue(Label_10636:, c16 != null)
                // iftrue(Label_10974:, n2 != 64L)
                // iftrue(Label_10584:, h28 != null)
                // iftrue(Label_4265:, n12 != 53L)
                // iftrue(Label_4127:, n2 != 51L)
                // iftrue(Label_0656:, n3 != 46L)
                // iftrue(Label_8948:, n10 != 58L)
                // iftrue(Label_11147:, h20 != null)
                // iftrue(Label_10607:, c17 != null)
                // iftrue(Label_4190:, n15 != 52L)
                // iftrue(Label_8850:, n2 != 57L)
                // iftrue(Label_11265:, h116 != null)
                // iftrue(Label_0675:, n2 != 47L)
                // iftrue(Label_11236:, n8 != 68L)
                // iftrue(Label_11302:, h117 != null)
                // iftrue(Label_9328:, n7 != 62L)
                // iftrue(Label_11339:, h120 != null)
                // iftrue(Label_11027:, n13 != 65L)
                // iftrue(Label_3925:, n2 != 49L)
                // iftrue(Label_4066:, n14 != 50L)
                // iftrue(Label_10897:, n17 != 63L)
                // iftrue(Label_1153:, n11 != 48L)
                // iftrue(Label_9047:, n2 != 59L)
                // iftrue(Label_9194:, n16 != 60L)
                // iftrue(Label_11118:, n2 != 66L)
                // iftrue(Label_10665:, c4 != null)
                t0 h = null;
                r0 e;
                Class<Long> c;
                r0 c2;
                Class<Boolean> b;
                r0 e2;
                Class<Integer> d;
                r0 c3;
                r0 h2;
                r0 f;
                r0 h3;
                long n3 = 0L;
                r0 c4;
                l i = null;
                long n4;
                long n6 = 0L;
                long n5 = 0L;
                long n7 = 0L;
                r0 h4;
                r0 c5;
                l k;
                long n8 = 0L;
                r0 h5;
                long n9;
                StringBuilder sb;
                r0 h6;
                r0 h7;
                r0 e3;
                Class<Long> c6;
                r0 c7;
                Class<Integer> d2;
                r0 c8;
                Class<Boolean> b2;
                r0 e4;
                r0 h8;
                r0 h9;
                r0 h10;
                r0 c9;
                r0 h11;
                r0 h12;
                r0 h13;
                r0 c10;
                r0 h14;
                r0 c11;
                r0 h15;
                r0 h16;
                r0 h17;
                HashSet<Long> set;
                ArrayList<k> list;
                long j2;
                Iterator<k> iterator2;
                r0 h18;
                r0 h19;
                long n10 = 0L;
                r0 h20;
                StringBuilder sb2;
                r0 e6;
                Class<Long> c12;
                r0 c13;
                r0 h21;
                r0 f2;
                Class<Boolean> b3;
                r0 h22;
                r0 h23;
                r0 c14;
                Class<Integer> d3;
                r0 c15;
                r0 h24;
                long n11 = 0L;
                r0 c17;
                r0 c16 = null;
                r0 h25;
                r0 h26;
                long n12;
                r0 e7;
                Class<Long> c18;
                long n13 = 0L;
                r0 e8;
                Class<Long> c19 = null;
                l h27 = null;
                r0 c20;
                r0 c21;
                Class<Boolean> b4;
                r0 c22;
                Class<Integer> d4 = null;
                r0 h28 = null;
                r0 e9;
                Class<Integer> d5;
                r0 c23;
                Class<Long> c24;
                long n14 = 0L;
                long n15 = 0L;
                r0 e10;
                Class<Integer> d6;
                r0 e11;
                Class<Long> c25;
                r0 h29;
                r0 h30;
                r0 h31;
                r0 h32;
                r0 h33;
                Class<Boolean> b5;
                r0 c26;
                Class<Integer> d7;
                r0 c27;
                r0 h34;
                r0 h35;
                r0 h36;
                r0 h37;
                r0 h38;
                r0 h39;
                r0 h40;
                r0 h41;
                r0 h42;
                r0 c28;
                r0 h43;
                r0 h44;
                r0 c29;
                r0 h45;
                r0 c30;
                Class<Float> e12;
                r0 c31;
                r0 h46;
                r0 c32;
                r0 h47;
                r0 f3;
                r0 h48;
                r0 h49;
                r0 e13;
                r0 h50;
                r0 e14;
                r0 h51;
                r0 e15;
                r0 h52;
                r0 e16;
                r0 h53;
                r0 f4;
                r0 h54;
                r0 c33;
                r0 h55;
                r0 f5;
                r0 h56;
                r0 f6;
                r0 h57;
                r0 c34;
                r0 h58;
                r0 f7;
                r0 h59;
                r0 f8;
                r0 h60;
                r0 f9;
                r0 h61;
                r0 f10;
                r0 h62;
                r0 f11;
                r0 h63;
                r0 c35;
                r0 h64;
                r0 f12;
                r0 h65;
                r0 f13;
                r0 h66;
                r0 f14;
                r0 h67;
                r0 c36;
                r0 h68;
                r0 f15;
                r0 h69;
                r0 f16;
                r0 h70;
                r0 h71;
                r0 h72;
                r0 h73;
                r0 h74;
                r0 h75;
                r0 h76;
                r0 c37;
                r0 h77;
                r0 h78;
                r0 h79;
                r0 e17;
                r0 h80;
                r0 h81;
                r0 h82;
                r0 h83;
                r0 h84;
                r0 h85;
                r0 h86;
                r0 h87;
                r0 h88;
                r0 h89;
                r0 h90;
                r0 h91;
                r0 h92;
                r0 h93;
                r0 h94;
                r0 h95;
                r0 h96;
                r0 h97;
                r0 h98;
                r0 h99;
                r0 h100;
                r0 h101;
                r0 h102;
                r0 h103;
                r0 h104;
                r0 h105;
                r0 h106;
                r0 h107;
                r0 h108;
                r0 h109;
                r0 h110;
                r0 h111;
                r0 h112;
                r0 h113;
                r0 h114;
                r0 h115;
                r0 h116;
                r0 h117;
                r0 e18;
                Class<Long> c38;
                r0 h118;
                r0 h119;
                long n16 = 0L;
                long n17 = 0L;
                r0 h120;
                r0 h121;
                r0 h122;
                r0 h123;
                r0 e19;
                Class<Long> c39;
                r0 c40;
                Class<Boolean> b6;
                r0 e20;
                Class<Integer> d8;
                r0 c41;
                r0 h124;
                r0 h125;
                r0 h126;
                r0 h127;
                r0 c42;
                r0 h128;
                r0 c43;
                r0 h129;
                r0 e21;
                r0 h130;
                r0 h131;
                r0 h132;
                r0 e22;
                r0 h133;
                r0 h134;
                r0 h135;
                r0 e23;
                r0 h136;
                r0 h137;
                r0 h138;
                r0 e24;
                r0 h139;
                r0 h140;
                r0 h141;
                r0 c44;
                r0 h142;
                r0 f17;
                r0 h143;
                r0 f18;
                r0 h144;
                r0 f19;
                r0 h145;
                r0 f20;
                r0 h146;
                r0 f21;
                r0 h147;
                r0 c45;
                r0 h148;
                r0 c46;
                r0 h149;
                r0 c47;
                r0 h150;
                r0 h151;
                r0 h152;
                r0 h153;
                r0 h154;
                r0 c48;
                r0 h155;
                r0 h156;
                r0 h157;
                r0 e25;
                l l;
                r0 h158;
                r0 e26;
                r0 h159;
                r0 f22;
                r0 h160;
                r0 h161;
                r0 h162;
                r0 h163;
                l m;
                r0 h164;
                Label_11055:Label_11203_Outer:
                while (true) {
                    Label_11203:Block_31_Outer:Label_10897_Outer:Block_13_Outer:
                    while (true) {
                    Block_34:
                        while (true) {
                        Block_12:
                            while (true) {
                            Label_11336:
                                while (true) {
                                    Block_26: {
                                        Block_7_Outer:Label_8850_Outer:Block_36_Outer:Label_9328_Outer:
                                        while (true) {
                                            Label_11027: {
                                                while (true) {
                                                Block_23:
                                                    while (true) {
                                                        Block_36:Block_20_Outer:
                                                        while (true) {
                                                            while (true) {
                                                                Label_8948: {
                                                                    while (true) {
                                                                    Label_8813_Outer:
                                                                        while (true) {
                                                                        Block_18:
                                                                            while (true) {
                                                                                Block_17: {
                                                                                    while (true) {
                                                                                    Block_11:
                                                                                        while (true) {
                                                                                        Block_8_Outer:
                                                                                            while (true) {
                                                                                            Block_10_Outer:
                                                                                                while (true) {
                                                                                                    while (true) {
                                                                                                    Label_3925:
                                                                                                        while (true) {
                                                                                                        Label_1153:
                                                                                                            while (true) {
                                                                                                                Label_10974: {
                                                                                                                    Label_9194_Outer:Label_0132_Outer:
                                                                                                                    while (true) {
                                                                                                                        Block_15: {
                                                                                                                            Label_2272: {
                                                                                                                            Label_0132:
                                                                                                                                while (true) {
                                                                                                                                    Label_11000: {
                                                                                                                                        Label_11323: {
                                                                                                                                        Block_37_Outer:
                                                                                                                                            while (true) {
                                                                                                                                                while (true) {
                                                                                                                                                    Label_11177: {
                                                                                                                                                        Label_0656: {
                                                                                                                                                            while (true) {
                                                                                                                                                                while (true) {
                                                                                                                                                                Label_11395:
                                                                                                                                                                    while (true) {
                                                                                                                                                                        while (true) {
                                                                                                                                                                            Block_16: {
                                                                                                                                                                                Label_11144:Block_19_Outer:
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    Block_33: {
                                                                                                                                                                                        while (true) {
                                                                                                                                                                                        Label_11236_Outer:
                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                e = h.e("Child");
                                                                                                                                                                                                c = j.c;
                                                                                                                                                                                                c2 = e.c("id", c, new l[0]).c("firstName", String.class, new l[0]).c("lastName", String.class, new l[0]);
                                                                                                                                                                                                b = j.b;
                                                                                                                                                                                                c2.c("accessibleTimeTable", b, new l[0]).e("id");
                                                                                                                                                                                                e2 = h.e("RealmInteger");
                                                                                                                                                                                                d = j.d;
                                                                                                                                                                                                e2.c("value", d, new l[0]);
                                                                                                                                                                                                c3 = h.e("Profile").c("id", c, new l[0]).c("userDisplayName", String.class, new l[0]).c("userLogin", String.class, new l[0]).c("userSecret", String.class, new l[0]).c("schoolDisplayName", String.class, new l[0]).c("schoolUrl", String.class, new l[0]).c("schoolLogin", String.class, new l[0]).c("schoolServerTimeDelta", c, new l[0]).c("userEntityType", d, new l[0]).c("userEntityId", c, new l[0]).c("userOriginalEntityType", d, new l[0]).c("userOriginalEntityId", c, new l[0]).c("departmentId", c, new l[0]);
                                                                                                                                                                                                h2 = h.h("RealmInteger");
                                                                                                                                                                                                k0.m(h2);
                                                                                                                                                                                                f = c3.f("can", h2);
                                                                                                                                                                                                h3 = h.h("Child");
                                                                                                                                                                                                k0.m(h3);
                                                                                                                                                                                                f.f("children", h3).c("timeTableAccess", b, new l[0]).c("updated", b, new l[0]).c("periodDataSynchronisation", c, new l[0]).c("masterDataSynchronisation", c, new l[0]).e("id");
                                                                                                                                                                                                n2 = n3 + 1L;
                                                                                                                                                                                                break Label_0656;
                                                                                                                                                                                                Label_10665: {
                                                                                                                                                                                                    c4.c("authenticationToken", String.class, i);
                                                                                                                                                                                                }
                                                                                                                                                                                                break Label_11336;
                                                                                                                                                                                                Label_0257: {
                                                                                                                                                                                                    Block_29: {
                                                                                                                                                                                                    Label_4066:
                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                            while (true) {
                                                                                                                                                                                                                Block_4: {
                                                                                                                                                                                                                Block_27:
                                                                                                                                                                                                                    while (true) {
                                                                                                                                                                                                                        while (true) {
                                                                                                                                                                                                                            Block_38: {
                                                                                                                                                                                                                                while (true) {
                                                                                                                                                                                                                                    n4 = n2;
                                                                                                                                                                                                                                    break Label_11395;
                                                                                                                                                                                                                                    n5 = n6;
                                                                                                                                                                                                                                    break Block_16;
                                                                                                                                                                                                                                    n7 = n2;
                                                                                                                                                                                                                                    break Label_8813_Outer;
                                                                                                                                                                                                                                    h4 = h.h("RealmClassRegEvent");
                                                                                                                                                                                                                                    k0.m(h4);
                                                                                                                                                                                                                                    h4.c("sync", j.b, new l[0]).M((r0.c)g.a);
                                                                                                                                                                                                                                    n2 = 45L;
                                                                                                                                                                                                                                    break Label_0132;
                                                                                                                                                                                                                                    n2 = n4;
                                                                                                                                                                                                                                    break Block_38;
                                                                                                                                                                                                                                    n3 = n2;
                                                                                                                                                                                                                                    break Block_4;
                                                                                                                                                                                                                                    Label_11090:
                                                                                                                                                                                                                                    c5.c("schoolSemanticApiVersion", String.class, k);
                                                                                                                                                                                                                                    break Label_11055;
                                                                                                                                                                                                                                    n2 = n8 + 1L;
                                                                                                                                                                                                                                    continue Label_9194_Outer;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                n2 = n4 + 1L;
                                                                                                                                                                                                                                Label_11428: {
                                                                                                                                                                                                                                    break Label_11428;
                                                                                                                                                                                                                                    h5 = h.h("RealmTimeTableModel");
                                                                                                                                                                                                                                    break Label_11000;
                                                                                                                                                                                                                                    n8 = n9 + 1L;
                                                                                                                                                                                                                                    break Label_11177;
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                sb = new StringBuilder();
                                                                                                                                                                                                                                sb.append("updated from ");
                                                                                                                                                                                                                                sb.append(n);
                                                                                                                                                                                                                                sb.append(" to ");
                                                                                                                                                                                                                                sb.append(n2);
                                                                                                                                                                                                                                Log.d("untis_log", sb.toString());
                                                                                                                                                                                                                                return;
                                                                                                                                                                                                                                h6 = h.h("RealmProfile");
                                                                                                                                                                                                                                break Label_11055;
                                                                                                                                                                                                                                n8 = n9;
                                                                                                                                                                                                                                break Block_33;
                                                                                                                                                                                                                                n6 = n2;
                                                                                                                                                                                                                                break Block_15;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            h7 = h.h("RealmProfile");
                                                                                                                                                                                                                            continue Label_11395;
                                                                                                                                                                                                                            e3 = h.e("RealmSubject");
                                                                                                                                                                                                                            c6 = j.c;
                                                                                                                                                                                                                            c7 = e3.c("id", c6, new l[0]).c("name", String.class, new l[0]).c("longName", String.class, new l[0]);
                                                                                                                                                                                                                            d2 = j.d;
                                                                                                                                                                                                                            c8 = c7.c("foreColor", d2, new l[0]).c("backColor", d2, new l[0]);
                                                                                                                                                                                                                            b2 = j.b;
                                                                                                                                                                                                                            c8.c("active", b2, new l[0]).c("displayable", b2, new l[0]).e("id");
                                                                                                                                                                                                                            h.e("RealmTeacher").c("id", c6, new l[0]).c("name", String.class, new l[0]).c("firstName", String.class, new l[0]).c("lastName", String.class, new l[0]).c("foreColor", d2, new l[0]).c("backColor", d2, new l[0]).c("active", b2, new l[0]).c("displayable", b2, new l[0]).e("id");
                                                                                                                                                                                                                            h.e("RealmRoom").c("id", c6, new l[0]).c("name", String.class, new l[0]).c("longName", String.class, new l[0]).c("foreColor", d2, new l[0]).c("backColor", d2, new l[0]).c("active", b2, new l[0]).c("displayable", b2, new l[0]).e("id");
                                                                                                                                                                                                                            h.e("RealmKlasse").c("id", c6, new l[0]).c("name", String.class, new l[0]).c("longName", String.class, new l[0]).c("start", c6, new l[0]).c("end", c6, new l[0]).c("foreColor", d2, new l[0]).c("backColor", d2, new l[0]).c("active", b2, new l[0]).c("displayable", b2, new l[0]).e("id");
                                                                                                                                                                                                                            h.e("RealmDepartment").c("id", c6, new l[0]).c("name", String.class, new l[0]).c("longName", String.class, new l[0]).e("id");
                                                                                                                                                                                                                            h.e("RealmHoliday").c("id", c6, new l[0]).c("name", String.class, new l[0]).c("longName", String.class, new l[0]).c("start", c6, new l[0]).c("end", c6, new l[0]).e("id");
                                                                                                                                                                                                                            e4 = h.e("RealmParentDayStudent");
                                                                                                                                                                                                                            h8 = h.h("RealmStudent");
                                                                                                                                                                                                                            k0.m(h8);
                                                                                                                                                                                                                            h9 = e4.h("student", h8);
                                                                                                                                                                                                                            h10 = h.h("RealmSubject");
                                                                                                                                                                                                                            k0.m(h10);
                                                                                                                                                                                                                            h9.f("subject", h10);
                                                                                                                                                                                                                            c9 = h.e("RealmParentDayAppointment").c("id", c6, new l[0]).c("start", c6, new l[0]).c("end", c6, new l[0]);
                                                                                                                                                                                                                            h11 = h.h("RealmTeacher");
                                                                                                                                                                                                                            k0.m(h11);
                                                                                                                                                                                                                            h12 = c9.h("teacher", h11);
                                                                                                                                                                                                                            h13 = h.h("RealmRoom");
                                                                                                                                                                                                                            k0.m(h13);
                                                                                                                                                                                                                            c10 = h12.h("room", h13).c("cancelled", b2, new l[0]);
                                                                                                                                                                                                                            h14 = h.h("RealmParentDayStudent");
                                                                                                                                                                                                                            k0.m(h14);
                                                                                                                                                                                                                            c10.f("students", h14).e("id");
                                                                                                                                                                                                                            c11 = h.e("RealmParentDay").c("id", c6, new l[0]).c("name", String.class, new l[0]).c("start", c6, new l[0]).c("end", c6, new l[0]);
                                                                                                                                                                                                                            h15 = h.h("RealmParentDayAppointment");
                                                                                                                                                                                                                            k0.m(h15);
                                                                                                                                                                                                                            c11.f("appointments", h15).e("id");
                                                                                                                                                                                                                            h16 = h.h("ClassRegEvent");
                                                                                                                                                                                                                            k0.m(h16);
                                                                                                                                                                                                                            h16.I("RealmClassRegEvent").H("entityTypeRaw", "entityType").H("dateTimeRaw", "dateTime").H("sync", "synced");
                                                                                                                                                                                                                            h17 = h.h("ClassRegEventReason");
                                                                                                                                                                                                                            k0.m(h17);
                                                                                                                                                                                                                            h17.I("RealmEventReason").E("typeRaw").c("entityType", d2, new l[0]);
                                                                                                                                                                                                                            try {
                                                                                                                                                                                                                                set = new HashSet<Long>();
                                                                                                                                                                                                                                list = new ArrayList<k>();
                                                                                                                                                                                                                                for (final k e5 : j.Q0("ClassRegEventReasonGroup").b0()) {
                                                                                                                                                                                                                                    j2 = e5.J8("id");
                                                                                                                                                                                                                                    if (set.contains(j2)) {
                                                                                                                                                                                                                                        list.add(e5);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    else {
                                                                                                                                                                                                                                        set.add(j2);
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                iterator2 = list.iterator();
                                                                                                                                                                                                                                while (iterator2.hasNext()) {
                                                                                                                                                                                                                                    iterator2.next().b8();
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            catch (Exception ex) {
                                                                                                                                                                                                                                Log.e("untis_log", "could not find and clear dangerous doubles in table: ClassRegEventReasonGroup", (Throwable)ex);
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            break Label_2272;
                                                                                                                                                                                                                            n2 = n5;
                                                                                                                                                                                                                            break Block_17;
                                                                                                                                                                                                                            Label_11058:
                                                                                                                                                                                                                            k = io.realm.l.I;
                                                                                                                                                                                                                            c5 = h6.c("schoolSemanticWuVersion", String.class, k);
                                                                                                                                                                                                                            break Label_11203;
                                                                                                                                                                                                                            break Label_11323;
                                                                                                                                                                                                                            break Label_11336;
                                                                                                                                                                                                                            h18 = h.h("RealmPeriodModel");
                                                                                                                                                                                                                            k0.m(h18);
                                                                                                                                                                                                                            h18.c("irregular", j.b, new l[0]);
                                                                                                                                                                                                                            h19 = h.h("RealmSystemNotification");
                                                                                                                                                                                                                            k0.m(h19);
                                                                                                                                                                                                                            h19.M((r0.c)com.untis.mobile.persistence.realm.h.a).L("profileId", true).L("title", true).L("message", true).L("messageLong", true).L("extras", true);
                                                                                                                                                                                                                            n2 = n10 + 1L;
                                                                                                                                                                                                                            break Label_8948;
                                                                                                                                                                                                                            Label_11147:
                                                                                                                                                                                                                            h20.c("showCalendarDetails", Boolean.TYPE, io.realm.l.I);
                                                                                                                                                                                                                            continue Label_11144;
                                                                                                                                                                                                                            sb2 = new StringBuilder();
                                                                                                                                                                                                                            sb2.append("UmRealmService migration started oldVersion: ");
                                                                                                                                                                                                                            sb2.append(n);
                                                                                                                                                                                                                            sb2.append(", newVersion: ");
                                                                                                                                                                                                                            sb2.append(n2);
                                                                                                                                                                                                                            Log.i("untis_log", sb2.toString());
                                                                                                                                                                                                                            h = j.H();
                                                                                                                                                                                                                            continue Label_0132_Outer;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        e6 = h.e("RealmDriveAttachment");
                                                                                                                                                                                                                        c12 = j.c;
                                                                                                                                                                                                                        e6.c("id", c12, new l[0]).c("name", String.class, new l[0]).c("url", String.class, new l[0]).e("id");
                                                                                                                                                                                                                        c13 = h.e("RealmLessonTopic").c("periodId", c12, new l[0]).c("text", String.class, new l[0]).c("start", c12, new l[0]).c("end", c12, new l[0]);
                                                                                                                                                                                                                        h21 = h.h("RealmDriveAttachment");
                                                                                                                                                                                                                        k0.m(h21);
                                                                                                                                                                                                                        f2 = c13.f("driveAttachments", h21);
                                                                                                                                                                                                                        b3 = j.b;
                                                                                                                                                                                                                        f2.c("synced", b3, new l[0]).e("periodId");
                                                                                                                                                                                                                        h22 = h.h("PeriodInfo");
                                                                                                                                                                                                                        k0.m(h22);
                                                                                                                                                                                                                        h23 = h.h("RealmDriveAttachment");
                                                                                                                                                                                                                        k0.m(h23);
                                                                                                                                                                                                                        h22.f("driveAttachments", h23);
                                                                                                                                                                                                                        h.e("RealmStudent").c("id", c12, new l[0]).c("firstName", String.class, new l[0]).c("lastName", String.class, new l[0]).e("id");
                                                                                                                                                                                                                        c14 = h.e("RealmHomework").c("id", c12, new l[0]).c("lessonId", c12, new l[0]).c("start", c12, new l[0]).c("end", c12, new l[0]).c("text", String.class, new l[0]).c("remark", String.class, new l[0]).c("completed", b3, new l[0]);
                                                                                                                                                                                                                        d3 = j.d;
                                                                                                                                                                                                                        c15 = c14.c("entityType", d3, new l[0]).c("entityId", c12, new l[0]).c("synced", b3, new l[0]).c("status", d3, new l[0]);
                                                                                                                                                                                                                        h24 = h.h("RealmDriveAttachment");
                                                                                                                                                                                                                        k0.m(h24);
                                                                                                                                                                                                                        c15.f("driveAttachments", h24).c("local", b3, new l[0]).c("periodId", c12, new l[0]).e("id");
                                                                                                                                                                                                                        n2 = n11 + 1L;
                                                                                                                                                                                                                        break Label_1153;
                                                                                                                                                                                                                        Label_10607:
                                                                                                                                                                                                                        c16 = c17.c("substitutionPlanningUrl", String.class, i);
                                                                                                                                                                                                                        break Block_27;
                                                                                                                                                                                                                        Label_11206:
                                                                                                                                                                                                                        h25.c("registered", Long.TYPE, io.realm.l.I);
                                                                                                                                                                                                                        continue Label_11203;
                                                                                                                                                                                                                        h26 = h.h("RealmSystemNotification");
                                                                                                                                                                                                                        k0.m(h26);
                                                                                                                                                                                                                        h26.c("jobId", j.d, new l[0]);
                                                                                                                                                                                                                        n2 = n12 + 1L;
                                                                                                                                                                                                                        continue Block_8_Outer;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    break Label_11336;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                e7 = h.e("MessageOfDay");
                                                                                                                                                                                                                c18 = j.c;
                                                                                                                                                                                                                e7.c("date", c18, new l[0]).c("subject", String.class, new l[0]).c("body", String.class, new l[0]);
                                                                                                                                                                                                                h.e("MessageOfDayContext").c("date", c18, new l[0]).c("timeStamp", c18, new l[0]).c("viewed", j.b, new l[0]).e("date");
                                                                                                                                                                                                                n3 = n2 + 1L;
                                                                                                                                                                                                                break Label_0257;
                                                                                                                                                                                                                n13 = n2;
                                                                                                                                                                                                                break Block_29;
                                                                                                                                                                                                                e8 = h.e("RealmInfoCenterHomework");
                                                                                                                                                                                                                c19 = j.c;
                                                                                                                                                                                                                h27 = io.realm.l.H;
                                                                                                                                                                                                                c20 = e8.c("key", c19, h27).c("id", c19, new l[0]).c("lessonId", c19, new l[0]);
                                                                                                                                                                                                                i = io.realm.l.I;
                                                                                                                                                                                                                c21 = c20.c("start", String.class, i).c("end", String.class, i).c("text", String.class, i).c("remark", String.class, i);
                                                                                                                                                                                                                b4 = j.b;
                                                                                                                                                                                                                c22 = c21.c("completed", b4, new l[0]);
                                                                                                                                                                                                                d4 = j.d;
                                                                                                                                                                                                                c22.c("entityType", d4, new l[0]).c("entityId", c19, new l[0]).f("driveAttachments", h.h("RealmDriveAttachment"));
                                                                                                                                                                                                                h.e("RealmInfoCenterLesson").c("id", c19, h27).c("subjectId", c19, new l[0]).f("klassenIds", h.h("RealmLong")).f("teacherIds", h.h("RealmLong"));
                                                                                                                                                                                                                h.e("RealmInfoCenterExcuse").c("id", c19, h27).c("excuseStatusId", c19, new l[0]).c("text", String.class, i).c("number", c19, new l[0]).c("date", String.class, i);
                                                                                                                                                                                                                h.e("RealmInfoCenterStudentAbsence").c("id", c19, h27).c("start", String.class, i).c("end", String.class, i).c("text", String.class, i).c("studentId", c19, new l[0]).c("klassenId", c19, new l[0]).c("absenceReasonId", c19, new l[0]).c("excused", b4, new l[0]).c("owner", b4, new l[0]).h("excuse", h.h("RealmInfoCenterExcuse"));
                                                                                                                                                                                                                h.e("RealmClassLeadExcuse").c("id", c19, h27).c("excuseStatusId", c19, new l[0]).c("text", String.class, i).c("number", c19, new l[0]).c("date", String.class, i);
                                                                                                                                                                                                                h.e("RealmClassLeadStudentAbsence").c("id", c19, h27).c("start", String.class, i).c("end", String.class, i).c("text", String.class, i).c("studentId", c19, new l[0]).c("absenceReasonId", c19, new l[0]).c("excused", b4, new l[0]).h("excuse", h.h("RealmClassLeadExcuse"));
                                                                                                                                                                                                                h.e("RealmClassLeadEvent").c("id", c19, h27).c("entityType", d4, new l[0]).c("entityId", c19, new l[0]).c("dateTime", String.class, i).c("text", String.class, i).c("eventReasonId", c19, new l[0]);
                                                                                                                                                                                                                h.e("RealmClassLead").c("klassenId", c19, h27).f("events", h.h("RealmClassLeadEvent")).f("absences", h.h("RealmClassLeadStudentAbsence"));
                                                                                                                                                                                                                h.e("RealmLocalHomework").c("id", c19, h27).c("lessonId", c19, new l[0]).c("start", String.class, i).c("end", String.class, i).c("text", String.class, i).c("remark", String.class, i).c("completed", b4, new l[0]);
                                                                                                                                                                                                                h.e("RealmInfoCenterContactHourTimeslot").c("start", String.class, i).c("end", String.class, i).c("state", d4, new l[0]);
                                                                                                                                                                                                                h.e("RealmInfoCenterContactHour").c("key", c19, h27).c("id", c19, new l[0]).c("start", String.class, new l[0]).c("end", String.class, new l[0]).c("teacherId", c19, new l[0]).c("imageId", c19, new l[0]).c("email", String.class, i).c("phone", String.class, i).c("room", String.class, i).c("teacher", String.class, i).c("registrationAllowed", b4, new l[0]).c("registered", b4, new l[0]).f("timeslots", h.h("RealmInfoCenterContactHourTimeslot")).c("userText", String.class, i).c("teacherText", String.class, i);
                                                                                                                                                                                                                h28 = h.h("RealmProfile");
                                                                                                                                                                                                                continue Block_19_Outer;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            e9 = h.e("RealmSystemNotification");
                                                                                                                                                                                                            d5 = j.d;
                                                                                                                                                                                                            c23 = e9.c("id", d5, new l[0]).c("profileId", String.class, new l[0]);
                                                                                                                                                                                                            c24 = j.c;
                                                                                                                                                                                                            c23.c("publishDateTime", c24, new l[0]).c("title", String.class, new l[0]).c("message", String.class, new l[0]).c("messageLong", String.class, new l[0]).c("type", d5, new l[0]).c("entityId", c24, new l[0]).e("id");
                                                                                                                                                                                                            n2 = n14 + 1L;
                                                                                                                                                                                                            break Label_4066;
                                                                                                                                                                                                            n2 = n12;
                                                                                                                                                                                                            continue Label_10897_Outer;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        n15 = n2;
                                                                                                                                                                                                        break Block_11;
                                                                                                                                                                                                        break Label_11336;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    e10 = h.e("RealmSchoolColor");
                                                                                                                                                                                                    d6 = j.d;
                                                                                                                                                                                                    e10.c("schoolColorTypeId", d6, io.realm.l.H).c("text", d6, new l[0]).c("background", d6, new l[0]);
                                                                                                                                                                                                    n13 = n2 + 1L;
                                                                                                                                                                                                    break Label_10974;
                                                                                                                                                                                                }
                                                                                                                                                                                                n2 = n3;
                                                                                                                                                                                                continue Label_11236_Outer;
                                                                                                                                                                                            }
                                                                                                                                                                                            n2 = n10;
                                                                                                                                                                                            continue Block_7_Outer;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                    h20 = h.h("RealmProfile");
                                                                                                                                                                                    continue Label_11144;
                                                                                                                                                                                }
                                                                                                                                                                                Label_10584: {
                                                                                                                                                                                    c17 = h28.c("infoCenterTimestamp", c19, new l[0]);
                                                                                                                                                                                }
                                                                                                                                                                                break Block_26;
                                                                                                                                                                                Label_11003:
                                                                                                                                                                                h5.c("lastRequestTimestamp", j.c, new l[0]);
                                                                                                                                                                                break Label_11000;
                                                                                                                                                                            }
                                                                                                                                                                            e11 = h.e("RealmLong");
                                                                                                                                                                            c25 = j.c;
                                                                                                                                                                            e11.c("value", c25, new l[0]);
                                                                                                                                                                            h29 = h.h("Child");
                                                                                                                                                                            k0.m(h29);
                                                                                                                                                                            h29.I("RealmChild").H("accessibleTimeTable", "hasTimeTableAccess");
                                                                                                                                                                            h30 = h.h("RealmProfile");
                                                                                                                                                                            k0.m(h30);
                                                                                                                                                                            h31 = h30.H("userSecret", "userAppSharedSecret").H("departmentId", "userDepartmentId").H("userEntityType", "userCustomEntityType").H("userEntityId", "userCustomEntityId").H("can", "userRights").H("children", "userChildren");
                                                                                                                                                                            h32 = h.h("RealmLong");
                                                                                                                                                                            k0.m(h32);
                                                                                                                                                                            h33 = h31.f("userClasses", h32).H("timeTableAccess", "userHasTimeTableAccess").c("schoolId", c25, new l[0]).H("schoolUrl", "schoolServerUrl");
                                                                                                                                                                            b5 = j.b;
                                                                                                                                                                            c26 = h33.c("schoolUseMobileService", b5, new l[0]).c("schoolMobileServiceUrl", String.class, new l[0]).H("schoolServerTimeDelta", "schoolServerDelta").c("usable", b5, new l[0]).H("periodDataSynchronisation", "periodDataTimestamp").H("masterDataSynchronisation", "masterDataTimestamp").c("officeHourTimestamp", c25, new l[0]).c("parentDayTimestamp", c25, new l[0]).c("widgetTimestamp", c25, new l[0]);
                                                                                                                                                                            d7 = j.d;
                                                                                                                                                                            c27 = c26.c("lastViewedEntityType", d7, new l[0]).c("lastViewedEntityId", c25, new l[0]).c("schoolApiVersion", d7, new l[0]);
                                                                                                                                                                            h34 = h.h("RealmInteger");
                                                                                                                                                                            k0.m(h34);
                                                                                                                                                                            c27.f("states", h34);
                                                                                                                                                                            h35 = h.h("RealmKlasse");
                                                                                                                                                                            k0.m(h35);
                                                                                                                                                                            h35.H("foreColor", "textColor");
                                                                                                                                                                            h36 = h.h("RealmRoom");
                                                                                                                                                                            k0.m(h36);
                                                                                                                                                                            h36.H("foreColor", "textColor");
                                                                                                                                                                            h37 = h.h("RealmSubject");
                                                                                                                                                                            k0.m(h37);
                                                                                                                                                                            h37.H("foreColor", "textColor");
                                                                                                                                                                            h38 = h.h("RealmTeacher");
                                                                                                                                                                            k0.m(h38);
                                                                                                                                                                            h38.H("foreColor", "textColor").c("start", c25, new l[0]).c("end", c25, new l[0]);
                                                                                                                                                                            h39 = h.h("RealmTimeTable");
                                                                                                                                                                            k0.m(h39);
                                                                                                                                                                            h39.H("type", "entityType").H("id", "entityId");
                                                                                                                                                                            h40 = h.h("RealmStudent");
                                                                                                                                                                            k0.m(h40);
                                                                                                                                                                            h40.c("birthday", c25, new l[0]);
                                                                                                                                                                            h.e("RealmClassbookSettings").c("id", c25, new l[0]).c("showAbsenceReason", b5, new l[0]).c("showAbsenceText", b5, new l[0]).c("absenceCheckRequired", b5, new l[0]).c("defaultAbsenceReasonId", c25, new l[0]).c("defaultLatenessReasonId", c25, new l[0]).c("defaultAbsenceEndTimeType", d7, new l[0]).c("customAbsenceEndTime", String.class, new l[0]).e("id");
                                                                                                                                                                            h41 = h.h("PeriodInfo");
                                                                                                                                                                            k0.m(h41);
                                                                                                                                                                            h41.I("RealmPeriodInfo");
                                                                                                                                                                            h42 = h.h("RealmClassRegEvent");
                                                                                                                                                                            k0.m(h42);
                                                                                                                                                                            h42.I("RealmEvent");
                                                                                                                                                                            h.e("RealmDuty").c("id", c25, new l[0]).c("name", String.class, new l[0]).c("longName", String.class, new l[0]).c("type", d7, new l[0]).e("id");
                                                                                                                                                                            c28 = h.e("RealmTimeGridDay").c("weekday", d7, new l[0]);
                                                                                                                                                                            h43 = h.h("RealmTimeGridUnit");
                                                                                                                                                                            k0.m(h43);
                                                                                                                                                                            c28.f("units", h43);
                                                                                                                                                                            h44 = h.h("RealmTimeGrid");
                                                                                                                                                                            k0.m(h44);
                                                                                                                                                                            c29 = h44.G().E("units").E("weekday").c("id", c25, new l[0]);
                                                                                                                                                                            h45 = h.h("RealmTimeGridDay");
                                                                                                                                                                            k0.m(h45);
                                                                                                                                                                            c29.f("days", h45).e("id");
                                                                                                                                                                            h.e("RealmSchoolyear").c("id", c25, new l[0]).c("name", String.class, new l[0]).c("start", c25, new l[0]).c("end", c25, new l[0]).e("id");
                                                                                                                                                                            h.e("RealmHolidayModel").c("holidayId", c25, new l[0]);
                                                                                                                                                                            h.e("RealmPeriodElementModel").c("entityType", d7, new l[0]).c("currentId", c25, new l[0]).c("originalId", c25, new l[0]).c("label", String.class, new l[0]).c("labelLong", String.class, new l[0]).c("textColor", d7, new l[0]).c("backGround", d7, new l[0]);
                                                                                                                                                                            c30 = h.e("RealmPeriodModel").c("id", c25, new l[0]).c("subjectId", c25, new l[0]).c("startMinute", d7, new l[0]).c("endMinute", d7, new l[0]);
                                                                                                                                                                            e12 = j.e;
                                                                                                                                                                            c31 = c30.c("startX", e12, new l[0]).c("widthX", e12, new l[0]).c("totalX", d7, new l[0]);
                                                                                                                                                                            h46 = h.h("RealmPeriodElementModel");
                                                                                                                                                                            k0.m(h46);
                                                                                                                                                                            c31.f("elements", h46).c("textColor", d7, new l[0]).c("backColor", d7, new l[0]).c("textColorSubject", d7, new l[0]).c("backColorSubject", d7, new l[0]).c("textColorCustom", d7, new l[0]).c("backColorCustom", d7, new l[0]).c("homeWorks", String.class, new l[0]).c("info", String.class, new l[0]).c("substitution", String.class, new l[0]).c("hasOfficeHourRegistration", b5, new l[0]).c("cancelled", b5, new l[0]).c("hide", b5, new l[0]).c("hideStartX", e12, new l[0]).c("hideWidthX", e12, new l[0]).c("exam", b5, new l[0]).e("id");
                                                                                                                                                                            c32 = h.e("RealmTimeTableModel").c("entityType", d7, new l[0]).c("entityId", c25, new l[0]).c("date", c25, new l[0]).c("timestamp", c25, new l[0]);
                                                                                                                                                                            h47 = h.h("RealmPeriodModel");
                                                                                                                                                                            k0.m(h47);
                                                                                                                                                                            f3 = c32.f("periods", h47);
                                                                                                                                                                            h48 = h.h("RealmPeriodModel");
                                                                                                                                                                            k0.m(h48);
                                                                                                                                                                            f3.f("periodsWithOutCancelled", h48).c("holiday", c25, new l[0]).c("preLoadedPeriodData", b5, new l[0]).c("id", String.class, new l[0]);
                                                                                                                                                                            h.e("RealmElementPair").c("entityType", d7, new l[0]).c("originalId", c25, new l[0]).c("currentId", c25, new l[0]);
                                                                                                                                                                            h49 = h.h("RealmPeriod");
                                                                                                                                                                            k0.m(h49);
                                                                                                                                                                            e13 = h49.H("is", "states").H("can", "rights").E("textInfo").E("textSubstitution").E("textLesson").E("absencesChecked").E("teachers");
                                                                                                                                                                            h50 = h.h("RealmElementPair");
                                                                                                                                                                            k0.m(h50);
                                                                                                                                                                            e14 = e13.f("teachers", h50).E("klassen");
                                                                                                                                                                            h51 = h.h("RealmElementPair");
                                                                                                                                                                            k0.m(h51);
                                                                                                                                                                            e15 = e14.f("klassen", h51).E("subjects");
                                                                                                                                                                            h52 = h.h("RealmElementPair");
                                                                                                                                                                            k0.m(h52);
                                                                                                                                                                            e16 = e15.h("subject", h52).E("rooms");
                                                                                                                                                                            h53 = h.h("RealmElementPair");
                                                                                                                                                                            k0.m(h53);
                                                                                                                                                                            f4 = e16.f("rooms", h53);
                                                                                                                                                                            h54 = h.h("RealmLong");
                                                                                                                                                                            k0.m(h54);
                                                                                                                                                                            f4.f("blockIds", h54).c("breakSuperVision", b5, new l[0]);
                                                                                                                                                                            c33 = h.e("RealmPrioritizedAttendance").c("student", c25, new l[0]).c("periodId", c25, new l[0]).c("parallelPeriodId", c25, new l[0]).c("type", d7, new l[0]).c("subject", c25, new l[0]);
                                                                                                                                                                            h55 = h.h("RealmLong");
                                                                                                                                                                            k0.m(h55);
                                                                                                                                                                            f5 = c33.f("teachers", h55);
                                                                                                                                                                            h56 = h.h("RealmLong");
                                                                                                                                                                            k0.m(h56);
                                                                                                                                                                            f6 = f5.f("klassen", h56);
                                                                                                                                                                            h57 = h.h("RealmLong");
                                                                                                                                                                            k0.m(h57);
                                                                                                                                                                            f6.f("rooms", h57);
                                                                                                                                                                            h.e("RealmExemption").c("id", c25, new l[0]).c("student", c25, new l[0]).c("subject", c25, new l[0]).c("subjectGroup", String.class, new l[0]).c("exemptionReason", String.class, new l[0]).c("startDate", c25, new l[0]).c("endDate", c25, new l[0]).c("startTime", c25, new l[0]).c("endTime", c25, new l[0]).c("weekDay", d7, new l[0]).c("text", String.class, new l[0]).e("id");
                                                                                                                                                                            c34 = h.e("RealmClassbook").c("id", c25, new l[0]);
                                                                                                                                                                            h58 = h.h("RealmLong");
                                                                                                                                                                            k0.m(h58);
                                                                                                                                                                            f7 = c34.f("students", h58);
                                                                                                                                                                            h59 = h.h("RealmLong");
                                                                                                                                                                            k0.m(h59);
                                                                                                                                                                            f8 = f7.f("absences", h59);
                                                                                                                                                                            h60 = h.h("RealmLong");
                                                                                                                                                                            k0.m(h60);
                                                                                                                                                                            f9 = f8.f("events", h60);
                                                                                                                                                                            h61 = h.h("RealmLong");
                                                                                                                                                                            k0.m(h61);
                                                                                                                                                                            f10 = f9.f("exemptions", h61);
                                                                                                                                                                            h62 = h.h("RealmPrioritizedAttendance");
                                                                                                                                                                            k0.m(h62);
                                                                                                                                                                            f11 = f10.f("prioritizedAttendances", h62);
                                                                                                                                                                            h63 = h.h("RealmLong");
                                                                                                                                                                            k0.m(h63);
                                                                                                                                                                            f11.f("homeWorks", h63).c("absencesChecked", b5, new l[0]).c("synced", b5, new l[0]).e("id");
                                                                                                                                                                            h.e("RealmInvigilator").c("teacherId", c25, new l[0]).c("start", c25, new l[0]).c("end", c25, new l[0]);
                                                                                                                                                                            c35 = h.e("RealmExam").c("id", c25, new l[0]).c("examType", String.class, new l[0]).c("start", c25, new l[0]).c("end", c25, new l[0]).c("departmentId", c25, new l[0]).c("name", String.class, new l[0]).c("text", String.class, new l[0]).c("entityType", d7, new l[0]).c("entityId", c25, new l[0]).c("subjectId", c25, new l[0]);
                                                                                                                                                                            h64 = h.h("RealmLong");
                                                                                                                                                                            k0.m(h64);
                                                                                                                                                                            f12 = c35.f("classes", h64);
                                                                                                                                                                            h65 = h.h("RealmLong");
                                                                                                                                                                            k0.m(h65);
                                                                                                                                                                            f13 = f12.f("rooms", h65);
                                                                                                                                                                            h66 = h.h("RealmLong");
                                                                                                                                                                            k0.m(h66);
                                                                                                                                                                            f14 = f13.f("teachers", h66);
                                                                                                                                                                            h67 = h.h("RealmInvigilator");
                                                                                                                                                                            k0.m(h67);
                                                                                                                                                                            f14.f("invigilator", h67).e("id");
                                                                                                                                                                            c36 = h.e("RealmTeacherClassRegData").c("klasseId", c25, new l[0]);
                                                                                                                                                                            h68 = h.h("RealmLong");
                                                                                                                                                                            k0.m(h68);
                                                                                                                                                                            f15 = c36.f("students", h68);
                                                                                                                                                                            h69 = h.h("RealmLong");
                                                                                                                                                                            k0.m(h69);
                                                                                                                                                                            f16 = f15.f("events", h69);
                                                                                                                                                                            h70 = h.h("RealmLong");
                                                                                                                                                                            k0.m(h70);
                                                                                                                                                                            f16.f("absences", h70).e("klasseId");
                                                                                                                                                                            h71 = h.h("RealmStudent");
                                                                                                                                                                            k0.m(h71);
                                                                                                                                                                            h71.E("klasse").c("klasse", c25, new l[0]);
                                                                                                                                                                            h72 = h.h("RealmKlassePair");
                                                                                                                                                                            k0.m(h72);
                                                                                                                                                                            h72.E("original").E("current").c("original", c25, new l[0]).c("current", c25, new l[0]);
                                                                                                                                                                            h73 = h.h("RealmSubjectPair");
                                                                                                                                                                            k0.m(h73);
                                                                                                                                                                            h73.E("original").E("current").c("original", c25, new l[0]).c("current", c25, new l[0]);
                                                                                                                                                                            h74 = h.h("RealmRoomPair");
                                                                                                                                                                            k0.m(h74);
                                                                                                                                                                            h74.E("original").E("current").c("original", c25, new l[0]).c("current", c25, new l[0]);
                                                                                                                                                                            h75 = h.h("RealmTeacherPair");
                                                                                                                                                                            k0.m(h75);
                                                                                                                                                                            h75.E("original").E("current").c("original", c25, new l[0]).c("current", c25, new l[0]);
                                                                                                                                                                            h.e("RealmTimeTableEntity").c("id", String.class, new l[0]).c("entityType", d7, new l[0]).c("entityId", c25, new l[0]).c("favorite", b5, new l[0]).c("counter", d7, new l[0]).c("timestamp", c25, new l[0]).e("id");
                                                                                                                                                                            h76 = h.h("RealmCustomEntityColor");
                                                                                                                                                                            k0.m(h76);
                                                                                                                                                                            h76.c("entityType", d7, new l[0]).c("entityId", c25, new l[0]).M((r0.c)com.untis.mobile.persistence.realm.i.a);
                                                                                                                                                                            c37 = h.e("RealmMessageOfDay").c("id", c25, new l[0]).c("subject", String.class, new l[0]).c("text", String.class, new l[0]);
                                                                                                                                                                            h77 = h.h("RealmDriveAttachment");
                                                                                                                                                                            k0.m(h77);
                                                                                                                                                                            c37.f("driveAttachments", h77).c("read", b5, new l[0]).e("id");
                                                                                                                                                                            h.u("MessageOfDay");
                                                                                                                                                                            h78 = h.h("RealmParentDayAppointment");
                                                                                                                                                                            k0.m(h78);
                                                                                                                                                                            h78.E("teacher").c("teacherId", c25, new l[0]).E("room").c("roomId", c25, new l[0]);
                                                                                                                                                                            h79 = h.h("RealmParentDayStudent");
                                                                                                                                                                            k0.m(h79);
                                                                                                                                                                            e17 = h79.E("student").c("studentId", c25, new l[0]).E("subject");
                                                                                                                                                                            h80 = h.h("RealmLong");
                                                                                                                                                                            k0.m(h80);
                                                                                                                                                                            e17.f("subjectIds", h80);
                                                                                                                                                                            h81 = h.h("RealmAbsence");
                                                                                                                                                                            k0.m(h81);
                                                                                                                                                                            h81.L("text", true);
                                                                                                                                                                            h82 = h.h("RealmAbsenceReason");
                                                                                                                                                                            k0.m(h82);
                                                                                                                                                                            h82.L("name", true).L("longName", true);
                                                                                                                                                                            h83 = h.h("RealmChild");
                                                                                                                                                                            k0.m(h83);
                                                                                                                                                                            h83.L("firstName", true).L("lastName", true);
                                                                                                                                                                            h84 = h.h("RealmCustomEntityColor");
                                                                                                                                                                            k0.m(h84);
                                                                                                                                                                            h84.L("key", true);
                                                                                                                                                                            h85 = h.h("RealmDepartment");
                                                                                                                                                                            k0.m(h85);
                                                                                                                                                                            h85.L("name", true).L("longName", true);
                                                                                                                                                                            h86 = h.h("RealmDriveAttachment");
                                                                                                                                                                            k0.m(h86);
                                                                                                                                                                            h86.L("name", true).L("url", true);
                                                                                                                                                                            h87 = h.h("RealmDuty");
                                                                                                                                                                            k0.m(h87);
                                                                                                                                                                            h87.L("name", true).L("longName", true);
                                                                                                                                                                            h88 = h.h("RealmEvent");
                                                                                                                                                                            k0.m(h88);
                                                                                                                                                                            h88.L("text", true);
                                                                                                                                                                            h89 = h.h("RealmEventReason");
                                                                                                                                                                            k0.m(h89);
                                                                                                                                                                            h89.L("name", true).L("longName", true);
                                                                                                                                                                            h90 = h.h("RealmEventReasonGroup");
                                                                                                                                                                            k0.m(h90);
                                                                                                                                                                            h90.L("longName", true).L("name", true);
                                                                                                                                                                            h91 = h.h("RealmExam");
                                                                                                                                                                            k0.m(h91);
                                                                                                                                                                            h91.L("examType", true).L("name", true).L("text", true);
                                                                                                                                                                            h92 = h.h("RealmExcuse");
                                                                                                                                                                            k0.m(h92);
                                                                                                                                                                            h92.L("text", true);
                                                                                                                                                                            h93 = h.h("RealmExcuseStatus");
                                                                                                                                                                            k0.m(h93);
                                                                                                                                                                            h93.L("name", true).L("longName", true);
                                                                                                                                                                            h94 = h.h("RealmExemption");
                                                                                                                                                                            k0.m(h94);
                                                                                                                                                                            h94.L("subjectGroup", true).L("exemptionReason", true).L("text", true);
                                                                                                                                                                            h95 = h.h("RealmHoliday");
                                                                                                                                                                            k0.m(h95);
                                                                                                                                                                            h95.L("name", true).L("longName", true);
                                                                                                                                                                            h96 = h.h("RealmHomework");
                                                                                                                                                                            k0.m(h96);
                                                                                                                                                                            h96.L("text", true).L("remark", true);
                                                                                                                                                                            h97 = h.h("RealmKlasse");
                                                                                                                                                                            k0.m(h97);
                                                                                                                                                                            h97.L("name", true).L("longName", true);
                                                                                                                                                                            h98 = h.h("RealmLessonTopic");
                                                                                                                                                                            k0.m(h98);
                                                                                                                                                                            h98.L("text", true);
                                                                                                                                                                            h99 = h.h("RealmMessageOfDay");
                                                                                                                                                                            k0.m(h99);
                                                                                                                                                                            h99.L("text", true).L("subject", true);
                                                                                                                                                                            h100 = h.h("RealmOfficeHour");
                                                                                                                                                                            k0.m(h100);
                                                                                                                                                                            h100.L("teacherText", true).L("email", true).L("phone", true).L("displayNameRooms", true).L("displayNameTeacher", true).L("userText", true);
                                                                                                                                                                            h101 = h.h("RealmParentDay");
                                                                                                                                                                            k0.m(h101);
                                                                                                                                                                            h101.L("name", true);
                                                                                                                                                                            h102 = h.h("RealmPeriodElementModel");
                                                                                                                                                                            k0.m(h102);
                                                                                                                                                                            h102.L("labelLong", true).L("label", true);
                                                                                                                                                                            h103 = h.h("RealmPeriodInfo");
                                                                                                                                                                            k0.m(h103);
                                                                                                                                                                            h103.L("local", true).L("substitution", true).L("lesson", true).L("info", true);
                                                                                                                                                                            h104 = h.h("RealmPeriodModel");
                                                                                                                                                                            k0.m(h104);
                                                                                                                                                                            h104.L("homeWorks", true).L("info", true).L("substitution", true);
                                                                                                                                                                            h105 = h.h("RealmProfile");
                                                                                                                                                                            k0.m(h105);
                                                                                                                                                                            h105.L("schoolMobileServiceUrl", true).L("userDisplayName", true).L("userLogin", true).L("userAppSharedSecret", true).L("schoolDisplayName", true).L("schoolServerUrl", true).L("schoolLogin", true).L("userCustomEntityType", false).L("userCustomEntityId", false);
                                                                                                                                                                            h106 = h.h("RealmRoom");
                                                                                                                                                                            k0.m(h106);
                                                                                                                                                                            h106.L("name", true).L("longName", true);
                                                                                                                                                                            h107 = h.h("RealmSchoolyear");
                                                                                                                                                                            k0.m(h107);
                                                                                                                                                                            h107.L("name", true);
                                                                                                                                                                            h108 = h.h("RealmStudent");
                                                                                                                                                                            k0.m(h108);
                                                                                                                                                                            h108.L("lastName", true).L("firstName", true);
                                                                                                                                                                            h109 = h.h("RealmSubject");
                                                                                                                                                                            k0.m(h109);
                                                                                                                                                                            h109.L("name", true).L("longName", true);
                                                                                                                                                                            h110 = h.h("RealmTeacher");
                                                                                                                                                                            k0.m(h110);
                                                                                                                                                                            h110.L("name", true).L("firstName", true).L("lastName", true);
                                                                                                                                                                            h111 = h.h("RealmTeachingMethod");
                                                                                                                                                                            k0.m(h111);
                                                                                                                                                                            h111.L("name", true).L("longName", true);
                                                                                                                                                                            h112 = h.h("RealmTimeGridUnit");
                                                                                                                                                                            k0.m(h112);
                                                                                                                                                                            h112.L("name", true);
                                                                                                                                                                            h113 = h.h("RealmTimeTable");
                                                                                                                                                                            k0.m(h113);
                                                                                                                                                                            h113.L("key", true);
                                                                                                                                                                            h114 = h.h("RealmTimeTableEntity");
                                                                                                                                                                            k0.m(h114);
                                                                                                                                                                            h114.L("id", true);
                                                                                                                                                                            h115 = h.h("RealmTimeTableModel");
                                                                                                                                                                            k0.m(h115);
                                                                                                                                                                            h115.L("id", true).e("id");
                                                                                                                                                                            n5 = n6 + 1L;
                                                                                                                                                                            continue Block_37_Outer;
                                                                                                                                                                        }
                                                                                                                                                                        n12 = n15;
                                                                                                                                                                        break Block_12;
                                                                                                                                                                        n10 = n2;
                                                                                                                                                                        break Block_18;
                                                                                                                                                                        Label_11398: {
                                                                                                                                                                            h7.c("messagesOfDayTimestamp", Long.TYPE, io.realm.l.I);
                                                                                                                                                                        }
                                                                                                                                                                        continue Label_11395;
                                                                                                                                                                    }
                                                                                                                                                                    h116 = h.h("RealmProfile");
                                                                                                                                                                    break Block_36;
                                                                                                                                                                    try {
                                                                                                                                                                        Label_4190: {
                                                                                                                                                                            j.Q0("RealmSystemNotification").b0().T3();
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    catch (Exception ex2) {
                                                                                                                                                                        Log.e("untis_log", "error while deleting extisting RealmSystemNotification", (Throwable)ex2);
                                                                                                                                                                    }
                                                                                                                                                                    continue Label_8850_Outer;
                                                                                                                                                                }
                                                                                                                                                                n4 = n2 + 1L;
                                                                                                                                                                continue Label_11203_Outer;
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                        n11 = n2;
                                                                                                                                                        break Label_9194_Outer;
                                                                                                                                                    }
                                                                                                                                                    n2 = n8;
                                                                                                                                                    break Block_34;
                                                                                                                                                    Label_11302: {
                                                                                                                                                        h117.c("isOnlinePeriod", Boolean.TYPE, io.realm.l.I);
                                                                                                                                                    }
                                                                                                                                                    break Label_11323;
                                                                                                                                                    h117 = h.h("RealmPeriod");
                                                                                                                                                    continue Block_7_Outer;
                                                                                                                                                }
                                                                                                                                                e18 = h.e("RealmClassRole");
                                                                                                                                                c38 = j.c;
                                                                                                                                                e18.c("studentId", c38, new l[0]).c("klasseId", c38, new l[0]).c("dutyId", c38, new l[0]).c("start", c38, new l[0]).c("end", c38, new l[0]).c("text", String.class, io.realm.l.I);
                                                                                                                                                h118 = h.h("RealmClassbook");
                                                                                                                                                k0.m(h118);
                                                                                                                                                h119 = h.h("RealmClassRole");
                                                                                                                                                k0.m(h119);
                                                                                                                                                h118.f("classRoles", h119);
                                                                                                                                                n2 = n16 + 1L;
                                                                                                                                                continue Label_0132_Outer;
                                                                                                                                            }
                                                                                                                                            n17 = n7;
                                                                                                                                            break Block_23;
                                                                                                                                        }
                                                                                                                                        h120 = h.h("RealmPeriodModel");
                                                                                                                                        continue Label_11336;
                                                                                                                                    }
                                                                                                                                    n2 = n13 + 1L;
                                                                                                                                    break Label_11027;
                                                                                                                                    Label_0129: {
                                                                                                                                        n2 = n;
                                                                                                                                    }
                                                                                                                                    continue Label_0132;
                                                                                                                                }
                                                                                                                                h121 = h.h("RealmProfile");
                                                                                                                                k0.m(h121);
                                                                                                                                h121.c("serverDownTimestamp", j.c, new l[0]).c("userJupiter", j.b, new l[0]).c("userJupiterEclipse", String.class, new l[0]);
                                                                                                                                h122 = h.h("RealmPeriod");
                                                                                                                                k0.m(h122);
                                                                                                                                h122.c("channelId", String.class, new l[0]);
                                                                                                                                n16 = n2 + 1L;
                                                                                                                                break Block_36;
                                                                                                                            }
                                                                                                                            h123 = h.h("ClassRegEventReasonGroup");
                                                                                                                            k0.m(h123);
                                                                                                                            h123.I("RealmEventReasonGroup").e("id");
                                                                                                                            e19 = h.e("RealmExcuseStatus");
                                                                                                                            c39 = j.c;
                                                                                                                            c40 = e19.c("id", c39, new l[0]).c("name", String.class, new l[0]).c("longName", String.class, new l[0]);
                                                                                                                            b6 = j.b;
                                                                                                                            c40.c("excused", b6, new l[0]).e("id");
                                                                                                                            h.e("RealmTeachingMethod").c("id", c39, new l[0]).c("name", String.class, new l[0]).c("longName", String.class, new l[0]).e("id");
                                                                                                                            h.e("RealmAbsenceReason").c("id", c39, new l[0]).c("name", String.class, new l[0]).c("longName", String.class, new l[0]).c("active", b6, new l[0]).e("id");
                                                                                                                            h.e("RealmTimeGridUnit").c("name", String.class, new l[0]).c("start", c39, new l[0]).c("end", c39, new l[0]);
                                                                                                                            e20 = h.e("RealmTimeGrid");
                                                                                                                            d8 = j.d;
                                                                                                                            c41 = e20.c("weekday", d8, new l[0]);
                                                                                                                            h124 = h.h("RealmTimeGridUnit");
                                                                                                                            k0.m(h124);
                                                                                                                            c41.f("units", h124).e("weekday");
                                                                                                                            h125 = h.h("RealmStudent");
                                                                                                                            k0.m(h125);
                                                                                                                            h126 = h.h("RealmKlasse");
                                                                                                                            k0.m(h126);
                                                                                                                            h125.h("klasse", h126);
                                                                                                                            h.e("RealmCustomEntityColor").c("key", String.class, new l[0]).c("textColor", d8, new l[0]).c("backColor", d8, new l[0]).e("key");
                                                                                                                            h127 = h.h("Profile");
                                                                                                                            k0.m(h127);
                                                                                                                            h127.I("RealmProfile");
                                                                                                                            h.e("RealmOfficeHourTimeSlot").c("start", c39, new l[0]).c("end", c39, new l[0]).c("state", d8, new l[0]);
                                                                                                                            c42 = h.e("RealmOfficeHour").c("id", c39, new l[0]).c("start", c39, new l[0]).c("end", c39, new l[0]);
                                                                                                                            h128 = h.h("RealmTeacher");
                                                                                                                            k0.m(h128);
                                                                                                                            c43 = c42.h("teacher", h128).c("imageId", c39, new l[0]).c("email", String.class, new l[0]).c("phone", String.class, new l[0]).c("displayNameRooms", String.class, new l[0]).c("displayNameTeacher", String.class, new l[0]).c("registrationPossible", b6, new l[0]).c("registered", b6, new l[0]);
                                                                                                                            h129 = h.h("RealmOfficeHourTimeSlot");
                                                                                                                            k0.m(h129);
                                                                                                                            c43.f("timeSlots", h129).c("userText", String.class, new l[0]).c("teacherText", String.class, new l[0]).e("id");
                                                                                                                            e21 = h.e("RealmKlassePair");
                                                                                                                            h130 = h.h("RealmKlasse");
                                                                                                                            k0.m(h130);
                                                                                                                            h131 = e21.h("original", h130);
                                                                                                                            h132 = h.h("RealmKlasse");
                                                                                                                            k0.m(h132);
                                                                                                                            h131.h("current", h132);
                                                                                                                            e22 = h.e("RealmSubjectPair");
                                                                                                                            h133 = h.h("RealmSubject");
                                                                                                                            k0.m(h133);
                                                                                                                            h134 = e22.h("original", h133);
                                                                                                                            h135 = h.h("RealmSubject");
                                                                                                                            k0.m(h135);
                                                                                                                            h134.h("current", h135);
                                                                                                                            e23 = h.e("RealmRoomPair");
                                                                                                                            h136 = h.h("RealmRoom");
                                                                                                                            k0.m(h136);
                                                                                                                            h137 = e23.h("original", h136);
                                                                                                                            h138 = h.h("RealmRoom");
                                                                                                                            k0.m(h138);
                                                                                                                            h137.h("current", h138);
                                                                                                                            e24 = h.e("RealmTeacherPair");
                                                                                                                            h139 = h.h("RealmTeacher");
                                                                                                                            k0.m(h139);
                                                                                                                            h140 = e24.h("original", h139);
                                                                                                                            h141 = h.h("RealmTeacher");
                                                                                                                            k0.m(h141);
                                                                                                                            h140.h("current", h141);
                                                                                                                            c44 = h.e("RealmPeriod").c("id", c39, new l[0]).c("lessonId", c39, new l[0]).c("start", c39, new l[0]).c("end", c39, new l[0]).c("backgroundColor", d8, new l[0]).c("textColor", d8, new l[0]).c("innerBackgroundColor", d8, new l[0]).c("innerTextColor", d8, new l[0]).c("textInfo", String.class, new l[0]).c("textSubstitution", String.class, new l[0]).c("textLesson", String.class, new l[0]).c("absencesChecked", b6, new l[0]);
                                                                                                                            h142 = h.h("RealmInteger");
                                                                                                                            k0.m(h142);
                                                                                                                            f17 = c44.f("can", h142);
                                                                                                                            h143 = h.h("RealmInteger");
                                                                                                                            k0.m(h143);
                                                                                                                            f18 = f17.f("is", h143);
                                                                                                                            h144 = h.h("RealmSubjectPair");
                                                                                                                            k0.m(h144);
                                                                                                                            f19 = f18.f("subjects", h144);
                                                                                                                            h145 = h.h("RealmKlassePair");
                                                                                                                            k0.m(h145);
                                                                                                                            f20 = f19.f("klassen", h145);
                                                                                                                            h146 = h.h("RealmRoomPair");
                                                                                                                            k0.m(h146);
                                                                                                                            f21 = f20.f("rooms", h146);
                                                                                                                            h147 = h.h("RealmTeacherPair");
                                                                                                                            k0.m(h147);
                                                                                                                            f21.f("teachers", h147).e("id");
                                                                                                                            c45 = h.e("RealmTimeTable").c("key", String.class, new l[0]).c("type", d8, new l[0]).c("id", c39, new l[0]).c("date", c39, new l[0]);
                                                                                                                            h148 = h.h("RealmPeriod");
                                                                                                                            k0.m(h148);
                                                                                                                            c45.f("periods", h148).c("timestamp", c39, new l[0]).e("key");
                                                                                                                            c46 = h.e("RealmExcuse").c("id", c39, new l[0]);
                                                                                                                            h149 = h.h("RealmExcuseStatus");
                                                                                                                            k0.m(h149);
                                                                                                                            c46.h("excuseStatus", h149).c("text", String.class, new l[0]).c("number", c39, new l[0]).c("date", c39, new l[0]).e("id");
                                                                                                                            c47 = h.e("RealmAbsence").c("id", c39, new l[0]).c("start", c39, new l[0]).c("end", c39, new l[0]).c("text", String.class, new l[0]);
                                                                                                                            h150 = h.h("RealmStudent");
                                                                                                                            k0.m(h150);
                                                                                                                            h151 = c47.h("student", h150);
                                                                                                                            h152 = h.h("RealmKlasse");
                                                                                                                            k0.m(h152);
                                                                                                                            h153 = h151.h("klasse", h152);
                                                                                                                            h154 = h.h("RealmAbsenceReason");
                                                                                                                            k0.m(h154);
                                                                                                                            c48 = h153.h("absenceReason", h154).c("excused", b6, new l[0]).c("owner", b6, new l[0]);
                                                                                                                            h155 = h.h("RealmExcuse");
                                                                                                                            k0.m(h155);
                                                                                                                            c48.h("excuse", h155).e("id");
                                                                                                                            n14 = n2 + 1L;
                                                                                                                            break Label_3925;
                                                                                                                        }
                                                                                                                        h156 = h.h("RealmAbsence");
                                                                                                                        k0.m(h156);
                                                                                                                        h156.c("periodId", j.c, new l[0]).c("synced", j.b, new l[0]);
                                                                                                                        n6 = n2 + 1L;
                                                                                                                        continue Label_9194_Outer;
                                                                                                                    }
                                                                                                                    n11 = n2 + 1L;
                                                                                                                    break Block_8_Outer;
                                                                                                                }
                                                                                                                n2 = n13;
                                                                                                                continue Block_31_Outer;
                                                                                                            }
                                                                                                            n14 = n2;
                                                                                                            continue Block_7_Outer;
                                                                                                        }
                                                                                                        n2 = n14;
                                                                                                        continue Label_8850_Outer;
                                                                                                    }
                                                                                                    n2 = n17;
                                                                                                    continue Block_10_Outer;
                                                                                                }
                                                                                                n9 = n2 + 1L;
                                                                                                continue Block_8_Outer;
                                                                                            }
                                                                                            n2 = n11;
                                                                                            continue Label_10897_Outer;
                                                                                        }
                                                                                        h157 = h.h("RealmSystemNotification");
                                                                                        k0.m(h157);
                                                                                        h157.c("deleted", j.b, new l[0]).c("extras", String.class, new l[0]);
                                                                                        n15 = n2 + 1L;
                                                                                        continue Label_8813_Outer;
                                                                                    }
                                                                                }
                                                                                e25 = h.e("RealmString");
                                                                                l = io.realm.l.I;
                                                                                e25.c("value", String.class, l);
                                                                                h158 = h.h("RealmPeriodModel");
                                                                                k0.m(h158);
                                                                                e26 = h158.c("lesson", String.class, l).c("local", String.class, l).c("lessonId", j.c, new l[0]).E("homeWorks");
                                                                                h159 = h.h("RealmString");
                                                                                k0.m(h159);
                                                                                f22 = e26.f("homeWorks", h159);
                                                                                h160 = h.h("RealmString");
                                                                                k0.m(h160);
                                                                                f22.f("homeWorksLocal", h160);
                                                                                n2 = n5 + 1L;
                                                                                continue Block_36_Outer;
                                                                            }
                                                                            h161 = h.h("RealmPeriodModel");
                                                                            k0.m(h161);
                                                                            h161.G();
                                                                            n10 = n2 + 1L;
                                                                            continue Label_8813_Outer;
                                                                        }
                                                                        h162 = h.h("RealmProfile");
                                                                        k0.m(h162);
                                                                        h162.c("lockScreen", j.b, new l[0]).f("lockScreenIds", h.h("RealmInteger"));
                                                                        n7 = n2 + 1L;
                                                                        continue Block_20_Outer;
                                                                    }
                                                                }
                                                                n16 = n2;
                                                                continue Label_9328_Outer;
                                                            }
                                                            Label_11265: {
                                                                h116.c("userId", Long.TYPE, io.realm.l.I);
                                                            }
                                                            continue Block_36;
                                                        }
                                                        n2 = n16;
                                                        continue Label_9328_Outer;
                                                    }
                                                    h163 = h.h("RealmProfile");
                                                    k0.m(h163);
                                                    m = io.realm.l.I;
                                                    h163.c("messengerServerUrl", String.class, m).c("messengerOrganizationId", String.class, m);
                                                    n17 = n7 + 1L;
                                                    continue;
                                                }
                                            }
                                            n9 = n2;
                                            continue Label_10897_Outer;
                                        }
                                        Label_10636: {
                                            c4 = c16.c("registrationUrl", String.class, i);
                                        }
                                    }
                                    break Label_11336;
                                    Label_11339: {
                                        h120.c("isOnlinePeriod", Boolean.TYPE, io.realm.l.I);
                                    }
                                    continue Label_11336;
                                }
                                h.e("RealmInfoCenterExam").c("key", c19, h27).c("id", c19, new l[0]).c("examType", String.class, i).c("start", c19, new l[0]).c("end", c19, new l[0]).c("departmentId", c19, new l[0]).c("name", String.class, i).c("text", String.class, i).c("entityType", d4, new l[0]).c("entityId", c19, new l[0]).c("subjectId", c19, new l[0]).f("classes", h.h("RealmLong")).f("rooms", h.h("RealmLong")).f("teachers", h.h("RealmLong")).f("invigilator", h.h("RealmInvigilator"));
                                n2 = n17 + 1L;
                                continue Block_13_Outer;
                            }
                            h164 = h.h("RealmSystemNotification");
                            k0.m(h164);
                            h164.c("target", j.c, new l[0]).c("offset", j.d, new l[0]);
                            n12 = n15 + 1L;
                            continue;
                        }
                        h25 = h.h("RealmProfile");
                        continue Label_11203;
                    }
                    continue Label_11055;
                }
            }
            // iftrue(Label_11206:, h25 != null)
            finally {
            }
            // monitorexit(this)
        }
    }
    
    @Override
    public boolean equals(@f final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        Object class1;
        if (o == null) {
            class1 = null;
        }
        else {
            class1 = o.getClass();
        }
        if (!k0.g(j.class, class1)) {
            return false;
        }
        if (this.hashCode() != o.hashCode()) {
            b = false;
        }
        return b;
    }
    
    @Override
    public int hashCode() {
        final Integer f = com.untis.mobile.a.f;
        int intValue;
        if (f == null) {
            intValue = 0;
        }
        else {
            intValue = f;
        }
        return intValue;
    }
    
    @Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000*\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0005\u001a\u0004\b\n\u0010\u0007R\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0005\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0013" }, d2 = { "com/untis/mobile/persistence/realm/j$a", "", "Ljava/lang/Class;", "", "typeLong", "Ljava/lang/Class;", "d", "()Ljava/lang/Class;", "", "typeInt", "c", "", "typeBoolean", "a", "", "typeFloat", "b", "<init>", "()V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
    public static final class a
    {
        private a() {
        }
        
        @e
        public final Class<Boolean> a() {
            return (Class<Boolean>)j.e();
        }
        
        @e
        public final Class<Float> b() {
            return (Class<Float>)j.f();
        }
        
        @e
        public final Class<Integer> c() {
            return (Class<Integer>)j.g();
        }
        
        @e
        public final Class<Long> d() {
            return (Class<Long>)j.h();
        }
    }
}
