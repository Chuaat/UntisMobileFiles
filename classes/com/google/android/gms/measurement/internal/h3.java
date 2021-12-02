// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import h2.a;
import java.util.List;
import com.google.android.gms.common.util.d0;
import android.database.sqlite.SQLiteDatabase;
import androidx.annotation.c1;
import android.database.Cursor;
import android.os.SystemClock;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteException;
import android.content.ContentValues;
import android.content.Context;

public final class h3 extends f4
{
    private final g3 c;
    private boolean d;
    
    h3(final z4 z4) {
        super(z4);
        final Context x = super.a.X();
        super.a.w();
        this.c = new g3(this, x, "google_app_measurement_local.db");
    }
    
    @c1
    private final boolean u(int i, byte[] l) {
        this.e();
        if (this.d) {
            return false;
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("type", Integer.valueOf(i));
        contentValues.put("entry", l);
        super.a.w();
        int j = 0;
        int n = 5;
        Object rawQuery;
        Object o;
        Object o2;
        Cursor cursor;
        Cursor cursor2;
        long n2;
        long long1;
        long n3;
        final Cursor cursor3;
        long n4;
        Label_0576_Outer:Block_33_Outer:
        while (j < 5) {
            rawQuery = null;
            o = null;
            o2 = null;
            cursor = null;
            cursor2 = null;
            try {
                l = (byte[])(Object)this.l();
                Label_0096: {
                    if (l != null) {
                        break Label_0096;
                    }
                    cursor = cursor2;
                    o2 = l;
                    try {
                        try {
                            this.d = true;
                            return false;
                            long1 = n2;
                            Label_0177: {
                                try {
                                    if (((Cursor)rawQuery).moveToFirst()) {
                                        long1 = ((Cursor)rawQuery).getLong(0);
                                    }
                                    break Label_0177;
                                }
                                catch (SQLiteException o2) {}
                                catch (SQLiteFullException o2) {
                                    goto Label_0344;
                                    // iftrue(Label_0275:, long1 == n3)
                                    // iftrue(Label_0304:, rawQuery == null)
                                    // iftrue(Label_0275:, long1 < 100000L)
                                    Block_17:Block_18_Outer:
                                    while (true) {
                                        super.a.c().o().a("Data loss, local db full");
                                        n3 = 100000L - long1 + 1L;
                                        long1 = ((SQLiteDatabase)(Object)l).delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[] { Long.toString(n3) });
                                        break Block_17;
                                    Label_0304:
                                        while (true) {
                                            ((Cursor)rawQuery).close();
                                            break Label_0304;
                                            Label_0275: {
                                                ((SQLiteDatabase)(Object)l).insertOrThrow("messages", (String)null, contentValues);
                                            }
                                            ((SQLiteDatabase)(Object)l).setTransactionSuccessful();
                                            ((SQLiteDatabase)(Object)l).endTransaction();
                                            continue;
                                        }
                                        ((SQLiteDatabase)(Object)l).close();
                                        return true;
                                        continue Block_18_Outer;
                                    }
                                    super.a.c().o().d("Different delete count than expected in local db. expected, received, difference", n3, long1, n3 - long1);
                                }
                                catch (SQLiteDatabaseLockedException o2) {}
                            }
                            cursor = cursor2;
                            o2 = l;
                            ((SQLiteDatabase)(Object)l).beginTransaction();
                            cursor = cursor2;
                            o2 = l;
                            rawQuery = ((SQLiteDatabase)(Object)l).rawQuery("select count(1) from messages", (String[])null);
                            n2 = (long1 = 0L);
                        }
                        // iftrue(Label_0177:, rawQuery == null)
                        finally {
                            rawQuery = o2;
                        }
                    }
                    catch (SQLiteException o2) {
                        rawQuery = null;
                    }
                    catch (SQLiteFullException o2) {
                        rawQuery = null;
                    }
                    catch (SQLiteDatabaseLockedException ex) {}
                }
            }
            catch (SQLiteException ex2) {}
            catch (SQLiteDatabaseLockedException ex3) {}
            catch (SQLiteFullException ex4) {}
            try {
                if (((SQLiteDatabase)cursor3).inTransaction()) {
                    o2 = cursor3;
                    rawQuery = cursor;
                    ((SQLiteDatabase)cursor3).endTransaction();
                }
                o2 = cursor3;
                rawQuery = cursor;
                super.a.c().o().b("Error writing entry to local database", o);
                o2 = cursor3;
                rawQuery = cursor;
                this.d = true;
                if (cursor != null) {
                    cursor.close();
                }
                i = n;
                // iftrue(Label_0496:, rawQuery == null)
                // iftrue(Label_0583:, cursor3 == null)
                while (true) {
                Label_0583_Outer:
                    while (true) {
                        if (cursor3 != null) {
                            ((SQLiteDatabase)cursor3).close();
                            i = n;
                        }
                        while (true) {
                            ++j;
                            n = i;
                            continue Label_0576_Outer;
                            ((SQLiteDatabase)cursor3).close();
                            i = n;
                            continue Block_33_Outer;
                        }
                        n4 = n;
                        cursor = (Cursor)rawQuery;
                        o2 = cursor3;
                        SystemClock.sleep(n4);
                        n += 20;
                        break Label_0583_Outer;
                        cursor.close();
                        i = n;
                        continue Label_0583_Outer;
                    }
                    ((Cursor)rawQuery).close();
                    Label_0496: {
                        i = n;
                    }
                    continue;
                }
            }
            // iftrue(Label_0583:, cursor3 == null)
            finally {}
        }
        goto Label_0635;
    }
    
    @Override
    protected final boolean k() {
        return false;
    }
    
    @c1
    @d0
    final SQLiteDatabase l() throws SQLiteException {
        if (this.d) {
            return null;
        }
        final SQLiteDatabase writableDatabase = this.c.getWritableDatabase();
        if (writableDatabase == null) {
            this.d = true;
            return null;
        }
        return writableDatabase;
    }
    
    public final List<a> m(final int p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/google/android/gms/measurement/internal/t5.e:()V
        //     4: aload_0        
        //     5: getfield        com/google/android/gms/measurement/internal/h3.d:Z
        //     8: istore_2       
        //     9: aconst_null    
        //    10: astore_3       
        //    11: aconst_null    
        //    12: astore          4
        //    14: iload_2        
        //    15: ifeq            20
        //    18: aconst_null    
        //    19: areturn        
        //    20: new             Ljava/util/ArrayList;
        //    23: dup            
        //    24: invokespecial   java/util/ArrayList.<init>:()V
        //    27: astore          5
        //    29: aload_0        
        //    30: invokevirtual   com/google/android/gms/measurement/internal/h3.p:()Z
        //    33: ifeq            1235
        //    36: iconst_0       
        //    37: istore          6
        //    39: iconst_5       
        //    40: istore          7
        //    42: iload           6
        //    44: iconst_5       
        //    45: if_icmpge       1217
        //    48: aload_0        
        //    49: invokevirtual   com/google/android/gms/measurement/internal/h3.l:()Landroid/database/sqlite/SQLiteDatabase;
        //    52: astore          8
        //    54: aload           8
        //    56: ifnonnull       66
        //    59: aload_0        
        //    60: iconst_1       
        //    61: putfield        com/google/android/gms/measurement/internal/h3.d:Z
        //    64: aconst_null    
        //    65: areturn        
        //    66: aload           8
        //    68: invokevirtual   android/database/sqlite/SQLiteDatabase.beginTransaction:()V
        //    71: aload           8
        //    73: ldc             "messages"
        //    75: iconst_1       
        //    76: anewarray       Ljava/lang/String;
        //    79: dup            
        //    80: iconst_0       
        //    81: ldc             "rowid"
        //    83: aastore        
        //    84: ldc             "type=?"
        //    86: iconst_1       
        //    87: anewarray       Ljava/lang/String;
        //    90: dup            
        //    91: iconst_0       
        //    92: ldc             "3"
        //    94: aastore        
        //    95: aconst_null    
        //    96: aconst_null    
        //    97: ldc             "rowid desc"
        //    99: ldc             "1"
        //   101: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   104: astore          9
        //   106: aload           9
        //   108: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   113: istore_2       
        //   114: ldc2_w          -1
        //   117: lstore          10
        //   119: iload_2        
        //   120: ifeq            143
        //   123: aload           9
        //   125: iconst_0       
        //   126: invokeinterface android/database/Cursor.getLong:(I)J
        //   131: lstore          12
        //   133: aload           9
        //   135: invokeinterface android/database/Cursor.close:()V
        //   140: goto            155
        //   143: aload           9
        //   145: invokeinterface android/database/Cursor.close:()V
        //   150: ldc2_w          -1
        //   153: lstore          12
        //   155: lload           12
        //   157: ldc2_w          -1
        //   160: lcmp           
        //   161: ifeq            185
        //   164: ldc             "rowid<?"
        //   166: astore          9
        //   168: iconst_1       
        //   169: anewarray       Ljava/lang/String;
        //   172: dup            
        //   173: iconst_0       
        //   174: lload           12
        //   176: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   179: aastore        
        //   180: astore          14
        //   182: goto            192
        //   185: aconst_null    
        //   186: astore          9
        //   188: aload           9
        //   190: astore          14
        //   192: bipush          100
        //   194: invokestatic    java/lang/Integer.toString:(I)Ljava/lang/String;
        //   197: astore          15
        //   199: aload           8
        //   201: ldc             "messages"
        //   203: iconst_3       
        //   204: anewarray       Ljava/lang/String;
        //   207: dup            
        //   208: iconst_0       
        //   209: ldc             "rowid"
        //   211: aastore        
        //   212: dup            
        //   213: iconst_1       
        //   214: ldc             "type"
        //   216: aastore        
        //   217: dup            
        //   218: iconst_2       
        //   219: ldc             "entry"
        //   221: aastore        
        //   222: aload           9
        //   224: aload           14
        //   226: aconst_null    
        //   227: aconst_null    
        //   228: ldc             "rowid asc"
        //   230: aload           15
        //   232: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   235: astore          14
        //   237: lload           10
        //   239: lstore          12
        //   241: aload           14
        //   243: invokeinterface android/database/Cursor.moveToNext:()Z
        //   248: ifeq            653
        //   251: aload           14
        //   253: iconst_0       
        //   254: invokeinterface android/database/Cursor.getLong:(I)J
        //   259: lstore          10
        //   261: aload           14
        //   263: iconst_1       
        //   264: invokeinterface android/database/Cursor.getInt:(I)I
        //   269: istore_1       
        //   270: aload           14
        //   272: iconst_2       
        //   273: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   278: astore          9
        //   280: iload_1        
        //   281: ifne            395
        //   284: invokestatic    android/os/Parcel.obtain:()Landroid/os/Parcel;
        //   287: astore          15
        //   289: aload           15
        //   291: aload           9
        //   293: iconst_0       
        //   294: aload           9
        //   296: arraylength    
        //   297: invokevirtual   android/os/Parcel.unmarshall:([BII)V
        //   300: aload           15
        //   302: iconst_0       
        //   303: invokevirtual   android/os/Parcel.setDataPosition:(I)V
        //   306: getstatic       com/google/android/gms/measurement/internal/u.CREATOR:Landroid/os/Parcelable$Creator;
        //   309: aload           15
        //   311: invokeinterface android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
        //   316: checkcast       Lcom/google/android/gms/measurement/internal/u;
        //   319: astore          9
        //   321: aload           15
        //   323: invokevirtual   android/os/Parcel.recycle:()V
        //   326: lload           10
        //   328: lstore          12
        //   330: aload           9
        //   332: ifnull          241
        //   335: aload           5
        //   337: aload           9
        //   339: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   344: pop            
        //   345: lload           10
        //   347: lstore          12
        //   349: goto            241
        //   352: astore          9
        //   354: goto            387
        //   357: astore          9
        //   359: aload_0        
        //   360: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   363: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   366: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   369: ldc_w           "Failed to load event from local database"
        //   372: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //   375: aload           15
        //   377: invokevirtual   android/os/Parcel.recycle:()V
        //   380: lload           10
        //   382: lstore          12
        //   384: goto            241
        //   387: aload           15
        //   389: invokevirtual   android/os/Parcel.recycle:()V
        //   392: aload           9
        //   394: athrow         
        //   395: iload_1        
        //   396: iconst_1       
        //   397: if_icmpne       496
        //   400: invokestatic    android/os/Parcel.obtain:()Landroid/os/Parcel;
        //   403: astore          15
        //   405: aload           15
        //   407: aload           9
        //   409: iconst_0       
        //   410: aload           9
        //   412: arraylength    
        //   413: invokevirtual   android/os/Parcel.unmarshall:([BII)V
        //   416: aload           15
        //   418: iconst_0       
        //   419: invokevirtual   android/os/Parcel.setDataPosition:(I)V
        //   422: getstatic       com/google/android/gms/measurement/internal/ca.CREATOR:Landroid/os/Parcelable$Creator;
        //   425: aload           15
        //   427: invokeinterface android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
        //   432: checkcast       Lcom/google/android/gms/measurement/internal/ca;
        //   435: astore          9
        //   437: aload           15
        //   439: invokevirtual   android/os/Parcel.recycle:()V
        //   442: goto            476
        //   445: astore          9
        //   447: goto            488
        //   450: astore          9
        //   452: aload_0        
        //   453: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   456: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   459: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   462: ldc_w           "Failed to load user property from local database"
        //   465: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //   468: aload           15
        //   470: invokevirtual   android/os/Parcel.recycle:()V
        //   473: aconst_null    
        //   474: astore          9
        //   476: lload           10
        //   478: lstore          12
        //   480: aload           9
        //   482: ifnull          241
        //   485: goto            335
        //   488: aload           15
        //   490: invokevirtual   android/os/Parcel.recycle:()V
        //   493: aload           9
        //   495: athrow         
        //   496: iload_1        
        //   497: iconst_2       
        //   498: if_icmpne       597
        //   501: invokestatic    android/os/Parcel.obtain:()Landroid/os/Parcel;
        //   504: astore          15
        //   506: aload           15
        //   508: aload           9
        //   510: iconst_0       
        //   511: aload           9
        //   513: arraylength    
        //   514: invokevirtual   android/os/Parcel.unmarshall:([BII)V
        //   517: aload           15
        //   519: iconst_0       
        //   520: invokevirtual   android/os/Parcel.setDataPosition:(I)V
        //   523: getstatic       com/google/android/gms/measurement/internal/c.CREATOR:Landroid/os/Parcelable$Creator;
        //   526: aload           15
        //   528: invokeinterface android/os/Parcelable$Creator.createFromParcel:(Landroid/os/Parcel;)Ljava/lang/Object;
        //   533: checkcast       Lcom/google/android/gms/measurement/internal/c;
        //   536: astore          9
        //   538: aload           15
        //   540: invokevirtual   android/os/Parcel.recycle:()V
        //   543: goto            577
        //   546: astore          9
        //   548: goto            589
        //   551: astore          9
        //   553: aload_0        
        //   554: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   557: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   560: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   563: ldc_w           "Failed to load conditional user property from local database"
        //   566: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //   569: aload           15
        //   571: invokevirtual   android/os/Parcel.recycle:()V
        //   574: aconst_null    
        //   575: astore          9
        //   577: lload           10
        //   579: lstore          12
        //   581: aload           9
        //   583: ifnull          241
        //   586: goto            335
        //   589: aload           15
        //   591: invokevirtual   android/os/Parcel.recycle:()V
        //   594: aload           9
        //   596: athrow         
        //   597: iload_1        
        //   598: iconst_3       
        //   599: if_icmpne       633
        //   602: aload_0        
        //   603: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   606: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   609: invokevirtual   com/google/android/gms/measurement/internal/n3.t:()Lcom/google/android/gms/measurement/internal/l3;
        //   612: astore          9
        //   614: ldc_w           "Skipping app launch break"
        //   617: astore          15
        //   619: aload           9
        //   621: aload           15
        //   623: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //   626: lload           10
        //   628: lstore          12
        //   630: goto            241
        //   633: aload_0        
        //   634: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   637: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   640: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   643: astore          9
        //   645: ldc_w           "Unknown record type in local database"
        //   648: astore          15
        //   650: goto            619
        //   653: lload           12
        //   655: invokestatic    java/lang/Long.toString:(J)Ljava/lang/String;
        //   658: astore          15
        //   660: aload           8
        //   662: astore          9
        //   664: aload           9
        //   666: ldc             "messages"
        //   668: ldc_w           "rowid <= ?"
        //   671: iconst_1       
        //   672: anewarray       Ljava/lang/String;
        //   675: dup            
        //   676: iconst_0       
        //   677: aload           15
        //   679: aastore        
        //   680: invokevirtual   android/database/sqlite/SQLiteDatabase.delete:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)I
        //   683: aload           5
        //   685: invokeinterface java/util/List.size:()I
        //   690: if_icmpge       709
        //   693: aload_0        
        //   694: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   697: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   700: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   703: ldc_w           "Fewer entries removed from local database than expected"
        //   706: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //   709: aload           9
        //   711: invokevirtual   android/database/sqlite/SQLiteDatabase.setTransactionSuccessful:()V
        //   714: aload           9
        //   716: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   719: aload           14
        //   721: invokeinterface android/database/Cursor.close:()V
        //   726: aload           9
        //   728: invokevirtual   android/database/sqlite/SQLiteDatabase.close:()V
        //   731: aload           5
        //   733: areturn        
        //   734: astore          9
        //   736: goto            751
        //   739: astore          9
        //   741: goto            868
        //   744: astore          9
        //   746: goto            904
        //   749: astore          9
        //   751: aload           14
        //   753: astore          15
        //   755: aload           9
        //   757: astore          14
        //   759: aload           15
        //   761: astore          9
        //   763: goto            860
        //   766: astore          9
        //   768: goto            868
        //   771: astore          9
        //   773: goto            888
        //   776: astore          9
        //   778: goto            904
        //   781: astore          14
        //   783: aload           4
        //   785: astore          9
        //   787: goto            860
        //   790: astore          9
        //   792: goto            865
        //   795: astore          14
        //   797: goto            885
        //   800: astore          9
        //   802: goto            901
        //   805: astore          14
        //   807: goto            820
        //   810: astore          14
        //   812: goto            817
        //   815: astore          9
        //   817: aconst_null    
        //   818: astore          9
        //   820: aload           9
        //   822: ifnull          832
        //   825: aload           9
        //   827: invokeinterface android/database/Cursor.close:()V
        //   832: aload           14
        //   834: athrow         
        //   835: astore          14
        //   837: aload           4
        //   839: astore          9
        //   841: goto            860
        //   844: astore          9
        //   846: goto            865
        //   849: astore          9
        //   851: goto            901
        //   854: astore          14
        //   856: aload           4
        //   858: astore          9
        //   860: goto            1192
        //   863: astore          9
        //   865: aconst_null    
        //   866: astore          14
        //   868: aload           9
        //   870: astore          16
        //   872: aload           14
        //   874: astore          15
        //   876: aload           8
        //   878: astore          9
        //   880: goto            939
        //   883: astore          14
        //   885: aconst_null    
        //   886: astore          14
        //   888: aload           14
        //   890: astore          15
        //   892: aload           8
        //   894: astore          9
        //   896: goto            1047
        //   899: astore          9
        //   901: aconst_null    
        //   902: astore          14
        //   904: aload           9
        //   906: astore          16
        //   908: aload           14
        //   910: astore          15
        //   912: aload           8
        //   914: astore          9
        //   916: goto            1108
        //   919: astore          14
        //   921: aconst_null    
        //   922: astore          8
        //   924: aload_3        
        //   925: astore          9
        //   927: goto            1192
        //   930: astore          16
        //   932: aconst_null    
        //   933: astore          15
        //   935: aload           15
        //   937: astore          9
        //   939: aload           9
        //   941: ifnull          973
        //   944: aload           15
        //   946: astore          14
        //   948: aload           9
        //   950: astore          8
        //   952: aload           9
        //   954: invokevirtual   android/database/sqlite/SQLiteDatabase.inTransaction:()Z
        //   957: ifeq            973
        //   960: aload           15
        //   962: astore          14
        //   964: aload           9
        //   966: astore          8
        //   968: aload           9
        //   970: invokevirtual   android/database/sqlite/SQLiteDatabase.endTransaction:()V
        //   973: aload           15
        //   975: astore          14
        //   977: aload           9
        //   979: astore          8
        //   981: aload_0        
        //   982: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   985: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   988: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   991: ldc_w           "Error reading entries from local database"
        //   994: aload           16
        //   996: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   999: aload           15
        //  1001: astore          14
        //  1003: aload           9
        //  1005: astore          8
        //  1007: aload_0        
        //  1008: iconst_1       
        //  1009: putfield        com/google/android/gms/measurement/internal/h3.d:Z
        //  1012: aload           15
        //  1014: ifnull          1024
        //  1017: aload           15
        //  1019: invokeinterface android/database/Cursor.close:()V
        //  1024: iload           7
        //  1026: istore_1       
        //  1027: aload           9
        //  1029: ifnull          1173
        //  1032: iload           7
        //  1034: istore_1       
        //  1035: goto            1091
        //  1038: astore          8
        //  1040: aconst_null    
        //  1041: astore          15
        //  1043: aload           15
        //  1045: astore          9
        //  1047: iload           7
        //  1049: i2l            
        //  1050: lstore          12
        //  1052: aload           15
        //  1054: astore          14
        //  1056: aload           9
        //  1058: astore          8
        //  1060: lload           12
        //  1062: invokestatic    android/os/SystemClock.sleep:(J)V
        //  1065: iinc            7, 20
        //  1068: aload           15
        //  1070: ifnull          1080
        //  1073: aload           15
        //  1075: invokeinterface android/database/Cursor.close:()V
        //  1080: iload           7
        //  1082: istore_1       
        //  1083: aload           9
        //  1085: ifnull          1173
        //  1088: iload           7
        //  1090: istore_1       
        //  1091: aload           9
        //  1093: invokevirtual   android/database/sqlite/SQLiteDatabase.close:()V
        //  1096: goto            1173
        //  1099: astore          16
        //  1101: aconst_null    
        //  1102: astore          15
        //  1104: aload           15
        //  1106: astore          9
        //  1108: aload           15
        //  1110: astore          14
        //  1112: aload           9
        //  1114: astore          8
        //  1116: aload_0        
        //  1117: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //  1120: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //  1123: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //  1126: ldc_w           "Error reading entries from local database"
        //  1129: aload           16
        //  1131: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1134: aload           15
        //  1136: astore          14
        //  1138: aload           9
        //  1140: astore          8
        //  1142: aload_0        
        //  1143: iconst_1       
        //  1144: putfield        com/google/android/gms/measurement/internal/h3.d:Z
        //  1147: aload           15
        //  1149: ifnull          1159
        //  1152: aload           15
        //  1154: invokeinterface android/database/Cursor.close:()V
        //  1159: iload           7
        //  1161: istore_1       
        //  1162: aload           9
        //  1164: ifnull          1173
        //  1167: iload           7
        //  1169: istore_1       
        //  1170: goto            1091
        //  1173: iinc            6, 1
        //  1176: iload_1        
        //  1177: istore          7
        //  1179: goto            42
        //  1182: astore          15
        //  1184: aload           14
        //  1186: astore          9
        //  1188: aload           15
        //  1190: astore          14
        //  1192: aload           9
        //  1194: ifnull          1204
        //  1197: aload           9
        //  1199: invokeinterface android/database/Cursor.close:()V
        //  1204: aload           8
        //  1206: ifnull          1214
        //  1209: aload           8
        //  1211: invokevirtual   android/database/sqlite/SQLiteDatabase.close:()V
        //  1214: aload           14
        //  1216: athrow         
        //  1217: aload_0        
        //  1218: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //  1221: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //  1224: invokevirtual   com/google/android/gms/measurement/internal/n3.t:()Lcom/google/android/gms/measurement/internal/l3;
        //  1227: ldc_w           "Failed to read events from database in reasonable time"
        //  1230: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //  1233: aconst_null    
        //  1234: areturn        
        //  1235: aload           5
        //  1237: areturn        
        //  1238: astore          9
        //  1240: goto            888
        //  1243: astore          14
        //  1245: goto            885
        //    Signature:
        //  (I)Ljava/util/List<Lh2/a;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                                   
        //  -----  -----  -----  -----  -------------------------------------------------------
        //  48     54     1099   1108   Landroid/database/sqlite/SQLiteFullException;
        //  48     54     1038   1047   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  48     54     930    939    Landroid/database/sqlite/SQLiteException;
        //  48     54     919    930    Any
        //  59     64     899    901    Landroid/database/sqlite/SQLiteFullException;
        //  59     64     883    885    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  59     64     863    865    Landroid/database/sqlite/SQLiteException;
        //  59     64     854    860    Any
        //  66     71     899    901    Landroid/database/sqlite/SQLiteFullException;
        //  66     71     883    885    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  66     71     863    865    Landroid/database/sqlite/SQLiteException;
        //  66     71     854    860    Any
        //  71     106    810    815    Any
        //  106    114    805    810    Any
        //  123    133    805    810    Any
        //  133    140    800    805    Landroid/database/sqlite/SQLiteFullException;
        //  133    140    795    800    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  133    140    790    795    Landroid/database/sqlite/SQLiteException;
        //  133    140    781    790    Any
        //  143    150    800    805    Landroid/database/sqlite/SQLiteFullException;
        //  143    150    795    800    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  143    150    790    795    Landroid/database/sqlite/SQLiteException;
        //  143    150    781    790    Any
        //  168    182    800    805    Landroid/database/sqlite/SQLiteFullException;
        //  168    182    795    800    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  168    182    790    795    Landroid/database/sqlite/SQLiteException;
        //  168    182    781    790    Any
        //  192    237    800    805    Landroid/database/sqlite/SQLiteFullException;
        //  192    237    795    800    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  192    237    790    795    Landroid/database/sqlite/SQLiteException;
        //  192    237    781    790    Any
        //  241    280    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  241    280    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  241    280    766    771    Landroid/database/sqlite/SQLiteException;
        //  241    280    749    751    Any
        //  284    289    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  284    289    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  284    289    766    771    Landroid/database/sqlite/SQLiteException;
        //  284    289    749    751    Any
        //  289    321    357    387    Lh2/b$a;
        //  289    321    352    357    Any
        //  321    326    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  321    326    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  321    326    766    771    Landroid/database/sqlite/SQLiteException;
        //  321    326    749    751    Any
        //  335    345    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  335    345    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  335    345    766    771    Landroid/database/sqlite/SQLiteException;
        //  335    345    749    751    Any
        //  359    375    352    357    Any
        //  375    380    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  375    380    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  375    380    766    771    Landroid/database/sqlite/SQLiteException;
        //  375    380    749    751    Any
        //  387    395    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  387    395    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  387    395    766    771    Landroid/database/sqlite/SQLiteException;
        //  387    395    749    751    Any
        //  400    405    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  400    405    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  400    405    766    771    Landroid/database/sqlite/SQLiteException;
        //  400    405    749    751    Any
        //  405    437    450    476    Lh2/b$a;
        //  405    437    445    450    Any
        //  437    442    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  437    442    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  437    442    766    771    Landroid/database/sqlite/SQLiteException;
        //  437    442    749    751    Any
        //  452    468    445    450    Any
        //  468    473    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  468    473    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  468    473    766    771    Landroid/database/sqlite/SQLiteException;
        //  468    473    749    751    Any
        //  488    496    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  488    496    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  488    496    766    771    Landroid/database/sqlite/SQLiteException;
        //  488    496    749    751    Any
        //  501    506    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  501    506    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  501    506    766    771    Landroid/database/sqlite/SQLiteException;
        //  501    506    749    751    Any
        //  506    538    551    577    Lh2/b$a;
        //  506    538    546    551    Any
        //  538    543    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  538    543    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  538    543    766    771    Landroid/database/sqlite/SQLiteException;
        //  538    543    749    751    Any
        //  553    569    546    551    Any
        //  569    574    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  569    574    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  569    574    766    771    Landroid/database/sqlite/SQLiteException;
        //  569    574    749    751    Any
        //  589    597    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  589    597    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  589    597    766    771    Landroid/database/sqlite/SQLiteException;
        //  589    597    749    751    Any
        //  602    614    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  602    614    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  602    614    766    771    Landroid/database/sqlite/SQLiteException;
        //  602    614    749    751    Any
        //  619    626    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  619    626    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  619    626    766    771    Landroid/database/sqlite/SQLiteException;
        //  619    626    749    751    Any
        //  633    645    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  633    645    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  633    645    766    771    Landroid/database/sqlite/SQLiteException;
        //  633    645    749    751    Any
        //  653    660    776    781    Landroid/database/sqlite/SQLiteFullException;
        //  653    660    771    776    Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  653    660    766    771    Landroid/database/sqlite/SQLiteException;
        //  653    660    749    751    Any
        //  664    709    744    749    Landroid/database/sqlite/SQLiteFullException;
        //  664    709    1238   1243   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  664    709    739    744    Landroid/database/sqlite/SQLiteException;
        //  664    709    734    739    Any
        //  709    719    744    749    Landroid/database/sqlite/SQLiteFullException;
        //  709    719    1238   1243   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  709    719    739    744    Landroid/database/sqlite/SQLiteException;
        //  709    719    734    739    Any
        //  825    832    849    854    Landroid/database/sqlite/SQLiteFullException;
        //  825    832    1243   1248   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  825    832    844    849    Landroid/database/sqlite/SQLiteException;
        //  825    832    835    844    Any
        //  832    835    849    854    Landroid/database/sqlite/SQLiteFullException;
        //  832    835    1243   1248   Landroid/database/sqlite/SQLiteDatabaseLockedException;
        //  832    835    844    849    Landroid/database/sqlite/SQLiteException;
        //  832    835    835    844    Any
        //  952    960    1182   1192   Any
        //  968    973    1182   1192   Any
        //  981    999    1182   1192   Any
        //  1007   1012   1182   1192   Any
        //  1060   1065   1182   1192   Any
        //  1116   1134   1182   1192   Any
        //  1142   1147   1182   1192   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0832:
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
    
    @c1
    public final void n() {
        this.e();
        try {
            final SQLiteDatabase l = this.l();
            if (l != null) {
                final int delete = l.delete("messages", (String)null, (String[])null);
                if (delete > 0) {
                    super.a.c().s().b("Reset local analytics data. records", delete);
                }
            }
        }
        catch (SQLiteException ex) {
            super.a.c().o().b("Error resetting local analytics data. error", ex);
        }
    }
    
    @c1
    public final boolean o() {
        return this.u(3, new byte[0]);
    }
    
    @d0
    final boolean p() {
        final Context x = super.a.X();
        super.a.w();
        return x.getDatabasePath("google_app_measurement_local.db").exists();
    }
    
    @c1
    public final boolean q() {
        this.e();
        if (this.d) {
            return false;
        }
        if (this.p()) {
            int i = 0;
            int n = 5;
        Block_13_Outer:
            while (i < 5) {
                SQLiteDatabase sqLiteDatabase = null;
                SQLiteDatabase sqLiteDatabase2 = null;
                try {
                    try {
                        final SQLiteDatabase l = this.l();
                        if (l == null) {
                            sqLiteDatabase2 = l;
                            sqLiteDatabase = l;
                            this.d = true;
                            return false;
                        }
                        sqLiteDatabase2 = l;
                        sqLiteDatabase = l;
                        l.beginTransaction();
                        sqLiteDatabase2 = l;
                        sqLiteDatabase = l;
                        l.delete("messages", "type == ?", new String[] { Integer.toString(3) });
                        sqLiteDatabase2 = l;
                        sqLiteDatabase = l;
                        l.setTransactionSuccessful();
                        sqLiteDatabase2 = l;
                        sqLiteDatabase = l;
                        l.endTransaction();
                        l.close();
                        return true;
                    }
                    finally {
                        if (sqLiteDatabase2 != null) {
                            sqLiteDatabase2.close();
                        }
                        // iftrue(Label_0335:, sqLiteDatabase4 == null)
                        int n2 = 0;
                    Label_0335:
                        while (true) {
                            final SQLiteDatabase sqLiteDatabase3;
                            Label_0281: {
                                break Label_0281;
                                sqLiteDatabase3 = sqLiteDatabase;
                                n2 = n;
                            }
                            sqLiteDatabase3.close();
                            break Label_0335;
                            Label_0211: {
                                final SQLiteException ex;
                                super.a.c().o().b("Error deleting app launch break from local database", ex);
                            }
                            this.d = true;
                            n2 = n;
                            continue;
                        }
                        ++i;
                        n = n2;
                        continue Block_13_Outer;
                        // iftrue(Label_0211:, sqLiteDatabase4 == null || !sqLiteDatabase4.inTransaction())
                        final SQLiteDatabase sqLiteDatabase4;
                        sqLiteDatabase4.endTransaction();
                    }
                }
                catch (SQLiteException ex2) {}
                catch (SQLiteFullException ex3) {}
                catch (SQLiteDatabaseLockedException ex4) {}
                break;
            }
            super.a.c().t().a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }
    
    public final boolean r(final c c) {
        final byte[] c2 = super.a.M().c0((Parcelable)c);
        if (c2.length > 131072) {
            super.a.c().q().a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return this.u(2, c2);
    }
    
    public final boolean s(final u u) {
        final Parcel obtain = Parcel.obtain();
        v.a(u, obtain, 0);
        final byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            super.a.c().q().a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return this.u(0, marshall);
    }
    
    public final boolean t(final ca ca) {
        final Parcel obtain = Parcel.obtain();
        da.a(ca, obtain, 0);
        final byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            super.a.c().q().a("User property too long for local database. Sending directly to service");
            return false;
        }
        return this.u(1, marshall);
    }
}
