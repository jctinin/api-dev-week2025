package me.dio.domain;

import jakarta.persistence.Entity;

@Entity(name = "tb_news")
public class New extends BaseItem {

  @Override
  public String toString() {
    return "News{" +
        "id=" + getId() +
        ", icon='" + getIcon() + '\'' +
        ", description='" + getDescription() + '\'' +
        '}';
  }

}
