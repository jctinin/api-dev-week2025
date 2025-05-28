package me.dio.domain;

import java.math.BigDecimal;

import jakarta.persistence.*;

@Entity(name = "tb_card")
public class Card {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, nullable = false)
  private String number;

  @Column(name = "additional_limit", scale = 13, precision = 2, nullable = false)
  private BigDecimal limit;

  public Card() {
  }

  public Card(String number, BigDecimal limit) {
    this.number = number;
    this.limit = limit;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public BigDecimal getLimit() {
    return limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

}
