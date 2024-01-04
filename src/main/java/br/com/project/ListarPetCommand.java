package br.com.project;

import br.com.project.client.ClientHTTPConfig;
import br.com.project.service.petService;

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
