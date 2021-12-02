// 
// Decompiled by Procyon v0.5.36
// 

package io.realm.internal;

import java.util.Iterator;
import io.realm.i0;
import java.util.ArrayList;
import c6.h;
import java.util.List;
import java.io.Closeable;

@Keep
public abstract class RealmNotifier implements Closeable
{
    private List<Runnable> finishedSendingNotificationsCallbacks;
    private final m.a<b> onChangeCallBack;
    private m<b> realmObserverPairs;
    private OsSharedRealm sharedRealm;
    private List<Runnable> startSendingNotificationsCallbacks;
    private List<Runnable> transactionCallbacks;
    
    protected RealmNotifier(@h final OsSharedRealm sharedRealm) {
        this.realmObserverPairs = new m<b>();
        this.onChangeCallBack = new m.a<b>() {
            public void b(final RealmNotifier.b b, final Object o) {
                if (RealmNotifier.this.sharedRealm != null && !RealmNotifier.this.sharedRealm.isClosed()) {
                    b.b(o);
                }
            }
        };
        this.transactionCallbacks = new ArrayList<Runnable>();
        this.startSendingNotificationsCallbacks = new ArrayList<Runnable>();
        this.finishedSendingNotificationsCallbacks = new ArrayList<Runnable>();
        this.sharedRealm = sharedRealm;
    }
    
    private void removeAllChangeListeners() {
        this.realmObserverPairs.b();
    }
    
    public void addBeginSendingNotificationsCallback(final Runnable runnable) {
        this.startSendingNotificationsCallbacks.add(runnable);
    }
    
    public <T> void addChangeListener(final T t, final i0<T> i0) {
        this.realmObserverPairs.a(new b(t, i0));
    }
    
    public void addFinishedSendingNotificationsCallback(final Runnable runnable) {
        this.finishedSendingNotificationsCallbacks.add(runnable);
    }
    
    public void addTransactionCallback(final Runnable runnable) {
        this.transactionCallbacks.add(runnable);
    }
    
    void beforeNotify() {
        this.sharedRealm.invalidateIterators();
    }
    
    @Override
    public void close() {
        this.removeAllChangeListeners();
        this.startSendingNotificationsCallbacks.clear();
        this.finishedSendingNotificationsCallbacks.clear();
    }
    
    void didChange() {
        this.realmObserverPairs.c(this.onChangeCallBack);
        if (!this.transactionCallbacks.isEmpty()) {
            final List<Runnable> transactionCallbacks = this.transactionCallbacks;
            this.transactionCallbacks = new ArrayList<Runnable>();
            final Iterator<Runnable> iterator = transactionCallbacks.iterator();
            while (iterator.hasNext()) {
                iterator.next().run();
            }
        }
    }
    
    void didSendNotifications() {
        for (int i = 0; i < this.startSendingNotificationsCallbacks.size(); ++i) {
            this.finishedSendingNotificationsCallbacks.get(i).run();
        }
    }
    
    public int getListenersListSize() {
        return this.realmObserverPairs.g();
    }
    
    public abstract boolean post(final Runnable p0);
    
    public <E> void removeChangeListener(final E e, final i0<E> i0) {
        this.realmObserverPairs.e(e, i0);
    }
    
    public <E> void removeChangeListeners(final E e) {
        this.realmObserverPairs.f(e);
    }
    
    void willSendNotifications() {
        for (int i = 0; i < this.startSendingNotificationsCallbacks.size(); ++i) {
            this.startSendingNotificationsCallbacks.get(i).run();
        }
    }
    
    private static class b<T> extends m.b<T, i0<T>>
    {
        b(final T t, final i0<T> i0) {
            super(t, i0);
        }
        
        private void b(final T t) {
            if (t != null) {
                ((i0)super.b).a(t);
            }
        }
    }
}
