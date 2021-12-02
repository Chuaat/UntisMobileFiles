// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.dashboard.persistence.model.reminder;

import androidx.sqlite.db.e;
import androidx.lifecycle.LiveData;
import java.util.ArrayList;
import java.util.Iterator;
import androidx.room.util.g;
import kotlin.j2;
import androidx.room.j0;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.sqlite.db.f;
import java.util.concurrent.Callable;
import androidx.room.v2;
import kotlin.coroutines.d;
import java.util.Collections;
import java.util.List;
import androidx.sqlite.db.h;
import androidx.room.a3;
import com.untis.mobile.utils.persistence.typeconverter.c;
import androidx.room.u0;
import androidx.room.t0;
import com.untis.mobile.utils.persistence.typeconverter.b;
import androidx.room.r2;

public final class ReminderDao_Impl implements ReminderDao
{
    private final r2 __db;
    private final b __defaultTypeConverter;
    private final t0<Reminder> __deletionAdapterOfReminder;
    private final u0<Reminder> __insertionAdapterOfReminder;
    private final c __jodaTimeTypeConverter;
    private final a3 __preparedStmtOfDelete;
    private final a3 __preparedStmtOfDelete_1;
    
    public ReminderDao_Impl(final r2 _db) {
        this.__defaultTypeConverter = new b();
        this.__jodaTimeTypeConverter = new c();
        this.__db = _db;
        this.__insertionAdapterOfReminder = new u0<Reminder>(_db) {
            public void bind(final h h, final Reminder reminder) {
                ((e)h).l2(1, reminder.getId());
                if (reminder.getProfileId() == null) {
                    ((e)h).c4(2);
                }
                else {
                    ((e)h).K0(2, reminder.getProfileId());
                }
                final Long k = ReminderDao_Impl.this.__defaultTypeConverter.k(reminder.getSourceType());
                if (k == null) {
                    ((e)h).c4(3);
                }
                else {
                    ((e)h).l2(3, (long)k);
                }
                ((e)h).l2(4, reminder.getSourceId());
                if (reminder.getTitle() == null) {
                    ((e)h).c4(5);
                }
                else {
                    ((e)h).K0(5, reminder.getTitle());
                }
                if (reminder.getDescription() == null) {
                    ((e)h).c4(6);
                }
                else {
                    ((e)h).K0(6, reminder.getDescription());
                }
                final String a = ReminderDao_Impl.this.__jodaTimeTypeConverter.a(reminder.getDateTime());
                if (a == null) {
                    ((e)h).c4(7);
                }
                else {
                    ((e)h).K0(7, a);
                }
                final Long j = ReminderDao_Impl.this.__defaultTypeConverter.j(reminder.getSourceSubType());
                if (j == null) {
                    ((e)h).c4(8);
                }
                else {
                    ((e)h).l2(8, (long)j);
                }
            }
            
            public String createQuery() {
                return "INSERT OR REPLACE INTO `reminder` (`reminder_id`,`profile_id`,`source_type`,`source_id`,`title`,`description`,`date_time`,`subtype`) VALUES (nullif(?, 0),?,?,?,?,?,?,?)";
            }
        };
        this.__deletionAdapterOfReminder = new t0<Reminder>(_db) {
            public void bind(final h h, final Reminder reminder) {
                ((e)h).l2(1, reminder.getId());
            }
            
            public String createQuery() {
                return "DELETE FROM `reminder` WHERE `reminder_id` = ?";
            }
        };
        this.__preparedStmtOfDelete = new a3(_db) {
            public String createQuery() {
                return "DELETE FROM reminder WHERE profile_id = ? AND source_type = ? AND source_id = ? AND subtype = ?";
            }
        };
        this.__preparedStmtOfDelete_1 = new a3(_db) {
            public String createQuery() {
                return "DELETE FROM reminder WHERE profile_id = ? AND source_type = ? AND source_id = ?";
            }
        };
    }
    
    public static List<Class<?>> getRequiredConverters() {
        return Collections.emptyList();
    }
    
    @Override
    public Object count(final String s, final ReminderType reminderType, final long n, final d<? super Integer> d) {
        final v2 d2 = v2.d("SELECT COUNT(r.reminder_id) FROM reminder r WHERE profile_id = ? AND source_type = ? AND source_id = ?", 3);
        if (s == null) {
            d2.c4(1);
        }
        else {
            d2.K0(1, s);
        }
        final Long k = this.__defaultTypeConverter.k(reminderType);
        if (k == null) {
            d2.c4(2);
        }
        else {
            d2.l2(2, (long)k);
        }
        d2.l2(3, n);
        return j0.b(this.__db, false, androidx.room.util.c.a(), (Callable)new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                final r2 access$200 = ReminderDao_Impl.this.__db;
                final v2 val$_statement = d2;
                final Integer n = null;
                final Cursor d = androidx.room.util.c.d(access$200, (f)val$_statement, false, (CancellationSignal)null);
                Integer value = n;
                try {
                    if (d.moveToFirst()) {
                        if (d.isNull(0)) {
                            value = n;
                        }
                        else {
                            value = d.getInt(0);
                        }
                    }
                    return value;
                }
                finally {
                    d.close();
                    d2.release();
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object delete(final Reminder reminder, final d<? super j2> d) {
        return j0.c(this.__db, true, (Callable)new Callable<j2>() {
            @Override
            public j2 call() throws Exception {
                ReminderDao_Impl.this.__db.e();
                try {
                    ReminderDao_Impl.this.__deletionAdapterOfReminder.handle((Object)reminder);
                    ReminderDao_Impl.this.__db.I();
                    return j2.a;
                }
                finally {
                    ReminderDao_Impl.this.__db.k();
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object delete(final String s, final ReminderType reminderType, final long n, final ReminderSubtype reminderSubtype, final d<? super j2> d) {
        return j0.c(this.__db, true, (Callable)new Callable<j2>() {
            @Override
            public j2 call() throws Exception {
                final h acquire = ReminderDao_Impl.this.__preparedStmtOfDelete.acquire();
                final String val$profileId = s;
                if (val$profileId == null) {
                    ((e)acquire).c4(1);
                }
                else {
                    ((e)acquire).K0(1, val$profileId);
                }
                final Long k = ReminderDao_Impl.this.__defaultTypeConverter.k(reminderType);
                if (k == null) {
                    ((e)acquire).c4(2);
                }
                else {
                    ((e)acquire).l2(2, (long)k);
                }
                ((e)acquire).l2(3, n);
                final Long j = ReminderDao_Impl.this.__defaultTypeConverter.j(reminderSubtype);
                if (j == null) {
                    ((e)acquire).c4(4);
                }
                else {
                    ((e)acquire).l2(4, (long)j);
                }
                ReminderDao_Impl.this.__db.e();
                try {
                    acquire.c1();
                    ReminderDao_Impl.this.__db.I();
                    return j2.a;
                }
                finally {
                    ReminderDao_Impl.this.__db.k();
                    ReminderDao_Impl.this.__preparedStmtOfDelete.release(acquire);
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object delete(final String s, final ReminderType reminderType, final long n, final d<? super j2> d) {
        return j0.c(this.__db, true, (Callable)new Callable<j2>() {
            @Override
            public j2 call() throws Exception {
                final h acquire = ReminderDao_Impl.this.__preparedStmtOfDelete_1.acquire();
                final String val$profileId = s;
                if (val$profileId == null) {
                    ((e)acquire).c4(1);
                }
                else {
                    ((e)acquire).K0(1, val$profileId);
                }
                final Long k = ReminderDao_Impl.this.__defaultTypeConverter.k(reminderType);
                if (k == null) {
                    ((e)acquire).c4(2);
                }
                else {
                    ((e)acquire).l2(2, (long)k);
                }
                ((e)acquire).l2(3, n);
                ReminderDao_Impl.this.__db.e();
                try {
                    acquire.c1();
                    ReminderDao_Impl.this.__db.I();
                    return j2.a;
                }
                finally {
                    ReminderDao_Impl.this.__db.k();
                    ReminderDao_Impl.this.__preparedStmtOfDelete_1.release(acquire);
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object deleteAllOther(final String s, final ReminderType reminderType, final List<Long> list, final d<? super j2> d) {
        return j0.c(this.__db, true, (Callable)new Callable<j2>() {
            @Override
            public j2 call() throws Exception {
                final StringBuilder c = g.c();
                c.append("DELETE FROM reminder WHERE profile_id = ");
                c.append("?");
                c.append(" AND source_type = ");
                c.append("?");
                c.append(" AND NOT source_id IN (");
                g.a(c, list.size());
                c.append(")");
                final h h = ReminderDao_Impl.this.__db.h(c.toString());
                final String val$profileId = s;
                if (val$profileId == null) {
                    ((e)h).c4(1);
                }
                else {
                    ((e)h).K0(1, val$profileId);
                }
                final Long k = ReminderDao_Impl.this.__defaultTypeConverter.k(reminderType);
                if (k == null) {
                    ((e)h).c4(2);
                }
                else {
                    ((e)h).l2(2, (long)k);
                }
                int n = 3;
                for (final Long n2 : list) {
                    if (n2 == null) {
                        ((e)h).c4(n);
                    }
                    else {
                        ((e)h).l2(n, (long)n2);
                    }
                    ++n;
                }
                ReminderDao_Impl.this.__db.e();
                try {
                    h.c1();
                    ReminderDao_Impl.this.__db.I();
                    return j2.a;
                }
                finally {
                    ReminderDao_Impl.this.__db.k();
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object findAll(final d<? super List<Reminder>> d) {
        return j0.b(this.__db, false, androidx.room.util.c.a(), (Callable)new Callable<List<Reminder>>() {
            final /* synthetic */ v2 val$_statement = v2.d("SELECT * FROM reminder", 0);
            
            @Override
            public List<Reminder> call() throws Exception {
                final Cursor d = androidx.room.util.c.d(ReminderDao_Impl.this.__db, (f)this.val$_statement, false, (CancellationSignal)null);
                try {
                    final int e = androidx.room.util.b.e(d, "reminder_id");
                    final int e2 = androidx.room.util.b.e(d, "profile_id");
                    final int e3 = androidx.room.util.b.e(d, "source_type");
                    final int e4 = androidx.room.util.b.e(d, "source_id");
                    final int e5 = androidx.room.util.b.e(d, "title");
                    final int e6 = androidx.room.util.b.e(d, "description");
                    final int e7 = androidx.room.util.b.e(d, "date_time");
                    final int e8 = androidx.room.util.b.e(d, "subtype");
                    final ArrayList list = new ArrayList<Reminder>(d.getCount());
                    while (d.moveToNext()) {
                        final long long1 = d.getLong(e);
                        String string;
                        if (d.isNull(e2)) {
                            string = null;
                        }
                        else {
                            string = d.getString(e2);
                        }
                        Long value;
                        if (d.isNull(e3)) {
                            value = null;
                        }
                        else {
                            value = d.getLong(e3);
                        }
                        final ReminderType f = ReminderDao_Impl.this.__defaultTypeConverter.f(value);
                        final long long2 = d.getLong(e4);
                        String string2;
                        if (d.isNull(e5)) {
                            string2 = null;
                        }
                        else {
                            string2 = d.getString(e5);
                        }
                        String string3;
                        if (d.isNull(e6)) {
                            string3 = null;
                        }
                        else {
                            string3 = d.getString(e6);
                        }
                        String string4;
                        if (d.isNull(e7)) {
                            string4 = null;
                        }
                        else {
                            string4 = d.getString(e7);
                        }
                        final org.joda.time.c b = ReminderDao_Impl.this.__jodaTimeTypeConverter.b(string4);
                        Long value2;
                        if (d.isNull(e8)) {
                            value2 = null;
                        }
                        else {
                            value2 = d.getLong(e8);
                        }
                        list.add(new Reminder(long1, string, f, long2, string2, string3, b, ReminderDao_Impl.this.__defaultTypeConverter.e(value2)));
                    }
                    return (List<Reminder>)list;
                }
                finally {
                    d.close();
                    this.val$_statement.release();
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object findAllBy(final String s, final ReminderType reminderType, final long n, final d<? super List<Reminder>> d) {
        final v2 d2 = v2.d("SELECT * FROM reminder WHERE profile_id = ? AND source_type = ? AND source_id = ?", 3);
        if (s == null) {
            d2.c4(1);
        }
        else {
            d2.K0(1, s);
        }
        final Long k = this.__defaultTypeConverter.k(reminderType);
        if (k == null) {
            d2.c4(2);
        }
        else {
            d2.l2(2, (long)k);
        }
        d2.l2(3, n);
        return j0.b(this.__db, false, androidx.room.util.c.a(), (Callable)new Callable<List<Reminder>>() {
            @Override
            public List<Reminder> call() throws Exception {
                final Cursor d = androidx.room.util.c.d(ReminderDao_Impl.this.__db, (f)d2, false, (CancellationSignal)null);
                try {
                    final int e = androidx.room.util.b.e(d, "reminder_id");
                    final int e2 = androidx.room.util.b.e(d, "profile_id");
                    final int e3 = androidx.room.util.b.e(d, "source_type");
                    final int e4 = androidx.room.util.b.e(d, "source_id");
                    final int e5 = androidx.room.util.b.e(d, "title");
                    final int e6 = androidx.room.util.b.e(d, "description");
                    final int e7 = androidx.room.util.b.e(d, "date_time");
                    final int e8 = androidx.room.util.b.e(d, "subtype");
                    final ArrayList list = new ArrayList<Reminder>(d.getCount());
                    while (d.moveToNext()) {
                        final long long1 = d.getLong(e);
                        String string;
                        if (d.isNull(e2)) {
                            string = null;
                        }
                        else {
                            string = d.getString(e2);
                        }
                        Long value;
                        if (d.isNull(e3)) {
                            value = null;
                        }
                        else {
                            value = d.getLong(e3);
                        }
                        final ReminderType f = ReminderDao_Impl.this.__defaultTypeConverter.f(value);
                        final long long2 = d.getLong(e4);
                        String string2;
                        if (d.isNull(e5)) {
                            string2 = null;
                        }
                        else {
                            string2 = d.getString(e5);
                        }
                        String string3;
                        if (d.isNull(e6)) {
                            string3 = null;
                        }
                        else {
                            string3 = d.getString(e6);
                        }
                        String string4;
                        if (d.isNull(e7)) {
                            string4 = null;
                        }
                        else {
                            string4 = d.getString(e7);
                        }
                        final org.joda.time.c b = ReminderDao_Impl.this.__jodaTimeTypeConverter.b(string4);
                        Long value2;
                        if (d.isNull(e8)) {
                            value2 = null;
                        }
                        else {
                            value2 = d.getLong(e8);
                        }
                        list.add(new Reminder(long1, string, f, long2, string2, string3, b, ReminderDao_Impl.this.__defaultTypeConverter.e(value2)));
                    }
                    return (List<Reminder>)list;
                }
                finally {
                    d.close();
                    d2.release();
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object findBy(final long n, final d<? super Reminder> d) {
        final v2 d2 = v2.d("SELECT * FROM reminder WHERE reminder_id = ?", 1);
        d2.l2(1, n);
        return j0.b(this.__db, false, androidx.room.util.c.a(), (Callable)new Callable<Reminder>() {
            @Override
            public Reminder call() throws Exception {
                final r2 access$200 = ReminderDao_Impl.this.__db;
                final v2 val$_statement = d2;
                Reminder reminder = null;
                final Long n = null;
                final Cursor d = androidx.room.util.c.d(access$200, (f)val$_statement, false, (CancellationSignal)null);
                try {
                    final int e = androidx.room.util.b.e(d, "reminder_id");
                    final int e2 = androidx.room.util.b.e(d, "profile_id");
                    final int e3 = androidx.room.util.b.e(d, "source_type");
                    final int e4 = androidx.room.util.b.e(d, "source_id");
                    final int e5 = androidx.room.util.b.e(d, "title");
                    final int e6 = androidx.room.util.b.e(d, "description");
                    final int e7 = androidx.room.util.b.e(d, "date_time");
                    final int e8 = androidx.room.util.b.e(d, "subtype");
                    if (d.moveToFirst()) {
                        final long long1 = d.getLong(e);
                        String string;
                        if (d.isNull(e2)) {
                            string = null;
                        }
                        else {
                            string = d.getString(e2);
                        }
                        Long value;
                        if (d.isNull(e3)) {
                            value = null;
                        }
                        else {
                            value = d.getLong(e3);
                        }
                        final ReminderType f = ReminderDao_Impl.this.__defaultTypeConverter.f(value);
                        final long long2 = d.getLong(e4);
                        String string2;
                        if (d.isNull(e5)) {
                            string2 = null;
                        }
                        else {
                            string2 = d.getString(e5);
                        }
                        String string3;
                        if (d.isNull(e6)) {
                            string3 = null;
                        }
                        else {
                            string3 = d.getString(e6);
                        }
                        String string4;
                        if (d.isNull(e7)) {
                            string4 = null;
                        }
                        else {
                            string4 = d.getString(e7);
                        }
                        final org.joda.time.c b = ReminderDao_Impl.this.__jodaTimeTypeConverter.b(string4);
                        Long value2;
                        if (d.isNull(e8)) {
                            value2 = n;
                        }
                        else {
                            value2 = d.getLong(e8);
                        }
                        reminder = new Reminder(long1, string, f, long2, string2, string3, b, ReminderDao_Impl.this.__defaultTypeConverter.e(value2));
                    }
                    return reminder;
                }
                finally {
                    d.close();
                    d2.release();
                }
            }
        }, (d)d);
    }
    
    @Override
    public Object findBy(final String s, final ReminderType reminderType, final long n, final ReminderSubtype reminderSubtype, final d<? super Reminder> d) {
        final v2 d2 = v2.d("SELECT * FROM reminder WHERE profile_id = ? AND source_type = ? AND source_id = ? AND subtype = ?", 4);
        if (s == null) {
            d2.c4(1);
        }
        else {
            d2.K0(1, s);
        }
        final Long k = this.__defaultTypeConverter.k(reminderType);
        if (k == null) {
            d2.c4(2);
        }
        else {
            d2.l2(2, (long)k);
        }
        d2.l2(3, n);
        final Long j = this.__defaultTypeConverter.j(reminderSubtype);
        if (j == null) {
            d2.c4(4);
        }
        else {
            d2.l2(4, (long)j);
        }
        return j0.b(this.__db, false, androidx.room.util.c.a(), (Callable)new Callable<Reminder>() {
            @Override
            public Reminder call() throws Exception {
                final r2 access$200 = ReminderDao_Impl.this.__db;
                final v2 val$_statement = d2;
                Reminder reminder = null;
                final Long n = null;
                final Cursor d = androidx.room.util.c.d(access$200, (f)val$_statement, false, (CancellationSignal)null);
                try {
                    final int e = androidx.room.util.b.e(d, "reminder_id");
                    final int e2 = androidx.room.util.b.e(d, "profile_id");
                    final int e3 = androidx.room.util.b.e(d, "source_type");
                    final int e4 = androidx.room.util.b.e(d, "source_id");
                    final int e5 = androidx.room.util.b.e(d, "title");
                    final int e6 = androidx.room.util.b.e(d, "description");
                    final int e7 = androidx.room.util.b.e(d, "date_time");
                    final int e8 = androidx.room.util.b.e(d, "subtype");
                    if (d.moveToFirst()) {
                        final long long1 = d.getLong(e);
                        String string;
                        if (d.isNull(e2)) {
                            string = null;
                        }
                        else {
                            string = d.getString(e2);
                        }
                        Long value;
                        if (d.isNull(e3)) {
                            value = null;
                        }
                        else {
                            value = d.getLong(e3);
                        }
                        final ReminderType f = ReminderDao_Impl.this.__defaultTypeConverter.f(value);
                        final long long2 = d.getLong(e4);
                        String string2;
                        if (d.isNull(e5)) {
                            string2 = null;
                        }
                        else {
                            string2 = d.getString(e5);
                        }
                        String string3;
                        if (d.isNull(e6)) {
                            string3 = null;
                        }
                        else {
                            string3 = d.getString(e6);
                        }
                        String string4;
                        if (d.isNull(e7)) {
                            string4 = null;
                        }
                        else {
                            string4 = d.getString(e7);
                        }
                        final org.joda.time.c b = ReminderDao_Impl.this.__jodaTimeTypeConverter.b(string4);
                        Long value2;
                        if (d.isNull(e8)) {
                            value2 = n;
                        }
                        else {
                            value2 = d.getLong(e8);
                        }
                        reminder = new Reminder(long1, string, f, long2, string2, string3, b, ReminderDao_Impl.this.__defaultTypeConverter.e(value2));
                    }
                    return reminder;
                }
                finally {
                    d.close();
                    d2.release();
                }
            }
        }, (d)d);
    }
    
    @Override
    public LiveData<List<Reminder>> observeFor(final String s, final ReminderType reminderType, final long n) {
        final v2 d = v2.d("SELECT * FROM reminder WHERE profile_id = ? AND source_type = ? AND source_id = ?", 3);
        if (s == null) {
            d.c4(1);
        }
        else {
            d.K0(1, s);
        }
        final Long k = this.__defaultTypeConverter.k(reminderType);
        if (k == null) {
            d.c4(2);
        }
        else {
            d.l2(2, (long)k);
        }
        d.l2(3, n);
        return (LiveData<List<Reminder>>)this.__db.n().f(new String[] { "reminder" }, false, (Callable)new Callable<List<Reminder>>() {
            @Override
            public List<Reminder> call() throws Exception {
                final Cursor d = androidx.room.util.c.d(ReminderDao_Impl.this.__db, (f)d, false, (CancellationSignal)null);
                try {
                    final int e = androidx.room.util.b.e(d, "reminder_id");
                    final int e2 = androidx.room.util.b.e(d, "profile_id");
                    final int e3 = androidx.room.util.b.e(d, "source_type");
                    final int e4 = androidx.room.util.b.e(d, "source_id");
                    final int e5 = androidx.room.util.b.e(d, "title");
                    final int e6 = androidx.room.util.b.e(d, "description");
                    final int e7 = androidx.room.util.b.e(d, "date_time");
                    final int e8 = androidx.room.util.b.e(d, "subtype");
                    final ArrayList list = new ArrayList<Reminder>(d.getCount());
                    while (d.moveToNext()) {
                        final long long1 = d.getLong(e);
                        String string;
                        if (d.isNull(e2)) {
                            string = null;
                        }
                        else {
                            string = d.getString(e2);
                        }
                        Long value;
                        if (d.isNull(e3)) {
                            value = null;
                        }
                        else {
                            value = d.getLong(e3);
                        }
                        final ReminderType f = ReminderDao_Impl.this.__defaultTypeConverter.f(value);
                        final long long2 = d.getLong(e4);
                        String string2;
                        if (d.isNull(e5)) {
                            string2 = null;
                        }
                        else {
                            string2 = d.getString(e5);
                        }
                        String string3;
                        if (d.isNull(e6)) {
                            string3 = null;
                        }
                        else {
                            string3 = d.getString(e6);
                        }
                        String string4;
                        if (d.isNull(e7)) {
                            string4 = null;
                        }
                        else {
                            string4 = d.getString(e7);
                        }
                        final org.joda.time.c b = ReminderDao_Impl.this.__jodaTimeTypeConverter.b(string4);
                        Long value2;
                        if (d.isNull(e8)) {
                            value2 = null;
                        }
                        else {
                            value2 = d.getLong(e8);
                        }
                        list.add(new Reminder(long1, string, f, long2, string2, string3, b, ReminderDao_Impl.this.__defaultTypeConverter.e(value2)));
                    }
                    return (List<Reminder>)list;
                }
                finally {
                    d.close();
                }
            }
            
            @Override
            protected void finalize() {
                d.release();
            }
        });
    }
    
    @Override
    public Object save(final Reminder reminder, final d<? super Long> d) {
        return j0.c(this.__db, true, (Callable)new Callable<Long>() {
            @Override
            public Long call() throws Exception {
                ReminderDao_Impl.this.__db.e();
                try {
                    final long insertAndReturnId = ReminderDao_Impl.this.__insertionAdapterOfReminder.insertAndReturnId((Object)reminder);
                    ReminderDao_Impl.this.__db.I();
                    ReminderDao_Impl.this.__db.k();
                    return insertAndReturnId;
                }
                finally {
                    ReminderDao_Impl.this.__db.k();
                }
            }
        }, (d)d);
    }
}
