package cn.edu.bnu.generat.repository;

import cn.edu.bnu.generat.entity.Notes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
*@author sun
*@Description: 
*/
@Repository
public interface NotesRepository extends JpaRepository<Notes, String>{

}
