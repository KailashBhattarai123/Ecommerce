package com.kailash.Demo3.model;


public class PaymentModel {


    // DTO class for payment model
    private int id;
    private String type;
    private double amount;
    private double taxAmount;
    private double psc;
    private double pdc;
    private double totalAmount;
    private String productCode;
    private String signature;

    private String transactionUUID;


    public PaymentModel() {
    }

    public PaymentModel(int id, String type, double amount, double taxAmount, double psc, double pdc, double totalAmount, String productCode, String signature) {
        this.id = id;
        this.type = type;
        this.amount = amount;
        this.taxAmount = taxAmount;
        this.psc = psc;
        this.pdc = pdc;
        this.totalAmount = totalAmount;
        this.productCode = productCode;
        this.signature = signature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public double getPsc() {
        return psc;
    }

    public void setPsc(double psc) {
        this.psc = psc;
    }

    public double getPdc() {
        return pdc;
    }

    public void setPdc(double pdc) {
        this.pdc = pdc;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getTransactionUUID() {
        return transactionUUID;
    }

    public void setTransactionUUID(String transactionUUID) {
        this.transactionUUID = transactionUUID;
    }
}
