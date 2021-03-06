package com.sushavi.cricstats.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Players {
    @Id
    @Column(name = "player_id")
    private Long playerId;

    @Column(name = "player_name")
    private String playerName;

    @Column(name = "team_id")
    private Long teamId;

    @Column(name = "country_cd")
    private String countryCd;

    @Column(name = "role_id")
    private Long role_id;

    @Column(name = "in_active")
    private String inActive;
}
