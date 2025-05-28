package me.dio.domain;

import java.util.List;

import jakarta.persistence.*;

@Entity(name = "tb_user")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;

  @OneToOne(cascade = CascadeType.ALL)
  private Account account;

  @OneToOne(cascade = CascadeType.ALL)
  private Card card;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<Feature> features;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
  private List<New> news;

  public Long getId() {
    return id;
  }

  User() {
  }

  public User(String name, Account account, Card card, List<Feature> features, List<New> news) {
    this.name = name;
    this.account = account;
    this.card = card;
    this.features = features;
    this.news = news;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Account getAccount() {
    return account;
  }

  public void setAccount(Account account) {
    this.account = account;
  }

  public Card getCard() {
    return card;
  }

  public void setCard(Card card) {
    this.card = card;
  }

  public List<Feature> getFeatures() {
    return features;
  }

  public void setFeatures(List<Feature> features) {
    this.features = features;
  }

  public List<New> getNews() {
    return news;
  }

  public void setNews(List<New> news) {
    this.news = news;
  }



}
