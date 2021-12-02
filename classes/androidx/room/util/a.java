// 
// Decompiled by Procyon v0.5.36
// 

package androidx.room.util;

import java.io.IOException;
import java.io.FileOutputStream;
import java.util.concurrent.locks.ReentrantLock;
import androidx.annotation.j0;
import java.util.HashMap;
import java.nio.channels.FileChannel;
import java.io.File;
import java.util.concurrent.locks.Lock;
import java.util.Map;
import androidx.annotation.t0;

@t0({ t0.a.I })
public class a
{
    private static final Map<String, Lock> e;
    private final File a;
    private final Lock b;
    private final boolean c;
    private FileChannel d;
    
    static {
        e = new HashMap<String, Lock>();
    }
    
    public a(@j0 final String str, @j0 final File parent, final boolean c) {
        final StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".lck");
        final File a = new File(parent, sb.toString());
        this.a = a;
        this.b = a(a.getAbsolutePath());
        this.c = c;
    }
    
    private static Lock a(final String s) {
        final Map<String, Lock> e = a.e;
        synchronized (e) {
            Lock lock;
            if ((lock = e.get(s)) == null) {
                lock = new ReentrantLock();
                e.put(s, lock);
            }
            return lock;
        }
    }
    
    public void b() {
        this.b.lock();
        if (this.c) {
            try {
                (this.d = new FileOutputStream(this.a).getChannel()).lock();
            }
            catch (IOException cause) {
                throw new IllegalStateException("Unable to grab copy lock.", cause);
            }
        }
    }
    
    public void c() {
        final FileChannel d = this.d;
        while (true) {
            if (d == null) {
                break Label_0013;
            }
            try {
                d.close();
                this.b.unlock();
            }
            catch (IOException ex) {
                continue;
            }
            break;
        }
    }
}
