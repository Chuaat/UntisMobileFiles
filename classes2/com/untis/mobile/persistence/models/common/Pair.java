// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.common;

import android.os.Parcel;
import androidx.annotation.k0;
import com.untis.mobile.persistence.models.masterdata.Teacher;
import com.untis.mobile.persistence.models.masterdata.Subject;
import com.untis.mobile.persistence.models.masterdata.Room;
import com.untis.mobile.persistence.models.masterdata.Klasse;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class Pair<Element extends Parcelable> implements Parcelable
{
    public static final Parcelable$Creator<Pair> CREATOR;
    public static final Parcelable$Creator<Pair<Klasse>> CREATOR_KLASSEN;
    public static final Parcelable$Creator<Pair<Room>> CREATOR_ROOM;
    public static final Parcelable$Creator<Pair<Subject>> CREATOR_SUBJECT;
    public static final Parcelable$Creator<Pair<Teacher>> CREATOR_TEACHER;
    @k0
    private Element current;
    @k0
    private Element original;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<Pair>() {
            public Pair createFromParcel(final Parcel parcel) {
                return new Pair(parcel);
            }
            
            public Pair[] newArray(final int n) {
                return new Pair[n];
            }
        };
        CREATOR_KLASSEN = (Parcelable$Creator)new Parcelable$Creator<Pair<Klasse>>() {
            public Pair<Klasse> createFromParcel(final Parcel parcel) {
                return new Pair<Klasse>(parcel);
            }
            
            public Pair<Klasse>[] newArray(final int n) {
                return (Pair<Klasse>[])new Pair[n];
            }
        };
        CREATOR_SUBJECT = (Parcelable$Creator)new Parcelable$Creator<Pair<Subject>>() {
            public Pair<Subject> createFromParcel(final Parcel parcel) {
                return new Pair<Subject>(parcel);
            }
            
            public Pair<Subject>[] newArray(final int n) {
                return (Pair<Subject>[])new Pair[n];
            }
        };
        CREATOR_ROOM = (Parcelable$Creator)new Parcelable$Creator<Pair<Room>>() {
            public Pair<Room> createFromParcel(final Parcel parcel) {
                return new Pair<Room>(parcel);
            }
            
            public Pair<Room>[] newArray(final int n) {
                return (Pair<Room>[])new Pair[n];
            }
        };
        CREATOR_TEACHER = (Parcelable$Creator)new Parcelable$Creator<Pair<Teacher>>() {
            public Pair<Teacher> createFromParcel(final Parcel parcel) {
                return new Pair<Teacher>(parcel);
            }
            
            public Pair<Teacher>[] newArray(final int n) {
                return (Pair<Teacher>[])new Pair[n];
            }
        };
    }
    
    protected Pair(final Parcel parcel) {
        final ClassLoader classLoader = Pair.class.getClassLoader();
        this.original = (Element)parcel.readParcelable(classLoader);
        this.current = (Element)parcel.readParcelable(classLoader);
    }
    
    public Pair(final Element original, final Element current) {
        this.original = original;
        this.current = current;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean equals = true;
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final Pair pair = (Pair)o;
            final Parcelable original = this.original;
            Label_0064: {
                if (original != null) {
                    if (original.equals(pair.original)) {
                        break Label_0064;
                    }
                }
                else if (pair.original == null) {
                    break Label_0064;
                }
                return false;
            }
            final Parcelable current = this.current;
            final Parcelable current2 = pair.current;
            if (current != null) {
                equals = current.equals(current2);
            }
            else if (current2 != null) {
                equals = false;
            }
            return equals;
        }
        return false;
    }
    
    @k0
    public Element getCurrent() {
        return this.current;
    }
    
    @k0
    public Element getOriginal() {
        return this.original;
    }
    
    @Override
    public int hashCode() {
        final Parcelable original = this.original;
        int hashCode = 0;
        int hashCode2;
        if (original != null) {
            hashCode2 = original.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final Parcelable current = this.current;
        if (current != null) {
            hashCode = current.hashCode();
        }
        return hashCode2 * 31 + hashCode;
    }
    
    public void setCurrent(@k0 final Element current) {
        this.current = current;
    }
    
    public void setOriginal(@k0 final Element original) {
        this.original = original;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeParcelable((Parcelable)this.original, n);
        parcel.writeParcelable((Parcelable)this.current, n);
    }
}
