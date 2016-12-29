package com.book.main;

import java.util.Arrays;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.book.pojo.Film;
import com.book.service.FilmService;



public class Action {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext application = new ClassPathXmlApplicationContext("classpath:Application.xml");	

		FilmService filmService=application.getBean("filmService", FilmService.class);
		//System.out.println(Arrays.toString(application.getBeanDefinitionNames()));
		Film film=new Film();
		
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入电影名称");
		String title=in.nextLine();
		film.setTitle(title);
		

		
		System.out.println("请输入电影描述");
		String description=in.nextLine();
		film.setDescription(description);
		
		System.out.println("请输入语言ID");
		int language_id=in.nextInt();
		film.setLanguage_id(language_id);
		
		
		filmService.insertFilm(film);
		
		

		System.out.println("-----");
			


	}

}
