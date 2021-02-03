package com.fakeflix.system.domain.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fakeflix.system.domain.Media;

import lombok.Data;

@Data
@Entity
@Table(name = "RATINGS")
@IdClass(Rating.class)
public class Rating {
 
    @Id 
    @ManyToOne
    @JoinColumn(name = "USER_ID", referencedColumnName = "USERNAME")
    private User user;

    @Id
    @ManyToOne
    @JoinColumn(name = "MEDIA_ID", referencedColumnName = "ID")
    private Media media;

    @Column(name = "RATING")
    private byte userRating;

}
