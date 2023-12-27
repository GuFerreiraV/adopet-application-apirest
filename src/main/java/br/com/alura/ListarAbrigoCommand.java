package br.com.alura;

import br.com.alura.client.ClientHTTPConfig;
import br.com.alura.service.abrigoService;

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
