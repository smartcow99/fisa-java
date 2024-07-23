package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@RequiredArgsConstructor
public class Customer {
	
	@NonNull
	private String id;
	
	@NonNull
	private String pw;
	
	private int age;
	private String addr;
	private String grade;
	private String gender;
	
}
