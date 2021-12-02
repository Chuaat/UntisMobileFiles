// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.services.messages;

import io.realm.q;
import org.koin.core.c$a;
import java.util.Collection;
import com.untis.mobile.api.dto.legacy.JsonMessageOfDay;
import rx.functions.p;
import com.untis.mobile.api.common.JsonRpcErrorType;
import com.untis.mobile.api.error.JsonRpcError;
import com.untis.mobile.api.common.UMDriveFileDescriptor;
import com.untis.mobile.api.common.UMMessageOfDay;
import kotlin.jvm.internal.w;
import org.joda.time.t;
import java.util.Set;
import com.untis.mobile.persistence.models.EntityType;
import com.untis.mobile.services.profile.legacy.j0;
import com.untis.mobile.persistence.models.profile.Profile;
import rx.g;
import com.untis.mobile.api.dto.GetMessagesOfDayResponse;
import io.realm.l0;
import java.util.Iterator;
import io.realm.s0;
import io.realm.f0;
import java.io.Closeable;
import kotlin.j2;
import java.util.List;
import com.untis.mobile.persistence.models.drive.DriveAttachment;
import kotlin.collections.v;
import com.untis.mobile.persistence.models.MessageOfDay;
import java.util.ArrayList;
import com.untis.mobile.api.ApiService;
import kotlin.d0;
import kotlin.jvm.internal.k1;
import kotlin.jvm.internal.m0;
import com.untis.mobile.persistence.realm.d;
import kotlin.jvm.internal.k0;
import kotlin.b0;
import kotlin.Metadata;
import org.koin.core.c;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u001f\u001a\u00020\u001c¢\u0006\u0004\b%\u0010&J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0016\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\nH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0006H\u0016R\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR-\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00060 j\b\u0012\u0004\u0012\u00020\u0006`!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0013\u001a\u0004\b#\u0010$¨\u0006'" }, d2 = { "Lcom/untis/mobile/services/messages/e;", "Lcom/untis/mobile/services/messages/a;", "Lorg/koin/core/c;", "Lcom/untis/mobile/persistence/models/profile/Profile;", "i", "", "Lcom/untis/mobile/persistence/models/MessageOfDay;", "messages", "Lkotlin/j2;", "j", "Lrx/g;", "k", "", "unreadOnly", "l", "messageOfDay", "m", "Lcom/untis/mobile/persistence/realm/d;", "H", "Lkotlin/b0;", "h", "()Lcom/untis/mobile/persistence/realm/d;", "realmService", "Lcom/untis/mobile/api/ApiService;", "I", "f", "()Lcom/untis/mobile/api/ApiService;", "apiService", "", "G", "Ljava/lang/String;", "profileId", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "J", "g", "()Ljava/util/ArrayList;", "<init>", "(Ljava/lang/String;)V", "untismobile_5.1.0_release" }, k = 1, mv = { 1, 5, 1 })
public final class e implements a, c
{
    @org.jetbrains.annotations.e
    private final String G;
    @org.jetbrains.annotations.e
    private final b0 H;
    @org.jetbrains.annotations.e
    private final b0 I;
    @org.jetbrains.annotations.e
    private final b0 J;
    
    public e(@org.jetbrains.annotations.e final String g) {
        k0.p(g, "profileId");
        this.G = g;
        this.H = d0.c((n6.a<?>)new n6.a<d>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final d invoke() {
                return (d)this.G.t(k1.d(d.class), null, null);
            }
        });
        this.I = d0.c((n6.a<?>)new n6.a<ApiService>() {
            final /* synthetic */ org.koin.core.scope.a G = ((c)this).getKoin().y();
            
            @Override
            public final ApiService invoke() {
                return (ApiService)this.G.t(k1.d(ApiService.class), null, null);
            }
        });
        this.J = d0.c((n6.a<?>)new n6.a<ArrayList<MessageOfDay>>() {
            @org.jetbrains.annotations.e
            public final ArrayList<MessageOfDay> a() {
                final ArrayList<MessageOfDay> list = new ArrayList<MessageOfDay>();
                final f0 a = e.this.h().a(e.this.i());
                try {
                    final s0<x4.a> b0 = a.f3(x4.a.class).b0();
                    k0.o(b0, "realm.where(RealmMessageOfDay::class.java).findAll()");
                    for (final x4.a a2 : b0) {
                        final long t8 = a2.t8();
                        final String v8 = a2.v8();
                        final String w8 = a2.w8();
                        final l0<o4.a> s8 = a2.s8();
                        final ArrayList list2 = new ArrayList<DriveAttachment>(v.Y((Iterable<?>)s8, 10));
                        for (final o4.a a3 : s8) {
                            list2.add(new DriveAttachment(a3.s8(), a3.t8(), a3.u8()));
                        }
                        list.add(new MessageOfDay(t8, v8, w8, (List<DriveAttachment>)list2, a2.u8()));
                    }
                    final j2 a4 = j2.a;
                    kotlin.io.c.a(a, null);
                    return list;
                }
                finally {
                    try {}
                    finally {
                        final Throwable t9;
                        kotlin.io.c.a(a, t9);
                    }
                }
            }
        });
    }
    
    private final ApiService f() {
        return this.I.getValue();
    }
    
    private final ArrayList<MessageOfDay> g() {
        return this.J.getValue();
    }
    
    private final d h() {
        return this.H.getValue();
    }
    
    private final Profile i() {
        Profile l;
        if ((l = j0.G.l(this.G)) == null) {
            l = new Profile(0L, null, null, null, 0L, null, 0L, null, null, null, null, null, false, false, 0L, null, null, null, 0L, null, false, null, 0L, 0, null, null, false, false, 0L, 0L, 0L, 0L, 0L, 0L, null, 0L, null, 0L, false, null, null, null, null, null, null, 0L, false, 0L, -1, 65535, null);
        }
        return l;
    }
    
    private final void j(final List<MessageOfDay> p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     3: dup            
        //     4: aload_1        
        //     5: bipush          10
        //     7: invokestatic    kotlin/collections/v.Y:(Ljava/lang/Iterable;I)I
        //    10: invokespecial   java/util/ArrayList.<init>:(I)V
        //    13: astore_2       
        //    14: aload_1        
        //    15: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //    20: astore_3       
        //    21: aload_3        
        //    22: invokeinterface java/util/Iterator.hasNext:()Z
        //    27: ifeq            55
        //    30: aload_2        
        //    31: aload_3        
        //    32: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //    37: checkcast       Lcom/untis/mobile/persistence/models/MessageOfDay;
        //    40: invokevirtual   com/untis/mobile/persistence/models/MessageOfDay.getId:()J
        //    43: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //    46: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //    51: pop            
        //    52: goto            21
        //    55: aload_0        
        //    56: invokespecial   com/untis/mobile/services/messages/e.h:()Lcom/untis/mobile/persistence/realm/d;
        //    59: aload_0        
        //    60: invokespecial   com/untis/mobile/services/messages/e.i:()Lcom/untis/mobile/persistence/models/profile/Profile;
        //    63: invokeinterface com/untis/mobile/persistence/realm/d.a:(Lcom/untis/mobile/persistence/models/profile/Profile;)Lio/realm/f0;
        //    68: astore_3       
        //    69: aload_3        
        //    70: astore          4
        //    72: aload_3        
        //    73: invokevirtual   io/realm/f0.beginTransaction:()V
        //    76: aload_3        
        //    77: astore          4
        //    79: aload_3        
        //    80: ldc             Lx4/a;.class
        //    82: invokevirtual   io/realm/f0.f3:(Ljava/lang/Class;)Lio/realm/RealmQuery;
        //    85: invokevirtual   io/realm/RealmQuery.b0:()Lio/realm/s0;
        //    88: astore          5
        //    90: aload_3        
        //    91: astore          4
        //    93: aload           5
        //    95: ldc             "realm.where(RealmMessageOfDay::class.java).findAll()"
        //    97: invokestatic    kotlin/jvm/internal/k0.o:(Ljava/lang/Object;Ljava/lang/String;)V
        //   100: aload_3        
        //   101: astore          4
        //   103: aload           5
        //   105: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   110: astore          5
        //   112: aload_3        
        //   113: astore          4
        //   115: aload           5
        //   117: invokeinterface java/util/Iterator.hasNext:()Z
        //   122: istore          6
        //   124: iload           6
        //   126: ifeq            182
        //   129: aload_3        
        //   130: astore          4
        //   132: aload           5
        //   134: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   139: checkcast       Lx4/a;
        //   142: astore          7
        //   144: aload_3        
        //   145: astore          4
        //   147: aload_2        
        //   148: aload           7
        //   150: invokevirtual   x4/a.t8:()J
        //   153: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   156: invokeinterface java/util/List.contains:(Ljava/lang/Object;)Z
        //   161: ifne            112
        //   164: aload_3        
        //   165: astore          4
        //   167: aload           7
        //   169: invokevirtual   io/realm/p0.b8:()V
        //   172: goto            112
        //   175: astore_1       
        //   176: aload           4
        //   178: astore_3       
        //   179: goto            617
        //   182: aload_3        
        //   183: astore          4
        //   185: aload_1        
        //   186: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   191: astore          5
        //   193: aload_3        
        //   194: astore          4
        //   196: aload           5
        //   198: invokeinterface java/util/Iterator.hasNext:()Z
        //   203: ifeq            568
        //   206: aload_3        
        //   207: astore          4
        //   209: aload           5
        //   211: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   216: checkcast       Lcom/untis/mobile/persistence/models/MessageOfDay;
        //   219: astore          7
        //   221: aload_3        
        //   222: astore          4
        //   224: aload_3        
        //   225: ldc             Lx4/a;.class
        //   227: invokevirtual   io/realm/f0.f3:(Ljava/lang/Class;)Lio/realm/RealmQuery;
        //   230: ldc             "id"
        //   232: aload           7
        //   234: invokevirtual   com/untis/mobile/persistence/models/MessageOfDay.getId:()J
        //   237: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   240: invokevirtual   io/realm/RealmQuery.I:(Ljava/lang/String;Ljava/lang/Long;)Lio/realm/RealmQuery;
        //   243: invokevirtual   io/realm/RealmQuery.d0:()Ljava/lang/Object;
        //   246: checkcast       Lx4/a;
        //   249: astore          8
        //   251: aload_3        
        //   252: astore          4
        //   254: aload           7
        //   256: invokevirtual   com/untis/mobile/persistence/models/MessageOfDay.getId:()J
        //   259: lstore          9
        //   261: aload_3        
        //   262: astore          4
        //   264: aload           7
        //   266: invokevirtual   com/untis/mobile/persistence/models/MessageOfDay.getSubject:()Ljava/lang/String;
        //   269: astore          11
        //   271: aload_3        
        //   272: astore          4
        //   274: aload           7
        //   276: invokevirtual   com/untis/mobile/persistence/models/MessageOfDay.getText:()Ljava/lang/String;
        //   279: astore          12
        //   281: aload_3        
        //   282: astore          4
        //   284: aload           7
        //   286: invokevirtual   com/untis/mobile/persistence/models/MessageOfDay.getDriveAttachments:()Ljava/util/List;
        //   289: astore          13
        //   291: aload_3        
        //   292: astore          4
        //   294: new             Ljava/util/ArrayList;
        //   297: astore_2       
        //   298: aload_3        
        //   299: astore          4
        //   301: aload_2        
        //   302: aload           13
        //   304: bipush          10
        //   306: invokestatic    kotlin/collections/v.Y:(Ljava/lang/Iterable;I)I
        //   309: invokespecial   java/util/ArrayList.<init>:(I)V
        //   312: aload_3        
        //   313: astore          4
        //   315: aload           13
        //   317: invokeinterface java/lang/Iterable.iterator:()Ljava/util/Iterator;
        //   322: astore          13
        //   324: aload_3        
        //   325: astore          4
        //   327: aload           13
        //   329: invokeinterface java/util/Iterator.hasNext:()Z
        //   334: istore          6
        //   336: iload           6
        //   338: ifeq            409
        //   341: aload_3        
        //   342: astore          4
        //   344: aload           13
        //   346: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   351: checkcast       Lcom/untis/mobile/persistence/models/drive/DriveAttachment;
        //   354: astore          14
        //   356: aload           14
        //   358: invokevirtual   com/untis/mobile/persistence/models/drive/DriveAttachment.getId:()J
        //   361: lstore          15
        //   363: aload           14
        //   365: invokevirtual   com/untis/mobile/persistence/models/drive/DriveAttachment.getUrl:()Ljava/lang/String;
        //   368: astore          4
        //   370: aload           14
        //   372: invokevirtual   com/untis/mobile/persistence/models/drive/DriveAttachment.getName:()Ljava/lang/String;
        //   375: astore          14
        //   377: new             Lo4/a;
        //   380: astore          17
        //   382: aload           17
        //   384: lload           15
        //   386: aload           14
        //   388: aload           4
        //   390: invokespecial   o4/a.<init>:(JLjava/lang/String;Ljava/lang/String;)V
        //   393: aload_2        
        //   394: aload           17
        //   396: invokeinterface java/util/Collection.add:(Ljava/lang/Object;)Z
        //   401: pop            
        //   402: goto            324
        //   405: astore_1       
        //   406: goto            617
        //   409: aload_3        
        //   410: astore          4
        //   412: aload_2        
        //   413: invokestatic    com/untis/mobile/utils/mapper/common/b.h:(Ljava/util/List;)Lio/realm/l0;
        //   416: astore          13
        //   418: aload           13
        //   420: ldc_w           "toRealmList(messageOfDay.driveAttachments.map { attachment ->\n                                RealmDriveAttachment(\n                                    id = attachment.id,\n                                    url = attachment.url,\n                                    name = attachment.name\n                                )\n                            })"
        //   423: invokestatic    kotlin/jvm/internal/k0.o:(Ljava/lang/Object;Ljava/lang/String;)V
        //   426: aload           8
        //   428: ifnonnull       436
        //   431: aconst_null    
        //   432: astore_2       
        //   433: goto            445
        //   436: aload           8
        //   438: invokevirtual   x4/a.u8:()Z
        //   441: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   444: astore_2       
        //   445: aload_2        
        //   446: ifnonnull       459
        //   449: aload           7
        //   451: invokevirtual   com/untis/mobile/persistence/models/MessageOfDay.getRead:()Z
        //   454: istore          6
        //   456: goto            465
        //   459: aload_2        
        //   460: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   463: istore          6
        //   465: new             Lx4/a;
        //   468: astore_2       
        //   469: aload_2        
        //   470: lload           9
        //   472: aload           11
        //   474: aload           12
        //   476: aload           13
        //   478: iload           6
        //   480: invokespecial   x4/a.<init>:(JLjava/lang/String;Ljava/lang/String;Lio/realm/l0;Z)V
        //   483: aload           4
        //   485: astore_3       
        //   486: aload           4
        //   488: aload_2        
        //   489: iconst_0       
        //   490: anewarray       Lio/realm/q;
        //   493: invokevirtual   io/realm/f0.G0:(Lio/realm/n0;[Lio/realm/q;)Lio/realm/n0;
        //   496: pop            
        //   497: aload           8
        //   499: ifnonnull       507
        //   502: aconst_null    
        //   503: astore_2       
        //   504: goto            519
        //   507: aload           4
        //   509: astore_3       
        //   510: aload           8
        //   512: invokevirtual   x4/a.u8:()Z
        //   515: invokestatic    java/lang/Boolean.valueOf:(Z)Ljava/lang/Boolean;
        //   518: astore_2       
        //   519: aload_2        
        //   520: ifnonnull       536
        //   523: aload           4
        //   525: astore_3       
        //   526: aload           7
        //   528: invokevirtual   com/untis/mobile/persistence/models/MessageOfDay.getRead:()Z
        //   531: istore          6
        //   533: goto            545
        //   536: aload           4
        //   538: astore_3       
        //   539: aload_2        
        //   540: invokevirtual   java/lang/Boolean.booleanValue:()Z
        //   543: istore          6
        //   545: aload           4
        //   547: astore_3       
        //   548: aload           7
        //   550: iload           6
        //   552: invokevirtual   com/untis/mobile/persistence/models/MessageOfDay.setRead:(Z)V
        //   555: aload           4
        //   557: astore_3       
        //   558: goto            193
        //   561: astore_1       
        //   562: aload           4
        //   564: astore_3       
        //   565: goto            617
        //   568: aload_3        
        //   569: astore          4
        //   571: aload           4
        //   573: astore_3       
        //   574: aload           4
        //   576: invokevirtual   io/realm/f0.n:()V
        //   579: aload           4
        //   581: astore_3       
        //   582: getstatic       kotlin/j2.a:Lkotlin/j2;
        //   585: astore_2       
        //   586: aload           4
        //   588: aconst_null    
        //   589: invokestatic    kotlin/io/c.a:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   592: aload_0        
        //   593: invokespecial   com/untis/mobile/services/messages/e.g:()Ljava/util/ArrayList;
        //   596: invokevirtual   java/util/ArrayList.clear:()V
        //   599: aload_0        
        //   600: invokespecial   com/untis/mobile/services/messages/e.g:()Ljava/util/ArrayList;
        //   603: aload_1        
        //   604: invokevirtual   java/util/ArrayList.addAll:(Ljava/util/Collection;)Z
        //   607: pop            
        //   608: return         
        //   609: astore_1       
        //   610: goto            617
        //   613: astore_1       
        //   614: aload           4
        //   616: astore_3       
        //   617: aload_1        
        //   618: athrow         
        //   619: astore          4
        //   621: aload_3        
        //   622: aload_1        
        //   623: invokestatic    kotlin/io/c.a:(Ljava/io/Closeable;Ljava/lang/Throwable;)V
        //   626: aload           4
        //   628: athrow         
        //    Signature:
        //  (Ljava/util/List<Lcom/untis/mobile/persistence/models/MessageOfDay;>;)V
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  72     76     613    619    Any
        //  79     90     613    619    Any
        //  93     100    613    619    Any
        //  103    112    613    619    Any
        //  115    124    613    619    Any
        //  132    144    175    182    Any
        //  147    164    175    182    Any
        //  167    172    175    182    Any
        //  185    193    613    619    Any
        //  196    206    613    619    Any
        //  209    221    613    619    Any
        //  224    251    613    619    Any
        //  254    261    613    619    Any
        //  264    271    613    619    Any
        //  274    281    613    619    Any
        //  284    291    613    619    Any
        //  294    298    613    619    Any
        //  301    312    613    619    Any
        //  315    324    613    619    Any
        //  327    336    613    619    Any
        //  344    356    175    182    Any
        //  356    402    405    409    Any
        //  412    426    561    568    Any
        //  436    445    561    568    Any
        //  449    456    405    409    Any
        //  459    465    561    568    Any
        //  465    483    561    568    Any
        //  486    497    609    613    Any
        //  510    519    609    613    Any
        //  526    533    609    613    Any
        //  539    545    609    613    Any
        //  548    555    609    613    Any
        //  574    579    609    613    Any
        //  582    586    609    613    Any
        //  617    619    619    629    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0507:
        //     at com.strobel.decompiler.ast.Error.expressionLinkedFromMultipleLocations(Error.java:27)
        //     at com.strobel.decompiler.ast.AstOptimizer.mergeDisparateObjectInitializations(AstOptimizer.java:2596)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:235)
        //     at com.strobel.decompiler.ast.AstOptimizer.optimize(AstOptimizer.java:42)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:214)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:99)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethodBody(AstBuilder.java:782)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createMethod(AstBuilder.java:675)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addTypeMembers(AstBuilder.java:552)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeCore(AstBuilder.java:519)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createTypeNoCache(AstBuilder.java:161)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.createType(AstBuilder.java:150)
        //     at com.strobel.decompiler.languages.java.ast.AstBuilder.addType(AstBuilder.java:125)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.buildAst(JavaLanguage.java:71)
        //     at com.strobel.decompiler.languages.java.JavaLanguage.decompileType(JavaLanguage.java:59)
        //     at com.strobel.decompiler.DecompilerDriver.decompileType(DecompilerDriver.java:330)
        //     at com.strobel.decompiler.DecompilerDriver.decompileJar(DecompilerDriver.java:251)
        //     at com.strobel.decompiler.DecompilerDriver.main(DecompilerDriver.java:126)
        // 
        throw new IllegalStateException("An error occurred while decompiling this method.");
    }
    
    private static final List n(final e e, final GetMessagesOfDayResponse getMessagesOfDayResponse) {
        k0.p(e, "this$0");
        final List<UMMessageOfDay> messages = getMessagesOfDayResponse.messages;
        k0.o(messages, "response.messages");
        final ArrayList list = new ArrayList<MessageOfDay>(v.Y((Iterable<?>)messages, 10));
        for (final UMMessageOfDay umMessageOfDay : messages) {
            final long id = umMessageOfDay.id;
            String subject = umMessageOfDay.subject;
            if (subject == null) {
                subject = "";
            }
            String body = umMessageOfDay.body;
            if (body == null) {
                body = "";
            }
            final List<UMDriveFileDescriptor> attachments = umMessageOfDay.attachments;
            k0.o(attachments, "umMessageOfDay.attachments");
            final ArrayList list2 = new ArrayList<DriveAttachment>(v.Y((Iterable<?>)attachments, 10));
            for (final UMDriveFileDescriptor umDriveFileDescriptor : attachments) {
                final long id2 = umDriveFileDescriptor.id;
                final String name = umDriveFileDescriptor.name;
                k0.o(name, "attachment.name");
                final String url = umDriveFileDescriptor.url;
                k0.o(url, "attachment.url");
                list2.add(new DriveAttachment(id2, name, url));
            }
            list.add(new MessageOfDay(id, subject, body, (List<DriveAttachment>)list2, false));
        }
        e.j((List<MessageOfDay>)list);
        return list;
    }
    
    private static final g o(final e e, final Throwable t) {
        k0.p(e, "this$0");
        final Throwable cause = t.getCause();
        if (cause != null && cause instanceof JsonRpcError && ((JsonRpcError)cause).isAnyOf(JsonRpcErrorType.MethodNotFound)) {
            return e.f().getLegacyMessagesOfDay(e.i(), com.untis.mobile.utils.time.a.a()).k3((p)new com.untis.mobile.services.messages.c(e));
        }
        k0.o(t, "throwable");
        throw t;
    }
    
    private static final List p(final e e, final com.untis.mobile.api.dto.legacy.GetMessagesOfDayResponse getMessagesOfDayResponse) {
        k0.p(e, "this$0");
        final Collection<JsonMessageOfDay> messages = getMessagesOfDayResponse.messageOfDayCollection.messages;
        k0.o(messages, "response.messageOfDayCollection.messages");
        final ArrayList list = new ArrayList<MessageOfDay>(v.Y((Iterable<?>)messages, 10));
        for (final JsonMessageOfDay jsonMessageOfDay : messages) {
            final long id = jsonMessageOfDay.id;
            String subject = jsonMessageOfDay.subject;
            if (subject == null) {
                subject = "";
            }
            String text;
            if ((text = jsonMessageOfDay.text) == null) {
                text = "";
            }
            list.add(new MessageOfDay(id, subject, text, null, false, 24, null));
        }
        e.j((List<MessageOfDay>)list);
        return list;
    }
    
    @org.jetbrains.annotations.e
    public org.koin.core.a getKoin() {
        return c$a.a((c)this);
    }
    
    @org.jetbrains.annotations.e
    @Override
    public g<List<MessageOfDay>> k() {
        final g d4 = this.f().getMessagesOfDay(this.i(), com.untis.mobile.utils.time.a.a()).E5(rx.schedulers.c.e()).k3((p)new b(this)).d4((p)new com.untis.mobile.services.messages.d(this));
        k0.o(d4, "apiService\n            .getMessagesOfDay(profile(), SystemTime.dateTime())\n            .subscribeOn(Schedulers.io())\n            .map { response ->\n                val messages = response.messages.map { umMessageOfDay ->\n                    MessageOfDay(\n                        id = umMessageOfDay.id,\n                        subject = umMessageOfDay.subject ?: \"\",\n                        text = umMessageOfDay.body ?: \"\",\n                        driveAttachments = umMessageOfDay.attachments.map { attachment ->\n                            DriveAttachment(\n                                id = attachment.id,\n                                name = attachment.name,\n                                url = attachment.url\n                            )\n                        },\n                        read = false\n                    )\n                }\n\n                replace(messages)\n\n                messages\n            }\n            .onErrorResumeNext { throwable ->\n                val cause = throwable.cause\n                if (cause != null && cause is JsonRpcError && cause.isAnyOf(JsonRpcErrorType.MethodNotFound)) {\n                    return@onErrorResumeNext apiService\n                        .getLegacyMessagesOfDay(profile(), SystemTime.dateTime())\n                        .map { response ->\n                            val messages =\n                                response.messageOfDayCollection.messages.map { jsonMessageOfDay ->\n                                    MessageOfDay(\n                                        id = jsonMessageOfDay.id,\n                                        subject = jsonMessageOfDay.subject ?: \"\",\n                                        text = jsonMessageOfDay.text ?: \"\"\n                                    )\n                                }\n\n                            replace(messages)\n\n                            return@map messages\n                        }\n                }\n\n                throw throwable\n            }");
        return (g<List<MessageOfDay>>)d4;
    }
    
    @org.jetbrains.annotations.e
    @Override
    public List<MessageOfDay> l(final boolean b) {
        final ArrayList<MessageOfDay> g = this.g();
        final ArrayList<MessageOfDay> list = new ArrayList<MessageOfDay>();
        for (final MessageOfDay next : g) {
            final MessageOfDay messageOfDay = next;
            int n = 1;
            if (b) {
                if (!messageOfDay.getRead()) {
                    n = n;
                }
                else {
                    n = 0;
                }
            }
            if (n != 0) {
                list.add(next);
            }
        }
        return (List<MessageOfDay>)v.I5((Iterable<?>)list);
    }
    
    @Override
    public void m(@org.jetbrains.annotations.e final MessageOfDay messageOfDay) {
        k0.p(messageOfDay, "messageOfDay");
        this.g().remove(messageOfDay);
        final f0 a = this.h().a(this.i());
        try {
            a.beginTransaction();
            final long id = messageOfDay.getId();
            final String subject = messageOfDay.getSubject();
            final String text = messageOfDay.getText();
            final List<DriveAttachment> driveAttachments = messageOfDay.getDriveAttachments();
            final ArrayList list = new ArrayList<o4.a>(v.Y((Iterable<?>)driveAttachments, 10));
            for (final DriveAttachment driveAttachment : driveAttachments) {
                list.add(new o4.a(driveAttachment.getId(), driveAttachment.getName(), driveAttachment.getUrl()));
            }
            final l0<o4.a> h = com.untis.mobile.utils.mapper.common.b.h((List<o4.a>)list);
            k0.o(h, "toRealmList(messageOfDay.driveAttachments.map { attachment ->\n                            RealmDriveAttachment(\n                                id = attachment.id,\n                                url = attachment.url,\n                                name = attachment.name\n                            )\n                        })");
            a.G0(new x4.a(id, subject, text, h, messageOfDay.getRead()), new q[0]);
            a.n();
            final j2 a2 = j2.a;
            kotlin.io.c.a(a, null);
            this.g().add(messageOfDay);
        }
        finally {
            try {}
            finally {
                kotlin.io.c.a(a, (Throwable)messageOfDay);
            }
        }
    }
}
