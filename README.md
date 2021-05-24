### TimerTask_Java
##Execução de métodos em um determinado intervalo de tempo

      A execução de taxa fixa é apropriada para atividades recorrentes que 
      são sensíveis ao tempo <i> absoluto </i>, como tocar um carrilhão a cada
      hora a hora, ou executando manutenção programada todos os dias em um
      Tempo particular. Também é apropriado para atividades recorrentes
      onde o tempo total para realizar um número fixo de execuções é
      importante, como um cronômetro de contagem regressiva que marca uma vez a cada segundo durante
      dez segundos. Finalmente, a execução de taxa fixa é apropriada para
      agendamento de várias tarefas de cronômetro repetidas que devem permanecer sincronizadas
      em relação um ao outro.
     
      @param task tarefa a ser agendada.
      @param firstTime Primeira vez em que a tarefa deve ser executada.
      @param period de tempo em milissegundos entre sucessivas execuções de tarefas.
      @throws IllegalArgumentException 
      if {@code firstTime.getTime () <0} or {@code <= 0}
      @throws IllegalStateException se a tarefa já foi agendada ou
      cancelado, o cronômetro foi cancelado ou o encadeamento do cronômetro foi encerrado.
      @throws NullPointerException if {@code task} or {@code firstTime} is null
