package com.sujix.sbfeatures.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Builder
@AllArgsConstructor
public class User {
	  private float id;
	  private String name;
	  private String username;
	  private String email;
}
