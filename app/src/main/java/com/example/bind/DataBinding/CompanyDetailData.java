package com.example.bind.DataBinding;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.example.bind.BR;

public class CompanyDetailData extends BaseObservable {

    private String bankName,address;
    private int accountNo,ifscCode;

    @Bindable
    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
        notifyPropertyChanged(BR.bankName);
    }

    @Bindable
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
        notifyPropertyChanged(BR.address);
    }

    @Bindable
    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
        notifyPropertyChanged(BR.accountNo);
    }

    @Bindable
    public int getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(int ifscCode) {
        this.ifscCode = ifscCode;
        notifyPropertyChanged(BR.ifscCode);
    }
}
