package vamshi.doublecollection;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GenericCollection {

	
	public static void main(String args[]) {
		
     List<Heroes> hero = new ArrayList<>();
     hero.add(GenericCollection.hero("NTR"));
     hero.add(GenericCollection.hero("Chiranjeevi"));
     
     for (Heroes heroes : hero) {
    	 
    	 System.out.println("Hero Name"+ " " + heroes.getHeroName());
    	 
    	 
    	 for (Movies movie : heroes.getMovies()) {
    		 System.out.println("-----------------------");
    		 
    		 System.out.println("Movie Name"+" " + movie.getName());
    		 System.out.println("Movie Collection"+" " + movie.getMovieCollection());
    		 System.out.println("movie "+ " " +movie.getReleaseDate());
			
		}
    	 
    	 for( Serials serial: heroes.getSerial()) {
    		 
    		 System.out.println("-------------------------");
    		 System.out.println("Serial Name" +" "+ serial.getName() );
    		 System.out.println("Serial Release Date"+ " "+ serial.getReleaseDate());
    		 System.out.println("Serial epiosde "+ " "+ serial.getSerialEpisodes());
    	 }
		
	}
     
		
	}
	
	public static Heroes hero(String heroName) {
		
		Heroes hero = new Heroes();
        hero.setHeroName(heroName);
		
		List<Movies> movies = new ArrayList<>();
		movies.add(GenericCollection.movie("simhadri", 2564647.345, new Date()));
		movies.add(GenericCollection.movie("sambha", 123456, new Date()));
		movies.add(GenericCollection.movie("RRR", 2333.23, new Date()));
		
		hero.setHeroName(heroName);
         if(hero.heroName=="Chiranjeevi") {
        	movies.add(GenericCollection.movie("no.1", 2564647.345, new Date()));
     		movies.add(GenericCollection.movie("2", 123456, new Date()));
     		movies.add(GenericCollection.movie("3", 2333.23, new Date()));
         }
		List<Serials> serial = new ArrayList<>();
		
		serial.add(GenericCollection.serial("BigBoss", 40 , new Date()));
		if(hero.heroName=="Chiranjeevi"){
			serial.add(GenericCollection.serial("Meelo Avarukotisharudu", 40 , new Date()));
		}
		
		hero.setMovies(movies);
		hero.setSerial(serial);
		
		
		return hero;
		
	}
	
	
	
	
	public static Movies movie(String movieName, double  movieCollection, Date date) {
		
		Movies movie = new Movies();
		movie.setName(movieName);
		movie.setMovieCollection(movieCollection);
		movie.setReleaseDate(date);
		
		return movie;
	
	}
	
	public static Serials serial(String serialName, int serialEpisodes, Date serialReleaseDate) {
		
		Serials serial = new Serials();
		
		serial.setName(serialName);
		serial.setSerialEpisodes(serialEpisodes);
		serial.setReleaseDate(serialReleaseDate);
		
		return serial;
		
	}
	
	
	
	
}
