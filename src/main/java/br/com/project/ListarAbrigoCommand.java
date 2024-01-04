package br.com.project;

import br.com.project.client.ClientHTTPConfig;
import br.com.project.service.abrigoService;

import java.io.IOException;

public class ListarAbrigoCommand  implements Command{
    @Override
    public void execute() {
        try {
            ClientHTTPConfig client = new ClientHTTPConfig();
            abrigoService abrigoService = new abrigoService(client);

            abrigoService.listarAbrigo();
        }catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }

    }
}
