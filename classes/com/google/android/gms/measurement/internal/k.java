// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.q7;
import com.google.android.gms.internal.measurement.f9;
import com.google.android.gms.internal.measurement.j9;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.u4;
import android.content.Context;
import java.io.IOException;
import com.google.android.gms.internal.measurement.e5;
import com.google.android.gms.internal.measurement.fe;
import java.util.Iterator;
import com.google.android.gms.internal.measurement.x3;
import com.google.android.gms.internal.measurement.o3;
import com.google.android.gms.internal.measurement.w3;
import com.google.android.gms.internal.measurement.q3;
import com.google.android.gms.internal.measurement.p3;
import com.google.android.gms.internal.measurement.m3;
import android.os.Parcelable$Creator;
import android.text.TextUtils;
import java.util.List;
import java.io.Serializable;
import java.util.Collection;
import java.util.ArrayList;
import java.util.Arrays;
import android.os.Bundle;
import com.google.android.gms.common.util.d0;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import androidx.annotation.c1;
import com.google.android.gms.common.internal.x;
import android.content.ContentValues;

final class k extends p9
{
    private static final String[] f;
    private static final String[] g;
    private static final String[] h;
    private static final String[] i;
    private static final String[] j;
    private static final String[] k;
    private static final String[] l;
    private static final String[] m;
    private final j d;
    private final k9 e;
    
    static {
        f = new String[] { "last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;" };
        g = new String[] { "origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;" };
        h = new String[] { "app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;" };
        i = new String[] { "realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;" };
        j = new String[] { "has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;" };
        k = new String[] { "session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;" };
        l = new String[] { "session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;" };
        m = new String[] { "previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;" };
    }
    
    k(final z9 z9) {
        super(z9);
        this.e = new k9(super.a.F());
        super.a.w();
        this.d = new j(this, super.a.X(), "google_app_measurement.db");
    }
    
    @c1
    static final void H(final ContentValues contentValues, final String s, final Object o) {
        x.g("value");
        x.k(o);
        if (o instanceof String) {
            contentValues.put("value", (String)o);
            return;
        }
        if (o instanceof Long) {
            contentValues.put("value", (Long)o);
            return;
        }
        if (o instanceof Double) {
            contentValues.put("value", (Double)o);
            return;
        }
        throw new IllegalArgumentException("Invalid value type");
    }
    
    @c1
    private final long J(final String s, final String[] array) {
        final SQLiteDatabase q = this.Q();
        Cursor rawQuery = null;
        try {
            final Cursor cursor = rawQuery = q.rawQuery(s, array);
            if (cursor.moveToFirst()) {
                rawQuery = cursor;
                final long long1 = cursor.getLong(0);
                cursor.close();
                return long1;
            }
            rawQuery = cursor;
            rawQuery = cursor;
            final SQLiteException ex = new SQLiteException("Database returned empty set");
            rawQuery = cursor;
            throw ex;
        }
        catch (SQLiteException ex2) {}
        finally {
            if (rawQuery != null) {
                rawQuery.close();
            }
        }
    }
    
    @c1
    private final long K(final String s, final String[] array, long long1) {
        final SQLiteDatabase q = this.Q();
        Cursor rawQuery = null;
        try {
            try {
                final Cursor cursor = rawQuery = q.rawQuery(s, array);
                if (cursor.moveToFirst()) {
                    rawQuery = cursor;
                    long1 = cursor.getLong(0);
                    cursor.close();
                    return long1;
                }
                cursor.close();
                return long1;
            }
            finally {
                if (rawQuery != null) {
                    rawQuery.close();
                }
            }
        }
        catch (SQLiteException ex) {}
    }
    
    public final void G(final String p0, final long p1, final long p2, final y9 p3) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     2: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //     5: pop            
        //     6: aload_0        
        //     7: invokevirtual   com/google/android/gms/measurement/internal/t5.e:()V
        //    10: aload_0        
        //    11: invokevirtual   com/google/android/gms/measurement/internal/p9.f:()V
        //    14: aconst_null    
        //    15: astore          7
        //    17: aconst_null    
        //    18: astore          8
        //    20: aconst_null    
        //    21: astore          9
        //    23: aconst_null    
        //    24: astore          10
        //    26: aload_0        
        //    27: invokevirtual   com/google/android/gms/measurement/internal/k.Q:()Landroid/database/sqlite/SQLiteDatabase;
        //    30: astore          11
        //    32: aconst_null    
        //    33: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    36: istore          12
        //    38: ldc_w           ""
        //    41: astore_1       
        //    42: iload           12
        //    44: ifeq            286
        //    47: lload           4
        //    49: ldc2_w          -1
        //    52: lcmp           
        //    53: istore          13
        //    55: iload           13
        //    57: ifeq            86
        //    60: iconst_2       
        //    61: anewarray       Ljava/lang/String;
        //    64: astore          14
        //    66: aload           14
        //    68: iconst_0       
        //    69: lload           4
        //    71: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    74: aastore        
        //    75: aload           14
        //    77: iconst_1       
        //    78: lload_2        
        //    79: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    82: aastore        
        //    83: goto            100
        //    86: iconst_1       
        //    87: anewarray       Ljava/lang/String;
        //    90: astore          14
        //    92: aload           14
        //    94: iconst_0       
        //    95: lload_2        
        //    96: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //    99: aastore        
        //   100: iload           13
        //   102: ifeq            109
        //   105: ldc_w           "rowid <= ? and "
        //   108: astore_1       
        //   109: aload_1        
        //   110: invokevirtual   java/lang/String.length:()I
        //   113: istore          13
        //   115: new             Ljava/lang/StringBuilder;
        //   118: astore          7
        //   120: aload           7
        //   122: iload           13
        //   124: sipush          148
        //   127: iadd           
        //   128: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   131: aload           7
        //   133: ldc_w           "select app_id, metadata_fingerprint from raw_events where "
        //   136: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   139: pop            
        //   140: aload           7
        //   142: aload_1        
        //   143: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   146: pop            
        //   147: aload           7
        //   149: ldc_w           "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;"
        //   152: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   155: pop            
        //   156: aload           11
        //   158: aload           7
        //   160: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   163: aload           14
        //   165: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   168: astore          7
        //   170: aload           10
        //   172: astore          9
        //   174: aload           7
        //   176: astore          8
        //   178: aload           7
        //   180: astore_1       
        //   181: aload           7
        //   183: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   188: istore          12
        //   190: iload           12
        //   192: ifne            203
        //   195: aload           7
        //   197: invokeinterface android/database/Cursor.close:()V
        //   202: return         
        //   203: aload           10
        //   205: astore          9
        //   207: aload           7
        //   209: astore          8
        //   211: aload           7
        //   213: astore_1       
        //   214: aload           7
        //   216: iconst_0       
        //   217: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   222: astore          14
        //   224: aload           14
        //   226: astore          9
        //   228: aload           7
        //   230: astore          8
        //   232: aload           7
        //   234: astore_1       
        //   235: aload           7
        //   237: iconst_1       
        //   238: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   243: astore          10
        //   245: aload           14
        //   247: astore          9
        //   249: aload           7
        //   251: astore          8
        //   253: aload           7
        //   255: astore_1       
        //   256: aload           7
        //   258: invokeinterface android/database/Cursor.close:()V
        //   263: aload           7
        //   265: astore_1       
        //   266: aload           10
        //   268: astore          9
        //   270: goto            484
        //   273: astore          7
        //   275: aload           9
        //   277: astore          14
        //   279: aload           8
        //   281: astore          6
        //   283: goto            1142
        //   286: lload           4
        //   288: ldc2_w          -1
        //   291: lcmp           
        //   292: istore          13
        //   294: iload           13
        //   296: ifeq            322
        //   299: iconst_2       
        //   300: anewarray       Ljava/lang/String;
        //   303: astore          14
        //   305: aload           14
        //   307: iconst_0       
        //   308: aconst_null    
        //   309: aastore        
        //   310: aload           14
        //   312: iconst_1       
        //   313: lload           4
        //   315: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   318: aastore        
        //   319: goto            332
        //   322: iconst_1       
        //   323: anewarray       Ljava/lang/String;
        //   326: dup            
        //   327: iconst_0       
        //   328: aconst_null    
        //   329: aastore        
        //   330: astore          14
        //   332: iload           13
        //   334: ifeq            341
        //   337: ldc_w           " and rowid <= ?"
        //   340: astore_1       
        //   341: aload_1        
        //   342: invokevirtual   java/lang/String.length:()I
        //   345: istore          13
        //   347: new             Ljava/lang/StringBuilder;
        //   350: astore          15
        //   352: aload           15
        //   354: iload           13
        //   356: bipush          84
        //   358: iadd           
        //   359: invokespecial   java/lang/StringBuilder.<init>:(I)V
        //   362: aload           15
        //   364: ldc_w           "select metadata_fingerprint from raw_events where app_id = ?"
        //   367: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   370: pop            
        //   371: aload           15
        //   373: aload_1        
        //   374: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   377: pop            
        //   378: aload           15
        //   380: ldc_w           " order by rowid limit 1;"
        //   383: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   386: pop            
        //   387: aload           11
        //   389: aload           15
        //   391: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   394: aload           14
        //   396: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   399: astore          14
        //   401: aload           10
        //   403: astore          9
        //   405: aload           14
        //   407: astore          8
        //   409: aload           14
        //   411: astore_1       
        //   412: aload           14
        //   414: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   419: istore          12
        //   421: iload           12
        //   423: ifne            434
        //   426: aload           14
        //   428: invokeinterface android/database/Cursor.close:()V
        //   433: return         
        //   434: aload           10
        //   436: astore          9
        //   438: aload           14
        //   440: astore          8
        //   442: aload           14
        //   444: astore_1       
        //   445: aload           14
        //   447: iconst_0       
        //   448: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   453: astore          15
        //   455: aload           10
        //   457: astore          9
        //   459: aload           14
        //   461: astore          8
        //   463: aload           14
        //   465: astore_1       
        //   466: aload           14
        //   468: invokeinterface android/database/Cursor.close:()V
        //   473: aload           15
        //   475: astore          9
        //   477: aload           14
        //   479: astore_1       
        //   480: aload           7
        //   482: astore          14
        //   484: aload           11
        //   486: ldc_w           "raw_events_metadata"
        //   489: iconst_1       
        //   490: anewarray       Ljava/lang/String;
        //   493: dup            
        //   494: iconst_0       
        //   495: ldc_w           "metadata"
        //   498: aastore        
        //   499: ldc_w           "app_id = ? and metadata_fingerprint = ?"
        //   502: iconst_2       
        //   503: anewarray       Ljava/lang/String;
        //   506: dup            
        //   507: iconst_0       
        //   508: aload           14
        //   510: aastore        
        //   511: dup            
        //   512: iconst_1       
        //   513: aload           9
        //   515: aastore        
        //   516: aconst_null    
        //   517: aconst_null    
        //   518: ldc_w           "rowid"
        //   521: ldc_w           "2"
        //   524: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   527: astore          8
        //   529: aload           8
        //   531: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   536: ifne            568
        //   539: aload_0        
        //   540: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   543: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   546: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   549: ldc_w           "Raw event metadata record is missing. appId"
        //   552: aload           14
        //   554: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //   557: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   560: aload           8
        //   562: invokeinterface android/database/Cursor.close:()V
        //   567: return         
        //   568: aload           8
        //   570: iconst_0       
        //   571: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   576: astore_1       
        //   577: invokestatic    com/google/android/gms/internal/measurement/e5.F1:()Lcom/google/android/gms/internal/measurement/d5;
        //   580: aload_1        
        //   581: invokestatic    com/google/android/gms/measurement/internal/ba.A:(Lcom/google/android/gms/internal/measurement/ra;[B)Lcom/google/android/gms/internal/measurement/ra;
        //   584: checkcast       Lcom/google/android/gms/internal/measurement/d5;
        //   587: invokevirtual   com/google/android/gms/internal/measurement/f9.n:()Lcom/google/android/gms/internal/measurement/j9;
        //   590: checkcast       Lcom/google/android/gms/internal/measurement/e5;
        //   593: astore_1       
        //   594: aload           8
        //   596: invokeinterface android/database/Cursor.moveToNext:()Z
        //   601: ifeq            625
        //   604: aload_0        
        //   605: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   608: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   611: invokevirtual   com/google/android/gms/measurement/internal/n3.t:()Lcom/google/android/gms/measurement/internal/l3;
        //   614: ldc_w           "Get multiple raw event metadata records, expected one. appId"
        //   617: aload           14
        //   619: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //   622: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   625: aload           8
        //   627: invokeinterface android/database/Cursor.close:()V
        //   632: aload_1        
        //   633: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //   636: pop            
        //   637: aload           6
        //   639: aload_1        
        //   640: putfield        com/google/android/gms/measurement/internal/y9.a:Lcom/google/android/gms/internal/measurement/e5;
        //   643: lload           4
        //   645: ldc2_w          -1
        //   648: lcmp           
        //   649: ifeq            689
        //   652: ldc_w           "app_id = ? and metadata_fingerprint = ? and rowid <= ?"
        //   655: astore_1       
        //   656: iconst_3       
        //   657: anewarray       Ljava/lang/String;
        //   660: dup            
        //   661: iconst_0       
        //   662: aload           14
        //   664: aastore        
        //   665: dup            
        //   666: iconst_1       
        //   667: aload           9
        //   669: aastore        
        //   670: dup            
        //   671: iconst_2       
        //   672: lload           4
        //   674: invokestatic    java/lang/String.valueOf:(J)Ljava/lang/String;
        //   677: aastore        
        //   678: astore          7
        //   680: aload_1        
        //   681: astore          9
        //   683: aload           7
        //   685: astore_1       
        //   686: goto            713
        //   689: ldc_w           "app_id = ? and metadata_fingerprint = ?"
        //   692: astore          7
        //   694: iconst_2       
        //   695: anewarray       Ljava/lang/String;
        //   698: dup            
        //   699: iconst_0       
        //   700: aload           14
        //   702: aastore        
        //   703: dup            
        //   704: iconst_1       
        //   705: aload           9
        //   707: aastore        
        //   708: astore_1       
        //   709: aload           7
        //   711: astore          9
        //   713: aload           11
        //   715: ldc_w           "raw_events"
        //   718: iconst_4       
        //   719: anewarray       Ljava/lang/String;
        //   722: dup            
        //   723: iconst_0       
        //   724: ldc_w           "rowid"
        //   727: aastore        
        //   728: dup            
        //   729: iconst_1       
        //   730: ldc_w           "name"
        //   733: aastore        
        //   734: dup            
        //   735: iconst_2       
        //   736: ldc_w           "timestamp"
        //   739: aastore        
        //   740: dup            
        //   741: iconst_3       
        //   742: ldc_w           "data"
        //   745: aastore        
        //   746: aload           9
        //   748: aload_1        
        //   749: aconst_null    
        //   750: aconst_null    
        //   751: ldc_w           "rowid"
        //   754: aconst_null    
        //   755: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   758: astore          7
        //   760: aload           14
        //   762: astore          9
        //   764: aload           7
        //   766: astore          8
        //   768: aload           7
        //   770: astore_1       
        //   771: aload           7
        //   773: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   778: ifeq            1005
        //   781: aload           14
        //   783: astore          9
        //   785: aload           7
        //   787: astore          8
        //   789: aload           7
        //   791: astore_1       
        //   792: aload           7
        //   794: iconst_0       
        //   795: invokeinterface android/database/Cursor.getLong:(I)J
        //   800: lstore_2       
        //   801: aload           14
        //   803: astore          9
        //   805: aload           7
        //   807: astore          8
        //   809: aload           7
        //   811: astore_1       
        //   812: aload           7
        //   814: iconst_3       
        //   815: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   820: astore          10
        //   822: aload           14
        //   824: astore          9
        //   826: aload           7
        //   828: astore          8
        //   830: aload           7
        //   832: astore_1       
        //   833: invokestatic    com/google/android/gms/internal/measurement/u4.A:()Lcom/google/android/gms/internal/measurement/t4;
        //   836: aload           10
        //   838: invokestatic    com/google/android/gms/measurement/internal/ba.A:(Lcom/google/android/gms/internal/measurement/ra;[B)Lcom/google/android/gms/internal/measurement/ra;
        //   841: checkcast       Lcom/google/android/gms/internal/measurement/t4;
        //   844: astore          10
        //   846: aload           14
        //   848: astore          9
        //   850: aload           7
        //   852: astore          8
        //   854: aload           7
        //   856: astore_1       
        //   857: aload           10
        //   859: aload           7
        //   861: iconst_1       
        //   862: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   867: invokevirtual   com/google/android/gms/internal/measurement/t4.E:(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/t4;
        //   870: pop            
        //   871: aload           14
        //   873: astore          9
        //   875: aload           7
        //   877: astore          8
        //   879: aload           7
        //   881: astore_1       
        //   882: aload           10
        //   884: aload           7
        //   886: iconst_2       
        //   887: invokeinterface android/database/Cursor.getLong:(I)J
        //   892: invokevirtual   com/google/android/gms/internal/measurement/t4.J:(J)Lcom/google/android/gms/internal/measurement/t4;
        //   895: pop            
        //   896: aload           14
        //   898: astore          9
        //   900: aload           7
        //   902: astore          8
        //   904: aload           7
        //   906: astore_1       
        //   907: aload           6
        //   909: lload_2        
        //   910: aload           10
        //   912: invokevirtual   com/google/android/gms/internal/measurement/f9.n:()Lcom/google/android/gms/internal/measurement/j9;
        //   915: checkcast       Lcom/google/android/gms/internal/measurement/u4;
        //   918: invokevirtual   com/google/android/gms/measurement/internal/y9.a:(JLcom/google/android/gms/internal/measurement/u4;)Z
        //   921: istore          12
        //   923: iload           12
        //   925: ifne            972
        //   928: aload           7
        //   930: invokeinterface android/database/Cursor.close:()V
        //   935: return         
        //   936: astore          10
        //   938: aload           14
        //   940: astore          9
        //   942: aload           7
        //   944: astore          8
        //   946: aload           7
        //   948: astore_1       
        //   949: aload_0        
        //   950: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   953: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   956: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   959: ldc_w           "Data loss. Failed to merge raw event. appId"
        //   962: aload           14
        //   964: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //   967: aload           10
        //   969: invokevirtual   com/google/android/gms/measurement/internal/l3.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   972: aload           14
        //   974: astore          9
        //   976: aload           7
        //   978: astore          8
        //   980: aload           7
        //   982: astore_1       
        //   983: aload           7
        //   985: invokeinterface android/database/Cursor.moveToNext:()Z
        //   990: istore          12
        //   992: iload           12
        //   994: ifne            781
        //   997: aload           7
        //   999: invokeinterface android/database/Cursor.close:()V
        //  1004: return         
        //  1005: aload           14
        //  1007: astore          9
        //  1009: aload           7
        //  1011: astore          8
        //  1013: aload           7
        //  1015: astore_1       
        //  1016: aload_0        
        //  1017: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //  1020: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //  1023: invokevirtual   com/google/android/gms/measurement/internal/n3.t:()Lcom/google/android/gms/measurement/internal/l3;
        //  1026: ldc_w           "Raw event data disappeared while in transaction. appId"
        //  1029: aload           14
        //  1031: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //  1034: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //  1037: aload           7
        //  1039: invokeinterface android/database/Cursor.close:()V
        //  1044: return         
        //  1045: astore_1       
        //  1046: aload_0        
        //  1047: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //  1050: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //  1053: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //  1056: ldc_w           "Data loss. Failed to merge raw event metadata. appId"
        //  1059: aload           14
        //  1061: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //  1064: aload_1        
        //  1065: invokevirtual   com/google/android/gms/measurement/internal/l3.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  1068: aload           8
        //  1070: invokeinterface android/database/Cursor.close:()V
        //  1075: return         
        //  1076: astore_1       
        //  1077: goto            1086
        //  1080: astore          7
        //  1082: goto            1095
        //  1085: astore_1       
        //  1086: aload           8
        //  1088: astore          6
        //  1090: goto            1189
        //  1093: astore          7
        //  1095: aload           8
        //  1097: astore          6
        //  1099: goto            1142
        //  1102: astore          6
        //  1104: aload_1        
        //  1105: astore          14
        //  1107: aload           6
        //  1109: astore_1       
        //  1110: aload           14
        //  1112: astore          6
        //  1114: goto            1189
        //  1117: astore          7
        //  1119: aload_1        
        //  1120: astore          6
        //  1122: goto            1142
        //  1125: astore_1       
        //  1126: aload           9
        //  1128: astore          6
        //  1130: goto            1189
        //  1133: astore          7
        //  1135: aconst_null    
        //  1136: astore          6
        //  1138: aload           8
        //  1140: astore          14
        //  1142: aload           6
        //  1144: astore_1       
        //  1145: aload_0        
        //  1146: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //  1149: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //  1152: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //  1155: ldc_w           "Data loss. Error selecting raw event. appId"
        //  1158: aload           14
        //  1160: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //  1163: aload           7
        //  1165: invokevirtual   com/google/android/gms/measurement/internal/l3.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //  1168: aload           6
        //  1170: ifnull          1180
        //  1173: aload           6
        //  1175: invokeinterface android/database/Cursor.close:()V
        //  1180: return         
        //  1181: astore          14
        //  1183: aload_1        
        //  1184: astore          6
        //  1186: aload           14
        //  1188: astore_1       
        //  1189: aload           6
        //  1191: ifnull          1201
        //  1194: aload           6
        //  1196: invokeinterface android/database/Cursor.close:()V
        //  1201: aload_1        
        //  1202: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  26     38     1133   1142   Landroid/database/sqlite/SQLiteException;
        //  26     38     1125   1133   Any
        //  60     83     1133   1142   Landroid/database/sqlite/SQLiteException;
        //  60     83     1125   1133   Any
        //  86     100    1133   1142   Landroid/database/sqlite/SQLiteException;
        //  86     100    1125   1133   Any
        //  109    170    1133   1142   Landroid/database/sqlite/SQLiteException;
        //  109    170    1125   1133   Any
        //  181    190    273    286    Landroid/database/sqlite/SQLiteException;
        //  181    190    1181   1189   Any
        //  214    224    273    286    Landroid/database/sqlite/SQLiteException;
        //  214    224    1181   1189   Any
        //  235    245    273    286    Landroid/database/sqlite/SQLiteException;
        //  235    245    1181   1189   Any
        //  256    263    273    286    Landroid/database/sqlite/SQLiteException;
        //  256    263    1181   1189   Any
        //  299    305    1133   1142   Landroid/database/sqlite/SQLiteException;
        //  299    305    1125   1133   Any
        //  310    319    1133   1142   Landroid/database/sqlite/SQLiteException;
        //  310    319    1125   1133   Any
        //  322    332    1133   1142   Landroid/database/sqlite/SQLiteException;
        //  322    332    1125   1133   Any
        //  341    401    1133   1142   Landroid/database/sqlite/SQLiteException;
        //  341    401    1125   1133   Any
        //  412    421    273    286    Landroid/database/sqlite/SQLiteException;
        //  412    421    1181   1189   Any
        //  445    455    273    286    Landroid/database/sqlite/SQLiteException;
        //  445    455    1181   1189   Any
        //  466    473    273    286    Landroid/database/sqlite/SQLiteException;
        //  466    473    1181   1189   Any
        //  484    529    1117   1125   Landroid/database/sqlite/SQLiteException;
        //  484    529    1102   1117   Any
        //  529    560    1093   1095   Landroid/database/sqlite/SQLiteException;
        //  529    560    1085   1086   Any
        //  568    577    1093   1095   Landroid/database/sqlite/SQLiteException;
        //  568    577    1085   1086   Any
        //  577    594    1045   1076   Ljava/io/IOException;
        //  577    594    1093   1095   Landroid/database/sqlite/SQLiteException;
        //  577    594    1085   1086   Any
        //  594    625    1093   1095   Landroid/database/sqlite/SQLiteException;
        //  594    625    1085   1086   Any
        //  625    643    1093   1095   Landroid/database/sqlite/SQLiteException;
        //  625    643    1085   1086   Any
        //  656    680    1093   1095   Landroid/database/sqlite/SQLiteException;
        //  656    680    1085   1086   Any
        //  694    709    1093   1095   Landroid/database/sqlite/SQLiteException;
        //  694    709    1085   1086   Any
        //  713    760    1080   1085   Landroid/database/sqlite/SQLiteException;
        //  713    760    1076   1080   Any
        //  771    781    273    286    Landroid/database/sqlite/SQLiteException;
        //  771    781    1181   1189   Any
        //  792    801    273    286    Landroid/database/sqlite/SQLiteException;
        //  792    801    1181   1189   Any
        //  812    822    273    286    Landroid/database/sqlite/SQLiteException;
        //  812    822    1181   1189   Any
        //  833    846    936    972    Ljava/io/IOException;
        //  833    846    273    286    Landroid/database/sqlite/SQLiteException;
        //  833    846    1181   1189   Any
        //  857    871    273    286    Landroid/database/sqlite/SQLiteException;
        //  857    871    1181   1189   Any
        //  882    896    273    286    Landroid/database/sqlite/SQLiteException;
        //  882    896    1181   1189   Any
        //  907    923    273    286    Landroid/database/sqlite/SQLiteException;
        //  907    923    1181   1189   Any
        //  949    972    273    286    Landroid/database/sqlite/SQLiteException;
        //  949    972    1181   1189   Any
        //  983    992    273    286    Landroid/database/sqlite/SQLiteException;
        //  983    992    1181   1189   Any
        //  1016   1037   273    286    Landroid/database/sqlite/SQLiteException;
        //  1016   1037   1181   1189   Any
        //  1046   1068   1080   1085   Landroid/database/sqlite/SQLiteException;
        //  1046   1068   1076   1080   Any
        //  1145   1168   1181   1189   Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0713:
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
    public final int I(final String s, final String s2) {
        x.g(s);
        x.g(s2);
        this.e();
        this.f();
        try {
            return this.Q().delete("conditional_properties", "app_id=? and name=?", new String[] { s, s2 });
        }
        catch (SQLiteException ex) {
            super.a.c().o().d("Error deleting conditional property", n3.w(s), super.a.A().p(s2), ex);
            return 0;
        }
    }
    
    @c1
    @d0
    protected final long M(final String s, String value) {
        x.g(s);
        x.g("first_open_count");
        this.e();
        this.f();
        final SQLiteDatabase q = this.Q();
        q.beginTransaction();
        final long n = 0L;
        long k;
        try {
            try {
                value = (SQLiteException)new StringBuilder(48);
                ((StringBuilder)value).append("select ");
                ((StringBuilder)value).append("first_open_count");
                ((StringBuilder)value).append(" from app2 where app_id=?");
                if ((k = this.K(((StringBuilder)value).toString(), new String[] { s }, -1L)) == -1L) {
                    final ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", s);
                    value = (SQLiteException)Integer.valueOf(0);
                    contentValues.put("first_open_count", (Integer)value);
                    contentValues.put("previous_install_count", (Integer)value);
                    if (q.insertWithOnConflict("app2", (String)null, contentValues, 5) == -1L) {
                        super.a.c().o().c("Failed to insert column (got -1). appId", n3.w(s), "first_open_count");
                        q.endTransaction();
                        return -1L;
                    }
                    k = 0L;
                }
                try {
                    value = (SQLiteException)new ContentValues();
                    ((ContentValues)value).put("app_id", s);
                    ((ContentValues)value).put("first_open_count", Long.valueOf(1L + k));
                    if (q.update("app2", (ContentValues)value, "app_id = ?", new String[] { s }) == 0L) {
                        super.a.c().o().c("Failed to update column (got 0). appId", n3.w(s), "first_open_count");
                        q.endTransaction();
                        return -1L;
                    }
                    q.setTransactionSuccessful();
                    q.endTransaction();
                    return k;
                }
                catch (SQLiteException value) {}
            }
            finally {}
        }
        catch (SQLiteException value) {
            k = n;
        }
        super.a.c().o().d("Error inserting column. appId", n3.w(s), "first_open_count", value);
        q.endTransaction();
        return k;
        q.endTransaction();
    }
    
    @c1
    public final long N() {
        return this.K("select max(bundle_end_timestamp) from queue", null, 0L);
    }
    
    @c1
    public final long O() {
        return this.K("select max(timestamp) from raw_events", null, 0L);
    }
    
    public final long P(final String s) {
        x.g(s);
        return this.K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[] { s }, 0L);
    }
    
    @c1
    @d0
    final SQLiteDatabase Q() {
        this.e();
        try {
            return this.d.getWritableDatabase();
        }
        catch (SQLiteException ex) {
            super.a.c().t().b("Error opening database", ex);
            throw ex;
        }
    }
    
    public final Bundle R(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/google/android/gms/measurement/internal/t5.e:()V
        //     4: aload_0        
        //     5: invokevirtual   com/google/android/gms/measurement/internal/p9.f:()V
        //     8: aconst_null    
        //     9: astore_2       
        //    10: aload_0        
        //    11: invokevirtual   com/google/android/gms/measurement/internal/k.Q:()Landroid/database/sqlite/SQLiteDatabase;
        //    14: ldc_w           "select parameters from default_event_params where app_id=?"
        //    17: iconst_1       
        //    18: anewarray       Ljava/lang/String;
        //    21: dup            
        //    22: iconst_0       
        //    23: aload_1        
        //    24: aastore        
        //    25: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //    28: astore_3       
        //    29: aload_3        
        //    30: astore_2       
        //    31: aload_3        
        //    32: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    37: ifne            66
        //    40: aload_3        
        //    41: astore_2       
        //    42: aload_0        
        //    43: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //    46: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //    49: invokevirtual   com/google/android/gms/measurement/internal/n3.s:()Lcom/google/android/gms/measurement/internal/l3;
        //    52: ldc_w           "Default event parameters not found"
        //    55: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //    58: aload_3        
        //    59: invokeinterface android/database/Cursor.close:()V
        //    64: aconst_null    
        //    65: areturn        
        //    66: aload_3        
        //    67: astore_2       
        //    68: aload_3        
        //    69: iconst_0       
        //    70: invokeinterface android/database/Cursor.getBlob:(I)[B
        //    75: astore          4
        //    77: aload_3        
        //    78: astore_2       
        //    79: invokestatic    com/google/android/gms/internal/measurement/u4.A:()Lcom/google/android/gms/internal/measurement/t4;
        //    82: aload           4
        //    84: invokestatic    com/google/android/gms/measurement/internal/ba.A:(Lcom/google/android/gms/internal/measurement/ra;[B)Lcom/google/android/gms/internal/measurement/ra;
        //    87: checkcast       Lcom/google/android/gms/internal/measurement/t4;
        //    90: invokevirtual   com/google/android/gms/internal/measurement/f9.n:()Lcom/google/android/gms/internal/measurement/j9;
        //    93: checkcast       Lcom/google/android/gms/internal/measurement/u4;
        //    96: astore          4
        //    98: aload_3        
        //    99: astore_2       
        //   100: aload_0        
        //   101: getfield        com/google/android/gms/measurement/internal/o9.b:Lcom/google/android/gms/measurement/internal/z9;
        //   104: invokevirtual   com/google/android/gms/measurement/internal/z9.f0:()Lcom/google/android/gms/measurement/internal/ba;
        //   107: pop            
        //   108: aload_3        
        //   109: astore_2       
        //   110: aload           4
        //   112: invokevirtual   com/google/android/gms/internal/measurement/u4.E:()Ljava/util/List;
        //   115: astore          4
        //   117: aload_3        
        //   118: astore_2       
        //   119: new             Landroid/os/Bundle;
        //   122: astore_1       
        //   123: aload_3        
        //   124: astore_2       
        //   125: aload_1        
        //   126: invokespecial   android/os/Bundle.<init>:()V
        //   129: aload_3        
        //   130: astore_2       
        //   131: aload           4
        //   133: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   138: astore          5
        //   140: aload_3        
        //   141: astore_2       
        //   142: aload           5
        //   144: invokeinterface java/util/Iterator.hasNext:()Z
        //   149: ifeq            279
        //   152: aload_3        
        //   153: astore_2       
        //   154: aload           5
        //   156: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   161: checkcast       Lcom/google/android/gms/internal/measurement/y4;
        //   164: astore          6
        //   166: aload_3        
        //   167: astore_2       
        //   168: aload           6
        //   170: invokevirtual   com/google/android/gms/internal/measurement/y4.C:()Ljava/lang/String;
        //   173: astore          4
        //   175: aload_3        
        //   176: astore_2       
        //   177: aload           6
        //   179: invokevirtual   com/google/android/gms/internal/measurement/y4.P:()Z
        //   182: ifeq            201
        //   185: aload_3        
        //   186: astore_2       
        //   187: aload_1        
        //   188: aload           4
        //   190: aload           6
        //   192: invokevirtual   com/google/android/gms/internal/measurement/y4.v:()D
        //   195: invokevirtual   android/os/Bundle.putDouble:(Ljava/lang/String;D)V
        //   198: goto            140
        //   201: aload_3        
        //   202: astore_2       
        //   203: aload           6
        //   205: invokevirtual   com/google/android/gms/internal/measurement/y4.Q:()Z
        //   208: ifeq            227
        //   211: aload_3        
        //   212: astore_2       
        //   213: aload_1        
        //   214: aload           4
        //   216: aload           6
        //   218: invokevirtual   com/google/android/gms/internal/measurement/y4.w:()F
        //   221: invokevirtual   android/os/Bundle.putFloat:(Ljava/lang/String;F)V
        //   224: goto            140
        //   227: aload_3        
        //   228: astore_2       
        //   229: aload           6
        //   231: invokevirtual   com/google/android/gms/internal/measurement/y4.T:()Z
        //   234: ifeq            253
        //   237: aload_3        
        //   238: astore_2       
        //   239: aload_1        
        //   240: aload           4
        //   242: aload           6
        //   244: invokevirtual   com/google/android/gms/internal/measurement/y4.D:()Ljava/lang/String;
        //   247: invokevirtual   android/os/Bundle.putString:(Ljava/lang/String;Ljava/lang/String;)V
        //   250: goto            140
        //   253: aload_3        
        //   254: astore_2       
        //   255: aload           6
        //   257: invokevirtual   com/google/android/gms/internal/measurement/y4.R:()Z
        //   260: ifeq            140
        //   263: aload_3        
        //   264: astore_2       
        //   265: aload_1        
        //   266: aload           4
        //   268: aload           6
        //   270: invokevirtual   com/google/android/gms/internal/measurement/y4.z:()J
        //   273: invokevirtual   android/os/Bundle.putLong:(Ljava/lang/String;J)V
        //   276: goto            140
        //   279: aload_3        
        //   280: invokeinterface android/database/Cursor.close:()V
        //   285: aload_1        
        //   286: areturn        
        //   287: astore          4
        //   289: aload_3        
        //   290: astore_2       
        //   291: aload_0        
        //   292: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   295: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   298: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   301: ldc_w           "Failed to retrieve default event parameters. appId"
        //   304: aload_1        
        //   305: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //   308: aload           4
        //   310: invokevirtual   com/google/android/gms/measurement/internal/l3.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   313: aload_3        
        //   314: invokeinterface android/database/Cursor.close:()V
        //   319: aconst_null    
        //   320: areturn        
        //   321: astore_2       
        //   322: aload_3        
        //   323: astore_1       
        //   324: aload_2        
        //   325: astore_3       
        //   326: goto            336
        //   329: astore_1       
        //   330: goto            368
        //   333: astore_3       
        //   334: aconst_null    
        //   335: astore_1       
        //   336: aload_1        
        //   337: astore_2       
        //   338: aload_0        
        //   339: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   342: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   345: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   348: ldc_w           "Error selecting default event parameters"
        //   351: aload_3        
        //   352: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   355: aload_1        
        //   356: ifnull          365
        //   359: aload_1        
        //   360: invokeinterface android/database/Cursor.close:()V
        //   365: aconst_null    
        //   366: areturn        
        //   367: astore_1       
        //   368: aload_2        
        //   369: ifnull          378
        //   372: aload_2        
        //   373: invokeinterface android/database/Cursor.close:()V
        //   378: aload_1        
        //   379: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  10     29     333    336    Landroid/database/sqlite/SQLiteException;
        //  10     29     329    333    Any
        //  31     40     321    329    Landroid/database/sqlite/SQLiteException;
        //  31     40     367    368    Any
        //  42     58     321    329    Landroid/database/sqlite/SQLiteException;
        //  42     58     367    368    Any
        //  68     77     321    329    Landroid/database/sqlite/SQLiteException;
        //  68     77     367    368    Any
        //  79     98     287    321    Ljava/io/IOException;
        //  79     98     321    329    Landroid/database/sqlite/SQLiteException;
        //  79     98     367    368    Any
        //  100    108    321    329    Landroid/database/sqlite/SQLiteException;
        //  100    108    367    368    Any
        //  110    117    321    329    Landroid/database/sqlite/SQLiteException;
        //  110    117    367    368    Any
        //  119    123    321    329    Landroid/database/sqlite/SQLiteException;
        //  119    123    367    368    Any
        //  125    129    321    329    Landroid/database/sqlite/SQLiteException;
        //  125    129    367    368    Any
        //  131    140    321    329    Landroid/database/sqlite/SQLiteException;
        //  131    140    367    368    Any
        //  142    152    321    329    Landroid/database/sqlite/SQLiteException;
        //  142    152    367    368    Any
        //  154    166    321    329    Landroid/database/sqlite/SQLiteException;
        //  154    166    367    368    Any
        //  168    175    321    329    Landroid/database/sqlite/SQLiteException;
        //  168    175    367    368    Any
        //  177    185    321    329    Landroid/database/sqlite/SQLiteException;
        //  177    185    367    368    Any
        //  187    198    321    329    Landroid/database/sqlite/SQLiteException;
        //  187    198    367    368    Any
        //  203    211    321    329    Landroid/database/sqlite/SQLiteException;
        //  203    211    367    368    Any
        //  213    224    321    329    Landroid/database/sqlite/SQLiteException;
        //  213    224    367    368    Any
        //  229    237    321    329    Landroid/database/sqlite/SQLiteException;
        //  229    237    367    368    Any
        //  239    250    321    329    Landroid/database/sqlite/SQLiteException;
        //  239    250    367    368    Any
        //  255    263    321    329    Landroid/database/sqlite/SQLiteException;
        //  255    263    367    368    Any
        //  265    276    321    329    Landroid/database/sqlite/SQLiteException;
        //  265    276    367    368    Any
        //  291    313    321    329    Landroid/database/sqlite/SQLiteException;
        //  291    313    367    368    Any
        //  338    355    367    368    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0066:
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
    public final h5 S(final String p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    com/google/android/gms/common/internal/x.g:(Ljava/lang/String;)Ljava/lang/String;
        //     4: pop            
        //     5: aload_0        
        //     6: invokevirtual   com/google/android/gms/measurement/internal/t5.e:()V
        //     9: aload_0        
        //    10: invokevirtual   com/google/android/gms/measurement/internal/p9.f:()V
        //    13: aconst_null    
        //    14: astore_2       
        //    15: aload_0        
        //    16: invokevirtual   com/google/android/gms/measurement/internal/k.Q:()Landroid/database/sqlite/SQLiteDatabase;
        //    19: astore_3       
        //    20: iconst_1       
        //    21: istore          4
        //    23: aload_3        
        //    24: ldc_w           "apps"
        //    27: bipush          28
        //    29: anewarray       Ljava/lang/String;
        //    32: dup            
        //    33: iconst_0       
        //    34: ldc_w           "app_instance_id"
        //    37: aastore        
        //    38: dup            
        //    39: iconst_1       
        //    40: ldc_w           "gmp_app_id"
        //    43: aastore        
        //    44: dup            
        //    45: iconst_2       
        //    46: ldc_w           "resettable_device_id_hash"
        //    49: aastore        
        //    50: dup            
        //    51: iconst_3       
        //    52: ldc_w           "last_bundle_index"
        //    55: aastore        
        //    56: dup            
        //    57: iconst_4       
        //    58: ldc             "last_bundle_start_timestamp"
        //    60: aastore        
        //    61: dup            
        //    62: iconst_5       
        //    63: ldc_w           "last_bundle_end_timestamp"
        //    66: aastore        
        //    67: dup            
        //    68: bipush          6
        //    70: ldc             "app_version"
        //    72: aastore        
        //    73: dup            
        //    74: bipush          7
        //    76: ldc             "app_store"
        //    78: aastore        
        //    79: dup            
        //    80: bipush          8
        //    82: ldc             "gmp_version"
        //    84: aastore        
        //    85: dup            
        //    86: bipush          9
        //    88: ldc             "dev_cert_hash"
        //    90: aastore        
        //    91: dup            
        //    92: bipush          10
        //    94: ldc             "measurement_enabled"
        //    96: aastore        
        //    97: dup            
        //    98: bipush          11
        //   100: ldc             "day"
        //   102: aastore        
        //   103: dup            
        //   104: bipush          12
        //   106: ldc             "daily_public_events_count"
        //   108: aastore        
        //   109: dup            
        //   110: bipush          13
        //   112: ldc             "daily_events_count"
        //   114: aastore        
        //   115: dup            
        //   116: bipush          14
        //   118: ldc             "daily_conversions_count"
        //   120: aastore        
        //   121: dup            
        //   122: bipush          15
        //   124: ldc             "config_fetched_time"
        //   126: aastore        
        //   127: dup            
        //   128: bipush          16
        //   130: ldc             "failed_config_fetch_time"
        //   132: aastore        
        //   133: dup            
        //   134: bipush          17
        //   136: ldc             "app_version_int"
        //   138: aastore        
        //   139: dup            
        //   140: bipush          18
        //   142: ldc             "firebase_instance_id"
        //   144: aastore        
        //   145: dup            
        //   146: bipush          19
        //   148: ldc             "daily_error_events_count"
        //   150: aastore        
        //   151: dup            
        //   152: bipush          20
        //   154: ldc             "daily_realtime_events_count"
        //   156: aastore        
        //   157: dup            
        //   158: bipush          21
        //   160: ldc             "health_monitor_sample"
        //   162: aastore        
        //   163: dup            
        //   164: bipush          22
        //   166: ldc             "android_id"
        //   168: aastore        
        //   169: dup            
        //   170: bipush          23
        //   172: ldc             "adid_reporting_enabled"
        //   174: aastore        
        //   175: dup            
        //   176: bipush          24
        //   178: ldc             "admob_app_id"
        //   180: aastore        
        //   181: dup            
        //   182: bipush          25
        //   184: ldc             "dynamite_version"
        //   186: aastore        
        //   187: dup            
        //   188: bipush          26
        //   190: ldc             "safelisted_events"
        //   192: aastore        
        //   193: dup            
        //   194: bipush          27
        //   196: ldc             "ga_app_id"
        //   198: aastore        
        //   199: ldc_w           "app_id=?"
        //   202: iconst_1       
        //   203: anewarray       Ljava/lang/String;
        //   206: dup            
        //   207: iconst_0       
        //   208: aload_1        
        //   209: aastore        
        //   210: aconst_null    
        //   211: aconst_null    
        //   212: aconst_null    
        //   213: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   216: astore_3       
        //   217: aload_3        
        //   218: astore_2       
        //   219: aload_3        
        //   220: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   225: istore          5
        //   227: iload           5
        //   229: ifne            240
        //   232: aload_3        
        //   233: invokeinterface android/database/Cursor.close:()V
        //   238: aconst_null    
        //   239: areturn        
        //   240: aload_3        
        //   241: astore_2       
        //   242: new             Lcom/google/android/gms/measurement/internal/h5;
        //   245: astore          6
        //   247: aload_3        
        //   248: astore_2       
        //   249: aload           6
        //   251: aload_0        
        //   252: getfield        com/google/android/gms/measurement/internal/o9.b:Lcom/google/android/gms/measurement/internal/z9;
        //   255: invokevirtual   com/google/android/gms/measurement/internal/z9.b0:()Lcom/google/android/gms/measurement/internal/z4;
        //   258: aload_1        
        //   259: invokespecial   com/google/android/gms/measurement/internal/h5.<init>:(Lcom/google/android/gms/measurement/internal/z4;Ljava/lang/String;)V
        //   262: aload_3        
        //   263: astore_2       
        //   264: aload           6
        //   266: aload_3        
        //   267: iconst_0       
        //   268: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   273: invokevirtual   com/google/android/gms/measurement/internal/h5.i:(Ljava/lang/String;)V
        //   276: aload_3        
        //   277: astore_2       
        //   278: aload           6
        //   280: aload_3        
        //   281: iconst_1       
        //   282: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   287: invokevirtual   com/google/android/gms/measurement/internal/h5.y:(Ljava/lang/String;)V
        //   290: aload_3        
        //   291: astore_2       
        //   292: aload           6
        //   294: aload_3        
        //   295: iconst_2       
        //   296: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   301: invokevirtual   com/google/android/gms/measurement/internal/h5.H:(Ljava/lang/String;)V
        //   304: aload_3        
        //   305: astore_2       
        //   306: aload           6
        //   308: aload_3        
        //   309: iconst_3       
        //   310: invokeinterface android/database/Cursor.getLong:(I)J
        //   315: invokevirtual   com/google/android/gms/measurement/internal/h5.D:(J)V
        //   318: aload_3        
        //   319: astore_2       
        //   320: aload           6
        //   322: aload_3        
        //   323: iconst_4       
        //   324: invokeinterface android/database/Cursor.getLong:(I)J
        //   329: invokevirtual   com/google/android/gms/measurement/internal/h5.E:(J)V
        //   332: aload_3        
        //   333: astore_2       
        //   334: aload           6
        //   336: aload_3        
        //   337: iconst_5       
        //   338: invokeinterface android/database/Cursor.getLong:(I)J
        //   343: invokevirtual   com/google/android/gms/measurement/internal/h5.C:(J)V
        //   346: aload_3        
        //   347: astore_2       
        //   348: aload           6
        //   350: aload_3        
        //   351: bipush          6
        //   353: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   358: invokevirtual   com/google/android/gms/measurement/internal/h5.k:(Ljava/lang/String;)V
        //   361: aload_3        
        //   362: astore_2       
        //   363: aload           6
        //   365: aload_3        
        //   366: bipush          7
        //   368: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   373: invokevirtual   com/google/android/gms/measurement/internal/h5.j:(Ljava/lang/String;)V
        //   376: aload_3        
        //   377: astore_2       
        //   378: aload           6
        //   380: aload_3        
        //   381: bipush          8
        //   383: invokeinterface android/database/Cursor.getLong:(I)J
        //   388: invokevirtual   com/google/android/gms/measurement/internal/h5.z:(J)V
        //   391: aload_3        
        //   392: astore_2       
        //   393: aload           6
        //   395: aload_3        
        //   396: bipush          9
        //   398: invokeinterface android/database/Cursor.getLong:(I)J
        //   403: invokevirtual   com/google/android/gms/measurement/internal/h5.t:(J)V
        //   406: aload_3        
        //   407: astore_2       
        //   408: aload_3        
        //   409: bipush          10
        //   411: invokeinterface android/database/Cursor.isNull:(I)Z
        //   416: ifne            441
        //   419: aload_3        
        //   420: astore_2       
        //   421: aload_3        
        //   422: bipush          10
        //   424: invokeinterface android/database/Cursor.getInt:(I)I
        //   429: ifeq            435
        //   432: goto            441
        //   435: iconst_0       
        //   436: istore          5
        //   438: goto            444
        //   441: iconst_1       
        //   442: istore          5
        //   444: aload_3        
        //   445: astore_2       
        //   446: aload           6
        //   448: iload           5
        //   450: invokevirtual   com/google/android/gms/measurement/internal/h5.F:(Z)V
        //   453: aload_3        
        //   454: astore_2       
        //   455: aload           6
        //   457: aload_3        
        //   458: bipush          11
        //   460: invokeinterface android/database/Cursor.getLong:(I)J
        //   465: invokevirtual   com/google/android/gms/measurement/internal/h5.s:(J)V
        //   468: aload_3        
        //   469: astore_2       
        //   470: aload           6
        //   472: aload_3        
        //   473: bipush          12
        //   475: invokeinterface android/database/Cursor.getLong:(I)J
        //   480: invokevirtual   com/google/android/gms/measurement/internal/h5.q:(J)V
        //   483: aload_3        
        //   484: astore_2       
        //   485: aload           6
        //   487: aload_3        
        //   488: bipush          13
        //   490: invokeinterface android/database/Cursor.getLong:(I)J
        //   495: invokevirtual   com/google/android/gms/measurement/internal/h5.p:(J)V
        //   498: aload_3        
        //   499: astore_2       
        //   500: aload           6
        //   502: aload_3        
        //   503: bipush          14
        //   505: invokeinterface android/database/Cursor.getLong:(I)J
        //   510: invokevirtual   com/google/android/gms/measurement/internal/h5.n:(J)V
        //   513: aload_3        
        //   514: astore_2       
        //   515: aload           6
        //   517: aload_3        
        //   518: bipush          15
        //   520: invokeinterface android/database/Cursor.getLong:(I)J
        //   525: invokevirtual   com/google/android/gms/measurement/internal/h5.m:(J)V
        //   528: aload_3        
        //   529: astore_2       
        //   530: aload           6
        //   532: aload_3        
        //   533: bipush          16
        //   535: invokeinterface android/database/Cursor.getLong:(I)J
        //   540: invokevirtual   com/google/android/gms/measurement/internal/h5.v:(J)V
        //   543: aload_3        
        //   544: astore_2       
        //   545: aload_3        
        //   546: bipush          17
        //   548: invokeinterface android/database/Cursor.isNull:(I)Z
        //   553: ifeq            564
        //   556: ldc2_w          -2147483648
        //   559: lstore          7
        //   561: goto            577
        //   564: aload_3        
        //   565: astore_2       
        //   566: aload_3        
        //   567: bipush          17
        //   569: invokeinterface android/database/Cursor.getInt:(I)I
        //   574: i2l            
        //   575: lstore          7
        //   577: aload_3        
        //   578: astore_2       
        //   579: aload           6
        //   581: lload           7
        //   583: invokevirtual   com/google/android/gms/measurement/internal/h5.l:(J)V
        //   586: aload_3        
        //   587: astore_2       
        //   588: aload           6
        //   590: aload_3        
        //   591: bipush          18
        //   593: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   598: invokevirtual   com/google/android/gms/measurement/internal/h5.w:(Ljava/lang/String;)V
        //   601: aload_3        
        //   602: astore_2       
        //   603: aload           6
        //   605: aload_3        
        //   606: bipush          19
        //   608: invokeinterface android/database/Cursor.getLong:(I)J
        //   613: invokevirtual   com/google/android/gms/measurement/internal/h5.o:(J)V
        //   616: aload_3        
        //   617: astore_2       
        //   618: aload           6
        //   620: aload_3        
        //   621: bipush          20
        //   623: invokeinterface android/database/Cursor.getLong:(I)J
        //   628: invokevirtual   com/google/android/gms/measurement/internal/h5.r:(J)V
        //   631: aload_3        
        //   632: astore_2       
        //   633: aload           6
        //   635: aload_3        
        //   636: bipush          21
        //   638: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   643: invokevirtual   com/google/android/gms/measurement/internal/h5.B:(Ljava/lang/String;)V
        //   646: aload_3        
        //   647: astore_2       
        //   648: aload_0        
        //   649: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   652: invokevirtual   com/google/android/gms/measurement/internal/z4.w:()Lcom/google/android/gms/measurement/internal/g;
        //   655: aconst_null    
        //   656: getstatic       com/google/android/gms/measurement/internal/a3.p0:Lcom/google/android/gms/measurement/internal/z2;
        //   659: invokevirtual   com/google/android/gms/measurement/internal/g.y:(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/z2;)Z
        //   662: istore          5
        //   664: lconst_0       
        //   665: lstore          9
        //   667: iload           5
        //   669: ifne            712
        //   672: aload_3        
        //   673: astore_2       
        //   674: aload_3        
        //   675: bipush          22
        //   677: invokeinterface android/database/Cursor.isNull:(I)Z
        //   682: ifeq            691
        //   685: lconst_0       
        //   686: lstore          7
        //   688: goto            703
        //   691: aload_3        
        //   692: astore_2       
        //   693: aload_3        
        //   694: bipush          22
        //   696: invokeinterface android/database/Cursor.getLong:(I)J
        //   701: lstore          7
        //   703: aload_3        
        //   704: astore_2       
        //   705: aload           6
        //   707: lload           7
        //   709: invokevirtual   com/google/android/gms/measurement/internal/h5.h:(J)V
        //   712: iload           4
        //   714: istore          5
        //   716: aload_3        
        //   717: astore_2       
        //   718: aload_3        
        //   719: bipush          23
        //   721: invokeinterface android/database/Cursor.isNull:(I)Z
        //   726: ifne            752
        //   729: aload_3        
        //   730: astore_2       
        //   731: aload_3        
        //   732: bipush          23
        //   734: invokeinterface android/database/Cursor.getInt:(I)I
        //   739: ifeq            749
        //   742: iload           4
        //   744: istore          5
        //   746: goto            752
        //   749: iconst_0       
        //   750: istore          5
        //   752: aload_3        
        //   753: astore_2       
        //   754: aload           6
        //   756: iload           5
        //   758: invokevirtual   com/google/android/gms/measurement/internal/h5.g:(Z)V
        //   761: aload_3        
        //   762: astore_2       
        //   763: aload           6
        //   765: aload_3        
        //   766: bipush          24
        //   768: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   773: invokevirtual   com/google/android/gms/measurement/internal/h5.f:(Ljava/lang/String;)V
        //   776: aload_3        
        //   777: astore_2       
        //   778: aload_3        
        //   779: bipush          25
        //   781: invokeinterface android/database/Cursor.isNull:(I)Z
        //   786: ifeq            796
        //   789: lload           9
        //   791: lstore          7
        //   793: goto            808
        //   796: aload_3        
        //   797: astore_2       
        //   798: aload_3        
        //   799: bipush          25
        //   801: invokeinterface android/database/Cursor.getLong:(I)J
        //   806: lstore          7
        //   808: aload_3        
        //   809: astore_2       
        //   810: aload           6
        //   812: lload           7
        //   814: invokevirtual   com/google/android/gms/measurement/internal/h5.u:(J)V
        //   817: aload_3        
        //   818: astore_2       
        //   819: aload_3        
        //   820: bipush          26
        //   822: invokeinterface android/database/Cursor.isNull:(I)Z
        //   827: ifne            855
        //   830: aload_3        
        //   831: astore_2       
        //   832: aload           6
        //   834: aload_3        
        //   835: bipush          26
        //   837: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   842: ldc_w           ","
        //   845: iconst_m1      
        //   846: invokevirtual   java/lang/String.split:(Ljava/lang/String;I)[Ljava/lang/String;
        //   849: invokestatic    java/util/Arrays.asList:([Ljava/lang/Object;)Ljava/util/List;
        //   852: invokevirtual   com/google/android/gms/measurement/internal/h5.I:(Ljava/util/List;)V
        //   855: aload_3        
        //   856: astore_2       
        //   857: invokestatic    com/google/android/gms/internal/measurement/fe.b:()Z
        //   860: pop            
        //   861: aload_3        
        //   862: astore_2       
        //   863: aload_0        
        //   864: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   867: invokevirtual   com/google/android/gms/measurement/internal/z4.w:()Lcom/google/android/gms/measurement/internal/g;
        //   870: aload_1        
        //   871: getstatic       com/google/android/gms/measurement/internal/a3.f0:Lcom/google/android/gms/measurement/internal/z2;
        //   874: invokevirtual   com/google/android/gms/measurement/internal/g.y:(Ljava/lang/String;Lcom/google/android/gms/measurement/internal/z2;)Z
        //   877: ifeq            895
        //   880: aload_3        
        //   881: astore_2       
        //   882: aload           6
        //   884: aload_3        
        //   885: bipush          27
        //   887: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   892: invokevirtual   com/google/android/gms/measurement/internal/h5.x:(Ljava/lang/String;)V
        //   895: aload_3        
        //   896: astore_2       
        //   897: aload           6
        //   899: invokevirtual   com/google/android/gms/measurement/internal/h5.d:()V
        //   902: aload_3        
        //   903: astore_2       
        //   904: aload_3        
        //   905: invokeinterface android/database/Cursor.moveToNext:()Z
        //   910: ifeq            935
        //   913: aload_3        
        //   914: astore_2       
        //   915: aload_0        
        //   916: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   919: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   922: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   925: ldc_w           "Got multiple records for app, expected one. appId"
        //   928: aload_1        
        //   929: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //   932: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   935: aload_3        
        //   936: invokeinterface android/database/Cursor.close:()V
        //   941: aload           6
        //   943: areturn        
        //   944: astore          6
        //   946: goto            957
        //   949: astore_1       
        //   950: goto            994
        //   953: astore          6
        //   955: aconst_null    
        //   956: astore_3       
        //   957: aload_3        
        //   958: astore_2       
        //   959: aload_0        
        //   960: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   963: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   966: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   969: ldc_w           "Error querying app. appId"
        //   972: aload_1        
        //   973: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //   976: aload           6
        //   978: invokevirtual   com/google/android/gms/measurement/internal/l3.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   981: aload_3        
        //   982: ifnull          991
        //   985: aload_3        
        //   986: invokeinterface android/database/Cursor.close:()V
        //   991: aconst_null    
        //   992: areturn        
        //   993: astore_1       
        //   994: aload_2        
        //   995: ifnull          1004
        //   998: aload_2        
        //   999: invokeinterface android/database/Cursor.close:()V
        //  1004: aload_1        
        //  1005: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  15     20     953    957    Landroid/database/sqlite/SQLiteException;
        //  15     20     949    953    Any
        //  23     217    953    957    Landroid/database/sqlite/SQLiteException;
        //  23     217    949    953    Any
        //  219    227    944    949    Landroid/database/sqlite/SQLiteException;
        //  219    227    993    994    Any
        //  242    247    944    949    Landroid/database/sqlite/SQLiteException;
        //  242    247    993    994    Any
        //  249    262    944    949    Landroid/database/sqlite/SQLiteException;
        //  249    262    993    994    Any
        //  264    276    944    949    Landroid/database/sqlite/SQLiteException;
        //  264    276    993    994    Any
        //  278    290    944    949    Landroid/database/sqlite/SQLiteException;
        //  278    290    993    994    Any
        //  292    304    944    949    Landroid/database/sqlite/SQLiteException;
        //  292    304    993    994    Any
        //  306    318    944    949    Landroid/database/sqlite/SQLiteException;
        //  306    318    993    994    Any
        //  320    332    944    949    Landroid/database/sqlite/SQLiteException;
        //  320    332    993    994    Any
        //  334    346    944    949    Landroid/database/sqlite/SQLiteException;
        //  334    346    993    994    Any
        //  348    361    944    949    Landroid/database/sqlite/SQLiteException;
        //  348    361    993    994    Any
        //  363    376    944    949    Landroid/database/sqlite/SQLiteException;
        //  363    376    993    994    Any
        //  378    391    944    949    Landroid/database/sqlite/SQLiteException;
        //  378    391    993    994    Any
        //  393    406    944    949    Landroid/database/sqlite/SQLiteException;
        //  393    406    993    994    Any
        //  408    419    944    949    Landroid/database/sqlite/SQLiteException;
        //  408    419    993    994    Any
        //  421    432    944    949    Landroid/database/sqlite/SQLiteException;
        //  421    432    993    994    Any
        //  446    453    944    949    Landroid/database/sqlite/SQLiteException;
        //  446    453    993    994    Any
        //  455    468    944    949    Landroid/database/sqlite/SQLiteException;
        //  455    468    993    994    Any
        //  470    483    944    949    Landroid/database/sqlite/SQLiteException;
        //  470    483    993    994    Any
        //  485    498    944    949    Landroid/database/sqlite/SQLiteException;
        //  485    498    993    994    Any
        //  500    513    944    949    Landroid/database/sqlite/SQLiteException;
        //  500    513    993    994    Any
        //  515    528    944    949    Landroid/database/sqlite/SQLiteException;
        //  515    528    993    994    Any
        //  530    543    944    949    Landroid/database/sqlite/SQLiteException;
        //  530    543    993    994    Any
        //  545    556    944    949    Landroid/database/sqlite/SQLiteException;
        //  545    556    993    994    Any
        //  566    577    944    949    Landroid/database/sqlite/SQLiteException;
        //  566    577    993    994    Any
        //  579    586    944    949    Landroid/database/sqlite/SQLiteException;
        //  579    586    993    994    Any
        //  588    601    944    949    Landroid/database/sqlite/SQLiteException;
        //  588    601    993    994    Any
        //  603    616    944    949    Landroid/database/sqlite/SQLiteException;
        //  603    616    993    994    Any
        //  618    631    944    949    Landroid/database/sqlite/SQLiteException;
        //  618    631    993    994    Any
        //  633    646    944    949    Landroid/database/sqlite/SQLiteException;
        //  633    646    993    994    Any
        //  648    664    944    949    Landroid/database/sqlite/SQLiteException;
        //  648    664    993    994    Any
        //  674    685    944    949    Landroid/database/sqlite/SQLiteException;
        //  674    685    993    994    Any
        //  693    703    944    949    Landroid/database/sqlite/SQLiteException;
        //  693    703    993    994    Any
        //  705    712    944    949    Landroid/database/sqlite/SQLiteException;
        //  705    712    993    994    Any
        //  718    729    944    949    Landroid/database/sqlite/SQLiteException;
        //  718    729    993    994    Any
        //  731    742    944    949    Landroid/database/sqlite/SQLiteException;
        //  731    742    993    994    Any
        //  754    761    944    949    Landroid/database/sqlite/SQLiteException;
        //  754    761    993    994    Any
        //  763    776    944    949    Landroid/database/sqlite/SQLiteException;
        //  763    776    993    994    Any
        //  778    789    944    949    Landroid/database/sqlite/SQLiteException;
        //  778    789    993    994    Any
        //  798    808    944    949    Landroid/database/sqlite/SQLiteException;
        //  798    808    993    994    Any
        //  810    817    944    949    Landroid/database/sqlite/SQLiteException;
        //  810    817    993    994    Any
        //  819    830    944    949    Landroid/database/sqlite/SQLiteException;
        //  819    830    993    994    Any
        //  832    855    944    949    Landroid/database/sqlite/SQLiteException;
        //  832    855    993    994    Any
        //  857    861    944    949    Landroid/database/sqlite/SQLiteException;
        //  857    861    993    994    Any
        //  863    880    944    949    Landroid/database/sqlite/SQLiteException;
        //  863    880    993    994    Any
        //  882    895    944    949    Landroid/database/sqlite/SQLiteException;
        //  882    895    993    994    Any
        //  897    902    944    949    Landroid/database/sqlite/SQLiteException;
        //  897    902    993    994    Any
        //  904    913    944    949    Landroid/database/sqlite/SQLiteException;
        //  904    913    993    994    Any
        //  915    935    944    949    Landroid/database/sqlite/SQLiteException;
        //  915    935    993    994    Any
        //  959    981    993    994    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0240:
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
    public final c T(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    com/google/android/gms/common/internal/x.g:(Ljava/lang/String;)Ljava/lang/String;
        //     4: pop            
        //     5: aload_2        
        //     6: invokestatic    com/google/android/gms/common/internal/x.g:(Ljava/lang/String;)Ljava/lang/String;
        //     9: pop            
        //    10: aload_0        
        //    11: invokevirtual   com/google/android/gms/measurement/internal/t5.e:()V
        //    14: aload_0        
        //    15: invokevirtual   com/google/android/gms/measurement/internal/p9.f:()V
        //    18: aconst_null    
        //    19: astore_3       
        //    20: aload_0        
        //    21: invokevirtual   com/google/android/gms/measurement/internal/k.Q:()Landroid/database/sqlite/SQLiteDatabase;
        //    24: ldc_w           "conditional_properties"
        //    27: bipush          11
        //    29: anewarray       Ljava/lang/String;
        //    32: dup            
        //    33: iconst_0       
        //    34: ldc             "origin"
        //    36: aastore        
        //    37: dup            
        //    38: iconst_1       
        //    39: ldc             "value"
        //    41: aastore        
        //    42: dup            
        //    43: iconst_2       
        //    44: ldc_w           "active"
        //    47: aastore        
        //    48: dup            
        //    49: iconst_3       
        //    50: ldc_w           "trigger_event_name"
        //    53: aastore        
        //    54: dup            
        //    55: iconst_4       
        //    56: ldc_w           "trigger_timeout"
        //    59: aastore        
        //    60: dup            
        //    61: iconst_5       
        //    62: ldc_w           "timed_out_event"
        //    65: aastore        
        //    66: dup            
        //    67: bipush          6
        //    69: ldc_w           "creation_timestamp"
        //    72: aastore        
        //    73: dup            
        //    74: bipush          7
        //    76: ldc_w           "triggered_event"
        //    79: aastore        
        //    80: dup            
        //    81: bipush          8
        //    83: ldc_w           "triggered_timestamp"
        //    86: aastore        
        //    87: dup            
        //    88: bipush          9
        //    90: ldc_w           "time_to_live"
        //    93: aastore        
        //    94: dup            
        //    95: bipush          10
        //    97: ldc_w           "expired_event"
        //   100: aastore        
        //   101: ldc_w           "app_id=? and name=?"
        //   104: iconst_2       
        //   105: anewarray       Ljava/lang/String;
        //   108: dup            
        //   109: iconst_0       
        //   110: aload_1        
        //   111: aastore        
        //   112: dup            
        //   113: iconst_1       
        //   114: aload_2        
        //   115: aastore        
        //   116: aconst_null    
        //   117: aconst_null    
        //   118: aconst_null    
        //   119: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   122: astore          4
        //   124: aload           4
        //   126: astore_3       
        //   127: aload           4
        //   129: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   134: istore          5
        //   136: iload           5
        //   138: ifne            150
        //   141: aload           4
        //   143: invokeinterface android/database/Cursor.close:()V
        //   148: aconst_null    
        //   149: areturn        
        //   150: aload           4
        //   152: astore_3       
        //   153: aload           4
        //   155: iconst_0       
        //   156: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   161: astore          6
        //   163: aload           4
        //   165: astore_3       
        //   166: aload_0        
        //   167: aload           4
        //   169: iconst_1       
        //   170: invokevirtual   com/google/android/gms/measurement/internal/k.a0:(Landroid/database/Cursor;I)Ljava/lang/Object;
        //   173: astore          7
        //   175: aload           4
        //   177: astore_3       
        //   178: aload           4
        //   180: iconst_2       
        //   181: invokeinterface android/database/Cursor.getInt:(I)I
        //   186: ifeq            195
        //   189: iconst_1       
        //   190: istore          5
        //   192: goto            198
        //   195: iconst_0       
        //   196: istore          5
        //   198: aload           4
        //   200: astore_3       
        //   201: aload           4
        //   203: iconst_3       
        //   204: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   209: astore          8
        //   211: aload           4
        //   213: astore_3       
        //   214: aload           4
        //   216: iconst_4       
        //   217: invokeinterface android/database/Cursor.getLong:(I)J
        //   222: lstore          9
        //   224: aload           4
        //   226: astore_3       
        //   227: aload_0        
        //   228: getfield        com/google/android/gms/measurement/internal/o9.b:Lcom/google/android/gms/measurement/internal/z9;
        //   231: invokevirtual   com/google/android/gms/measurement/internal/z9.f0:()Lcom/google/android/gms/measurement/internal/ba;
        //   234: astore          11
        //   236: aload           4
        //   238: astore_3       
        //   239: aload           4
        //   241: iconst_5       
        //   242: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   247: astore          12
        //   249: aload           4
        //   251: astore_3       
        //   252: getstatic       com/google/android/gms/measurement/internal/u.CREATOR:Landroid/os/Parcelable$Creator;
        //   255: astore          13
        //   257: aload           4
        //   259: astore_3       
        //   260: aload           11
        //   262: aload           12
        //   264: aload           13
        //   266: invokevirtual   com/google/android/gms/measurement/internal/ba.x:([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
        //   269: checkcast       Lcom/google/android/gms/measurement/internal/u;
        //   272: astore          12
        //   274: aload           4
        //   276: astore_3       
        //   277: aload           4
        //   279: bipush          6
        //   281: invokeinterface android/database/Cursor.getLong:(I)J
        //   286: lstore          14
        //   288: aload           4
        //   290: astore_3       
        //   291: aload_0        
        //   292: getfield        com/google/android/gms/measurement/internal/o9.b:Lcom/google/android/gms/measurement/internal/z9;
        //   295: invokevirtual   com/google/android/gms/measurement/internal/z9.f0:()Lcom/google/android/gms/measurement/internal/ba;
        //   298: aload           4
        //   300: bipush          7
        //   302: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   307: aload           13
        //   309: invokevirtual   com/google/android/gms/measurement/internal/ba.x:([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
        //   312: checkcast       Lcom/google/android/gms/measurement/internal/u;
        //   315: astore          11
        //   317: aload           4
        //   319: astore_3       
        //   320: aload           4
        //   322: bipush          8
        //   324: invokeinterface android/database/Cursor.getLong:(I)J
        //   329: lstore          16
        //   331: aload           4
        //   333: astore_3       
        //   334: aload           4
        //   336: bipush          9
        //   338: invokeinterface android/database/Cursor.getLong:(I)J
        //   343: lstore          18
        //   345: aload           4
        //   347: astore_3       
        //   348: aload_0        
        //   349: getfield        com/google/android/gms/measurement/internal/o9.b:Lcom/google/android/gms/measurement/internal/z9;
        //   352: invokevirtual   com/google/android/gms/measurement/internal/z9.f0:()Lcom/google/android/gms/measurement/internal/ba;
        //   355: aload           4
        //   357: bipush          10
        //   359: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   364: aload           13
        //   366: invokevirtual   com/google/android/gms/measurement/internal/ba.x:([BLandroid/os/Parcelable$Creator;)Landroid/os/Parcelable;
        //   369: checkcast       Lcom/google/android/gms/measurement/internal/u;
        //   372: astore          20
        //   374: aload           4
        //   376: astore_3       
        //   377: new             Lcom/google/android/gms/measurement/internal/ca;
        //   380: astore          13
        //   382: aload           4
        //   384: astore_3       
        //   385: aload           13
        //   387: aload_2        
        //   388: lload           16
        //   390: aload           7
        //   392: aload           6
        //   394: invokespecial   com/google/android/gms/measurement/internal/ca.<init>:(Ljava/lang/String;JLjava/lang/Object;Ljava/lang/String;)V
        //   397: aload           4
        //   399: astore_3       
        //   400: new             Lcom/google/android/gms/measurement/internal/c;
        //   403: astore          7
        //   405: aload           4
        //   407: astore_3       
        //   408: aload           7
        //   410: aload_1        
        //   411: aload           6
        //   413: aload           13
        //   415: lload           14
        //   417: iload           5
        //   419: aload           8
        //   421: aload           12
        //   423: lload           9
        //   425: aload           11
        //   427: lload           18
        //   429: aload           20
        //   431: invokespecial   com/google/android/gms/measurement/internal/c.<init>:(Ljava/lang/String;Ljava/lang/String;Lcom/google/android/gms/measurement/internal/ca;JZLjava/lang/String;Lcom/google/android/gms/measurement/internal/u;JLcom/google/android/gms/measurement/internal/u;JLcom/google/android/gms/measurement/internal/u;)V
        //   434: aload           4
        //   436: astore_3       
        //   437: aload           4
        //   439: invokeinterface android/database/Cursor.moveToNext:()Z
        //   444: ifeq            481
        //   447: aload           4
        //   449: astore_3       
        //   450: aload_0        
        //   451: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   454: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   457: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   460: ldc_w           "Got multiple records for conditional property, expected one"
        //   463: aload_1        
        //   464: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //   467: aload_0        
        //   468: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   471: invokevirtual   com/google/android/gms/measurement/internal/z4.A:()Lcom/google/android/gms/measurement/internal/i3;
        //   474: aload_2        
        //   475: invokevirtual   com/google/android/gms/measurement/internal/i3.p:(Ljava/lang/String;)Ljava/lang/String;
        //   478: invokevirtual   com/google/android/gms/measurement/internal/l3.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   481: aload           4
        //   483: invokeinterface android/database/Cursor.close:()V
        //   488: aload           7
        //   490: areturn        
        //   491: astore          6
        //   493: goto            507
        //   496: astore_1       
        //   497: aload_3        
        //   498: astore_2       
        //   499: goto            560
        //   502: astore          6
        //   504: aconst_null    
        //   505: astore          4
        //   507: aload           4
        //   509: astore_3       
        //   510: aload_0        
        //   511: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   514: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   517: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   520: ldc_w           "Error querying conditional property"
        //   523: aload_1        
        //   524: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //   527: aload_0        
        //   528: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   531: invokevirtual   com/google/android/gms/measurement/internal/z4.A:()Lcom/google/android/gms/measurement/internal/i3;
        //   534: aload_2        
        //   535: invokevirtual   com/google/android/gms/measurement/internal/i3.p:(Ljava/lang/String;)Ljava/lang/String;
        //   538: aload           6
        //   540: invokevirtual   com/google/android/gms/measurement/internal/l3.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   543: aload           4
        //   545: ifnull          555
        //   548: aload           4
        //   550: invokeinterface android/database/Cursor.close:()V
        //   555: aconst_null    
        //   556: areturn        
        //   557: astore_1       
        //   558: aload_3        
        //   559: astore_2       
        //   560: aload_2        
        //   561: ifnull          570
        //   564: aload_2        
        //   565: invokeinterface android/database/Cursor.close:()V
        //   570: aload_1        
        //   571: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  20     124    502    507    Landroid/database/sqlite/SQLiteException;
        //  20     124    496    502    Any
        //  127    136    491    496    Landroid/database/sqlite/SQLiteException;
        //  127    136    557    560    Any
        //  153    163    491    496    Landroid/database/sqlite/SQLiteException;
        //  153    163    557    560    Any
        //  166    175    491    496    Landroid/database/sqlite/SQLiteException;
        //  166    175    557    560    Any
        //  178    189    491    496    Landroid/database/sqlite/SQLiteException;
        //  178    189    557    560    Any
        //  201    211    491    496    Landroid/database/sqlite/SQLiteException;
        //  201    211    557    560    Any
        //  214    224    491    496    Landroid/database/sqlite/SQLiteException;
        //  214    224    557    560    Any
        //  227    236    491    496    Landroid/database/sqlite/SQLiteException;
        //  227    236    557    560    Any
        //  239    249    491    496    Landroid/database/sqlite/SQLiteException;
        //  239    249    557    560    Any
        //  252    257    491    496    Landroid/database/sqlite/SQLiteException;
        //  252    257    557    560    Any
        //  260    274    491    496    Landroid/database/sqlite/SQLiteException;
        //  260    274    557    560    Any
        //  277    288    491    496    Landroid/database/sqlite/SQLiteException;
        //  277    288    557    560    Any
        //  291    317    491    496    Landroid/database/sqlite/SQLiteException;
        //  291    317    557    560    Any
        //  320    331    491    496    Landroid/database/sqlite/SQLiteException;
        //  320    331    557    560    Any
        //  334    345    491    496    Landroid/database/sqlite/SQLiteException;
        //  334    345    557    560    Any
        //  348    374    491    496    Landroid/database/sqlite/SQLiteException;
        //  348    374    557    560    Any
        //  377    382    491    496    Landroid/database/sqlite/SQLiteException;
        //  377    382    557    560    Any
        //  385    397    491    496    Landroid/database/sqlite/SQLiteException;
        //  385    397    557    560    Any
        //  400    405    491    496    Landroid/database/sqlite/SQLiteException;
        //  400    405    557    560    Any
        //  408    434    491    496    Landroid/database/sqlite/SQLiteException;
        //  408    434    557    560    Any
        //  437    447    491    496    Landroid/database/sqlite/SQLiteException;
        //  437    447    557    560    Any
        //  450    481    491    496    Landroid/database/sqlite/SQLiteException;
        //  450    481    557    560    Any
        //  510    543    557    560    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0150:
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
    public final i U(final long n, final String s, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
        return this.V(n, s, 1L, false, false, b3, false, b5);
    }
    
    @c1
    public final i V(final long l, final String s, final long n, final boolean b, final boolean b2, final boolean b3, final boolean b4, final boolean b5) {
        x.g(s);
        this.e();
        this.f();
        final i i = new i();
        final Cursor cursor = null;
        Cursor query;
        final Cursor cursor2 = query = null;
        Cursor cursor3 = cursor;
        try {
            try {
                final SQLiteDatabase q = this.Q();
                query = cursor2;
                cursor3 = cursor;
                final Cursor cursor4 = cursor3 = (query = q.query("apps", new String[] { "day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count" }, "app_id=?", new String[] { s }, (String)null, (String)null, (String)null));
                if (!cursor4.moveToFirst()) {
                    query = cursor4;
                    cursor3 = cursor4;
                    super.a.c().t().b("Not updating daily counts, app is not known. appId", n3.w(s));
                    cursor4.close();
                    return i;
                }
                query = cursor4;
                cursor3 = cursor4;
                if (cursor4.getLong(0) == l) {
                    query = cursor4;
                    cursor3 = cursor4;
                    i.b = cursor4.getLong(1);
                    query = cursor4;
                    cursor3 = cursor4;
                    i.a = cursor4.getLong(2);
                    query = cursor4;
                    cursor3 = cursor4;
                    i.c = cursor4.getLong(3);
                    query = cursor4;
                    cursor3 = cursor4;
                    i.d = cursor4.getLong(4);
                    query = cursor4;
                    cursor3 = cursor4;
                    i.e = cursor4.getLong(5);
                }
                if (b) {
                    query = cursor4;
                    cursor3 = cursor4;
                    i.b += n;
                }
                if (b2) {
                    query = cursor4;
                    cursor3 = cursor4;
                    i.a += n;
                }
                if (b3) {
                    query = cursor4;
                    cursor3 = cursor4;
                    i.c += n;
                }
                if (b4) {
                    query = cursor4;
                    cursor3 = cursor4;
                    i.d += n;
                }
                if (b5) {
                    query = cursor4;
                    cursor3 = cursor4;
                    i.e += n;
                }
                query = cursor4;
                cursor3 = cursor4;
                query = cursor4;
                cursor3 = cursor4;
                final ContentValues contentValues = new ContentValues();
                query = cursor4;
                cursor3 = cursor4;
                contentValues.put("day", Long.valueOf(l));
                query = cursor4;
                cursor3 = cursor4;
                contentValues.put("daily_public_events_count", Long.valueOf(i.a));
                query = cursor4;
                cursor3 = cursor4;
                contentValues.put("daily_events_count", Long.valueOf(i.b));
                query = cursor4;
                cursor3 = cursor4;
                contentValues.put("daily_conversions_count", Long.valueOf(i.c));
                query = cursor4;
                cursor3 = cursor4;
                contentValues.put("daily_error_events_count", Long.valueOf(i.d));
                query = cursor4;
                cursor3 = cursor4;
                contentValues.put("daily_realtime_events_count", Long.valueOf(i.e));
                query = cursor4;
                cursor3 = cursor4;
                q.update("apps", contentValues, "app_id=?", new String[] { s });
                cursor4.close();
                return i;
            }
            finally {
                if (query != null) {
                    query.close();
                }
                cursor3.close();
                return i;
            }
        }
        catch (SQLiteException ex) {}
    }
    
    @c1
    public final q W(final String s, String s2) {
        x.g(s);
        x.g(s2);
        this.e();
        this.f();
        Object query = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        Serializable value = null;
        Label_0513: {
            try {
                final SQLiteDatabase q = this.Q();
                boolean b = false;
                query = q.query("events", (String[])((ArrayList)query).toArray(new String[0]), "app_id=? and name=?", new String[] { s, s2 }, (String)null, (String)null, (String)null);
                try {
                    if (!((Cursor)query).moveToFirst()) {
                        ((Cursor)query).close();
                        return null;
                    }
                    final long long1 = ((Cursor)query).getLong(0);
                    final long long2 = ((Cursor)query).getLong(1);
                    final long long3 = ((Cursor)query).getLong(2);
                    long long4;
                    if (((Cursor)query).isNull(3)) {
                        long4 = 0L;
                    }
                    else {
                        long4 = ((Cursor)query).getLong(3);
                    }
                    if (((Cursor)query).isNull(4)) {
                        value = null;
                    }
                    else {
                        value = ((Cursor)query).getLong(4);
                    }
                    Long value2;
                    if (((Cursor)query).isNull(5)) {
                        value2 = null;
                    }
                    else {
                        value2 = ((Cursor)query).getLong(5);
                    }
                    Long value3;
                    if (((Cursor)query).isNull(6)) {
                        value3 = null;
                    }
                    else {
                        value3 = ((Cursor)query).getLong(6);
                    }
                    Boolean value4;
                    if (!((Cursor)query).isNull(7)) {
                        if (((Cursor)query).getLong(7) == 1L) {
                            b = true;
                        }
                        value4 = b;
                    }
                    else {
                        value4 = null;
                    }
                    long long5;
                    if (((Cursor)query).isNull(8)) {
                        long5 = 0L;
                    }
                    else {
                        long5 = ((Cursor)query).getLong(8);
                    }
                    final Cursor cursor = (Cursor)query;
                    try {
                        final q q2 = new q(s, s2, long1, long2, long5, long3, long4, (Long)value, value2, value3, value4);
                        if (cursor.moveToNext()) {
                            super.a.c().o().b("Got multiple records for event aggregates, expected one. appId", n3.w(s));
                        }
                        cursor.close();
                        return q2;
                    }
                    catch (SQLiteException value) {}
                }
                catch (SQLiteException ex) {}
            }
            catch (SQLiteException value) {
                query = null;
            }
            finally {
                s2 = (String)value;
                break Label_0513;
            }
            try {
                super.a.c().o().d("Error querying events. appId", n3.w(s), super.a.A().n(s2), value);
                if (query != null) {
                    ((Cursor)query).close();
                }
                return null;
            }
            finally {
                s2 = (String)query;
            }
        }
        if (s2 != null) {
            ((Cursor)s2).close();
        }
        throw s;
    }
    
    @c1
    public final ea Z(final String p0, final String p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    com/google/android/gms/common/internal/x.g:(Ljava/lang/String;)Ljava/lang/String;
        //     4: pop            
        //     5: aload_2        
        //     6: invokestatic    com/google/android/gms/common/internal/x.g:(Ljava/lang/String;)Ljava/lang/String;
        //     9: pop            
        //    10: aload_0        
        //    11: invokevirtual   com/google/android/gms/measurement/internal/t5.e:()V
        //    14: aload_0        
        //    15: invokevirtual   com/google/android/gms/measurement/internal/p9.f:()V
        //    18: aconst_null    
        //    19: astore_3       
        //    20: aload_0        
        //    21: invokevirtual   com/google/android/gms/measurement/internal/k.Q:()Landroid/database/sqlite/SQLiteDatabase;
        //    24: ldc_w           "user_attributes"
        //    27: iconst_3       
        //    28: anewarray       Ljava/lang/String;
        //    31: dup            
        //    32: iconst_0       
        //    33: ldc_w           "set_timestamp"
        //    36: aastore        
        //    37: dup            
        //    38: iconst_1       
        //    39: ldc             "value"
        //    41: aastore        
        //    42: dup            
        //    43: iconst_2       
        //    44: ldc             "origin"
        //    46: aastore        
        //    47: ldc_w           "app_id=? and name=?"
        //    50: iconst_2       
        //    51: anewarray       Ljava/lang/String;
        //    54: dup            
        //    55: iconst_0       
        //    56: aload_1        
        //    57: aastore        
        //    58: dup            
        //    59: iconst_1       
        //    60: aload_2        
        //    61: aastore        
        //    62: aconst_null    
        //    63: aconst_null    
        //    64: aconst_null    
        //    65: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //    68: astore          4
        //    70: aload           4
        //    72: astore_3       
        //    73: aload           4
        //    75: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    80: istore          5
        //    82: iload           5
        //    84: ifne            96
        //    87: aload           4
        //    89: invokeinterface android/database/Cursor.close:()V
        //    94: aconst_null    
        //    95: areturn        
        //    96: aload           4
        //    98: astore_3       
        //    99: aload           4
        //   101: iconst_0       
        //   102: invokeinterface android/database/Cursor.getLong:(I)J
        //   107: lstore          6
        //   109: aload           4
        //   111: astore_3       
        //   112: aload_0        
        //   113: aload           4
        //   115: iconst_1       
        //   116: invokevirtual   com/google/android/gms/measurement/internal/k.a0:(Landroid/database/Cursor;I)Ljava/lang/Object;
        //   119: astore          8
        //   121: aload           8
        //   123: ifnonnull       135
        //   126: aload           4
        //   128: invokeinterface android/database/Cursor.close:()V
        //   133: aconst_null    
        //   134: areturn        
        //   135: aload           4
        //   137: astore_3       
        //   138: aload           4
        //   140: iconst_2       
        //   141: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   146: astore          9
        //   148: aload           4
        //   150: astore_3       
        //   151: new             Lcom/google/android/gms/measurement/internal/ea;
        //   154: astore          10
        //   156: aload           4
        //   158: astore_3       
        //   159: aload           10
        //   161: aload_1        
        //   162: aload           9
        //   164: aload_2        
        //   165: lload           6
        //   167: aload           8
        //   169: invokespecial   com/google/android/gms/measurement/internal/ea.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
        //   172: aload           4
        //   174: astore_3       
        //   175: aload           4
        //   177: invokeinterface android/database/Cursor.moveToNext:()Z
        //   182: ifeq            208
        //   185: aload           4
        //   187: astore_3       
        //   188: aload_0        
        //   189: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   192: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   195: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   198: ldc_w           "Got multiple records for user property, expected one. appId"
        //   201: aload_1        
        //   202: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //   205: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   208: aload           4
        //   210: invokeinterface android/database/Cursor.close:()V
        //   215: aload           10
        //   217: areturn        
        //   218: astore          10
        //   220: goto            234
        //   223: astore_1       
        //   224: aload_3        
        //   225: astore_2       
        //   226: goto            287
        //   229: astore          10
        //   231: aconst_null    
        //   232: astore          4
        //   234: aload           4
        //   236: astore_3       
        //   237: aload_0        
        //   238: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   241: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   244: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   247: ldc_w           "Error querying user property. appId"
        //   250: aload_1        
        //   251: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //   254: aload_0        
        //   255: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   258: invokevirtual   com/google/android/gms/measurement/internal/z4.A:()Lcom/google/android/gms/measurement/internal/i3;
        //   261: aload_2        
        //   262: invokevirtual   com/google/android/gms/measurement/internal/i3.p:(Ljava/lang/String;)Ljava/lang/String;
        //   265: aload           10
        //   267: invokevirtual   com/google/android/gms/measurement/internal/l3.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   270: aload           4
        //   272: ifnull          282
        //   275: aload           4
        //   277: invokeinterface android/database/Cursor.close:()V
        //   282: aconst_null    
        //   283: areturn        
        //   284: astore_1       
        //   285: aload_3        
        //   286: astore_2       
        //   287: aload_2        
        //   288: ifnull          297
        //   291: aload_2        
        //   292: invokeinterface android/database/Cursor.close:()V
        //   297: aload_1        
        //   298: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  20     70     229    234    Landroid/database/sqlite/SQLiteException;
        //  20     70     223    229    Any
        //  73     82     218    223    Landroid/database/sqlite/SQLiteException;
        //  73     82     284    287    Any
        //  99     109    218    223    Landroid/database/sqlite/SQLiteException;
        //  99     109    284    287    Any
        //  112    121    218    223    Landroid/database/sqlite/SQLiteException;
        //  112    121    284    287    Any
        //  138    148    218    223    Landroid/database/sqlite/SQLiteException;
        //  138    148    284    287    Any
        //  151    156    218    223    Landroid/database/sqlite/SQLiteException;
        //  151    156    284    287    Any
        //  159    172    218    223    Landroid/database/sqlite/SQLiteException;
        //  159    172    284    287    Any
        //  175    185    218    223    Landroid/database/sqlite/SQLiteException;
        //  175    185    284    287    Any
        //  188    208    218    223    Landroid/database/sqlite/SQLiteException;
        //  188    208    284    287    Any
        //  237    270    284    287    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0096:
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
    @d0
    final Object a0(final Cursor cursor, final int n) {
        final int type = cursor.getType(n);
        if (type == 0) {
            super.a.c().o().a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return cursor.getLong(n);
        }
        if (type == 2) {
            return cursor.getDouble(n);
        }
        if (type == 3) {
            return cursor.getString(n);
        }
        if (type != 4) {
            super.a.c().o().b("Loaded invalid unknown value type, ignoring it", type);
            return null;
        }
        super.a.c().o().a("Loaded invalid blob type value, ignoring it");
        return null;
    }
    
    @c1
    public final String b0() {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/google/android/gms/measurement/internal/k.Q:()Landroid/database/sqlite/SQLiteDatabase;
        //     4: astore_1       
        //     5: aconst_null    
        //     6: astore_2       
        //     7: aload_1        
        //     8: ldc_w           "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
        //    11: aconst_null    
        //    12: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //    15: astore_3       
        //    16: aload_3        
        //    17: astore_1       
        //    18: aload_3        
        //    19: invokeinterface android/database/Cursor.moveToFirst:()Z
        //    24: ifeq            45
        //    27: aload_3        
        //    28: astore_1       
        //    29: aload_3        
        //    30: iconst_0       
        //    31: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //    36: astore_2       
        //    37: aload_3        
        //    38: invokeinterface android/database/Cursor.close:()V
        //    43: aload_2        
        //    44: areturn        
        //    45: aload_3        
        //    46: invokeinterface android/database/Cursor.close:()V
        //    51: aconst_null    
        //    52: areturn        
        //    53: astore_2       
        //    54: goto            66
        //    57: astore_1       
        //    58: aload_2        
        //    59: astore_3       
        //    60: goto            102
        //    63: astore_2       
        //    64: aconst_null    
        //    65: astore_3       
        //    66: aload_3        
        //    67: astore_1       
        //    68: aload_0        
        //    69: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //    72: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //    75: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //    78: ldc_w           "Database error getting next bundle app id"
        //    81: aload_2        
        //    82: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //    85: aload_3        
        //    86: ifnull          95
        //    89: aload_3        
        //    90: invokeinterface android/database/Cursor.close:()V
        //    95: aconst_null    
        //    96: areturn        
        //    97: astore_2       
        //    98: aload_1        
        //    99: astore_3       
        //   100: aload_2        
        //   101: astore_1       
        //   102: aload_3        
        //   103: ifnull          112
        //   106: aload_3        
        //   107: invokeinterface android/database/Cursor.close:()V
        //   112: aload_1        
        //   113: athrow         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  7      16     63     66     Landroid/database/sqlite/SQLiteException;
        //  7      16     57     63     Any
        //  18     27     53     57     Landroid/database/sqlite/SQLiteException;
        //  18     27     97     102    Any
        //  29     37     53     57     Landroid/database/sqlite/SQLiteException;
        //  29     37     97     102    Any
        //  68     85     97     102    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0045:
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
    public final List<c> c0(final String s, final String s2, final String obj) {
        x.g(s);
        this.e();
        this.f();
        final ArrayList<String> list = new ArrayList<String>(3);
        list.add(s);
        final StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty((CharSequence)s2)) {
            list.add(s2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty((CharSequence)obj)) {
            list.add(String.valueOf(obj).concat("*"));
            sb.append(" and name glob ?");
        }
        return this.d0(sb.toString(), list.toArray(new String[list.size()]));
    }
    
    public final List<c> d0(final String s, final String[] array) {
        this.e();
        this.f();
        final ArrayList<c> list = new ArrayList<c>();
        final Cursor cursor = null;
        Cursor query;
        final Cursor cursor2 = query = null;
        Cursor cursor3 = cursor;
        try {
            try {
                final SQLiteDatabase q = this.Q();
                query = cursor2;
                cursor3 = cursor;
                super.a.w();
                query = cursor2;
                cursor3 = cursor;
                final Cursor cursor4 = cursor3 = (query = q.query("conditional_properties", new String[] { "app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event" }, s, array, (String)null, (String)null, "rowid", "1001"));
                if (cursor4.moveToFirst()) {
                    do {
                        query = cursor4;
                        cursor3 = cursor4;
                        final int size = list.size();
                        query = cursor4;
                        cursor3 = cursor4;
                        super.a.w();
                        if (size >= 1000) {
                            query = cursor4;
                            cursor3 = cursor4;
                            final l3 o = super.a.c().o();
                            query = cursor4;
                            cursor3 = cursor4;
                            super.a.w();
                            query = cursor4;
                            cursor3 = cursor4;
                            o.b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                            break;
                        }
                        query = cursor4;
                        cursor3 = cursor4;
                        final String string = cursor4.getString(0);
                        query = cursor4;
                        cursor3 = cursor4;
                        final String string2 = cursor4.getString(1);
                        query = cursor4;
                        cursor3 = cursor4;
                        final String string3 = cursor4.getString(2);
                        query = cursor4;
                        cursor3 = cursor4;
                        final Object a0 = this.a0(cursor4, 3);
                        query = cursor4;
                        cursor3 = cursor4;
                        final boolean b = cursor4.getInt(4) != 0;
                        query = cursor4;
                        cursor3 = cursor4;
                        final String string4 = cursor4.getString(5);
                        query = cursor4;
                        cursor3 = cursor4;
                        final long long1 = cursor4.getLong(6);
                        query = cursor4;
                        cursor3 = cursor4;
                        final ba f0 = super.b.f0();
                        query = cursor4;
                        cursor3 = cursor4;
                        final byte[] blob = cursor4.getBlob(7);
                        query = cursor4;
                        cursor3 = cursor4;
                        final Parcelable$Creator<u> creator = u.CREATOR;
                        query = cursor4;
                        cursor3 = cursor4;
                        final u u = f0.x(blob, creator);
                        query = cursor4;
                        cursor3 = cursor4;
                        final long long2 = cursor4.getLong(8);
                        query = cursor4;
                        cursor3 = cursor4;
                        final u u2 = super.b.f0().x(cursor4.getBlob(9), creator);
                        query = cursor4;
                        cursor3 = cursor4;
                        final long long3 = cursor4.getLong(10);
                        query = cursor4;
                        cursor3 = cursor4;
                        final long long4 = cursor4.getLong(11);
                        query = cursor4;
                        cursor3 = cursor4;
                        final u u3 = super.b.f0().x(cursor4.getBlob(12), creator);
                        query = cursor4;
                        cursor3 = cursor4;
                        query = cursor4;
                        cursor3 = cursor4;
                        final ca ca = new ca(string3, long3, a0, string2);
                        query = cursor4;
                        cursor3 = cursor4;
                        query = cursor4;
                        cursor3 = cursor4;
                        final c c = new c(string, string2, ca, long2, b, string4, u, long1, u2, long4, u3);
                        query = cursor4;
                        cursor3 = cursor4;
                        list.add(c);
                        query = cursor4;
                        cursor3 = cursor4;
                    } while (cursor4.moveToNext());
                    cursor4.close();
                    return list;
                }
                cursor4.close();
                return list;
            }
            finally {
                if (query != null) {
                    query.close();
                }
                cursor3.close();
                return;
            }
        }
        catch (SQLiteException ex) {}
    }
    
    @c1
    public final List<ea> e0(final String s) {
        x.g(s);
        this.e();
        this.f();
        final ArrayList<ea> list = new ArrayList<ea>();
        final Cursor cursor = null;
        Cursor query;
        final Cursor cursor2 = query = null;
        Cursor cursor3 = cursor;
        try {
            try {
                final SQLiteDatabase q = this.Q();
                query = cursor2;
                cursor3 = cursor;
                super.a.w();
                query = cursor2;
                cursor3 = cursor;
                final Cursor cursor4 = cursor3 = (query = q.query("user_attributes", new String[] { "name", "origin", "set_timestamp", "value" }, "app_id=?", new String[] { s }, (String)null, (String)null, "rowid", "1000"));
                if (cursor4.moveToFirst()) {
                    do {
                        query = cursor4;
                        cursor3 = cursor4;
                        final String string = cursor4.getString(0);
                        query = cursor4;
                        cursor3 = cursor4;
                        String string2;
                        if ((string2 = cursor4.getString(1)) == null) {
                            string2 = "";
                        }
                        query = cursor4;
                        cursor3 = cursor4;
                        final long long1 = cursor4.getLong(2);
                        query = cursor4;
                        cursor3 = cursor4;
                        final Object a0 = this.a0(cursor4, 3);
                        if (a0 == null) {
                            query = cursor4;
                            cursor3 = cursor4;
                            super.a.c().o().b("Read invalid user property value, ignoring it. appId", n3.w(s));
                        }
                        else {
                            query = cursor4;
                            cursor3 = cursor4;
                            query = cursor4;
                            cursor3 = cursor4;
                            final ea ea = new ea(s, string2, string, long1, a0);
                            query = cursor4;
                            cursor3 = cursor4;
                            list.add(ea);
                        }
                        query = cursor4;
                        cursor3 = cursor4;
                    } while (cursor4.moveToNext());
                    cursor4.close();
                    return list;
                }
                cursor4.close();
                return list;
            }
            finally {
                if (query != null) {
                    query.close();
                }
                cursor3.close();
                return;
            }
        }
        catch (SQLiteException ex) {}
    }
    
    @c1
    public final List<ea> f0(final String p0, final String p1, final String p2) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokestatic    com/google/android/gms/common/internal/x.g:(Ljava/lang/String;)Ljava/lang/String;
        //     4: pop            
        //     5: aload_0        
        //     6: invokevirtual   com/google/android/gms/measurement/internal/t5.e:()V
        //     9: aload_0        
        //    10: invokevirtual   com/google/android/gms/measurement/internal/p9.f:()V
        //    13: new             Ljava/util/ArrayList;
        //    16: dup            
        //    17: invokespecial   java/util/ArrayList.<init>:()V
        //    20: astore          4
        //    22: aconst_null    
        //    23: astore          5
        //    25: aconst_null    
        //    26: astore          6
        //    28: aconst_null    
        //    29: astore          7
        //    31: aload           5
        //    33: astore          8
        //    35: new             Ljava/util/ArrayList;
        //    38: astore          9
        //    40: aload           5
        //    42: astore          8
        //    44: aload           9
        //    46: iconst_3       
        //    47: invokespecial   java/util/ArrayList.<init>:(I)V
        //    50: aload           5
        //    52: astore          8
        //    54: aload           9
        //    56: aload_1        
        //    57: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //    62: pop            
        //    63: aload           5
        //    65: astore          8
        //    67: new             Ljava/lang/StringBuilder;
        //    70: astore          10
        //    72: aload           5
        //    74: astore          8
        //    76: aload           10
        //    78: ldc_w           "app_id=?"
        //    81: invokespecial   java/lang/StringBuilder.<init>:(Ljava/lang/String;)V
        //    84: aload           5
        //    86: astore          8
        //    88: aload_2        
        //    89: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    92: istore          11
        //    94: iload           11
        //    96: ifne            148
        //    99: aload_2        
        //   100: astore          12
        //   102: aload           7
        //   104: astore          6
        //   106: aload           12
        //   108: astore          13
        //   110: aload           5
        //   112: astore          8
        //   114: aload           9
        //   116: aload           12
        //   118: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   123: pop            
        //   124: aload           7
        //   126: astore          6
        //   128: aload           12
        //   130: astore          13
        //   132: aload           5
        //   134: astore          8
        //   136: aload           10
        //   138: ldc_w           " and origin=?"
        //   141: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   144: pop            
        //   145: goto            148
        //   148: aload           7
        //   150: astore          6
        //   152: aload_2        
        //   153: astore          13
        //   155: aload           5
        //   157: astore          8
        //   159: aload_3        
        //   160: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //   163: ifne            215
        //   166: aload           7
        //   168: astore          6
        //   170: aload_2        
        //   171: astore          13
        //   173: aload           5
        //   175: astore          8
        //   177: aload           9
        //   179: aload_3        
        //   180: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   183: ldc_w           "*"
        //   186: invokevirtual   java/lang/String.concat:(Ljava/lang/String;)Ljava/lang/String;
        //   189: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   194: pop            
        //   195: aload           7
        //   197: astore          6
        //   199: aload_2        
        //   200: astore          13
        //   202: aload           5
        //   204: astore          8
        //   206: aload           10
        //   208: ldc_w           " and name glob ?"
        //   211: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   214: pop            
        //   215: aload           7
        //   217: astore          6
        //   219: aload_2        
        //   220: astore          13
        //   222: aload           5
        //   224: astore          8
        //   226: aload           9
        //   228: aload           9
        //   230: invokeinterface java/util/List.size:()I
        //   235: anewarray       Ljava/lang/String;
        //   238: invokeinterface java/util/List.toArray:([Ljava/lang/Object;)[Ljava/lang/Object;
        //   243: checkcast       [Ljava/lang/String;
        //   246: astore          12
        //   248: aload           7
        //   250: astore          6
        //   252: aload_2        
        //   253: astore          13
        //   255: aload           5
        //   257: astore          8
        //   259: aload_0        
        //   260: invokevirtual   com/google/android/gms/measurement/internal/k.Q:()Landroid/database/sqlite/SQLiteDatabase;
        //   263: astore          9
        //   265: aload           7
        //   267: astore          6
        //   269: aload_2        
        //   270: astore          13
        //   272: aload           5
        //   274: astore          8
        //   276: aload           10
        //   278: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   281: astore          10
        //   283: aload           7
        //   285: astore          6
        //   287: aload_2        
        //   288: astore          13
        //   290: aload           5
        //   292: astore          8
        //   294: aload_0        
        //   295: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   298: invokevirtual   com/google/android/gms/measurement/internal/z4.w:()Lcom/google/android/gms/measurement/internal/g;
        //   301: pop            
        //   302: aload           7
        //   304: astore          6
        //   306: aload_2        
        //   307: astore          13
        //   309: aload           5
        //   311: astore          8
        //   313: aload           9
        //   315: ldc_w           "user_attributes"
        //   318: iconst_4       
        //   319: anewarray       Ljava/lang/String;
        //   322: dup            
        //   323: iconst_0       
        //   324: ldc_w           "name"
        //   327: aastore        
        //   328: dup            
        //   329: iconst_1       
        //   330: ldc_w           "set_timestamp"
        //   333: aastore        
        //   334: dup            
        //   335: iconst_2       
        //   336: ldc             "value"
        //   338: aastore        
        //   339: dup            
        //   340: iconst_3       
        //   341: ldc             "origin"
        //   343: aastore        
        //   344: aload           10
        //   346: aload           12
        //   348: aconst_null    
        //   349: aconst_null    
        //   350: ldc_w           "rowid"
        //   353: ldc_w           "1001"
        //   356: invokevirtual   android/database/sqlite/SQLiteDatabase.query:(Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
        //   359: astore          12
        //   361: aload           12
        //   363: astore          6
        //   365: aload_2        
        //   366: astore          13
        //   368: aload           12
        //   370: astore          8
        //   372: aload           12
        //   374: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   379: istore          11
        //   381: iload           11
        //   383: ifne            396
        //   386: aload           12
        //   388: invokeinterface android/database/Cursor.close:()V
        //   393: aload           4
        //   395: areturn        
        //   396: aload           12
        //   398: astore          6
        //   400: aload_2        
        //   401: astore          13
        //   403: aload           12
        //   405: astore          8
        //   407: aload           4
        //   409: invokeinterface java/util/List.size:()I
        //   414: istore          14
        //   416: aload           12
        //   418: astore          6
        //   420: aload_2        
        //   421: astore          13
        //   423: aload           12
        //   425: astore          8
        //   427: aload_0        
        //   428: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   431: invokevirtual   com/google/android/gms/measurement/internal/z4.w:()Lcom/google/android/gms/measurement/internal/g;
        //   434: pop            
        //   435: iload           14
        //   437: sipush          1000
        //   440: if_icmplt       511
        //   443: aload           12
        //   445: astore          6
        //   447: aload_2        
        //   448: astore          13
        //   450: aload           12
        //   452: astore          8
        //   454: aload_0        
        //   455: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   458: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   461: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   464: astore_3       
        //   465: aload           12
        //   467: astore          6
        //   469: aload_2        
        //   470: astore          13
        //   472: aload           12
        //   474: astore          8
        //   476: aload_0        
        //   477: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   480: invokevirtual   com/google/android/gms/measurement/internal/z4.w:()Lcom/google/android/gms/measurement/internal/g;
        //   483: pop            
        //   484: aload           12
        //   486: astore          6
        //   488: aload_2        
        //   489: astore          13
        //   491: aload           12
        //   493: astore          8
        //   495: aload_3        
        //   496: ldc_w           "Read more than the max allowed user properties, ignoring excess"
        //   499: sipush          1000
        //   502: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   505: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   508: goto            723
        //   511: aload           12
        //   513: astore          6
        //   515: aload_2        
        //   516: astore          13
        //   518: aload           12
        //   520: astore          8
        //   522: aload           12
        //   524: iconst_0       
        //   525: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   530: astore          5
        //   532: aload           12
        //   534: astore          6
        //   536: aload_2        
        //   537: astore          13
        //   539: aload           12
        //   541: astore          8
        //   543: aload           12
        //   545: iconst_1       
        //   546: invokeinterface android/database/Cursor.getLong:(I)J
        //   551: lstore          15
        //   553: aload           12
        //   555: astore          6
        //   557: aload_2        
        //   558: astore          13
        //   560: aload           12
        //   562: astore          8
        //   564: aload_0        
        //   565: aload           12
        //   567: iconst_2       
        //   568: invokevirtual   com/google/android/gms/measurement/internal/k.a0:(Landroid/database/Cursor;I)Ljava/lang/Object;
        //   571: astore          7
        //   573: aload           12
        //   575: astore          6
        //   577: aload_2        
        //   578: astore          13
        //   580: aload           12
        //   582: astore          8
        //   584: aload           12
        //   586: iconst_3       
        //   587: invokeinterface android/database/Cursor.getString:(I)Ljava/lang/String;
        //   592: astore_2       
        //   593: aload           7
        //   595: ifnonnull       634
        //   598: aload           12
        //   600: astore          6
        //   602: aload_2        
        //   603: astore          13
        //   605: aload           12
        //   607: astore          8
        //   609: aload_0        
        //   610: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   613: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   616: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   619: ldc_w           "(2)Read invalid user property value, ignoring it"
        //   622: aload_1        
        //   623: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //   626: aload_2        
        //   627: aload_3        
        //   628: invokevirtual   com/google/android/gms/measurement/internal/l3.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   631: goto            695
        //   634: aload           12
        //   636: astore          6
        //   638: aload_2        
        //   639: astore          13
        //   641: aload           12
        //   643: astore          8
        //   645: new             Lcom/google/android/gms/measurement/internal/ea;
        //   648: astore          10
        //   650: aload           12
        //   652: astore          6
        //   654: aload_2        
        //   655: astore          13
        //   657: aload           12
        //   659: astore          8
        //   661: aload           10
        //   663: aload_1        
        //   664: aload_2        
        //   665: aload           5
        //   667: lload           15
        //   669: aload           7
        //   671: invokespecial   com/google/android/gms/measurement/internal/ea.<init>:(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/Object;)V
        //   674: aload           12
        //   676: astore          6
        //   678: aload_2        
        //   679: astore          13
        //   681: aload           12
        //   683: astore          8
        //   685: aload           4
        //   687: aload           10
        //   689: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   694: pop            
        //   695: aload           12
        //   697: astore          6
        //   699: aload_2        
        //   700: astore          13
        //   702: aload           12
        //   704: astore          8
        //   706: aload           12
        //   708: invokeinterface android/database/Cursor.moveToNext:()Z
        //   713: istore          11
        //   715: iload           11
        //   717: ifeq            723
        //   720: goto            396
        //   723: aload           12
        //   725: invokeinterface android/database/Cursor.close:()V
        //   730: aload           4
        //   732: areturn        
        //   733: astore_3       
        //   734: goto            749
        //   737: astore_1       
        //   738: goto            798
        //   741: astore_3       
        //   742: goto            746
        //   745: astore_3       
        //   746: aload_2        
        //   747: astore          13
        //   749: aload           6
        //   751: astore          8
        //   753: aload_0        
        //   754: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   757: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   760: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   763: ldc_w           "(2)Error querying user properties"
        //   766: aload_1        
        //   767: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //   770: aload           13
        //   772: aload_3        
        //   773: invokevirtual   com/google/android/gms/measurement/internal/l3.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   776: aload           6
        //   778: astore          8
        //   780: invokestatic    java/util/Collections.emptyList:()Ljava/util/List;
        //   783: astore_1       
        //   784: aload           6
        //   786: ifnull          796
        //   789: aload           6
        //   791: invokeinterface android/database/Cursor.close:()V
        //   796: aload_1        
        //   797: areturn        
        //   798: aload           8
        //   800: ifnull          810
        //   803: aload           8
        //   805: invokeinterface android/database/Cursor.close:()V
        //   810: aload_1        
        //   811: athrow         
        //    Signature:
        //  (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List<Lcom/google/android/gms/measurement/internal/ea;>;
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  35     40     745    746    Landroid/database/sqlite/SQLiteException;
        //  35     40     737    812    Any
        //  44     50     745    746    Landroid/database/sqlite/SQLiteException;
        //  44     50     737    812    Any
        //  54     63     741    745    Landroid/database/sqlite/SQLiteException;
        //  54     63     737    812    Any
        //  67     72     741    745    Landroid/database/sqlite/SQLiteException;
        //  67     72     737    812    Any
        //  76     84     741    745    Landroid/database/sqlite/SQLiteException;
        //  76     84     737    812    Any
        //  88     94     741    745    Landroid/database/sqlite/SQLiteException;
        //  88     94     737    812    Any
        //  114    124    733    737    Landroid/database/sqlite/SQLiteException;
        //  114    124    737    812    Any
        //  136    145    733    737    Landroid/database/sqlite/SQLiteException;
        //  136    145    737    812    Any
        //  159    166    733    737    Landroid/database/sqlite/SQLiteException;
        //  159    166    737    812    Any
        //  177    195    733    737    Landroid/database/sqlite/SQLiteException;
        //  177    195    737    812    Any
        //  206    215    733    737    Landroid/database/sqlite/SQLiteException;
        //  206    215    737    812    Any
        //  226    248    733    737    Landroid/database/sqlite/SQLiteException;
        //  226    248    737    812    Any
        //  259    265    733    737    Landroid/database/sqlite/SQLiteException;
        //  259    265    737    812    Any
        //  276    283    733    737    Landroid/database/sqlite/SQLiteException;
        //  276    283    737    812    Any
        //  294    302    733    737    Landroid/database/sqlite/SQLiteException;
        //  294    302    737    812    Any
        //  313    361    733    737    Landroid/database/sqlite/SQLiteException;
        //  313    361    737    812    Any
        //  372    381    733    737    Landroid/database/sqlite/SQLiteException;
        //  372    381    737    812    Any
        //  407    416    733    737    Landroid/database/sqlite/SQLiteException;
        //  407    416    737    812    Any
        //  427    435    733    737    Landroid/database/sqlite/SQLiteException;
        //  427    435    737    812    Any
        //  454    465    733    737    Landroid/database/sqlite/SQLiteException;
        //  454    465    737    812    Any
        //  476    484    733    737    Landroid/database/sqlite/SQLiteException;
        //  476    484    737    812    Any
        //  495    508    733    737    Landroid/database/sqlite/SQLiteException;
        //  495    508    737    812    Any
        //  522    532    733    737    Landroid/database/sqlite/SQLiteException;
        //  522    532    737    812    Any
        //  543    553    733    737    Landroid/database/sqlite/SQLiteException;
        //  543    553    737    812    Any
        //  564    573    733    737    Landroid/database/sqlite/SQLiteException;
        //  564    573    737    812    Any
        //  584    593    733    737    Landroid/database/sqlite/SQLiteException;
        //  584    593    737    812    Any
        //  609    631    733    737    Landroid/database/sqlite/SQLiteException;
        //  609    631    737    812    Any
        //  645    650    733    737    Landroid/database/sqlite/SQLiteException;
        //  645    650    737    812    Any
        //  661    674    733    737    Landroid/database/sqlite/SQLiteException;
        //  661    674    737    812    Any
        //  685    695    733    737    Landroid/database/sqlite/SQLiteException;
        //  685    695    737    812    Any
        //  706    715    733    737    Landroid/database/sqlite/SQLiteException;
        //  706    715    737    812    Any
        //  753    776    737    812    Any
        //  780    784    737    812    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0148:
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
    public final void g0() {
        this.f();
        this.Q().beginTransaction();
    }
    
    @c1
    public final void h0() {
        this.f();
        this.Q().endTransaction();
    }
    
    @Override
    protected final boolean i() {
        return false;
    }
    
    @c1
    @d0
    final void i0(final List<Long> list) {
        this.e();
        this.f();
        x.k(list);
        x.m(list.size());
        if (!this.t()) {
            return;
        }
        final String join = TextUtils.join((CharSequence)",", (Iterable)list);
        final StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
        sb.append("(");
        sb.append(join);
        sb.append(")");
        final String string = sb.toString();
        final StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 80);
        sb2.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
        sb2.append(string);
        sb2.append(" AND retry_count =  2147483647 LIMIT 1");
        if (this.J(sb2.toString(), null) > 0L) {
            super.a.c().t().a("The number of upload retries exceeds the limit. Will remain unchanged.");
        }
        try {
            final SQLiteDatabase q = this.Q();
            final StringBuilder sb3 = new StringBuilder(String.valueOf(string).length() + 127);
            sb3.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
            sb3.append(string);
            sb3.append(" AND (retry_count IS NULL OR retry_count < ");
            sb3.append(Integer.MAX_VALUE);
            sb3.append(")");
            q.execSQL(sb3.toString());
        }
        catch (SQLiteException ex) {
            super.a.c().o().b("Error incrementing retry count. error", ex);
        }
    }
    
    @c1
    public final void j(final String s, final String s2) {
        x.g(s);
        x.g(s2);
        this.e();
        this.f();
        try {
            this.Q().delete("user_attributes", "app_id=? and name=?", new String[] { s, s2 });
        }
        catch (SQLiteException ex) {
            super.a.c().o().d("Error deleting user property. appId", n3.w(s), super.a.A().p(s2), ex);
        }
    }
    
    @c1
    final void j0() {
        this.e();
        this.f();
        if (this.t()) {
            final long a = super.b.d0().g.a();
            final long d = super.a.F().d();
            final long abs = Math.abs(d - a);
            super.a.w();
            if (abs > a3.z.a(null)) {
                super.b.d0().g.b(d);
                this.e();
                this.f();
                if (this.t()) {
                    final SQLiteDatabase q = this.Q();
                    final long a2 = super.a.F().a();
                    super.a.w();
                    final int delete = q.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[] { String.valueOf(a2), String.valueOf(com.google.android.gms.measurement.internal.g.f()) });
                    if (delete > 0) {
                        super.a.c().s().b("Deleted stale rows. rowsDeleted", delete);
                    }
                }
            }
        }
    }
    
    @c1
    final void k(final String s, List<m3> o) {
        final String s2 = "app_id=? and audience_id=?";
        x.k(o);
        for (int i = 0; i < ((List)o).size(); ++i) {
            final com.google.android.gms.internal.measurement.l3 l3 = ((j9<MessageType, com.google.android.gms.internal.measurement.l3>)((List<m3>)o).get(i)).p();
            com.google.android.gms.internal.measurement.l3 l4;
            if (l3.v() != 0) {
                l4 = l3;
                com.google.android.gms.internal.measurement.l3 l5;
                for (int j = 0; j < l4.v(); ++j, l4 = l5) {
                    final com.google.android.gms.internal.measurement.n3 n3 = ((j9<MessageType, com.google.android.gms.internal.measurement.n3>)l4.A(j)).p();
                    final com.google.android.gms.internal.measurement.n3 n4 = ((f9<MessageType, com.google.android.gms.internal.measurement.n3>)n3).s();
                    final String b = x5.b(n3.A());
                    boolean b2;
                    if (b != null) {
                        n4.w(b);
                        b2 = true;
                    }
                    else {
                        b2 = false;
                    }
                    final int n5 = 0;
                    boolean b3 = b2;
                    for (int k = n5; k < n3.v(); ++k) {
                        final q3 z = n3.z(k);
                        final String b4 = l7.b(z.A(), y5.a, y5.b);
                        if (b4 != null) {
                            final p3 p3 = ((j9<MessageType, p3>)z).p();
                            p3.v(b4);
                            n4.x(k, ((f9<q3, BuilderType>)p3).n());
                            b3 = true;
                        }
                    }
                    l5 = l4;
                    if (b3) {
                        l4.x(j, n4);
                        ((List<m3>)o).set(i, ((f9<m3, BuilderType>)l3).n());
                        l5 = l3;
                    }
                }
            }
            else {
                l4 = l3;
            }
            if (l4.w() != 0) {
                com.google.android.gms.internal.measurement.l3 l6;
                for (int n6 = 0; n6 < l4.w(); ++n6, l4 = l6) {
                    final x3 b5 = l4.B(n6);
                    final String b6 = l7.b(b5.A(), z5.a, z5.b);
                    l6 = l4;
                    if (b6 != null) {
                        final w3 w3 = ((j9<MessageType, w3>)b5).p();
                        w3.v(b6);
                        l4.z(n6, w3);
                        ((List<m3>)o).set(i, ((f9<m3, BuilderType>)l3).n());
                        l6 = l3;
                    }
                }
            }
        }
        this.f();
        this.e();
        x.g(s);
        x.k(o);
        final SQLiteDatabase q = this.Q();
        q.beginTransaction();
        try {
            this.f();
            this.e();
            x.g(s);
            final SQLiteDatabase q2 = this.Q();
            q2.delete("property_filters", "app_id=?", new String[] { s });
            q2.delete("event_filters", "app_id=?", new String[] { s });
            final Iterator<m3> iterator = ((List<m3>)o).iterator();
            Object o2 = s2;
            Object string = iterator;
            m3 m3;
            l3 l7;
            String s3;
            Object o3;
            int v;
            Integer n7;
            l3 t;
            Object w4;
            o3 o4;
            Integer value;
            long j2;
            int max;
            ArrayList<String> list;
            ContentValues contentValues;
            Boolean value2;
            byte[] i2;
            l3 l8;
            String s4;
            Object o5;
            x3 x3;
            Integer value3;
            Iterator<o3> iterator2;
            final SQLiteException ex;
            Iterator<x3> iterator3;
            SQLiteDatabase q3;
            byte[] i3;
            ContentValues contentValues2;
            Iterator<o3> iterator4;
            Integer value4;
            Boolean value5;
            Integer value6;
            Iterator<x3> iterator5;
            l3 t2;
            Object w5;
            Block_19_Outer:Block_23_Outer:Label_1409_Outer:Block_33_Outer:Block_28_Outer:
            while (true) {
                Label_1488: {
                    if (!((Iterator)string).hasNext()) {
                        break Label_1488;
                    }
                    m3 = ((Iterator<m3>)string).next();
                    this.f();
                    this.e();
                    x.g(s);
                    x.k(m3);
                    Label_0571: {
                        if (m3.G()) {
                            break Label_0571;
                        }
                        try {
                            super.a.c().t().b("Audience with no ID. appId", n3.w(s));
                            continue Block_19_Outer;
                            // iftrue(Label_0838:, !o4.K())
                            // iftrue(Label_0590:, (o3)iterator2.next().K())
                            // iftrue(Label_1205:, !TextUtils.isEmpty((CharSequence)x3.A()))
                            // iftrue(Label_1265:, !x3.F())
                            // iftrue(Label_0864:, !TextUtils.isEmpty((CharSequence)o4.C()))
                            // iftrue(Label_1485:, !iterator3.hasNext())
                            // iftrue(Label_1556:, !o2.hasNext())
                            // iftrue(Label_0971:, !o4.L())
                            // iftrue(Label_0731:, !iterator5.hasNext())
                            // iftrue(Label_1076:, !iterator4.hasNext())
                            // iftrue(Label_0672:, (x3)iterator5.next().F())
                            // iftrue(Label_0660:, !iterator2.hasNext())
                            // iftrue(Label_0924:, !o4.K())
                            // iftrue(Label_1312:, !x3.G())
                            // iftrue(Label_1543:, !o.G())
                            // iftrue(Label_1179:, !x3.F())
                            Block_22: {
                                while (true) {
                                Label_1182_Outer:
                                    while (true) {
                                    Label_1182:
                                        while (true) {
                                        Label_1409:
                                            while (true) {
                                            Label_1062:
                                                while (true) {
                                                Label_1088:
                                                    while (true) {
                                                        Label_1315: {
                                                            Label_0974:Block_30_Outer:
                                                            while (true) {
                                                                while (true) {
                                                                    Label_0927_Outer:Block_16_Outer:
                                                                    while (true) {
                                                                    Block_17:
                                                                        while (true) {
                                                                        Label_0927:
                                                                            while (true) {
                                                                            Label_0743:
                                                                                while (true) {
                                                                                Block_21_Outer:
                                                                                    while (true) {
                                                                                        l7 = super.a.c().t();
                                                                                        s3 = "Property filter with no ID. Audience definition ignored. appId, audienceId";
                                                                                        o3 = n3.w(s);
                                                                                        n7 = v;
                                                                                        break Label_1409;
                                                                                    Label_1545:
                                                                                        while (true) {
                                                                                            while (true) {
                                                                                                Label_0672: {
                                                                                                    while (true) {
                                                                                                    Label_1504:
                                                                                                        while (true) {
                                                                                                            Label_0841: {
                                                                                                                Label_1857: {
                                                                                                                    while (true) {
                                                                                                                        while (true) {
                                                                                                                            t = super.a.c().t();
                                                                                                                            w4 = n3.w(s);
                                                                                                                            break Block_22;
                                                                                                                            value = o4.w();
                                                                                                                            break Label_0927;
                                                                                                                            Label_1556: {
                                                                                                                                x.g(s);
                                                                                                                            }
                                                                                                                            this.f();
                                                                                                                            this.e();
                                                                                                                            o = this.Q();
                                                                                                                            try {
                                                                                                                                j2 = this.J("select count(1) from audience_filter_values where app_id=?", new String[] { s });
                                                                                                                                max = Math.max(0, Math.min(2000, super.a.w().l(s, a3.G)));
                                                                                                                                if (j2 > max) {
                                                                                                                                    list = new ArrayList<String>();
                                                                                                                                    for (int n8 = 0; n8 < ((List)string).size(); ++n8) {
                                                                                                                                        o2 = ((List<m3>)string).get(n8);
                                                                                                                                        if (o2 == null) {
                                                                                                                                            break Label_1857;
                                                                                                                                        }
                                                                                                                                        list.add(Integer.toString((int)o2));
                                                                                                                                    }
                                                                                                                                    o2 = TextUtils.join((CharSequence)",", (Iterable)list);
                                                                                                                                    string = new StringBuilder(String.valueOf(o2).length() + 2);
                                                                                                                                    ((StringBuilder)string).append("(");
                                                                                                                                    ((StringBuilder)string).append((String)o2);
                                                                                                                                    ((StringBuilder)string).append(")");
                                                                                                                                    string = ((StringBuilder)string).toString();
                                                                                                                                    o2 = new StringBuilder(String.valueOf(string).length() + 140);
                                                                                                                                    ((StringBuilder)o2).append("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
                                                                                                                                    ((StringBuilder)o2).append((String)string);
                                                                                                                                    ((StringBuilder)o2).append(" order by rowid desc limit -1 offset ?)");
                                                                                                                                    ((SQLiteDatabase)o).delete("audience_filter_values", ((StringBuilder)o2).toString(), new String[] { s, Integer.toString(max) });
                                                                                                                                }
                                                                                                                            }
                                                                                                                            catch (SQLiteException o) {
                                                                                                                                super.a.c().o().c("Database error querying filters. appId", n3.w(s), o);
                                                                                                                            }
                                                                                                                            break Label_1857;
                                                                                                                            contentValues.put("session_scoped", value2);
                                                                                                                            contentValues.put("data", i2);
                                                                                                                            try {
                                                                                                                                if (this.Q().insertWithOnConflict("event_filters", (String)null, contentValues, 5) == -1L) {
                                                                                                                                    super.a.c().o().b("Failed to insert event filter (got -1). appId", n3.w(s));
                                                                                                                                }
                                                                                                                                break Label_0743;
                                                                                                                            }
                                                                                                                            catch (SQLiteException ex) {
                                                                                                                                l8 = super.a.c().o();
                                                                                                                                s4 = "Error storing event filter. appId";
                                                                                                                                o5 = n3.w(s);
                                                                                                                            }
                                                                                                                            break Label_1062;
                                                                                                                            while (true) {
                                                                                                                                value3 = x3.v();
                                                                                                                                break Label_0927_Outer;
                                                                                                                                break Block_17;
                                                                                                                                l8.c(s4, o5, ex);
                                                                                                                                break Label_1409;
                                                                                                                                x3 = iterator3.next();
                                                                                                                                this.f();
                                                                                                                                this.e();
                                                                                                                                x.g(s);
                                                                                                                                x.k(x3);
                                                                                                                                break Label_1182_Outer;
                                                                                                                                o = ((m3)o).v();
                                                                                                                                break Label_1545;
                                                                                                                                v = m3.v();
                                                                                                                                iterator2 = m3.C().iterator();
                                                                                                                                break Label_0927;
                                                                                                                                Label_1076:
                                                                                                                                iterator3 = m3.D().iterator();
                                                                                                                                break Label_1088;
                                                                                                                                this.f();
                                                                                                                                this.e();
                                                                                                                                x.g(s);
                                                                                                                                q3 = this.Q();
                                                                                                                                q3.delete("property_filters", (String)o2, new String[] { s, String.valueOf(v) });
                                                                                                                                q3.delete("event_filters", (String)o2, new String[] { s, String.valueOf(v) });
                                                                                                                                continue Block_19_Outer;
                                                                                                                                Label_1205:
                                                                                                                                i3 = x3.i();
                                                                                                                                contentValues2 = new ContentValues();
                                                                                                                                contentValues2.put("app_id", s);
                                                                                                                                contentValues2.put("audience_id", Integer.valueOf(v));
                                                                                                                                continue Block_16_Outer;
                                                                                                                            }
                                                                                                                            o4 = iterator4.next();
                                                                                                                            this.f();
                                                                                                                            this.e();
                                                                                                                            x.g(s);
                                                                                                                            x.k(o4);
                                                                                                                            continue Block_23_Outer;
                                                                                                                        }
                                                                                                                        Label_1179: {
                                                                                                                            value4 = null;
                                                                                                                        }
                                                                                                                        break Label_1182;
                                                                                                                        string = new ArrayList();
                                                                                                                        o2 = ((List<m3>)o).iterator();
                                                                                                                        break Label_1504;
                                                                                                                        Label_1312:
                                                                                                                        value5 = null;
                                                                                                                        break Label_1315;
                                                                                                                        continue Block_33_Outer;
                                                                                                                    }
                                                                                                                    value2 = o4.I();
                                                                                                                    continue Label_0974;
                                                                                                                    Label_0838: {
                                                                                                                        value6 = null;
                                                                                                                    }
                                                                                                                    break Label_0841;
                                                                                                                    Label_0660:
                                                                                                                    iterator5 = m3.D().iterator();
                                                                                                                    break Label_0672;
                                                                                                                    break Label_1182;
                                                                                                                }
                                                                                                                q.setTransactionSuccessful();
                                                                                                                q.endTransaction();
                                                                                                                return;
                                                                                                            }
                                                                                                            t.d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", w4, v, String.valueOf(value6));
                                                                                                            continue Label_1409;
                                                                                                            ((List<m3>)string).add((m3)o);
                                                                                                            continue Label_1504;
                                                                                                        }
                                                                                                        contentValues.put("filter_id", value);
                                                                                                        contentValues.put("event_name", o4.C());
                                                                                                        continue Block_30_Outer;
                                                                                                    }
                                                                                                    t2.d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", w5, v, String.valueOf(value4));
                                                                                                    continue Label_1409;
                                                                                                    Label_1265: {
                                                                                                        value3 = null;
                                                                                                    }
                                                                                                    break Label_0927_Outer;
                                                                                                }
                                                                                                break Label_1545;
                                                                                                continue Label_1182_Outer;
                                                                                            }
                                                                                            Label_1543: {
                                                                                                o = null;
                                                                                            }
                                                                                            continue Label_1545;
                                                                                        }
                                                                                        continue Block_21_Outer;
                                                                                    }
                                                                                    Label_0731: {
                                                                                        iterator4 = m3.C().iterator();
                                                                                    }
                                                                                    continue Label_0743;
                                                                                }
                                                                                Label_0924: {
                                                                                    value = null;
                                                                                }
                                                                                continue Label_0927;
                                                                            }
                                                                            continue Label_1409_Outer;
                                                                        }
                                                                        l7 = super.a.c().t();
                                                                        s3 = "Event filter with no ID. Audience definition ignored. appId, audienceId";
                                                                        o3 = n3.w(s);
                                                                        n7 = v;
                                                                        break Label_1409;
                                                                        value5 = x3.E();
                                                                        break Label_1315;
                                                                        Label_0864: {
                                                                            i2 = o4.i();
                                                                        }
                                                                        contentValues = new ContentValues();
                                                                        contentValues.put("app_id", s);
                                                                        contentValues.put("audience_id", Integer.valueOf(v));
                                                                        continue Label_0927_Outer;
                                                                    }
                                                                    contentValues2.put("filter_id", value3);
                                                                    contentValues2.put("property_name", x3.A());
                                                                    continue Block_28_Outer;
                                                                }
                                                                Label_0971: {
                                                                    value2 = null;
                                                                }
                                                                continue Label_0974;
                                                            }
                                                            Label_1485: {
                                                                continue Block_19_Outer;
                                                            }
                                                        }
                                                        contentValues2.put("session_scoped", value5);
                                                        contentValues2.put("data", i3);
                                                        try {
                                                            if (this.Q().insertWithOnConflict("property_filters", (String)null, contentValues2, 5) != -1L) {
                                                                continue Label_1088;
                                                            }
                                                            super.a.c().o().b("Failed to insert property filter (got -1). appId", n3.w(s));
                                                        }
                                                        catch (SQLiteException ex) {
                                                            l8 = super.a.c().o();
                                                            s4 = "Error storing property filter. appId";
                                                            o5 = n3.w(s);
                                                            continue Label_1062;
                                                        }
                                                        break;
                                                    }
                                                    break;
                                                }
                                                continue Label_1409;
                                            }
                                            l7.c(s3, o3, n7);
                                            continue Block_19_Outer;
                                            value4 = x3.v();
                                            continue Label_1182;
                                        }
                                        o = ((Iterator<m3>)o2).next();
                                        continue Label_1182_Outer;
                                    }
                                    t2 = super.a.c().t();
                                    w5 = n3.w(s);
                                    continue;
                                }
                            }
                            value6 = o4.w();
                        }
                        finally {}
                    }
                }
            }
        }
        finally {}
        q.endTransaction();
    }
    
    @c1
    public final void l() {
        this.f();
        this.Q().setTransactionSuccessful();
    }
    
    @c1
    public final void m(final h5 h5) {
        x.k(h5);
        this.e();
        this.f();
        final String e0 = h5.e0();
        x.k(e0);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", e0);
        contentValues.put("app_instance_id", h5.f0());
        contentValues.put("gmp_app_id", h5.k0());
        contentValues.put("resettable_device_id_hash", h5.b());
        contentValues.put("last_bundle_index", Long.valueOf(h5.Z()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(h5.a0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(h5.Y()));
        contentValues.put("app_version", h5.h0());
        contentValues.put("app_store", h5.g0());
        contentValues.put("gmp_version", Long.valueOf(h5.X()));
        contentValues.put("dev_cert_hash", Long.valueOf(h5.U()));
        contentValues.put("measurement_enabled", Boolean.valueOf(h5.K()));
        contentValues.put("day", Long.valueOf(h5.T()));
        contentValues.put("daily_public_events_count", Long.valueOf(h5.R()));
        contentValues.put("daily_events_count", Long.valueOf(h5.Q()));
        contentValues.put("daily_conversions_count", Long.valueOf(h5.O()));
        contentValues.put("config_fetched_time", Long.valueOf(h5.N()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(h5.W()));
        contentValues.put("app_version_int", Long.valueOf(h5.M()));
        contentValues.put("firebase_instance_id", h5.i0());
        contentValues.put("daily_error_events_count", Long.valueOf(h5.P()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(h5.S()));
        contentValues.put("health_monitor_sample", h5.a());
        contentValues.put("android_id", Long.valueOf(h5.A()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(h5.J()));
        contentValues.put("admob_app_id", h5.c0());
        contentValues.put("dynamite_version", Long.valueOf(h5.V()));
        final List<String> c = h5.c();
        if (c != null) {
            if (c.size() == 0) {
                super.a.c().t().b("Safelisted events should not be an empty list. appId", e0);
            }
            else {
                contentValues.put("safelisted_events", TextUtils.join((CharSequence)",", (Iterable)c));
            }
        }
        fe.b();
        if (super.a.w().y(e0, a3.f0)) {
            contentValues.put("ga_app_id", h5.j0());
        }
        try {
            final SQLiteDatabase q = this.Q();
            if (q.update("apps", contentValues, "app_id = ?", new String[] { e0 }) == 0L && q.insertWithOnConflict("apps", (String)null, contentValues, 5) == -1L) {
                super.a.c().o().b("Failed to insert/update app (got -1). appId", n3.w(e0));
            }
        }
        catch (SQLiteException ex) {
            super.a.c().o().c("Error storing app. appId", n3.w(e0), ex);
        }
    }
    
    @c1
    public final void n(final q q) {
        x.k(q);
        this.e();
        this.f();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", q.a);
        contentValues.put("name", q.b);
        contentValues.put("lifetime_count", Long.valueOf(q.c));
        contentValues.put("current_bundle_count", Long.valueOf(q.d));
        contentValues.put("last_fire_timestamp", Long.valueOf(q.f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(q.g));
        contentValues.put("last_bundled_day", q.h);
        contentValues.put("last_sampled_complex_event_id", q.i);
        contentValues.put("last_sampling_rate", q.j);
        contentValues.put("current_session_count", Long.valueOf(q.e));
        final Boolean k = q.k;
        Long value;
        if (k != null && k) {
            value = 1L;
        }
        else {
            value = null;
        }
        contentValues.put("last_exempt_from_sampling", value);
        try {
            if (this.Q().insertWithOnConflict("events", (String)null, contentValues, 5) == -1L) {
                super.a.c().o().b("Failed to insert/update event aggregates (got -1). appId", n3.w(q.a));
            }
        }
        catch (SQLiteException ex) {
            super.a.c().o().c("Error storing event aggregates. appId", n3.w(q.a), ex);
        }
    }
    
    @c1
    public final void o(final String s, final byte[] array, final String s2) {
        x.g(s);
        this.e();
        this.f();
        final ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", array);
        contentValues.put("config_last_modified_time", s2);
        try {
            if (this.Q().update("apps", contentValues, "app_id = ?", new String[] { s }) == 0L) {
                super.a.c().o().b("Failed to update remote config (got 0). appId", n3.w(s));
            }
        }
        catch (SQLiteException ex) {
            super.a.c().o().c("Error storing remote config. appId", n3.w(s), ex);
        }
    }
    
    public final boolean p() {
        return this.J("select count(1) > 0 from raw_events", null) != 0L;
    }
    
    public final boolean q() {
        return this.J("select count(1) > 0 from queue where has_realtime = 1", null) != 0L;
    }
    
    public final boolean r() {
        return this.J("select count(1) > 0 from raw_events where realtime = 1", null) != 0L;
    }
    
    @c1
    public final boolean s(e5 o, final boolean i) {
        this.e();
        this.f();
        x.k(o);
        x.g(((e5)o).J1());
        x.q(((e5)o).c1());
        this.j0();
        final long a = super.a.F().a();
        final long x1 = ((e5)o).x1();
        super.a.w();
        Label_0129: {
            if (x1 >= a - com.google.android.gms.measurement.internal.g.f()) {
                final long x2 = ((e5)o).x1();
                super.a.w();
                if (x2 <= com.google.android.gms.measurement.internal.g.f() + a) {
                    break Label_0129;
                }
            }
            super.a.c().t().d("Storing bundle outside of the max uploading time span. appId, now, timestamp", n3.w(((e5)o).J1()), a, ((e5)o).x1());
        }
        final byte[] j = ((q7)o).i();
        while (true) {
            try {
                final byte[] p2 = super.b.f0().P(j);
                super.a.c().s().b("Saving bundle, size", p2.length);
                final ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", ((e5)o).J1());
                contentValues.put("bundle_end_timestamp", Long.valueOf(((e5)o).x1()));
                contentValues.put("data", p2);
                contentValues.put("has_realtime", Integer.valueOf((int)(i ? 1 : 0)));
                if (((e5)o).i1()) {
                    contentValues.put("retry_count", Integer.valueOf(((e5)o).q1()));
                }
                l3 l3;
                Object o2;
                try {
                    if (this.Q().insert("queue", (String)null, contentValues) == -1L) {
                        super.a.c().o().b("Failed to insert bundle (got -1). appId", n3.w(((e5)o).J1()));
                        return false;
                    }
                    return true;
                }
                catch (SQLiteException ex) {
                    l3 = super.a.c().o();
                    o2 = n3.w(((e5)o).J1());
                    o = "Error storing bundle. appId";
                }
                final SQLiteException ex;
                l3.c((String)o, o2, ex);
                return false;
            }
            catch (IOException ex) {
                final l3 l3 = super.a.c().o();
                final Object o2 = n3.w(((e5)o).J1());
                o = "Data loss. Failed to serialize bundle. appId";
                continue;
            }
            break;
        }
    }
    
    @d0
    protected final boolean t() {
        final Context x = super.a.X();
        super.a.w();
        return x.getDatabasePath("google_app_measurement.db").exists();
    }
    
    public final boolean u(final String s, final Long n, final long l, final u4 u4) {
        this.e();
        this.f();
        x.k(u4);
        x.g(s);
        x.k(n);
        final byte[] i = u4.i();
        super.a.c().s().c("Saving complex main event, appId, data size", super.a.A().n(s), i.length);
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", s);
        contentValues.put("event_id", n);
        contentValues.put("children_to_process", Long.valueOf(l));
        contentValues.put("main_event", i);
        try {
            if (this.Q().insertWithOnConflict("main_event_params", (String)null, contentValues, 5) == -1L) {
                super.a.c().o().b("Failed to insert complex main event (got -1). appId", n3.w(s));
                return false;
            }
            return true;
        }
        catch (SQLiteException ex) {
            super.a.c().o().c("Error storing complex main event. appId", n3.w(s), ex);
            return false;
        }
    }
    
    @c1
    public final boolean v(final c c) {
        x.k(c);
        this.e();
        this.f();
        final String g = c.G;
        x.k(g);
        if (this.Z(g, c.I.H) == null) {
            final long j = this.J("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[] { g });
            super.a.w();
            if (j >= 1000L) {
                return false;
            }
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", g);
        contentValues.put("origin", c.H);
        contentValues.put("name", c.I.H);
        H(contentValues, "value", x.k(c.I.M()));
        contentValues.put("active", Boolean.valueOf(c.K));
        contentValues.put("trigger_event_name", c.L);
        contentValues.put("trigger_timeout", Long.valueOf(c.N));
        contentValues.put("timed_out_event", super.a.M().c0((Parcelable)c.M));
        contentValues.put("creation_timestamp", Long.valueOf(c.J));
        contentValues.put("triggered_event", super.a.M().c0((Parcelable)c.O));
        contentValues.put("triggered_timestamp", Long.valueOf(c.I.I));
        contentValues.put("time_to_live", Long.valueOf(c.P));
        contentValues.put("expired_event", super.a.M().c0((Parcelable)c.Q));
        try {
            if (this.Q().insertWithOnConflict("conditional_properties", (String)null, contentValues, 5) == -1L) {
                super.a.c().o().b("Failed to insert/update conditional user property (got -1)", n3.w(g));
            }
        }
        catch (SQLiteException ex) {
            super.a.c().o().c("Error storing conditional user property", n3.w(g), ex);
        }
        return true;
    }
    
    @c1
    public final boolean w(final ea ea) {
        x.k(ea);
        this.e();
        this.f();
        if (this.Z(ea.a, ea.c) == null) {
            if (ga.V(ea.c)) {
                if (this.J("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[] { ea.a }) >= super.a.w().m(ea.a, a3.H, 25, 100)) {
                    return false;
                }
            }
            else if (!"_npa".equals(ea.c)) {
                final long j = this.J("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[] { ea.a, ea.b });
                super.a.w();
                if (j >= 25L) {
                    return false;
                }
            }
        }
        final ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", ea.a);
        contentValues.put("origin", ea.b);
        contentValues.put("name", ea.c);
        contentValues.put("set_timestamp", Long.valueOf(ea.d));
        H(contentValues, "value", ea.e);
        try {
            if (this.Q().insertWithOnConflict("user_attributes", (String)null, contentValues, 5) == -1L) {
                super.a.c().o().b("Failed to insert/update user property (got -1). appId", n3.w(ea.a));
            }
        }
        catch (SQLiteException ex) {
            super.a.c().o().c("Error storing user property. appId", n3.w(ea.a), ex);
        }
        return true;
    }
}
