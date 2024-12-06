package com.cn.rating.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rating")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rating {

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//Auto id generation is not required as user is giving rating for a hotel
	private Long hotelId;
	private Long rating;
}
