// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models;

import android.os.Parcel;
import androidx.annotation.j0;
import android.os.Parcelable$Creator;
import android.os.Parcelable;

public class SimpleEntity implements Parcelable
{
    public static final Parcelable$Creator<SimpleEntity> CREATOR;
    private long id;
    @j0
    private EntityType type;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<SimpleEntity>() {
            public SimpleEntity createFromParcel(final Parcel parcel) {
                return new SimpleEntity(parcel);
            }
            
            public SimpleEntity[] newArray(final int n) {
                return new SimpleEntity[n];
            }
        };
    }
    
    protected SimpleEntity(final Parcel parcel) {
        this.type = EntityType.NONE;
        this.id = parcel.readLong();
        this.type = EntityType.Companion.findBy(parcel.readInt());
    }
    
    public SimpleEntity(@j0 final EntityType type, final long id) {
        this.type = EntityType.NONE;
        this.type = type;
        this.id = id;
    }
    
    public int describeContents() {
        return 0;
    }
    
    @Override
    public boolean equals(final Object o) {
        boolean b = true;
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        final SimpleEntity simpleEntity = (SimpleEntity)o;
        if (this.id != simpleEntity.id) {
            return false;
        }
        if (this.type != simpleEntity.type) {
            b = false;
        }
        return b;
    }
    
    public long getId() {
        return this.id;
    }
    
    @j0
    public EntityType getType() {
        return this.type;
    }
    
    @Override
    public int hashCode() {
        final int hashCode = this.type.hashCode();
        final long id = this.id;
        return hashCode * 31 + (int)(id ^ id >>> 32);
    }
    
    public void setId(final long id) {
        this.id = id;
    }
    
    public void setType(@j0 final EntityType type) {
        this.type = type;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeLong(this.id);
        parcel.writeInt(this.type.getWebuntisId());
    }
}
