// 
// Decompiled by Procyon v0.5.36
// 

package com.google.android.gms.common.data;

import java.util.Iterator;
import android.content.ContentValues;
import java.util.HashMap;
import h2.c;
import android.os.Parcel;
import androidx.annotation.RecentlyNullable;
import android.database.CharArrayBuffer;
import java.util.Map;
import android.util.Log;
import java.util.ArrayList;
import android.database.CursorIndexOutOfBoundsException;
import com.google.android.gms.common.internal.x;
import android.database.Cursor;
import androidx.annotation.k0;
import android.database.CursorWindow;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import android.os.Parcelable$Creator;
import h2.d;
import com.google.android.gms.common.annotation.KeepName;
import java.io.Closeable;
import h2.a;

@KeepName
@f2.a
@h2.d.a(creator = "DataHolderCreator", validate = true)
public final class DataHolder extends h2.a implements Closeable
{
    @RecentlyNonNull
    @f2.a
    public static final Parcelable$Creator<DataHolder> CREATOR;
    private static final a Q;
    @g(id = 1000)
    private final int G;
    @c(getter = "getColumns", id = 1)
    private final String[] H;
    private Bundle I;
    @c(getter = "getWindows", id = 2)
    private final CursorWindow[] J;
    @c(getter = "getStatusCode", id = 3)
    private final int K;
    @k0
    @c(getter = "getMetadata", id = 4)
    private final Bundle L;
    private int[] M;
    private int N;
    private boolean O;
    private boolean P;
    
    static {
        CREATOR = (Parcelable$Creator)new o();
        Q = (a)new n(new String[0], null);
    }
    
    @h2.d.b
    DataHolder(@e(id = 1000) final int g, @e(id = 1) final String[] h, @e(id = 2) final CursorWindow[] j, @e(id = 3) final int k, @k0 @e(id = 4) final Bundle l) {
        this.O = false;
        this.P = true;
        this.G = g;
        this.H = h;
        this.J = j;
        this.K = k;
        this.L = l;
    }
    
    @f2.a
    public DataHolder(@RecentlyNonNull final Cursor cursor, @RecentlyNonNull final int n, @k0 final Bundle bundle) {
        this(new i2.a(cursor), n, bundle);
    }
    
    private DataHolder(final a a, final int n, @k0 final Bundle bundle) {
        this(a.a, S5(a, -1), n, null);
    }
    
    private DataHolder(final a a, final int n, @k0 final Bundle bundle, final int n2) {
        this(a.a, S5(a, -1), n, bundle);
    }
    
    private DataHolder(final i2.a a, final int n, @k0 final Bundle bundle) {
        this(a.getColumnNames(), T5(a), n, bundle);
    }
    
    @f2.a
    public DataHolder(@RecentlyNonNull final String[] array, @RecentlyNonNull final CursorWindow[] array2, @RecentlyNonNull final int k, @k0 final Bundle l) {
        this.O = false;
        this.P = true;
        this.G = 1;
        this.H = x.k(array);
        this.J = x.k(array2);
        this.K = k;
        this.L = l;
        this.v5();
    }
    
    @RecentlyNonNull
    @f2.a
    public static a M(@RecentlyNonNull final String[] array) {
        return new a(array, null, null);
    }
    
    private final void Q5(String s, final int n) {
        final Bundle i = this.I;
        if (i == null || !i.containsKey(s)) {
            s = String.valueOf(s);
            if (s.length() != 0) {
                s = "No such column: ".concat(s);
            }
            else {
                s = new String("No such column: ");
            }
            throw new IllegalArgumentException(s);
        }
        if (this.isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        }
        if (n >= 0 && n < this.N) {
            return;
        }
        throw new CursorIndexOutOfBoundsException(n, this.N);
    }
    
    private static CursorWindow[] S5(final a a, int i) {
        i = a.a.length;
        final int n = 0;
        if (i == 0) {
            return new CursorWindow[0];
        }
        final ArrayList f = a.b;
        final int size = f.size();
        CursorWindow cursorWindow = new CursorWindow(false);
        final ArrayList<CursorWindow> list = new ArrayList<CursorWindow>();
        list.add(cursorWindow);
        cursorWindow.setNumColumns(a.a.length);
        i = 0;
        int n2 = 0;
        while (i < size) {
            try {
                if (!cursorWindow.allocRow()) {
                    final StringBuilder sb = new StringBuilder(72);
                    sb.append("Allocating additional cursor window for large data set (row ");
                    sb.append(i);
                    sb.append(")");
                    Log.d("DataHolder", sb.toString());
                    final CursorWindow cursorWindow2 = new CursorWindow(false);
                    cursorWindow2.setStartPosition(i);
                    cursorWindow2.setNumColumns(a.a.length);
                    list.add(cursorWindow2);
                    cursorWindow = cursorWindow2;
                    if (!cursorWindow2.allocRow()) {
                        Log.e("DataHolder", "Unable to allocate row to hold data.");
                        list.remove(cursorWindow2);
                        return list.toArray(new CursorWindow[list.size()]);
                    }
                }
                final Map<K, String> map = f.get(i);
                int n3;
                boolean b;
                String s;
                String value;
                long longValue;
                String value2;
                int length;
                StringBuilder sb2;
                for (n3 = 0, b = true; n3 < a.a.length && b; ++n3) {
                    s = a.a[n3];
                    value = map.get(s);
                    if (value == null) {
                        b = cursorWindow.putNull(i, n3);
                    }
                    else if (value instanceof String) {
                        b = cursorWindow.putString((String)value, i, n3);
                    }
                    else {
                        if (value instanceof Long) {
                            longValue = (long)value;
                        }
                        else {
                            if (value instanceof Integer) {
                                b = cursorWindow.putLong((long)(int)value, i, n3);
                                continue;
                            }
                            if (value instanceof Boolean) {
                                if (value) {
                                    longValue = 1L;
                                }
                                else {
                                    longValue = 0L;
                                }
                            }
                            else {
                                if (value instanceof byte[]) {
                                    b = cursorWindow.putBlob((byte[])(Object)value, i, n3);
                                    continue;
                                }
                                if (value instanceof Double) {
                                    b = cursorWindow.putDouble((double)value, i, n3);
                                    continue;
                                }
                                if (value instanceof Float) {
                                    b = cursorWindow.putDouble((double)(float)value, i, n3);
                                    continue;
                                }
                                value2 = String.valueOf(value);
                                length = String.valueOf(s).length();
                                i = value2.length();
                                sb2 = new StringBuilder(length + 32 + i);
                                sb2.append("Unsupported object for column ");
                                sb2.append(s);
                                sb2.append(": ");
                                sb2.append(value2);
                                throw new IllegalArgumentException(sb2.toString());
                            }
                        }
                        b = cursorWindow.putLong(longValue, i, n3);
                    }
                }
                if (!b) {
                    if (n2 != 0) {
                        throw new b("Could not add the value to a new CursorWindow. The size of value may be larger than what a CursorWindow can handle.");
                    }
                    final StringBuilder sb3 = new StringBuilder(74);
                    sb3.append("Couldn't populate window data for row ");
                    sb3.append(i);
                    sb3.append(" - allocating new window.");
                    Log.d("DataHolder", sb3.toString());
                    cursorWindow.freeLastRow();
                    cursorWindow = new CursorWindow(false);
                    cursorWindow.setStartPosition(i);
                    cursorWindow.setNumColumns(a.a.length);
                    list.add(cursorWindow);
                    --i;
                    n2 = 1;
                }
                else {
                    n2 = 0;
                }
                ++i;
                continue;
            }
            catch (RuntimeException ex) {
                int size2;
                for (size2 = list.size(), i = n; i < size2; ++i) {
                    list.get(i).close();
                }
                throw ex;
            }
            break;
        }
        return list.toArray(new CursorWindow[list.size()]);
    }
    
    private static CursorWindow[] T5(final i2.a a) {
        final ArrayList<CursorWindow> list = new ArrayList<CursorWindow>();
        try {
            final int count = a.getCount();
            final CursorWindow window = a.getWindow();
            int numRows;
            if (window != null && window.getStartPosition() == 0) {
                window.acquireReference();
                a.a(null);
                list.add(window);
                numRows = window.getNumRows();
            }
            else {
                numRows = 0;
            }
            while (numRows < count && a.moveToPosition(numRows)) {
                CursorWindow window2 = a.getWindow();
                if (window2 != null) {
                    window2.acquireReference();
                    a.a(null);
                }
                else {
                    window2 = new CursorWindow(false);
                    window2.setStartPosition(numRows);
                    a.fillWindow(numRows, window2);
                }
                if (window2.getNumRows() == 0) {
                    break;
                }
                list.add(window2);
                numRows = window2.getStartPosition() + window2.getNumRows();
            }
            a.close();
            return list.toArray(new CursorWindow[list.size()]);
        }
        finally {
            a.close();
        }
    }
    
    @RecentlyNonNull
    @f2.a
    public static DataHolder g1(@RecentlyNonNull final int n) {
        return new DataHolder(DataHolder.Q, n, null);
    }
    
    @RecentlyNonNull
    @f2.a
    public final long N2(@RecentlyNonNull final String s, @RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        this.Q5(s, n);
        return this.J[n2].getLong(n, this.I.getInt(s));
    }
    
    @RecentlyNonNull
    @f2.a
    public final int O3(@RecentlyNonNull int n) {
        int n2 = 0;
        x.q(n >= 0 && n < this.N);
        int[] m;
        int n3;
        while (true) {
            m = this.M;
            n3 = n2;
            if (n2 >= m.length) {
                break;
            }
            if (n < m[n2]) {
                n3 = n2 - 1;
                break;
            }
            ++n2;
        }
        if ((n = n3) == m.length) {
            n = n3 - 1;
        }
        return n;
    }
    
    @RecentlyNonNull
    @f2.a
    public final byte[] Q1(@RecentlyNonNull final String s, @RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        this.Q5(s, n);
        return this.J[n2].getBlob(n, this.I.getInt(s));
    }
    
    @RecentlyNonNull
    @f2.a
    public final boolean Q4(@RecentlyNonNull final String s, @RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        this.Q5(s, n);
        return this.J[n2].isNull(n, this.I.getInt(s));
    }
    
    public final void R5(@RecentlyNonNull final String s, @RecentlyNonNull final int n, @RecentlyNonNull final int n2, @RecentlyNonNull final CharArrayBuffer charArrayBuffer) {
        this.Q5(s, n);
        this.J[n2].copyStringToBuffer(n, this.I.getInt(s), charArrayBuffer);
    }
    
    @RecentlyNonNull
    @f2.a
    public final boolean U3(@RecentlyNonNull final String s) {
        return this.I.containsKey(s);
    }
    
    @RecentlyNonNull
    public final float U4(@RecentlyNonNull final String s, @RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        this.Q5(s, n);
        return this.J[n2].getFloat(n, this.I.getInt(s));
    }
    
    @RecentlyNonNull
    public final double U5(@RecentlyNonNull final String s, @RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        this.Q5(s, n);
        return this.J[n2].getDouble(n, this.I.getInt(s));
    }
    
    @f2.a
    @Override
    public final void close() {
        synchronized (this) {
            if (!this.O) {
                this.O = true;
                int n = 0;
                while (true) {
                    final CursorWindow[] j = this.J;
                    if (n >= j.length) {
                        break;
                    }
                    j[n].close();
                    ++n;
                }
            }
        }
    }
    
    @Override
    protected final void finalize() throws Throwable {
        try {
            if (this.P && this.J.length > 0 && !this.isClosed()) {
                this.close();
                final String string = this.toString();
                final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(string);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        }
        finally {
            super.finalize();
        }
    }
    
    @RecentlyNonNull
    @f2.a
    public final int getCount() {
        return this.N;
    }
    
    @RecentlyNonNull
    @f2.a
    public final int i3() {
        return this.K;
    }
    
    @RecentlyNonNull
    @f2.a
    public final boolean isClosed() {
        synchronized (this) {
            return this.O;
        }
    }
    
    @RecentlyNonNull
    @f2.a
    public final int j2(@RecentlyNonNull final String s, @RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        this.Q5(s, n);
        return this.J[n2].getInt(n, this.I.getInt(s));
    }
    
    @RecentlyNonNull
    @f2.a
    public final String j3(@RecentlyNonNull final String s, @RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        this.Q5(s, n);
        return this.J[n2].getString(n, this.I.getInt(s));
    }
    
    @RecentlyNonNull
    @f2.a
    public final boolean q1(@RecentlyNonNull final String s, @RecentlyNonNull final int n, @RecentlyNonNull final int n2) {
        this.Q5(s, n);
        return this.J[n2].getLong(n, this.I.getInt(s)) == 1L;
    }
    
    @RecentlyNullable
    @f2.a
    public final Bundle u() {
        return this.L;
    }
    
    public final void v5() {
        this.I = new Bundle();
        final int n = 0;
        int n2 = 0;
        while (true) {
            final String[] h = this.H;
            if (n2 >= h.length) {
                break;
            }
            this.I.putInt(h[n2], n2);
            ++n2;
        }
        this.M = new int[this.J.length];
        int n3 = 0;
        int n4 = n;
        while (true) {
            final CursorWindow[] j = this.J;
            if (n4 >= j.length) {
                break;
            }
            this.M[n4] = n3;
            n3 += this.J[n4].getNumRows() - (n3 - j[n4].getStartPosition());
            ++n4;
        }
        this.N = n3;
    }
    
    public final void writeToParcel(@RecentlyNonNull final Parcel parcel, @RecentlyNonNull final int n) {
        final int a = h2.c.a(parcel);
        h2.c.Y(parcel, 1, this.H, false);
        h2.c.b0(parcel, 2, this.J, n, false);
        h2.c.F(parcel, 3, this.i3());
        h2.c.k(parcel, 4, this.u(), false);
        h2.c.F(parcel, 1000, this.G);
        h2.c.b(parcel, a);
        if ((n & 0x1) != 0x0) {
            this.close();
        }
    }
    
    @f2.a
    public static class a
    {
        private final String[] a;
        private final ArrayList<HashMap<String, Object>> b;
        @k0
        private final String c;
        private final HashMap<Object, Integer> d;
        private boolean e;
        @k0
        private String f;
        
        private a(final String[] array, @k0 final String s) {
            this.a = x.k(array);
            this.b = new ArrayList<HashMap<String, Object>>();
            this.c = null;
            this.d = new HashMap<Object, Integer>();
            this.e = false;
            this.f = null;
        }
        
        @RecentlyNonNull
        @f2.a
        public DataHolder a(@RecentlyNonNull final int n) {
            return new DataHolder(this, n, null, null);
        }
        
        @RecentlyNonNull
        @f2.a
        public DataHolder b(@RecentlyNonNull final int n, @RecentlyNonNull final Bundle bundle) {
            return new DataHolder(this, n, bundle, -1, null);
        }
        
        @RecentlyNonNull
        @f2.a
        public a c(@RecentlyNonNull final ContentValues contentValues) {
            com.google.android.gms.common.internal.d.c(contentValues);
            final HashMap<String, Object> hashMap = new HashMap<String, Object>(contentValues.size());
            for (final Map.Entry<String, V> entry : contentValues.valueSet()) {
                hashMap.put(entry.getKey(), entry.getValue());
            }
            return this.d(hashMap);
        }
        
        @RecentlyNonNull
        public a d(@RecentlyNonNull final HashMap<String, Object> hashMap) {
            com.google.android.gms.common.internal.d.c(hashMap);
            final String c = this.c;
            int intValue = 0;
            Label_0078: {
                if (c != null) {
                    final Object value = hashMap.get(c);
                    if (value != null) {
                        final Integer n = this.d.get(value);
                        if (n != null) {
                            intValue = n;
                            break Label_0078;
                        }
                        this.d.put(value, this.b.size());
                    }
                }
                intValue = -1;
            }
            if (intValue == -1) {
                this.b.add(hashMap);
            }
            else {
                this.b.remove(intValue);
                this.b.add(intValue, hashMap);
            }
            this.e = false;
            return this;
        }
    }
    
    public static final class b extends RuntimeException
    {
        public b(final String message) {
            super(message);
        }
    }
}
