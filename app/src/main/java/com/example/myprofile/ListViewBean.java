package com.example.myprofile;

public class ListViewBean {
    int hinhanh;
    String tenhinhanh;

    public ListViewBean(){

    }
    public ListViewBean(int hinhanh, String tenhinhanh) {
        this.hinhanh = hinhanh;
        this.tenhinhanh = tenhinhanh;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getTenhinhanh() {
        return tenhinhanh;
    }

    public void setTenhinhanh(String tenhinhanh) {
        this.tenhinhanh = tenhinhanh;
    }
}
