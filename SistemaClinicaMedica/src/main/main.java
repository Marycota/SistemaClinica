package main;

import com.Sistema.clinica.medica.entidades.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class main {
    public static void main(String[] args) {
        medico medico = new medico("Dr. João", "123.456.789-00", LocalDate.of(1980, 10, 15), "CRM12345", "Cardiologia");
        Paciente paciente = new Paciente("Ana Souza", "987.654.321-00", LocalDate.of(1995, 3, 20));

        consulta consulta = new consulta(LocalDateTime.of(2025, 2, 15, 14, 30), paciente, medico, 150.0);

        
        Exame exame = new Exame("Raio-X", LocalDate.now(), 80.0);
        consulta.prescreverExame(exame);
        consulta.prescreverMedicamento("Paracetamol");

      
        System.out.println("Consulta agendada:");
        System.out.println("Paciente: " + consulta.getPaciente().getNome());
        System.out.println("Médico: " + consulta.getMedico().getNome());
        System.out.println("Data/Hora: " + consulta.getDataHora());
        System.out.println("Status: " + consulta.getStatus());
        System.out.println("Exame Prescrito: " + consulta.getExamesPrescritos().get(0).getTipo());
        System.out.println("Medicamento Prescrito: " + consulta.getMedicamentosPrescritos().get(0));
    }
}

