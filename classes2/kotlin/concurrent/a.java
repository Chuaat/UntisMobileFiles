// 
// Decompiled by Procyon v0.5.36
// 

package kotlin.concurrent;

import java.util.concurrent.locks.Lock;
import kotlin.internal.f;
import kotlin.jvm.internal.h0;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import m6.g;
import kotlin.Metadata;

@Metadata(bv = { 1, 0, 3 }, d1 = { "\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a8\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a8\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\u0007\u0010\b\u001a8\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00062\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001¢\u0006\u0004\b\t\u0010\b\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n" }, d2 = { "T", "Ljava/util/concurrent/locks/Lock;", "Lkotlin/Function0;", "action", "b", "(Ljava/util/concurrent/locks/Lock;Ln6/a;)Ljava/lang/Object;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "a", "(Ljava/util/concurrent/locks/ReentrantReadWriteLock;Ln6/a;)Ljava/lang/Object;", "c", "kotlin-stdlib" }, k = 2, mv = { 1, 5, 1 })
@g(name = "LocksKt")
public final class a
{
    @f
    private static final <T> T a(ReentrantReadWriteLock lock, final n6.a<? extends T> a) {
        lock = (ReentrantReadWriteLock)lock.readLock();
        ((ReentrantReadWriteLock.ReadLock)lock).lock();
        try {
            return (T)a.invoke();
        }
        finally {
            h0.d(1);
            ((ReentrantReadWriteLock.ReadLock)lock).unlock();
            h0.c(1);
        }
    }
    
    @f
    private static final <T> T b(final Lock lock, final n6.a<? extends T> a) {
        lock.lock();
        try {
            return (T)a.invoke();
        }
        finally {
            h0.d(1);
            lock.unlock();
            h0.c(1);
        }
    }
    
    @f
    private static final <T> T c(ReentrantReadWriteLock writeLock, final n6.a<? extends T> a) {
        final ReentrantReadWriteLock.ReadLock lock = writeLock.readLock();
        final int writeHoldCount = writeLock.getWriteHoldCount();
        final int n = 0;
        int readHoldCount;
        if (writeHoldCount == 0) {
            readHoldCount = writeLock.getReadHoldCount();
        }
        else {
            readHoldCount = 0;
        }
        for (int i = 0; i < readHoldCount; ++i) {
            lock.unlock();
        }
        writeLock = (ReentrantReadWriteLock)writeLock.writeLock();
        ((ReentrantReadWriteLock.WriteLock)writeLock).lock();
        try {
            return (T)a.invoke();
        }
        finally {
            h0.d(1);
            for (int j = n; j < readHoldCount; ++j) {
                lock.lock();
            }
            ((ReentrantReadWriteLock.WriteLock)writeLock).unlock();
            h0.c(1);
        }
    }
}
