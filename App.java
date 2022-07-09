package org.example;

import org.example.mappers.MapperM;
import org.example.mappers.MapperF;
import org.example.model.DataList;
import org.example.service.DataSetOscar;
import org.example.util.Utils;

import java.io.IOException;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class App
{
    public static void main( String[] args ) throws IOException {

        var utilM = new Utils<DataList>("oscar_age_male.csv");
        var actorInfos = utilM.leitorArquivo(new MapperM());

        var utilF = new Utils<DataList>("oscar_age_female.csv");
        var actressInfos = utilF.leitorArquivo(new MapperF());

        var list = Stream.concat(actorInfos.stream(),
                actressInfos.stream()).collect(Collectors.toList());

        DataSetOscar oscar = new DataSetOscar(list);
        //funções DataSetOscar
        oscar.older();
        oscar.younger();
        oscar.difIdade(18, 24);
    }
}