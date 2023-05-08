package AtividadePOO;

import java.time.LocalDate;
import java.time.LocalTime;

public class Evento {
    private String nome;
    private LocalDate data;
    private LocalTime horario;
    private String local;
    private int capacidadePublico;
    
    public Evento() {}
    
    public Evento(String nome, LocalDate data, LocalTime horario, String local, int capacidadePublico) {
        this.nome = nome;
        this.data = data;
        this.horario = horario;
        this.local = local;
        this.capacidadePublico = capacidadePublico;
    }
    
    public Evento(String nome, LocalDate data, LocalTime horario, String local, int capacidadePublico, int publicoPresente) {
        this.nome = nome;
        this.data = data;
        this.horario = horario;
        this.local = local;
        this.capacidadePublico = capacidadePublico - publicoPresente;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public LocalDate getData() {
        return data;
    }
    
    public void setData(LocalDate data) {
        this.data = data;
    }
    
    public LocalTime getHorario() {
        return horario;
    }
    
    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }
    
    public String getLocal() {
        return local;
    }
    
    public void setLocal(String local) {
        this.local = local;
    }
    
    public int getCapacidadePublico() {
        return capacidadePublico;
    }
    
    public void setCapacidadePublico(int capacidadePublico) {
        this.capacidadePublico = capacidadePublico;
    }
    
    public boolean verificarDisponibilidade() {
        return capacidadePublico > 0;
    }
    
    public void reservarVaga() {
        if (verificarDisponibilidade()) {
            capacidadePublico--;
            System.out.println("Reserva realizada com sucesso!");
        } else {
            System.out.println("Não há vagas disponíveis para reserva.");
        }
    }
    
    public static void main(String[] args) {
        Evento evento = new Evento("Show da MC Pipokinha", LocalDate.of(2023, 9, 2), LocalTime.of(21, 0), "Arena Jaraguá", 1000, 300);
        
        System.out.println("Evento: " + evento.getNome());
        System.out.println("Data: " + evento.getData());
        System.out.println("Horário: " + evento.getHorario());
        System.out.println("Local: " + evento.getLocal());
        System.out.println("Capacidade de público: " + evento.getCapacidadePublico());
        
        if (evento.verificarDisponibilidade()) {
            evento.reservarVaga();
        }
        
        System.out.println("Nova capacidade de publico: " + evento.getCapacidadePublico());
    }
}
