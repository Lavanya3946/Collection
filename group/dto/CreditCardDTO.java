package com.xworkz.group.dto;

import java.time.LocalDate;

public class CreditCardDTO {
    private  String  type;
    private  long  no;
    private LocalDate expireDate;
    private  int cvv;

    public  void CreditCardDTO(){

    }

    public CreditCardDTO(String type, long no, LocalDate expireDate, int cvv) {
        this.type = type;
        this.no = no;
        this.expireDate = expireDate;
        this.cvv = cvv;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public long getNo() {
        return no;
    }

    public void setNo(long no) {
        this.no = no;
    }

    public LocalDate getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(LocalDate expireDate) {
        this.expireDate = expireDate;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
    }

    @Override
    public String toString() {
        return "CreditCardDTO{" +
                "type='" + type + '\'' +
                ", no='" + no + '\'' +
                ", expireDate=" + expireDate +
                ", cvv=" + cvv +
                '}';
    }
}
