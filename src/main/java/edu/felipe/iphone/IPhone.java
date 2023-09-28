package main.java.edu.felipe.iphone;

import main.java.edu.felipe.iphone.interfaces.CellPhone;
import main.java.edu.felipe.iphone.interfaces.InternetNavigation;
import main.java.edu.felipe.iphone.interfaces.MusicPlayer;

public class IPhone implements CellPhone, InternetNavigation, MusicPlayer {
    @Override
    public void call() {
        System.out.println("Fazendo uma ligação");
    }

    @Override
    public void answer() {
        System.out.println("Atendendo uma ligação");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Gravando uma mensagem de voz");
    }

    @Override
    public void showPage() {
        System.out.println("Mostrando a página web");
    }

    @Override
    public void addNewAba() {
        System.out.println("Abrindo uma nova aba");
    }

    @Override
    public void refreshPage() {
        System.out.println("Atualizando a página");
    }

    @Override
    public void play() {
        System.out.println("Tocando música");
    }

    @Override
    public void pause() {
        System.out.println("Pausando música");
    }

    @Override
    public void selectMusic() {
        System.out.println("Selecionando música");
    }

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        iPhone.play();
        iPhone.pause();
    }
}
