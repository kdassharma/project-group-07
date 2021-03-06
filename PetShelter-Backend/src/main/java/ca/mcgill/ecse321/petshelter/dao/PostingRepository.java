package ca.mcgill.ecse321.petshelter.dao;

import org.springframework.data.repository.CrudRepository;

import ca.mcgill.ecse321.petshelter.model.Posting;

public interface PostingRepository extends CrudRepository<Posting, Integer>{

	Posting findPostingById(Integer id);

}