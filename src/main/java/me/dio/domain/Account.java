package me.dio.domain;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity(name = "tb_account")
public class Account {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, nullable = false)
  private String accountNumber;
  private String agency;

  @Column(scale = 2, precision = 13, nullable = false)
  private BigDecimal accountBalance;

  @Column(scale = 2, precision = 13, nullable = false)
  private BigDecimal accountLimit;

  public Account() {
  }

  public Account(String accountNumber, String agency, BigDecimal accountBalance, BigDecimal accountLimit) {
    this.accountNumber = accountNumber;
    this.agency = agency;
    this.accountBalance = accountBalance;
    this.accountLimit = accountLimit;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getAgency() {
    return agency;
  }

  public void setAgency(String agency) {
    this.agency = agency;
  }

  public BigDecimal getAccountBalance() {
    return accountBalance;
  }

  public void setAccountBalance(BigDecimal accountBalance) {
    this.accountBalance = accountBalance;
  }

  public BigDecimal getAccountLimit() {
    return accountLimit;
  }

  public void setAccountLimit(BigDecimal accountLimit) {
    this.accountLimit = accountLimit;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

}
