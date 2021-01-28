
DROP TABLE IF EXISTS USERS;
CREATE TABLE USERS
(
    user_id integer NOT NULL,
    user_name text NOT NULL,
    PRIMARY KEY (user_id)
);

ALTER TABLE USERS
    OWNER to fakeuser;

DROP TABLE IF EXISTS TAGS;
CREATE TABLE TAGS
(
    tag_id integer NOT NULL,
    name text NOT NULL,
    PRIMARY KEY (tag_id)
);

ALTER TABLE TAGS
    OWNER to fakeuser;

DROP TABLE IF EXISTS AUTHORS;
CREATE TABLE AUTHORS
(
    author_id integer NOT NULL,
    name text NOT NULL,
    PRIMARY KEY (author_id)
);

ALTER TABLE AUTHORS
    OWNER to fakeuser;

DROP TABLE IF EXISTS MEDIA;
CREATE TABLE MEDIA
(
    media_id integer NOT NULL,
    name text NOT NULL,
    title text NOT NULL,
    PRIMARY KEY (media_id)
);

ALTER TABLE MEDIA
    OWNER to fakeuser;

DROP TABLE IF EXISTS MEDIA_TYPE;
CREATE TABLE MEDIA_TYPE
(
	type_id integer NOT NULL,
	media_id integer NOT NULL,
	PRIMARY KEY (type_id),
	CONSTRAINT fk_media_id
		FOREIGN KEY (media_id)
			REFERENCES MEDIA(media_id)
);

ALTER TABLE MEDIA_TYPE
    OWNER to fakeuser;

DROP TABLE IF EXISTS MEDIA_TAGS;
CREATE TABLE MEDIA_TAGS
(
    media_id integer NOT NULL,
    tag_id   integer NOT NULL,
    PRIMARY KEY (media_id, tag_id),
	CONSTRAINT fk_tags_media_id
		FOREIGN KEY (media_id)
			REFERENCES MEDIA(media_id),
	CONSTRAINT fk_tags_tag_id
		FOREIGN KEY (tag_id)
			REFERENCES TAGS(tag_id)
);

ALTER TABLE MEDIA_TAGS
    OWNER to fakeuser;
	
DROP TABLE IF EXISTS AUTHORS_MEDIA;
CREATE TABLE AUTHORS_MEDIA
(
    author_id integer NOT NULL,
    media_id   integer NOT NULL,
    PRIMARY KEY (author_id, media_id),
	CONSTRAINT fk_authors_author_id
		FOREIGN KEY (author_id)
			REFERENCES AUTHORS(author_id),
	CONSTRAINT fk_authors_media_id
		FOREIGN KEY (media_id)
			REFERENCES MEDIA(media_id)
);
	
ALTER TABLE AUTHORS_MEDIA
    OWNER to fakeuser;
	
DROP TABLE IF EXISTS USER_SCORE;	
CREATE TABLE USER_SCORE
(
    user_id integer NOT NULL,
    media_id   integer NOT NULL,
	score		integer NOT NULL,
    PRIMARY KEY (user_id, media_id),
	CONSTRAINT fk_userscore_user_id
		FOREIGN KEY (user_id)
			REFERENCES USERS(user_id),
	CONSTRAINT fk_userscore_media_id
		FOREIGN KEY (media_id)
			REFERENCES MEDIA(media_id)
);

ALTER TABLE USER_SCORE
    OWNER to fakeuser;
	
DROP TABLE IF EXISTS USER_WATCHED;
CREATE TABLE USER_WATCHED
(
    user_id integer NOT NULL,
    media_id   integer NOT NULL,
	date_watched timestamp NOT NULL,
    PRIMARY KEY (user_id, media_id),
	CONSTRAINT fk_userwatched_user_id
		FOREIGN KEY (user_id)
			REFERENCES USERS(user_id),
	CONSTRAINT fk_userwatched_media_id
		FOREIGN KEY (media_id)
			REFERENCES MEDIA(media_id)
);

ALTER TABLE USER_WATCHED
    OWNER to fakeuser;
