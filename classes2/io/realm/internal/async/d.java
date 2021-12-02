// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal.async;

import java.util.concurrent.Future;
import java.io.FileFilter;
import java.io.File;
import java.util.regex.Pattern;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.ThreadPoolExecutor;

public class d extends ThreadPoolExecutor
{
    private static final String J = "/sys/devices/system/cpu/";
    private static final int K;
    private static final int L = 100;
    private boolean G;
    private ReentrantLock H;
    private Condition I;
    
    static {
        K = a();
    }
    
    private d(final int corePoolSize, final int maximumPoolSize) {
        super(corePoolSize, maximumPoolSize, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(100));
        final ReentrantLock h = new ReentrantLock();
        this.H = h;
        this.I = h.newCondition();
    }
    
    @SuppressFBWarnings({ "DMI_HARDCODED_ABSOLUTE_FILENAME" })
    private static int a() {
        int n;
        if ((n = b("/sys/devices/system/cpu/", "cpu[0-9]+")) <= 0) {
            n = Runtime.getRuntime().availableProcessors();
        }
        final int n2 = 1;
        int n3;
        if (n <= 0) {
            n3 = n2;
        }
        else {
            n3 = 1 + n * 2;
        }
        return n3;
    }
    
    private static int b(final String pathname, final String regex) {
        final Pattern compile = Pattern.compile(regex);
        int length = 0;
        try {
            final File[] listFiles = new File(pathname).listFiles(new FileFilter() {
                @Override
                public boolean accept(final File file) {
                    return compile.matcher(file.getName()).matches();
                }
            });
            if (listFiles != null) {
                length = listFiles.length;
            }
            return length;
        }
        catch (SecurityException ex) {
            return length;
        }
    }
    
    public static d c() {
        final int k = d.K;
        return new d(k, k);
    }
    
    public static d d() {
        return new d(1, 1);
    }
    
    @Override
    protected void beforeExecute(final Thread t, final Runnable r) {
        super.beforeExecute(t, r);
        this.H.lock();
        while (true) {
            try {
                try {
                    while (this.G) {
                        this.I.await();
                    }
                    this.H.unlock();
                }
                finally {}
            }
            catch (InterruptedException ex) {
                t.interrupt();
                continue;
            }
            break;
        }
        return;
        this.H.unlock();
    }
    
    public void e() {
        this.H.lock();
        try {
            this.G = true;
        }
        finally {
            this.H.unlock();
        }
    }
    
    public void f() {
        this.H.lock();
        try {
            this.G = false;
            this.I.signalAll();
        }
        finally {
            this.H.unlock();
        }
    }
    
    public Future<?> g(final Runnable runnable) {
        return super.submit(new b(runnable));
    }
}
