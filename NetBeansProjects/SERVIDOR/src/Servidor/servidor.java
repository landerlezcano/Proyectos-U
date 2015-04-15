package Servidor;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.*;

public class servidor {

    JFrame VentanaPr = null;
    JButton Enviar = null;
    JTextField Mensajes = null;
    JTextArea Chat = null;
    JPanel Grupochat = null;
    JPanel GrupoMensaje = null;
    JScrollPane scroll = null;

    ServerSocket servidor = null;
    Socket socket = null;
    BufferedReader lector = null;
    PrintWriter escritor = null;

    public servidor() {
        Ventana();
    }

    public void Ventana() {
        VentanaPr = new JFrame("servidor");
        Enviar = new JButton("enviar");
        Mensajes = new JTextField(5);
        Chat = new JTextArea(9, 12);
        scroll = new JScrollPane(Chat);
        Grupochat = new JPanel();
        Grupochat.setLayout(new GridLayout(1, 1));
        Grupochat.add(scroll);
        GrupoMensaje = new JPanel();
        GrupoMensaje.setLayout(new GridLayout(1, 2));
        GrupoMensaje.add(Mensajes);
        GrupoMensaje.add(Enviar);//añador componentes 
        VentanaPr.setLayout(new BorderLayout());//borden layot es para poder ser ubicado 
        VentanaPr.add(GrupoMensaje, BorderLayout.SOUTH);//posicion de las ventanas
        VentanaPr.add(Grupochat, BorderLayout.NORTH);
        VentanaPr.setSize(300, 200);//tamaño de la ventana
        VentanaPr.setVisible(true);
        VentanaPr.setResizable(false);
        Thread principal = new Thread(new Runnable() {
            public void run() {
                try {
                    servidor = new ServerSocket(8000);
                    while (true) {
                        socket = servidor.accept();
                        escribir();
                        leer();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        principal.start();

    }

    public void leer() {
        Thread leer = new Thread(new Runnable() {
            public void run() {
                try {
                    lector = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    while (true) {
                        String mensajeR = lector.readLine();
                        Chat.append("Servidor dice " + mensajeR);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        leer.start();

    }

    public void escribir() {
        Thread escribir_hilo = new Thread(new Runnable() {
            public void run() {
                try {
                    escritor = new PrintWriter(socket.getOutputStream(), true);
                    Enviar.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {//funciones de los botones
                            String enviarM = Mensajes.getText();
                            escritor.println(enviarM);
                        }
                    });
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        escribir_hilo.start();
    }

    public static void main(String[] args) {
        new servidor();
    }

}
