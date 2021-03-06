package com.shyam.api.cartservice.entity;

import com.shyam.commonlib.entity.BaseEntity;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class UserDetails extends BaseEntity {
	private String username;
	private String firstName;
	private String middleName;
	private String lastName;
	private String email;
	private String gender;
	private String phoneNumber;
	private String timeZone;
	private Integer active;
	private Boolean verified;
}
