package com.nissandigital.salesforcepoc.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

@Entity
@Table(name = "Dummy_Point")
@JsonDeserialize
public class DummyPoint implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name ="CardNumberHouse")
	private String cardNumberHouse;
	@Column(name="PointNissanDealer")
	private int PointNissanDealer;
	@Column(name="PointMerchant")
	private int pointMerchant;
	@Column(name="PointExtra")
	private int pointExtra;
	@Column(name="PointTotal")
	private int pointTotal;
	@Column(name="RefundAmountCarPurchaseValue")
	private int refundAmountCarPurchaseValue;
	@Column(name="RefundAmountCarPurchaseMileage")
	private int refundAmountCarPurchaseMileage;
	@Column(name="RefundAmountGeneralValue")
	private int refundAmountGeneralValue;
	@Column(name="RefundAmountGeneralMileage")
	private int refundAmountGeneralMileage;
	@Column(name="ExpiringPoint")
	private int expiringPoint;
	
	//setters and getters
	public String getCardNumberHouse() {
		return cardNumberHouse;
	}
	public void setCardNumberHouse(String cardNumberHouse) {
		this.cardNumberHouse = cardNumberHouse;
	}
	public int getPointNissanDealer() {
		return PointNissanDealer;
	}
	public void setPointNissanDealer(int pointNissanDealer) {
		PointNissanDealer = pointNissanDealer;
	}
	public int getPointMerchant() {
		return pointMerchant;
	}
	public void setPointMerchant(int pointMerchant) {
		this.pointMerchant = pointMerchant;
	}
	public int getPointExtra() {
		return pointExtra;
	}
	public void setPointExtra(int pointExtra) {
		this.pointExtra = pointExtra;
	}
	public int getPointTotal() {
		return pointTotal;
	}
	public void setPointTotal(int pointTotal) {
		this.pointTotal = pointTotal;
	}
	public int getRefundAmountCarPurchaseValue() {
		return refundAmountCarPurchaseValue;
	}
	public void setRefundAmountCarPurchaseValue(int refundAmountCarPurchaseValue) {
		this.refundAmountCarPurchaseValue = refundAmountCarPurchaseValue;
	}
	public int getRefundAmountCarPurchaseMileage() {
		return refundAmountCarPurchaseMileage;
	}
	public void setRefundAmountCarPurchaseMileage(int refundAmountCarPurchaseMileage) {
		this.refundAmountCarPurchaseMileage = refundAmountCarPurchaseMileage;
	}
	public int getRefundAmountGeneralValue() {
		return refundAmountGeneralValue;
	}
	public void setRefundAmountGeneralValue(int refundAmountGeneralValue) {
		this.refundAmountGeneralValue = refundAmountGeneralValue;
	}
	public int getRefundAmountGeneralMileage() {
		return refundAmountGeneralMileage;
	}
	public void setRefundAmountGeneralMileage(int refundAmountGeneralMileage) {
		this.refundAmountGeneralMileage = refundAmountGeneralMileage;
	}
	public int getExpiringPoint() {
		return expiringPoint;
	}
	public void setExpiringPoint(int expiringPoint) {
		this.expiringPoint = expiringPoint;
	}
	
	@Override
	public String toString() {
		return "DummyPoint [cardNumberHouse=" + cardNumberHouse + ", PointNissanDealer=" + PointNissanDealer
				+ ", pointMerchant=" + pointMerchant + ", pointExtra=" + pointExtra + ", pointTotal=" + pointTotal
				+ ", refundAmountCarPurchaseValue=" + refundAmountCarPurchaseValue + ", refundAmountCarPurchaseMileage="
				+ refundAmountCarPurchaseMileage + ", refundAmountGeneralValue=" + refundAmountGeneralValue
				+ ", refundAmountGeneralMileage=" + refundAmountGeneralMileage + ", expiringPoint=" + expiringPoint
				+ "]";
	}
	
	
	
	
}
