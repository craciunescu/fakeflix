package com.fakeflix.system.domain.movie;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fakeflix.system.domain.Author;
import com.fakeflix.system.domain.Media;
import com.fakeflix.system.domain.Tag;
import com.fakeflix.system.domain.mediastate.MediaState;
import com.fakeflix.system.domain.user.Rating;
import com.fakeflix.system.domain.user.RatingService;
import com.fakeflix.system.domain.user.ViewService;
import com.fakeflix.system.domain.user.Viewer;

@Entity
@Table(name = "MOVIES")
public class Movie implements Media, ViewService, RatingService {

    // Fields
    @Id @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @ManyToMany(mappedBy = "AUTHORS")
    private List<Author> authors;

    @ManyToMany(mappedBy = "TAGS")
    private List<Tag> tags;

    @OneToMany(mappedBy = "VIEWERS")
    private List<Viewer> viewers;

    @OneToMany(mappedBy = "RATINGS")
    private List<Rating> ratings;

    private MediaState state;

    ////////////////////////////////////////////////////////////////////////////

    // Constructor
    public Movie(String title, List<Author> authors, List<Tag> tags) {
        this.title   = title;
        this.authors = authors;
        this.tags    = tags;
        this.viewers = new ArrayList<>();
        this.ratings = new ArrayList<>();
    }

    ////////////////////////////////////////////////////////////////////////////

    // Getters
    @Override public int          getID()         {return id;}
    @Override public String       getTitle()      {return title;}
    @Override public List<Author> getAuthors()    {return authors;}
    @Override public List<Tag>    getTags()       {return tags;}
    @Override public long         getTotalViews() {return viewers.size();}
    @Override public List<Rating> getRatings()    {return ratings;}
    @Override public MediaState   getState()      {return state;}    

    // TODO Calculate average rating
    @Override public int getAverageRating() {return 0;}

    // Setters
    @Override public void setTitle  (String       title)   {this.title   = title;}
    @Override public void setAuthors(List<Author> authors) {this.authors = authors;}
    @Override public void setTags   (List<Tag>    tags)    {this.tags    = tags;}
    @Override public void setState  (MediaState   state)   {this.state   = state;}
    
    // Other ops
    @Override public void addViewer(Viewer viewer) {this.viewers.add(viewer);}
    @Override public void addRating(Rating rating) {this.ratings.add(rating);}

    // State Machine
    @Override public void ready()   {state.available(this);}
    @Override public void start()   {state.start(this);}
    @Override public void finish()  {state.finish(this);}

}
