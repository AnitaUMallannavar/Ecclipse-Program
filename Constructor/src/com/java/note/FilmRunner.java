package com.java.note;
import com.java.Film;
public class FilmRunner {
	public static void main(String args[]) {
		Film film=new Film();
		System.out.println("write about film");
		System.out.println("Film name is:" +film.name);
		System.out.println("film hero is:" +film.hero);
		System.out.println("film was done in:" +film.place);
		System.out.println("the cast of tiket is" +film.cast);
		System.out.println("investment for this film is" +film.investment);
		film.name="milana";
		film.hero="appu";
		film.place="bangalor";
		film.cast=50;
		film.investment=778902171D;
		System.out.println("Film name is:" +film.name);
		System.out.println("film hero is:" +film.hero);
		System.out.println("film was done in:" +film.place);
		System.out.println("the cast of tiket is" +film.cast);
		System.out.println("investment for this film is" +film.investment);
		
		
	}

}
