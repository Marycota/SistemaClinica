package main;

import entidades.*;
import servicos.Agendamento;

import java.time.LocalDate;
import java.time.LocalTime;

public class main {
    public static void main(String[] args) {
        Paciente paciente1 = new Paciente("João Silva", "123.456.789-00", LocalDate.of(1990, 5, 10));
        medico medico1 = new medico("Dra. Ana", "987.654.321-00", LocalDate.of(1985, 3, 20), "CRM123", "Cardiologia");

        consulta consulta = new consulta(paciente1, medico1, LocalDate.of(2025, 2, 20), LocalTime.of(10, 30), 150.0);
        Agendamento agendamento = new Agendamento();

        agendamento.agendarConsulta(consulta);
    }
}
