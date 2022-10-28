package br.com.futurodev.elaboracaosecurity.service;

import br.com.futurodev.elaboracaosecurity.model.Pet;
import br.com.futurodev.elaboracaosecurity.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service

public class PetService {
    @Autowired
    private PetRepository petRepository;

    public Pet salvar(Pet pet) {
        //create / update
        return petRepository.save(pet);
    }
    public List<Pet> buscarPets(){
        //read
        return petRepository.findAll();
    }
    public void excluir(Integer id){
        //delete
        petRepository.delete(id);
    }
}
