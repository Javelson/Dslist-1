package com.javdev.dslist.repositories;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.javdev.dslist.entities.Game;
import com.javdev.dslist.projection.GameMinProjetion;
public interface GameRepositoy extends JpaRepository<Game , Long>{
    
    @Query(nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
		tb_game.short_description AS shortDescription, tb_belonging.position
		FROM tb_game
		INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
		WHERE tb_belonging.list_id = 1
		ORDER BY tb_belonging.position
			""")
List<GameMinProjetion> searchByList(Long listId);

}
