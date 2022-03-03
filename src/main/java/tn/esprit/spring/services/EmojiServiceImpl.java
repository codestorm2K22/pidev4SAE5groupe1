package tn.esprit.spring.services;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;
import tn.esprit.spring.entites.Advertising;
import tn.esprit.spring.entites.Emoji;
import tn.esprit.spring.entites.User;
import tn.esprit.spring.repositories.EmojiRepository;
import tn.esprit.spring.repositories.UserRepository;

@Service
@Slf4j 
public class EmojiServiceImpl implements IEmojiService{
	
	@Autowired
	EmojiRepository EmojiRepository;
	
	@Autowired
	UserRepository userRepository;

	@Override
	public List<Emoji> retrieveAllEmojis() {
		List<Emoji> Emojis =(List<Emoji>)EmojiRepository.findAll();
		for(Emoji Emoji:Emojis){
			log.info("Emoji:"+Emoji);
		}
		
		return Emojis;
	}

	@Override
	public Emoji addEmoji(Emoji Emoji) {
		return EmojiRepository.save(Emoji);
	}

	@Override
	public Emoji updateEmoji(Emoji a) {
		// TODO Auto-generated method stub
		return EmojiRepository.save(a);
	}

	@Override
	public void deleteEmojiById(Long idEmoji) {
		 EmojiRepository.deleteById(idEmoji);
	}

	@Override
	public Emoji retrieveEmoji(Long idEmoji) {
		// TODO Auto-generated method stub
		Emoji Emoji = EmojiRepository.findById(idEmoji).orElse(null);
		return Emoji;
	}

	

}
