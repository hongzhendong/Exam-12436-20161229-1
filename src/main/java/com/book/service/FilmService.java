package com.book.service;

import java.util.List;

import com.book.pojo.Film;


public interface FilmService {
	public void insertFilm(Film film);
	public List<Film> queryUsers(Film film);

}
