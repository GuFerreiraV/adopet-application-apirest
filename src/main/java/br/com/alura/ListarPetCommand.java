package br.com.alura;

import br.com.alura.client.ClientHTTPConfig;
import br.com.alura.service.petService;

import java.io.IOException;

public class ListarPetCommand implements Command{

    public void execute() {
        try {
            ClientHTTPConfig client = new ClientHTTPConfig();
            petService petService = new petService(client);

            petService.listarPetsDoAbrigo();
        }catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
}
