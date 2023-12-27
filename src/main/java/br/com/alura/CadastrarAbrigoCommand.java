package br.com.alura;

import br.com.alura.client.ClientHTTPConfig;
import br.com.alura.service.abrigoService;

import java.io.IOException;

public class CadastrarAbrigoCommand implements Command{

    public void execute() {
        try {
            ClientHTTPConfig client = new ClientHTTPConfig();
            abrigoService abrigoService = new abrigoService(client);

            abrigoService.cadastrarAbrigo();
        }catch (IOException | InterruptedException e){
            System.out.println(e.getMessage());
        }

    }

}
