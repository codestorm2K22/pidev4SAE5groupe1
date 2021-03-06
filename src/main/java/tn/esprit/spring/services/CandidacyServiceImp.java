package tn.esprit.spring.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.spring.entites.Candidacy;
import tn.esprit.spring.entites.Nationality;
import tn.esprit.spring.entites.Status;
import tn.esprit.spring.repositories.CandidacyRepository;



@Service
public class CandidacyServiceImp implements ICandidacy{
	@Autowired
	CandidacyRepository candidacyRepository;


	@Override
	public List<Candidacy> retriveAllCandidacys() {
		// TODO Auto-generated method stub
		List<Candidacy> candidacys =(List<Candidacy>) candidacyRepository.findAll();
		return candidacys;
	}

	@Override
	public Candidacy addCandidacy(Candidacy c) {
		// TODO Auto-generated method stub
		
		return candidacyRepository.save(c);
	} 

	@Override
	public void deleteCandidacy(int id) {
		// TODO Auto-generated method stub
		this.candidacyRepository.deleteById(id);
	}

	@Override
	public Candidacy updateCandidacy(Candidacy c) {
		// TODO Auto-generated method stub
		return candidacyRepository.save(c);
	}

	@Override
	public Candidacy retriveCandidacy(int id) {
		// TODO Auto-generated method stub
		Candidacy candidacy = candidacyRepository.findById(id).orElse(null);
		return candidacy;
	}

	@Override
	public int FiltrerCandidacyByDateAndNationality(Nationality nat, Date d) {
		// TODO Auto-generated method stub
		return this.candidacyRepository.FiltrerCandidacyByDateAndNationality(nat, d);
	}
	@Override
	public List<Candidacy> FiltrerCandidacyByStatus(Status status) {
		// TODO Auto-generated method stub
		return this.candidacyRepository.FiltrerCandidacyByStatus(status);
	}

}
