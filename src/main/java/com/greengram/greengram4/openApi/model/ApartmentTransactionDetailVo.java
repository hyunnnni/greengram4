package com.greengram.greengram4.openApi.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonSetter;


public class ApartmentTransactionDetailVo {
    private int dealAmount;
    private String buildYear;
    private String dealYear;
    private String dealMonth;
    private String dealDay;
    private String dong;
    private String apartmentName;
    private float areaForExclusiveUse;
    private String jibun;
    private int floor;

    @JsonSetter("거래금액")
    public void setDealAmount(String dealAmount) {//문자열로 받고 정수로 변환해서 넣어줌
        this.dealAmount = Integer.parseInt(dealAmount.replaceAll(",", "").trim());//원본은 건들지 않음
        //replaceAll ","인 애들을 ""로 만들겠다는 의미
        //trim 앞 뒤 공백 날려주는 메소드
    }
    @JsonSetter("건축년도")
    public void setBuildYear(String buildYear) {
        this.buildYear = buildYear;
    }
    @JsonSetter("년")
    public void setDealYear(String dealYear) {
        this.dealYear = dealYear;
    }
    @JsonSetter("월")
    public void setDealMonth(String dealMonth) {
        this.dealMonth = dealMonth;
    }
    @JsonSetter("일")
    public void setDealDay(String dealDay) {
        this.dealDay = dealDay;
    }
    @JsonSetter("법정동")
    public void setDong(String dong) {
        this.dong = dong;
    }
    @JsonSetter("아파트")
    public void setApartmentName(String apartmentName) {
        this.apartmentName = apartmentName;
    }
    @JsonSetter("전용면적")
    public void setAreaForExclusiveUse(float areaForExclusiveUse) {
        this.areaForExclusiveUse = areaForExclusiveUse;
    }
    @JsonSetter("지번")
    public void setJibun(String jibun) {
        this.jibun = jibun;
    }
    @JsonSetter("층")
    public void setFloor(int floor) {
        this.floor = floor;
    }
@JsonGetter("dealAmount")
    public int getDealAmount() {
        return dealAmount;
    }
    @JsonGetter("buildYear")
    public String getBuildYear() {
        return buildYear;
    }
    @JsonGetter("dealYear")
    public String getDealYear() {
        return dealYear;
    }
    @JsonGetter("dealMonth")
    public String getDealMonth() {
        return dealMonth;
    }
    @JsonGetter("dealDay")

    public String getDealDay() {
        return dealDay;
    }
    @JsonGetter("dong")

    public String getDong() {
        return dong;
    }
    @JsonGetter("apartmentName")

    public String getApartmentName() {
        return apartmentName;
    }
    @JsonGetter("areaForExclusiveUse")

    public float getAreaForExclusiveUse() {
        return areaForExclusiveUse;
    }
    @JsonGetter("jibun")

    public String getJibun() {
        return jibun;
    }
    @JsonGetter("floor")

    public int getFloor() {
        return floor;
    }

}
