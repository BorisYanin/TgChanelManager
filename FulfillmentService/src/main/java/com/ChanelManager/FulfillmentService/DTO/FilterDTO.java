package com.ChanelManager.FulfillmentService.DTO;

import java.math.BigInteger;
import java.time.LocalDate;

public class FilterDTO {
  private LocalDate minDateOfCreation;
  private long subscriberCount;
  private BigInteger minPrice;
  private BigInteger maxPrice; // max price?
  private long minPostCount = 0;
  private long maxPostCount;
  private long chanelId;

  // Getters & Setters ===============================
  public long getChanelId() { return chanelId; }

  public void setChanelId(long chanelId) { this.chanelId = chanelId; }

  public LocalDate getMinDateOfCreation() { return minDateOfCreation; }

  public void setMinDateOfCreation(LocalDate minDateOfCreation) {
    this.minDateOfCreation = minDateOfCreation;
  }

  public long getSubscriberCount() { return subscriberCount; }

  public void setSubscriberCount(long subscriberCount) {
    this.subscriberCount = subscriberCount;
  }

  public BigInteger getMinPrice() { return minPrice; }

  public void setMinPrice(BigInteger minPrice) { this.minPrice = minPrice; }

  public BigInteger getMaxPrice() { return maxPrice; }

  public void setMaxPrice(BigInteger maxPrice) { this.maxPrice = maxPrice; }

  public long getMinPostCount() { return minPostCount; }

  public void setMinPostCount(long minPostCount) {
    this.minPostCount = minPostCount;
  }

  public long getMaxPostCount() { return maxPostCount; }

  public void setMaxPostCount(long maxPostCount) {
    this.maxPostCount = maxPostCount;
  }
}
