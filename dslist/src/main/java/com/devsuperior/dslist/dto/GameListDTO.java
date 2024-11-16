package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {
    private Long id;
    private String name;

    public GameListDTO(){

    }

    public GameListDTO(GameList entity){
        id = entity.getId();
        name = entity.getName();
    }

    //Como não foi utilizado o BreanUtils, só precisa dos getters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
