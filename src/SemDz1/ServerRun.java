package SemDz1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerRun extends JFrame{
    private static final int WINDOW_HEIGHT = 555;
    private static final int WINDOW_WIDTH = 507;
    private static final int WINDOW_POSX = 0;
    private static final int WINDOW_POSY = 0;
    JButton btnStart = new JButton("Запустить сервер");
    JButton btnStop = new JButton("Остановить сервер");

    boolean isServerWorking;
    ServerRun(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocation(WINDOW_POSX, WINDOW_POSY);
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Server");
        setResizable(false);

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!isServerWorking){
                    isServerWorking = true;
                }
                System.out.println("Статус сервера: " + isServerWorking);
            }
        });
        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isServerWorking){
                    isServerWorking = false;
                }
                System.out.println("Статус сервера: " + isServerWorking);
            }
        });
        setLayout(new GridLayout(1, 2));
        add(btnStart);
        add(btnStop);
        setVisible(true);
    }
    public static void main(String[] args){
        new ServerRun();
    }
}
