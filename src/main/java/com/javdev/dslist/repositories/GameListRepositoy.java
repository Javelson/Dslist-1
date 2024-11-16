package com.javdev.dslist.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import com.javdev.dslist.entities.GameList;
public interface GameListRepositoy extends JpaRepository<GameList , Long>{

}
