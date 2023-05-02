public class Consultas{

    //Variáveis de instância
    private String paciente;
    private String medico;
    private String data;

    //Construtor
    public Consultas(String paciente, String medico, String data){
        this.paciente = paciente;
        this.medico = medico;
        this.data = data;
    }

    //Representação textual
    @Override // Sobreescrever um método
    public String toString(){
        return "Consulta: [Paciente: " + paciente + ", Medico: " + medico + ", Data: " + data + "]";
    }

}