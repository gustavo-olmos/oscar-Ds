package org.example.service;

import org.example.model.DataList;

import java.util.Comparator;
import java.util.List;

public class DataSetOscar {
    private List <DataList> dl;
    public DataSetOscar(List<DataList> listaDados) {
        this.dl = listaDados;
    }

    public void older(){
        var old = dl.stream()
                .max(Comparator.comparingInt(DataList::getAge));
        old.ifPresent(p-> System.out.printf("Mais velho das categorias:  " +
                "é %s e tem %d anos \n", p.getActor(), p.getAge()));
    }
    public void younger(){
        var min = dl.stream()
                .min(Comparator.comparingInt(DataList::getAge));
        min.ifPresent(p-> System.out.printf("O vencedor mais jovem " +
                "entre homens e mulheres é %s com %d anos \n", p.getActor(), p.getActor()));
    }
    public void difIdade(int idadeInicial, int idadeFinal){
        System.out.printf("Vencedores entre %d e % d anos: ", idadeInicial, idadeFinal);
        dl.stream()
                .filter(c-> c.getAge()>=idadeInicial && c.getAge()<= idadeFinal)
                .forEach(p -> System.out.printf("Nome: %s | Idade: %d\n", p.getAge(), p.getActor()));

    }
}
