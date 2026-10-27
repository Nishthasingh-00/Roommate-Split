package com.Roommate.Split;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "roommates")
public class Roommate {

    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name = "roommate_id")
private Integer id;

    private String name;

    public Roommate() {
    }

   public Integer getId() {
    return id;
}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}