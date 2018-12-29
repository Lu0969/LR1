package com.company;
public class Main {
    void Audio(Open Audio){
        Audio.open();
    }
    void Audio(Close Audio){
        Audio.close();
    }
    void Audio(Rename Audio){
        Audio.rename();
    }
    void Audio(Delete Audio){
        Audio.delete();
    }
    void Vidoe(Open Vidoe){
        Vidoe.open();
    }
    void Vidoe(Close Vidoe){
        Vidoe.close();
    }
    void Vidoe(Rename Vidoe){
        Vidoe.rename();
    }
    void Vidoe(Delete Vidoe){
        Vidoe.delete();
    }
     void Text(Open Text){
        Text.open();
    }
    void Text(Close Text){
        Text.close();
    }
    void Text(Rename Text){
        Text.rename();
    }
    void Text(Delete Text){
        Text.delete();
    }
    void Text(Edit Text){
        Text.edit();
    }
    void Photo(Open Photo){
        Photo.open();
    }
    void Photo(Close Photo){
        Photo.close();
    }
    void Photo(Rename Photo){
        Photo.rename();
    }
    void Photo(Delete Photo){
        Photo.delete();
    }
    void Photo(Edit Photo){
        Photo.edit();
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("Текстовый файл");
        main.Text(new Open());
        main.Text(new Close());
        main.Text(new Rename());
        main.Text(new Edit());
        main.Text(new Delete());
        System.out.println("Графический файл");
        main.Photo(new Open());
        main.Photo(new Close());
        main.Photo(new Rename());
        main.Photo(new Edit());
        main.Photo(new Delete());
        System.out.println("Видео файл");
        main.Vidoe(new Open());
        main.Vidoe(new Close());
        main.Vidoe(new Rename());
        main.Vidoe(new Delete());
        System.out.println("Аудио файл");
        main.Audio(new Open());
        main.Audio(new Close());
        main.Audio(new Rename());
        main.Audio(new Delete());
    }
}
