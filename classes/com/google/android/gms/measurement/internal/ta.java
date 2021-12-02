// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.u4;

final class ta
{
    private u4 a;
    private Long b;
    private long c;
    
    final u4 a(final String p0, final u4 p1) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: invokevirtual   com/google/android/gms/internal/measurement/u4.D:()Ljava/lang/String;
        //     4: astore_3       
        //     5: aload_2        
        //     6: invokevirtual   com/google/android/gms/internal/measurement/u4.E:()Ljava/util/List;
        //     9: astore          4
        //    11: aload_0        
        //    12: getfield        com/google/android/gms/measurement/internal/ta.d:Lcom/google/android/gms/measurement/internal/xa;
        //    15: getfield        com/google/android/gms/measurement/internal/o9.b:Lcom/google/android/gms/measurement/internal/z9;
        //    18: invokevirtual   com/google/android/gms/measurement/internal/z9.f0:()Lcom/google/android/gms/measurement/internal/ba;
        //    21: pop            
        //    22: aload_2        
        //    23: ldc             "_eid"
        //    25: invokestatic    com/google/android/gms/measurement/internal/ba.m:(Lcom/google/android/gms/internal/measurement/u4;Ljava/lang/String;)Ljava/lang/Object;
        //    28: checkcast       Ljava/lang/Long;
        //    31: astore          5
        //    33: aload_3        
        //    34: astore          6
        //    36: aload           4
        //    38: astore          7
        //    40: aload           5
        //    42: ifnull          897
        //    45: aload_3        
        //    46: ldc             "_ep"
        //    48: invokevirtual   java/lang/String.equals:(Ljava/lang/Object;)Z
        //    51: ifeq            763
        //    54: aload           5
        //    56: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //    59: pop            
        //    60: aload_0        
        //    61: getfield        com/google/android/gms/measurement/internal/ta.d:Lcom/google/android/gms/measurement/internal/xa;
        //    64: getfield        com/google/android/gms/measurement/internal/o9.b:Lcom/google/android/gms/measurement/internal/z9;
        //    67: invokevirtual   com/google/android/gms/measurement/internal/z9.f0:()Lcom/google/android/gms/measurement/internal/ba;
        //    70: pop            
        //    71: aload_2        
        //    72: ldc             "_en"
        //    74: invokestatic    com/google/android/gms/measurement/internal/ba.m:(Lcom/google/android/gms/internal/measurement/u4;Ljava/lang/String;)Ljava/lang/Object;
        //    77: checkcast       Ljava/lang/String;
        //    80: astore          8
        //    82: aload           8
        //    84: invokestatic    android/text/TextUtils.isEmpty:(Ljava/lang/CharSequence;)Z
        //    87: ifeq            112
        //    90: aload_0        
        //    91: getfield        com/google/android/gms/measurement/internal/ta.d:Lcom/google/android/gms/measurement/internal/xa;
        //    94: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //    97: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   100: invokevirtual   com/google/android/gms/measurement/internal/n3.q:()Lcom/google/android/gms/measurement/internal/l3;
        //   103: ldc             "Extra parameter without an event name. eventId"
        //   105: aload           5
        //   107: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   110: aconst_null    
        //   111: areturn        
        //   112: aload_0        
        //   113: getfield        com/google/android/gms/measurement/internal/ta.a:Lcom/google/android/gms/internal/measurement/u4;
        //   116: ifnull          142
        //   119: aload_0        
        //   120: getfield        com/google/android/gms/measurement/internal/ta.b:Ljava/lang/Long;
        //   123: ifnull          142
        //   126: aload           5
        //   128: invokevirtual   java/lang/Long.longValue:()J
        //   131: aload_0        
        //   132: getfield        com/google/android/gms/measurement/internal/ta.b:Ljava/lang/Long;
        //   135: invokevirtual   java/lang/Long.longValue:()J
        //   138: lcmp           
        //   139: ifeq            466
        //   142: aload_0        
        //   143: getfield        com/google/android/gms/measurement/internal/ta.d:Lcom/google/android/gms/measurement/internal/xa;
        //   146: getfield        com/google/android/gms/measurement/internal/o9.b:Lcom/google/android/gms/measurement/internal/z9;
        //   149: invokevirtual   com/google/android/gms/measurement/internal/z9.U:()Lcom/google/android/gms/measurement/internal/k;
        //   152: astore          9
        //   154: aload           9
        //   156: invokevirtual   com/google/android/gms/measurement/internal/t5.e:()V
        //   159: aload           9
        //   161: invokevirtual   com/google/android/gms/measurement/internal/p9.f:()V
        //   164: aload           9
        //   166: invokevirtual   com/google/android/gms/measurement/internal/k.Q:()Landroid/database/sqlite/SQLiteDatabase;
        //   169: ldc             "select main_event, children_to_process from main_event_params where app_id=? and event_id=?"
        //   171: iconst_2       
        //   172: anewarray       Ljava/lang/String;
        //   175: dup            
        //   176: iconst_0       
        //   177: aload_1        
        //   178: aastore        
        //   179: dup            
        //   180: iconst_1       
        //   181: aload           5
        //   183: invokestatic    java/lang/String.valueOf:(Ljava/lang/Object;)Ljava/lang/String;
        //   186: aastore        
        //   187: invokevirtual   android/database/sqlite/SQLiteDatabase.rawQuery:(Ljava/lang/String;[Ljava/lang/String;)Landroid/database/Cursor;
        //   190: astore          6
        //   192: aload           6
        //   194: astore          7
        //   196: aload           6
        //   198: invokeinterface android/database/Cursor.moveToFirst:()Z
        //   203: ifne            239
        //   206: aload           6
        //   208: astore          7
        //   210: aload           9
        //   212: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   215: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   218: invokevirtual   com/google/android/gms/measurement/internal/n3.s:()Lcom/google/android/gms/measurement/internal/l3;
        //   221: ldc             "Main event not found"
        //   223: invokevirtual   com/google/android/gms/measurement/internal/l3.a:(Ljava/lang/String;)V
        //   226: aload           6
        //   228: invokeinterface android/database/Cursor.close:()V
        //   233: aconst_null    
        //   234: astore          6
        //   236: goto            395
        //   239: aload           6
        //   241: astore          7
        //   243: aload           6
        //   245: iconst_0       
        //   246: invokeinterface android/database/Cursor.getBlob:(I)[B
        //   251: astore_3       
        //   252: aload           6
        //   254: astore          7
        //   256: aload           6
        //   258: iconst_1       
        //   259: invokeinterface android/database/Cursor.getLong:(I)J
        //   264: lstore          10
        //   266: aload           6
        //   268: astore          7
        //   270: invokestatic    com/google/android/gms/internal/measurement/u4.A:()Lcom/google/android/gms/internal/measurement/t4;
        //   273: aload_3        
        //   274: invokestatic    com/google/android/gms/measurement/internal/ba.A:(Lcom/google/android/gms/internal/measurement/ra;[B)Lcom/google/android/gms/internal/measurement/ra;
        //   277: checkcast       Lcom/google/android/gms/internal/measurement/t4;
        //   280: invokevirtual   com/google/android/gms/internal/measurement/f9.n:()Lcom/google/android/gms/internal/measurement/j9;
        //   283: checkcast       Lcom/google/android/gms/internal/measurement/u4;
        //   286: astore_3       
        //   287: aload           6
        //   289: astore          7
        //   291: aload_3        
        //   292: lload           10
        //   294: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   297: invokestatic    android/util/Pair.create:(Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
        //   300: astore_3       
        //   301: aload           6
        //   303: invokeinterface android/database/Cursor.close:()V
        //   308: aload_3        
        //   309: astore          6
        //   311: goto            395
        //   314: astore_3       
        //   315: aload           6
        //   317: astore          7
        //   319: aload           9
        //   321: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   324: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   327: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   330: ldc             "Failed to merge main event. appId, eventId"
        //   332: aload_1        
        //   333: invokestatic    com/google/android/gms/measurement/internal/n3.w:(Ljava/lang/String;)Ljava/lang/Object;
        //   336: aload           5
        //   338: aload_3        
        //   339: invokevirtual   com/google/android/gms/measurement/internal/l3.d:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
        //   342: goto            385
        //   345: astore_3       
        //   346: goto            359
        //   349: astore_1       
        //   350: aconst_null    
        //   351: astore_2       
        //   352: goto            751
        //   355: astore_3       
        //   356: aconst_null    
        //   357: astore          6
        //   359: aload           6
        //   361: astore          7
        //   363: aload           9
        //   365: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   368: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   371: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   374: ldc             "Error selecting main event"
        //   376: aload_3        
        //   377: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   380: aload           6
        //   382: ifnull          392
        //   385: aload           6
        //   387: invokeinterface android/database/Cursor.close:()V
        //   392: aconst_null    
        //   393: astore          6
        //   395: aload           6
        //   397: ifnull          722
        //   400: aload           6
        //   402: getfield        android/util/Pair.first:Ljava/lang/Object;
        //   405: astore          7
        //   407: aload           7
        //   409: ifnonnull       415
        //   412: goto            722
        //   415: aload_0        
        //   416: aload           7
        //   418: checkcast       Lcom/google/android/gms/internal/measurement/u4;
        //   421: putfield        com/google/android/gms/measurement/internal/ta.a:Lcom/google/android/gms/internal/measurement/u4;
        //   424: aload_0        
        //   425: aload           6
        //   427: getfield        android/util/Pair.second:Ljava/lang/Object;
        //   430: checkcast       Ljava/lang/Long;
        //   433: invokevirtual   java/lang/Long.longValue:()J
        //   436: putfield        com/google/android/gms/measurement/internal/ta.c:J
        //   439: aload_0        
        //   440: getfield        com/google/android/gms/measurement/internal/ta.d:Lcom/google/android/gms/measurement/internal/xa;
        //   443: getfield        com/google/android/gms/measurement/internal/o9.b:Lcom/google/android/gms/measurement/internal/z9;
        //   446: invokevirtual   com/google/android/gms/measurement/internal/z9.f0:()Lcom/google/android/gms/measurement/internal/ba;
        //   449: pop            
        //   450: aload_0        
        //   451: aload_0        
        //   452: getfield        com/google/android/gms/measurement/internal/ta.a:Lcom/google/android/gms/internal/measurement/u4;
        //   455: ldc             "_eid"
        //   457: invokestatic    com/google/android/gms/measurement/internal/ba.m:(Lcom/google/android/gms/internal/measurement/u4;Ljava/lang/String;)Ljava/lang/Object;
        //   460: checkcast       Ljava/lang/Long;
        //   463: putfield        com/google/android/gms/measurement/internal/ta.b:Ljava/lang/Long;
        //   466: aload_0        
        //   467: getfield        com/google/android/gms/measurement/internal/ta.c:J
        //   470: lconst_1       
        //   471: lsub           
        //   472: lstore          10
        //   474: aload_0        
        //   475: lload           10
        //   477: putfield        com/google/android/gms/measurement/internal/ta.c:J
        //   480: lload           10
        //   482: lconst_0       
        //   483: lcmp           
        //   484: ifgt            563
        //   487: aload_0        
        //   488: getfield        com/google/android/gms/measurement/internal/ta.d:Lcom/google/android/gms/measurement/internal/xa;
        //   491: getfield        com/google/android/gms/measurement/internal/o9.b:Lcom/google/android/gms/measurement/internal/z9;
        //   494: invokevirtual   com/google/android/gms/measurement/internal/z9.U:()Lcom/google/android/gms/measurement/internal/k;
        //   497: astore          6
        //   499: aload           6
        //   501: invokevirtual   com/google/android/gms/measurement/internal/t5.e:()V
        //   504: aload           6
        //   506: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   509: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   512: invokevirtual   com/google/android/gms/measurement/internal/n3.s:()Lcom/google/android/gms/measurement/internal/l3;
        //   515: ldc             "Clearing complex main event info. appId"
        //   517: aload_1        
        //   518: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   521: aload           6
        //   523: invokevirtual   com/google/android/gms/measurement/internal/k.Q:()Landroid/database/sqlite/SQLiteDatabase;
        //   526: ldc             "delete from main_event_params where app_id=?"
        //   528: iconst_1       
        //   529: anewarray       Ljava/lang/String;
        //   532: dup            
        //   533: iconst_0       
        //   534: aload_1        
        //   535: aastore        
        //   536: invokevirtual   android/database/sqlite/SQLiteDatabase.execSQL:(Ljava/lang/String;[Ljava/lang/Object;)V
        //   539: goto            588
        //   542: astore_1       
        //   543: aload           6
        //   545: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   548: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   551: invokevirtual   com/google/android/gms/measurement/internal/n3.o:()Lcom/google/android/gms/measurement/internal/l3;
        //   554: ldc             "Error clearing complex main event"
        //   556: aload_1        
        //   557: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   560: goto            588
        //   563: aload_0        
        //   564: getfield        com/google/android/gms/measurement/internal/ta.d:Lcom/google/android/gms/measurement/internal/xa;
        //   567: getfield        com/google/android/gms/measurement/internal/o9.b:Lcom/google/android/gms/measurement/internal/z9;
        //   570: invokevirtual   com/google/android/gms/measurement/internal/z9.U:()Lcom/google/android/gms/measurement/internal/k;
        //   573: aload_1        
        //   574: aload           5
        //   576: aload_0        
        //   577: getfield        com/google/android/gms/measurement/internal/ta.c:J
        //   580: aload_0        
        //   581: getfield        com/google/android/gms/measurement/internal/ta.a:Lcom/google/android/gms/internal/measurement/u4;
        //   584: invokevirtual   com/google/android/gms/measurement/internal/k.u:(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/u4;)Z
        //   587: pop            
        //   588: new             Ljava/util/ArrayList;
        //   591: dup            
        //   592: invokespecial   java/util/ArrayList.<init>:()V
        //   595: astore_1       
        //   596: aload_0        
        //   597: getfield        com/google/android/gms/measurement/internal/ta.a:Lcom/google/android/gms/internal/measurement/u4;
        //   600: invokevirtual   com/google/android/gms/internal/measurement/u4.E:()Ljava/util/List;
        //   603: invokeinterface java/util/List.iterator:()Ljava/util/Iterator;
        //   608: astore          6
        //   610: aload           6
        //   612: invokeinterface java/util/Iterator.hasNext:()Z
        //   617: ifeq            667
        //   620: aload           6
        //   622: invokeinterface java/util/Iterator.next:()Ljava/lang/Object;
        //   627: checkcast       Lcom/google/android/gms/internal/measurement/y4;
        //   630: astore          7
        //   632: aload_0        
        //   633: getfield        com/google/android/gms/measurement/internal/ta.d:Lcom/google/android/gms/measurement/internal/xa;
        //   636: getfield        com/google/android/gms/measurement/internal/o9.b:Lcom/google/android/gms/measurement/internal/z9;
        //   639: invokevirtual   com/google/android/gms/measurement/internal/z9.f0:()Lcom/google/android/gms/measurement/internal/ba;
        //   642: pop            
        //   643: aload_2        
        //   644: aload           7
        //   646: invokevirtual   com/google/android/gms/internal/measurement/y4.C:()Ljava/lang/String;
        //   649: invokestatic    com/google/android/gms/measurement/internal/ba.l:(Lcom/google/android/gms/internal/measurement/u4;Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/y4;
        //   652: ifnonnull       610
        //   655: aload_1        
        //   656: aload           7
        //   658: invokeinterface java/util/List.add:(Ljava/lang/Object;)Z
        //   663: pop            
        //   664: goto            610
        //   667: aload_1        
        //   668: invokeinterface java/util/List.isEmpty:()Z
        //   673: ifne            688
        //   676: aload_1        
        //   677: aload           4
        //   679: invokeinterface java/util/List.addAll:(Ljava/util/Collection;)Z
        //   684: pop            
        //   685: goto            712
        //   688: aload_0        
        //   689: getfield        com/google/android/gms/measurement/internal/ta.d:Lcom/google/android/gms/measurement/internal/xa;
        //   692: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   695: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   698: invokevirtual   com/google/android/gms/measurement/internal/n3.q:()Lcom/google/android/gms/measurement/internal/l3;
        //   701: ldc_w           "No unique parameters in main event. eventName"
        //   704: aload           8
        //   706: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   709: aload           4
        //   711: astore_1       
        //   712: aload           8
        //   714: astore          6
        //   716: aload_1        
        //   717: astore          7
        //   719: goto            897
        //   722: aload_0        
        //   723: getfield        com/google/android/gms/measurement/internal/ta.d:Lcom/google/android/gms/measurement/internal/xa;
        //   726: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   729: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   732: invokevirtual   com/google/android/gms/measurement/internal/n3.q:()Lcom/google/android/gms/measurement/internal/l3;
        //   735: ldc_w           "Extra parameter without existing main event. eventName, eventId"
        //   738: aload           8
        //   740: aload           5
        //   742: invokevirtual   com/google/android/gms/measurement/internal/l3.c:(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/Object;)V
        //   745: aconst_null    
        //   746: areturn        
        //   747: astore_1       
        //   748: aload           7
        //   750: astore_2       
        //   751: aload_2        
        //   752: ifnull          761
        //   755: aload_2        
        //   756: invokeinterface android/database/Cursor.close:()V
        //   761: aload_1        
        //   762: athrow         
        //   763: aload_0        
        //   764: aload           5
        //   766: putfield        com/google/android/gms/measurement/internal/ta.b:Ljava/lang/Long;
        //   769: aload_0        
        //   770: aload_2        
        //   771: putfield        com/google/android/gms/measurement/internal/ta.a:Lcom/google/android/gms/internal/measurement/u4;
        //   774: aload_0        
        //   775: getfield        com/google/android/gms/measurement/internal/ta.d:Lcom/google/android/gms/measurement/internal/xa;
        //   778: getfield        com/google/android/gms/measurement/internal/o9.b:Lcom/google/android/gms/measurement/internal/z9;
        //   781: invokevirtual   com/google/android/gms/measurement/internal/z9.f0:()Lcom/google/android/gms/measurement/internal/ba;
        //   784: pop            
        //   785: lconst_0       
        //   786: invokestatic    java/lang/Long.valueOf:(J)Ljava/lang/Long;
        //   789: astore          6
        //   791: aload_2        
        //   792: ldc_w           "_epc"
        //   795: invokestatic    com/google/android/gms/measurement/internal/ba.m:(Lcom/google/android/gms/internal/measurement/u4;Ljava/lang/String;)Ljava/lang/Object;
        //   798: astore          7
        //   800: aload           7
        //   802: ifnull          809
        //   805: aload           7
        //   807: astore          6
        //   809: aload           6
        //   811: checkcast       Ljava/lang/Long;
        //   814: invokevirtual   java/lang/Long.longValue:()J
        //   817: lstore          10
        //   819: aload_0        
        //   820: lload           10
        //   822: putfield        com/google/android/gms/measurement/internal/ta.c:J
        //   825: lload           10
        //   827: lconst_0       
        //   828: lcmp           
        //   829: ifgt            862
        //   832: aload_0        
        //   833: getfield        com/google/android/gms/measurement/internal/ta.d:Lcom/google/android/gms/measurement/internal/xa;
        //   836: getfield        com/google/android/gms/measurement/internal/t5.a:Lcom/google/android/gms/measurement/internal/z4;
        //   839: invokevirtual   com/google/android/gms/measurement/internal/z4.c:()Lcom/google/android/gms/measurement/internal/n3;
        //   842: invokevirtual   com/google/android/gms/measurement/internal/n3.q:()Lcom/google/android/gms/measurement/internal/l3;
        //   845: ldc_w           "Complex event with zero extra param count. eventName"
        //   848: aload_3        
        //   849: invokevirtual   com/google/android/gms/measurement/internal/l3.b:(Ljava/lang/String;Ljava/lang/Object;)V
        //   852: aload_3        
        //   853: astore          6
        //   855: aload           4
        //   857: astore          7
        //   859: goto            897
        //   862: aload_0        
        //   863: getfield        com/google/android/gms/measurement/internal/ta.d:Lcom/google/android/gms/measurement/internal/xa;
        //   866: getfield        com/google/android/gms/measurement/internal/o9.b:Lcom/google/android/gms/measurement/internal/z9;
        //   869: invokevirtual   com/google/android/gms/measurement/internal/z9.U:()Lcom/google/android/gms/measurement/internal/k;
        //   872: aload_1        
        //   873: aload           5
        //   875: invokestatic    com/google/android/gms/common/internal/x.k:(Ljava/lang/Object;)Ljava/lang/Object;
        //   878: checkcast       Ljava/lang/Long;
        //   881: aload_0        
        //   882: getfield        com/google/android/gms/measurement/internal/ta.c:J
        //   885: aload_2        
        //   886: invokevirtual   com/google/android/gms/measurement/internal/k.u:(Ljava/lang/String;Ljava/lang/Long;JLcom/google/android/gms/internal/measurement/u4;)Z
        //   889: pop            
        //   890: aload           4
        //   892: astore          7
        //   894: aload_3        
        //   895: astore          6
        //   897: aload_2        
        //   898: invokevirtual   com/google/android/gms/internal/measurement/j9.p:()Lcom/google/android/gms/internal/measurement/f9;
        //   901: checkcast       Lcom/google/android/gms/internal/measurement/t4;
        //   904: astore_1       
        //   905: aload_1        
        //   906: aload           6
        //   908: invokevirtual   com/google/android/gms/internal/measurement/t4.E:(Ljava/lang/String;)Lcom/google/android/gms/internal/measurement/t4;
        //   911: pop            
        //   912: aload_1        
        //   913: invokevirtual   com/google/android/gms/internal/measurement/t4.C:()Lcom/google/android/gms/internal/measurement/t4;
        //   916: pop            
        //   917: aload_1        
        //   918: aload           7
        //   920: invokevirtual   com/google/android/gms/internal/measurement/t4.z:(Ljava/lang/Iterable;)Lcom/google/android/gms/internal/measurement/t4;
        //   923: pop            
        //   924: aload_1        
        //   925: invokevirtual   com/google/android/gms/internal/measurement/f9.n:()Lcom/google/android/gms/internal/measurement/j9;
        //   928: checkcast       Lcom/google/android/gms/internal/measurement/u4;
        //   931: areturn        
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type                                     
        //  -----  -----  -----  -----  -----------------------------------------
        //  164    192    355    359    Landroid/database/sqlite/SQLiteException;
        //  164    192    349    355    Any
        //  196    206    345    349    Landroid/database/sqlite/SQLiteException;
        //  196    206    747    751    Any
        //  210    226    345    349    Landroid/database/sqlite/SQLiteException;
        //  210    226    747    751    Any
        //  243    252    345    349    Landroid/database/sqlite/SQLiteException;
        //  243    252    747    751    Any
        //  256    266    345    349    Landroid/database/sqlite/SQLiteException;
        //  256    266    747    751    Any
        //  270    287    314    345    Ljava/io/IOException;
        //  270    287    345    349    Landroid/database/sqlite/SQLiteException;
        //  270    287    747    751    Any
        //  291    301    345    349    Landroid/database/sqlite/SQLiteException;
        //  291    301    747    751    Any
        //  319    342    345    349    Landroid/database/sqlite/SQLiteException;
        //  319    342    747    751    Any
        //  363    380    747    751    Any
        //  521    539    542    563    Landroid/database/sqlite/SQLiteException;
        // 
        // The error that occurred was:
        // 
        // java.lang.IllegalStateException: Expression is linked from several locations: Label_0239:
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
}
