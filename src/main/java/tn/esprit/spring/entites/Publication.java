package tn.esprit.spring.entites;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Publication")
public class Publication implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	
	@Column(name="subject")
	 String subject;
	
	@Column(name="body")
	 String body;
	
	@Column(name="publishedAt")
	 Date publishedAt;
	
	@Column(name="PublicationCategory")
	@Enumerated(EnumType.STRING)
	PublicationCategory publicationCategory;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	private User user;
	
	
	
	
}
