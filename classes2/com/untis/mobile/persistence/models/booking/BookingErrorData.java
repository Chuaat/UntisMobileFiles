// 
// Decompiled by Procyon v0.5.36
// 

package com.untis.mobile.persistence.models.booking;

import android.os.Parcel;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import java.io.Serializable;

public class BookingErrorData implements Serializable, Parcelable
{
    public static final Parcelable$Creator<BookingErrorData> CREATOR;
    private BookingErrorCategory category;
    
    static {
        CREATOR = (Parcelable$Creator)new Parcelable$Creator<BookingErrorData>() {
            public BookingErrorData createFromParcel(final Parcel parcel) {
                return new BookingErrorData(parcel);
            }
            
            public BookingErrorData[] newArray(final int n) {
                return new BookingErrorData[n];
            }
        };
    }
    
    public BookingErrorData() {
        this.category = BookingErrorCategory.Default;
    }
    
    protected BookingErrorData(final Parcel parcel) {
        this.category = BookingErrorCategory.fromValue(parcel.readInt());
    }
    
    public BookingErrorData(final BookingErrorCategory category) {
        this.category = category;
    }
    
    public int describeContents() {
        return 0;
    }
    
    public BookingErrorCategory getCategory() {
        return this.category;
    }
    
    public void setCategory(final BookingErrorCategory category) {
        this.category = category;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        parcel.writeInt(this.category.getValue());
    }
}
