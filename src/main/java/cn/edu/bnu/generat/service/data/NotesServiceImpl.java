package cn.edu.bnu.generat.service.data;

import cn.edu.bnu.generat.service.NotesService;

import cn.edu.bnu.generat.repository.NotesRepository;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
*@author sun
*@Description: 
 */
@Service
public class NotesServiceImpl implements NotesService{

	@Inject
	private NotesRepository repository;
}
