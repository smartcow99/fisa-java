/*
 * 1. @RequiredArgsConstructor
 *  - final or @NonNull required
 * 2. final
 *  - can't correction
 *  - when generated value recommended
 *  - use when Spring boot's develop code 
 * 3. @NotNull
 *  - provided by lombok
 *  - connected with @RequiredArgsConstructor
 *  	: RequiredArgsConstructor declare not final and @NotNull declare then using generater argument
 *  - cf. JPA API - Database related API
 *  	: @NotNull - Database Data's value can't null
 *  
 *  
 */

package model.domain;

import org.junit.Test;

import lombok.AllArgsConstructor;
//import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Getter
//@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
//@Builder
public class Person2 {
	@NonNull
	private final String id;
	
	private int pw;
	
	@NonNull
	private String address;
}
