package RodaTudo;

import Model.Console;
import Model.Save;
import Repository.SaveDAO;


public class ComandoService {private final String[] comando;
    private final Console console;

    public ComandoService(String comandoBruto){
        Console console = new Console();
        this.console = console;
        this.comando = comandoBruto.split(" ");

    }

    public Console help() {
        console.setMensagem("Este aqui é o texto de ajuda");
        return console;
    }

    public Console start() {
        try {
            Save save = SaveDAO.novoJogo();
            console.setMensagem(save.getCenaAtual().getDescricao());
            console.setIdSave(save.getIdSave());
            return console;
        } catch (Exception e) {
            e.printStackTrace();
            console.setMensagem("Erro ao tentar iniciar o jogo");
            return console;
        }













    }

    public Console getResultadoConsole(){
        try {

            String primeiroComando = comando[0].toLowerCase();


            return switch (primeiroComando) {
                case "help" -> help();
                case "start" -> start();
                default -> {
                    console.setMensagem("Comando inválido");
                    yield console;
                }
            };
        } catch (Exception e) {
            console.setMensagem("Comando inválido");
            return console;
        }
    }
}

