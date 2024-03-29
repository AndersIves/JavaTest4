package com.hand.exam1.pojo;


import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;

public class Address {

  @Id
  @KeySql(useGeneratedKeys = true)
  private long addressId;
  private String address;
  private String address2;
  private String district;
  private long cityId;
  private String postalCode;
  private String phone;
  private java.sql.Timestamp lastUpdate;

  @Override
  public String toString() {
    return "Address{" +
            "addressId=" + addressId +
            ", address='" + address + '\'' +
            ", address2='" + address2 + '\'' +
            ", district='" + district + '\'' +
            ", cityId=" + cityId +
            ", postalCode='" + postalCode + '\'' +
            ", phone='" + phone + '\'' +
            ", lastUpdate=" + lastUpdate +
            '}';
  }

  public long getAddressId() {
    return addressId;
  }

  public void setAddressId(long addressId) {
    this.addressId = addressId;
  }


  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }


  public String getAddress2() {
    return address2;
  }

  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  public String getDistrict() {
    return district;
  }

  public void setDistrict(String district) {
    this.district = district;
  }


  public long getCityId() {
    return cityId;
  }

  public void setCityId(long cityId) {
    this.cityId = cityId;
  }


  public String getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  public java.sql.Timestamp getLastUpdate() {
    return lastUpdate;
  }

  public void setLastUpdate(java.sql.Timestamp lastUpdate) {
    this.lastUpdate = lastUpdate;
  }

}
