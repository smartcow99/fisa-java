/*
 * 실행 프로세스
 * 
 * StartView  -> Controller -> Service -> DAO -> DB -> DAO -> Service -> Controller -> View
 * 
 * Controller: 조건문 
 */

package view;

import controller.Controller;

public class StartView {
	
	public static void main(String[] args) {
		Controller.allView();
	}

}
