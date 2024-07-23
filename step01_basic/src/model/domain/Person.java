package model.domain;

import org.junit.Test;

import lombok.AllArgsConstructor;
//import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
//@Builder
public class Person {
	@NonNull
	private String id;
	
	private int pw;
	
	@NonNull
	private String address;
}
