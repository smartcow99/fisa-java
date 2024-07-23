package view;

import java.util.ArrayList;

import model.domain.PeopleDTO;

public class EndView {
	public static void printAll(ArrayList<PeopleDTO> all) {
		
		for(PeopleDTO v : all ) {
			System.out.println(v.getName() + " " + v.getAge());
		}
		
		for(int i=0; i<all.size(); i++) {
			System.out.println(all.get(i).getName() + " " + all.get(i).getAge());
		}
		
	}
}
