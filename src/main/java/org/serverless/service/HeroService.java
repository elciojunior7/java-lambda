package org.serverless.service;

import org.serverless.dto.HeroComparator;
import org.serverless.dto.HeroDTO;

import java.util.ArrayList;
import java.util.List;

@org.springframework.stereotype.Service
public class HeroService {

	public List<HeroDTO> getHeroes() {
		List<HeroDTO> heroes = new ArrayList<>();
		heroes.add(new HeroDTO("Peter Parker", "Spiderman"));
		heroes.add(new HeroDTO("Steve Rogers", "Captain America"));
		heroes.add(new HeroDTO("Selina Kyle", "Catwoman"));
		heroes.add(new HeroDTO("Danny Rand", "Iron Fist"));
		heroes.add(new HeroDTO("Ororo Munroe", "Storm"));
		heroes.add(new HeroDTO("Diana Prince", "Wonder Woman"));
		heroes.add(new HeroDTO("Felicia Hardy", "Black Cat"));
		heroes.add(new HeroDTO("Anna Marie", "Rogue"));
		heroes.add(new HeroDTO("John Stewart", "Green Lantern"));
		heroes.add(new HeroDTO("Jefferson Pierce", "Black Lightning"));
		heroes.sort(new HeroComparator());
		return heroes;
	}
}
