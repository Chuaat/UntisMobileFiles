// 
// Decompiled by Procyon v0.5.36
// 

package com.google.firebase.installations;

import java.nio.channels.spi.AbstractInterruptibleChannel;
import android.util.Log;
import java.io.IOException;
import java.nio.channels.OverlappingFileLockException;
import java.io.RandomAccessFile;
import java.io.File;
import android.content.Context;
import java.nio.channels.FileLock;
import java.nio.channels.FileChannel;

class d
{
    private static final String c = "CrossProcessLock";
    private final FileChannel a;
    private final FileLock b;
    
    private d(final FileChannel a, final FileLock b) {
        this.a = a;
        this.b = b;
    }
    
    static d a(Context ex, String lock) {
        Object channel = null;
        Label_0085: {
            try {
                ex = (OverlappingFileLockException)new RandomAccessFile(new File(((Context)ex).getFilesDir(), lock), "rw");
                channel = ((RandomAccessFile)ex).getChannel();
                try {
                    lock = (String)((FileChannel)channel).lock();
                    try {
                        return new d((FileChannel)channel, (FileLock)lock);
                    }
                    catch (OverlappingFileLockException ex) {}
                    catch (Error ex) {}
                    catch (IOException ex) {}
                }
                catch (OverlappingFileLockException ex) {}
                catch (Error ex) {}
                catch (IOException ex2) {}
                lock = null;
                break Label_0085;
            }
            catch (OverlappingFileLockException ex) {}
            catch (Error ex) {}
            catch (IOException ex3) {}
            channel = (lock = null);
        }
        Log.e("CrossProcessLock", "encountered error while creating and acquiring the lock, ignoring", (Throwable)ex);
        if (lock != null) {
            try {
                ((FileLock)lock).release();
            }
            catch (IOException ex4) {}
        }
        Label_0114: {
            if (channel == null) {
                break Label_0114;
            }
            try {
                ((AbstractInterruptibleChannel)channel).close();
                return null;
            }
            catch (IOException ex5) {
                return null;
            }
        }
    }
    
    void b() {
        try {
            this.b.release();
            this.a.close();
        }
        catch (IOException ex) {
            Log.e("CrossProcessLock", "encountered error while releasing, ignoring", (Throwable)ex);
        }
    }
}
