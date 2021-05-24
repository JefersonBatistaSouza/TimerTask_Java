/*
 *Autor Jeferson
 */
package src;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Jeferson
 */
public class ExemploTimerTask {
    int delay = 5000; // (5s) Delay antes de excutar o método
    int interval = 1000; // (1s) intervalo de tempo entre uma execução e outra

    public static void main(String[] args) {
        //instanciando a classe ExemploTimerTask()
        ExemploTimerTask sinc = new ExemploTimerTask();
        //instanciando a classe Timer()
        Timer timer = new Timer();
        //agendamento da tarefa a ser executada, especificando a hora de inicio
        //eo intervalo de tempo a ser executada.
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                //Metodo a ser executado em um intervalo de tempo
                sinc.Relogio();
            }
        }, sinc.delay, sinc.interval);
    }

    public void Relogio() {
        //Popula data e hora atual;
        LocalDateTime datahora = LocalDateTime.now();
        //Formatação da data e hota
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        //mostra no console
        System.out.println(dtf.format(datahora));
    }
}
