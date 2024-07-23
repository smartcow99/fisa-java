package controller;

import java.util.ArrayList;

import model.PeopleDAO;
import model.domain.PeopleDTO;
import view.EndView;

public class Controller {
	public static void allView() {
		System.out.println("all view is called");
		ArrayList<PeopleDTO> all = PeopleDAO.getAllPeople();
		EndView.printAll(all);
	}
}
