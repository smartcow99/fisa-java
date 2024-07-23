package model.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//@Setter
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor
@Builder
public class Customer {
	public String id;
	public String pw;
	public int age;
	public int grade;
}

