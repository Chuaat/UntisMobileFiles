// 
// Decompiled by Procyon v0.5.36
// 

package androidx.work.impl.background.systemjob;

import androidx.work.impl.WorkDatabase;
import androidx.room.r2;
import androidx.work.impl.model.r;
import androidx.work.impl.model.s;
import android.text.TextUtils;
import java.util.HashSet;
import android.os.PersistableBundle;
import android.content.ComponentName;
import androidx.annotation.k0;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Iterator;
import java.util.List;
import android.app.job.JobInfo;
import androidx.annotation.b1;
import androidx.annotation.j0;
import androidx.work.q;
import androidx.work.impl.j;
import android.app.job.JobScheduler;
import android.content.Context;
import androidx.annotation.t0;
import androidx.annotation.p0;
import androidx.work.impl.e;

@p0(23)
@t0({ t0.a.H })
public class b implements e
{
    private static final String K;
    private final Context G;
    private final JobScheduler H;
    private final j I;
    private final a J;
    
    static {
        K = q.f("SystemJobScheduler");
    }
    
    public b(@j0 final Context context, @j0 final j j) {
        this(context, j, (JobScheduler)context.getSystemService("jobscheduler"), new a(context));
    }
    
    @b1
    public b(final Context g, final j i, final JobScheduler h, final a j) {
        this.G = g;
        this.I = i;
        this.H = h;
        this.J = j;
    }
    
    public static void b(@j0 final Context context) {
        final JobScheduler jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            final List<JobInfo> g = g(context, jobScheduler);
            if (g != null && !g.isEmpty()) {
                final Iterator<JobInfo> iterator = g.iterator();
                while (iterator.hasNext()) {
                    d(jobScheduler, iterator.next().getId());
                }
            }
        }
    }
    
    private static void d(@j0 final JobScheduler jobScheduler, final int i) {
        try {
            jobScheduler.cancel(i);
        }
        finally {
            final Throwable t;
            q.c().b(b.K, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", i), t);
        }
    }
    
    @k0
    private static List<Integer> f(@j0 final Context context, @j0 final JobScheduler jobScheduler, @j0 final String s) {
        final List<JobInfo> g = g(context, jobScheduler);
        if (g == null) {
            return null;
        }
        final ArrayList<Integer> list = new ArrayList<Integer>(2);
        for (final JobInfo jobInfo : g) {
            if (s.equals(h(jobInfo))) {
                list.add(jobInfo.getId());
            }
        }
        return list;
    }
    
    @k0
    private static List<JobInfo> g(@j0 final Context context, @j0 final JobScheduler jobScheduler) {
        List<JobInfo> list = null;
        try {
            jobScheduler.getAllPendingJobs();
        }
        finally {
            final Throwable t;
            q.c().b(b.K, "getAllPendingJobs() is not reliable on this device.", t);
            list = null;
        }
        if (list == null) {
            return null;
        }
        final ArrayList list2 = new ArrayList<JobInfo>(list.size());
        final ComponentName componentName = new ComponentName(context, (Class)SystemJobService.class);
        for (final JobInfo jobInfo : list) {
            if (componentName.equals((Object)jobInfo.getService())) {
                list2.add(jobInfo);
            }
        }
        return (List<JobInfo>)list2;
    }
    
    @k0
    private static String h(@j0 final JobInfo jobInfo) {
        final PersistableBundle extras = jobInfo.getExtras();
        Label_0027: {
            if (extras == null) {
                break Label_0027;
            }
            try {
                if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                    return extras.getString("EXTRA_WORK_SPEC_ID");
                }
                return null;
            }
            catch (NullPointerException ex) {
                return null;
            }
        }
    }
    
    public static boolean i(@j0 final Context context, @j0 j m) {
        final JobScheduler jobScheduler = (JobScheduler)context.getSystemService("jobscheduler");
        final List<JobInfo> g = g(context, jobScheduler);
        final List<String> a = m.M().R().a();
        final boolean b = false;
        int size;
        if (g != null) {
            size = g.size();
        }
        else {
            size = 0;
        }
        final HashSet set = new HashSet<String>(size);
        if (g != null && !g.isEmpty()) {
            for (final JobInfo jobInfo : g) {
                final String h = h(jobInfo);
                if (!TextUtils.isEmpty((CharSequence)h)) {
                    set.add(h);
                }
                else {
                    d(jobScheduler, jobInfo.getId());
                }
            }
        }
        final Iterator<String> iterator2 = a.iterator();
        while (true) {
            do {
                final boolean b2 = b;
                if (iterator2.hasNext()) {
                    continue;
                }
                if (b2) {
                    m = (j)m.M();
                    ((r2)m).e();
                    try {
                        final s u = ((WorkDatabase)m).U();
                        final Iterator<String> iterator3 = a.iterator();
                        while (iterator3.hasNext()) {
                            u.c(iterator3.next(), -1L);
                        }
                        ((r2)m).I();
                    }
                    finally {
                        ((r2)m).k();
                    }
                }
                return b2;
            } while (set.contains(iterator2.next()));
            q.c().a(androidx.work.impl.background.systemjob.b.K, "Reconciling jobs", new Throwable[0]);
            final boolean b2 = true;
            continue;
        }
    }
    
    @Override
    public void a(@j0 final r... p0) {
        // 
        // This method could not be decompiled.
        // 
        // Original Bytecode:
        // 
        //     1: getfield        androidx/work/impl/background/systemjob/b.I:Landroidx/work/impl/j;
        //     4: invokevirtual   androidx/work/impl/j.M:()Landroidx/work/impl/WorkDatabase;
        //     7: astore_2       
        //     8: new             Landroidx/work/impl/utils/c;
        //    11: dup            
        //    12: aload_2        
        //    13: invokespecial   androidx/work/impl/utils/c.<init>:(Landroidx/work/impl/WorkDatabase;)V
        //    16: astore_3       
        //    17: aload_1        
        //    18: arraylength    
        //    19: istore          4
        //    21: iconst_0       
        //    22: istore          5
        //    24: iload           5
        //    26: iload           4
        //    28: if_icmpge       460
        //    31: aload_1        
        //    32: iload           5
        //    34: aaload         
        //    35: astore          6
        //    37: aload_2        
        //    38: invokevirtual   androidx/room/r2.e:()V
        //    41: aload_2        
        //    42: invokevirtual   androidx/work/impl/WorkDatabase.U:()Landroidx/work/impl/model/s;
        //    45: aload           6
        //    47: getfield        androidx/work/impl/model/r.a:Ljava/lang/String;
        //    50: invokeinterface androidx/work/impl/model/s.t:(Ljava/lang/String;)Landroidx/work/impl/model/r;
        //    55: astore          7
        //    57: aload           7
        //    59: ifnonnull       130
        //    62: invokestatic    androidx/work/q.c:()Landroidx/work/q;
        //    65: astore          8
        //    67: getstatic       androidx/work/impl/background/systemjob/b.K:Ljava/lang/String;
        //    70: astore          9
        //    72: new             Ljava/lang/StringBuilder;
        //    75: astore          7
        //    77: aload           7
        //    79: invokespecial   java/lang/StringBuilder.<init>:()V
        //    82: aload           7
        //    84: ldc_w           "Skipping scheduling "
        //    87: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //    90: pop            
        //    91: aload           7
        //    93: aload           6
        //    95: getfield        androidx/work/impl/model/r.a:Ljava/lang/String;
        //    98: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   101: pop            
        //   102: aload           7
        //   104: ldc_w           " because it's no longer in the DB"
        //   107: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   110: pop            
        //   111: aload           8
        //   113: aload           9
        //   115: aload           7
        //   117: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   120: iconst_0       
        //   121: anewarray       Ljava/lang/Throwable;
        //   124: invokevirtual   androidx/work/q.h:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
        //   127: goto            206
        //   130: aload           7
        //   132: getfield        androidx/work/impl/model/r.b:Landroidx/work/c0$a;
        //   135: getstatic       androidx/work/c0$a.G:Landroidx/work/c0$a;
        //   138: if_acmpeq       213
        //   141: invokestatic    androidx/work/q.c:()Landroidx/work/q;
        //   144: astore          9
        //   146: getstatic       androidx/work/impl/background/systemjob/b.K:Ljava/lang/String;
        //   149: astore          8
        //   151: new             Ljava/lang/StringBuilder;
        //   154: astore          7
        //   156: aload           7
        //   158: invokespecial   java/lang/StringBuilder.<init>:()V
        //   161: aload           7
        //   163: ldc_w           "Skipping scheduling "
        //   166: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   169: pop            
        //   170: aload           7
        //   172: aload           6
        //   174: getfield        androidx/work/impl/model/r.a:Ljava/lang/String;
        //   177: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   180: pop            
        //   181: aload           7
        //   183: ldc_w           " because it is no longer enqueued"
        //   186: invokevirtual   java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
        //   189: pop            
        //   190: aload           9
        //   192: aload           8
        //   194: aload           7
        //   196: invokevirtual   java/lang/StringBuilder.toString:()Ljava/lang/String;
        //   199: iconst_0       
        //   200: anewarray       Ljava/lang/Throwable;
        //   203: invokevirtual   androidx/work/q.h:(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V
        //   206: aload_2        
        //   207: invokevirtual   androidx/room/r2.I:()V
        //   210: goto            443
        //   213: aload_2        
        //   214: invokevirtual   androidx/work/impl/WorkDatabase.R:()Landroidx/work/impl/model/j;
        //   217: aload           6
        //   219: getfield        androidx/work/impl/model/r.a:Ljava/lang/String;
        //   222: invokeinterface androidx/work/impl/model/j.c:(Ljava/lang/String;)Landroidx/work/impl/model/i;
        //   227: astore          7
        //   229: aload           7
        //   231: ifnull          244
        //   234: aload           7
        //   236: getfield        androidx/work/impl/model/i.b:I
        //   239: istore          10
        //   241: goto            270
        //   244: aload_3        
        //   245: aload_0        
        //   246: getfield        androidx/work/impl/background/systemjob/b.I:Landroidx/work/impl/j;
        //   249: invokevirtual   androidx/work/impl/j.F:()Landroidx/work/b;
        //   252: invokevirtual   androidx/work/b.h:()I
        //   255: aload_0        
        //   256: getfield        androidx/work/impl/background/systemjob/b.I:Landroidx/work/impl/j;
        //   259: invokevirtual   androidx/work/impl/j.F:()Landroidx/work/b;
        //   262: invokevirtual   androidx/work/b.f:()I
        //   265: invokevirtual   androidx/work/impl/utils/c.d:(II)I
        //   268: istore          10
        //   270: aload           7
        //   272: ifnonnull       309
        //   275: new             Landroidx/work/impl/model/i;
        //   278: astore          7
        //   280: aload           7
        //   282: aload           6
        //   284: getfield        androidx/work/impl/model/r.a:Ljava/lang/String;
        //   287: iload           10
        //   289: invokespecial   androidx/work/impl/model/i.<init>:(Ljava/lang/String;I)V
        //   292: aload_0        
        //   293: getfield        androidx/work/impl/background/systemjob/b.I:Landroidx/work/impl/j;
        //   296: invokevirtual   androidx/work/impl/j.M:()Landroidx/work/impl/WorkDatabase;
        //   299: invokevirtual   androidx/work/impl/WorkDatabase.R:()Landroidx/work/impl/model/j;
        //   302: aload           7
        //   304: invokeinterface androidx/work/impl/model/j.b:(Landroidx/work/impl/model/i;)V
        //   309: aload_0        
        //   310: aload           6
        //   312: iload           10
        //   314: invokevirtual   androidx/work/impl/background/systemjob/b.j:(Landroidx/work/impl/model/r;I)V
        //   317: getstatic       android/os/Build$VERSION.SDK_INT:I
        //   320: bipush          23
        //   322: if_icmpne       206
        //   325: aload_0        
        //   326: getfield        androidx/work/impl/background/systemjob/b.G:Landroid/content/Context;
        //   329: aload_0        
        //   330: getfield        androidx/work/impl/background/systemjob/b.H:Landroid/app/job/JobScheduler;
        //   333: aload           6
        //   335: getfield        androidx/work/impl/model/r.a:Ljava/lang/String;
        //   338: invokestatic    androidx/work/impl/background/systemjob/b.f:(Landroid/content/Context;Landroid/app/job/JobScheduler;Ljava/lang/String;)Ljava/util/List;
        //   341: astore          7
        //   343: aload           7
        //   345: ifnull          206
        //   348: aload           7
        //   350: iload           10
        //   352: invokestatic    java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
        //   355: invokeinterface java/util/List.indexOf:(Ljava/lang/Object;)I
        //   360: istore          10
        //   362: iload           10
        //   364: iflt            377
        //   367: aload           7
        //   369: iload           10
        //   371: invokeinterface java/util/List.remove:(I)Ljava/lang/Object;
        //   376: pop            
        //   377: aload           7
        //   379: invokeinterface java/util/List.isEmpty:()Z
        //   384: ifne            406
        //   387: aload           7
        //   389: iconst_0       
        //   390: invokeinterface java/util/List.get:(I)Ljava/lang/Object;
        //   395: checkcast       Ljava/lang/Integer;
        //   398: invokevirtual   java/lang/Integer.intValue:()I
        //   401: istore          10
        //   403: goto            432
        //   406: aload_3        
        //   407: aload_0        
        //   408: getfield        androidx/work/impl/background/systemjob/b.I:Landroidx/work/impl/j;
        //   411: invokevirtual   androidx/work/impl/j.F:()Landroidx/work/b;
        //   414: invokevirtual   androidx/work/b.h:()I
        //   417: aload_0        
        //   418: getfield        androidx/work/impl/background/systemjob/b.I:Landroidx/work/impl/j;
        //   421: invokevirtual   androidx/work/impl/j.F:()Landroidx/work/b;
        //   424: invokevirtual   androidx/work/b.f:()I
        //   427: invokevirtual   androidx/work/impl/utils/c.d:(II)I
        //   430: istore          10
        //   432: aload_0        
        //   433: aload           6
        //   435: iload           10
        //   437: invokevirtual   androidx/work/impl/background/systemjob/b.j:(Landroidx/work/impl/model/r;I)V
        //   440: goto            206
        //   443: aload_2        
        //   444: invokevirtual   androidx/room/r2.k:()V
        //   447: iinc            5, 1
        //   450: goto            24
        //   453: astore_1       
        //   454: aload_2        
        //   455: invokevirtual   androidx/room/r2.k:()V
        //   458: aload_1        
        //   459: athrow         
        //   460: return         
        //    Exceptions:
        //  Try           Handler
        //  Start  End    Start  End    Type
        //  -----  -----  -----  -----  ----
        //  41     57     453    460    Any
        //  62     127    453    460    Any
        //  130    206    453    460    Any
        //  206    210    453    460    Any
        //  213    229    453    460    Any
        //  234    241    453    460    Any
        //  244    270    453    460    Any
        //  275    309    453    460    Any
        //  309    343    453    460    Any
        //  348    362    453    460    Any
        //  367    377    453    460    Any
        //  377    403    453    460    Any
        //  406    432    453    460    Any
        //  432    440    453    460    Any
        // 
        // The error that occurred was:
        // 
        // java.lang.NullPointerException
        //     at com.strobel.assembler.ir.StackMappingVisitor.push(StackMappingVisitor.java:290)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.execute(StackMappingVisitor.java:833)
        //     at com.strobel.assembler.ir.StackMappingVisitor$InstructionAnalyzer.visit(StackMappingVisitor.java:398)
        //     at com.strobel.decompiler.ast.AstBuilder.performStackAnalysis(AstBuilder.java:2030)
        //     at com.strobel.decompiler.ast.AstBuilder.build(AstBuilder.java:108)
        //     at com.strobel.decompiler.languages.java.ast.AstMethodBodyBuilder.createMethodBody(AstMethodBodyBuilder.java:211)
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
    
    @Override
    public boolean c() {
        return true;
    }
    
    @Override
    public void e(@j0 final String s) {
        final List<Integer> f = f(this.G, this.H, s);
        if (f != null && !f.isEmpty()) {
            final Iterator<Integer> iterator = f.iterator();
            while (iterator.hasNext()) {
                d(this.H, iterator.next());
            }
            this.I.M().R().d(s);
        }
    }
    
    @b1
    public void j(final r cause, int size) {
        final JobInfo a = this.J.a((r)cause, size);
        q.c().a(b.K, String.format("Scheduling work ID %s Job ID %s", ((r)cause).a, size), new Throwable[0]);
        try {
            this.H.schedule(a);
            goto Label_0091;
        }
        catch (IllegalStateException cause) {
            final List<JobInfo> g = g(this.G, this.H);
            if (g != null) {
                size = g.size();
            }
            else {
                size = 0;
            }
            final String format = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", size, this.I.M().U().i().size(), this.I.F().g());
            q.c().b(b.K, format, new Throwable[0]);
            throw new IllegalStateException(format, cause);
        }
        finally {
            final Throwable t;
            q.c().b(b.K, String.format("Unable to schedule %s", cause), t);
        }
    }
}
