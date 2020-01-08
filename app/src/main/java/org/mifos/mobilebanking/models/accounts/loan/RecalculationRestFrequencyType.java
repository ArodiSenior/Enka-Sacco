package org.mifos.mobilebanking.models.accounts.loan;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Rajan Maurya on 04/03/17.
 */

public class RecalculationRestFrequencyType implements Parcelable {

    @SerializedName("id")
    Integer id;

    @SerializedName("code")
    String code;

    @SerializedName("value")
    String value;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(this.id);
        dest.writeString(this.code);
        dest.writeString(this.value);
    }

    public RecalculationRestFrequencyType() {
    }

    protected RecalculationRestFrequencyType(Parcel in) {
        this.id = (Integer) in.readValue(Integer.class.getClassLoader());
        this.code = in.readString();
        this.value = in.readString();
    }

    public static final Parcelable.Creator<RecalculationRestFrequencyType> CREATOR =
            new Parcelable.Creator<RecalculationRestFrequencyType>() {
                @Override
                public RecalculationRestFrequencyType createFromParcel(Parcel source) {
                    return new RecalculationRestFrequencyType(source);
                }

                @Override
                public RecalculationRestFrequencyType[] newArray(int size) {
                    return new RecalculationRestFrequencyType[size];
                }
            };
}