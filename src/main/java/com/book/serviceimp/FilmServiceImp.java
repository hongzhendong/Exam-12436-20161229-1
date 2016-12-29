package com.book.serviceimp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import com.book.map.FilmMap;
import com.book.pojo.Film;
import com.book.service.FilmService;

@Service("filmService")
public class FilmServiceImp implements FilmService {
	@Autowired
	private FilmMap filmMap;
	
	//private ApplicationEventPublisher applicationEventPublisher;

	@Override
	public void insertFilm(Film film) {
		filmMap.insertFilm(film);
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Film> queryUsers(Film film) {
		// TODO Auto-generated method stub
		return null;
	}

}
