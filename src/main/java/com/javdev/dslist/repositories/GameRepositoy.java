package com.javdev.dslist.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.javdev.dslist.entities.Game;
public interface GameRepositoy extends JpaRepository<Game , Long>{

}
