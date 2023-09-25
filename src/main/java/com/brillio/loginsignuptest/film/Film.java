package com.brillio.loginsignuptest.film;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Film {
	
	@Id
	private int FilmId;
	private String name;
	private String rating="5 Star";
	private String url;
	private String status;
	private String category;
	private String trailer;
	
	
	public Film() {
		super();
	}
	
	public Film(int filmId, String name) {
		super();
		FilmId = filmId;
		this.name = name;
	}

	public Film(int filmId, String name, String rating, String url, String status, String category ,String trailer) {
		super();
		FilmId = filmId;
		this.name = name;
		this.rating = rating;
		this.url = url;
		this.status = status;
		this.category = category;
		this.trailer= trailer;
	}
	public int getFilmId() {
		return FilmId;
	}
	public void setFilmId(int filmId) {
		FilmId = filmId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	
	}
	public String getTrailer() {
		return trailer;
	}
	public void setTrailer(String trailer) {
		this.trailer = trailer;
	}
	@Override
	public String toString() {
		return "Film [FilmId=" + FilmId + ", name=" + name + ", rating=" + rating + ", url=" + url + ", status="
				+ status + ", category=" + category + ", trailer=" + trailer + "]";
	}
	
	
	
	
	

}
