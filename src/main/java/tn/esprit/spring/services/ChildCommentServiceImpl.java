package tn.esprit.spring.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entites.ChildComment;
import tn.esprit.spring.entites.User;
import tn.esprit.spring.repositories.ChildCommentRepository;
import tn.esprit.spring.repositories.UserRepository;

@Service
@Slf4j 
public class ChildCommentServiceImpl implements IChildCommentService{
	
	@Autowired
	ChildCommentRepository ChildCommentRepository;
	UserRepository userRepository;

	@Override
	public List<ChildComment> retrieveAllChildComments() {
		List<ChildComment> ChildComments =(List<ChildComment>)ChildCommentRepository.findAll();
		for(ChildComment ChildComment:ChildComments){
			log.info("ChildComment:"+ChildComment);
		}
		
		return ChildComments;
	}

	@Override
	public ChildComment addChildComment(ChildComment ChildComment) {
		return ChildCommentRepository.save(ChildComment);
	}

	@Override
	public ChildComment updateChildComment(ChildComment a) {
		// TODO Auto-generated method stub
		return ChildCommentRepository.save(a);
	}

	@Override
	public void deleteChildCommentById(Long idChildComment) {
		 ChildCommentRepository.deleteById(idChildComment);
	}

	@Override
	public ChildComment retrieveChildComment(Long idChildComment) {
		// TODO Auto-generated method stub
		ChildComment ChildComment = ChildCommentRepository.findById(idChildComment).orElse(null);
		return ChildComment;
	}


	
	
	
	

}
