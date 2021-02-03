package com.fakeflix.system.domain.movie;

import java.util.List;

import com.fakeflix.system.domain.Author;
import com.fakeflix.system.domain.Media;
import com.fakeflix.system.domain.Tag;
import com.fakeflix.system.domain.mediastate.MediaState;

public class MovieDecorator implements Media {

    // Fields
    private Media decorated;

    // Constructor
    public MovieDecorator(Media decorated) {
        this.decorated = decorated;
    }

    ///////////////////////////////////////////////////////////////////////////

    // Getters
    @Override public int            getID()      {return decorated.getID();}
    @Override public String         getTitle()   {return decorated.getTitle();}
    @Override public List<Author>   getAuthors() {return decorated.getAuthors();}
    @Override public List<Tag>      getTags()    {return decorated.getTags();}
    @Override public MediaState     getState()   {return decorated.getState();}
    
    // Setters
    @Override public void setTitle  (String       title)    {decorated.setTitle(title);}
    @Override public void setAuthors(List<Author> authors)  {decorated.setAuthors(authors);}
    @Override public void setTags   (List<Tag>    tags)     {decorated.setTags(tags);}
    @Override public void setState  (MediaState   state)    {decorated.setState(state);}

    // State machine
    @Override public void ready()  {decorated.ready();}
    @Override public void start()  {decorated.start();}
    @Override public void finish() {decorated.finish();}

}
