package tn.esprit.spring.services;

import java.util.List;

import tn.esprit.spring.entites.ForbiddenWord;



public interface IForbiddenWordService {
	
	List<ForbiddenWord> retrieveAllForbiddenWords();
	ForbiddenWord addForbiddenWord(ForbiddenWord ForbiddenWord);
	ForbiddenWord updateForbiddenWord(ForbiddenWord ForbiddenWord);
	void deleteForbiddenWordById(Long idForbiddenWord);
	public ForbiddenWord retrieveForbiddenWord(Long idForbiddenWord);
}
