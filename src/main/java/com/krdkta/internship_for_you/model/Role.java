package com.krdkta.internship_for_you.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {

  @Id private Long id;

  @OneToOne(fetch = FetchType.LAZY)
  @MapsId
  private User_entity user_entity;

  private Usertype usertype;
}
