package com.fakeflix.system.domain;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Data;

@Entity @Table(name = "AUTHORS") @Data
public class Author {

    // Fields
    @Id @GeneratedValue(strategy = GenerationType.AUTO) 
    private int id;

    @Column(name = "NAME", nullable = false)
    private final String name;

    @JoinTable(
                      name = "AUTHORS_MEDIA",
               joinColumns = @JoinColumn(name = "FK_AUTHORS", nullable = false),
        inverseJoinColumns = @JoinColumn(name = "FK_MEDIA",   nullable = false)
    )
    @ManyToMany(cascade = CascadeType.ALL)
    private ArrayList<Media> media;

    ////////////////////////////////////////////////////////////////////////////

    // Constructor
    public Author(String name) {
        this.name = name;
    }
}
