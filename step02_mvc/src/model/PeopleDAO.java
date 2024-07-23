package model;

import java.util.ArrayList;

import model.domain.PeopleDTO;

public class PeopleDAO {
	
	static ArrayList<PeopleDTO> p = new ArrayList<>();

	static {
		p.add(new PeopleDTO("P1", 40));
		p.add(new PeopleDTO("P2", 28));
	}

 	// Select * From People
	public static ArrayList<PeopleDTO> getAllPeople() {
		return p;
	}
	
	// Update people set age = ?
	
	
}
