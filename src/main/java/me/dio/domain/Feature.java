package me.dio.domain;

import jakarta.persistence.Entity;

@Entity(name = "tb_feature")
public class Feature extends BaseItem {

  @Override
  public String toString() {
    return "Feature{" +
        "id=" + getId() +
        ", icon='" + getIcon() + '\'' +
        ", description='" + getDescription() + '\'' +
        '}';
  }

}
