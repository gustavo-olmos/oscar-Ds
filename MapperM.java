package org.example.mappers;

import org.example.model.DataList;

import java.util.function.Function;

public class MapperM implements Function <String, DataList> {
    //Atores
    @Override
    public DataList apply(String s) {
        var dadosLinha = s.split("; ");
        var actor = dadosLinha[0];
        var age = Integer.parseInt(dadosLinha[1]);
        var prize = 1;
        var film = dadosLinha[2];
        var i = Integer.parseInt(dadosLinha[3]);
        var oscYear = Integer.parseInt(dadosLinha[4]);
        var sexo = 'M';

        return new DataList(actor, age, prize, film, i, oscYear, sexo);
    }
}
